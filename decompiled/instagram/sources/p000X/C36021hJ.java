package p000X;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.p004ui.widget.imageview.IgImageView;
import com.instagram.p009ui.widget.gradientspinner.GradientSpinner;
import com.instagram.p009ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.1hJ  reason: invalid class name and case insensitive filesystem */
public final class C36021hJ extends AnonymousClass1ZK implements C35591gc, C35611ge {
    public int A00;
    public ImageView A01;
    public C31581Yw A02;
    public C35821gz A03;
    public C43121tr A04;
    public boolean A05 = false;
    public boolean A06 = false;
    public final C35691gm A07;
    public final Context A08;
    public final View A09;
    public final ViewStub A0A;
    public final FrameLayout A0B;
    public final IgImageView A0C;
    public final C26571Ea A0D;
    public final C35741gr A0E;
    public final C35631gg A0F;
    public final C35621gf A0G;
    public final boolean A0H;

    public C36021hJ(View view, boolean z) {
        super(view);
        this.A08 = view.getContext();
        this.A0H = z;
        this.A0E = new C35741gr(view.findViewById(C0003R.C0005id.avatar_container));
        this.A0G = new C35621gf(view);
        this.A0F = new C35631gg(view, false);
        this.A0C = (IgImageView) view.findViewById(C0003R.C0005id.background_content);
        this.A09 = view.findViewById(C0003R.C0005id.background_content_black_gradient);
        this.A0B = (FrameLayout) view.findViewById(C0003R.C0005id.in_feed_item_container);
        C26571Ea r1 = new C26571Ea((ViewStub) view.findViewById(C0003R.C0005id.background_media_gating_view_stub));
        this.A0D = r1;
        r1.A03(new C59242hG(this));
        this.A0A = (ViewStub) view.findViewById(C0003R.C0005id.livewith_avatar_stub);
        FrameLayout frameLayout = this.A0B;
        this.A07 = C35641gh.A00(frameLayout, frameLayout, this);
    }

    public final boolean BnP() {
        return true;
    }

    public final C43121tr A00() {
        if (this.A04 == null) {
            this.A04 = new C43121tr(this.A0A.inflate());
        }
        return this.A04;
    }

    public final GradientSpinnerAvatarView A01() {
        C35761gt r1 = this.A0E.A06;
        if (r1.A06 == null) {
            r1.A06 = (GradientSpinnerAvatarView) r1.A08.inflate();
        }
        return r1.A06;
    }

    public final RectF AGQ() {
        View AGS;
        C31581Yw r1 = this.A02;
        if (r1 != null && r1.A04.A0Z()) {
            AGS = A01();
        } else if (r1 == null || !r1.A04()) {
            AGS = AGS();
        } else {
            AGS = A00().A01;
        }
        return C06220Of.A0A(AGS);
    }

    public final View AGR() {
        return this.A0G.A02;
    }

    public final View AGS() {
        return this.A0E.AGS();
    }

    public final C35821gz AR7() {
        return this.A03;
    }

    public final View ATg() {
        return this.itemView;
    }

    public final String ATm() {
        return this.A0G.A01;
    }

    public final GradientSpinner ATs() {
        return this.A0E.A06.A0F;
    }

    public final void AbC(float f) {
        float f2 = 1.0f - f;
        this.A0G.A02.setAlpha(f2);
        this.A09.setAlpha(f2);
        this.A0C.setAlpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    }

    public final void AcW() {
        C31581Yw r2 = this.A02;
        if (r2 != null && r2.A04.A0Z()) {
            A01().setVisibility(4);
        } else if (r2 == null || !r2.A04()) {
            AGS().setVisibility(4);
        } else {
            A00().A01.setVisibility(4);
        }
    }

    public final void Bk4(C476324u r2) {
        this.A0G.A00 = r2;
    }

    public final void Bo5() {
        C31581Yw r2 = this.A02;
        if (r2 != null && r2.A04.A0Z()) {
            A01().setVisibility(0);
        } else if (r2 == null || !r2.A04()) {
            AGS().setVisibility(0);
        } else {
            A00().A01.setVisibility(0);
        }
    }
}
