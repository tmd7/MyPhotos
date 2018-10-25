package com.tmarat.myphotos.di.modules;

import android.content.Context;
import android.support.annotation.NonNull;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module
public class AppModule {

  private Context context;

  public AppModule(@NonNull Context context) {
    this.context = context;
  }

  @Singleton
  @Provides public Context provideContext() {
    return context;
  }
}
