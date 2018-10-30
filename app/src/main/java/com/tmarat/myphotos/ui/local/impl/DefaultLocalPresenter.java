package com.tmarat.myphotos.ui.local.impl;

import com.tmarat.myphotos.ui.local.LocalPresenter;
import com.tmarat.myphotos.ui.local.LocalView;
import com.tmarat.myphotos.utils.TakePhotoUtil;

public class DefaultLocalPresenter implements LocalPresenter {

  LocalView view;
  TakePhotoUtil takePhotoUtil;

  @Override public void onViewInitialised() {
    view.onClick().subscribe(o -> {
      //todo takePhotoUtil
    });
  }
}
