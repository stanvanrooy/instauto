package p000X;

import android.util.Base64;
import com.facebook.C0003R;
import java.util.List;

/* renamed from: X.BLq */
public final class BLq {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AnonymousClass000.A0Q("FontRequest {mProviderAuthority: ", this.A02, ", mProviderPackage: ", this.A03, ", mQuery: ", this.A04, ", mCertificates:"));
        for (int i = 0; i < this.A05.size(); i++) {
            sb.append(" [");
            List list = (List) this.A05.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append(AnonymousClass000.A05("mCertificatesArray: ", this.A00));
        return sb.toString();
    }

    public BLq() {
        AnonymousClass11J.A00("com.google.android.gms.fonts");
        this.A02 = "com.google.android.gms.fonts";
        AnonymousClass11J.A00("com.google.android.gms");
        this.A03 = "com.google.android.gms";
        AnonymousClass11J.A00("Noto Color Emoji Compat");
        this.A04 = "Noto Color Emoji Compat";
        this.A05 = null;
        AnonymousClass11J.A02(true);
        this.A00 = C0003R.array.com_google_android_gms_fonts_certs;
        this.A01 = AnonymousClass000.A0O(this.A02, "-", this.A03, "-", this.A04);
    }

    public BLq(String str, String str2, String str3, List list) {
        AnonymousClass11J.A00(str);
        this.A02 = str;
        AnonymousClass11J.A00(str2);
        this.A03 = str2;
        AnonymousClass11J.A00(str3);
        this.A04 = str3;
        AnonymousClass11J.A00(list);
        this.A05 = list;
        this.A00 = 0;
        this.A01 = AnonymousClass000.A0O(str, "-", str2, "-", str3);
    }
}
