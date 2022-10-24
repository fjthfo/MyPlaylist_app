package com.example.myplaylist.model;

import org.jetbrains.annotations.Nullable;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name = "channel", strict = false)
public class Channel {
    @ElementList(inline = true, required = false)
    private List<Item> itemList;

    public List<Item> getItemList() { return this.itemList; }

    public void setItemList(List<Item> itemList) { this.itemList = itemList; }

    public Channel(@Nullable List<Item> itemList) {
        this.itemList = itemList;
    }
}