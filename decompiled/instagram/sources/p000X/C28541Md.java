package p000X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.instagram.model.mediatype.MediaType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1Md  reason: invalid class name and case insensitive filesystem */
public final class C28541Md extends C27291Hg {
    public C29551Qi A00;
    public AnonymousClass1PE A01;
    public C27581Ik A02;
    public C29541Qh A03;
    public C36271hm A04;
    public C28551Me A05;
    public C27321Hj A06;
    public AnonymousClass0C1 A07;
    public boolean A08;
    public C15880ng A09;
    public C28661Mp A0A;
    public boolean A0B;
    public final AnonymousClass1LV A0C;
    public final AnonymousClass1I6 A0D;
    public final Object A0E = new Object();
    public volatile boolean A0F;

    private void A00(C15880ng r13, C28661Mp r14, boolean z, List list, C28571Mg r17) {
        C15880ng r1 = r13;
        List list2 = list;
        this.A03.A00(r1, list2, z, r17, r14.A03, r14.A06, r14.A02, r14.A01, r14.A05, r14.A07, r14.AQs());
        this.A06.A0F(true, z);
    }

    private boolean A01(C15880ng r19, List list) {
        if (this.A0F || this.A03 == null || this.A08) {
            this.A02.A0B("CACHED_FEED_FAILED", "cancel");
            return false;
        }
        this.A0F = true;
        this.A02.A0A("FEED_LOAD_FROM_DISK_FINISHED");
        this.A02.A0A("CACHED_FEED_UI_RENDER_START");
        this.A03.A00(r19, list, true, C28571Mg.CACHED, (C32091aX) null, (Integer) null, (C43411uN) null, (B3G) null, (AnonymousClass2FD) null, (String) null, (String) null);
        C27321Hj r1 = this.A06;
        if (r1.mView != null) {
            ViewGroup AaK = r1.getScrollingViewProxy().AaK();
            AaK.addOnLayoutChangeListener(new C06250Oi(new C37241jL(this), new C37231jK(this), AaK));
        }
        return true;
    }

    public final void A02(C15880ng r6, C28571Mg r7, C28661Mp r8, boolean z) {
        AnonymousClass1NJ A052;
        if (!this.A07.Abj()) {
            switch (r7.ordinal()) {
                case 0:
                case 2:
                    for (AnonymousClass1NG r2 : r8.A01()) {
                        if (r2.A0H == C29261Pf.MEDIA && (A052 = r2.A05()) != null && z) {
                            if (A052.A1Q() && this.A06.getContext() != null) {
                                C27581Ik r22 = this.A02;
                                MediaType APx = A052.APx();
                                synchronized (r22) {
                                    r22.A0B("FIRST_MEDIA_LOAD_START", APx.name());
                                    r22.A0C = true;
                                }
                                AnonymousClass1GH A0D2 = AnonymousClass12C.A0c.A0D(A052.A0S(this.A06.getContext()), this.A06.getModuleName());
                                A0D2.A0G = false;
                                A0D2.A02(this.A02);
                                A0D2.A06 = A052.A26;
                                A0D2.A01();
                            }
                            z = false;
                        }
                    }
                    return;
                case 1:
                    synchronized (this.A0E) {
                        this.A09 = r6;
                        this.A0A = r8;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public final void A05(Integer num) {
        String str;
        String str2;
        C28661Mp r7 = this.A05.A01;
        if (r7 != null) {
            AnonymousClass0C1 r6 = this.A07;
            AnonymousClass2X2 r4 = new AnonymousClass2X2(AnonymousClass0QT.A00(r6, this.A06).A02("ig_main_feed_deferred_response_loaded"));
            int intValue = num.intValue();
            switch (intValue) {
                case 1:
                    str = "scrolled_to_top";
                    break;
                case 2:
                    str = "feed_disappeared";
                    break;
                case 3:
                    str = "feed_reappeared";
                    break;
                case 4:
                    str = "app_backgrounded";
                    break;
                case 5:
                    str = "app_foregrounded";
                    break;
                default:
                    str = "indicator_tapped";
                    break;
            }
            r4.A08("reason", str);
            r4.A01();
            switch (intValue) {
                case 1:
                    str2 = "SCROLLED_TO_TOP";
                    break;
                case 2:
                    str2 = "FEED_DISAPPEARED";
                    break;
                case 3:
                    str2 = "FEED_REAPPEARED";
                    break;
                case 4:
                    str2 = "APP_BACKGROUNDED";
                    break;
                case 5:
                    str2 = "APP_FOREGROUNDED";
                    break;
                default:
                    str2 = "INDICATOR_TAPPED";
                    break;
            }
            C109004mm A002 = AnonymousClass13N.A00(r6);
            if (A002 != null) {
                A002.A00("ig_main_feed_deferred_response_loaded", str2);
            }
            C15880ng r62 = this.A05.A00;
            if (this.A03 != null) {
                A00(r62, r7, true, r7.A01(), C28571Mg.NETWORK);
            }
            this.A05.A00(true);
        }
    }

    public final boolean A06() {
        if (this.A05.A01 != null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01db, code lost:
        if (r8.A0N.A02.contains("save") == false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c9, code lost:
        if (r12.A05.booleanValue() == false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d9, code lost:
        if (r8.A0L.A05 == false) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00fd, code lost:
        if (r0 != false) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0188, code lost:
        if (r8.A0L.A05 == false) goto L_0x018a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0179  */
    public final boolean A07(C15880ng r26, C28571Mg r27, C28661Mp r28, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        C109004mm r10;
        boolean z5;
        boolean z6;
        AnonymousClass1YO r0;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z7;
        if (!this.A07.Abj()) {
            C15880ng r2 = r26;
            boolean z8 = z;
            C28661Mp r4 = r28;
            switch (r27.ordinal()) {
                case 0:
                    AnonymousClass1PE r8 = this.A01;
                    List A012 = r4.A01();
                    boolean z9 = this.A0B;
                    Iterator it = A012.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            AnonymousClass1NG r1 = (AnonymousClass1NG) it.next();
                            switch (r1.A0H.ordinal()) {
                                case 1:
                                case C120125Dh.VIEW_TYPE_BADGE /*13*/:
                                    AnonymousClass1NJ A052 = r1.A05();
                                    if (z9 && A052 != null && A052.Aho()) {
                                        continue;
                                    }
                                case OdexSchemeArtXdex.OREO_SDK_INT /*26*/:
                                case 27:
                                    if (!r8.A0T.A0J(r1)) {
                                        z2 = false;
                                        break;
                                    } else {
                                        continue;
                                    }
                            }
                        } else {
                            z2 = true;
                        }
                    }
                    boolean z10 = !z2;
                    C28551Me r9 = this.A05;
                    boolean A0G = this.A01.A0T.A0G();
                    C27321Hj r82 = this.A06;
                    boolean A0G2 = r82.A0G();
                    boolean z11 = r82.A0h;
                    boolean z12 = false;
                    if (!r82.A0N.A02.contains("scroll")) {
                        if (!r82.A0N.A02.contains("like")) {
                            if (!r82.A0N.A02.contains("carousel_swipe")) {
                                if (!r82.A0N.A02.contains("single_tap")) {
                                    break;
                                }
                            }
                        }
                    } else if (r82.getScrollingViewProxy().AeF()) {
                        C28521Mb r12 = r82.A0P;
                        if (r12.A05 == null) {
                            r12.A05 = (Boolean) AnonymousClass0L6.A02(r12.A0H, AnonymousClass0L7.FEED_SHORT_SESSION_NEW_POST_PILL, "fix_scroll_vs_ptr", false, (AnonymousClass04H) null);
                        }
                        break;
                    }
                    z12 = true;
                    if (r82.A0P.A02()) {
                        z3 = true;
                        break;
                    }
                    z3 = false;
                    boolean z13 = !AnonymousClass0Q7.A03().A0H();
                    if (!r9.A03) {
                        if (A0G) {
                            if (z13 && A0G2 && !z11 && z && z10 && ((r9.A06 && z3) || z12)) {
                                z7 = true;
                                break;
                            } else {
                                z7 = false;
                                break;
                            }
                        }
                        z4 = false;
                        r10 = r9.A05;
                        if (r10 != null) {
                            StringBuilder sb = new StringBuilder("conditions_true=");
                            String str7 = "";
                            if (z) {
                                str = " first_page";
                            } else {
                                str = str7;
                            }
                            sb.append(str);
                            if (z10) {
                                str2 = " new_items_delivered";
                            } else {
                                str2 = str7;
                            }
                            sb.append(str2);
                            if (A0G2) {
                                str3 = " feed_visible";
                            } else {
                                str3 = str7;
                            }
                            sb.append(str3);
                            if (z11) {
                                str4 = " is_ptr";
                            } else {
                                str4 = str7;
                            }
                            sb.append(str4);
                            if (z12) {
                                str5 = " interacted_with_feed";
                            } else {
                                str5 = str7;
                            }
                            sb.append(str5);
                            if (z3) {
                                str6 = " short_session";
                            } else {
                                str6 = str7;
                            }
                            sb.append(str6);
                            if (z13) {
                                str7 = " app_foregrounded";
                            }
                            sb.append(str7);
                            r10.A00(AnonymousClass000.A0S("should_defer_feed_response=", z4), sb.toString());
                        }
                        if (!z4) {
                            if (r9.A01 != r4) {
                                r9.A00 = r2;
                                r9.A01 = r4;
                                AnonymousClass1WP r13 = r9.A02;
                                if (!(r13 == null || (r0 = r13.A00.A0O) == null)) {
                                    r0.A0A();
                                    r13.A00.A0A.Bg7(C29621Qp.MAIN_FEED_PILL);
                                }
                            }
                            r9.A04 = false;
                            z5 = true;
                        } else {
                            if (!z10) {
                                if (r82.A0P.A02()) {
                                    z6 = true;
                                    break;
                                }
                                z6 = false;
                                if (z6) {
                                    r9.A04 = true;
                                    z5 = true;
                                }
                            }
                            z5 = false;
                        }
                        if (!this.A08) {
                            if (z5) {
                                C27581Ik r92 = this.A02;
                                synchronized (r92) {
                                    C12600h4 r14 = r92.A06;
                                    if (r14.A00 != null) {
                                        r14.A04.markerAnnotate(15335435, "is_feed_deferred", true);
                                    }
                                }
                            }
                            this.A02.A0E(true);
                            C37531jo.A00(this.A06.getContext(), this.A07).A02(true);
                            C27321Hj r83 = this.A06;
                            long currentTimeMillis = System.currentTimeMillis();
                            C36791ic A002 = C36791ic.A00(r83.A0V);
                            if (currentTimeMillis < A002.A00.getLong("lastSyncMediaIdsTime", 0) || currentTimeMillis > A002.A00.getLong("lastSyncMediaIdsTime", 0) + C27321Hj.A1u.longValue()) {
                                C15890nh r93 = new C15890nh(r83.A0V);
                                r93.A09 = Constants.A0N;
                                r93.A0C = "media/blocked/";
                                r93.A06(AnonymousClass23z.class, false);
                                C17850qu A032 = r93.A03();
                                A032.A00 = new AnonymousClass240(r83, A002);
                                r83.schedule(A032);
                            }
                            this.A01.A08 = true;
                            this.A08 = true;
                        }
                        if (!z5 && this.A03 != null) {
                            A00(r2, r4, z8, r4.A01(), C28571Mg.NETWORK);
                        }
                        if (z) {
                            this.A06.A0E(false);
                        }
                        return z10;
                    }
                    z4 = true;
                    r10 = r9.A05;
                    if (r10 != null) {
                    }
                    if (!z4) {
                    }
                    if (!this.A08) {
                    }
                    A00(r2, r4, z8, r4.A01(), C28571Mg.NETWORK);
                    if (z) {
                    }
                    return z10;
                case 1:
                    List A013 = r4.A01();
                    if (A013 == null || A013.isEmpty()) {
                        this.A02.A0B("CACHED_FEED_FAILED", "empty");
                        return false;
                    }
                    this.A02.A0A("CACHED_FEED_END");
                    return A01(r2, r4.A01());
                case 2:
                    A00(r2, r4, z8, r4.A01(), C28571Mg.LOCAL);
                    return true;
            }
        }
        return false;
    }

    public final void Ayk(View view) {
        C28661Mp r0;
        synchronized (this.A0E) {
            C15880ng r1 = this.A09;
            if (!(r1 == null || (r0 = this.A0A) == null)) {
                A01(r1, r0.A01());
                this.A09 = null;
                this.A0A = null;
            }
        }
    }

    public C28541Md(AnonymousClass0C1 r7, C27321Hj r8, C27581Ik r9, AnonymousClass1I6 r10, AnonymousClass1LV r11) {
        this.A07 = r7;
        this.A06 = r8;
        this.A02 = r9;
        this.A0D = r10;
        this.A0C = r11;
        this.A05 = new C28551Me(r7);
        C28521Mb A002 = C28521Mb.A00(this.A07);
        if (A002.A04 == null) {
            A002.A04 = (Boolean) AnonymousClass0L6.A02(A002.A0H, AnonymousClass0L7.FEED_SHORT_SESSION_NEW_POST_PILL, "drop_ads_only_updates", false, (AnonymousClass04H) null);
        }
        this.A0B = A002.A04.booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a7, code lost:
        if (r1 != false) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        if ((r8.A01.getCause() instanceof java.lang.SecurityException) == false) goto L_0x0020;
     */
    public final void A03(C28571Mg r7, C43791v5 r8, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4 = true;
        switch (r7.ordinal()) {
            case 0:
                this.A02.A0E(false);
                if (r8.A02()) {
                    z2 = true;
                    break;
                }
                z2 = false;
                if (!r8.A03() || ((C28661Mp) r8.A00).mStatusCode != 429) {
                    z4 = false;
                }
                if (z2) {
                    C27321Hj r1 = this.A06;
                    if (r1.isVisible()) {
                        FragmentActivity activity = r1.getActivity();
                        if (activity == null || activity.isFinishing()) {
                            AnonymousClass0QD.A02("Attempted Toast Show after Finished Activity", "We tried to show a dialog after the activity was finished.");
                        } else {
                            AnonymousClass5F9.A01(r1.getActivity(), C0003R.string.security_exception, 0);
                        }
                    }
                } else if (!z4) {
                    if (this.A06.isVisible()) {
                        AnonymousClass0C1 r2 = this.A07;
                        boolean z5 = false;
                        if (((C36991iw) r2.AVA(C36991iw.class, new C37001ix(r2))).A00.getLong("cold_start_time", 0) != 0) {
                            z5 = true;
                        }
                        z3 = true;
                        break;
                    }
                    z3 = false;
                    if (z3) {
                        C53642Tq.A00(this.A06.getActivity(), C0003R.string.could_not_refresh_feed, 0).show();
                    }
                }
                AnonymousClass1PE r12 = this.A01;
                r12.A07 = true;
                AnonymousClass1PE.A01(r12);
                this.A06.A0F(false, z);
                C37531jo.A00(this.A06.getContext(), this.A07).A02(false);
                if (z) {
                    this.A06.A0E(false);
                    return;
                }
                return;
            case 1:
                this.A02.A0B("CACHED_FEED_FAILED", "cancel");
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r1 == false) goto L_0x0016;
     */
    public final void A04(C28571Mg r11, boolean z) {
        boolean z2;
        AnonymousClass1PE r3;
        switch (r11.ordinal()) {
            case 0:
                AnonymousClass0h8 r0 = C12600h4.A00().A00;
                if (r0 != null) {
                    boolean z3 = r0.A07;
                    z2 = true;
                    break;
                }
                z2 = false;
                if (!z2) {
                    this.A02.A0A("FEED_REQUEST_START");
                }
                AnonymousClass1PE r02 = this.A01;
                if (r02 != null) {
                    r02.A07 = true;
                    AnonymousClass1PE.A01(r02);
                }
                if (z) {
                    this.A06.A0E(true);
                }
                if (!z && this.A05.A01 != null) {
                    AnonymousClass0C1 r6 = this.A07;
                    C92353z1 r32 = new C92353z1(AnonymousClass0QT.A00(r6, this.A06).A02("ig_main_feed_deferred_response_discarded"));
                    r32.A08("reason", "tail_load");
                    r32.A01();
                    C109004mm A002 = AnonymousClass13N.A00(r6);
                    if (A002 != null) {
                        A002.A00("ig_main_feed_deferred_response_discarded", "TAIL_LOAD");
                    }
                }
                this.A05.A00(false);
                if (z && !this.A06.A0h && (r3 = this.A01) != null) {
                    C29331Pm r9 = r3.A0T;
                    synchronized (r9.A03) {
                        C150786ce r7 = r9.A00;
                        if (r7 != null) {
                            ArrayList arrayList = new ArrayList();
                            C150816ch A003 = r7.A00();
                            for (String str : r7.A02.keySet()) {
                                C150816ch r03 = (C150816ch) r7.A02.get(str);
                                if (!(r03 == null || r03 == A003)) {
                                    arrayList.addAll(r03.A05);
                                }
                            }
                            r9.A0F(arrayList);
                        }
                    }
                    r3.A02 = null;
                    C29331Pm r2 = r3.A0T;
                    r2.A00 = null;
                    r3.A0C = true;
                    r2.A09(new C697733p(r3, r3.A0b));
                    r3.A0O();
                    return;
                }
                return;
            case 1:
                this.A02.A0A("CACHED_FEED_START");
                return;
            default:
                return;
        }
    }

    public final void Azh() {
        super.Azh();
        C36271hm r1 = this.A04;
        if (r1 != null) {
            this.A06.A0C(r1);
        }
        this.A06.A0C(this.A00);
    }

    public final void BVf(View view, Bundle bundle) {
        super.BVf(view, bundle);
        C36271hm r1 = this.A04;
        if (r1 != null) {
            this.A06.A0B(r1);
        }
        this.A06.A0B(this.A00);
    }
}
