package com.tmarat.myphotos.storage.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Photo {

  @PrimaryKey private int uid;

  @ColumnInfo(name = "uri_photo") private String uri;
}
