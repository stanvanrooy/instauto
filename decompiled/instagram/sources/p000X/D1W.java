package p000X;

import android.net.Uri;

/* renamed from: X.D1W */
public final class D1W {
    public Uri A00;
    public String A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof D1W)) {
            return false;
        }
        return this.A00.equals(((D1W) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return this.A01 + ", " + this.A00;
    }

    public D1W(String str, Uri uri) {
        this.A01 = str;
        this.A00 = uri;
    }
}
