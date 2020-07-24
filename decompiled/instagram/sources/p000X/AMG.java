package p000X;

import android.animation.Animator;
import android.view.View;

/* renamed from: X.AMG */
public final class AMG implements C34861fQ {
    public Animator A00;
    public editInstagramCommentData A01;
    public AMD A02;
    public C23430AMd A03;
    public boolean A04;
    public final AMS A05;
    public final AMN A06;
    public final AMQ A07;
    public final C109084mu A08;
    public final C109084mu A09;

    public static String A00(AMG amg) {
        return amg.A07.A06.getText().toString().trim();
    }

    public static void A01(AMG amg, View view) {
        if (view != null) {
            C35651gi r0 = new C35651gi(view);
            r0.A05 = amg;
            r0.A00();
        }
    }

    public final void BA5(View view) {
        C23430AMd aMd = this.A03;
        if (aMd != null && view == this.A05.A03) {
            aMd.A04();
        }
    }

    public final boolean BR2(View view) {
        C23430AMd aMd = this.A03;
        if (aMd != null) {
            AMS ams = this.A05;
            if (view == ams.A00) {
                aMd.A01();
                View view2 = this.A05.A00;
                view2.setActivated(!view2.isActivated());
                return true;
            } else if (view == ams.A07) {
                aMd.A09();
                return true;
            } else if (view == ams.A01) {
                aMd.A02();
                return true;
            } else if (view == ams.A04) {
                aMd.A06();
                return true;
            } else if (view == ams.A06) {
                aMd.A08();
                return true;
            } else if (view == ams.A03) {
                aMd.A05();
                return true;
            } else if (view == ams.A02) {
                aMd.A07();
                return true;
            } else if (view == ams.A0C) {
                aMd.A0B(A00(this));
                return true;
            } else if (view == ams.A05) {
                aMd.A00();
                return true;
            } else if (view == ams.A08) {
                aMd.A0A();
                return true;
            }
        }
        return false;
    }

    public AMG(AMS ams, AMQ amq, AMN amn, C109084mu r4, C109084mu r5) {
        this.A05 = ams;
        this.A07 = amq;
        this.A06 = amn;
        this.A08 = r4;
        this.A09 = r5;
        amq.A00();
    }
}
