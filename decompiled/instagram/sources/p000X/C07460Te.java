package p000X;

import android.content.Context;
import android.os.SystemClock;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import org.webrtc.MediaCodecVideoEncoder;

/* renamed from: X.0Te  reason: invalid class name and case insensitive filesystem */
public final class C07460Te {
    public long A00 = -1;
    public long A01 = -1;
    public long A02 = 0;
    public final C10960eC A03;
    public final C07480Tg A04;
    public final Context A05;
    public final RealtimeSinceBootClock A06;
    public final boolean A07;

    public final synchronized void A00() {
        if (this.A07) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.A00;
            if (j < 0) {
                this.A00 = elapsedRealtime;
                this.A01 = elapsedRealtime;
            } else {
                long j2 = elapsedRealtime - j;
                this.A00 = elapsedRealtime;
                if (j2 > 10000) {
                    this.A02 += 10000;
                } else {
                    this.A02 += j2;
                }
                if (elapsedRealtime - this.A01 > MediaCodecVideoEncoder.QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS) {
                    this.A02 += this.A03.A00(Constants.A02).A00.getLong("total_wake_ms", 0);
                    C11000eG A002 = this.A03.A00(Constants.A02).A00();
                    A002.A00.putLong("total_wake_ms", this.A02);
                    A002.A00.apply();
                    this.A02 = 0;
                    this.A01 = elapsedRealtime;
                }
                if (elapsedRealtime - this.A03.A00(Constants.A02).A00.getLong("last_log_ms", elapsedRealtime) > 3600000) {
                    this.A04.A06("mqtt_radio_active_time", C07200Sd.A00("total_wake_ms", Long.toString(this.A03.A00(Constants.A02).A00.getLong("total_wake_ms", 0))));
                    C11000eG A003 = this.A03.A00(Constants.A02).A00();
                    A003.A00.clear();
                    A003.A00.apply();
                    C11000eG A004 = this.A03.A00(Constants.A02).A00();
                    A004.A00.putLong("last_log_ms", elapsedRealtime);
                    A004.A00.apply();
                }
            }
        }
    }

    public C07460Te(Context context, C07480Tg r9, RealtimeSinceBootClock realtimeSinceBootClock, boolean z, C10960eC r12) {
        this.A05 = context;
        this.A04 = r9;
        this.A06 = realtimeSinceBootClock;
        this.A07 = z;
        this.A03 = r12;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (r12.A00(Constants.A02).A00.getLong("last_log_ms", elapsedRealtime) >= elapsedRealtime) {
            C11000eG A002 = this.A03.A00(Constants.A02).A00();
            A002.A00.putLong("last_log_ms", elapsedRealtime);
            A002.A00.apply();
        }
    }
}
