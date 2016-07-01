package com.example.android.musicstructureappproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SongSelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_select);

        LinearLayout nowPlaying = (LinearLayout) findViewById(R.id.nowPlayingBar);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toNowPlaying = new Intent(SongSelectActivity.this, NowPlayingActivity.class);
                startActivity(toNowPlaying);
            }
        });

        TextView selectCriteria = (TextView) findViewById(R.id.criteriaSelect);
        selectCriteria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toSelectCriteria = new Intent(SongSelectActivity.this, SelectSongByActivity.class);
                startActivity(toSelectCriteria);
            }
        });

        LinearLayout songs = (LinearLayout) findViewById(R.id.songsList);
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playsong = new Intent(SongSelectActivity.this, NowPlayingActivity.class);
                startActivity(playsong);
            }
        });

        ImageView backButton = (ImageView) findViewById(R.id.backToSelect);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backToSelect = new Intent(SongSelectActivity.this, SelectSongByActivity.class);
                startActivity(backToSelect);
            }
        });
    }
}
