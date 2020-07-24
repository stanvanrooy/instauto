package p000X;

import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.p009ui.widget.slideouticon.SlideInAndOutIconView;

/* renamed from: X.1wN  reason: invalid class name and case insensitive filesystem */
public final class C44571wN extends C44581wO {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C32541bR A01;
    public final /* synthetic */ AnonymousClass1VV A02;
    public final /* synthetic */ C44401w6 A03;
    public final /* synthetic */ AnonymousClass1NJ A04;
    public final /* synthetic */ C27371Ho A05;
    public final /* synthetic */ C36841ih A06;

    public C44571wN(AnonymousClass1VV r1, C32541bR r2, C36841ih r3, C44401w6 r4, AnonymousClass1NJ r5, int i, C27371Ho r7) {
        this.A02 = r1;
        this.A01 = r2;
        this.A06 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A00 = i;
        this.A05 = r7;
    }

    public final void BDU(int i, int i2) {
        AnonymousClass2YN.A03(this.A01.A00(), (CharSequence) null);
        this.A06.A05(i);
    }

    public final void BLD(float f, float f2, C32501bN r7) {
        C32541bR r1 = this.A01;
        if (r1.A01.Aho()) {
            ReboundViewPager reboundViewPager = r1.A09;
            int i = reboundViewPager.A07;
            int i2 = reboundViewPager.A08;
            float abs = Math.abs(((float) i) - f);
            C36841ih r12 = this.A06;
            r12.A07 = i;
            r12.A03 = i2;
            r12.A00 = abs;
            C36841ih.A01(r12, 14);
        }
    }

    public final void BLO(C32501bN r4, C32501bN r5) {
        C36841ih r1 = this.A06;
        if (r4 != r1.A0B) {
            r1.A0B = r4;
            C36841ih.A01(r1, 16);
        }
        AnonymousClass27S r0 = this.A06.A0G;
        if (r0 != null) {
            r0.A01();
        }
        C36841ih r2 = this.A06;
        boolean z = false;
        if (r4 != C32501bN.IDLE) {
            z = true;
        }
        r2.A0l = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007c, code lost:
        if (r14 < r15) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x019d, code lost:
        if (r6 >= r4.A07()) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01d0, code lost:
        if (p000X.AnonymousClass1YN.A02(r2, "ig_select_video_nux") != false) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x022a, code lost:
        if (r14 > r15) goto L_0x022c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01f3 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    public final void BDi(int i, int i2) {
        AnonymousClass1NJ r5;
        AnonymousClass1VV r2;
        Integer num;
        AnonymousClass1RS r3;
        C36341ht A0C;
        int i3;
        AnonymousClass1NJ A0P;
        boolean z;
        boolean z2;
        int i4 = i2;
        if (C43261u6.A00() && i2 == 0) {
            C05760Lv r4 = C05760Lv.A01;
            r4.A00.edit().putInt("number_of_carousels_swiped", r4.A00.getInt("number_of_carousels_swiped", 0) + 1).apply();
            if (!C43261u6.A00()) {
                AnonymousClass0Z1.A00(this.A03, -827705224);
            }
        }
        int i5 = i;
        AnonymousClass1NJ A0P2 = this.A04.A0P(i);
        if (i2 >= 0) {
            r5 = this.A04.A0P(i2);
        } else {
            r5 = null;
        }
        AnonymousClass1U5 r6 = this.A02.A02;
        AnonymousClass1NJ r7 = this.A04;
        r6.Auu(r7, r7.A0P(i2), A0P2, this.A00, i4, i5);
        this.A06.A06(i);
        if (((Boolean) AnonymousClass0L6.A02(this.A02.A04, AnonymousClass0L7.MULTIPOST_VIDEO_PERFORMANCE_IMPROVEMENT_LAUNCHER, "handle_edge_case", false, (AnonymousClass04H) null)).booleanValue()) {
            if (i != 0) {
                if (i != this.A04.A07() - 1) {
                    if (i <= i2) {
                    }
                }
            }
            r2 = this.A02;
            num = Constants.ONE;
            r2.A00 = num;
            if (!A0P2.AiO()) {
                AnonymousClass24E r52 = (AnonymousClass24E) this.A01.A09.A0C.getTag();
                if (C36351hu.A00(this.A02.A04).A01()) {
                    AnonymousClass1RJ r42 = this.A02.A03;
                    AnonymousClass1NJ r32 = this.A04;
                    C36841ih r22 = this.A06;
                    r42.A0D(r32, r22, r52, r22.A12);
                } else {
                    C32291au r62 = r52.A04;
                    AnonymousClass1VV r0 = this.A02;
                    C39111mN.A00(r62, r0.A04, new DT6(this, A0P2, r52), false, r0.A03.AaD(A0P2));
                    AnonymousClass1VV r33 = this.A02;
                    if (AnonymousClass1YN.A00(r33.A04)) {
                        AnonymousClass0C1 r23 = r33.A04;
                        if (!AnonymousClass1YN.A02(r23, "ig_video_nux")) {
                            z2 = false;
                        }
                        z2 = true;
                        if (z2) {
                            r52.APt().A08(C0003R.C0004drawable.spinsta_data_white, C95364Ay.A00(AnonymousClass1CF.A00(r33.A04).AYV(), r33.A01), C29751Rc.A09);
                        }
                    }
                }
                if (!AnonymousClass1VY.A00(this.A02.A04).A01()) {
                    C32251aq r24 = r52.A09;
                    AnonymousClass1NJ r34 = this.A04;
                    C36841ih r43 = this.A06;
                    C27371Ho r53 = this.A05;
                    AnonymousClass1VV r02 = this.A02;
                    C39001mC.A00(r24, r34, r43, r53, r02.A02, r02.A04, r02.A01);
                }
            } else {
                if (r5 != null && r5.AiO() && ((A0C = r3.A0C()) == C36341ht.PLAYING || A0C == C36341ht.PREPARING || A0C == C36341ht.PREPARED)) {
                    (r3 = this.A02.A03.A0T).A0M("scroll", false, false);
                }
                this.A06.A16 = false;
                SlideInAndOutIconView slideInAndOutIconView = this.A01.A04.A00;
                if (slideInAndOutIconView != null) {
                    slideInAndOutIconView.setVisibility(8);
                }
            }
            i3 = i + 1;
            int i6 = i - 1;
            if (i3 < this.A04.A07()) {
                AnonymousClass12C.A0c.A0D(this.A04.A0P(i3).A0S(this.A01.A09.getContext()), this.A05.getModuleName()).A01();
            }
            if (!((Boolean) AnonymousClass0L6.A02(this.A02.A04, AnonymousClass0L7.MULTIPOST_VIDEO_PERFORMANCE_IMPROVEMENT_LAUNCHER, "enable_feature", false, (AnonymousClass04H) null)).booleanValue()) {
                AnonymousClass1VV r54 = this.A02;
                AnonymousClass1NJ r44 = this.A04;
                C27371Ho r35 = this.A05;
                Integer num2 = r54.A00;
                if (num2 != Constants.ZERO || i6 < 0) {
                    if (num2 == Constants.ONE) {
                        i6 = i3;
                    }
                    i6 = -1;
                }
                if (i6 >= 0 && (A0P = r44.A0P(i6)) != null && A0P.AiO()) {
                    String moduleName = r35.getModuleName();
                    AnonymousClass0C1 r45 = r54.A04;
                    AnonymousClass0L7 r36 = AnonymousClass0L7.MULTIPOST_VIDEO_PERFORMANCE_IMPROVEMENT_LAUNCHER;
                    if (((Boolean) AnonymousClass0L6.A02(r45, r36, "warmup_while_swiping", false, (AnonymousClass04H) null)).booleanValue()) {
                        z = true;
                    } else if (((Boolean) AnonymousClass0L6.A02(r54.A04, r36, "warmup_while_swiping_feed_only", false, (AnonymousClass04H) null)).booleanValue()) {
                        z = moduleName.equals("feed_timeline");
                    } else {
                        z = false;
                    }
                    if (z) {
                        AnonymousClass27O.A00(r54.A01, r54.A04, A0P.A0e(), moduleName, 0);
                        return;
                    } else if (((Boolean) AnonymousClass0L6.A02(r54.A04, r36, "prefetch_while_swiping", false, (AnonymousClass04H) null)).booleanValue()) {
                        C39831nd.A00(new C39821nc(A0P.A0e(), moduleName), r54.A04);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        r2 = this.A02;
        num = Constants.ZERO;
        r2.A00 = num;
        if (!A0P2.AiO()) {
        }
        i3 = i + 1;
        int i62 = i - 1;
        if (i3 < this.A04.A07()) {
        }
        if (!((Boolean) AnonymousClass0L6.A02(this.A02.A04, AnonymousClass0L7.MULTIPOST_VIDEO_PERFORMANCE_IMPROVEMENT_LAUNCHER, "enable_feature", false, (AnonymousClass04H) null)).booleanValue()) {
        }
    }
}
