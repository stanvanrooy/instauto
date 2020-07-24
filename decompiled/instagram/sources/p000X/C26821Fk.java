package p000X;

import android.view.View;
import com.instagram.mainactivity.MainActivity;

/* renamed from: X.1Fk  reason: invalid class name and case insensitive filesystem */
public final class C26821Fk implements View.OnClickListener {
    public final /* synthetic */ MainActivity A00;
    public final /* synthetic */ AnonymousClass1DU A01;

    public C26821Fk(MainActivity mainActivity, AnonymousClass1DU r2) {
        this.A00 = mainActivity;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        if (r0.getVisibility() != 0) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        if (r1 == false) goto L_0x0048;
     */
    public final void onClick(View view) {
        boolean z;
        boolean z2;
        int A05 = AnonymousClass0Z0.A05(-586473662);
        if (this.A00.Aew(this.A01)) {
            if (this.A01 == AnonymousClass1DU.SEARCH) {
                C226739pM.A00(this.A00.A06).A01(this.A00);
            }
            this.A00.A0Z(this.A01);
            if (this.A01 == AnonymousClass1DU.NEWS) {
                AnonymousClass1FW r0 = this.A00.A05.A04;
                if (r0 != null) {
                    View view2 = r0.A03;
                    if (view2 != null) {
                        z2 = true;
                    }
                    z2 = false;
                    z = true;
                }
                z = false;
                if (z) {
                    C16880pJ.A00.A05(this.A00.A06);
                }
            }
        }
        AnonymousClass0Z0.A0C(-1476264018, A05);
    }
}
