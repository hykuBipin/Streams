package com.bipin.streams.ListToObjDupKey;

public class Notes {
    private long tagId;
    private final String tagName;
    private int someValue;

    public Notes(long tagId, String tagName, int someValue) {
        this.tagId = tagId;
        this.tagName = tagName;
        this.someValue = someValue;
    }

    public long getTagId() {
        return tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public int getSomeValue() {
        return someValue;
    }
}

