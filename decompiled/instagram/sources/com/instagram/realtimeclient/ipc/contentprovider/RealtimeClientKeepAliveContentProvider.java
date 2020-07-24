package com.instagram.realtimeclient.ipc.contentprovider;

import android.content.ContentValues;
import android.net.Uri;
import com.instagram.realtimeclient.keepalive.RealtimeClientKeepAlive;
import p000X.AnonymousClass0C1;
import p000X.B8U;

public class RealtimeClientKeepAliveContentProvider extends B8U {
    public static final String FBPERMISSION_PROVIDER_TRIGGER_REALTIME_KEEPALIVE = "com.instagram.fbpermission.PROVIDER_TRIGGER_REALTIME_KEEPALIVE";
    public static final String TAG = "RealtimeClientKeepAliveContentProvider";

    public RealtimeClientKeepAliveContentProvider() {
        super(FBPERMISSION_PROVIDER_TRIGGER_REALTIME_KEEPALIVE);
    }

    public int update(Uri uri, AnonymousClass0C1 r3, ContentValues contentValues, String str, String[] strArr) {
        RealtimeClientKeepAlive.getInstance(r3).doKeepAlive();
        return 1;
    }
}
