package p000X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.imageview.CircularImageView;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import java.io.IOException;

/* renamed from: X.BX6 */
public class BX6 extends C27341Hl implements AnonymousClass1HK, AnonymousClass1HM {
    public TextView A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public CircularImageView A04;
    public AnonymousClass1OC A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public View A09;
    public QuickPromotionSlot A0A;
    public BX4 A0B;
    public AnonymousClass0C1 A0C;
    public boolean A0D;
    public final Handler A0E = new Handler(Looper.getMainLooper());

    public String getModuleName() {
        return "quick promotion";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public AnonymousClass1OC A00() {
        if (!(this instanceof C25721BWr)) {
            C17640qZ r2 = C17640qZ.A00;
            AnonymousClass0C1 r5 = this.A0C;
            QuickPromotionSlot quickPromotionSlot = this.A0A;
            AnonymousClass1NW A032 = r2.A03();
            A032.A05 = new BXA(this);
            return r2.A09(this, this, r5, quickPromotionSlot, A032.A00());
        }
        C25721BWr bWr = (C25721BWr) this;
        Bundle bundle = bWr.mArguments;
        return new C25722BWs(bWr, (ViewGroup) null, bWr, AnonymousClass0J1.A06(bundle), QuickPromotionSlot.valueOf(bundle.getString("QuickPromotionIIGFullscreenFragment.KEY_PROMOTION_SLOT")));
    }

    public final void configureActionBar(AnonymousClass1EX r4) {
        if (this.A0D) {
            r4.Bo0(false);
            r4.Bnz(true);
            r4.Bo6(true);
            AnonymousClass2xx r1 = new AnonymousClass2xx(Constants.ZERO);
            r1.A01(-1);
            r1.A03 = C0003R.C0004drawable.instagram_x_outline_24;
            r4.BmE(r1.A00());
            C06220Of.A0S(this.A09, getContext().getResources().getDimensionPixelSize(C0003R.dimen.fullscreen_top_margin) - r4.AFM());
        } else {
            r4.Bnz(false);
        }
        View view = this.mView;
        if (view != null) {
            view.requestLayout();
        }
    }

    public boolean onBackPressed() {
        if (!(this instanceof C25721BWr)) {
            return !this.A0D;
        }
        return false;
    }

    public final C06590Pq getSession() {
        return this.A0C;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0068, code lost:
        if (r1 == null) goto L_0x006a;
     */
    public final void onCreate(Bundle bundle) {
        boolean z;
        int A022 = AnonymousClass0Z0.A02(-250411626);
        super.onCreate(bundle);
        registerLifecycleListener(new C128275eQ(getActivity()));
        Bundle bundle2 = this.mArguments;
        String string = bundle2.getString("QuickPromotionIIGFullscreenFragment.KEY_PROMOTION_SLOT");
        AnonymousClass0a4.A06(string);
        this.A0A = QuickPromotionSlot.valueOf(string);
        this.A07 = bundle2.getBoolean("QuickPromotionIIGFullscreenFragment.KEY_FRAGMENT_TAG_LAUNCH_AS_MODAL");
        String string2 = bundle2.getString("QuickPromotionIIGFullscreenFragment.KEY_QUICK_PROMOTION");
        BX4 bx4 = null;
        if (!TextUtils.isEmpty(string2)) {
            try {
                C13080hr A0A2 = C12890hY.A00.A0A(string2);
                A0A2.A0p();
                bx4 = BX7.parseFromJson(A0A2);
            } catch (IOException unused) {
                AnonymousClass0QD.A01("IG-QP", "Error parsing fullscreen interstitial promotion");
            }
        }
        this.A0B = bx4;
        this.A0C = AnonymousClass0J1.A06(bundle2);
        AnonymousClass1OC A002 = A00();
        this.A05 = A002;
        BX4 bx42 = this.A0B;
        if (bx42 != null) {
            C49382Bx r1 = bx42.A05.A01;
            z = true;
        }
        z = false;
        this.A0D = z;
        registerLifecycleListener(A002);
        AnonymousClass0Z0.A09(-2079502541, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(74595038);
        View inflate = layoutInflater.inflate(C0003R.layout.quick_promotion_fullscreen_fragment, viewGroup, false);
        this.A01 = (TextView) inflate.findViewById(C0003R.C0005id.primary_button);
        this.A02 = (TextView) inflate.findViewById(C0003R.C0005id.secondary_button);
        this.A00 = (TextView) inflate.findViewById(C0003R.C0005id.content);
        this.A03 = (TextView) inflate.findViewById(C0003R.C0005id.title);
        this.A04 = (CircularImageView) inflate.findViewById(C0003R.C0005id.image);
        this.A09 = inflate.findViewById(C0003R.C0005id.content_container);
        AnonymousClass0Z0.A09(-611421880, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(1860739984);
        unregisterLifecycleListener(this.A05);
        super.onDestroy();
        AnonymousClass0Z0.A09(603815649, A022);
    }

    public final void onResume() {
        FragmentActivity activity;
        int A022 = AnonymousClass0Z0.A02(-1005231194);
        super.onResume();
        BX4 bx4 = this.A0B;
        if (bx4 == null || this.A08) {
            this.mFragmentManager.A0W();
            if (this.A07 && (activity = getActivity()) != null) {
                activity.finish();
            }
            this.A06 = true;
        } else {
            this.A05.BGv(bx4);
            C49262Bl r3 = bx4.A05;
            C49282Bn r1 = r3.A08;
            C49282Bn r0 = r1;
            if (r1 != null) {
                this.A03.setText(r0.A00);
            }
            C49322Br r12 = r3.A04;
            C49322Br r02 = r12;
            if (r12 != null) {
                this.A00.setText(r02.A00);
            }
            C49382Bx r13 = r3.A02;
            C49382Bx r03 = r13;
            if (r13 != null) {
                this.A01.setText(r03.A00.A00);
                this.A01.setOnClickListener(new BX8(this, bx4));
            }
            C49382Bx r14 = r3.A03;
            C49382Bx r04 = r14;
            if (r14 != null) {
                this.A02.setText(r04.A00.A00);
                this.A02.setOnClickListener(new BX9(this, bx4));
            }
            C49402Bz r15 = r3.A06;
            C49402Bz r05 = r15;
            if (r15 != null) {
                this.A04.setUrl(r05.A00);
            }
        }
        AnonymousClass0Z0.A09(-2132604014, A022);
    }
}
