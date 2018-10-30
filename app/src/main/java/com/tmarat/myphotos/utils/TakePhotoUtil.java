package com.tmarat.myphotos.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.content.FileProvider;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import javax.inject.Inject;

public class TakePhotoUtil {

  @Inject Context context;
  private Disposable subscribe;

  private void dispatchTakePictureIntent() {
    Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
    if (takePictureIntent.resolveActivity(context.getPackageManager()) != null) {
      subscribe = getImageFile()
          .subscribe(file -> {
            Uri photoUri =
                FileProvider.getUriForFile(context, "com.example.android.fileprovider", file);
            takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, photoUri);
            //todo write uri to db
          });
    }
    subscribe.dispose();
  }

  private Observable<File> getImageFile() {

    return Observable.fromCallable(() -> {
      String fileName = String.format("JPEG_%s", String.valueOf(System.currentTimeMillis()));
      File storageDir = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
      return File.createTempFile(fileName, ".jpg", storageDir);
    })
        .subscribeOn(AndroidSchedulers.mainThread())
        .observeOn(Schedulers.io());
  }
}
