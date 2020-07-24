package p000X;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.B8U */
public abstract class B8U extends ContentProvider {
    public final C92803zk mIpcTrustedCallerVerifier;

    public boolean onCreate() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0029, code lost:
        if (p000X.B8Y.A05(p000X.C25221B8j.A03(r8, r1)) == false) goto L_0x002b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    private boolean isCallerAppTrusted(Context context) {
        boolean z;
        boolean z2;
        AnonymousClass4XQ r5 = (AnonymousClass4XQ) this.mIpcTrustedCallerVerifier.get();
        B8X A01 = B8Y.A01(context);
        String A00 = A01.A00();
        if (B8Y.A05(C25221B8j.A03(context, context.getPackageName())) && A00 != null) {
            z = true;
        }
        z = false;
        if (!z) {
            List list = A01.A04;
            if (list != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String str = (String) it.next();
                    if (!C25251BAe.A02(context, str)) {
                        r5.A00.Bbv(C06360Ot.formatString("App %s is not FbPermission signed", str));
                    } else if (C25251BAe.A00(r5.A00).A03(context, str, r5.A01, false)) {
                        z2 = true;
                        break;
                    }
                }
                if (!z2) {
                    return true;
                }
                return false;
            }
            z2 = false;
            if (!z2) {
            }
        }
        return true;
    }

    private AnonymousClass0C1 maybeGetUserSessionAndWaitForAppInitialization(Uri uri) {
        String queryParameter = uri.getQueryParameter(MemoryDumpUploadJob.EXTRA_USER_ID);
        if (queryParameter != null) {
            AnonymousClass1A3.A01.A00();
            C06590Pq A01 = AnonymousClass0J1.A01(this);
            if (A01.AgN()) {
                AnonymousClass0C1 A02 = C05210Iq.A02(A01);
                if (A02.A04().equals(queryParameter)) {
                    return A02;
                }
            }
        }
        return null;
    }

    public String getType(Uri uri) {
        throw new UnsupportedOperationException();
    }

    public B8U(AnonymousClass0IT r2) {
        this.mIpcTrustedCallerVerifier = AnonymousClass8AL.A00(r2);
    }

    public B8U(String str) {
        this((AnonymousClass0IT) new AnonymousClass4XR(str));
    }

    public int delete(Uri uri, AnonymousClass0C1 r3, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        if (!isCallerAppTrusted(getContext()) || maybeGetUserSessionAndWaitForAppInitialization(uri) == null) {
            return 0;
        }
        throw new UnsupportedOperationException();
    }

    public Uri insert(Uri uri, AnonymousClass0C1 r3, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        if (!isCallerAppTrusted(getContext()) || maybeGetUserSessionAndWaitForAppInitialization(uri) == null) {
            return null;
        }
        throw new UnsupportedOperationException();
    }

    public Cursor query(Uri uri, AnonymousClass0C1 r3, String[] strArr, String str, String[] strArr2, String str2) {
        throw new UnsupportedOperationException();
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (isCallerAppTrusted(getContext())) {
            Uri uri2 = uri;
            AnonymousClass0C1 maybeGetUserSessionAndWaitForAppInitialization = maybeGetUserSessionAndWaitForAppInitialization(uri);
            if (maybeGetUserSessionAndWaitForAppInitialization != null) {
                return query(uri2, maybeGetUserSessionAndWaitForAppInitialization, strArr, str, strArr2, str2);
            }
        }
        return null;
    }

    public int update(Uri uri, AnonymousClass0C1 r3, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (isCallerAppTrusted(getContext())) {
            Uri uri2 = uri;
            AnonymousClass0C1 maybeGetUserSessionAndWaitForAppInitialization = maybeGetUserSessionAndWaitForAppInitialization(uri);
            if (maybeGetUserSessionAndWaitForAppInitialization != null) {
                return update(uri2, maybeGetUserSessionAndWaitForAppInitialization, contentValues, str, strArr);
            }
        }
        return 0;
    }
}
