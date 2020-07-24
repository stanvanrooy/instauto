package p000X;

import android.content.Context;

/* renamed from: X.0zT  reason: invalid class name and case insensitive filesystem */
public final class C23060zT implements C22950zI {
    public static final C17120pi A01 = new C23070zU();
    public String A00;

    public final boolean AgI(Context context, AnonymousClass0C1 r3, String str) {
        return false;
    }

    public final String getTypeName() {
        return "CapturedMediaFileOwner";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return AnonymousClass17M.A00(this.A00, ((C23060zT) obj).A00);
    }

    public final int hashCode() {
        String str = this.A00;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
