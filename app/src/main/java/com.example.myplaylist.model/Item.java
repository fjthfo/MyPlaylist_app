package com.example.myplaylist.model;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "item", strict = false)
public class Item {
    @Element(name="title")
    private String title = "";

    @Element(name="album")
    private Album album;

    @Element(name="artist")
    private Artist artist;

    public String getTitle() { return this.title; }

    public void setTitle(String title) { this.title = title; }

    public Album getAlbum() { return this.album; }

    public void setAlbum(Album album) { this.album = album; }

    public Artist getArtist() { return this.artist; }

    public void setArtist(Artist artist) { this.artist = artist; }

    public Item(@NotNull String title, @Nullable Album album, @Nullable Artist artist) {
        this.title = title;
        this.album = album;
        this.artist = artist;
    }
}
