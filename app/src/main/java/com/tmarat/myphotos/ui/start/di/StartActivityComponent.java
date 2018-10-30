package com.tmarat.myphotos.ui.start.di;

import com.tmarat.myphotos.ui.local.di.LocalFragmentComponent;
import com.tmarat.myphotos.ui.local.di.modules.LocalFragmentModule;
import com.tmarat.myphotos.ui.start.di.modules.StartActivityModule;
import com.tmarat.myphotos.ui.start.di.scope.StartActivity;
import dagger.Subcomponent;

@StartActivity
@Subcomponent(modules = { StartActivityModule.class })
public interface StartActivityComponent {

  LocalFragmentComponent plusLocalFragmentComponent(LocalFragmentModule module);

  void inject(com.tmarat.myphotos.ui.start.StartActivity activity);
}
