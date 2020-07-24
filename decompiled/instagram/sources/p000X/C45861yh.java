package p000X;

import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.p009ui.mediaactions.MediaActionsView;

/* renamed from: X.1yh  reason: invalid class name and case insensitive filesystem */
public final class C45861yh implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ AnonymousClass1NJ A03;
    public final /* synthetic */ C27371Ho A04;
    public final /* synthetic */ C32161ah A05;
    public final /* synthetic */ AnonymousClass1RS A06;

    public C45861yh(AnonymousClass1RS r1, AnonymousClass1NJ r2, int i, int i2, int i3, C27371Ho r6, C32161ah r7) {
        this.A06 = r1;
        this.A03 = r2;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = i3;
        this.A04 = r6;
        this.A05 = r7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0054, code lost:
        if (r1 == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0050, code lost:
        if (r0.A06 == null) goto L_0x0052;
     */
    public final void run() {
        boolean z;
        boolean z2;
        boolean A0A = AnonymousClass1RS.A0A(this.A06);
        AnonymousClass1RS r1 = this.A06;
        AnonymousClass1NJ r6 = this.A03;
        C45871yi r5 = new C45871yi(r6, this.A01, this.A00, this.A02, A0A, r1.A0A, this.A04);
        r1.A02 = r5;
        if (!r6.Aho()) {
            r1.A01 = r5;
        }
        C32161ah r12 = this.A05;
        r5.A07 = r12;
        r5.A08 = r12.APt();
        r12.APf().setVisibility(0);
        AnonymousClass1RS r52 = this.A06;
        C45871yi r13 = r52.A02;
        MediaActionsView APf = r13.A07.APf();
        boolean z3 = r52.A0M;
        if (r52.A0N) {
            AnonymousClass1YY r0 = r13.A00().A0b;
            if (r0 != null) {
                z2 = true;
            }
            z2 = false;
            z = true;
        }
        z = false;
        APf.A0E = z3;
        APf.A0H = z;
        AnonymousClass1RS r2 = this.A06;
        r2.A03 = new C45891yk(r2.A02.A07.APf());
        AnonymousClass1NJ A002 = this.A06.A02.A00();
        AnonymousClass1RS r02 = this.A06;
        r02.A07 = false;
        r02.A09 = false;
        C45541y6 r22 = r02.A04;
        String str = A002.A23;
        C37671k2 A0e = A002.A0e();
        C45871yi r7 = this.A06.A02;
        C31841a5 AXz = r7.A07.AXz();
        int i = this.A02;
        float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        if (A0A) {
            f = 1.0f;
        }
        r22.A0K(str, A0e, AXz, -1, r7, i, f, true, this.A04.getModuleName());
    }
}
