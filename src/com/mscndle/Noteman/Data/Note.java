package com.mscndle.Noteman.Data;

import android.graphics.Color;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

//
// Note class that contains all critical information about a note
//
public class Note {

    private UUID mId;
    private boolean mSynced; // to check if it should be updated / newly created in the cloud
    private Date mDate;
    private String mTitle;
    private String mDescription;
    private String mTodo;
    private Color mColor;
    private Set<String> mTags;

    public Note() {
        mId = UUID.randomUUID();
        mDate = new Date();
        mTags = new HashSet<String>();
    }


    public Set<String> getmTags() {
        return mTags;
    }

    private void setmTags(Set<String> mTags) {
        this.mTags = mTags;
    }

    public String getmDescription() {
        return mDescription;
    }

    private void setmContents(String mDescription) {
        this.mDescription = mDescription;
    }

    public String getmTitle() {
        return mTitle;
    }

    private void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Date getmDate() {
        return mDate;
    }

    public boolean ismSynced() {
        return mSynced;
    }

    private void setmSynced(boolean mSynced) {
        this.mSynced = mSynced;
    }

    public UUID getmId() {
        return mId;
    }

    public String getmTodo() {
        return mTodo;
    }

    public void setmTodo(String mTodo) {
        this.mTodo = mTodo;
    }

    public Color getmColor() {
        return mColor;
    }

    public void setmColor(Color mColor) {
        this.mColor = mColor;
    }

}
