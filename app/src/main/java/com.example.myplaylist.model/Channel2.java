package com.example.myplaylist.model;

import org.jetbrains.annotations.Nullable;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

import kotlin.jvm.JvmOverloads;

@Root(name = "channel", strict = false)
public class Channel2 {
    @ElementList(inline = true, required = false)
    private List<Item2> itemList;

    public List<Item2> getItemList() { return this.itemList; }

    public void setItemList(List<Item2> itemList) { this.itemList = itemList; }

    @JvmOverloads
    public Channel2(@Nullable List<Item2> itemList) {
        this.itemList = itemList;
    }
}
