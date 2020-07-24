package p000X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1hi  reason: invalid class name and case insensitive filesystem */
public final class C36231hi extends C256219o implements C30561Ui {
    public C27301Hh A00;
    public C27511Id A01;
    public AnonymousClass2YV A02;
    public AnonymousClass2Y7 A03;
    public AnonymousClass2KR A04;
    public C36281hn A05;
    public C28981Od A06;
    public C29631Qq A07;
    public AnonymousClass390 A08;
    public final int A09;
    public final Context A0A;
    public final C27341Hl A0B;
    public final C11200ea A0C = new AnonymousClass6SZ(this);
    public final C11200ea A0D = new AnonymousClass6Y1(this);
    public final C11200ea A0E = new AnonymousClass6Y0(this);
    public final C11200ea A0F = new AnonymousClass6SX(this);
    public final C11200ea A0G = new AnonymousClass6SW(this);
    public final AnonymousClass2YW A0H;
    public final AnonymousClass1I1 A0I = new AnonymousClass1I1();
    public final C27371Ho A0J;
    public final AnonymousClass1RJ A0K;
    public final AnonymousClass0C1 A0L;
    public final String A0M;
    public final AnonymousClass1LO A0N;
    public final AnonymousClass410 A0O;
    public final C150136bb A0P = new C150136bb(this);
    public final C148776Xx A0Q = new C148776Xx(this);
    public final boolean A0R;

    public static void A00(C36231hi r4) {
        AnonymousClass2YV r3 = r4.A02;
        C15890nh AUH = r3.A03.AUH(r4.A04);
        HashMap hashMap = r3.A08;
        if (hashMap != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                AUH.A09((String) entry.getKey(), (String) entry.getValue());
            }
        }
        C16160o8.A04(AUH, r3.A04.A01);
        C28341Li r2 = r3.A04;
        if (r2.A01 == null) {
            r3.A01 = false;
        }
        C17850qu A032 = AUH.A03();
        AnonymousClass0a4.A06(r3.A00);
        r2.A02(A032, new C149866b4(r3));
    }

    public final void BAg(AnonymousClass1NJ r2, boolean z) {
        this.A04.AE6();
    }

    public final void A08(C255119b r4, int i) {
        int A032 = AnonymousClass0Z0.A03(2013313119);
        this.A0I.A08(r4, i);
        if (!this.A02.A02 && r4.AOh() == this.A04.getCount() - 1) {
            this.A0H.A00.A02.A04();
        }
        AnonymousClass0Z0.A0A(1187646943, A032);
    }

    public final void A09(C255119b r4, int i, int i2, int i3, int i4, int i5) {
        int A032 = AnonymousClass0Z0.A03(848780224);
        ViewGroup AaK = r4.AaK();
        if (r4.AgC()) {
            AbsListView absListView = (AbsListView) AaK;
            if (this.A04.Aey()) {
                if (C256119n.A04(absListView)) {
                    this.A04.Aq6();
                }
            }
            this.A0I.onScroll(absListView, i, i2, i3);
        } else {
            this.A0I.onScrolled((RecyclerView) AaK, i4, i5);
            this.A04.Aq6();
        }
        AnonymousClass0Z0.A0A(-129475073, A032);
    }

    public C36231hi(Context context, C27341Hl r39, AnonymousClass0C1 r40, AnonymousClass1I6 r41, C27371Ho r42, AnonymousClass1LO r43, C27301Hh r44, boolean z, AnonymousClass2YW r46, AnonymousClass410 r47, C17070pd r48, C68062yN r49, C147326Rm r50, AnonymousClass6Y5 r51, C30311Ti r52, AnonymousClass2KU r53, AnonymousClass2KX r54, String str, C28051Kf r56, AnonymousClass2YV r57, boolean z2, boolean z3, boolean z4) {
        Context context2 = context;
        this.A0A = context2;
        C27341Hl r4 = r39;
        this.A0B = r4;
        AnonymousClass0C1 r2 = r40;
        this.A0L = r2;
        C27371Ho r5 = r42;
        this.A0J = r5;
        this.A0N = r43;
        this.A0H = r46;
        this.A0O = r47;
        this.A0M = str;
        this.A0R = z2;
        FragmentActivity activity = r4.getActivity();
        this.A09 = C27651Ir.A00(context2);
        AnonymousClass0C1 r6 = this.A0L;
        C27341Hl r3 = this.A0B;
        C147326Rm r25 = r50;
        AnonymousClass0C1 r10 = r6;
        C28468ChP chP = new C28468ChP(r10, r3, this.A0J, activity, Constants.ZERO, r25);
        Context context3 = this.A0A;
        AnonymousClass1L8 A002 = AnonymousClass1L8.A00(r3);
        C27371Ho r32 = this.A0J;
        AnonymousClass0C1 r0 = this.A0L;
        C28469ChQ chQ = new C28469ChQ(activity, new AnonymousClass1L7(context3, A002, r32, r0), Constants.ZERO, r0, r32);
        C28051Kf r7 = r56;
        AnonymousClass1I6 r102 = r41;
        C28181Ks r13 = new C28181Ks(r2, r102, r7, chP);
        C27341Hl r11 = this.A0B;
        this.A06 = new C28981Od(r11, (C27361Hn) r11, this.A0L, this.A0J);
        new AnonymousClass1OP(r2, r4, r5, (C28051Kf) null);
        AnonymousClass1LE r12 = new AnonymousClass1LE(this.A0L, r102, r7, chQ);
        C149896b8 r112 = new C149896b8(this);
        Context context4 = this.A0A;
        C27341Hl r35 = this.A0B;
        C27371Ho r15 = this.A0J;
        C148776Xx r14 = this.A0Q;
        AnonymousClass0C1 r62 = this.A0L;
        AnonymousClass1LO r45 = this.A0N;
        AnonymousClass2KT r02 = this.A0O.A00;
        C06270Ok A003 = C06270Ok.A00();
        r02.A0M.A02(A003);
        AnonymousClass6Y5 r26 = r51;
        C68062yN r24 = r49;
        C17070pd r22 = r48;
        boolean z5 = z;
        C27371Ho r17 = r15;
        C28469ChQ chQ2 = chQ;
        AnonymousClass0C1 r20 = r62;
        AnonymousClass1LO r21 = r45;
        C148776Xx r16 = r14;
        C28468ChP chP2 = chP;
        C27341Hl r142 = r35;
        Context context5 = context4;
        AnonymousClass2KR r122 = new AnonymousClass2KR(context5, r142, r15, r16, r17, chP2, chQ2, r20, r21, r22, z5, r24, r25, r26, r52, r53, r54, A003, r13, r12, r112, z3);
        this.A04 = r122;
        this.A0K = new AnonymousClass1RJ(this.A0A, this.A0L, r5, r122, r102.AVo());
        this.A00 = r44;
        AnonymousClass2KR r113 = this.A04;
        Integer num = Constants.ONE;
        AnonymousClass0C1 r63 = this.A0L;
        AnonymousClass0L7 r55 = AnonymousClass0L7.AUTO_LOAD_MORE_ON_SCROLL_STATE_IDLE;
        this.A05 = new C36281hn(r113, num, ((Integer) AnonymousClass0L6.A02(r63, r55, "contextual_feed_prefetch_window", 3, (AnonymousClass04H) null)).intValue(), this.A0Q, ((Boolean) AnonymousClass0L6.A02(r2, r55, "is_enabled_for_auto_load_helper", false, (AnonymousClass04H) null)).booleanValue());
        if (this.A0R) {
            Context context6 = this.A0A;
            C27301Hh r64 = this.A00;
            Context context7 = context6;
            C27301Hh r103 = r64;
            int i = this.A09;
            this.A03 = new AnonymousClass2Y7(context7, r103, i, z4, ((Boolean) AnonymousClass0L6.A02(this.A0L, AnonymousClass0L7.EXPLORE_UNIFIED_POST_CHAINS, "enable_restart_videos_on_resume", false, (AnonymousClass04H) null)).booleanValue());
        }
        this.A08 = new AnonymousClass390(this.A0A, this.A0J, this.A0L);
        AnonymousClass2YV r23 = r57;
        this.A02 = r23;
        r23.A00 = this.A0P;
    }
}
