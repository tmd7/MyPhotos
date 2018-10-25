package com.tmarat.myphotos.ui.start.di.modules;

import com.tmarat.myphotos.ui.start.StartActivity;
import com.tmarat.myphotos.ui.start.StartPresenter;
import com.tmarat.myphotos.ui.start.StartView;
import com.tmarat.myphotos.ui.start.StartWireframe;
import com.tmarat.myphotos.ui.start.di.scope.Activity;
import com.tmarat.myphotos.ui.start.impl.DefaultStartPresenter;
import com.tmarat.myphotos.ui.start.impl.DefaultStartView;
import com.tmarat.myphotos.ui.start.impl.DefaultStartWireframe;
import dagger.Module;
import dagger.Provides;

@Module
public class StartActivityModule {

  private StartActivity activity;

  public StartActivityModule(StartActivity activity) {
    this.activity = activity;
  }

  @Activity
  @Provides StartView provideStartView() {
    return new DefaultStartView();
  }

  @Activity
  @Provides StartPresenter provideStartPresenter(StartView view, StartWireframe wireframe) {
    return new DefaultStartPresenter(view, wireframe);
  }

  @Activity
  @Provides StartWireframe provideStartWireframe() {
    return new DefaultStartWireframe(activity);
  }
}