package com.example.android.musicstructureappproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AlbumSelect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_select);

        LinearLayout nowPlaying = (LinearLayout) findViewById(R.id.nowPlayingBar);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toNowPlaying = new Intent(AlbumSelect.this, NowPlaying.class);
                startActivity(toNowPlaying);
            }
        });

        TextView selectCriteria = (TextView) findViewById(R.id.criteriaSelect);
        selectCriteria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toSelectCriteria = new Intent(AlbumSelect.this,SelectSongBy.class);
                startActivity(toSelectCriteria);
            }
        });

        LinearLayout albums = (LinearLayout) findViewById(R.id.albums);
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playAlbum = new Intent(AlbumSelect.this, NowPlaying.class);
                startActivity(playAlbum);
            }
        });

        ImageView backButton = (ImageView) findViewById(R.id.backToSelect);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backToSelect = new Intent(AlbumSelect.this, SelectSongBy.class);
                startActivity(backToSelect);
            }
        });
    }
}
