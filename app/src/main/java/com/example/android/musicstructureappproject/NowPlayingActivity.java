package com.example.android.musicstructureappproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        ImageView viewAlbums = (ImageView) findViewById(R.id.backToAlbums);
        viewAlbums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backToAlbums = new Intent(NowPlayingActivity.this, AlbumSelectActivity.class);
                startActivity(backToAlbums);
            }
        });

        ImageView musicControls = (ImageView) findViewById(R.id.musicControlsPlaceHolder);
        musicControls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NowPlayingActivity.this, "This is where the control buttons are going to be implemented", Toast.LENGTH_LONG).show();
            }
        });

        ImageView viewSongs = (ImageView) findViewById(R.id.backToSongsList);
        viewSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backToSongs = new Intent(NowPlayingActivity.this, SongSelectActivity.class);
                startActivity(backToSongs);
            }
        });
}
}
