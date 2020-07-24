package p000X;

import android.os.SystemClock;

/* renamed from: X.C6D */
public final class C6D implements C06570Po {
    public C6E A00;
    public C6E A01;
    public C6E A02;
    public final AnonymousClass00B A03;
    public final C06180Ob A04;
    public final C6F A05;
    public final C11960fx A06;

    public static synchronized C6D A00(AnonymousClass0C1 r2) {
        C6D c6d;
        Class<C6D> cls = C6D.class;
        synchronized (cls) {
            c6d = (C6D) r2.AVA(cls, new C6C());
        }
        return c6d;
    }

    public static void A01(C6D c6d) {
        String str;
        String str2;
        while (true) {
            C6E c6e = c6d.A00;
            C6E c6e2 = c6d.A01;
            if (!c6e.equals(c6e2)) {
                C6E c6e3 = c6d.A02;
                C6E.A00(c6e3, c6e);
                C6E.A00(c6e, c6e2);
                if (!c6e.A08) {
                    int i = c6e.A00;
                    if (i == 0) {
                        continue;
                    } else if (i == 1 || i == 2) {
                        if (c6e3.A00 == 0) {
                            if (i == 1) {
                                str2 = "coldstart";
                            } else {
                                str2 = "warmstart";
                            }
                            c6d.A02(str2, c6e.A06);
                        } else if (!c6e3.A09 && c6e.A09) {
                            c6d.A02("user_session_started", SystemClock.uptimeMillis());
                        }
                        C6E c6e4 = c6d.A01;
                        c6e4.A08 = true;
                        c6e4.A02 = c6d.A00.A04;
                    } else {
                        throw new IllegalStateException(AnonymousClass000.A05("Not supported startup type: ", i));
                    }
                } else {
                    if (c6e.A09) {
                        int i2 = c6e.A00;
                        if (i2 == 0) {
                            str = "app_background";
                        } else if (i2 == 1 || i2 == 2) {
                            long j = c6e.A04;
                            if (j == -1) {
                                continue;
                            } else {
                                int i3 = c6e.A01;
                                if (i3 != 1) {
                                    if (i3 == 2) {
                                        long j2 = c6e.A02;
                                        if (j2 == -1 || j2 < j) {
                                            c6d.A03.markerAnnotate(20119557, "end_reason", "snapshot");
                                            c6d.A03.markerEnd(20119557, 2, SystemClock.uptimeMillis());
                                            c6d.A01.A08 = false;
                                        }
                                    } else if (i3 != 3) {
                                        throw new IllegalStateException(AnonymousClass000.A05("Illegal Iris sequence id source: ", i3));
                                    }
                                }
                                C6E c6e5 = c6d.A00;
                                if (c6e5.A07) {
                                    long j3 = c6e5.A04;
                                    if (j3 >= c6e5.A05) {
                                        if (j3 <= Math.max(c6e5.A02, c6e5.A03)) {
                                            str = "nothing_new";
                                        } else {
                                            str = "delta_received";
                                        }
                                    }
                                }
                            }
                        } else {
                            throw new IllegalStateException(AnonymousClass000.A05("Not supported startup type: ", i2));
                        }
                    } else if (c6e3.A09) {
                        str = "user_session_ended";
                    }
                    c6d.A03.markerAnnotate(20119557, "end_reason", str);
                    c6d.A03.markerEnd(20119557, 2, SystemClock.uptimeMillis());
                    c6d.A01.A08 = false;
                }
            } else {
                return;
            }
        }
    }

    private void A02(String str, long j) {
        this.A03.markerStart(20119557, 0, j);
        this.A03.markerAnnotate(20119557, "startup_type", str);
        this.A03.markerAnnotate(20119557, "is_badge_only", false);
    }

    public final void onUserSessionWillEnd(boolean z) {
        this.A01.A09 = false;
        A01(this);
        C11960fx r0 = this.A06;
        r0.A06.remove(this.A05);
    }

    public C6D(C06180Ob r5, C11960fx r6, AnonymousClass00B r7) {
        C6F c6f = new C6F(this);
        this.A05 = c6f;
        this.A04 = r5;
        this.A06 = r6;
        this.A03 = r7;
        C6E c6e = new C6E(r6.A00.A00);
        this.A00 = c6e;
        this.A01 = new C6E(c6e);
        this.A02 = new C6E(c6e);
        if (!r6.A06.contains(c6f)) {
            r6.A06.add(c6f);
            C11960fx.A01(r6, c6f);
        }
    }
}
