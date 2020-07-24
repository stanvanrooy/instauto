package p000X;

import com.google.android.gms.common.Feature;

/* renamed from: X.BGr */
public final class BGr extends UnsupportedOperationException {
    public final Feature A00;

    public final String getMessage() {
        String valueOf = String.valueOf(this.A00);
        StringBuilder sb = new StringBuilder(valueOf.length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }

    public BGr(Feature feature) {
        this.A00 = feature;
    }
}
