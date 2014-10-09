package com.mscndle.Noteman;

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
    private String mContents;
    private Set<String> mTags;

    public Note() {
        mId = UUID.randomUUID();
        mDate = new Date();
        mTags = new HashSet<String>();
    }


    public Set<String> getmTags() {
        return mTags;
    }

    public void setmTags(Set<String> mTags) {
        this.mTags = mTags;
    }

    public String getmContents() {
        return mContents;
    }

    public void setmContents(String mContents) {
        this.mContents = mContents;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Date getmDate() {
        return mDate;
    }

    public boolean ismSynced() {
        return mSynced;
    }

    public void setmSynced(boolean mSynced) {
        this.mSynced = mSynced;
    }

    public UUID getmId() {
        return mId;
    }
}
