package com.instagram.contentprovider.users.impl;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Binder;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import java.net.CookieManager;
import java.net.HttpCookie;
import java.util.ArrayList;
import java.util.List;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0k5;
import p000X.AnonymousClass1A3;
import p000X.AnonymousClass1BD;
import p000X.C05210Iq;
import p000X.C06590Pq;
import p000X.C13300iJ;

public final class IgLoggedInUsersContentProvider extends ContentProvider {
    public static final String[] A00 = {MemoryDumpUploadJob.EXTRA_USER_ID, "session_id", "username", "profile_pic_url", "is_active_user"};

    public final boolean onCreate() {
        return true;
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public final String getType(Uri uri) {
        throw new UnsupportedOperationException();
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r3.getPackageManager().checkSignatures(r1, r2) == 0) goto L_0x001b;
     */
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        boolean z;
        HttpCookie A02;
        String value;
        Context context = getContext();
        int callingUid = Binder.getCallingUid();
        int i = context.getApplicationInfo().uid;
        if (callingUid != i) {
            z = false;
        }
        z = true;
        if (!z) {
            return null;
        }
        AnonymousClass1A3.A01.A00();
        List arrayList = new ArrayList();
        C06590Pq A01 = AnonymousClass0J1.A01(this);
        if (A01.AgN()) {
            arrayList = C05210Iq.A02(A01).A05.A02();
        }
        MatrixCursor matrixCursor = new MatrixCursor(A00);
        String A04 = AnonymousClass0J1.A05().A04();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C13300iJ r2 = (C13300iJ) arrayList.get(i2);
            String id = r2.getId();
            CookieManager A012 = AnonymousClass0k5.A01(id);
            if (A012 == null) {
                A02 = null;
            } else {
                A02 = AnonymousClass1BD.A02(A012, "sessionid");
            }
            if (A02 == null) {
                value = null;
            } else {
                value = A02.getValue();
            }
            boolean equals = A04.equals(id);
            matrixCursor.addRow(new String[]{id, value, r2.AZn(), r2.ASv().AZc(), Boolean.toString(equals)});
        }
        return matrixCursor;
    }
}
