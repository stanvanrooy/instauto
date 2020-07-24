package com.instagram.contentprovider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Binder;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass1A3;
import p000X.AnonymousClass1BD;
import p000X.AnonymousClass43Q;
import p000X.B64;
import p000X.B8R;
import p000X.B8S;
import p000X.B8Y;
import p000X.B8Z;
import p000X.B91;
import p000X.BAP;
import p000X.C05210Iq;
import p000X.C06590Pq;
import p000X.C13300iJ;
import p000X.C25215B8a;
import p000X.C25221B8j;

public class FamilyAppsUserValuesProvider extends ContentProvider {
    public static final Class A01 = FamilyAppsUserValuesProvider.class;
    public AnonymousClass0C1 A00 = null;

    public final boolean onCreate() {
        return true;
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        AnonymousClass0DB.A03(A01, "Unsupported Operation");
        throw new UnsupportedOperationException();
    }

    public final String getType(Uri uri) {
        AnonymousClass0DB.A03(A01, "Unsupported Operation");
        throw new UnsupportedOperationException();
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        AnonymousClass0DB.A03(A01, "Unsupported Operation");
        throw new UnsupportedOperationException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005b, code lost:
        if (r0 == 0) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00cd, code lost:
        if (r0 == false) goto L_0x00cf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d2  */
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        boolean z;
        C13300iJ r1;
        boolean A002;
        boolean A003;
        boolean z2;
        Class cls;
        String str3;
        AnonymousClass1A3.A01.A00();
        C06590Pq A012 = AnonymousClass0J1.A01(this);
        if (!A012.AgN()) {
            cls = A01;
            str3 = "No logged-in user";
        } else {
            AnonymousClass0C1 A02 = C05210Iq.A02(A012);
            this.A00 = A02;
            if (A02 == null) {
                cls = A01;
                str3 = "No user session available";
            } else {
                Context context = getContext();
                if (AnonymousClass43Q.A00(this.A00).booleanValue()) {
                    try {
                        z = C25221B8j.A06(context, context.getApplicationInfo().uid, Binder.getCallingUid());
                    } catch (SecurityException unused) {
                        z = false;
                    }
                } else {
                    int callingUid = Binder.getCallingUid();
                    int i = context.getApplicationInfo().uid;
                    if (callingUid != i) {
                        int checkSignatures = context.getPackageManager().checkSignatures(i, callingUid);
                        z = false;
                    }
                    z = true;
                }
                if (!z) {
                    Context context2 = getContext();
                    if (AnonymousClass43Q.A00(this.A00).booleanValue()) {
                        B8Y b8y = C25215B8a.A00;
                        if (context2 == null) {
                            A002 = false;
                        } else {
                            A002 = b8y.A07(B8Y.A01(context2), context2);
                        }
                    } else {
                        A002 = B64.A00(context2, BAP.A00, B8S.A00);
                    }
                    if (!A002) {
                        Context context3 = getContext();
                        AnonymousClass0C1 r6 = this.A00;
                        if (AnonymousClass43Q.A00(r6).booleanValue()) {
                            if (((Boolean) AnonymousClass0L6.A02(r6, AnonymousClass0L7.SSO_KOTOTORO_APP, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                                B8Y A022 = B8Z.A02(Collections.unmodifiableSet(new HashSet(Collections.singletonList(B91.A09))), Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"com.facebook.kototoro", "com.facebook.lasso"}))));
                                if (context3 == null) {
                                    A003 = false;
                                } else {
                                    A003 = A022.A07(B8Y.A01(context3), context3);
                                }
                            }
                            z2 = false;
                            if (!z2) {
                                AnonymousClass0DB.A03(A01, "Component access not allowed.");
                                throw new SecurityException("Component access not allowed.");
                            }
                        } else {
                            if (((Boolean) AnonymousClass0L6.A02(r6, AnonymousClass0L7.SSO_KOTOTORO_APP, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                                A003 = B64.A00(context3, Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"com.facebook.kototoro", "com.facebook.lasso"}))), Collections.unmodifiableSet(new HashSet(Collections.singletonList("GoRS3a2OGuGeDTeVe6y0xFgcNbo"))));
                            }
                            z2 = false;
                            if (!z2) {
                            }
                        }
                        z2 = true;
                    }
                }
                AnonymousClass0C1 r3 = this.A00;
                if (!(r3 == null || (r1 = r3.A06) == null)) {
                    String AZn = r1.AZn();
                    String AMN = r1.AMN();
                    String valueOf = String.valueOf(r1.AeV());
                    ImageUrl ASv = r1.ASv();
                    String A004 = AnonymousClass1BD.A00(r3);
                    if (A004 != null) {
                        String[] strArr3 = {AZn, AMN, A004, ASv.AZc(), valueOf, null, null};
                        MatrixCursor matrixCursor = new MatrixCursor(B8R.A01);
                        matrixCursor.addRow(strArr3);
                        return matrixCursor;
                    }
                }
                AnonymousClass0DB.A04(A01, "User info not available");
                return null;
            }
        }
        AnonymousClass0DB.A04(cls, str3);
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        AnonymousClass0DB.A03(A01, "Unsupported Operation");
        throw new UnsupportedOperationException();
    }
}
