package com.tmarat.myphotos.ui.start.di.modules;

import com.tmarat.myphotos.ui.start.StartPresenter;
import com.tmarat.myphotos.ui.start.StartView;
import com.tmarat.myphotos.ui.start.StartWireframe;
import com.tmarat.myphotos.ui.start.di.scope.StartActivity;
import com.tmarat.myphotos.ui.start.impl.DefaultStartPresenter;
import com.tmarat.myphotos.ui.start.impl.DefaultStartView;
import com.tmarat.myphotos.ui.start.impl.DefaultStartWireframe;
import dagger.Module;
import dagger.Provides;

@Module
public class StartActivityModule {

  private com.tmarat.myphotos.ui.start.StartActivity activity;

  public StartActivityModule(com.tmarat.myphotos.ui.start.StartActivity activity) {
    this.activity = activity;
  }

  @StartActivity
  @Provides StartView provideStartView() {
    return new DefaultStartView();
  }

  @StartActivity
  @Provides StartPresenter provideStartPresenter(StartView view, StartWireframe wireframe) {
    return new DefaultStartPresenter(view, wireframe);
  }

  @StartActivity
  @Provides StartWireframe provideStartWireframe() {
    return new DefaultStartWireframe(activity);
  }
}