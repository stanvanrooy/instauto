package p000X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PowerManager;
import android.os.SystemClock;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.BaseViewManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.1y6  reason: invalid class name and case insensitive filesystem */
public final class C45541y6 implements C45551y7, C45561y8, C45571y9, C45581yA, C45591yB, C45601yC, C45611yD, C45621yE, C45631yF, C45641yG, C45651yH, C45661yI {
    public static final EnumSet A0Z = EnumSet.of(C36341ht.PLAYING, C36341ht.PAUSED, C36341ht.STOPPING);
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public PowerManager.WakeLock A09;
    public C45741yQ A0A;
    public C45911ym A0B;
    public C36341ht A0C;
    public AnonymousClass1RT A0D;
    public C45901yl A0E;
    public String A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public View A0M;
    public C45681yK A0N = C45681yK.FILL;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public final Context A0R;
    public final Handler A0S;
    public final AnonymousClass0C1 A0T;
    public final C45721yO A0U;
    public final C45671yJ A0V = new C45671yJ(this);
    public final Runnable A0W;
    public final Runnable A0X;
    public final BSK A0Y;

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0077, code lost:
        if (r11.A0L != false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r2.A0B.A01 == false) goto L_0x001c;
     */
    public final void BFK(C45741yQ r12, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        this.A0G = false;
        C45741yQ r1 = this.A0A;
        if (!(r1 == null || this.A0E == null)) {
            boolean A0e = r1.A0e();
            this.A0L = A0e;
            C45901yl r2 = this.A0E;
            if (A0e) {
                z3 = true;
            }
            z3 = false;
            r2.A05 = z3;
        }
        if (this.A0C == C36341ht.PREPARING && this.A0E != null) {
            A06(C36341ht.PREPARED);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C45901yl r3 = this.A0E;
            long j2 = elapsedRealtime - r3.A09;
            try {
                int i = r3.A08;
                if (i > 0) {
                    C37671k2 r13 = r3.A0A;
                    if (this.A0K || (r13 != null && r13.A0D)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        this.A0A.A0T(i);
                    }
                }
                if (this.A0E.A0D) {
                    A08(false);
                }
            } catch (IllegalStateException unused) {
                this.A0D.BV5(this.A0E.A0B);
            }
            C45901yl r22 = this.A0E;
            if (r22.A0D) {
                C45721yO r32 = this.A0U;
                C45881yj r14 = r22.A0B;
                Object obj = r14.A03;
                if (!r22.A02) {
                    z = false;
                }
                z = true;
                r32.Bd3(obj, j2, z, this.A0L, r22.A07, A00(r14));
            }
            this.A0D.BVA(this.A0E.A0B);
        }
    }

    private C45941ys A00(C45881yj r8) {
        return A01(r8, this.A08, this.A05, this.A02, A0A(), r8.A01);
    }

    private C45941ys A01(C45881yj r27, int i, int i2, int i3, int i4, boolean z) {
        Float f;
        int i5;
        boolean z2;
        int i6;
        String str;
        C45741yQ r0;
        C45911ym r02 = this.A0B;
        Float f2 = null;
        if (r02 != null) {
            f2 = Float.valueOf((float) r02.A03().getWidth());
            f = Float.valueOf((float) this.A0B.A03().getHeight());
        } else {
            f = null;
        }
        C45881yj r2 = r27;
        int i7 = r2.A02;
        if (!A09(this) || (r0 = this.A0A) == null) {
            i5 = -1;
        } else {
            i5 = r0.A08();
        }
        int i8 = this.A01;
        int A0B2 = A0B();
        C45901yl r03 = this.A0E;
        if (r03 != null) {
            z2 = r03.A05;
        } else {
            z2 = false;
        }
        if (r03 == null) {
            i6 = -1;
        } else {
            i6 = r03.A04;
        }
        String A0I2 = this.A0A.A0I();
        String str2 = this.A0F;
        Boolean bool = r2.A00;
        int i9 = this.A0R.getResources().getConfiguration().orientation;
        if (i9 == 1) {
            str = "portrait";
        } else if (i9 != 2) {
            str = null;
        } else {
            str = "landscape";
        }
        return new C45941ys(i7, i4, i3, i5, i8, A0B2, i, i2, -1, -1, z, z2, i6, A0I2, str2, bool, f2, f, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        if (r1.equals("feed_timeline") == false) goto L_0x002e;
     */
    private void A02() {
        boolean z;
        C45901yl r0 = this.A0E;
        if (r0 != null && r0.A0A != null) {
            AnonymousClass0C1 r3 = this.A0T;
            AnonymousClass0L7 r2 = AnonymousClass0L7.LAUNCHER_VIDEO_CANCELLATION_ON_RELEASE;
            if (((Boolean) AnonymousClass0L6.A02(r3, r2, "exclude_main_feed", false, (AnonymousClass04H) null)).booleanValue() && (r1 = this.A0F) != null) {
                z = true;
            }
            z = false;
            if (z) {
                return;
            }
            if (((Boolean) AnonymousClass0L6.A02(this.A0T, r2, "should_cancel", false, (AnonymousClass04H) null)).booleanValue()) {
                C40291oQ.A00().A01(this.A0E.A0A.A05);
            } else if (((Boolean) AnonymousClass0L6.A02(this.A0T, r2, "should_set_offscreen", false, (AnonymousClass04H) null)).booleanValue()) {
                C40291oQ.A00().A03(this.A0E.A0A.A05, false);
            }
        }
    }

    private void A03() {
        C45901yl r3 = this.A0E;
        C45741yQ r0 = this.A0A;
        if (r3 != null && r0 != null) {
            this.A0U.Bcw(r3.A0B.A03, r0.A0C());
        }
    }

    private void A04() {
        ViewGroup viewGroup;
        C45911ym r0 = this.A0B;
        if (r0 != null) {
            View A032 = r0.A03();
            if (A032 != null) {
                viewGroup = (ViewGroup) A032.getParent();
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                viewGroup.removeView(A032);
            }
        }
    }

    private void A06(C36341ht r2) {
        this.A0C = r2;
        BSK bsk = this.A0Y;
        if (bsk != null) {
            bsk.A00 = r2;
        }
    }

    private void A08(boolean z) {
        C45901yl r0;
        this.A0A.A0b(this.A0P);
        this.A0A.A0Q();
        C36341ht r2 = this.A0C;
        C36341ht r1 = C36341ht.PREPARED;
        if (r2 == r1 || r2 == C36341ht.PAUSED) {
            if (r2 == r1 && (r0 = this.A0E) != null) {
                this.A02 = r0.A08;
            } else if (!z) {
                this.A02 = A0A();
            }
            C45901yl r12 = this.A0E;
            if (r12 != null) {
                r12.A04 = 0;
            }
        }
        A06(C36341ht.PLAYING);
        AnonymousClass0ZA.A0B(this.A0V, 2);
    }

    public static boolean A09(C45541y6 r5) {
        C45901yl r0;
        if (!((Boolean) AnonymousClass0L6.A02(r5.A0T, AnonymousClass0L7.NEW_REEL_VIDEO_PLAYER_LAUNCHER, "enabled", false, (AnonymousClass04H) null)).booleanValue() || (r0 = r5.A0E) == null) {
            return false;
        }
        Object obj = r0.A0B.A03;
        if (!(obj instanceof C39941no)) {
            return false;
        }
        C39941no r1 = (C39941no) obj;
        if (r1.A0n() || r1.A0o()) {
            return true;
        }
        return false;
    }

    public final int A0A() {
        C36341ht r2 = this.A0C;
        if (r2 == C36341ht.IDLE || r2 == C36341ht.PREPARING || this.A0A == null) {
            return 0;
        }
        if (A09(this)) {
            return this.A0A.A0D();
        }
        int A082 = this.A0A.A08();
        if (A082 > 86400000) {
            return 0;
        }
        return A082;
    }

    public final int A0B() {
        return this.A0A.A09();
    }

    public final void A0C() {
        C45901yl r3 = this.A0E;
        if (r3 != null && this.A0C == C36341ht.PLAYING) {
            C45721yO r2 = this.A0U;
            C45881yj r0 = r3.A0B;
            r2.Bd6(r0.A03, A00(r0));
        }
    }

    public final void A0N(boolean z) {
        this.A0P = z;
        this.A0A.A0b(z);
    }

    public final boolean A0O() {
        return A0Z.contains(this.A0C);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r1.equals("feed_timeline") == false) goto L_0x001d;
     */
    public final boolean A0P(C45911ym r6, Object obj) {
        boolean z;
        C45741yQ r4 = this.A0A;
        if (r4 == null) {
            this.A0D.BQL();
            return true;
        }
        if (obj instanceof C40691p4) {
            String str = this.A0F;
            if (str != null) {
                z = true;
            }
            z = false;
            if (z && this.A0O) {
                C40701p5.A00((C40691p4) obj);
                this.A0D.BQL();
                return false;
            }
        }
        if (obj instanceof SurfaceTexture) {
            r4.A0a(new AnonymousClass23X(this, r6, obj));
            return false;
        }
        r4.A0a((Runnable) null);
        this.A0D.BQL();
        return true;
    }

    public final void Aqh(C60222jW r2) {
        this.A0U.Bby(r2);
    }

    public final void AsU() {
        C45901yl r1 = this.A0E;
        if (r1 != null) {
            r1.A05 = true;
        }
    }

    public final void Ato(C45741yQ r4, int i) {
        C45901yl r0 = this.A0E;
        if (r0 != null) {
            C45721yO r2 = this.A0U;
            C45881yj r02 = r0.A0B;
            r2.Bcq(r02.A03, i, A00(r02));
        }
    }

    public final void Atq(C45741yQ r5) {
        C45901yl r0 = this.A0E;
        if (r0 != null) {
            C45721yO r3 = this.A0U;
            C45881yj r02 = r0.A0B;
            r3.Bcr(r02.A03, A00(r02), this.A0A.A0J());
        }
    }

    public final void Axp(C45741yQ r2) {
        this.A0D.Axl();
    }

    public final void Ayu(C45741yQ r2, List list) {
        this.A0D.Ayv(list);
    }

    public final void AzJ(int i, int i2, int i3, int i4, String str) {
        C45901yl r0 = this.A0E;
        if (r0 != null) {
            this.A0U.BcC(r0.A0B.A03, i, i2, i3, i4, str);
        }
    }

    public final void B0x(C45741yQ r15, String str, int i, int i2, int i3, String str2) {
        C45901yl r0 = this.A0E;
        if (r0 != null) {
            C45721yO r7 = this.A0U;
            C45881yj r1 = r0.A0B;
            int i4 = i;
            String str3 = str;
            String str4 = str2;
            int i5 = i4;
            r7.Bcs(r1.A03, str3, Math.round((float) i3), i5, str4, A01(r1, i4, i2, this.A02, A0A(), this.A0E.A0B.A01));
        }
    }

    public final void B2f(C45741yQ r7, String str, String str2) {
        AnonymousClass0DB.A0D("VideoPlayerImpl", AnonymousClass000.A0N("MediaPlayer Error: ", str, " ", str2));
        if (this.A0A == null || !((Boolean) AnonymousClass0L6.A02(this.A0T, AnonymousClass0L7.VIDEO_RETRY_LAUNCHER, "feature_enabled", false, (AnonymousClass04H) null)).booleanValue() || this.A06 >= this.A07) {
            C45901yl r0 = this.A0E;
            if (r0 != null) {
                this.A0U.Bct(r0.A0B.A03, str, str2);
                this.A0D.BV5(this.A0E.A0B);
                A0M("error", true);
                return;
            }
            return;
        }
        this.A0A.A0P();
        this.A06++;
    }

    public final void BAK(C45741yQ r5) {
        C45901yl r1 = this.A0E;
        if (r1 != null) {
            r1.A04++;
            this.A0D.BAJ();
            C45721yO r3 = this.A0U;
            C45901yl r12 = this.A0E;
            C45881yj r0 = r12.A0B;
            r3.Bcv(r0.A03, r12.A07, A00(r0));
        }
    }

    public final void BFM(C45741yQ r5) {
        C45901yl r0 = this.A0E;
        if (r0 != null) {
            this.A0U.Bcz(r0.A0B.A03, A0A(), A00(this.A0E.A0B));
        }
    }

    public final void BUu(C45741yQ r3, boolean z) {
        C45901yl r0 = this.A0E;
        if (r0 != null) {
            r0.A02 = z;
            this.A0U.Bcu(r0.A0B.A03, z);
        }
    }

    public final void BVR(C45741yQ r2, int i, int i2) {
        C45911ym r0 = this.A0B;
        if (r0 != null) {
            r0.A06(i, i2);
        }
        this.A08 = i;
        this.A05 = i2;
        AnonymousClass1RT r02 = this.A0D;
        if (r02 != null) {
            r02.BVO(i, i2);
        }
    }

    public final void BWG(C45741yQ r3, String str, String str2) {
        AnonymousClass0DB.A0D("VideoPlayerImpl", AnonymousClass000.A0N("MediaPlayer Warning: ", str, " ", str2));
        C45901yl r0 = this.A0E;
        if (r0 != null) {
            this.A0U.Bd8(r0.A0B.A03, str, str2);
        }
    }

    public C45541y6(Context context, AnonymousClass1RT r9, AnonymousClass0C1 r10, AnonymousClass1RY r11) {
        C45721yO r0;
        int i;
        boolean z = true;
        this.A0I = true;
        this.A0G = true;
        this.A0K = false;
        this.A01 = -1;
        this.A06 = 0;
        this.A0W = new C45691yL(this);
        this.A0X = new C45701yM(this);
        this.A0R = context;
        this.A0D = r9;
        if (r11 != null) {
            r0 = new C45711yN(r11, r10);
        } else {
            r0 = new C1897088t();
        }
        this.A0U = r0;
        this.A0C = C36341ht.IDLE;
        if (((Boolean) AnonymousClass0L6.A02(r10, AnonymousClass0L7.ANALYTICS_MULTI_BATCH, "video_state_aggregator_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            BSI bsi = (BSI) r10.AVA(BSI.class, new BSJ());
            BSK bsk = new BSK(bsi);
            bsi.A00.add(new WeakReference(bsk));
            this.A0Y = bsk;
        }
        C45731yP r02 = new C45731yP(context, r10);
        this.A0A = r02;
        r02.A0B = this;
        r02.A0A = this;
        r02.A0E = this;
        r02.A07 = this;
        r02.A03 = this;
        r02.A08 = this;
        r02.A04 = this;
        r02.A0F = this;
        r02.A02 = this;
        r02.A05 = this;
        r02.A0D = this;
        r02.A06 = this;
        r02.A09 = this;
        this.A09 = AnonymousClass0ZP.A00((PowerManager) this.A0R.getSystemService("power"), 10, "IgVideoPlayerlockTag");
        this.A0T = r10;
        if (((Boolean) AnonymousClass0L6.A02(r10, AnonymousClass0L7.VIDEO_SCRUBBER, "is_organic_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            i = ((Integer) AnonymousClass0L6.A02(r10, AnonymousClass0L7.VIDEO_SCRUBBER, "progress_update_interval_ms", 100, (AnonymousClass04H) null)).intValue();
        } else {
            i = 100;
        }
        this.A04 = i;
        this.A03 = 100;
        boolean booleanValue = ((Boolean) AnonymousClass0L6.A02(r10, AnonymousClass0L7.VIDEO_FIT_SCALE_TYPE_IGTV, "is_enabled", false, (AnonymousClass04H) null)).booleanValue();
        this.A0Q = booleanValue;
        C45851yg.A00 = booleanValue;
        HandlerThread handlerThread = new HandlerThread("VideoPlayerWorkerThread");
        handlerThread.start();
        this.A0S = new Handler(handlerThread.getLooper());
        if (C05770Lw.A00().A00.getBoolean("show_player_debug", false) || ((Boolean) C05640Lj.A00(AnonymousClass0L7.VIDEO_DEBUG_OVERLAY, "is_enabled", false)).booleanValue()) {
            this.A0M = this.A0A.A0H();
        }
        this.A0O = (!((Boolean) AnonymousClass0L6.A02(this.A0T, AnonymousClass0L7.VIDEO_PALYER_WARMUP_SURFACE_REUSE, "is_enabled", false, (AnonymousClass04H) null)).booleanValue() || !((Boolean) AnonymousClass0L6.A02(this.A0T, AnonymousClass0L7.VIDEO_PALYER_WARMUP_SURFACE_REUSE, "is_enabled_for_feed", false, (AnonymousClass04H) null)).booleanValue()) ? false : z;
        this.A07 = ((Integer) AnonymousClass0L6.A02(this.A0T, AnonymousClass0L7.VIDEO_RETRY_LAUNCHER, "video_retry_limit", 0, (AnonymousClass04H) null)).intValue();
    }

    private void A05(C31841a5 r8, boolean z, int i) {
        int i2;
        C45901yl r5;
        boolean z2;
        int i3;
        ViewGroup viewGroup;
        C45911ym r0;
        View A032;
        int A033 = AnonymousClass0Z0.A03(1075643669);
        if (this.A0A == null) {
            i2 = -1352581758;
        } else {
            View view = this.A0M;
            if (view != null) {
                r8.addView(view, -1);
            }
            if (!this.A0J || (r0 = this.A0B) == null || (A032 = r0.A03()) == null || A032.getParent() != r8) {
                A04();
                if (this.A0B == null) {
                    this.A0B = C45911ym.A00(r8, this, this.A0N, this.A00, i);
                }
                boolean z3 = false;
                if (z && (r5 = this.A0E) != null) {
                    C45741yQ r4 = this.A0A;
                    C37671k2 r2 = r5.A0A;
                    String str = this.A0F;
                    if (this.A0K || (r2 != null && r2.A0D)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        i3 = r5.A08;
                    } else {
                        i3 = 0;
                    }
                    SurfaceTexture A0F2 = r4.A0F(r2, str, i3);
                    if (A0F2 != null) {
                        View A034 = this.A0B.A03();
                        if (A034 instanceof TextureView) {
                            TextureView textureView = (TextureView) A034;
                            if (i >= 0) {
                                viewGroup = (ViewGroup) textureView.getParent();
                            } else {
                                viewGroup = null;
                            }
                            if (viewGroup != null) {
                                int indexOfChild = viewGroup.indexOfChild(textureView);
                                viewGroup.removeView(textureView);
                                textureView.setSurfaceTexture(A0F2);
                                viewGroup.addView(textureView, indexOfChild);
                            } else {
                                textureView.setSurfaceTexture(A0F2);
                            }
                            z3 = true;
                        }
                    }
                }
                C45911ym r22 = this.A0B;
                if (r22.A03().getParent() != r8) {
                    r8.addView(r22.A03(), r22.A01);
                }
                if (!z3 && this.A0B.A09()) {
                    this.A0A.A0Y(this.A0B.A02());
                }
                i2 = 1109928638;
            } else {
                i2 = -1617987636;
            }
        }
        AnonymousClass0Z0.A0A(i2, A033);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (new java.io.File(r1).exists() == false) goto L_0x001c;
     */
    public static void A07(C45541y6 r10, C45901yl r11) {
        boolean z;
        C45741yQ r2;
        boolean z2;
        int i;
        C45741yQ r4;
        String str;
        C12670hC.A02();
        C45741yQ r1 = r10.A0A;
        if (r1 != null) {
            r1.A0S(r11.A06);
        }
        String str2 = r11.A0C;
        if (str2 != null) {
            z = true;
        }
        z = false;
        if (z) {
            Uri fromFile = Uri.fromFile(new File(r11.A0C));
            C45901yl r12 = r10.A0E;
            if (!(r12 == null || (r4 = r10.A0A) == null)) {
                if (r12 != null) {
                    try {
                        C37671k2 r0 = r12.A0A;
                        if (r0 != null) {
                            str = r0.A05;
                            r4.A0X(fromFile, str, true, r10.A0F, false);
                            r10.A0A.A0L();
                        }
                    } catch (IOException e) {
                        AnonymousClass0DB.A0P("VideoPlayerImpl", e, "Unable to set data source for uri %s", fromFile);
                    }
                }
                str = null;
                r4.A0X(fromFile, str, true, r10.A0F, false);
                r10.A0A.A0L();
            }
        } else {
            C37671k2 r5 = r11.A0A;
            C45901yl r42 = r10.A0E;
            if (!(r42 == null || (r2 = r10.A0A) == null)) {
                String str3 = r10.A0F;
                if (r10.A0K || (r5 != null && r5.A0D)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    i = r42.A08;
                } else {
                    i = 0;
                }
                r2.A0Z(r5, str3, i);
                r10.A0A.A0L();
            }
            AnonymousClass0ZA.A03(r10.A0V, 1, 200);
        }
        r10.A0D.BF3(r11.A0B);
    }

    public final void A0D(float f, int i) {
        int A032 = AnonymousClass0Z0.A03(1465110845);
        float max = Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, Math.min(1.0f, f));
        this.A0A.A0S(max);
        C45901yl r0 = this.A0E;
        if (r0 != null) {
            C45721yO r2 = this.A0U;
            C45881yj r6 = r0.A0B;
            Object obj = r6.A03;
            boolean z = false;
            if (Float.compare(max, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) != 0) {
                z = true;
            }
            r2.Bcp(obj, i, A01(r6, this.A08, this.A05, this.A02, A0A(), z));
        }
        AnonymousClass0Z0.A0A(-306176400, A032);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005d, code lost:
        if (r13.A0L != false) goto L_0x005f;
     */
    public final void A0E(int i, boolean z) {
        C45901yl r4;
        boolean z2;
        C45901yl r0;
        int A032 = AnonymousClass0Z0.A03(-909851177);
        if (this.A0A != null) {
            if (z && (r0 = this.A0E) != null) {
                C45941ys A002 = A00(r0.A0B);
                if (this.A0C == C36341ht.PLAYING) {
                    C45721yO r42 = this.A0U;
                    C45901yl r2 = this.A0E;
                    r42.Bcy(r2.A0B.A03, r2.A07, "seek", A002);
                }
                this.A0U.Bd1(this.A0E.A0B.A03, i, A002);
            }
            this.A0A.A0T(i);
            this.A02 = i;
            if (z && (r4 = this.A0E) != null && this.A0C == C36341ht.PLAYING) {
                r4.A04 = 0;
                C45721yO r5 = this.A0U;
                C45881yj r3 = r4.A0B;
                Object obj = r3.A03;
                if (!r4.A02) {
                    z2 = false;
                }
                z2 = true;
                r5.Bd3(obj, 0, z2, this.A0L, "resume", A00(r3));
                C45721yO r43 = this.A0U;
                C45881yj r6 = this.A0E.A0B;
                r43.Bco(r6.A03, 0, A01(r6, this.A08, this.A05, this.A02, A0A(), r6.A01));
            }
            int A0B2 = A0B();
            C45901yl r22 = this.A0E;
            if (!(r22 == null || A0B2 == 0)) {
                r22.A00 = (float) (i / A0B2);
            }
        }
        AnonymousClass0Z0.A0A(-1606438387, A032);
    }

    public final void A0F(C45681yK r3) {
        int A032 = AnonymousClass0Z0.A03(387470552);
        this.A0N = r3;
        C45911ym r0 = this.A0B;
        if (r0 != null) {
            r0.A07(r3);
        }
        AnonymousClass0Z0.A0A(-1272568895, A032);
    }

    public final void A0G(C31841a5 r3) {
        int A032 = AnonymousClass0Z0.A03(-1603291715);
        A05(r3, false, 0);
        AnonymousClass0Z0.A0A(1782384423, A032);
    }

    public final void A0H(String str) {
        int A032 = AnonymousClass0Z0.A03(1932076527);
        if (this.A0C == C36341ht.PLAYING) {
            this.A0A.A0K();
            A03();
            A06(C36341ht.PAUSED);
            C45901yl r1 = this.A0E;
            if (r1 != null) {
                C45721yO r3 = this.A0U;
                C45881yj r0 = r1.A0B;
                r3.Bcy(r0.A03, r1.A07, str, A00(r0));
                this.A0U.Bcx(this.A0E.A0B.A03);
            }
        }
        AnonymousClass0Z0.A0A(53916691, A032);
    }

    public final void A0I(String str) {
        int A032 = AnonymousClass0Z0.A03(-1341363925);
        C12670hC.A02();
        A04();
        A0M(str, true);
        A02();
        C45741yQ r0 = this.A0A;
        if (r0 != null) {
            r0.A0N();
            C45741yQ r02 = this.A0A;
            r02.A0B = null;
            r02.A0A = null;
            r02.A0E = null;
            r02.A07 = null;
            r02.A03 = null;
            r02.A08 = null;
            r02.A04 = null;
            r02.A0F = null;
            r02.A02 = null;
            r02.A05 = null;
            r02.A0D = null;
            r02.A06 = null;
            r02.A09 = null;
        }
        this.A0A = null;
        this.A0B = null;
        this.A0E = null;
        this.A01 = -1;
        this.A06 = 0;
        this.A0L = false;
        Handler handler = this.A0S;
        AnonymousClass0ZA.A0E(handler, new C56952dK(this, handler), 802304754);
        AnonymousClass0Z0.A0A(1730536001, A032);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0095, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x0099 */
    public final void A0J(String str) {
        File A002;
        File[] listFiles;
        int A032 = AnonymousClass0Z0.A03(44658702);
        int A0A2 = A0A();
        Bitmap bitmap = null;
        if (this.A0H && str != null && A0A2 > 500 && Build.VERSION.SDK_INT >= 21) {
            try {
                C45911ym r1 = this.A0B;
                if (r1 != null) {
                    bitmap = r1.A01(2);
                }
            } catch (NullPointerException unused) {
            }
        }
        if (!(bitmap == null || (A002 = C45521y4.A00(this.A0R, str)) == null || bitmap == null)) {
            if (C45521y4.A02 == null) {
                C45521y4.A02 = Collections.synchronizedSet(new HashSet(50));
            }
            if (C45521y4.A00 % 25 == 24 && (listFiles = C45521y4.A01.listFiles()) != null && listFiles.length > 50) {
                Arrays.sort(listFiles, new AnonymousClass4V9());
                for (int i = 0; i < 25; i++) {
                    listFiles[i].delete();
                    C45521y4.A02.remove(listFiles[i].getName());
                }
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(A002);
                bitmap.compress(Bitmap.CompressFormat.JPEG, 75, fileOutputStream);
                C45521y4.A02.add(A002.getName());
                C45521y4.A00++;
                fileOutputStream.close();
            } catch (IOException e) {
                AnonymousClass0DB.A0E("VideoCoverFrameCache", e.getMessage());
            } catch (Throwable ) {
                throw th;
            }
        }
        AnonymousClass0Z0.A0A(1671348402, A032);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x010a  */
    public final void A0K(String str, C37671k2 r15, C31841a5 r16, int i, C45881yj r18, int i2, float f, boolean z, String str2) {
        C45901yl r6;
        String str3;
        C37671k2 r0;
        String str4;
        C37661k1[] r1;
        AnonymousClass0C1 r4;
        int i3;
        String str5;
        int A032 = AnonymousClass0Z0.A03(-118622481);
        C12670hC.A02();
        if (this.A0C != C36341ht.IDLE) {
            this.A0A.A0O();
        }
        A06(C36341ht.PREPARING);
        String str6 = str;
        C37671k2 r8 = r15;
        this.A0E = new C45901yl(str6, r8, r18, i2, Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, Math.min(1.0f, f)), z);
        this.A0F = str2;
        if (this.A0I) {
            AnonymousClass0ZA.A08(this.A0S, this.A0W);
            AnonymousClass0ZA.A09(this.A0S, this.A0W, 120000, 1607556012);
            AnonymousClass0ZA.A0E(this.A0S, this.A0X, 1929583005);
        }
        this.A06 = 0;
        if (!(r15 == null || r15.A03 == null)) {
            AnonymousClass0C1 r42 = this.A0T;
            AnonymousClass0L7 r3 = AnonymousClass0L7.VIDEO_RETRY_LAUNCHER;
            if (((Boolean) AnonymousClass0L6.A02(r42, r3, "feature_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                Integer num = r15.A03;
                if (num == Constants.A0N || num == Constants.A0Y) {
                    r4 = this.A0T;
                    i3 = 4;
                    str5 = "live_retry_limit";
                } else if (num == Constants.ONE) {
                    r4 = this.A0T;
                    i3 = 3;
                    str5 = "story_retry_limit";
                } else if (num == Constants.ZERO && r15.A00 == AnonymousClass1YR.IGTV) {
                    r4 = this.A0T;
                    i3 = 4;
                    str5 = "igtv_retry_limit";
                } else {
                    r4 = this.A0T;
                    i3 = 3;
                    str5 = "feed_video_retry_limit";
                }
                this.A07 = ((Integer) AnonymousClass0L6.A02(r4, r3, str5, i3, (AnonymousClass04H) null)).intValue();
                C31841a5 r2 = r16;
                if (r16 != null) {
                    A05(r2, true, i);
                    C45911ym r22 = this.A0B;
                    if (r22 != null) {
                        if (!this.A0Q || this.A0N != C45681yK.FIT || r15 == null || (r1 = r15.A0E) == null || r1.length <= 0) {
                            r22.A04();
                        } else {
                            C37661k1 r02 = r1[0];
                            r22.A06(r02.A02, r02.A00);
                        }
                    }
                }
                r6 = this.A0E;
                C45721yO r7 = this.A0U;
                C45881yj r12 = r6.A0B;
                Object obj = r12.A03;
                if (!r6.A0D) {
                    str3 = "start";
                } else {
                    str3 = "early";
                }
                r7.Bd2(obj, 0, str3, A00(r12));
                r0 = r6.A0A;
                if (r0 == null) {
                    str4 = r0.A06;
                } else {
                    str4 = null;
                }
                C45741yQ r03 = this.A0A;
                if (str4 == null) {
                    AnonymousClass0ZA.A0E(this.A0S, new C29295CvQ(this, r03, str4, r6), 218470574);
                } else {
                    r03.A0W((Uri) null);
                    A07(this, r6);
                }
                AnonymousClass0Z0.A0A(383513978, A032);
            }
        }
        this.A07 = 3;
        C31841a5 r23 = r16;
        if (r16 != null) {
        }
        r6 = this.A0E;
        C45721yO r72 = this.A0U;
        C45881yj r122 = r6.A0B;
        Object obj2 = r122.A03;
        if (!r6.A0D) {
        }
        r72.Bd2(obj2, 0, str3, A00(r122));
        r0 = r6.A0A;
        if (r0 == null) {
        }
        C45741yQ r032 = this.A0A;
        if (str4 == null) {
        }
        AnonymousClass0Z0.A0A(383513978, A032);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0055, code lost:
        if (r12.A0L != false) goto L_0x0057;
     */
    public final void A0L(String str, boolean z) {
        int i;
        boolean z2;
        int A032 = AnonymousClass0Z0.A03(-1399278479);
        if (this.A0E == null) {
            AnonymousClass0QD.A02("VideoPlayerImpl", "play_with_null_video");
            i = 1027404492;
        } else {
            A08(z);
            String str2 = "resume";
            if (!str2.equals(str)) {
                str2 = "autoplay";
            }
            C45941ys A002 = A00(this.A0E.A0B);
            this.A0U.Bd0(this.A0E.A0B.A03, str, A002);
            if (!"video_event_skip_should_start".equals(str)) {
                C45721yO r4 = this.A0U;
                C45901yl r1 = this.A0E;
                Object obj = r1.A0B.A03;
                if (!r1.A02) {
                    z2 = false;
                }
                z2 = true;
                r4.Bd3(obj, 0, z2, this.A0L, str2, A002);
            }
            this.A0U.Bco(this.A0E.A0B.A03, 0, A002);
            i = 1009631023;
        }
        AnonymousClass0Z0.A0A(i, A032);
    }

    public final void A0M(String str, boolean z) {
        ViewGroup viewGroup;
        C36341ht r3;
        int A032 = AnonymousClass0Z0.A03(192766331);
        C12670hC.A02();
        if (this.A0I) {
            AnonymousClass0ZA.A08(this.A0S, this.A0X);
            AnonymousClass0ZA.A08(this.A0S, this.A0W);
            AnonymousClass0ZA.A0E(this.A0S, this.A0W, 892908863);
        }
        AnonymousClass0ZA.A07(this.A0V, (Object) null);
        C36341ht r4 = this.A0C;
        C45901yl r1 = this.A0E;
        if (r4 == C36341ht.IDLE || r4 == (r3 = C36341ht.STOPPING) || r1 == null) {
            A03();
        } else {
            boolean z2 = false;
            if (r4 == C36341ht.PLAYING) {
                z2 = true;
            }
            A06(r3);
            if (!this.A0H && !this.A0J) {
                A04();
            }
            A03();
            if (z2) {
                C45721yO r42 = this.A0U;
                C45901yl r12 = this.A0E;
                C45881yj r0 = r12.A0B;
                r42.Bcy(r0.A03, r12.A07, str, A00(r0));
            }
            this.A0D.BPG(str, z);
            this.A0U.Bcx(this.A0E.A0B.A03);
            int A0A2 = A0A();
            if (this.A0C != C36341ht.IDLE) {
                C45741yQ r02 = this.A0A;
                if (r02 != null) {
                    r02.A0O();
                }
                A06(C36341ht.IDLE);
                this.A0G = true;
            }
            this.A0D.BPI(this.A0E.A0B, A0A2);
            A02();
            this.A0E = null;
        }
        View view = this.A0M;
        if (!(view == null || (viewGroup = (ViewGroup) view.getParent()) == null)) {
            viewGroup.removeView(this.A0M);
        }
        AnonymousClass0Z0.A0A(493723072, A032);
    }

    public final void B1c(C45741yQ r1) {
    }
}
