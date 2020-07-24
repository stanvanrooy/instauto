package p000X;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;

/* renamed from: X.D4Y */
public final class D4Y extends C29733D6x {
    public float A00;
    public long A01 = -9223372036854775807L;
    public long A02;
    public final HeroPlayerSetting A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    public D4Y(Context context, D3G d3g, D7w d7w, boolean z, Handler handler, C29762D8m d8m, HeroPlayerSetting heroPlayerSetting) {
        super(r1, r2, r3, true, r5, r6, d8m, (C2112099b) null, new DIV[0]);
        D3G d3g2 = d3g;
        Context context2 = context;
        D7w d7w2 = d7w;
        boolean z2 = z;
        Handler handler2 = handler;
        this.A03 = heroPlayerSetting;
    }

    public final void AbQ(int i, Object obj) {
        if (i == 2) {
            float floatValue = ((Float) obj).floatValue();
            this.A00 = floatValue;
            if (floatValue > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                this.A02 = SystemClock.elapsedRealtime();
            }
            if (this.A03.A0S.A02) {
                A00();
            }
        }
        super.AbQ(i, obj);
    }

    private void A00() {
        long j;
        long j2 = this.A03.A0S.A01;
        if (j2 > 0) {
            j = SystemClock.elapsedRealtime() + j2;
        } else {
            j = -9223372036854775807L;
        }
        this.A01 = j;
    }

    public final void A0G(long j, boolean z) {
        if (z) {
            A00();
        } else {
            this.A01 = -9223372036854775807L;
        }
        super.A0G(j, z);
    }

    public final void A0H(boolean z) {
        if (z) {
            A00();
        } else {
            this.A01 = -9223372036854775807L;
        }
        super.A0H(z);
    }

    public final boolean AfJ() {
        if (this.A03.A0S.A03 && AhB()) {
            return super.AfJ();
        }
        if (this.A00 <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || SystemClock.elapsedRealtime() - this.A02 < ((long) this.A03.A0S.A00) || super.AfJ()) {
            return true;
        }
        return false;
    }

    public final boolean AhB() {
        long j = this.A01;
        if (j == -9223372036854775807L || SystemClock.elapsedRealtime() >= j) {
            return super.AhB();
        }
        return true;
    }

    public final void A0F() {
        super.A0F();
        this.A01 = -9223372036854775807L;
    }
}
