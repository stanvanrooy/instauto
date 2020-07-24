package p000X;

import android.content.Context;
import com.facebook.C0003R;
import com.instagram.common.notifications.push.intf.PushChannelType;

/* renamed from: X.1rj  reason: invalid class name and case insensitive filesystem */
public final class C42131rj implements C41981rI {
    public final Context A00;
    public final C92803zk A01;
    public final C92803zk A02;
    public final C253818o A03;

    public final void AdL(String str, boolean z) {
    }

    public final void BA0() {
    }

    public final PushChannelType ATL() {
        return PushChannelType.FCM;
    }

    public final void BZU() {
        if (AnonymousClass0NT.A07(this.A00)) {
            AqO((B5P) null);
        }
        C252017t r5 = (C252017t) this.A03.A01.get();
        if (r5 != null) {
            AnonymousClass237 r4 = new AnonymousClass237(C0003R.C0005id.fcm_refresh_push_token_job_service_id);
            long j = C253818o.A02;
            r4.A01 = j;
            r4.A03 = j + (j / 2);
            r4.A00 = 1;
            r4.A06 = true;
            try {
                r5.A03(r4.A00());
            } catch (IllegalArgumentException e) {
                AnonymousClass0QD.A01("FCMTokenJobService", "Service not found exception: " + e);
            }
        }
    }

    public C42131rj(Context context, C253818o r2, C92803zk r3, C92803zk r4) {
        this.A00 = context;
        this.A03 = r2;
        this.A02 = r3;
        this.A01 = r4;
    }

    public final void AqO(B5P b5p) {
        C05700Lp.A00().ADc(new C51912Mp(this, b5p));
    }
}
