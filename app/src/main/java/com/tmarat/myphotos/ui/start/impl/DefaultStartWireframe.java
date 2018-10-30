package com.tmarat.myphotos.ui.start.impl;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.tmarat.myphotos.R;
import com.tmarat.myphotos.ui.local.LocalFragment;
import com.tmarat.myphotos.ui.start.StartActivity;
import com.tmarat.myphotos.ui.start.StartWireframe;
import timber.log.Timber;

public class DefaultStartWireframe implements StartWireframe {

  private FragmentManager fm;

  public DefaultStartWireframe(StartActivity activity) {
    fm = activity.getSupportFragmentManager();
  }

  @Override public void startLocalView() {
    Timber.d("startLocalView");
    fm.beginTransaction().replace(R.id.main_container, new LocalFragment()).commit();
  }

  @Override public void starCloudView() {
    Timber.d("starCloudView");
  }

  @Override public void startFavoriteView() {
    Timber.d("startFavoriteView");
  }
}
