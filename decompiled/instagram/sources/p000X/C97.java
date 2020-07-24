package p000X;

import android.os.Bundle;
import com.facebook.C0003R;

/* renamed from: X.C97 */
public final class C97 implements C7C {
    public final /* synthetic */ C96 A00;

    public C97(C96 c96) {
        this.A00 = c96;
    }

    public final void AtO() {
        C96.A04(this.A00);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0066, code lost:
        if (r0 == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0070, code lost:
        if (r0 == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007a, code lost:
        if (r0 == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0084, code lost:
        if (r0 == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008e, code lost:
        if (r0 == false) goto L_0x0048;
     */
    public final void B6W() {
        char c;
        C96 c96 = this.A00;
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", c96.A09.getToken());
        bundle.putString("ARG.PostInsights.Info.Title", c96.getResources().getString(C0003R.string.interactions_info_title));
        C9A c9a = c96.A05;
        if (c9a != null) {
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            for (C9D c9d : c9a.A05.A00) {
                if (c9d.A00 > 0) {
                    String str = c9d.A01;
                    switch (str.hashCode()) {
                        case -2075921735:
                            boolean equals = str.equals("BIO_LINK_CLICKED");
                            c = 0;
                            break;
                        case 2060894:
                            boolean equals2 = str.equals("CALL");
                            c = 1;
                            break;
                        case 2571565:
                            boolean equals3 = str.equals("TEXT");
                            c = 4;
                            break;
                        case 66081660:
                            boolean equals4 = str.equals("EMAIL");
                            c = 3;
                            break;
                        case 1824003935:
                            boolean equals5 = str.equals("DIRECTION");
                            c = 2;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 0) {
                        z = true;
                    } else if (c == 1) {
                        z2 = true;
                    } else if (c == 2) {
                        z3 = true;
                    } else if (c == 3) {
                        z4 = true;
                    } else if (c == 4) {
                        z5 = true;
                    }
                }
            }
            bundle.putBooleanArray(AnonymousClass40t.$const$string(48), new boolean[]{z, z2, z3, z4, z5});
        }
        C112174sB r1 = new C112174sB();
        r1.setArguments(bundle);
        C96.A05(c96, r1, Constants.A0F);
    }

    public final void BG0(String str) {
        C96.A06(this.A00, str);
    }
}
