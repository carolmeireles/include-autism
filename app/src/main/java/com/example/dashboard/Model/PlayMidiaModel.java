package com.example.dashboard.Model;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;

import java.security.AccessController;


public class PlayMidiaModel {

    public PlayMidiaModel() {

    }

    public void playMidia(Context context, int uri) {
        MediaPlayer mediaPlayer = MediaPlayer.create(context, uri);
        mediaPlayer.start();
    }


}
