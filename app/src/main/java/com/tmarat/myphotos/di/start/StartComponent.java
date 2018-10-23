package com.tmarat.myphotos.di.start;

import com.tmarat.myphotos.di.start.modules.StartViewModule;
import com.tmarat.myphotos.ui.start.StartActivity;
import dagger.Component;

@Component(modules = StartViewModule.class)
public interface StartComponent {

  void inject(StartActivity activity);
}

