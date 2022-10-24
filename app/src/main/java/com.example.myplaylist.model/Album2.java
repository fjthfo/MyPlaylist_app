package com.example.myplaylist.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "albumtrack", strict = false)
public class Album2{
    @Element(name = "tracklist")
    private String trackList = "";

    public String getTrackList() { return this.trackList; }

    public void setTrackList(String trackList) { this.trackList = trackList; }
}
