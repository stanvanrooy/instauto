package com.instagram.contentprovider.latencytest;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0XP;
import p000X.AnonymousClass1A3;
import p000X.B8V;
import p000X.B8Y;
import p000X.B8Z;
import p000X.B91;
import p000X.C05210Iq;
import p000X.C06360Ot;
import p000X.C06590Pq;
import p000X.C25138B2q;
import p000X.C25251BAe;

public class LatencyTestContentProvider extends ContentProvider {
    public AnonymousClass0XP A00;
    public B8Y A01;
    public final String[] A02 = {MemoryDumpUploadJob.EXTRA_USER_ID};

    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public final String getType(Uri uri) {
        throw new UnsupportedOperationException();
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    public final boolean onCreate() {
        this.A00 = new B8V(this);
        Set set = B91.A14;
        HashSet hashSet = new HashSet(1);
        Collections.addAll(hashSet, new String[]{"com.facebook.orca"});
        this.A01 = B8Z.A02(set, new C25138B2q(hashSet));
        return true;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        boolean A07;
        boolean z;
        Context context = getContext();
        B8Y b8y = this.A01;
        if (context == null) {
            A07 = false;
        } else {
            A07 = b8y.A07(B8Y.A01(context), context);
        }
        if (!A07) {
            return null;
        }
        List list = B8Y.A01(context).A04;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str3 = (String) it.next();
                if (!C25251BAe.A02(context, str3)) {
                    this.A00.Bbv(C06360Ot.formatString("App %s is not FbPermission signed", str3));
                } else if (C25251BAe.A00(this.A00).A03(context, str3, "com.facebook.fbpermission.IG_PROVIDER_LATENCY_TEST", true)) {
                    z = true;
                    break;
                }
            }
            if (z) {
                return null;
            }
            AnonymousClass1A3.A01.A00();
            List arrayList = new ArrayList();
            C06590Pq A012 = AnonymousClass0J1.A01(this);
            if (A012.AgN()) {
                arrayList = C05210Iq.A02(A012).A05.A04((String) null);
            }
            MatrixCursor matrixCursor = new MatrixCursor(this.A02);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                matrixCursor.addRow(new String[]{(String) arrayList.get(i)});
            }
            return matrixCursor;
        }
        z = false;
        if (z) {
        }
    }
}
