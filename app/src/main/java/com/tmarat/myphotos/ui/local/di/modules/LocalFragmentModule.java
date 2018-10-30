package com.tmarat.myphotos.ui.local.di.modules;

import com.tmarat.myphotos.ui.local.di.scope.LocalFragment;
import com.tmarat.myphotos.utils.TakePhotoUtil;
import dagger.Module;
import dagger.Provides;

@Module
public class LocalFragmentModule {

@LocalFragment
@Provides TakePhotoUtil provideTakePhopo() {
  return new TakePhotoUtil();
}
}
