package com.instagram.realtimeclient.ipc;

import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import p000X.AnonymousClass0NH;
import p000X.AnonymousClass0QD;
import p000X.C06080Nr;

public class CrossAppRealtimeClientKeepAlive {
    public static final String TAG = "CrossAppRealtimeClientKeepAlive";

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r3 = new android.net.Uri.Builder().scheme("content").authority(p000X.AnonymousClass000.A0E(r7, ".contentprovider.realtimeclient.keepalive")).appendQueryParameter(com.instagram.debug.memorydump.MemoryDumpUploadJob.EXTRA_USER_ID, r6).build();
     */
    public static boolean triggerRealtimeClientKeepAlive(Context context, String str, String str2) {
        Uri build;
        ContentProviderClient A00;
        if (!C06080Nr.A0B(context.getPackageManager(), str2) || (A00 = AnonymousClass0NH.A00(context, build)) == null) {
            return false;
        }
        try {
            boolean z = true;
            if (A00.update(build, new ContentValues(), (String) null, (String[]) null) != 1) {
                z = false;
            }
            return z;
        } catch (RemoteException e) {
            AnonymousClass0QD.A09("CrossAppRealtimeClientKeepAlive_cross_app_realtime_keep_alive_failed", e);
            return false;
        } finally {
            A00.release();
        }
    }
}
