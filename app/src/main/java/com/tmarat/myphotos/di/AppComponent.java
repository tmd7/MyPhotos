package com.tmarat.myphotos.di;

import com.tmarat.myphotos.di.modules.AppModule;
import com.tmarat.myphotos.ui.start.di.StartActivityComponent;
import com.tmarat.myphotos.ui.start.di.modules.StartActivityModule;
import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(modules = { AppModule.class })
public interface AppComponent {

  StartActivityComponent plusStartActivityComponent(StartActivityModule module);
}

