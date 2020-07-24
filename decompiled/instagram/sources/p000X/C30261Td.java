package p000X;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import com.facebook.C0003R;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.profile.intf.UserDetailEntryInfo;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1Td  reason: invalid class name and case insensitive filesystem */
public final class C30261Td extends C30271Te implements C27361Hn, C28071Kh, C30281Tf {
    public final AnonymousClass1AM A00;
    public final C27371Ho A01;
    public final AnonymousClass1RD A02;
    public final AnonymousClass1PE A03;
    public final C27321Hj A04;
    public final AnonymousClass0C1 A05;
    public final AnonymousClass1I6 A06;
    public final AnonymousClass1RA A07;
    public final C29181Ox A08;
    public final C30681Uu A09;
    public final C27641Iq A0A;
    public final C28061Kg A0B;
    public final Map A0C = new HashMap();

    public final void Avw(AnonymousClass1NJ r1, C36841ih r2) {
    }

    public final void BNN(AnonymousClass1NJ r1, C36841ih r2) {
    }

    private void A00(Bitmap bitmap, AnonymousClass1NJ r3) {
        if (this.A0C.containsKey(r3)) {
            this.A0C.get(r3);
            this.A0C.remove(r3);
        }
    }

    public static void A01(C30261Td r5, int i) {
        C53882Us.A01();
        Intent intent = new Intent(r5.A04.getContext(), BusinessConversionActivity.class);
        Bundle bundle = r5.A04.mArguments;
        bundle.putString("entry_point", "net_ego");
        bundle.putInt("intro_entry_position", i);
        bundle.putInt("business_account_flow", C53892Uu.A00(Constants.ZERO));
        intent.putExtras(bundle);
        AnonymousClass1BH.A0B(intent, 11, r5.A04);
    }

    public final void A0I(C43411uN r5, C43541ua r6) {
        AnonymousClass6Q5 r3 = new AnonymousClass6Q5(r5, r6);
        AnonymousClass5EO r2 = new AnonymousClass5EO(this.A05, this.A04.getContext());
        r2.A02(C0003R.string.hide, new C154396ie(this, r3, r6));
        r2.A00().A01(this.A04.getContext());
    }

    public final void A3d(C36321hr r2, C36851ii r3) {
        this.A0B.A3d(r2, r3);
    }

    public final void A3e(C36321hr r2, int i, C36851ii r4) {
        this.A0B.A3e(r2, i, r4);
    }

    public final void Auu(AnonymousClass1NJ r3, AnonymousClass1NJ r4, AnonymousClass1NJ r5, int i, int i2, int i3) {
        this.A0A.A0A("carousel_swipe");
        super.Auu(r3, r4, r5, i, i2, i3);
    }

    public final void B0b(AnonymousClass1NJ r3, C36841ih r4, int i, C44461wC r6) {
        if (!C26611Ee.A00(this.A05).A0K(r3)) {
            this.A0A.A0A("like");
        }
        super.B0b(r3, r4, i, r6);
    }

    public final void B0c(AnonymousClass1NJ r3, C36841ih r4, int i, AnonymousClass2Z9 r6) {
        if (!C26611Ee.A00(this.A05).A0K(r3)) {
            this.A0A.A0A("like");
        }
        super.B0c(r3, r4, i, r6);
    }

    public final void B0d(AnonymousClass1NJ r3, C36841ih r4, int i, AnonymousClass24E r6) {
        if (!C26611Ee.A00(this.A05).A0K(r3)) {
            this.A0A.A0A("like");
        }
        super.B0d(r3, r4, i, r6);
    }

    public final void B0e(AnonymousClass1NJ r3, C36841ih r4, int i, C32151ag r6) {
        if (!C26611Ee.A00(this.A05).A0K(r3)) {
            this.A0A.A0A("like");
        }
        super.B0e(r3, r4, i, r6);
    }

    public final void B4F(AnonymousClass1NK r4) {
        AnonymousClass1RA r2 = this.A07;
        r2.A03 = true;
        if (!(r4 instanceof AnonymousClass1NJ)) {
            switch (r4.AZP().intValue()) {
                case 2:
                case 3:
                    r2.A09.put(r4, new C150456c7(this));
                    break;
            }
        } else {
            r2.A09.put(r4, new AnonymousClass6IG(this));
        }
        this.A07.A0A();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0086, code lost:
        if (r12.equals("continue_watching") == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004b, code lost:
        if (r12.equals("icon_tap") == false) goto L_0x004d;
     */
    public final void B8o(AnonymousClass1NJ r9, int i, AnonymousClass0RN r11, String str) {
        char c;
        C935342u r2;
        C30681Uu r22 = this.A09;
        String AVo = this.A06.AVo();
        AnonymousClass1NJ r5 = r9;
        int i2 = i;
        String str2 = str;
        if (r9.A3a && "feed_timeline".equals(r22.A00.getModuleName())) {
            C92283yu r4 = new C92283yu(r22.A01.A03("instagram_organic_igtv_revshare_metric_home_feed_preview_cta_tapped_event", AnonymousClass0QV.A06));
            r4.A08("m_pk", r9.getId());
            int hashCode = str.hashCode();
            if (hashCode == -1439908533) {
                c = 1;
            } else if (hashCode == -737589539) {
                c = 0;
            }
            c = 65535;
            if (c == 0) {
                r2 = C935342u.HOME_FEED_PREVIEW_WATCH_IN_IGTV_MID_PREVIEW_CTA;
            } else if (c == 1) {
                r2 = C935342u.HOME_FEED_PREVIEW_KEEP_WATCHING_END_OF_PREVIEW_CTA;
            } else {
                throw new IllegalArgumentException("Invalid action string.");
            }
            r4.A02("source_of_action", r2);
            r4.A07("preview_video_position_ms", Long.valueOf((long) i));
            r4.A08("home_feed_session_id", AVo);
            r4.A01();
        }
        C163636yU.A00(this.A04.getActivity(), C28511Ma.A00(r11), this.A05, r5, i2, str2);
    }

    public final void B92(AnonymousClass1NJ r3, C36841ih r4, int i, String str, View view) {
        if (!C26611Ee.A00(this.A05).A0K(r3)) {
            this.A0A.A0A("like");
        }
        super.B92(r3, r4, i, str, view);
    }

    public final void BKm(AnonymousClass1NJ r3, C36841ih r4, int i, AnonymousClass1U3 r6) {
        this.A0A.A0A("save");
        super.BKm(r3, r4, i, r6);
    }

    public final void BKn(AnonymousClass1NJ r3, C36841ih r4, int i) {
        this.A0A.A0A("save");
        super.BKn(r3, r4, i);
    }

    public final void BN9(AnonymousClass1NJ r18, C36841ih r19) {
        String str;
        C36841ih r1 = r19;
        Integer num = r1.A0K;
        AnonymousClass1NJ r9 = r18;
        switch (num.intValue()) {
            case 3:
                AnonymousClass0C1 r7 = this.A05;
                C27371Ho r8 = this.A01;
                AnonymousClass1I6 r2 = this.A06;
                C06270Ok r13 = null;
                if (r2 != null) {
                    str = r2.AVo();
                } else {
                    str = null;
                }
                C27371Ho r3 = this.A01;
                if (r3 instanceof C30541Ug) {
                    r13 = ((C30541Ug) r3).BYO(r9);
                }
                AnonymousClass5BD.A00(r7, r8, r9, "sfplt_in_menu", num, str, r13, r1.getPosition());
                break;
            case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                AnonymousClass0C1 r32 = this.A05;
                C15890nh r4 = new C15890nh(r32);
                r4.A09 = Constants.ONE;
                r4.A0C = "feed/unhide_post_recs_from_author/";
                r4.A09("a_pk", r9.A0c(r32).getId());
                r4.A06(AnonymousClass1N4.class, false);
                C12810hQ.A02(r4.A03());
                AnonymousClass0C1 r6 = this.A05;
                AnonymousClass1I6 r5 = this.A06;
                AnonymousClass0QV r82 = AnonymousClass0QV.A03;
                AnonymousClass0a4.A0C(true, "must set one of mModuleName or mAnalyticsModule");
                C91053wv r33 = new C91053wv(new AnonymousClass0QT(r6, new C06300On("feed_timeline"), r82).A02("ig_main_feed_unhide_post_recs_from_author"));
                r33.A08("author_id", r9.A0c(r6).getId());
                r33.A08("pk", r6.A04());
                r33.A08("session_id", r5.AVo());
                r33.A01();
                break;
            case C120125Dh.VIEW_TYPE_BADGE /*13*/:
                AnonymousClass0C1 r52 = this.A05;
                C15890nh r42 = new C15890nh(r52);
                r42.A09 = Constants.ONE;
                r42.A0C = "feed/unhide_feed_post/";
                r42.A09("m_pk", r9.APo());
                r42.A09("a_pk", r9.A0c(r52).getId());
                r42.A06(AnonymousClass1N4.class, false);
                C12810hQ.A02(r42.A03());
                C55602b0.A03(C55602b0.A00(this.A05), this.A04.getActivity(), r9.A0c(this.A05), (String) null, r9, AnonymousClass6N9.A02(r9.A0m, (String) null, -1), this.A06, (String) null, (String) null, (UserDetailEntryInfo) null, (C17920r1) null, (String) null);
                break;
        }
        super.BN9(r9, r1);
    }

    public final void BNe(AnonymousClass1NJ r3, C36841ih r4, int i, C32151ag r6) {
        this.A0A.A0A("single_tap");
        super.BNe(r3, r4, i, r6);
    }

    public final void BZm(C36321hr r2, View view) {
        this.A0B.BZm(r2, view);
    }

    public final void BZn(C36321hr r2, View view, int i) {
        this.A0B.BZn(r2, view, i);
    }

    public final void Brz(View view) {
        this.A0B.Brz(view);
    }

    public final C255119b getScrollingViewProxy() {
        return this.A04.getScrollingViewProxy();
    }

    public static void A02(C30261Td r1, AnonymousClass6Q5 r2, C43551ub r3, C43561uc r4) {
        r3.Bhs(r4);
        r2.A00(r1.A04.getScrollingViewProxy(), r1);
    }

    public final void B79(C37371jY r2, AnonymousClass1NJ r3, C36841ih r4, C44461wC r5) {
        super.B79(r2, r3, r4, r5);
        A00(r2.A00, r3);
    }

    public final void B7A(C37371jY r2, AnonymousClass1NJ r3, C36841ih r4, AnonymousClass24E r5) {
        super.B7A(r2, r3, r4, r5);
        A00(r2.A00, r3);
    }

    public final void B7B(C37371jY r2, AnonymousClass1NJ r3, C36841ih r4, C32151ag r5) {
        super.B7B(r2, r3, r4, r5);
        A00(r2.A00, r3);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public C30261Td(C27321Hj r28, AnonymousClass1AM r29, C27371Ho r30, AnonymousClass1PE r31, AnonymousClass1RJ r32, AnonymousClass1S3 r33, AnonymousClass1RA r34, AnonymousClass0C1 r35, C29791Rg r36, C29851Rn r37, AnonymousClass1RD r38, AnonymousClass1RD r39, AnonymousClass1LO r40, C29881Rq r41, AnonymousClass1I6 r42, AnonymousClass1US r43, C29181Ox r44, C27641Iq r45, C28051Kf r46, AnonymousClass1ST r47, C28061Kg r48, AnonymousClass1LY r49) {
        super(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, new AnonymousClass1UV(r4, r19, r20, r21, r22, r41, r26), r43, r19, false, (AnonymousClass30N) null, r46, r47, (String) null, (String) null, r26);
        C27321Hj r4 = r28;
        AnonymousClass1LY r26 = r49;
        AnonymousClass1I6 r13 = r42;
        AnonymousClass1AM r5 = r29;
        C27371Ho r6 = r30;
        AnonymousClass0C1 r12 = r35;
        AnonymousClass1AM r19 = r5;
        AnonymousClass1I6 r20 = r13;
        C27371Ho r21 = r6;
        AnonymousClass0C1 r22 = r12;
        AnonymousClass1LO r14 = r40;
        AnonymousClass1RD r16 = r38;
        C29181Ox r2 = r44;
        AnonymousClass1RJ r8 = r32;
        AnonymousClass1PE r7 = r31;
        AnonymousClass1S3 r9 = r33;
        AnonymousClass1RA r10 = r34;
        C29791Rg r11 = r36;
        C29851Rn r15 = r37;
        C29181Ox r192 = r2;
        this.A04 = r4;
        this.A00 = r5;
        this.A01 = r6;
        this.A03 = r7;
        this.A07 = r10;
        this.A05 = r12;
        this.A06 = r13;
        this.A08 = r2;
        this.A0A = r45;
        this.A0B = r48;
        this.A02 = r39;
        this.A09 = new C30681Uu(r12, r6);
    }
}
