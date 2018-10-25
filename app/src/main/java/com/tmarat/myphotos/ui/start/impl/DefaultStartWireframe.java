package com.tmarat.myphotos.ui.start.impl;

import android.support.v4.app.FragmentTransaction;
import com.tmarat.myphotos.ui.start.StartActivity;
import com.tmarat.myphotos.ui.start.StartWireframe;
import timber.log.Timber;

public class DefaultStartWireframe implements StartWireframe {

  private FragmentTransaction transaction;

  public DefaultStartWireframe(StartActivity activity) {
    transaction = activity.getSupportFragmentManager().beginTransaction();
  }

  @Override public void startLocalView() {
    Timber.d("startLocalView");
  }

  @Override public void starCloudView() {
    Timber.d("starCloudView");
  }

  @Override public void startFavoriteView() {
    Timber.d("startFavoriteView");
  }
}
