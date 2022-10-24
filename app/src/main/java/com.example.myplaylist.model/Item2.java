package com.example.myplaylist.model;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;

@Root(name = "item", strict = false)
public class Item2 {
    @Element(name = "title_short")
    public String title = "";

    @Element(name = "albumtrack")
    public Album2 album;

    @Element(name = "albumartists")
    public String artist = "";

    @Element(name = "image")
    public String image = "";

    public String getTitle() { return this.title; }

    public void setTitle(String title) { this.title = title; }

    public Album2 getAlbum2() { return this.album; }

    public void setAlbum(Album2 album) { this.album = album; }

    public String getArtist() { return this.artist; }

    public void setArtist(String artist) { this.artist = artist; }

    public String getImage() { return this.image; }

    public void setImage(String image) { this.image = image; }

    @JvmOverloads
    public Item2(@NotNull String title, @Nullable Album2 album, @Nullable String artist, @NotNull String image) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(image, "image");
        this.title = title;
        this.album = album;
        this.artist = artist;
        this.image = image;
    }
}