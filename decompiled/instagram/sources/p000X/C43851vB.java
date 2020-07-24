package p000X;

import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.facebook.blescan.BleScanOperation;
import com.facebook.common.time.RealtimeSinceBootClock;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.1vB  reason: invalid class name and case insensitive filesystem */
public final class C43851vB implements C06570Po {
    public C229979yy A00;
    public C229929yt A01;
    public AnonymousClass2IU A02;
    public C44091va A03;
    public C44071vY A04;
    public C44081vZ A05;
    public AnonymousClass26V A06;
    public C50832Ia A07;
    public AnonymousClass26W A08;
    public AnonymousClass0C1 A09;
    public ScheduledExecutorService A0A;
    public ScheduledExecutorService A0B;
    public final Context A0C;
    public final AnonymousClass0IT A0D;
    public final AnonymousClass0IT A0E;
    public final AnonymousClass0IT A0F;
    public final C43881vE A0G;

    public final synchronized C44071vY A03() {
        C44091va r7;
        if (this.A04 == null) {
            C44081vZ A042 = A04();
            LocationManager locationManager = (LocationManager) this.A0C.getSystemService("location");
            synchronized (this) {
                if (this.A03 == null) {
                    this.A03 = new C44091va(C05370Ke.A00, RealtimeSinceBootClock.A00);
                }
                r7 = this.A03;
            }
            this.A04 = new C44071vY(A042, locationManager, r7, this.A0G, A08());
        }
        return this.A04;
    }

    public final synchronized C44081vZ A04() {
        if (this.A05 == null) {
            Context context = this.A0C;
            this.A05 = new C44081vZ(context, (LocationManager) context.getSystemService("location"));
        }
        return this.A05;
    }

    public final synchronized AnonymousClass26V A05() {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29) {
            z = true;
        }
        if (!z) {
            return null;
        }
        if (this.A06 == null) {
            Context context = this.A0C;
            if (AnonymousClass26V.A05 == null) {
                AnonymousClass26V.A05 = new AnonymousClass26V(context);
            }
            this.A06 = AnonymousClass26V.A05;
        }
        return this.A06;
    }

    public final synchronized C50832Ia A07() {
        if (this.A07 == null) {
            Context context = this.A0C;
            C05370Ke r3 = C05370Ke.A00;
            RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
            C05370Ke r6 = r3;
            RealtimeSinceBootClock realtimeSinceBootClock2 = realtimeSinceBootClock;
            this.A07 = new C50832Ia(context, r6, realtimeSinceBootClock2, A09(), new C50842Ib(context), new C50852Ic(r3, realtimeSinceBootClock, 600000), A05(), false);
        }
        return this.A07;
    }

    public final synchronized AnonymousClass26W A08() {
        AnonymousClass26V A052 = A05();
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29) {
            z = true;
        }
        if (!z || A052 == null) {
            return null;
        }
        if (this.A08 == null) {
            this.A08 = new AnonymousClass26W(this.A09, A052);
        }
        return this.A08;
    }

    public final synchronized ScheduledExecutorService A09() {
        if (this.A0A == null) {
            this.A0A = new AnonymousClass22X(new Handler(C15740nS.A00()));
        }
        return this.A0A;
    }

    public final synchronized ScheduledExecutorService A0A() {
        if (this.A0B == null) {
            this.A0B = new AnonymousClass22X(new Handler(Looper.getMainLooper()));
        }
        return this.A0B;
    }

    public final void onUserSessionWillEnd(boolean z) {
    }

    public static synchronized C43851vB A00(Context context, AnonymousClass0C1 r3) {
        C43851vB r0;
        Class<C43851vB> cls = C43851vB.class;
        synchronized (cls) {
            r0 = (C43851vB) r3.AVA(cls, new C43861vC(context, r3));
        }
        return r0;
    }

    public final BleScanOperation A01() {
        C229979yy r0;
        C229929yt r02;
        ScheduledExecutorService A092 = A09();
        Context context = this.A0C;
        synchronized (this) {
            if (this.A00 == null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    C05370Ke r5 = C05370Ke.A00;
                    RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
                    synchronized (this) {
                        boolean z = false;
                        if (Build.VERSION.SDK_INT >= 29) {
                            z = true;
                        }
                        if (!z) {
                            r02 = null;
                        } else {
                            if (this.A01 == null) {
                                this.A01 = new C229969yx();
                            }
                            r02 = this.A01;
                        }
                    }
                    this.A00 = new AnonymousClass2TO(r5, realtimeSinceBootClock, r02);
                } else {
                    this.A00 = new C229939yu();
                }
            }
            r0 = this.A00;
        }
        return new BleScanOperation(A092, context, r0);
    }

    public final C470422a A02() {
        C021701i r0;
        Dk0 dk0;
        AnonymousClass2IZ A002;
        C44081vZ A042 = A04();
        C05370Ke r7 = C05370Ke.A00;
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
        ScheduledExecutorService A092 = A09();
        ScheduledExecutorService A0A2 = A0A();
        LocationManager locationManager = (LocationManager) this.A0C.getSystemService("location");
        C44071vY A032 = A03();
        synchronized (AnonymousClass17Y.class) {
            AnonymousClass17Y r02 = AnonymousClass17Y.A06;
            if (r02 != null) {
                r0 = (C021701i) r02.A01.A03;
            } else {
                r0 = null;
            }
        }
        if (r0 != null) {
            dk0 = new Dk0((AnonymousClass01F) ((C035407j) r0.A00.get(AnonymousClass01H.class)));
        } else {
            dk0 = null;
        }
        C470522b r14 = new C470522b();
        AnonymousClass26V A052 = A05();
        AnonymousClass26W A082 = A08();
        C43881vE r1 = this.A0G;
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29) {
            z = true;
        }
        if (!z) {
            A002 = null;
        } else {
            A002 = AnonymousClass2IZ.A00(this.A0C);
        }
        return new AnonymousClass22Z(A042, r7, realtimeSinceBootClock, A092, A0A2, locationManager, A032, dk0, r14, A052, A082, r1, A002);
    }

    public final AnonymousClass2IT A06() {
        AnonymousClass2IU r5;
        synchronized (this) {
            if (this.A02 == null) {
                this.A02 = new AnonymousClass2IU(AnonymousClass2IV.A00(this.A0C, A08()));
            }
            r5 = this.A02;
        }
        return new AnonymousClass2IT(r5, this.A0E, this.A0F, this.A0D, A07(), A09());
    }

    public C43851vB(Context context, AnonymousClass0C1 r3) {
        C43881vE r0;
        this.A0C = context;
        this.A09 = r3;
        if (C06080Nr.A09(context)) {
            r0 = new C30789DkI();
        } else {
            r0 = new C43871vD(r3);
        }
        this.A0G = r0;
        this.A0E = new C43891vF(this);
        this.A0F = new C43901vG(this);
        this.A0D = new C43911vH(this);
    }
}
