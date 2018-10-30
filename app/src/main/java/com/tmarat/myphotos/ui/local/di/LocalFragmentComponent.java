package com.tmarat.myphotos.ui.local.di;

import com.tmarat.myphotos.ui.local.di.modules.LocalFragmentModule;
import dagger.Subcomponent;

@Subcomponent(modules = { LocalFragmentModule.class })
public interface LocalFragmentComponent {

  void inject();
}
