package p000X;

import java.util.Locale;

/* renamed from: X.0mg  reason: invalid class name and case insensitive filesystem */
public final class C15310mg implements Comparable {
    public final int A00;
    public final int A01;
    public final String A02;
    public final Locale A03;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.A02.compareTo(((C15310mg) obj).A02);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15310mg) || !this.A02.equals(((C15310mg) obj).A02)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }

    public C15310mg(String str, int i, int i2, Locale locale) {
        this.A02 = str;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = locale;
    }
}
