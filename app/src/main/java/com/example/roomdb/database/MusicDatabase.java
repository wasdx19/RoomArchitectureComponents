package com.example.roomdb.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Album.class,Song.class,AlbumSong.class}, version = 1)
public abstract class MusicDatabase extends RoomDatabase {

    public abstract MusicDao getMusicDao();

}
