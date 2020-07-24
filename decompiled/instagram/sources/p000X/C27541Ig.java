package p000X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.imageview.CircularImageView;
import com.instagram.notifications.badging.p007ui.component.ToastingBadge;

/* renamed from: X.1Ig  reason: invalid class name and case insensitive filesystem */
public final class C27541Ig extends C27291Hg implements AnonymousClass121 {
    public static Boolean A0C;
    public int A00;
    public ImageView A01;
    public final FragmentActivity A02;
    public final AnonymousClass0C1 A03;
    public final C11200ea A04 = new C27561Ii(this);
    public final C11200ea A05 = new C27551Ih(this);
    public final C11200ea A06 = new C27571Ij(this);
    public final AnonymousClass20Q A07;
    public final C27421Hu A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    private void A00() {
        if (A0C == null) {
            boolean z = false;
            if (C06220Of.A08(StoredPreferences.A00) <= 320) {
                z = true;
            }
            A0C = Boolean.valueOf(z);
        }
        this.A08.BXE(true ^ A0C.booleanValue());
    }

    public static void A01(AnonymousClass0C1 r4, FragmentActivity fragmentActivity) {
        C52362Om r3 = new C52362Om(fragmentActivity, r4);
        r3.A0B = true;
        C52892Qp A002 = C18980sj.A00.A00();
        C52902Qq A003 = C52902Qq.A00(r4, "app_main_action_bar");
        A003.A0H = true;
        r3.A02 = A002.A02(A003.A03());
        r3.A03();
    }

    public static void A02(AnonymousClass0C1 r4, FragmentActivity fragmentActivity) {
        C257219z.A01.A00();
        C138635va A002 = C18050rE.A00.A00().A00(r4.getToken(), "long_press_tab_bar");
        A002.A00.putBoolean("show_add_account_button", true);
        AnonymousClass2TH r1 = new AnonymousClass2TH(r4);
        r1.A0Y = false;
        r1.A00().A02(fragmentActivity, A002.A00());
    }

    public static void A03(AnonymousClass1D1 r2) {
        C27171Gt r1 = new C27171Gt();
        r1.A00 = r2.AIZ().A03();
        r1.A0B = true;
        r1.A09 = "on_launch_direct_inbox";
        r2.Bsx(r1);
    }

    public static void A04(AnonymousClass1D1 r2, String str) {
        C27171Gt r1 = new C27171Gt();
        r1.A00 = r2.AIZ().A05();
        r1.A0B = true;
        r1.A09 = str;
        r2.Bsx(r1);
    }

    public final void A05(AnonymousClass1EX r15, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, View.OnClickListener onClickListener4, View.OnLongClickListener onLongClickListener) {
        View view;
        View Bgz = r15.Bgz(C0003R.layout.action_bar_title_logo, Math.round(C06220Of.A03(StoredPreferences.A00, Math.max(0, (((this.A0B ? 1 : 0) + (this.A09 ? 1 : 0)) + (this.A0A ? 1 : 0)) - 1) * 48)), 0);
        C33781dU.A00(Bgz, Constants.ONE);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) Bgz.getLayoutParams();
        if (((Boolean) AnonymousClass0L6.A02(this.A03, AnonymousClass0L7.INSTAGRAM_LOGO_ALIGNMENT, "centered", false, (AnonymousClass04H) null)).booleanValue()) {
            layoutParams.gravity = 17;
        } else {
            layoutParams.gravity = 19;
        }
        Bgz.setLayoutParams(layoutParams);
        Bgz.setOnClickListener(onClickListener);
        C33831dZ r1 = new C33831dZ();
        r1.A02 = C0003R.C0004drawable.camera_icon_action_bar;
        r1.A01 = C0003R.string.camera;
        r1.A00 = C0003R.C0005id.action_bar_left_button;
        r1.A05 = onClickListener2;
        r15.A3K(r1.A00());
        if (this.A0B) {
            Context context = StoredPreferences.A00;
            AnonymousClass0C1 r7 = this.A03;
            int i = this.A00;
            View.OnClickListener onClickListener5 = onClickListener4;
            if (r7.A05.A08()) {
                View inflate = LayoutInflater.from(context).inflate(C0003R.layout.profile_avatar_actionbar_button, r15.AYQ(), false);
                ((CircularImageView) inflate.findViewById(C0003R.C0005id.avatar)).setUrl(r7.A06.ASv());
                if (i > 0) {
                    inflate.findViewById(C0003R.C0005id.notification).setVisibility(0);
                }
                C33831dZ r12 = new C33831dZ();
                r12.A07 = inflate;
                r12.A01 = C0003R.string.profile_description;
                r12.A05 = onClickListener5;
                r12.A06 = onLongClickListener;
                r15.A4P(r12.A00());
            } else {
                AnonymousClass1LS r72 = new AnonymousClass1LS(context, C0003R.C0004drawable.profile_single, C0003R.C0004drawable.profile_single, C0003R.color.igds_text_on_color, C0003R.color.igds_icon_badge, C0003R.color.igds_text_on_color);
                if (i > 0) {
                    r72.A00();
                }
                C33831dZ r13 = new C33831dZ();
                r13.A04 = r72;
                r13.A01 = C0003R.string.profile_description;
                r13.A05 = onClickListener5;
                r13.A06 = null;
                r13.A09 = true;
                r15.A4J(r13.A00());
            }
        }
        if (this.A09) {
            AnonymousClass1LS r3 = new AnonymousClass1LS(this.A02, C0003R.C0004drawable.instagram_direct_outline_24, C0003R.C0004drawable.instagram_direct_outline_24, C0003R.color.white, C0003R.color.red_5, C0003R.color.red_5);
            C33831dZ r14 = new C33831dZ();
            r14.A04 = r3;
            r14.A01 = C0003R.string.message;
            r14.A05 = onClickListener3;
            r14.A06 = null;
            ImageView A4J = r15.A4J(r14.A00());
            this.A01 = A4J;
            A4J.setId(C0003R.C0005id.action_bar_inbox_button);
            C33871dd.A00(this.A01, C22000xg.A00.A00(this.A03));
        }
        if (this.A0A) {
            AnonymousClass20Q r2 = this.A07;
            AnonymousClass0a4.A06(r2);
            boolean z = C33921di.A00(r2.A03).A0R;
            if (z) {
                C16880pJ.A00(r2.A03).A01 = true;
            }
            FragmentActivity fragmentActivity = r2.A01;
            boolean z2 = r2.A05;
            AnonymousClass20X r32 = new AnonymousClass20X(r2);
            AnonymousClass1LS r73 = new AnonymousClass1LS(fragmentActivity, C0003R.C0004drawable.tab_activity_drawable, C0003R.C0004drawable.tab_activity_drawable, C0003R.color.white, C0003R.color.red_5, C0003R.color.white);
            if (z2) {
                View inflate2 = LayoutInflater.from(fragmentActivity).inflate(C0003R.layout.badged_action_bar_button, (ViewGroup) null, false);
                ToastingBadge toastingBadge = (ToastingBadge) inflate2;
                toastingBadge.setUseCase(AnonymousClass108.ACTIVITY_FEED);
                toastingBadge.setLifecycleOwner(fragmentActivity);
                ((ImageView) AnonymousClass1E1.A07(inflate2, C0003R.C0005id.tab_icon)).setImageDrawable(r73);
                C33831dZ r16 = new C33831dZ();
                r16.A07 = inflate2;
                r16.A01 = C0003R.string.activity_description;
                r16.A05 = r32;
                view = r15.A4P(r16.A00());
            } else {
                if (z) {
                    r73.A00();
                }
                C33831dZ r17 = new C33831dZ();
                r17.A04 = r73;
                r17.A01 = C0003R.string.activity_description;
                r17.A05 = r32;
                ImageView A4J2 = r15.A4J(r17.A00());
                A4J2.setActivated(z);
                view = A4J2;
            }
            r2.A00 = view;
        }
        A00();
    }

    public final void At1(C57822ep r3) {
        ImageView imageView = this.A01;
        if (imageView != null) {
            C33871dd.A00(imageView, r3.A00);
            A00();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003f, code lost:
        if ("activity".equals(p000X.AnonymousClass20P.A00()) == false) goto L_0x0041;
     */
    public C27541Ig(AnonymousClass0C1 r4, FragmentActivity fragmentActivity, C27421Hu r6) {
        AnonymousClass20Q r2;
        this.A03 = r4;
        this.A02 = fragmentActivity;
        this.A08 = r6;
        this.A0B = AnonymousClass1DN.A01();
        this.A0A = AnonymousClass1DX.A00();
        boolean z = AnonymousClass1DO.A00().booleanValue() ? true : z;
        z = false;
        this.A09 = !z;
        if (this.A0A) {
            r2 = new AnonymousClass20Q(this.A03, this.A02);
        } else {
            r2 = null;
        }
        this.A07 = r2;
    }

    public final void Azh() {
        super.Azh();
        if (this.A0B) {
            C23300zv.A00(this.A03).A03(C33561d7.class, this.A05);
        }
        C22000xg.A00.A03(this.A03, this);
        this.A01 = null;
    }

    public final void BE0() {
        C26971Fz r0;
        super.BE0();
        if (this.A0B) {
            C23300zv A002 = C23300zv.A00(this.A03);
            A002.A03(C33221cZ.class, this.A04);
            A002.A03(C33231ca.class, this.A06);
        }
        AnonymousClass20Q r02 = this.A07;
        if (r02 != null && (r0 = r02.A02) != null) {
            r0.A01();
        }
    }

    public final void BJx() {
        C26971Fz r0;
        super.BJx();
        if (this.A0B) {
            C23300zv A002 = C23300zv.A00(this.A03);
            A002.A02(C33221cZ.class, this.A04);
            A002.A02(C33231ca.class, this.A06);
        }
        AnonymousClass20Q r02 = this.A07;
        if (r02 != null && (r0 = r02.A02) != null) {
            r0.A02();
        }
    }

    public final void BVf(View view, Bundle bundle) {
        super.BVf(view, bundle);
        if (this.A0B) {
            C23300zv.A00(this.A03).A02(C33561d7.class, this.A05);
        }
        C22000xg.A00.A02(this.A03, this);
    }
}
