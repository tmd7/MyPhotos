package com.tmarat.myphotos.di.modules;

import android.arch.persistence.room.Room;
import android.content.Context;
import android.support.annotation.NonNull;
import com.tmarat.myphotos.storage.AppDatabase;
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

  @Singleton
  @Provides public AppDatabase provideAppDatabase() {
    return Room.databaseBuilder(context, AppDatabase.class, "database-name").build();
  }
}