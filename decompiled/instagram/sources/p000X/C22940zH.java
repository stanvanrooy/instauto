package p000X;

import android.content.Context;

/* renamed from: X.0zH  reason: invalid class name and case insensitive filesystem */
public final class C22940zH implements C22950zI {
    public static final C17120pi A01 = new C22990zM();
    public String A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.A00;
        String str2 = ((C22940zH) obj).A00;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    public final String getTypeName() {
        return "TransactionFileOwner";
    }

    public final int hashCode() {
        String str = this.A00;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final boolean AgI(Context context, AnonymousClass0C1 r5, String str) {
        boolean z;
        AnonymousClass14Q A02 = AnonymousClass14Q.A02(r5);
        synchronized (A02) {
            z = A02.A03;
        }
        if (!z || A02.A0K(this.A00) != null) {
            return true;
        }
        return false;
    }

    public C22940zH() {
    }

    public C22940zH(String str) {
        this.A00 = str;
    }
}
