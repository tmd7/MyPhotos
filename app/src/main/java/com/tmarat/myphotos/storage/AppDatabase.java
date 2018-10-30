package com.tmarat.myphotos.storage;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import com.tmarat.myphotos.storage.entities.Photo;

@Database(entities = {Photo.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

  public abstract PhotoDao photoDao();
}
