package com.example.myplaylist.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "artist", strict = false)
public class Artist{

    @Element(name = "name")
    private String name = "";

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }


}
