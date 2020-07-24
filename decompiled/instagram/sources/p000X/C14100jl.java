package p000X;

import com.facebook.AccessToken;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;

/* renamed from: X.0jl  reason: invalid class name and case insensitive filesystem */
public final class C14100jl {
    public static String A00(C06590Pq r1) {
        AccessToken accessToken;
        if (r1.AgN()) {
            accessToken = C14110jm.A00(C05210Iq.A02(r1).A04()).A02();
        } else {
            accessToken = C23290AGo.A00(r1).A00;
        }
        if (accessToken == null) {
            return null;
        }
        return accessToken.A02;
    }

    public static String A01(C06590Pq r4) {
        if (r4.AgN()) {
            AnonymousClass0C1 A02 = C05210Iq.A02(r4);
            AccessToken A022 = C14110jm.A00(A02.A04()).A02();
            if (A022 == null) {
                return null;
            }
            String string = C42251s2.A01(A02).getString(MemoryDumpUploadJob.EXTRA_USER_ID, (String) null);
            if (string == null) {
                return A022.A03;
            }
            return string;
        }
        AccessToken accessToken = C23290AGo.A00(r4).A00;
        if (accessToken != null) {
            return accessToken.A03;
        }
        return null;
    }

    public static boolean A02(AnonymousClass0C1 r2) {
        if (A00(r2) == null || !C42251s2.A01(r2).getBoolean("user_ie", false)) {
            return false;
        }
        return true;
    }
}
