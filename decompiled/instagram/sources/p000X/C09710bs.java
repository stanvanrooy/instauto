package p000X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.view.Choreographer;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.logger.Logger;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0bs  reason: invalid class name and case insensitive filesystem */
public final class C09710bs extends AnonymousClass0GW {
    public static final int A0D = ProvidersRegistry.A00.A02("frames");
    public final Runnable A00 = new AnonymousClass0HP(this);
    public final AtomicBoolean A01 = new AtomicBoolean(false);
    public final Context A02;
    public final Handler A03;
    public final AnonymousClass0DN A04;
    public final Runnable A05 = new AnonymousClass0HO(this);
    public final Runnable A06 = new AnonymousClass0HN(this);
    public volatile double A07 = 0.0d;
    public volatile int A08 = 0;
    public volatile long A09 = 0;
    public volatile long A0A = -1;
    public volatile long A0B;
    public volatile AnonymousClass0DO A0C = null;

    public C09710bs(Context context) {
        super((String) null);
        this.A02 = context;
        this.A03 = new Handler(Looper.getMainLooper());
        this.A04 = new C09700br(this);
    }

    public static void A00(int i, long j) {
        Logger.writeStandardEntry(0, 7, 52, 0, 0, i, 0, j);
    }

    public final boolean A08() {
        return true;
    }

    static {
        TimeUnit.NANOSECONDS.convert(1, TimeUnit.MILLISECONDS);
    }

    public static void A01(C09710bs r14) {
        AnonymousClass0DO r3 = r14.A0C;
        if (r3 != null) {
            A00(8126532, r14.A0A);
            A00(8126533, (long) r14.A08);
            A00(8126534, r14.A09);
            Logger.writeBytesEntry(0, 1, 57, Logger.writeBytesEntry(0, 1, 56, Logger.writeStandardEntry(0, 7, 52, 0, 0, 8126535, 0, 0), "4_frame_drop_uncapped"), String.valueOf(r14.A07));
            r3.disable();
        }
    }

    public static void A02(C09710bs r5) {
        AnonymousClass0DO r0;
        if (r5.A01.get() && r5.A0A != -1 && (r0 = r5.A0C) != null) {
            r0.enable();
        }
    }

    public static void A03(C09710bs r3) {
        if (r3.A0C == null) {
            r3.A0C = new C29809DAt(Choreographer.getInstance(), r3.A04);
        }
    }

    public static void A04(String str) {
        Logger.writeBytesEntry(A0D, 1, 83, Logger.writeStandardEntry(A0D, 7, 22, 0, 0, 0, 0, 0), str);
        Logger.writeStandardEntry(A0D, 7, 23, 0, 0, 0, 0, 0);
    }

    public final int getSupportedProviders() {
        return A0D;
    }

    public final int getTracingProviders() {
        if (this.A01.get()) {
            return A0D;
        }
        return 0;
    }

    public final void disable() {
        int i;
        int A032 = AnonymousClass0Z0.A03(365365400);
        AnonymousClass0DO r2 = this.A0C;
        if (!this.A01.getAndSet(false)) {
            i = -536166528;
        } else {
            if (r2 == null) {
                AnonymousClass0ZA.A0E(this.A03, this.A05, 853907308);
            } else {
                A01(this);
            }
            i = 793906493;
        }
        AnonymousClass0Z0.A0A(i, A032);
    }

    public final void enable() {
        int i;
        int A032 = AnonymousClass0Z0.A03(2007067407);
        if (this.A01.getAndSet(true)) {
            i = 923728031;
        } else {
            if (this.A0A == -1) {
                if (AnonymousClass0DP.A01 == null) {
                    AnonymousClass0DP.A01 = new AnonymousClass0DP();
                }
                this.A0A = AnonymousClass0DP.A01.A00(this.A02);
            }
            if (this.A0C != null) {
                A02(this);
            } else {
                boolean z = false;
                if (Process.myTid() == Process.myPid()) {
                    z = true;
                }
                if (z) {
                    A03(this);
                    A02(this);
                } else {
                    AnonymousClass0ZA.A0E(this.A03, this.A06, -478382277);
                }
            }
            i = 1410611369;
        }
        AnonymousClass0Z0.A0A(i, A032);
    }
}
