package com.instagram.pendingmedia.model;

import android.os.Parcelable;

public interface UserStoryTarget extends Parcelable {
    public static final UserStoryTarget A00 = new SimpleUserStoryTarget("ALL");
    public static final UserStoryTarget A01 = new SimpleUserStoryTarget("ARCHIVE");
    public static final UserStoryTarget A02 = new SimpleUserStoryTarget("CLOSE_FRIENDS");
    public static final UserStoryTarget A03 = new SimpleUserStoryTarget("FACEBOOK");
    public static final UserStoryTarget A04 = new SimpleUserStoryTarget("FACEBOOK_DATING");

    String AZE();

    boolean equals(Object obj);
}
