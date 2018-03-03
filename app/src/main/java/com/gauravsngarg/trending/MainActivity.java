package com.gauravsngarg.trending;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.gauravsngarg.trending.activity.YouTubeVideoPlayerActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    @BindView(R.id.trendingvideos)
    Button trendingVideos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ButterKnife.bind(this);

        trendingVideos.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.trendingvideos){
            Intent i = new Intent(MainActivity.this, YouTubeVideoPlayerActivity.class);
            startActivity(i);
        }
    }
}
