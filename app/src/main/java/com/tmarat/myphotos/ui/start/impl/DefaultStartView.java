package com.tmarat.myphotos.ui.start.impl;

import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tmarat.myphotos.R;
import com.tmarat.myphotos.ui.start.StartActivity;
import com.tmarat.myphotos.ui.start.StartClickHandler;
import com.tmarat.myphotos.ui.start.StartView;

public class DefaultStartView implements StartView,
    BottomNavigationView.OnNavigationItemSelectedListener {

  private StartActivity activity;
  private StartClickHandler startClickHandler;

  @BindView(R.id.toolbar) Toolbar toolbar;
  @BindView(R.id.bottom_navigation) BottomNavigationView navigation;

  @LayoutRes
  @Override public int getLayout() {
    return R.layout.activity_start;
  }

  @Override public void initView(StartActivity activity) {
    this.activity = activity;
    ButterKnife.bind(this, activity);
    activity.setSupportActionBar(toolbar);
    navigation.setOnNavigationItemSelectedListener(this);
  }

  @Override public void inflateOptionMenu(Menu menu) {
    activity.getMenuInflater().inflate(R.menu.menu_start, menu);
  }

  @Override public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
    if (startClickHandler != null) {
      switch (menuItem.getItemId()) {
        case R.id.navigation_local:
          startClickHandler.onLocalClicked();
          return true;

        case R.id.navigation_cloud:
          startClickHandler.onCloudClicked();
          return true;

        case R.id.navigation_favorites:
          startClickHandler.onFavoriteClicked();
          return true;
      }
      return false;
    }
    return false;
  }

  @Override public void setStartClickHandler(StartClickHandler handler) {
    this.startClickHandler = handler;
  }
}
