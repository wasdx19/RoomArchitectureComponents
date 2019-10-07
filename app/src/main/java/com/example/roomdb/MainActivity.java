package com.example.roomdb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.roomdb.database.Album;
import com.example.roomdb.database.MusicDao;
import com.example.roomdb.database.MusicDatabase;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button addButton;
    private Button getButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MusicDao musicDao = ((AppDelegate) getApplicationContext()).getMusicDatabase().getMusicDao();

        addButton = findViewById(R.id.btn_add);
        getButton = findViewById(R.id.btn_get);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicDao.insertAlbums(createAlbums());
            }
        });

        getButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast(musicDao.getAlbums());
            }
        });
    }

    private List<Album> createAlbums() {
        List<Album> albums=new ArrayList<>(10);

        for(int i=0;i<10;i++){
            albums.add(new Album(i,"album "+ i,"release "+System.currentTimeMillis()));
        }

        return albums;
    }

    private void showToast(List<Album> albums) {
        StringBuilder stringBuilder=new StringBuilder();
        int size=albums.size();

        for(int i=0;i<size;i++){
            stringBuilder.append(albums.get(i).toString()).append("\n");
        }

        Toast.makeText(this,stringBuilder.toString(),Toast.LENGTH_SHORT).show();
    }
}
