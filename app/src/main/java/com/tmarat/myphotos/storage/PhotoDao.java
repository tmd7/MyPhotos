package com.tmarat.myphotos.storage;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;
import com.tmarat.myphotos.storage.entities.Photo;
import io.reactivex.Observable;

@Dao
public interface PhotoDao  {

  @Query("SELECT * FROM photo") Observable<Photo> getAll();
}
