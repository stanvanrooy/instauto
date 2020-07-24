package p000X;

import android.location.Location;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.22a  reason: invalid class name and case insensitive filesystem */
public abstract class C470422a {
    public long A00;
    public C471022g A01;
    public C470822e A02;
    public C44121vd A03;
    public String A04;
    public ExecutorService A05;
    public ScheduledFuture A06;
    public final C04130Co A07;
    public final C04140Cp A08;
    public final C44081vZ A09;
    public final C43881vE A0A;
    public final AnonymousClass2IZ A0B;
    public final AnonymousClass26V A0C;
    public final AnonymousClass26W A0D;
    public final ScheduledExecutorService A0E;
    public final AtomicBoolean A0F = new AtomicBoolean();
    public final Dk0 A0G;
    public final C44071vY A0H;
    public final C470522b A0I;

    public abstract C44121vd A02(String str);

    public abstract void A03();

    public final synchronized void A04() {
        if (this.A0F.getAndSet(false)) {
            ScheduledFuture scheduledFuture = this.A06;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.A06 = null;
            }
            A03();
            A07("stopLocations", false, this.A04, (Integer) null, (Integer) null, (Boolean) null);
            A00(this, "");
            this.A02 = null;
            this.A01 = null;
            this.A04 = null;
            this.A03 = null;
            this.A00 = this.A08.now();
            AnonymousClass26V r0 = this.A0C;
            if (r0 != null) {
                r0.A00(this);
            }
            AnonymousClass26V r02 = this.A0C;
            if (r02 != null) {
                r02.A00(this);
            }
        }
    }

    public abstract void A05(C470822e r1);

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c7, code lost:
        if (r2 == false) goto L_0x00c9;
     */
    public final synchronized void A06(C470822e r14, C471022g r15, String str) {
        AnonymousClass26V r5;
        boolean z;
        AnonymousClass26V r0;
        AnonymousClass2IZ r02;
        synchronized (this) {
            boolean z2 = false;
            if (r14.A09 && (r02 = this.A0B) != null && !r02.A01) {
                C470722d r03 = new C470722d(r14);
                r03.A08 = false;
                r14 = new C470822e(r03);
            }
            String str2 = str;
            if (r14.A09 || (r0 = this.A0C) == null || r0.A01()) {
                if (!this.A0F.getAndSet(true)) {
                    z2 = true;
                }
                AnonymousClass0a4.A0A(z2);
                AnonymousClass0a4.A06(r14);
                this.A02 = r14;
                AnonymousClass0a4.A06(r15);
                this.A01 = r15;
                AnonymousClass0a4.A06(str2);
                this.A04 = str2;
                this.A00 = this.A08.now();
                C471122h A012 = this.A09.A01(this.A02.A06);
                A07("requestLocations", false, str2, A012.A01, A012.A00, Boolean.valueOf(r14.A09));
                if (A012.A01 != Constants.A0N) {
                    A00(this, C50072Ev.A00(Constants.ZERO));
                    AnonymousClass0Z9.A03(this.A05, new C50082Ex(this, new AnonymousClass2Ew(Constants.ZERO)), 1705216549);
                } else {
                    C43881vE r2 = this.A0A;
                    if (r2 != null) {
                        if (!r2.AiJ()) {
                            if (r2.Ah7(str2)) {
                            }
                        }
                    }
                    AnonymousClass26V r04 = this.A0C;
                    if (r04 != null && !r04.A01()) {
                        C43881vE r05 = this.A0A;
                        if (r05 != null) {
                            boolean Ah6 = r05.Ah6(str2);
                            z = true;
                        }
                        z = false;
                        if (z) {
                        }
                    }
                    Long l = this.A02.A08;
                    if (l != null) {
                        this.A06 = this.A0E.schedule(new C471222i(this), l.longValue(), TimeUnit.MILLISECONDS);
                    }
                    A05(r14);
                    if (!this.A02.A09 && (r5 = this.A0C) != null) {
                        ScheduledExecutorService scheduledExecutorService = this.A0E;
                        synchronized (r5) {
                            r5.A02.add(new WeakReference(this));
                            r5.A03 = scheduledExecutorService;
                            if (r5.A02.size() == 1) {
                                AnonymousClass2ND r22 = new AnonymousClass2ND(r5);
                                r5.A01 = r22;
                                r5.A04.registerActivityLifecycleCallbacks(r22);
                            }
                        }
                    }
                }
            } else {
                A07("requestLocations", true, str2, (Integer) null, (Integer) null, Boolean.valueOf(r14.A09));
            }
        }
    }

    public static void A00(C470422a r6, String str) {
        String A0E2;
        AnonymousClass01F r3;
        if (r6.A0G != null) {
            long now = r6.A08.now() - r6.A00;
            String str2 = r6.A04;
            if (str.isEmpty()) {
                A0E2 = "";
            } else {
                A0E2 = AnonymousClass000.A0E("-", str);
            }
            String A0E3 = AnonymousClass000.A0E(str2, A0E2);
            if (A0E3.startsWith("com.facebook.")) {
                A0E3 = A0E3.substring(13);
            }
            switch (r6.A02.A06.intValue()) {
                case 1:
                    r3 = r6.A0G.A00;
                    synchronized (r3) {
                        AnonymousClass01F.A00(r3, A0E3).A02 += now;
                        r3.A00.A02 += now;
                        break;
                    }
                case 2:
                    r3 = r6.A0G.A00;
                    synchronized (r3) {
                        AnonymousClass01F.A00(r3, A0E3).A01 += now;
                        r3.A00.A01 += now;
                        break;
                    }
                default:
                    r3 = r6.A0G.A00;
                    synchronized (r3) {
                        AnonymousClass01F.A00(r3, A0E3).A00 += now;
                        r3.A00.A00 += now;
                        break;
                    }
            }
        }
    }

    public final void A07(String str, boolean z, String str2, Integer num, Integer num2, Boolean bool) {
        String str3;
        AnonymousClass26W r0 = this.A0D;
        if (r0 != null) {
            String str4 = null;
            if (num != null) {
                str3 = AnonymousClass2NA.A00(num);
            } else {
                str3 = null;
            }
            if (num2 != null) {
                str4 = AnonymousClass2NB.A00(num2);
            }
            r0.A01("FbLocationManager", str, z, str2, str3, str4, bool);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0127, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0129, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007c  */
    public final synchronized boolean A08(C44121vd r21) {
        boolean z;
        long j;
        long j2;
        AnonymousClass26V r0;
        synchronized (this) {
            C470822e r02 = this.A02;
            if (r02 == null || r02.A09 || (r0 = this.A0C) == null || r0.A01()) {
                C44121vd r4 = r21;
                this.A0H.A03(r4);
                if (this.A0F.get()) {
                    boolean z2 = false;
                    if (this.A02.A07 != null) {
                        if (r21 == null || r4.A02() == null) {
                            j2 = Long.MIN_VALUE;
                        } else {
                            j2 = this.A07.now() - r4.A02().longValue();
                        }
                        if (j2 > this.A02.A07.longValue()) {
                            if (z2) {
                                C44121vd r7 = this.A03;
                                boolean z3 = true;
                                if (r7 != null && !A01(r7, r4)) {
                                    Float A012 = r4.A01();
                                    Float A013 = r7.A01();
                                    boolean z4 = false;
                                    if (!(A012 == null || A013 == null)) {
                                        float floatValue = A013.floatValue();
                                        float floatValue2 = A012.floatValue();
                                        if (floatValue >= floatValue2 && floatValue * this.A02.A01 >= floatValue2) {
                                            z4 = true;
                                        }
                                    }
                                    if (!z4 || A01(r4, r7)) {
                                        if (r7.A02() == null || r4.A02() == null) {
                                            j = Long.MIN_VALUE;
                                        } else {
                                            j = r4.A02().longValue() - r7.A02().longValue();
                                        }
                                        if (j > this.A02.A04) {
                                            float[] fArr = new float[1];
                                            Location.distanceBetween(r7.A00.getLatitude(), r7.A00.getLongitude(), r4.A00.getLatitude(), r4.A00.getLongitude(), fArr);
                                            if (fArr[0] > this.A02.A00) {
                                            }
                                        }
                                        z3 = false;
                                    }
                                }
                                if (z3) {
                                    ScheduledFuture scheduledFuture = this.A06;
                                    if (scheduledFuture != null) {
                                        scheduledFuture.cancel(false);
                                        this.A06 = null;
                                    }
                                    this.A03 = r4;
                                    AnonymousClass0Z9.A03(this.A05, new C472722x(this, r4), -1771421133);
                                    z = true;
                                }
                            }
                            z = false;
                        }
                    }
                    if (this.A02.A05 == null || r4.A01() == null || r4.A01().floatValue() <= this.A02.A05.floatValue()) {
                        z2 = true;
                    }
                    if (z2) {
                    }
                    z = false;
                }
            } else {
                A04();
            }
        }
    }

    public C44121vd getFixedLocation(Location location) {
        if (location == null) {
            return null;
        }
        if (!location.hasAccuracy()) {
            location.setAccuracy(3333.0f);
        }
        if (!C44111vc.A00(location)) {
            return null;
        }
        AnonymousClass0a4.A06(location);
        return new C44121vd(new Location(location), (Boolean) null);
    }

    public C470422a(C44081vZ r2, C04130Co r3, C04140Cp r4, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, C44071vY r7, Dk0 dk0, C470522b r9, AnonymousClass26V r10, AnonymousClass26W r11, C43881vE r12, AnonymousClass2IZ r13) {
        this.A09 = r2;
        this.A07 = r3;
        this.A08 = r4;
        this.A0E = scheduledExecutorService;
        this.A05 = executorService;
        this.A0H = r7;
        this.A0G = dk0;
        this.A0I = r9;
        this.A0C = r10;
        this.A0D = r11;
        this.A0A = r12;
        this.A0B = r13;
    }

    private boolean A01(C44121vd r7, C44121vd r8) {
        Long A022 = r7.A02();
        Long A023 = r8.A02();
        if (A022 == null || A023 == null) {
            return false;
        }
        long longValue = A022.longValue();
        long longValue2 = A023.longValue();
        if (longValue > longValue2 || longValue2 - longValue < this.A02.A03) {
            return false;
        }
        return true;
    }
}
