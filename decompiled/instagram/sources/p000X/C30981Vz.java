package p000X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Vz  reason: invalid class name and case insensitive filesystem */
public final class C30981Vz extends C27291Hg implements AnonymousClass1W0 {
    public static final Handler A0C = new Handler(Looper.getMainLooper());
    public AnonymousClass1WF A00;
    public AnonymousClass1WC A01;
    public final AnonymousClass0C1 A02;
    public final AnonymousClass1MV A03;
    public final Runnable A04 = new AnonymousClass1W1(this);
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final long A08;
    public final AnonymousClass1W3 A09 = new AnonymousClass1W2(this);
    public final AnonymousClass1OR A0A;
    public final boolean A0B;

    public final void BDm(long j, int i) {
    }

    public final void BDn(long j) {
    }

    public final void BHo() {
    }

    public final void BHp(long j, boolean z, int i, Integer num) {
    }

    public C30981Vz(C27331Hk r40, AnonymousClass0C1 r41, AnonymousClass1L8 r42, C27371Ho r43, AnonymousClass0RN r44) {
        AnonymousClass0C1 r1 = r41;
        this.A02 = r1;
        Context context = r40.getContext();
        this.A0A = AnonymousClass1OR.A00(r1);
        C28961Ob r2 = new C28961Ob();
        r2.A01 = r1;
        r2.A00 = r44;
        C28971Oc A002 = r2.A00();
        if (((Boolean) AnonymousClass0L6.A02(r1, AnonymousClass0L7.STORIES_ADS_PREFETCH_LAUNCHER, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            AnonymousClass1OY r31 = AnonymousClass1OY.MAIN_FEED_TRAY;
            String str = A002.A04;
            AnonymousClass5V6 r5 = new AnonymousClass5V6(this);
            C1898689l r9 = new C1898689l(str);
            AnonymousClass1M6 r15 = new AnonymousClass1M6();
            C27371Ho r12 = r43;
            C61082l6 r6 = new C61082l6(r1, r12, str, r9.AaT());
            AnonymousClass1M0 A003 = AnonymousClass1M0.A00(r1);
            Class cls = C61152lD.A00;
            AnonymousClass1MD A012 = A003.A01(cls, r1);
            AnonymousClass1M0 A004 = AnonymousClass1M0.A00(r1);
            if (!A004.A00.containsKey(cls)) {
                A004.A00.put(cls, new AnonymousClass1MZ());
            }
            C28501Lz r21 = C28501Lz.A03;
            C61112l9 r11 = new C61112l9(r1);
            HashSet hashSet = new HashSet();
            AnonymousClass1MF r23 = AnonymousClass1MF.A00;
            AnonymousClass0a4.A06(hashSet);
            AnonymousClass0C1 r33 = r1;
            C61192lH r32 = new C61192lH(r33, r12, str, r9.AaT(), r31);
            C61202lI r14 = new C61202lI(new C61212lJ(r33, r11, r15, A012, r6), new C61232lL(r1, r15, r6));
            AnonymousClass1L8 r28 = r42;
            String str2 = str;
            C61312lT r24 = new C61312lT(new C61242lM(r31, r1, r12, r9, str), context, str2, r28, r1, r9, r31, A012, (AnonymousClass1MZ) A004.A00.get(cls));
            AnonymousClass1MT r19 = new AnonymousClass1MT();
            AnonymousClass1MR r20 = new AnonymousClass1MR();
            AnonymousClass1M0 A005 = AnonymousClass1M0.A00(r1);
            Class cls2 = C61152lD.A00;
            AnonymousClass0a4.A06(r5);
            hashSet.add(r5);
            AnonymousClass0a4.A06(r32);
            AnonymousClass0a4.A06(r14);
            AnonymousClass0a4.A06(r15);
            AnonymousClass0a4.A06(r24);
            AnonymousClass0a4.A06(A012);
            AnonymousClass0a4.A06(r11);
            AnonymousClass0a4.A06(r19);
            AnonymousClass0a4.A06(r20);
            AnonymousClass0a4.A06(r21);
            AnonymousClass0a4.A06(r23);
            AnonymousClass0a4.A06(A005);
            AnonymousClass0a4.A06(cls2);
            this.A03 = new AnonymousClass1MV(r32, r14, r15, r24, A012, r11, r19, r20, r21, hashSet, r23, cls2, A005);
            AnonymousClass0L7 r52 = AnonymousClass0L7.STORIES_ADS_PREFETCH_LAUNCHER;
            this.A06 = ((Boolean) AnonymousClass0L6.A02(r1, r52, "enable_tap_prefetch", false, (AnonymousClass04H) null)).booleanValue();
            this.A0B = ((Boolean) AnonymousClass0L6.A02(r1, r52, "enable_cold_start_prefetch", false, (AnonymousClass04H) null)).booleanValue();
            AnonymousClass0L7 r62 = AnonymousClass0L7.STORIES_ADS_PREFETCH_LAUNCHER;
            this.A08 = TimeUnit.SECONDS.toMillis((long) ((Integer) AnonymousClass0L6.A02(r1, r62, "cold_start_prefetch_delay_seconds", 5, (AnonymousClass04H) null)).intValue());
            this.A07 = ((Boolean) AnonymousClass0L6.A02(r1, r62, "enable_tray_gesture_prefetch", false, (AnonymousClass04H) null)).booleanValue();
            this.A05 = ((Boolean) AnonymousClass0L6.A02(r1, r62, "enable_ad_media_prefetch", false, (AnonymousClass04H) null)).booleanValue();
        }
    }

    public static void A00(C30981Vz r3, int i) {
        r3.A03.A05.Aov(C61102l8.A00(i, r3.A00.ATw(), new ArrayList(r3.A0A.A05)), false);
    }

    public final void BHq(long j, String str, boolean z, boolean z2, Integer num) {
        if (this.A0B) {
            Handler handler = A0C;
            AnonymousClass0ZA.A08(handler, this.A04);
            AnonymousClass0ZA.A09(handler, this.A04, this.A08, 1282122632);
        }
    }

    public final void Azd() {
        super.Azd();
        AnonymousClass1MV r0 = this.A03;
        if (r0 != null) {
            r0.A02();
        }
    }

    public final void BE0() {
        super.BE0();
        this.A0A.A06.remove(this);
        AnonymousClass0ZA.A08(A0C, this.A04);
        this.A01.BbS(this.A09);
    }

    public final void BJx() {
        super.BJx();
        this.A0A.A06.add(this);
        this.A01.A4G(this.A09);
    }
}
