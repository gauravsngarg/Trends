package com.gauravsngarg.trending.activity;

import android.os.Bundle;

import com.gauravsngarg.trending.R;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class YouTubeVideoPlayerActivity extends YouTubeBaseActivity {

    @BindView(R.id.youtube_view)
    public YouTubePlayerView mYouTubePlayerView;
    private YouTubePlayer.OnInitializedListener OnInitializedListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_you_tube_video_player);


        ButterKnife.bind(this);


        OnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

                youTubePlayer.loadVideo("a4NT5iBFuZs");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        loadVideo();
    }

    private void loadVideo() {
        mYouTubePlayerView.initialize("AIzaSyDFZ0DC-caTW0x2Xosl-Y6rBn2LeW10Br0",OnInitializedListener);
    }
}
