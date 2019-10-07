package com.example.roomdb.database;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Song {

    @PrimaryKey
    @ColumnInfo(name="id")
    private int id;

    @ColumnInfo(name="name")
    private String name;

    @ColumnInfo(name="duration")
    private String duration;

    public Song() {
    }

    public Song(int id, String name, String duration) {
        this.id = id;
        this.name = name;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
