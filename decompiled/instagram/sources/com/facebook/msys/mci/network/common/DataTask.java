package com.facebook.msys.mci.network.common;

import p000X.C208928zC;

public class DataTask {
    public final String mContentUrl;
    public final long mNativeContext;
    public final String mTaskCategory;
    public final String mTaskIdentifier;
    public final int mTaskMode;
    public final int mTaskType;
    public final UrlRequest mUrlRequest;

    static {
        C208928zC.A00();
    }

    public DataTask(String str, String str2, int i, UrlRequest urlRequest, String str3, int i2, long j) {
        this.mTaskCategory = str;
        this.mTaskIdentifier = str2;
        this.mTaskType = i;
        this.mUrlRequest = urlRequest;
        this.mContentUrl = str3;
        this.mTaskMode = i2;
        this.mNativeContext = j;
    }
}
