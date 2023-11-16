package com.example.mediaexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class PlayMedia extends AppCompatActivity {
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_media);
        Intent intent = getIntent();
        Song song = (Song) intent.getSerializableExtra("Song");
        TextView nameSong = findViewById(R.id.nameSong);
        nameSong.setText(song.getName());
        findViewById(R.id.play).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer = MediaPlayer.create(PlayMedia.this, song.getId());
                mediaPlayer.start();
//                Toast.makeText(PlayMedia.this, song.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}