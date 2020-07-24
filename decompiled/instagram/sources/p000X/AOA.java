package p000X;

import android.content.Context;
import android.os.HandlerThread;
import com.instagram.arlink.fragment.ArLinkScanControllerImpl;
import java.lang.ref.WeakReference;

/* renamed from: X.AOA */
public abstract class AOA implements AWU {
    public ARC A00;
    public String A01;
    public boolean A02;
    public final Context A03;
    public final HandlerThread A04;
    public final AnonymousClass0C1 A05;
    public final C191228Fj A06;
    public final C23724Aa8 A07;
    public final AWQ A08;
    public final C191188Ff A09;

    public void A08() {
        this.A04.quitSafely();
    }

    public AOA(Context context, AnonymousClass0C1 r7, C87023q3 r8, C191188Ff r9) {
        Integer num;
        this.A03 = context.getApplicationContext();
        this.A05 = r7;
        this.A09 = r9;
        C23724Aa8 aa8 = new C23724Aa8();
        this.A07 = aa8;
        aa8.A0G = new WeakReference(this);
        HandlerThread handlerThread = new HandlerThread("Live Streaming HandlerThread");
        this.A04 = handlerThread;
        handlerThread.start();
        AnonymousClass0L7 r3 = AnonymousClass0L7.LIVE_EGL10_COMPAT;
        if (((Boolean) AnonymousClass0L6.A02(r7, r3, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            num = (Integer) AnonymousClass0L6.A02(r7, r3, AnonymousClass0C5.$const$string(265), 18, (AnonymousClass04H) null);
        } else {
            num = null;
        }
        C191228Fj r4 = new C191228Fj(r9, num);
        this.A06 = r4;
        r4.A02 = ArLinkScanControllerImpl.TARGET_IMAGE_SIZE;
        boolean z = r8 != null;
        if (this.A02 != z && z) {
            r4.A06 = r8;
            this.A02 = true;
        }
        AWQ awq = new AWQ(this.A04.getLooper(), r8);
        this.A08 = awq;
        this.A07.A0F = awq.getClass().getSimpleName();
        awq.A05 = this;
        this.A06.A00 = ArLinkScanControllerImpl.TARGET_IMAGE_SIZE;
    }
}
