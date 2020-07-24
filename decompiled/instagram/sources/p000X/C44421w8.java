package p000X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.framelayout.MediaFrameLayout;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.p009ui.mediaactions.MediaActionsView;
import java.util.Map;

/* renamed from: X.1w8  reason: invalid class name and case insensitive filesystem */
public final class C44421w8 {
    public AnonymousClass1VM A00;
    public C162096vs A01;
    public final Context A02;
    public final AnonymousClass1U8 A03;
    public final AnonymousClass0C1 A04;
    public final boolean A05;

    public static void A00(C44421w8 r13, AnonymousClass24E r14, AnonymousClass1NJ r15, C36841ih r16, C27371Ho r17) {
        IgProgressImageView igProgressImageView = r14.A06;
        boolean A08 = igProgressImageView.A08();
        igProgressImageView.A04(C0003R.C0005id.listener_id_for_media_tag_indicator);
        AnonymousClass0C1 r7 = r13.A04;
        C32341az r5 = r14.A07;
        C32191ak r8 = r5.A01;
        AnonymousClass0a4.A06(r8);
        AnonymousClass1U8 r4 = r13.A03;
        C36841ih r3 = r16;
        AnonymousClass1U8 r9 = r4;
        C38711li.A00(r7, r8, r9, C108934mf.A00(r15, r3, r4, r5, r17, r7), r15, r3);
        if (!A08) {
            r14.A06.A05(C0003R.C0005id.listener_id_for_media_tag_indicator, new AnonymousClass24M(r13, r14, r15, r16, r17));
        }
    }

    public final void A02(View view, AnonymousClass1NJ r25, C36841ih r26, int i, int i2, C32141af r29, C32221an r30, C27371Ho r31, Integer num, boolean z, boolean z2, Map map, Map map2) {
        AnonymousClass24E r12 = (AnonymousClass24E) view.getTag();
        int i3 = i2;
        AnonymousClass1NJ r5 = r25;
        AnonymousClass1NJ A0P = r5.A0P(i3);
        C36841ih r1 = r12.A05;
        C36841ih r14 = r26;
        if (!(r1 == null || r1 == r14)) {
            r1.A0C(r12, true);
        }
        r12.A05 = r14;
        r14.A0B(r12, true);
        C32221an r8 = r30;
        r12.A01 = r8;
        int i4 = i;
        r12.A0A.setOnTouchListener(new AnonymousClass24F(this, z, r12, r5, r14, i4));
        r12.A0A.setOnClickListener(new AnonymousClass24I(this, r5, r14, i4, r12));
        r12.A0A.setAspectRatio(A0P.A05());
        r12.A06.A05(C0003R.C0005id.listener_id_for_media_view_binder, new AnonymousClass24J(this, r14, A0P, r12));
        IgProgressImageView igProgressImageView = r12.A06;
        igProgressImageView.A0F.put(C0003R.C0005id.listener_id_for_media_view_binder, new AnonymousClass24K(this, r14));
        r14.A08 = 0;
        C27371Ho r4 = r31;
        C38641lb.A00(this.A04, A0P, r12.A06, r4, (Context) null);
        if (i3 != r14.A01) {
            r12.A06.setVisibility(0);
        } else {
            if (this.A00 == null) {
                this.A00 = new AnonymousClass1VM();
            }
            AnonymousClass1VM r2 = this.A00;
            r2.A01(r12.A08, r12.A06, r29, A0P, r14);
        }
        C38761ln.A00(r12.A00);
        C38781lp.A00(r8, A0P, r14);
        if (r14.A0h) {
            r12.A08.setVisibility(4);
        }
        C38771lo.A00(r12.A06, A0P, r5.A0c(this.A04).A0B(), i2 + 1, r5.A07());
        if (!this.A05 || !r5.A1h(i3)) {
            FrameLayout frameLayout = r12.A03.A02;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
        } else {
            C158396pY.A00(r12.A03, r5, i3, this.A03, (AnonymousClass1VK) null);
        }
        if (!AnonymousClass1VY.A00(this.A04).A01()) {
            C32251aq r7 = r12.A09;
            AnonymousClass1U8 r22 = this.A03;
            C27371Ho r19 = r4;
            AnonymousClass1U8 r20 = r22;
            AnonymousClass1NJ r17 = r5;
            C32251aq r16 = r7;
            C39001mC.A00(r16, r17, r14, r19, r20, this.A04, this.A02);
        }
        C39111mN.A00(r12.A04, this.A04, new AnonymousClass24L(this, A0P, r14, i4, r12), false, num);
        if (z2) {
            AnonymousClass0a4.A06(this.A01);
            C32191ak r0 = r12.A07.A01;
            AnonymousClass0a4.A06(r0);
            r0.A08();
            C32321ax r02 = r12.A07.A03;
            AnonymousClass0a4.A06(r02);
            r02.A00.A01().setVisibility(0);
            C162066vp.A01(r12.A07.A03.A00.A01(), this.A04, A0P, map, map2, this.A01);
            return;
        }
        C32321ax r03 = r12.A07.A03;
        AnonymousClass0a4.A06(r03);
        r03.A00();
        A00(this, r12, A0P, r14, r4);
    }

    public C44421w8(Context context, AnonymousClass1U8 r2, C162096vs r3, AnonymousClass0C1 r4, boolean z) {
        this.A02 = context;
        this.A03 = r2;
        this.A04 = r4;
        this.A05 = z;
        this.A01 = r3;
    }

    public final View A01(Context context, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(C0003R.layout.row_feed_carousel_media_video, viewGroup, false);
        inflate.setTag(new AnonymousClass24E((MediaFrameLayout) inflate.findViewById(C0003R.C0005id.carousel_video_media_group), (IgProgressImageView) inflate.findViewById(C0003R.C0005id.carousel_video_image), (MediaActionsView) inflate.findViewById(C0003R.C0005id.carousel_video_media_actions), new C32231ao((ViewStub) inflate.findViewById(C0003R.C0005id.media_subtitle_view_stub)), new C32261ar((ViewGroup) inflate), new C32241ap((ViewStub) inflate.findViewById(C0003R.C0005id.media_gating_view_stub)), new C32251aq(this.A04, inflate), new C32291au((ViewStub) inflate.findViewById(C0003R.C0005id.zero_rating_video_play_button_stub)), new C32191ak(inflate, this.A04), new C32321ax(inflate)));
        return inflate;
    }
}
