package com.tmarat.myphotos;

import android.app.Application;
import com.tmarat.myphotos.di.AppComponent;
import com.tmarat.myphotos.di.DaggerAppComponent;
import com.tmarat.myphotos.di.modules.AppModule;
import com.tmarat.myphotos.ui.local.di.LocalFragmentComponent;
import com.tmarat.myphotos.ui.local.di.modules.LocalFragmentModule;
import com.tmarat.myphotos.ui.start.StartActivity;
import com.tmarat.myphotos.ui.start.di.StartActivityComponent;
import com.tmarat.myphotos.ui.start.di.modules.StartActivityModule;
import timber.log.Timber;

public class App extends Application {

  private AppComponent appComponent;
  private StartActivityComponent startActivityComponent;
  private LocalFragmentComponent localFragmentComponent;

  @Override public void onCreate() {
    super.onCreate();
    Timber.plant(new Timber.DebugTree());
    createAppComponent();
  }

  private void createAppComponent() {
    appComponent = DaggerAppComponent.builder()
        .appModule(new AppModule(this))
        .build();

  }

  public StartActivityComponent plusStartActivityComponent(StartActivity activity) {
    if (startActivityComponent == null) {
      startActivityComponent = appComponent.plusStartActivityComponent(new StartActivityModule(activity));
    }
    return startActivityComponent;
  }

  public LocalFragmentComponent plusLocalFragmentComponent() {
    if (localFragmentComponent != null) {
      localFragmentComponent = startActivityComponent.plusLocalFragmentComponent(new LocalFragmentModule());

    }
    return localFragmentComponent;
  }

  public void clearStartActivityComponent() {
    startActivityComponent = null;
  }

  public void clearLocalFragmentComponent() {
    localFragmentComponent = null;
  }

}
