package com.example.android.musicstructureappproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout nowPlaying = (LinearLayout) findViewById(R.id.nowPlayingBar);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toNowPlaying = new Intent(MainActivity.this,NowPlaying.class);
                startActivity(toNowPlaying);
            }
        });

        TextView albumList = (TextView) findViewById(R.id.toAlbumsList);
        albumList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toAlbumList = new Intent(MainActivity.this, AlbumSelect.class);
                startActivity(toAlbumList);
            }
        });

        TextView songsList = (TextView) findViewById(R.id.toSongsList);
        songsList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toSongsList = new Intent(MainActivity.this, SongSelect.class);
                startActivity(toSongsList);
            }
        });

        LinearLayout toNowPlaying = (LinearLayout) findViewById(R.id.playSong);
        toNowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playSong = new Intent(MainActivity.this, NowPlaying.class);
                startActivity(playSong);
            }
        });

        LinearLayout playAlbum = (LinearLayout) findViewById(R.id.albums);
        playAlbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playSongs = new Intent(MainActivity.this, NowPlaying.class);
                startActivity(playSongs);
            }
        });

        ImageView backButton = (ImageView) findViewById(R.id.backToSelect);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backToSelect = new Intent(MainActivity.this, SelectSongBy.class);
                startActivity(backToSelect);
            }
        });
    }

}
