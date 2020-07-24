package com.instagram.contentprovider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Binder;
import android.os.CancellationSignal;
import com.facebook.flipper.core.StateSummary;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass1A3;
import p000X.C05210Iq;
import p000X.C06590Pq;
import p000X.C13300iJ;

public class CurrentUserProvider extends ContentProvider {
    public static final String[] A00 = {StateSummary.$const$string(20), StateSummary.$const$string(21)};

    public final boolean onCreate() {
        return true;
    }

    public final Cursor A00() {
        AnonymousClass1A3.A01.A00();
        C06590Pq A01 = AnonymousClass0J1.A01(this);
        if (!A01.AgN()) {
            return null;
        }
        C13300iJ r0 = C05210Iq.A02(A01).A06;
        String[] strArr = {r0.AMN(), r0.ASv().AZc()};
        MatrixCursor matrixCursor = new MatrixCursor(A00);
        matrixCursor.addRow(strArr);
        return matrixCursor;
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

    public final void A01() {
        int callingUid = Binder.getCallingUid();
        int i = getContext().getApplicationInfo().uid;
        if (callingUid != i && getContext().getPackageManager().checkSignatures(i, callingUid) != 0) {
            throw new SecurityException("Access to user information denied");
        }
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        A01();
        return A00();
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        A01();
        return A00();
    }
}
