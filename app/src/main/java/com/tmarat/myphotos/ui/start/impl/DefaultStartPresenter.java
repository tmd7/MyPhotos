package com.tmarat.myphotos.ui.start.impl;

import com.tmarat.myphotos.ui.start.StartPresenter;
import com.tmarat.myphotos.ui.start.StartView;
import com.tmarat.myphotos.ui.start.StartWireframe;
import javax.inject.Inject;

public class DefaultStartPresenter implements StartPresenter {

  private StartView view;
  private StartWireframe wireframe;

  @Inject
  public DefaultStartPresenter(StartView view, StartWireframe wireframe) {
    this.view = view;
    this.wireframe = wireframe;
  }

  @Override public void onViewInitialized() {
    view.setStartClickHandler(this);
    wireframe.startLocalView();
  }

  @Override public void onLocalClicked() {
    wireframe.startLocalView();
  }

  @Override public void onCloudClicked() {
    wireframe.starCloudView();
  }

  @Override public void onFavoriteClicked() {
    wireframe.startFavoriteView();
  }
}
