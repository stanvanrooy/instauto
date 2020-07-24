package p000X;

import android.os.Bundle;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import java.lang.ref.WeakReference;

/* renamed from: X.1Gr  reason: invalid class name and case insensitive filesystem */
public final class C27151Gr implements C27161Gs {
    public final /* synthetic */ AnonymousClass1DY A00;
    public final /* synthetic */ AnonymousClass1DI A01;

    public C27151Gr(AnonymousClass1DY r1, AnonymousClass1DI r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void BCx() {
        AnonymousClass1DY r2 = this.A00;
        if (r2.A0C == Constants.ZERO && r2.A01 == r2.A0M.A05.A04() && AnonymousClass1DY.A01(r2) != null && AnonymousClass1DY.A01(this.A00).A01 != null) {
            C79603dj r0 = AnonymousClass1DY.A01(this.A00).A01;
            C78083b8.A00(r0.A0Y, r0.A1S);
        }
    }

    public final void BCy(float f, String str) {
        this.A00.A0M.A02(str);
        if (f == this.A00.A0M.A05.A05()) {
            C86323oq.A07(C79603dj.A07(str));
        }
    }

    public final void BEm(float f, C27171Gt r11) {
        C1890185p A012 = AnonymousClass1DY.A01(this.A00);
        if (A012 != null && f == this.A00.A0M.A05.A05()) {
            String str = r11.A04;
            if (str != null) {
                A012.A01(str, r11.A07, r11.A08, r11.A06, r11.A01);
                return;
            }
            String str2 = r11.A0A;
            if (str2 != null) {
                AnonymousClass7S4 r1 = r11.A02;
                AnonymousClass11J.A00(r1);
                C79603dj r0 = A012.A01;
                if (r0 != null) {
                    r0.A13.A01(str2, r1);
                }
            }
        }
    }

    public final void BEn(float f, float f2, String str, AnonymousClass2TV r18, String str2, String str3, String str4, String str5, int i, String str6, AnonymousClass7S4 r25) {
        String str7;
        C27341Hl r5;
        C1890185p A012;
        String str8;
        C480526l r1;
        AnonymousClass1DY r12;
        C26381Db r0;
        AnonymousClass1HD r9;
        Integer num;
        C27321Hj r13;
        AnonymousClass1H9 r02;
        String str9 = str;
        this.A00.A0M.A02(str9);
        AnonymousClass1DS r03 = this.A00.A0J;
        AnonymousClass1DU r4 = AnonymousClass1DU.PROFILE;
        AnonymousClass1DU A002 = r03.A00();
        boolean z = false;
        if (A002 == r4) {
            z = true;
        }
        if (!z || !AnonymousClass1DX.A02()) {
            C27341Hl r04 = this.A00.A06;
            if (r04 != null) {
                str7 = r04.getModuleName();
            } else {
                str7 = "direct_inbox";
            }
            AnonymousClass1DY r05 = this.A00;
            r5 = r05.A06;
            A012 = AnonymousClass1DY.A01(r05);
            if (A012 != null) {
                str8 = A012.getModuleName();
            } else {
                str8 = "quick_capture_fragment";
            }
        } else {
            r5 = this.A00.A07;
            A012 = null;
            str7 = "newsfeed_you";
            str8 = "";
        }
        AnonymousClass1DY r06 = this.A00;
        C26401Dd r92 = r06.A0K;
        float f3 = r06.A0M.A01;
        AnonymousClass1DI r10 = this.A01;
        boolean z2 = false;
        if (f - ((float) ((int) f)) == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            z2 = true;
        }
        if (!r92.A01) {
            if (!z2) {
                r92.A01 = true;
                ((C256419q) r92.A02.get()).A0A(false);
                r92.A00 = f3;
            }
        } else if (z2) {
            String A003 = C26401Dd.A00(f, r10, str7, str8);
            String A004 = C26401Dd.A00(r92.A00, r10, str7, str8);
            if (f > r92.A00) {
                r1 = C480526l.RIGHT;
            } else {
                r1 = C480526l.LEFT;
            }
            ((C256419q) r92.A02.get()).A01.A0D.A08 = A003;
            ((C256419q) r92.A02.get()).A01.A01(A004);
            ((C256419q) r92.A02.get()).A01.A0D.A07 = r1;
            r92.A01 = false;
            ((C256419q) r92.A02.get()).A0A(true);
        }
        if (f == this.A01.A05()) {
            new AnonymousClass1GZ("ig_swipe_nav_controller").A00(Constants.A0u);
        }
        AnonymousClass1DY r8 = this.A00;
        r8.A00 = (float) Math.round(f);
        AnonymousClass0C1 r14 = r8.A0L;
        AnonymousClass1AM A05 = r8.A0J.A06.A05();
        float f4 = r8.A01;
        C1890185p A013 = AnonymousClass1DY.A01(r8);
        AnonymousClass1DI r11 = this.A01;
        AnonymousClass1HD A0L = A05.A0L(C0003R.C0005id.layout_container_main);
        if (f4 != f) {
            if (f4 == r11.A05() && A013 != null) {
                C26441Dh.A00(r14).A07(A013, A05.A0I() + 1, str9);
            } else if (r5 != null && f4 == r11.A06()) {
                C26441Dh.A00(r14).A07(r5, A05.A0I() + 1, str9);
            } else if (f4 == r11.A04()) {
                C26441Dh.A00(r14).A07((AnonymousClass0RN) A0L, A05.A0I(), str9);
            }
        }
        AnonymousClass1DY r52 = this.A00;
        if (r52.A0M.A05.A0A(f) > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && (C90213vY.A01(r52.A0L) || !C90213vY.A00(r52.A0L))) {
            WeakReference weakReference = r52.A0D;
            if (weakReference != null) {
                r13 = (C27321Hj) weakReference.get();
            } else {
                r13 = null;
            }
            if (r13 == null && (r02 = (AnonymousClass1H9) r52.A0H.A05().A0N("fragment_feed")) != null) {
                r13 = (C27321Hj) r02.getChildFragmentManager().A0N("fragment_feed");
                r52.A0D = new WeakReference(r13);
            }
            if (r13 == null) {
                AnonymousClass0QD.A01("SwipeNavigationController", "MainFeedFragment is null");
            } else if (C90213vY.A01(r52.A0L)) {
                if (r13.A0C.A01.A0G() && C90213vY.A01(r13.A0V)) {
                    C27321Hj.A04(r13);
                }
            } else if (!C90213vY.A00(r52.A0L)) {
                r52.A0M.A04 = r13.A0C.A01.A0G();
            }
        }
        AnonymousClass1DS r7 = this.A00.A0J;
        AnonymousClass1DI r82 = r7.A03.A0M.A05;
        boolean z3 = false;
        if (r7.A00() == AnonymousClass1DU.PROFILE) {
            z3 = true;
        }
        if (!z3 || !AnonymousClass1DX.A02() || r82.A07(f) <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            if (!AnonymousClass1DN.A00() && r82.A08(f) > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                r12 = r7.A03;
                r0 = C26381Db.DIRECT;
            } else if (r82.A0A(f) > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                r12 = r7.A03;
                r0 = C26381Db.CAMERA;
            }
            r12.A04(r0, false);
        }
        if (A012 != null) {
            AnonymousClass2TV r15 = r18;
            if (r18 != null) {
                C79603dj r07 = A012.A01;
                if (r07 != null) {
                    AnonymousClass2TV r53 = r15;
                    if (r18 != null) {
                        r07.A18.A04(C79603dj.A03(r53));
                    }
                } else {
                    A012.A08 = r15;
                }
            }
            String str10 = str2;
            if (str2 != null) {
                String str11 = str4;
                A012.A01(str10, str3, str11, str5, i);
            }
            String str12 = str6;
            if (str6 != null) {
                AnonymousClass7S4 r16 = r25;
                AnonymousClass0a4.A06(r16);
                C79603dj r08 = A012.A01;
                if (r08 != null) {
                    r08.A13.A01(str12, r16);
                }
            }
        }
        C26391Dc r54 = this.A00.A0M;
        float f5 = f2;
        if (!r54.A03 || r54.A00 != f2) {
            r54.A03 = true;
            r54.A00 = f5;
            r54.A01 = f;
            r54.A02(str9);
            for (WeakReference weakReference2 : r54.A06) {
                C27131Gp r09 = (C27131Gp) weakReference2.get();
                if (r09 == null) {
                    r54.A06.remove(weakReference2);
                } else {
                    r09.BDE(r54);
                }
            }
        }
        AnonymousClass1DY r010 = this.A00;
        C27341Hl r102 = r010.A06;
        C26391Dc r3 = r010.A0M;
        AnonymousClass1HD A0L2 = r010.A0J.A06.A05().A0L(C0003R.C0005id.layout_container_main);
        if (A0L2 != null) {
            r9 = A0L2.getChildFragmentManager().A0L(C0003R.C0005id.layout_container_main);
        } else {
            r9 = null;
        }
        AnonymousClass1DI r83 = r3.A05;
        float f6 = r3.A01;
        boolean z4 = true;
        if (r102 != null) {
            boolean z5 = false;
            if (r83.A08(f6) == 1.0f) {
                z5 = true;
            }
            r102.setUserVisibleHint(z5);
        }
        if (A012 != null) {
            boolean z6 = false;
            if (r83.A0A(f6) == 1.0f) {
                z6 = true;
            }
            A012.setUserVisibleHint(z6);
        }
        if (r9 != null) {
            if (r83.A09(f6) != 1.0f) {
                z4 = false;
            }
            r9.setUserVisibleHint(z4);
        }
        AnonymousClass1DY r2 = this.A00;
        float f7 = r2.A01;
        if (f7 < f) {
            num = Constants.ZERO;
        } else if (f7 > f) {
            num = Constants.ONE;
        } else {
            num = Constants.A0C;
        }
        r2.A0C = num;
        r2.A01 = f;
    }

    public final void B3M(float f, Bundle bundle) {
        C27341Hl r1;
        if (!bundle.isEmpty() && !AnonymousClass1DN.A00() && f == this.A00.A0M.A05.A03() && (r1 = this.A00.A06) != null && (r1 instanceof AnonymousClass1HN)) {
            ((AnonymousClass1HN) r1).BhS(bundle);
        }
    }
}
