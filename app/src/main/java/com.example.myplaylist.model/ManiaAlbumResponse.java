package com.example.myplaylist.model;

import org.jetbrains.annotations.Nullable;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "rss", strict =false)
public final class ManiaAlbumResponse {
    @Element(name = "channel")
    private Channel2 channel;

    public Channel2 getChannel() { return this.channel; }

    public void setChannel(Channel2 channel) { this.channel = channel; }

    public ManiaAlbumResponse(@Nullable Channel2 channel) {
        this.channel = channel;
    }
}




