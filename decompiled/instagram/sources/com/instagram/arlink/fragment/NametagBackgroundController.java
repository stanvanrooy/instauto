package com.instagram.arlink.fragment;

import android.animation.ArgbEvaluator;
import android.app.Activity;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0003R;
import com.facebook.react.modules.datepicker.DatePickerDialogModule;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.arlink.p027ui.GridPatternView;
import com.instagram.common.gallery.Medium;
import com.instagram.model.venue.Venue;
import com.instagram.p009ui.widget.nametag.NametagCardView;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0P4;
import p000X.AnonymousClass0WN;
import p000X.AnonymousClass24Q;
import p000X.C019000b;
import p000X.C06360Ot;
import p000X.C12810hQ;
import p000X.C13260iE;
import p000X.C13300iJ;
import p000X.C15890nh;
import p000X.C173267ak;
import p000X.C175397eP;
import p000X.C177297hg;
import p000X.C177307hh;
import p000X.C177637iJ;
import p000X.C177727iU;
import p000X.C177767iY;
import p000X.C177797ib;
import p000X.C177827if;
import p000X.C177837ig;
import p000X.C177917ip;
import p000X.C177927iq;
import p000X.C177937ir;
import p000X.C177947is;
import p000X.C178137jC;
import p000X.C178157jE;
import p000X.C178187jH;
import p000X.C17850qu;
import p000X.C178647k6;
import p000X.C178697kB;
import p000X.C178757kH;
import p000X.C179747lu;
import p000X.C26771Ff;
import p000X.C27291Hg;
import p000X.C27341Hl;
import p000X.C27511Id;
import p000X.C30941Vv;
import p000X.C34861fQ;
import p000X.C35651gi;
import p000X.C77393Zq;
import p000X.C81823hQ;
import p000X.C86283om;

public class NametagBackgroundController extends C27291Hg implements C34861fQ, C81823hQ, C175397eP {
    public int A00;
    public int A01 = -16777216;
    public int A02;
    public C177297hg A03 = C177297hg.COLOR;
    public String A04;
    public final C178187jH A05;
    public final C177797ib A06;
    public final C177767iY A07;
    public final C27341Hl A08;
    public final AnonymousClass0C1 A09;
    public final ArgbEvaluator A0A = new ArgbEvaluator();
    public final C178157jE A0B;
    public final C179747lu A0C;
    public View mBackgroundModeButton;
    public TextView mBackgroundModeLabel;
    public TextView mBottomButton;
    public NametagCardView mCardView;
    public ImageView mCloseButton;
    public View mGradientView;
    public GridPatternView mGridPatternView;
    public ImageView mPageIndicator;
    public View mRootView;
    public View mSelfieButton;
    public ImageView mShareButton;

    public final long AKQ() {
        return 0;
    }

    public final boolean AgM() {
        return false;
    }

    public final boolean Agd() {
        return false;
    }

    public final boolean Ah8() {
        return false;
    }

    public final boolean Ai5() {
        return false;
    }

    public final void AyR(AnonymousClass24Q r1) {
    }

    public final void AyZ() {
    }

    public final void B5b(C13300iJ r1, String str) {
    }

    public final void B5c(String str) {
    }

    public final void B5j(Medium medium) {
    }

    public final void BA5(View view) {
    }

    public final void BC9() {
    }

    public final void BCB() {
    }

    public final void BOu(C173267ak r1, Drawable drawable) {
    }

    public final void BUh(Venue venue) {
    }

    private void A00() {
        int i = C177307hh.A00[this.A03.ordinal()];
        if (i == 1) {
            this.mGradientView.setVisibility(0);
            this.mGridPatternView.setVisibility(8);
            this.A06.A05(false);
            A03(this);
        } else if (i == 2) {
            this.mGradientView.setVisibility(8);
            this.mGridPatternView.setVisibility(0);
            this.mGridPatternView.setEmoji(this.A04);
            Integer num = this.mGridPatternView.A03;
            if (num != null) {
                this.mCardView.setTintColor(num.intValue());
            } else {
                this.mCardView.setTintColor(this.A01);
            }
        } else if (i == 3) {
            this.mGradientView.setVisibility(8);
            this.mGridPatternView.setVisibility(0);
            C177837ig r4 = (C177837ig) C177837ig.A04.get(this.A02);
            C177767iY r3 = this.A07;
            boolean z = false;
            if (r3.A00 != null) {
                z = true;
            }
            if (z) {
                this.mGridPatternView.setSelfieWithSticker(r3.A01(r4));
            } else if (!r3.A03()) {
                this.A06.A04(this.A02, false, false);
                this.mGridPatternView.setSticker(r4.A02);
            }
            this.mCardView.setTintColor(-16777216);
        }
        this.A05.A03(true);
    }

    public static void A01(NametagBackgroundController nametagBackgroundController) {
        C177837ig r3 = (C177837ig) C177837ig.A04.get(nametagBackgroundController.A02);
        C177767iY r2 = nametagBackgroundController.A07;
        boolean z = false;
        if (r2.A00 != null) {
            z = true;
        }
        if (z) {
            nametagBackgroundController.mGridPatternView.setSelfieWithSticker(r2.A01(r3));
        } else {
            nametagBackgroundController.mGridPatternView.setSticker(r3.A02);
        }
        nametagBackgroundController.mGridPatternView.setVisibility(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a3, code lost:
        if (r6.A07.A03() != false) goto L_0x00a5;
     */
    public static void A02(NametagBackgroundController nametagBackgroundController) {
        boolean z;
        Context context = nametagBackgroundController.mRootView.getContext();
        boolean z2 = nametagBackgroundController.A03.A02;
        int i = C0003R.color.grey_9;
        if (z2) {
            i = C0003R.color.white;
        }
        int A002 = C019000b.A00(context, i);
        ColorFilter A003 = C26771Ff.A00(A002);
        nametagBackgroundController.mCloseButton.setColorFilter(A003);
        nametagBackgroundController.mShareButton.setColorFilter(A003);
        TextView textView = nametagBackgroundController.mBackgroundModeLabel;
        boolean z3 = nametagBackgroundController.A03.A02;
        int i2 = C0003R.C0004drawable.mode_button_background_dark;
        if (z3) {
            i2 = C0003R.C0004drawable.mode_button_background_light;
        }
        textView.setBackgroundResource(i2);
        nametagBackgroundController.mBackgroundModeLabel.setText(nametagBackgroundController.A03.A00);
        nametagBackgroundController.mBackgroundModeLabel.setTextColor(A002);
        nametagBackgroundController.mBottomButton.setTextColor(A002);
        int i3 = 0;
        nametagBackgroundController.mBottomButton.getCompoundDrawables()[0].mutate().setColorFilter(A003);
        if (!nametagBackgroundController.A03.A02) {
            nametagBackgroundController.mBackgroundModeLabel.setShadowLayer(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 0);
        } else {
            nametagBackgroundController.mBackgroundModeLabel.setShadowLayer(8.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, C019000b.A00(nametagBackgroundController.mRootView.getContext(), C0003R.color.black_20_transparent));
        }
        if (nametagBackgroundController.mPageIndicator.getVisibility() == 0 && (nametagBackgroundController.mPageIndicator.getDrawable() instanceof C177637iJ)) {
            C177637iJ r2 = (C177637iJ) nametagBackgroundController.mPageIndicator.getDrawable();
            int i4 = -16777216;
            if (nametagBackgroundController.A03.A02) {
                i4 = -1;
            }
            r2.A04.setColor(i4);
            r2.A05.setColor(i4);
            r2.setAlpha(r2.A01);
        }
        if (nametagBackgroundController.A03 == C177297hg.SELFIE) {
            z = false;
        }
        z = true;
        ImageView imageView = nametagBackgroundController.mCloseButton;
        int i5 = 8;
        if (z) {
            i5 = 0;
        }
        imageView.setVisibility(i5);
        ImageView imageView2 = nametagBackgroundController.mShareButton;
        int i6 = 8;
        if (z) {
            i6 = 0;
        }
        imageView2.setVisibility(i6);
        TextView textView2 = nametagBackgroundController.mBottomButton;
        int i7 = 8;
        if (z) {
            i7 = 0;
        }
        textView2.setVisibility(i7);
        View view = nametagBackgroundController.mSelfieButton;
        if (nametagBackgroundController.A03 != C177297hg.SELFIE) {
            i3 = 8;
        }
        view.setVisibility(i3);
    }

    public static void A03(NametagBackgroundController nametagBackgroundController) {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TR_BL, NametagCardView.A0J[nametagBackgroundController.A00]);
        gradientDrawable.setDither(true);
        nametagBackgroundController.mGradientView.setBackground(gradientDrawable);
        nametagBackgroundController.mCardView.setGradientTintColors(nametagBackgroundController.A00);
    }

    public final void A04() {
        boolean z;
        C13260iE r2 = this.A09.A06.A0O;
        boolean z2 = true;
        if (r2 == null) {
            r2 = new C13260iE(this.A03.A01);
            z = true;
        } else {
            z = false;
        }
        int i = r2.A02;
        C177297hg r3 = this.A03;
        int i2 = r3.A01;
        if (i != i2) {
            r2.A02 = i2;
            z = true;
        }
        int i3 = r2.A01;
        int i4 = this.A00;
        if (i3 != i4) {
            r2.A01 = i4;
            z = true;
        }
        String str = this.A04;
        if (!str.equals(r2.A04)) {
            r2.A04 = str;
            z = true;
        }
        int i5 = r2.A00;
        int i6 = this.A01;
        if (i5 != i6) {
            r2.A00 = i6;
            z = true;
        }
        int i7 = r2.A03;
        int i8 = this.A02;
        if (i7 != i8) {
            r2.A03 = i8;
        } else {
            z2 = z;
        }
        if (z2) {
            if (r3 == C177297hg.SELFIE && !this.A07.A03()) {
                C177297hg r0 = C177297hg.EMOJI;
                this.A03 = r0;
                r2.A02 = r0.A01;
            }
            AnonymousClass0C1 r7 = this.A09;
            r7.A06.A0O = r2;
            int i9 = this.A03.A01;
            int i10 = this.A00;
            String str2 = this.A04;
            int i11 = this.A01;
            int i12 = this.A02;
            C15890nh r22 = new C15890nh(r7);
            r22.A09 = Constants.ONE;
            r22.A0C = "users/nametag_config/";
            r22.A09(DatePickerDialogModule.ARG_MODE, String.valueOf(i9));
            r22.A09("gradient", String.valueOf(i10));
            r22.A09("emoji", str2);
            r22.A09("emoji_color", String.valueOf(i11));
            r22.A09("selfie_sticker", String.valueOf(i12));
            r22.A06(C177947is.class, false);
            r22.A0G = true;
            C17850qu A032 = r22.A03();
            A032.A00 = new C177937ir(this, this.A09);
            C12810hQ.A02(A032);
        }
    }

    public final void A05(float f) {
        int i = 8;
        if (this.A03 == C177297hg.COLOR) {
            this.mGradientView.setAlpha(f);
            View view = this.mGradientView;
            int i2 = 8;
            if (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                i2 = 0;
            }
            view.setVisibility(i2);
        } else {
            this.mGridPatternView.setAlpha(f);
            GridPatternView gridPatternView = this.mGridPatternView;
            int i3 = 8;
            if (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                i3 = 0;
            }
            gridPatternView.setVisibility(i3);
        }
        ArgbEvaluator argbEvaluator = this.A0A;
        int i4 = -1;
        if (!this.A03.A02) {
            i4 = C019000b.A00(this.mRootView.getContext(), C0003R.color.grey_9);
        }
        int intValue = ((Integer) argbEvaluator.evaluate(f, -1, Integer.valueOf(i4))).intValue();
        ColorFilter A002 = C26771Ff.A00(intValue);
        this.mCloseButton.setColorFilter(A002);
        this.mBackgroundModeButton.setAlpha(f);
        View view2 = this.mBackgroundModeButton;
        int i5 = 8;
        if (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            i5 = 0;
        }
        view2.setVisibility(i5);
        this.mShareButton.setAlpha(f);
        ImageView imageView = this.mShareButton;
        int i6 = 8;
        if (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            i6 = 0;
        }
        imageView.setVisibility(i6);
        if (this.A03 == C177297hg.SELFIE) {
            this.mSelfieButton.setAlpha(f);
            View view3 = this.mSelfieButton;
            if (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                i = 0;
            }
            view3.setVisibility(i);
        }
        this.mBottomButton.setTextColor(intValue);
        this.mBottomButton.getCompoundDrawables()[0].mutate().setColorFilter(A002);
    }

    public final void B2C(int i) {
        this.A01 = i;
        if (this.A08.isResumed() && this.A03 == C177297hg.EMOJI) {
            this.mCardView.setTintColor(i);
        }
    }

    public final void B2D(C30941Vv r4, Drawable drawable) {
        String str = r4.A02;
        this.A04 = str;
        this.mGridPatternView.setEmoji(str);
        this.A05.A03(true);
        this.A0C.A02(new C178647k6(r4));
        AnonymousClass0P4 A002 = C77393Zq.A00(Constants.A0N);
        A002.A0G("value", this.A04);
        AnonymousClass0WN.A01(this.A09).BcG(A002);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r1 != 0) goto L_0x000d;
     */
    public final void BE0() {
        boolean z;
        ViewGroup viewGroup = this.A06.A03;
        if (viewGroup != null) {
            int visibility = viewGroup.getVisibility();
            z = true;
        }
        z = false;
        if (z) {
            C177797ib r2 = this.A06;
            if (r2.A0J.Afs()) {
                r2.A0J.A02.BWx((C86283om) null);
                r2.A01.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            }
        }
        A04();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r1 != 0) goto L_0x000d;
     */
    public final void BJx() {
        boolean z;
        ViewGroup viewGroup = this.A06.A03;
        if (viewGroup != null) {
            int visibility = viewGroup.getVisibility();
            z = true;
        }
        z = false;
        if (z) {
            C177797ib.A02(this.A06);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0128, code lost:
        if (p000X.C196398ao.A00(new android.graphics.Paint(), r1) == false) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x012b, code lost:
        if (r0 == false) goto L_0x012d;
     */
    public NametagBackgroundController(Activity activity, C27341Hl r12, View view, AnonymousClass0C1 r14, C177767iY r15, C178157jE r16, C27511Id r17) {
        this.A08 = r12;
        this.mRootView = view;
        this.A07 = r15;
        this.mCloseButton = (ImageView) view.findViewById(C0003R.C0005id.close_button);
        this.mPageIndicator = (ImageView) view.findViewById(C0003R.C0005id.page_indicator);
        View findViewById = view.findViewById(C0003R.C0005id.background_mode_button);
        this.mBackgroundModeButton = findViewById;
        C35651gi r1 = new C35651gi(findViewById);
        r1.A05 = this;
        r1.A07 = true;
        r1.A0A = true;
        r1.A00();
        this.mBackgroundModeLabel = (TextView) view.findViewById(C0003R.C0005id.background_mode_label);
        View findViewById2 = view.findViewById(C0003R.C0005id.selfie_button);
        this.mSelfieButton = findViewById2;
        C35651gi r0 = new C35651gi(findViewById2);
        r0.A05 = this;
        r0.A00();
        this.mShareButton = (ImageView) view.findViewById(C0003R.C0005id.share_button);
        this.mGradientView = view.findViewById(C0003R.C0005id.gradient_view);
        this.mGradientView.setOnTouchListener(new C177917ip(this, new GestureDetector(activity, new C177827if(this))));
        GridPatternView gridPatternView = (GridPatternView) view.findViewById(C0003R.C0005id.grid_pattern_view);
        this.mGridPatternView = gridPatternView;
        gridPatternView.A02 = this;
        this.mGridPatternView.setOnTouchListener(new C177927iq(this, new GestureDetector(activity, new C177727iU(this))));
        this.mCardView = (NametagCardView) view.findViewById(C0003R.C0005id.card_view);
        this.mBottomButton = (TextView) view.findViewById(C0003R.C0005id.bottom_button);
        this.A09 = r14;
        C178157jE r8 = r16;
        this.A0B = r8;
        this.A05 = new C178187jH(view, r14, r12, this, r8, r17);
        this.A0C = new C179747lu(r14);
        this.A06 = new C177797ib(activity, view, r14, this);
        C13260iE r13 = this.A09.A06.A0O;
        if (r13 != null) {
            this.A03 = C177297hg.A00(r13.A02);
            this.A00 = r13.A01;
            this.A04 = r13.A04;
            this.A01 = r13.A00;
            this.A02 = r13.A03;
        }
        if (this.A00 >= NametagCardView.A0J.length) {
            this.A00 = 0;
        }
        if (!TextUtils.isEmpty(this.A04)) {
            String str = this.A04;
            boolean z = C06360Ot.A0A(str) ? true : z;
            z = false;
        }
        this.A04 = C30941Vv.A04()[0].A02;
        if (this.A01 == 0) {
            this.A01 = -16777216;
        }
        if (this.A03 == C177297hg.SELFIE && !this.A07.A03()) {
            this.A03 = C177297hg.EMOJI;
        }
        if (this.A02 >= C177837ig.values().length) {
            this.A02 = 0;
        }
        this.A07.A02(this);
        view.requestFocus();
        A02(this);
        A00();
    }

    public final void AsD(C178137jC r3, Drawable drawable) {
        if (r3.AZC() == C178697kB.EMOJI) {
            B2D(r3.AL1(), drawable);
        }
    }

    public final void Azh() {
        A04();
        C178187jH r2 = this.A05;
        if (r2.A07 != null) {
            r2.A02.setBackground((Drawable) null);
            r2.A07.A06();
            r2.A07 = null;
        }
        C178757kH r0 = r2.A0A;
        if (r0 != null) {
            r0.A00();
        }
        C177797ib r22 = this.A06;
        r22.A05(false);
        if (r22.A06 != null) {
            r22.A05.setBackground((Drawable) null);
            r22.A06.A06();
            r22.A06 = null;
        }
        NametagBackgroundControllerLifecycleUtil.cleanupReferences(this);
    }

    public final boolean BR2(View view) {
        if (view.getId() == C0003R.C0005id.background_mode_button) {
            int length = (this.A03.A01 + 1) % C177297hg.values().length;
            this.A03 = C177297hg.A00(length);
            AnonymousClass0P4 A002 = C77393Zq.A00(Constants.ONE);
            A002.A0E(DatePickerDialogModule.ARG_MODE, Integer.valueOf(length));
            AnonymousClass0WN.A01(this.A09).BcG(A002);
            A02(this);
            A00();
            return true;
        } else if (view.getId() != C0003R.C0005id.selfie_button) {
            return false;
        } else {
            if (this.A03 == C177297hg.SELFIE) {
                C77393Zq.A02(Constants.A0j, this.A09);
                this.A06.A04(this.A02, true, true);
            }
            return true;
        }
    }
}
