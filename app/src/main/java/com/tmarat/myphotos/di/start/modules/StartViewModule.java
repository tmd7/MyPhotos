package com.tmarat.myphotos.di.start.modules;

import com.tmarat.myphotos.ui.start.StartView;
import com.tmarat.myphotos.ui.start.impl.DefaultStartView;
import dagger.Module;
import dagger.Provides;

@Module
public class StartViewModule {

  @Provides public StartView provideStartView() {
    return new DefaultStartView();
  }
}