package com.example.android.musicstructureappproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SelectSongBy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_song_by);

        LinearLayout mainMenu = (LinearLayout) findViewById(R.id.backToMain);
        mainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainMenuIntent = new Intent(SelectSongBy.this, MainActivity.class);
                startActivity(mainMenuIntent);
            }
        });

        LinearLayout albumsList = (LinearLayout) findViewById(R.id.toAlbumsList);
        albumsList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albumListIntent = new Intent(SelectSongBy.this, AlbumSelect.class);
                startActivity(albumListIntent);
            }
        });

        TextView songList = (TextView) findViewById(R.id.toSongsList);
        songList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songListIntent = new Intent(SelectSongBy.this, SongSelect.class);
                startActivity(songListIntent);
            }
        });

        ImageView songListButton = (ImageView) findViewById(R.id.toSongsListButton);
        songListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songListIntent = new Intent(SelectSongBy.this, SongSelect.class);
                startActivity(songListIntent);
            }
        });

    }
}
