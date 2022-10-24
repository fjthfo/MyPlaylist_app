package com.example.myplaylist.model;

import org.jetbrains.annotations.Nullable;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "rss", strict =false)
public final class ManiaDBClientResponse {
    @Element(name = "channel")
    public Channel channel;

    public Channel getChannel() { return this.channel; }

    public void setChannel(Channel channel) { this.channel = channel; }

    public ManiaDBClientResponse(@Nullable Channel channel) {
        this.channel = channel;
    }
}















//class Channel {
//    private String title;
//    private String link;
//    private String description;
//    private String lastBuildDate;
//    private String total;
//    private String start;
//    private String display;
//    ArrayList< Object > item = new ArrayList < Object > ();
//
//
//    // Getter Methods
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getLink() {
//        return link;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public String getLastBuildDate() {
//        return lastBuildDate;
//    }
//
//    public String getTotal() {
//        return total;
//    }
//
//    public String getStart() {
//        return start;
//    }
//
//    public String getDisplay() {
//        return display;
//    }
//
//    // Setter Methods
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public void setLink(String link) {
//        this.link = link;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public void setLastBuildDate(String lastBuildDate) {
//        this.lastBuildDate = lastBuildDate;
//    }
//
//    public void setTotal(String total) {
//        this.total = total;
//    }
//
//    public void setStart(String start) {
//        this.start = start;
//    }
//
//    public void setDisplay(String display) {
//        this.display = display;
//    }



//}