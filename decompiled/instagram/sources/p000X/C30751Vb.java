package p000X;

import android.content.Context;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.common.p004ui.widget.framelayout.MediaFrameLayout;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.p009ui.mediaactions.LikeActionView;
import com.instagram.p009ui.mediaactions.MediaActionsView;

/* renamed from: X.1Vb  reason: invalid class name and case insensitive filesystem */
public final class C30751Vb {
    public AnonymousClass1VM A00;
    public final Context A01;
    public final AnonymousClass1UF A02;
    public final AnonymousClass0C1 A03;

    /* JADX WARNING: Removed duplicated region for block: B:10:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0135  */
    public final void A02(C36411i0 r24, AnonymousClass1NJ r25, C36841ih r26, int i, C32141af r28, AnonymousClass1PD r29, AnonymousClass0RN r30, Integer num) {
        int i2;
        int i3;
        C36841ih r0;
        int i4;
        Integer valueOf;
        Integer valueOf2;
        int intValue;
        String str;
        int i5 = i;
        C36411i0 r7 = r24;
        AnonymousClass0RN r3 = r30;
        AnonymousClass1VW r9 = new AnonymousClass1VW(this.A01, this.A03, r3, new DTM(this, i5, r7));
        AnonymousClass1NJ r6 = r25;
        Integer A002 = AnonymousClass6QW.A00(r6);
        int i6 = 0;
        int i7 = 8;
        C36841ih r5 = r26;
        if (A002 == Constants.ONE) {
            r9.A04(r7.A0B, r6, r5);
            i2 = 8;
        } else {
            if (A002 == Constants.A0C) {
                r9.A04(r7.A0B, r6, r5);
                i2 = 0;
                i3 = 0;
            } else if (A002 == Constants.A0N) {
                r9.A04(r7.A0B, r6, r5);
                i2 = 0;
            } else {
                if (C17050pb.A08(r6, r5.A01)) {
                    r7.A05.setVisibility(0);
                    r7.A08.setText(C17050pb.A02(this.A01, r6, r5.AHt()));
                } else {
                    r7.A05.setVisibility(4);
                }
                i2 = 0;
                i3 = 8;
                i6 = 8;
                i7 = 0;
            }
            r7.A05.setVisibility(i7);
            r7.A03.setVisibility(i7);
            r7.A0B.A04.setVisibility(i6);
            r7.A04.setVisibility(i2);
            r7.A06.setVisibility(i3);
            r0 = r7.A01;
            i4 = 0;
            if (!(r0 == null || r0 == r5)) {
                r0.A0C(r7, false);
                r7.A01.A0K(r7.A0H);
                r7.A01.A0H(r7.A0C.A00());
            }
            r7.A01 = r5;
            r7.A00 = r6;
            r5.A0B(r7, false);
            r7.A0H.A00();
            r5.A0I(r7.A0H);
            AnonymousClass1NJ A0O = r6.A0O();
            MediaFrameLayout mediaFrameLayout = r7.A0A;
            IgProgressImageView igProgressImageView = r7.A0G;
            C36841ih r19 = r5;
            mediaFrameLayout.setAspectRatio(A0O.A05());
            igProgressImageView.A05(C0003R.C0005id.listener_id_for_media_view_binder, new DTL(this, r5, A0O, r7));
            igProgressImageView.A0F.put(C0003R.C0005id.listener_id_for_media_view_binder, new DTN(this, r5));
            AnonymousClass1PD r13 = r29;
            igProgressImageView.setImageRenderer(r13);
            igProgressImageView.setProgressiveImageConfig(new C38631la());
            r5.A08 = 0;
            C38641lb.A00(this.A03, A0O, igProgressImageView, r3, (Context) null);
            r7.A0A.setOnTouchListener(new DTE(this, r7, i5, r6, r19));
            C39041mG.A01(r7.A0D, r6, r5, this.A03, this.A02);
            if (this.A00 == null) {
                this.A00 = new AnonymousClass1VM();
            }
            this.A00.A01(r7.A0I, r7.A0G, r28, A0O, r19);
            C38781lp.A00(r7.A0C, A0O, r5);
            C39111mN.A00(r7.A0F, this.A03, new DTK(this, r6, r5, i5, r7), false, num);
            int i8 = 1;
            int size = r6.A2X.size() - 1;
            int size2 = r7.A0J.size();
            if (AnonymousClass6QW.A00(r6) == Constants.A0C) {
                i8 = 0;
            }
            valueOf = Integer.valueOf(size2 - i8);
            valueOf2 = Integer.valueOf(size);
            if (valueOf == null || valueOf2 == null ? valueOf == null : valueOf.compareTo(valueOf2) > 0) {
                valueOf = valueOf2;
            }
            intValue = valueOf.intValue();
            while (i4 < intValue) {
                Pair pair = (Pair) r7.A0J.get(i4);
                MediaFrameLayout mediaFrameLayout2 = (MediaFrameLayout) pair.first;
                IgProgressImageView igProgressImageView2 = (IgProgressImageView) pair.second;
                int i9 = i4 + 1;
                AnonymousClass1NJ r1 = (AnonymousClass1NJ) r6.A2X.get(i9);
                mediaFrameLayout2.setAspectRatio(r1.A05());
                igProgressImageView2.setImageRenderer(r13);
                igProgressImageView2.setProgressiveImageConfig(new C38631la());
                C38641lb.A00(this.A03, r1, igProgressImageView2, r3, (Context) null);
                C33061cJ r2 = new C33061cJ(C33051cI.THUMBNAIL_LINK);
                if (r1 != null) {
                    str = r1.getId();
                } else {
                    str = null;
                }
                r2.A02 = str;
                C32991cC.A00(this.A03).A05(mediaFrameLayout2, r2.A00());
                C32991cC.A00(this.A03).A04(mediaFrameLayout2, new C38231kw(r6, this.A03, r3, (C39031mF) null));
                int i10 = i4;
                MediaFrameLayout mediaFrameLayout3 = mediaFrameLayout2;
                C36411i0 r17 = r7;
                AnonymousClass0C1 r16 = this.A03;
                mediaFrameLayout2.setOnTouchListener(new DTF(this, r16, r17, mediaFrameLayout3, i10, i5, r6, r5));
                i4 = i9;
            }
        }
        i3 = 8;
        r7.A05.setVisibility(i7);
        r7.A03.setVisibility(i7);
        r7.A0B.A04.setVisibility(i6);
        r7.A04.setVisibility(i2);
        r7.A06.setVisibility(i3);
        r0 = r7.A01;
        i4 = 0;
        r0.A0C(r7, false);
        r7.A01.A0K(r7.A0H);
        r7.A01.A0H(r7.A0C.A00());
        r7.A01 = r5;
        r7.A00 = r6;
        r5.A0B(r7, false);
        r7.A0H.A00();
        r5.A0I(r7.A0H);
        AnonymousClass1NJ A0O2 = r6.A0O();
        MediaFrameLayout mediaFrameLayout4 = r7.A0A;
        IgProgressImageView igProgressImageView3 = r7.A0G;
        C36841ih r192 = r5;
        mediaFrameLayout4.setAspectRatio(A0O2.A05());
        igProgressImageView3.A05(C0003R.C0005id.listener_id_for_media_view_binder, new DTL(this, r5, A0O2, r7));
        igProgressImageView3.A0F.put(C0003R.C0005id.listener_id_for_media_view_binder, new DTN(this, r5));
        AnonymousClass1PD r132 = r29;
        igProgressImageView3.setImageRenderer(r132);
        igProgressImageView3.setProgressiveImageConfig(new C38631la());
        r5.A08 = 0;
        C38641lb.A00(this.A03, A0O2, igProgressImageView3, r3, (Context) null);
        r7.A0A.setOnTouchListener(new DTE(this, r7, i5, r6, r192));
        C39041mG.A01(r7.A0D, r6, r5, this.A03, this.A02);
        if (this.A00 == null) {
        }
        this.A00.A01(r7.A0I, r7.A0G, r28, A0O2, r192);
        C38781lp.A00(r7.A0C, A0O2, r5);
        C39111mN.A00(r7.A0F, this.A03, new DTK(this, r6, r5, i5, r7), false, num);
        int i82 = 1;
        int size3 = r6.A2X.size() - 1;
        int size22 = r7.A0J.size();
        if (AnonymousClass6QW.A00(r6) == Constants.A0C) {
        }
        valueOf = Integer.valueOf(size22 - i82);
        valueOf2 = Integer.valueOf(size3);
        valueOf = valueOf2;
        intValue = valueOf.intValue();
        while (i4 < intValue) {
        }
    }

    public C30751Vb(Context context, AnonymousClass1UF r2, AnonymousClass0C1 r3) {
        this.A01 = context;
        this.A02 = r2;
        this.A03 = r3;
    }

    public static View A00(Context context, AnonymousClass0C1 r30, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(C0003R.layout.row_feed_collection_top_main_bottom_three_media_group, viewGroup, false);
        View findViewById = inflate.findViewById(C0003R.C0005id.collection_cta);
        C36401hz A012 = AnonymousClass1VW.A01(r30, inflate.findViewById(C0003R.C0005id.row_feed_cta_wrapper));
        View findViewById2 = inflate.findViewById(C0003R.C0005id.collection_root_view);
        C32221an r13 = new C32221an((ViewStub) inflate.findViewById(C0003R.C0005id.audio_icon_view_stub));
        C32291au r12 = new C32291au((ViewStub) inflate.findViewById(C0003R.C0005id.zero_rating_video_play_button_stub));
        View findViewById3 = inflate.findViewById(C0003R.C0005id.collection_overlay);
        C32271as r2 = new C32271as((ViewStub) inflate.findViewById(C0003R.C0005id.save_to_collection_upsell_view_stub));
        TextView textView = (TextView) findViewById.findViewById(C0003R.C0005id.cta_text);
        ColorFilterAlphaImageView colorFilterAlphaImageView = (ColorFilterAlphaImageView) findViewById.findViewById(C0003R.C0005id.cta_chevron);
        C32291au r22 = r12;
        C32221an r21 = r13;
        MediaActionsView mediaActionsView = (MediaActionsView) inflate.findViewById(C0003R.C0005id.row_feed_media_actions);
        LikeActionView likeActionView = (LikeActionView) inflate.findViewById(C0003R.C0005id.like_heart);
        IgProgressImageView igProgressImageView = (IgProgressImageView) inflate.findViewById(C0003R.C0005id.collection_main_image);
        MediaFrameLayout mediaFrameLayout = (MediaFrameLayout) inflate.findViewById(C0003R.C0005id.collection_main_media_group);
        C36411i0 r15 = new C36411i0(findViewById2, mediaFrameLayout, igProgressImageView, likeActionView, mediaActionsView, r21, r22, findViewById3, (ViewGroup) findViewById, textView, colorFilterAlphaImageView, A012, (ViewGroup) inflate.findViewById(C0003R.C0005id.collection_thumbnails), (ViewGroup) inflate.findViewById(C0003R.C0005id.collection_thumbnail_4), r2, new C32261ar((ViewGroup) inflate.findViewById(C0003R.C0005id.main_media)));
        A01(inflate, r15, C0003R.C0005id.collection_thumbnail_1);
        A01(inflate, r15, C0003R.C0005id.collection_thumbnail_2);
        A01(inflate, r15, C0003R.C0005id.collection_thumbnail_3);
        A01(inflate, r15, C0003R.C0005id.collection_thumbnail_4);
        inflate.setTag(r15);
        return inflate;
    }

    public static void A01(View view, C36411i0 r4, int i) {
        MediaFrameLayout mediaFrameLayout = (MediaFrameLayout) view.findViewById(i);
        r4.A0J.add(new Pair(mediaFrameLayout, (IgProgressImageView) mediaFrameLayout.findViewById(C0003R.C0005id.collection_thumbnail_imageview)));
    }
}
