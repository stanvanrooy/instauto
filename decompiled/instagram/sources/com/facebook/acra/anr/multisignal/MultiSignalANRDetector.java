package com.facebook.acra.anr.multisignal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.facebook.acra.anr.sigquit.SigquitDetectorAcra;
import com.facebook.acra.anr.sigquit.SigquitDetectorLacrima;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p000X.AnonymousClass000;
import p000X.AnonymousClass020;
import p000X.AnonymousClass021;
import p000X.AnonymousClass027;
import p000X.AnonymousClass02E;
import p000X.AnonymousClass02F;
import p000X.AnonymousClass02K;
import p000X.AnonymousClass02P;
import p000X.AnonymousClass08W;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0DU;
import p000X.AnonymousClass0SX;
import p000X.AnonymousClass0SY;
import p000X.AnonymousClass0ZA;
import p000X.C021801j;
import p000X.C022201n;
import p000X.C022301o;
import p000X.C022401p;
import p000X.C022501q;
import p000X.C022601r;
import p000X.C022701s;

public class MultiSignalANRDetector implements C022401p, AnonymousClass02P {
    public static Map A0U = new HashMap();
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public C022201n A06;
    public AnonymousClass02E A07;
    public AnonymousClass0SX A08;
    public String A09 = "MultiSignalANRDetector";
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public final Handler A0M;
    public final C021801j A0N;
    public final AnonymousClass02K A0O;
    public final AnonymousClass0SY A0P = new AnonymousClass0DU(this);
    public final Object A0Q = new Object();
    public final Runnable A0R = new C022701s(this);
    public final HandlerThread A0S;
    public final AnonymousClass02F A0T = new AnonymousClass08W(this);

    public static MultiSignalANRDetector A00(C021801j r3) {
        String str;
        MultiSignalANRDetector multiSignalANRDetector = (MultiSignalANRDetector) A0U.get(r3);
        if (multiSignalANRDetector == null) {
            multiSignalANRDetector = new MultiSignalANRDetector(r3);
            A0U.put(r3, multiSignalANRDetector);
        }
        if (r3.A0D) {
            str = "Lacrima";
        } else {
            str = "Acra";
        }
        multiSignalANRDetector.A09 = AnonymousClass000.A0E("MultiSignalANRDetector", str);
        return multiSignalANRDetector;
    }

    private void A01(AnonymousClass027 r5) {
        C022201n r3;
        AnonymousClass0DB.A0K(this.A09, "Unexpected event %s received in state %s", r5, this.A08);
        if (r5 != AnonymousClass027.SIGQUIT_RECEIVED && (r3 = this.A06) != null) {
            r3.Bcg("Unexpected event", new IllegalStateException("Unexpected event " + r5 + " received in state " + this.A08));
        }
    }

    public static void A02(MultiSignalANRDetector multiSignalANRDetector) {
        AnonymousClass0DB.A0K(multiSignalANRDetector.A09, "Clearing error state has pending report %b", Boolean.valueOf(multiSignalANRDetector.A0E));
        if (multiSignalANRDetector.A0E) {
            multiSignalANRDetector.A0N.A06.AE8(SystemClock.uptimeMillis() - multiSignalANRDetector.A01);
            multiSignalANRDetector.A0E = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        if (r4 == p000X.AnonymousClass0SX.SIGQUIT_RECEIVED_AM_UNCONFIRMED_MT_UNBLOCKED) goto L_0x004e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c0 A[Catch:{ IOException -> 0x0155 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d6 A[Catch:{ IOException -> 0x0155 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x010a A[Catch:{ IOException -> 0x0155 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x011d A[Catch:{ IOException -> 0x0155 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0126 A[Catch:{ IOException -> 0x0155 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    public static void A03(MultiSignalANRDetector multiSignalANRDetector, AnonymousClass027 r38) {
        boolean z;
        String str;
        long j;
        String str2;
        String str3;
        boolean z2;
        C021801j r5;
        File file;
        long j2;
        boolean z3;
        MultiSignalANRDetector multiSignalANRDetector2 = multiSignalANRDetector;
        AnonymousClass027 r1 = r38;
        AnonymousClass0DB.A0K(multiSignalANRDetector2.A09, "On maybeStartReport event: %s has pending report %b", r38, Boolean.valueOf(multiSignalANRDetector2.A0E));
        if (!multiSignalANRDetector2.A0E) {
            if (multiSignalANRDetector2.A0J || multiSignalANRDetector2.A0I) {
                C022201n r0 = multiSignalANRDetector2.A06;
                if (r0 != null) {
                    z = r0.Bma();
                } else {
                    z = multiSignalANRDetector2.A0N.A0C;
                }
            } else {
                z = false;
            }
            if (!multiSignalANRDetector2.A0K && multiSignalANRDetector2.A0N.A03 > 0) {
                AnonymousClass0SX r4 = multiSignalANRDetector2.A08;
                if (r4 != AnonymousClass0SX.SIGQUIT_RECEIVED_AM_UNCONFIRMED_MT_BLOCKED) {
                    z3 = false;
                }
                z3 = true;
                if (z3) {
                    AnonymousClass0DB.A0E(multiSignalANRDetector2.A09, "Starting timer for AM confirmation");
                    multiSignalANRDetector2.A0K = true;
                    AnonymousClass0ZA.A09(multiSignalANRDetector2.A0M, multiSignalANRDetector2.A0R, (long) multiSignalANRDetector2.A0N.A03, 2104556552);
                }
            }
            if (z) {
                AnonymousClass0DB.A0E(multiSignalANRDetector2.A09, "Reporting ANR start");
                boolean z4 = true;
                try {
                    multiSignalANRDetector2.A0E = true;
                    multiSignalANRDetector2.A01 = SystemClock.uptimeMillis();
                    AnonymousClass027 r42 = AnonymousClass027.SIGQUIT_RECEIVED;
                    if (r1 == r42) {
                        str3 = multiSignalANRDetector2.A0A;
                        str2 = multiSignalANRDetector2.A0B;
                        j = multiSignalANRDetector2.A04;
                    } else {
                        j = 0;
                        str3 = null;
                        str2 = null;
                    }
                    if (r1 == r42) {
                        if (str3 != null || str2 != null) {
                            z2 = true;
                            r5 = multiSignalANRDetector2.A0N;
                            C022501q r15 = r5.A06;
                            if (multiSignalANRDetector2.A06 != null) {
                                z4 = false;
                            }
                            int i = r5.A01;
                            boolean z5 = multiSignalANRDetector2.A0I;
                            boolean z6 = multiSignalANRDetector2.A0J;
                            long uptimeMillis = SystemClock.uptimeMillis();
                            long j3 = multiSignalANRDetector2.A02;
                            if (!r5.A0G) {
                                file = r5.A04.getDir("sigquit", 0);
                            } else {
                                file = null;
                            }
                            int i2 = i;
                            boolean z7 = z5;
                            boolean z8 = z6;
                            C022501q r18 = r15;
                            r18.Bq0(z4, (String) null, (String) null, i2, z7, z8, uptimeMillis, j3, 0, 0, str3, str2, z2, file, multiSignalANRDetector2.A0N.A09.replace('.', '_').replace(':', '_'), Long.valueOf(j));
                            if (r1 == AnonymousClass027.AM_CONFIRMED) {
                                multiSignalANRDetector2.A0N.A06.Ani(multiSignalANRDetector2.A0C, multiSignalANRDetector2.A0D, multiSignalANRDetector2.A05);
                            }
                            j2 = multiSignalANRDetector2.A03;
                            if (j2 == 0) {
                                multiSignalANRDetector2.A0N.A06.Amj(j2, 3);
                                return;
                            }
                            return;
                        }
                    }
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    C022601r.A00(byteArrayOutputStream);
                    str3 = byteArrayOutputStream.toString();
                    z2 = false;
                    r5 = multiSignalANRDetector2.A0N;
                    C022501q r152 = r5.A06;
                    if (multiSignalANRDetector2.A06 != null) {
                    }
                    int i3 = r5.A01;
                    boolean z52 = multiSignalANRDetector2.A0I;
                    boolean z62 = multiSignalANRDetector2.A0J;
                    long uptimeMillis2 = SystemClock.uptimeMillis();
                    long j32 = multiSignalANRDetector2.A02;
                    if (!r5.A0G) {
                    }
                    int i22 = i3;
                    boolean z72 = z52;
                    boolean z82 = z62;
                    C022501q r182 = r152;
                    r182.Bq0(z4, (String) null, (String) null, i22, z72, z82, uptimeMillis2, j32, 0, 0, str3, str2, z2, file, multiSignalANRDetector2.A0N.A09.replace('.', '_').replace(':', '_'), Long.valueOf(j));
                    if (r1 == AnonymousClass027.AM_CONFIRMED) {
                    }
                    j2 = multiSignalANRDetector2.A03;
                    if (j2 == 0) {
                    }
                } catch (IOException e) {
                    AnonymousClass0DB.A0M(multiSignalANRDetector2.A09, e, "Error starting ANR report");
                    multiSignalANRDetector2.A0E = false;
                }
            } else if (r1 == AnonymousClass027.SIGQUIT_RECEIVED && (str = multiSignalANRDetector2.A0B) != null) {
                new File(str).delete();
            }
        } else if (r1 == AnonymousClass027.SIGQUIT_RECEIVED) {
            multiSignalANRDetector2.A0N.A06.AnI(multiSignalANRDetector2.A0A, multiSignalANRDetector2.A0B, multiSignalANRDetector2.A04);
        } else if (r1 == AnonymousClass027.AM_CONFIRMED) {
            multiSignalANRDetector2.A0N.A06.Ani(multiSignalANRDetector2.A0C, multiSignalANRDetector2.A0D, multiSignalANRDetector2.A05);
        } else {
            throw new IllegalArgumentException("Event should be SIGQUIT_RECEIVED or AM_CONFIRMED");
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007d, code lost:
        r0 = p000X.AnonymousClass0SX.SIGQUIT_RECEIVED_AM_CONFIRMED_MT_BLOCKED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0090, code lost:
        A01(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0093, code lost:
        r6 = true;
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0097, code lost:
        if (r8 != p000X.AnonymousClass027.SIGQUIT_RECEIVED) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0099, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009a, code lost:
        r4 = r7.A0N.A00;
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009f, code lost:
        if (r5 == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a1, code lost:
        r0 = new p000X.AnonymousClass022(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a6, code lost:
        if (r4 != null) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a8, code lost:
        r0.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ab, code lost:
        r2 = r7.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00af, code lost:
        if (r2 == p000X.AnonymousClass0SX.SIGQUIT_RECEIVED_AM_UNCONFIRMED_MT_BLOCKED) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b1, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b4, code lost:
        if (r2 != p000X.AnonymousClass0SX.NO_SIGQUIT_AM_CONFIRMED_MT_BLOCKED) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b6, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b7, code lost:
        if (r4 == null) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b9, code lost:
        if (r5 == false) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bb, code lost:
        if (r1 == false) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bd, code lost:
        if (r10 != false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00bf, code lost:
        if (r9 != false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c1, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c2, code lost:
        r4.A02(r2, r3, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c5, code lost:
        if (r1 == false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c7, code lost:
        r7.A0I = r9;
        r7.A0J = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00cd, code lost:
        if (r7.A0L != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00cf, code lost:
        r1 = r7.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d3, code lost:
        if (r1 == p000X.AnonymousClass0SX.SIGQUIT_RECEIVED_AM_UNCONFIRMED_MT_BLOCKED) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d7, code lost:
        if (r1 != p000X.AnonymousClass0SX.NO_SIGQUIT_AM_CONFIRMED_MT_BLOCKED) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d9, code lost:
        p000X.AnonymousClass0DB.A0E(r7.A09, "Posting main thread check");
        r7.A0L = true;
        p000X.AnonymousClass0ZA.A0E(r7.A0N.A05, new p000X.AnonymousClass023(r7), 1705381466);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f3, code lost:
        r10 = r4.A05();
        r9 = r4.A04();
        r0 = r7.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fd, code lost:
        if (r10 != false) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ff, code lost:
        if (r9 != false) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0101, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0102, code lost:
        r4.A02(r0, r3, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0106, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0108, code lost:
        r0 = p000X.AnonymousClass0SX.NO_ANR_DETECTED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x010b, code lost:
        r0 = p000X.AnonymousClass0SX.SIGQUIT_RECEIVED_AM_UNCONFIRMED_MT_BLOCKED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x010e, code lost:
        r0 = p000X.AnonymousClass0SX.SIGQUIT_RECEIVED_AM_CONFIRMED_MT_UNBLOCKED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0113, code lost:
        r7.A08 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        return;
     */
    public final void A04(AnonymousClass027 r8, boolean z, boolean z2) {
        AnonymousClass0SX r0;
        AnonymousClass0DB.A0K(this.A09, "Transitioning from %s event %s inFgV1: %b inFgV2: %b", this.A08, r8, Boolean.valueOf(z), Boolean.valueOf(z2));
        AnonymousClass0SX r3 = this.A08;
        switch (r3.ordinal()) {
            case 0:
                switch (r8.ordinal()) {
                    case 0:
                        break;
                    case 1:
                        r0 = AnonymousClass0SX.NO_SIGQUIT_AM_CONFIRMED_MT_BLOCKED;
                        break;
                    case 3:
                        break;
                }
            case 3:
                switch (r8.ordinal()) {
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
                        r0 = AnonymousClass0SX.SIGQUIT_RECEIVED_AM_EXPIRED_MT_BLOCKED;
                        break;
                    case 3:
                        r0 = AnonymousClass0SX.SIGQUIT_RECEIVED_AM_UNCONFIRMED_MT_UNBLOCKED;
                        break;
                }
            case 4:
                switch (r8.ordinal()) {
                    case 3:
                        break;
                    case 4:
                        break;
                }
            case 5:
                if (r8.ordinal() == 4) {
                    this.A08 = AnonymousClass0SX.NO_ANR_DETECTED;
                    break;
                }
            case 6:
                switch (r8.ordinal()) {
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                }
            case 7:
                switch (r8.ordinal()) {
                    case 0:
                        break;
                    case 1:
                        break;
                    case 3:
                        break;
                }
            case 8:
                switch (r8.ordinal()) {
                    case 0:
                        break;
                    case 3:
                        r0 = AnonymousClass0SX.NO_SIGQUIT_AM_CONFIRMED_MT_UNBLOCKED;
                        break;
                    case 4:
                        break;
                }
            case 9:
                switch (r8.ordinal()) {
                    case 0:
                        break;
                    case 4:
                        break;
                }
            default:
                throw new IllegalStateException("Unknown state: " + r3);
        }
    }

    public final void ApJ(boolean z) {
        boolean z2;
        AnonymousClass02K r2 = this.A0O;
        C021801j r1 = this.A0N;
        C022201n r0 = this.A06;
        if (r0 != null) {
            z2 = r0.Bma();
        } else {
            z2 = r1.A0C;
        }
        r2.init(r1, z2);
        this.A0O.installSignalHandler(this.A0M, z);
    }

    public final void B6o(boolean z) {
        synchronized (this.A0Q) {
        }
    }

    public final void Bom(String str, String str2, boolean z, boolean z2) {
        AnonymousClass0DB.A0E(this.A09, "On sigquitDetected call");
        synchronized (this.A0Q) {
            if (this.A0H) {
                AnonymousClass0ZA.A0E(this.A0M, new AnonymousClass021(this, str2, SystemClock.uptimeMillis(), str, z, z2), -1213203030);
            }
        }
    }

    public final void pause() {
        AnonymousClass0DB.A0E(this.A09, "Cannot pause ANR detector.");
    }

    public final void start() {
        C022301o r0;
        synchronized (this.A0Q) {
            if (!this.A0H) {
                AnonymousClass0DB.A0E(this.A09, "Starting");
                this.A0H = true;
                this.A02 = SystemClock.uptimeMillis();
                this.A07.A02(this.A0T, 4000);
                C021801j r1 = this.A0N;
                if (r1.A02 >= 0 && (r0 = r1.A00) != null) {
                    AnonymousClass0ZA.A0E(this.A0M, new AnonymousClass020(this, r0), 1016029526);
                }
            }
        }
    }

    public MultiSignalANRDetector(C021801j r8) {
        AnonymousClass02K r0;
        this.A0N = r8;
        if (r8.A0D) {
            if (SigquitDetectorLacrima.sInstance == null) {
                SigquitDetectorLacrima.sInstance = new SigquitDetectorLacrima(this);
            }
            r0 = SigquitDetectorLacrima.sInstance;
        } else {
            if (SigquitDetectorAcra.sInstance == null) {
                SigquitDetectorAcra.sInstance = new SigquitDetectorAcra(this);
            }
            r0 = SigquitDetectorAcra.sInstance;
        }
        this.A0O = r0;
        this.A08 = AnonymousClass0SX.NO_ANR_DETECTED;
        this.A07 = new AnonymousClass02E(r8.A04, r8.A09, 500, true, 0, 0);
        HandlerThread handlerThread = new HandlerThread("MultiSignalANRDetectorThread");
        this.A0S = handlerThread;
        handlerThread.start();
        this.A0M = new Handler(this.A0S.getLooper());
    }

    public final void BfW(C022201n r1) {
        this.A06 = r1;
    }
}
