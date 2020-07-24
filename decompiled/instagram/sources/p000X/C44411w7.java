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
import com.instagram.tagging.widget.MediaTagHintsLayout;
import com.instagram.tagging.widget.TagsLayout;
import java.util.Map;

/* renamed from: X.1w7  reason: invalid class name and case insensitive filesystem */
public final class C44411w7 {
    public C162096vs A00;
    public final Context A01;
    public final AnonymousClass1U6 A02;
    public final AnonymousClass0C1 A03;
    public final boolean A04;

    public static void A00(C44411w7 r14, C44461wC r15, AnonymousClass1NJ r16, AnonymousClass1NJ r17, C36841ih r18, boolean z, Map map, Map map2, C27371Ho r22) {
        boolean A1O;
        boolean A1P;
        C44461wC r9 = r15;
        boolean A08 = r15.A02.A08();
        boolean z2 = z;
        AnonymousClass1NJ r11 = r17;
        AnonymousClass1NJ r10 = r16;
        if (z) {
            A1O = !r10.A1P();
            A1P = false;
        } else {
            A1O = r11.A1O();
            A1P = r11.A1P();
        }
        r15.A02.A04(C0003R.C0005id.listener_id_for_media_tag_indicator);
        C36841ih r12 = r18;
        Map map3 = map2;
        C44411w7 r8 = r14;
        C27371Ho r162 = r22;
        Map map4 = map;
        if (z) {
            AnonymousClass0a4.A06(r8.A00);
            C32191ak r1 = r9.A04.A01;
            AnonymousClass0a4.A06(r1);
            r1.A08();
            C32321ax r13 = r9.A04.A03;
            AnonymousClass0a4.A06(r13);
            r13.A00.A01().setVisibility(0);
            C162066vp.A01(r9.A04.A03.A00.A01(), r8.A03, r11, map, map2, r8.A00);
        } else {
            C32321ax r19 = r9.A04.A03;
            AnonymousClass0a4.A06(r19);
            r19.A00();
            AnonymousClass0C1 r6 = r8.A03;
            C32341az r5 = r9.A04;
            C32191ak r2 = r5.A01;
            AnonymousClass0a4.A06(r2);
            AnonymousClass1U6 r192 = r8.A02;
            C38711li.A00(r6, r2, r192, C108934mf.A00(r17, r18, r192, r5, r162, r6), r11, r12);
            if (AnonymousClass1VY.A00(r8.A03).A02(r11, r12)) {
                AnonymousClass0C1 r23 = r8.A03;
                C32181aj r110 = r9.A04.A00;
                AnonymousClass0a4.A06(r110);
                C38731lk.A01(r23, r11, r12, r110, A08);
            } else {
                C32181aj r111 = r9.A04.A00;
                AnonymousClass0a4.A06(r111);
                C38731lk.A00(r12, r111, false);
            }
        }
        if (A08) {
            return;
        }
        if (A1O || A1P) {
            r9.A02.A05(C0003R.C0005id.listener_id_for_media_tag_indicator, new AnonymousClass2CX(r8, r9, r10, r11, r12, z2, map4, map3, r162));
        }
    }

    public C44411w7(Context context, AnonymousClass0C1 r2, AnonymousClass1U6 r3, C162096vs r4, boolean z) {
        this.A01 = context;
        this.A03 = r2;
        this.A02 = r3;
        this.A04 = z;
        this.A00 = r4;
    }

    public final View A01(Context context, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(C0003R.layout.row_feed_carousel_media_image, viewGroup, false);
        inflate.setTag(new C44461wC((MediaFrameLayout) inflate, (IgProgressImageView) inflate.findViewById(C0003R.C0005id.carousel_image), new C32171ai(this.A03, (TagsLayout) inflate.findViewById(C0003R.C0005id.row_feed_photo_tags)), new C32181aj(this.A03, (MediaTagHintsLayout) inflate.findViewById(C0003R.C0005id.row_feed_photo_media_tag_hints)), new C32191ak(inflate, this.A03), new C32261ar((ViewGroup) inflate), new C32241ap((ViewStub) inflate.findViewById(C0003R.C0005id.media_gating_view_stub)), new C32321ax(inflate)));
        return inflate;
    }

    public final void A02(View view, AnonymousClass1NJ r19, C36841ih r20, int i, int i2, boolean z, Map map, Map map2, C27371Ho r26, AnonymousClass1LO r27) {
        C44461wC r7 = (C44461wC) view.getTag();
        int i3 = i2;
        AnonymousClass1NJ r8 = r19;
        AnonymousClass1NJ A0P = r8.A0P(i3);
        C36841ih r10 = r20;
        C44461wC r13 = r7;
        r7.A02.setOnTouchListener(new C44471wD(this, r13, i, r8, r10));
        r7.A02.A05(C0003R.C0005id.listener_id_for_media_view_binder, new C44501wG(this, r27, A0P, r10, r7));
        if (((Boolean) AnonymousClass0L6.A02(this.A03, AnonymousClass0L7.CAROUSEL_PROGRESSIVE_IMAGE_CONFIG, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            r7.A02.setProgressiveImageConfig(new C38631la());
        }
        IgProgressImageView igProgressImageView = r7.A02;
        igProgressImageView.A0F.put(C0003R.C0005id.listener_id_for_media_view_binder, new C44511wH(this, r10));
        r10.A08 = 0;
        C27371Ho r14 = r26;
        C38641lb.A00(this.A03, A0P, r7.A02, r14, (Context) null);
        r7.A03.setAspectRatio(A0P.A05());
        C38771lo.A00(r7.A02, A0P, r8.A0c(this.A03).A0B(), i2 + 1, r8.A07());
        A00(this, r7, r8, A0P, r10, z, map, map2, r14);
        AnonymousClass1VY A002 = AnonymousClass1VY.A00(this.A03);
        C32171ai r2 = r7.A04.A02;
        AnonymousClass0a4.A06(r2);
        C38751lm.A00(r2, A0P, r10, this.A03, A002.A02(A0P, r10));
        if (!this.A04 || !r8.A1h(i3)) {
            FrameLayout frameLayout = r7.A01.A02;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
                return;
            }
            return;
        }
        C158396pY.A00(r7.A01, r8, i3, this.A02, (AnonymousClass1VK) null);
    }
}
