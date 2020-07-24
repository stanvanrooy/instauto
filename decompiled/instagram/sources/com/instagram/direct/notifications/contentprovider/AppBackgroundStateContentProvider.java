package com.instagram.direct.notifications.contentprovider;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0Q7;
import p000X.B8U;

public class AppBackgroundStateContentProvider extends B8U {
    public final String[] A00 = {AnonymousClass0C5.$const$string(254)};

    public AppBackgroundStateContentProvider() {
        super("com.instagram.android.fbpermission.PROVIDER_READ_BACKGROUND_STATE");
    }

    public final Cursor query(Uri uri, AnonymousClass0C1 r6, String[] strArr, String str, String[] strArr2, String str2) {
        MatrixCursor matrixCursor = new MatrixCursor(this.A00);
        matrixCursor.addRow(new Object[]{Integer.valueOf(AnonymousClass0Q7.A03().A0H() ? 1 : 0)});
        return matrixCursor;
    }
}
