package p000X;

import android.content.Context;
import com.facebook.C0003R;
import java.util.List;

/* renamed from: X.1j3  reason: invalid class name and case insensitive filesystem */
public final class C37061j3 {
    public final int A00;
    public final List A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0043, code lost:
        if (((p000X.C29171Ow) r5.A01.get(0)).A0K != p000X.Constants.ONE) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r7.A1E() != false) goto L_0x001c;
     */
    public C37061j3(Context context, AnonymousClass1NJ r7, C36841ih r8, boolean z) {
        this.A00 = C37071j4.A00(r7, r8, z);
        boolean z2 = true;
        boolean z3 = (r8.A0E == C17070pd.SINGLE_MEDIA_FEED && !r7.A3L) ? true : z3;
        z3 = false;
        this.A03 = z3;
        List A032 = C05970Ne.A03(r7.A0I().A00, new C37101j7(this));
        this.A01 = A032;
        boolean z4 = !A032.isEmpty() ? true : z4;
        z4 = false;
        this.A02 = z4;
        boolean z5 = false;
        if (!r7.A3L && r8.A0E != C17070pd.COMMENTS_VIEW && !AnonymousClass1BA.A07(context, C0003R.attr.shouldHideAllComments, false)) {
            z5 = true;
        }
        if (z5) {
            this.A05 = this.A01.size() - (this.A02 ? 1 : 0) >= r7.A08() ? false : z2;
            boolean z6 = false;
            if (!r7.A3L && !AnonymousClass1BA.A07(context, C0003R.attr.shouldMinimizeAllComments, false)) {
                z6 = true;
            }
            this.A04 = z6;
            return;
        }
        this.A05 = false;
        this.A04 = false;
    }
}
