package p000X;

import android.content.Context;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.Arrays;

/* renamed from: X.0zO  reason: invalid class name and case insensitive filesystem */
public final class C23010zO implements C22950zI {
    public static final C17120pi A02 = new C23050zS();
    public String A00;
    public String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C23010zO r5 = (C23010zO) obj;
            if (!AnonymousClass17M.A00(r5.A01, this.A01) || !AnonymousClass17M.A00(r5.A00, this.A00)) {
                return false;
            }
        }
        return true;
    }

    public final String getTypeName() {
        return "PendingMediaFileOwner";
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00});
    }

    public final boolean AgI(Context context, AnonymousClass0C1 r5, String str) {
        if (!AnonymousClass17M.A00(this.A01, r5.A04())) {
            return true;
        }
        PendingMediaStore A012 = PendingMediaStore.A01(r5);
        if (!A012.A0E() || A012.A04(this.A00) != null) {
            return true;
        }
        return false;
    }

    public C23010zO() {
    }

    public C23010zO(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
