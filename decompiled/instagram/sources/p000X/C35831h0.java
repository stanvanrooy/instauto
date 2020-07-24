package p000X;

import android.view.View;
import android.widget.ImageView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.imageview.CircularImageView;
import com.instagram.common.p004ui.widget.imageview.IgImageView;
import com.instagram.p009ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.reels.p008ui.badge.ReelBrandingBadgeView;

/* renamed from: X.1h0  reason: invalid class name and case insensitive filesystem */
public final class C35831h0 {
    public static void A00(C35741gr r3) {
        C35841h1.A00(r3.A06);
        C26571Ea r1 = r3.A03;
        if (r1.A04()) {
            r1.A02(4);
        }
        C26571Ea r12 = r3.A02;
        if (r12.A04()) {
            r12.A02(4);
        }
        C26571Ea r13 = r3.A04;
        if (r13.A04()) {
            r13.A02(4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ba, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r6, p000X.AnonymousClass0L7.THREADS_STATUS_IN_IG, "stories_tray_enabled", false, (p000X.AnonymousClass04H) null)).booleanValue() == false) goto L_0x00bc;
     */
    public static void A01(AnonymousClass0C1 r6, C35741gr r7, C31581Yw r8, int i, boolean z, boolean z2, C31581Yw r12, AnonymousClass0RN r13, AnonymousClass1I2 r14) {
        boolean z3;
        C31571Yv r0;
        A00(r7);
        C35761gt r4 = r7.A06;
        r4.A04 = new C35851h2(r6, r8);
        if (r8.A04.A0Z()) {
            if (r4.A06 == null) {
                r4.A06 = (GradientSpinnerAvatarView) r4.A08.inflate();
            }
            GradientSpinnerAvatarView gradientSpinnerAvatarView = r4.A06;
            C35841h1.A04(r6, gradientSpinnerAvatarView, r8);
            if (r8.A03() || r8.A04.A0U() || r8.A06(r6)) {
                if (r4.A01 == null) {
                    r4.A01 = r4.A09.inflate();
                }
                r4.A01.setVisibility(0);
                gradientSpinnerAvatarView.A03();
            } else {
                View view = r4.A01;
                if (view != null) {
                    view.setVisibility(8);
                }
            }
            gradientSpinnerAvatarView.setVisibility(0);
            return;
        }
        C35841h1.A03(r6, r4, r8, r12, z);
        if (C35861h3.A02(r6, r8)) {
            r4.A0F.setVisibility(4);
            if (!C35861h3.A01(r6, r8)) {
                r7.A03.A02(0);
                ((ImageView) r7.A03.A01()).setImageResource(C0003R.C0004drawable.empty_story_badge);
            }
        } else if (r8.A04.A0U() || r8.A03() || r8.A06(r6) || r8.A02()) {
            if (r4.A01 == null) {
                r4.A01 = r4.A09.inflate();
            }
            r4.A01.setVisibility(0);
            r4.A0F.A05();
        } else {
            AnonymousClass22C A0D = r8.A04.A0D(r6);
            if (!(A0D == null || A0D.A01 == null || r8.A05(r6))) {
                r7.A04.A02(0);
                ((IgImageView) r7.A04.A01()).setUrl(A0D.A01, r13.getModuleName());
            }
        }
        C35841h1.A01(r4, r8);
        C35841h1.A02(r4, r8, r6, i, r13);
        if (r4.A02 == null && r14 != null && (r0 = r8.A03) != null && !r0.A04.isEmpty() && !r8.A04.A0x) {
            z3 = true;
        }
        z3 = false;
        int i2 = 8;
        if (ReelBrandingBadgeView.A00(r8.A04.A0M)) {
            r7.A02.A02(0);
            ((ReelBrandingBadgeView) r7.A02.A01()).A02(r8.A04.A0M.AH7());
            ((ReelBrandingBadgeView) r7.A02.A01()).setActiveColorState(!r8.A05(r6));
        } else if (z3) {
            r7.A02.A02(0);
            ReelBrandingBadgeView reelBrandingBadgeView = (ReelBrandingBadgeView) r7.A02.A01();
            if (r7.A00 == null) {
                r7.A00 = new AnonymousClass420(r14, reelBrandingBadgeView);
            }
            AnonymousClass420 r02 = r7.A00;
            r02.A00.A03(r8.A03);
        } else {
            r7.A02.A02(8);
        }
        C26571Ea r3 = r7.A01;
        int i3 = 8;
        if (r8.A02) {
            i3 = 0;
        }
        r3.A02(i3);
        C26571Ea r03 = r7.A05;
        if (z2) {
            i2 = 0;
        }
        r03.A02(i2);
        CircularImageView circularImageView = r7.A06.A0E;
        float f = 1.0f;
        if (z2) {
            f = 0.5f;
        }
        circularImageView.setAlpha(f);
    }
}
