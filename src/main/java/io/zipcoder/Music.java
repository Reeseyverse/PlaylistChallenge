package io.zipcoder;
import java. lang.String;
import java.util.Arrays;

import java.util.ArrayList;

public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        ArrayList<String> pickedSong = new ArrayList<String>(Arrays.asList(this.playList));

        int nextSong = Math.abs(pickedSong.indexOf(selection) - startIndex);
        int lastSong = Math.abs(pickedSong.size() + startIndex) - pickedSong.lastIndexOf(selection);

        return Math.min(nextSong,lastSong);
    }
}

