package com.hackbulgaria.java;

import java.io.File;

public class GifPlayer extends SequencePlayer {

    private GifDecoder decoder;

    public GifPlayer(File file) {
        super(file);
        GifDecoder decoder = new GifDecoder();
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub

    }

}
