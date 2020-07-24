package p000X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.1yJ  reason: invalid class name and case insensitive filesystem */
public final class C45671yJ extends Handler {
    public final /* synthetic */ C45541y6 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45671yJ(C45541y6 r2) {
        super(Looper.getMainLooper());
        this.A00 = r2;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        boolean z = true;
        if (i == 1) {
            C45541y6 r1 = this.A00;
            C45901yl r0 = r1.A0E;
            if (r0 != null) {
                r1.A0D.BUq(r0.A0B);
            }
        } else if (i == 2) {
            C45541y6 r4 = this.A00;
            if (r4.A0C == C36341ht.PLAYING && r4.A0A != null) {
                if (r4.A0E != null) {
                    int A0A = r4.A0A();
                    int A0B = this.A00.A0B();
                    float f = (float) A0B;
                    float f2 = ((float) A0A) / f;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    C45541y6 r10 = this.A00;
                    C45901yl r8 = r10.A0E;
                    int i2 = r10.A03;
                    if (elapsedRealtime - r8.A01 >= ((long) i2)) {
                        r8.A01 = elapsedRealtime;
                        float f3 = f2 - r8.A00;
                        r8.A00 = f2;
                        float f4 = (((float) i2) / 100.0f) / f;
                        if (f3 < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || f3 > f4) {
                            z = false;
                        }
                        r8.A03 = z;
                        r10.A0D.BGP(z);
                    }
                    C45541y6 r02 = this.A00;
                    r02.A0D.BGS(A0A, A0B, r02.A0E.A03);
                }
                AnonymousClass0ZA.A03(this, 2, (long) this.A00.A04);
            }
        }
    }
}
