package com.example.myplaylist.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "album", strict = false)
public class Album{
    @Element(name = "image")
    String image = "";

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}