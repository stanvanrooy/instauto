package p000X;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import java.util.ArrayList;

/* renamed from: X.B8d */
public abstract class B8d extends ContentProvider {
    public abstract C17570qS A00(Context context);

    public abstract C25219B8h A01();

    public abstract C25217B8f A02(Context context);

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

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        boolean z;
        boolean z2;
        SecurityException securityException;
        try {
            Context context = getContext();
            B8Y b8y = B8c.A01;
            if (context == null) {
                z = false;
            } else {
                z = b8y.A07(B8Y.A01(context), context);
            }
            if (!z) {
                B8Y b8y2 = B8c.A00;
                if (context == null) {
                    z2 = false;
                } else {
                    z2 = b8y2.A07(B8Y.A01(context), context);
                }
                if (!z2) {
                    if (!B8c.A01.A07(B8Y.A01(context), context)) {
                        securityException = new SecurityException("Access denied.");
                    } else if (!B8c.A00.A07(B8Y.A01(context), context)) {
                        securityException = new SecurityException("Access denied.");
                    }
                    throw securityException;
                }
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            C17570qS A00 = A00(getContext());
            if (A00 != null) {
                getContext();
                arrayList.add("COL_PHONE_ID");
                arrayList.add("COL_TIMESTAMP");
                arrayList.add("COL_ORIGIN");
                arrayList2.add(A00.A01);
                arrayList2.add(Long.toString(A00.A00));
                arrayList2.add(A00.A02);
            }
            C25217B8f A02 = A02(getContext());
            if (A02 != null) {
                getContext();
                arrayList.add("COL_SFDID");
                arrayList.add("COL_SFDID_CREATION_TS");
                arrayList.add("COL_SFDID_GP");
                arrayList.add("COL_SFDID_GA");
                arrayList2.add(A02.A03);
                arrayList2.add(Long.toString(A02.A00));
                arrayList2.add(A02.A02);
                arrayList2.add(A02.A01);
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            MatrixCursor matrixCursor = new MatrixCursor((String[]) arrayList.toArray(new String[arrayList.size()]));
            matrixCursor.addRow(arrayList2.toArray(new String[arrayList2.size()]));
            return matrixCursor;
        } catch (Exception e) {
            C25219B8h A01 = A01();
            if (A01 == null) {
                return null;
            }
            A01.Bbw("AbstractPhoneIdProvider", e.getMessage(), e);
            return null;
        }
    }
}
