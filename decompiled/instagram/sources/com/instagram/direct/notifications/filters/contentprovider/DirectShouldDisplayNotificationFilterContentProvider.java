package com.instagram.direct.notifications.filters.contentprovider;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass147;
import p000X.B8U;

public class DirectShouldDisplayNotificationFilterContentProvider extends B8U {
    public final String[] A00 = {"should_display_notification"};

    public DirectShouldDisplayNotificationFilterContentProvider() {
        super("com.instagram.android.fbpermission.PROVIDER_FILTER_DIRECT_NOTIFICATIONS");
    }

    public final Cursor query(Uri uri, AnonymousClass0C1 r7, String[] strArr, String str, String[] strArr2, String str2) {
        MatrixCursor matrixCursor = new MatrixCursor(this.A00);
        String queryParameter = uri.getQueryParameter("thread_id");
        if (queryParameter != null) {
            matrixCursor.addRow(new Object[]{Integer.valueOf(AnonymousClass147.A00(r7).A02(queryParameter) ? 1 : 0)});
        }
        return matrixCursor;
    }
}
