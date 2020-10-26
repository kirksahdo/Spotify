package com.example.spotifykirk3bi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    ImageView ivMusic;
    TextView tvMusicName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivMusic = (ImageView) findViewById(R.id.ivMusic);
        tvMusicName = (TextView) findViewById(R.id.tvMusicName);
        Glide.with(this).load("https://img.youtube.com/vi/tc-bxi26GSA/0.jpg").into(ivMusic);
    }
}