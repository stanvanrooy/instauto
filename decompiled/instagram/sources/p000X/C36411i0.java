package p000X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.common.p004ui.widget.framelayout.MediaFrameLayout;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.p009ui.mediaactions.LikeActionView;
import com.instagram.p009ui.mediaactions.MediaActionsView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1i0  reason: invalid class name and case insensitive filesystem */
public final class C36411i0 implements C32161ah, AnonymousClass1RO {
    public AnonymousClass1NJ A00;
    public C36841ih A01;
    public final View A02;
    public final View A03;
    public final ViewGroup A04;
    public final ViewGroup A05;
    public final ViewGroup A06;
    public final Animation A07;
    public final TextView A08;
    public final ColorFilterAlphaImageView A09;
    public final MediaFrameLayout A0A;
    public final C36401hz A0B;
    public final C32221an A0C;
    public final C32271as A0D;
    public final C32261ar A0E;
    public final C32291au A0F;
    public final IgProgressImageView A0G;
    public final LikeActionView A0H;
    public final MediaActionsView A0I;
    public final List A0J = new ArrayList();

    public final C32231ao APv() {
        return null;
    }

    public final C32221an AGJ() {
        return this.A0C;
    }

    public final IgProgressImageView ANP() {
        return this.A0G;
    }

    public final MediaActionsView APf() {
        return this.A0I;
    }

    public final View APn() {
        return this.A0A;
    }

    public final C36841ih APt() {
        return this.A01;
    }

    public final C31841a5 AXz() {
        return this.A0A;
    }

    public final void BB7(C36841ih r3, int i) {
        if (i != 13 || AnonymousClass6QW.A00(this.A00) != Constants.ZERO) {
            return;
        }
        if (r3.A0n) {
            this.A05.setVisibility(0);
            this.A05.startAnimation(this.A07);
            return;
        }
        this.A05.setVisibility(4);
    }

    public C36411i0(View view, MediaFrameLayout mediaFrameLayout, IgProgressImageView igProgressImageView, LikeActionView likeActionView, MediaActionsView mediaActionsView, C32221an r8, C32291au r9, View view2, ViewGroup viewGroup, TextView textView, ColorFilterAlphaImageView colorFilterAlphaImageView, C36401hz r14, ViewGroup viewGroup2, ViewGroup viewGroup3, C32271as r17, C32261ar r18) {
        this.A02 = view;
        this.A0A = mediaFrameLayout;
        this.A0G = igProgressImageView;
        this.A0H = likeActionView;
        this.A0C = r8;
        this.A0I = mediaActionsView;
        this.A0F = r9;
        this.A03 = view2;
        this.A05 = viewGroup;
        this.A08 = textView;
        this.A09 = colorFilterAlphaImageView;
        this.A07 = AnimationUtils.loadAnimation(viewGroup.getContext(), C0003R.anim.collection_cta_blink);
        this.A0D = r17;
        this.A0E = r18;
        this.A0B = r14;
        this.A04 = viewGroup2;
        this.A06 = viewGroup3;
    }
}
