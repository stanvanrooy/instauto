package p000X;

import java.lang.ref.WeakReference;

/* renamed from: X.1nK  reason: invalid class name and case insensitive filesystem */
public final class C39691nK extends AnonymousClass0O9 {
    public final /* synthetic */ C39651nG A00;
    public final /* synthetic */ AnonymousClass1FK A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39691nK(AnonymousClass1FK r2, C39651nG r3) {
        super(175);
        this.A01 = r2;
        this.A00 = r3;
    }

    public final void run() {
        AnonymousClass0C1 r3 = this.A00.A01;
        AnonymousClass0L7 r2 = AnonymousClass0L7.PREFETCH_QUEUE_BEHAVIOR;
        boolean booleanValue = ((Boolean) AnonymousClass0L6.A02(r3, r2, "queue_behavior_all_front", true, (AnonymousClass04H) null)).booleanValue();
        boolean booleanValue2 = ((Boolean) AnonymousClass0L6.A02(this.A00.A01, r2, "queue_behavior_ads_front", true, (AnonymousClass04H) null)).booleanValue();
        boolean booleanValue3 = ((Boolean) AnonymousClass0L6.A02(this.A00.A01, r2, "queue_behavior_stories_front", true, (AnonymousClass04H) null)).booleanValue();
        C39651nG r5 = this.A00;
        C37671k2 r22 = r5.A02;
        Integer num = r22.A03;
        Integer num2 = Constants.ONE;
        boolean z = true;
        boolean z2 = false;
        if (num == num2) {
            z2 = true;
        }
        if (z2) {
            booleanValue = booleanValue3;
        }
        if (r22.A0D) {
            booleanValue = booleanValue2;
        }
        if (!((Boolean) AnonymousClass0L6.A02(r5.A01, AnonymousClass0L7.GPS_IMPROVEMENTS_LAUNCHER, "skip_video_cancel_on_prefetch", false, (AnonymousClass04H) null)).booleanValue()) {
            C39651nG r23 = this.A00;
            String str = r23.A03;
            if (r23.A02.A03 != num2 || !C39611nC.A00(r23.A01).booleanValue()) {
                z = false;
            }
            C39701nL.A04(str, z);
        }
        C39651nG r24 = this.A00;
        C39821nc r32 = new C39821nc(r24.A02, r24.A03);
        r32.A01 = r24.A00 << 10;
        r32.A02 = new WeakReference(this.A01.A00);
        r32.A03 = booleanValue;
        C39831nd.A00(r32, this.A00.A01);
    }
}
