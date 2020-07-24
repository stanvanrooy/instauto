package p000X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.instagram.debug.devoptions.apiperf.DebugHeadPlugin;
import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.19q  reason: invalid class name and case insensitive filesystem */
public final class C256419q extends C256219o implements AnonymousClass19r, C256519s, C256619t {
    public static boolean A09;
    public static boolean A0A;
    public int A00;
    public C30711Ux A01;
    public Integer A02;
    public Runnable A03;
    public int A04;
    public final Context A05;
    public final AnonymousClass00B A06;
    public final AnonymousClass1VG A07;
    public final AnonymousClass0C1 A08;

    public static void A00(C256419q r8, C255119b r9, int i) {
        boolean z = false;
        if (i == 0) {
            z = true;
        }
        int ALs = r9.ALs();
        int AOh = r9.AOh();
        int count = r9.getCount() - 1;
        if (z) {
            boolean z2 = false;
            if (ALs == 0) {
                z2 = true;
            }
            if (z2) {
                r8.A01.A0D.A08 = "top_of_list_view";
            } else {
                boolean z3 = false;
                if (AOh == count) {
                    z3 = true;
                }
                if (z3) {
                    r8.A01.A0D.A08 = "end_of_list_view";
                } else {
                    r8.A01.A0D.A08 = "mid_of_list_view";
                }
            }
        }
        r8.A0A(z);
        if (!z) {
            boolean z4 = false;
            if (ALs == 0) {
                z4 = true;
            }
            if (z4) {
                r8.A01.A01("top_of_list_view");
            } else {
                boolean z5 = false;
                if (AOh == count) {
                    z5 = true;
                }
                if (z5) {
                    r8.A01.A01("end_of_list_view");
                } else {
                    r8.A01.A01("mid_of_list_view");
                }
            }
            C25791Ai r1 = C25791Ai.A06;
            if (r1 != null && r1.A05) {
                r1.A04 = true;
            }
        }
    }

    public final void Ar3(int i, int i2, Intent intent) {
    }

    public final void AyU() {
    }

    public final void Ayk(View view) {
    }

    public final void Azd() {
    }

    public final void Azh() {
    }

    public final void BDU(int i, int i2) {
    }

    public final void BDW(int i) {
    }

    public final void BDX(int i) {
    }

    public final void BDi(int i, int i2) {
    }

    public final void BJx() {
    }

    public final void BKp(Bundle bundle) {
    }

    public final void BP6() {
    }

    public final void BQW(int i, int i2) {
    }

    public final void BVf(View view, Bundle bundle) {
    }

    public final void BVp(View view) {
    }

    public final void BVv(Bundle bundle) {
    }

    public final void onStart() {
    }

    public final void A30(AnonymousClass00B r3, int i, int i2) {
        String str;
        Integer num = this.A02;
        if (num != null) {
            if (1 - num.intValue() != 0) {
                str = "list";
            } else {
                str = "grid";
            }
            r3.markerAnnotate(i, i2, "feed_mode", str);
        }
    }

    public final void A31(AnonymousClass0P4 r6) {
        String str;
        C16810pC r2 = C16810pC.A00;
        boolean z = false;
        if (r2 != null) {
            z = true;
        }
        if (z) {
            boolean A032 = r2.A03(this.A08, this.A05);
            String str2 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            String str3 = "0";
            if (A032) {
                str3 = str2;
            }
            r6.A0G("is_vc_on", str3);
            if (!C16810pC.A00.A04(this.A08, this.A05)) {
                str2 = "0";
            }
            r6.A0G("is_minimized_viewer_on", str2);
        }
        Integer num = this.A02;
        if (num != null) {
            if (1 - num.intValue() != 0) {
                str = "list";
            } else {
                str = "grid";
            }
            r6.A0G("feed_mode", str);
        }
    }

    public final void BE0() {
        C30711Ux r2 = this.A01;
        r2.A0D.A08 = "on_pause";
        C30711Ux.A00(r2, false);
        A01(true);
        this.A07.A00(true);
    }

    private void A01(boolean z) {
        if (!z) {
            this.A06.markerStart(23592980);
        } else {
            this.A06.markerEnd(23592980, 2);
        }
    }

    public final void A08(C255119b r4, int i) {
        int i2;
        int A032 = AnonymousClass0Z0.A03(996156292);
        if (!A0A || i != 2) {
            if (C256219o.A06 || !A09 || !r4.AgC()) {
                A00(this, r4, i);
            } else {
                if (i == 0 && this.A03 == null && this.A00 == 2) {
                    AnonymousClass2XU r1 = new AnonymousClass2XU(this, r4);
                    this.A03 = r1;
                    r4.AaK().postOnAnimation(r1);
                } else {
                    Runnable runnable = this.A03;
                    if (runnable != null) {
                        r4.AaK().removeCallbacks(runnable);
                        this.A03 = null;
                    }
                    A00(this, r4, i);
                }
                this.A00 = i;
            }
            i2 = 323201153;
        } else {
            i2 = -769652546;
        }
        AnonymousClass0Z0.A0A(i2, A032);
    }

    public final void A09(C255119b r5, int i, int i2, int i3, int i4, int i5) {
        C480526l r0;
        C480526l r1;
        int A032 = AnonymousClass0Z0.A03(384942584);
        if (r5.AgC()) {
            int i6 = this.A04;
            if (i != i6) {
                C30711Ux r02 = this.A01;
                if (i > i6) {
                    r1 = C480526l.DOWN;
                } else {
                    r1 = C480526l.UP;
                }
                r02.A0D.A07 = r1;
            }
            this.A04 = i;
        } else {
            AnonymousClass1V6 r2 = this.A01.A0D;
            r2.A01 += i4;
            r2.A02 += i5;
            if (i4 != 0) {
                if (i4 > 0) {
                    r0 = C480526l.RIGHT;
                } else {
                    r0 = C480526l.LEFT;
                }
            } else if (i5 != 0) {
                if (i5 > 0) {
                    r0 = C480526l.DOWN;
                } else {
                    r0 = C480526l.UP;
                }
            }
            r2.A07 = r0;
        }
        AnonymousClass0Z0.A0A(-2008928340, A032);
    }

    public final void A0A(boolean z) {
        int A032 = AnonymousClass0Z0.A03(21450523);
        this.A01.A02(z);
        A01(z);
        this.A07.A00(z);
        AnonymousClass0Z0.A0A(-1912333253, A032);
    }

    public final void BLD(float f, float f2, C32501bN r7) {
        C480526l r1;
        int A032 = AnonymousClass0Z0.A03(-1474912393);
        C30711Ux r2 = this.A01;
        if (f < f2) {
            r1 = C480526l.LEFT;
        } else {
            r1 = C480526l.RIGHT;
        }
        r2.A0D.A07 = r1;
        AnonymousClass0Z0.A0A(-153629500, A032);
    }

    public final void BLO(C32501bN r4, C32501bN r5) {
        int A032 = AnonymousClass0Z0.A03(-1221069828);
        boolean z = false;
        if (r4 == C32501bN.IDLE) {
            z = true;
        }
        this.A01.A02(z);
        A01(z);
        this.A07.A00(z);
        AnonymousClass0Z0.A0A(652562996, A032);
    }

    public C256419q(Activity activity, AnonymousClass0C1 r3, AnonymousClass0RN r4) {
        this(activity, r3, r4, 23592961);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0081, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r0, p000X.AnonymousClass0L7.STORIES_LAST_FRAME_CHECK, "enable_frame_check_on_stop", false, (p000X.AnonymousClass04H) null)).booleanValue() == false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003c, code lost:
        if (p000X.C22270y8.A01().A08(r3, false) == false) goto L_0x003e;
     */
    public C256419q(Activity activity, AnonymousClass0C1 r29, AnonymousClass0RN r30, int i) {
        this.A04 = 0;
        AnonymousClass0C1 r0 = r29;
        AnonymousClass0RU A012 = AnonymousClass0WN.A01(r0);
        C252117x A022 = C252117x.A02();
        C30731Uz r13 = null;
        Activity activity2 = activity;
        if (C05770Lw.A00().A0L()) {
            if (C22270y8.A00 != null) {
                C22270y8 A013 = C22270y8.A01();
                C22470yU r3 = C22470yU.DEVELOPER_OPTIONS;
                if (!A013.A07(r3)) {
                }
            }
            if (DebugHeadPlugin.sInstance == null) {
                try {
                    DebugHeadPlugin.setInstance((DebugHeadPlugin) Class.forName("com.instagram.debug.devoptions.debughead.DebugHeadPluginImpl").newInstance());
                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
                }
            }
            r13 = DebugHeadPlugin.sInstance.getDebugHeadDropFrameListener(activity2);
        }
        AnonymousClass0L7 r32 = AnonymousClass0L7.DROPFRAME_MANAGER;
        boolean booleanValue = ((Boolean) AnonymousClass0L6.A02(r0, r32, "is_enabled", false, (AnonymousClass04H) null)).booleanValue();
        boolean booleanValue2 = ((Boolean) AnonymousClass0L6.A02(r0, r32, "should_drop_event", false, (AnonymousClass04H) null)).booleanValue();
        int i2 = i;
        boolean z = i2 == 23592973;
        boolean z2 = i2 == 23592966 ? true : z2;
        z2 = false;
        boolean booleanValue3 = ((Boolean) AnonymousClass0L6.A02(r0, AnonymousClass0L7.IG4A_FPS_TRACKER_NEW, "enable_fps_tracker", false, (AnonymousClass04H) null)).booleanValue();
        AnonymousClass0L7 r4 = AnonymousClass0L7.SCROLL_PERF_LOGGING;
        int intValue = ((Integer) AnonymousClass0L6.A02(r0, r4, "session_sample_rate_alpha", 1, (AnonymousClass04H) null)).intValue();
        int intValue2 = ((Integer) AnonymousClass0L6.A02(r0, r4, "session_sample_rate_beta", 5, (AnonymousClass04H) null)).intValue();
        int intValue3 = ((Integer) AnonymousClass0L6.A02(r0, r4, "session_sample_rate_prod", 100, (AnonymousClass04H) null)).intValue();
        if (r13 == null) {
            r13 = C30711Ux.A0N;
        } else {
            C30711Ux.A0M = true;
        }
        Context applicationContext = activity2.getApplicationContext();
        if (AnonymousClass1V0.A04 == null) {
            AnonymousClass1V0.A04 = new AnonymousClass1V0();
        }
        AnonymousClass1V0 r11 = AnonymousClass1V0.A04;
        AnonymousClass00B r12 = AnonymousClass00B.A01;
        AnonymousClass1V2 r14 = new AnonymousClass1V2(activity2);
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        if (AnonymousClass1V5.A00 <= 0) {
            AnonymousClass1V5.A00 = applicationContext.getResources().getDisplayMetrics().densityDpi;
        }
        AnonymousClass0RN r1 = r30;
        this.A01 = new C30711Ux(applicationContext, r1, this, i2, r11, r12, r13, r14, awakeTimeSinceBootClock, A012, A022, booleanValue, booleanValue2, z, z2, booleanValue3, AnonymousClass1V5.A00, intValue, intValue2, intValue3);
        this.A05 = activity2.getApplicationContext();
        this.A08 = r0;
        AnonymousClass00B r2 = AnonymousClass00B.A01;
        this.A06 = r2;
        this.A07 = new AnonymousClass1VG(r1, r2);
    }
}
