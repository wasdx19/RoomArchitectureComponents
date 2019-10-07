package com.example.roomdb.database;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Album {

    @PrimaryKey
    @ColumnInfo(name="id")
    private int id;

    @ColumnInfo(name="name")
    private String name;

    @ColumnInfo(name="release")
    private String releaseDate;

    public Album() {
    }

    public Album(int id, String name, String releaseDate) {
        this.id = id;
        this.name = name;
        this.releaseDate = releaseDate;
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

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Album{" + "id=" + id + ", name='" + name + ", releaseDate='" + releaseDate + '}';
    }
}
