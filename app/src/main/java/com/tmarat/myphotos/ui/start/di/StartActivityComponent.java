package com.tmarat.myphotos.ui.start.di;

import com.tmarat.myphotos.ui.start.StartActivity;
import com.tmarat.myphotos.ui.start.di.modules.StartActivityModule;
import com.tmarat.myphotos.ui.start.di.scope.Activity;
import dagger.Subcomponent;

@Activity
@Subcomponent(modules = { StartActivityModule.class })
public interface StartActivityComponent {

  void inject(StartActivity activity);
}
