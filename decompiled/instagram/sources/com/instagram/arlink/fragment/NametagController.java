package com.instagram.arlink.fragment;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.p004ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.p009ui.widget.nametag.NametagCardView;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0LY;
import p000X.AnonymousClass1EG;
import p000X.AnonymousClass7Qk;
import p000X.C019000b;
import p000X.C06220Of;
import p000X.C13300iJ;
import p000X.C170377Qd;
import p000X.C170457Qm;
import p000X.C175127dx;
import p000X.C175207e5;
import p000X.C176817gq;
import p000X.C177277he;
import p000X.C177297hg;
import p000X.C177317hi;
import p000X.C177587iD;
import p000X.C177627iI;
import p000X.C177637iJ;
import p000X.C177687iO;
import p000X.C177707iR;
import p000X.C177717iS;
import p000X.C177767iY;
import p000X.C178157jE;
import p000X.C178187jH;
import p000X.C178217jK;
import p000X.C178347jX;
import p000X.C26771Ff;
import p000X.C27291Hg;
import p000X.C27341Hl;
import p000X.C27511Id;
import p000X.C35031fh;
import p000X.C35251g3;
import p000X.C35651gi;
import p000X.C476524w;
import p000X.C476624x;
import p000X.C77393Zq;
import p000X.C77433Zu;
import p000X.C79613dk;

public class NametagController extends C27291Hg implements C79613dk {
    public C177587iD A00;
    public C13300iJ A01;
    public Integer A02 = Constants.ZERO;
    public boolean A03;
    public boolean A04 = true;
    public final Activity A05;
    public final Context A06;
    public final Handler A07 = new Handler(Looper.getMainLooper());
    public final C170377Qd A08;
    public final NametagBackgroundController A09;
    public final C178157jE A0A;
    public final C27341Hl A0B;
    public final AnonymousClass0C1 A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final AnonymousClass7Qk A0F;
    public final C177717iS A0G;
    public final C177317hi A0H;
    public View mBottomBar;
    public TextView mBottomButton;
    public NametagCardView mCardView;
    public View mGradientOverlay;
    public ViewGroup mRootView;
    public View mTopBar;

    public final void B4z(boolean z, boolean z2, float f, float f2) {
    }

    public final void BS2() {
    }

    public static void A00(NametagController nametagController, Integer num) {
        Integer num2 = nametagController.A02;
        if (num2 != num) {
            nametagController.A02 = num;
            nametagController.A01(num, num2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00dc, code lost:
        if (r1 != 0) goto L_0x00de;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002f  */
    public final boolean A02() {
        boolean z;
        boolean z2;
        boolean z3;
        RectF rectF;
        boolean A052;
        boolean z4;
        if (this.A02 == Constants.A0N) {
            return false;
        }
        NametagBackgroundController nametagBackgroundController = this.A09;
        if (nametagBackgroundController.A05.A05()) {
            C178187jH r8 = nametagBackgroundController.A05;
            C178217jK r7 = r8.A05;
            if (r7 != null) {
                if (r7.A00.A01 == 1.0d) {
                    r7.A00();
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    A052 = true;
                    if (A052) {
                        z2 = true;
                        if (!z2) {
                            C177717iS r2 = this.A0G;
                            C178347jX r0 = r2.A05;
                            if (r0 != null) {
                                r0.A00();
                                r2.A05 = null;
                                z3 = true;
                            } else if (r2.A0U.A06()) {
                                r2.A0U.A02();
                                z3 = true;
                            } else if (C177717iS.A05(r2)) {
                                if (r2.A03 != null) {
                                    C77393Zq.A02(Constants.A0E, r2.A0T);
                                    r2.A03.A04.A03(0.0d);
                                }
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (!z3) {
                                AnonymousClass7Qk r82 = this.A0F;
                                if (!r82.A00) {
                                    C170457Qm r5 = new C170457Qm(r82);
                                    View view = r82.A08.mView;
                                    if (view == null || (rectF = r82.A06) == null) {
                                        r5.onFinish();
                                        return true;
                                    }
                                    r82.A00 = true;
                                    float width = rectF.width() / ((float) r82.A03);
                                    C476524w A072 = C476624x.A07(view);
                                    A072.A0N();
                                    A072.A0L(view.getScaleX(), width, r82.A06.centerX());
                                    A072.A0M(view.getScaleY(), width, r82.A06.centerY());
                                    A072.A0E(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                                    A072.A07 = 8;
                                    C476524w A0T = A072.A0T(true);
                                    A0T.A09 = r5;
                                    A0T.A0S(C35031fh.A00).A0O();
                                }
                            }
                        }
                        return true;
                    }
                }
            }
            r8.A03(true);
            A052 = r8.A05();
            if (A052) {
            }
        }
        ViewGroup viewGroup = nametagBackgroundController.A06.A03;
        if (viewGroup != null) {
            int visibility = viewGroup.getVisibility();
            z = true;
        }
        z = false;
        if (!z || !nametagBackgroundController.A07.A03()) {
            z2 = false;
        } else {
            C77393Zq.A02(Constants.A12, nametagBackgroundController.A09);
            NametagBackgroundController.A01(nametagBackgroundController);
            nametagBackgroundController.A06.A05(true);
            z2 = true;
        }
        if (!z2) {
        }
        return true;
    }

    public final void Azh() {
        this.A0A.A0F.Adn((View.OnTouchListener) null);
        NametagControllerLifecycleUtil.cleanupReferences(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        if (r7 > (((float) r5) / 2.0f)) goto L_0x004b;
     */
    public final boolean B5t(boolean z, boolean z2, float f, float f2, float f3, float f4, float f5) {
        C177317hi r3;
        if (z2) {
            Integer num = this.A02;
            if (num == Constants.ONE) {
                C175207e5 r6 = this.A0G.A03;
                if (r6 == null || !r6.A05.Afd()) {
                    return false;
                }
                float f6 = -f2;
                AnonymousClass1EG r2 = r6.A04;
                float A002 = (float) r2.A00();
                r2.A04((double) f6);
                int height = r6.A01.getHeight();
                boolean z3 = true;
                boolean z4 = false;
                if (f6 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    z4 = true;
                }
                boolean z5 = false;
                if (f6 < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    z5 = true;
                }
                if (A002 != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    z3 = false;
                }
                if (!z4) {
                    if (!z5) {
                        if (z3) {
                            return false;
                        }
                    }
                    r6.A04.A03(0.0d);
                    return false;
                }
                r6.A04.A03((double) height);
                return false;
            } else if (num != Constants.ZERO) {
                return false;
            } else {
                NametagBackgroundController nametagBackgroundController = this.A09;
                if (nametagBackgroundController.A03 == C177297hg.EMOJI) {
                    return nametagBackgroundController.A05.A06(f2, true);
                }
                return false;
            }
        } else if (!z || (r3 = this.A0H) == null) {
            return false;
        } else {
            float abs = Math.abs(f);
            float min = Math.min(abs / ((float) r3.A01.getWidth()), 0.5f) * ((float) ((int) (f / abs)));
            r3.A00.A04((double) min);
            if (min > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || (min >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && Math.abs(r3.A01.getRotationY()) % 180.0f >= 90.0f)) {
                C177317hi.A00(r3);
                return true;
            }
            C177317hi.A01(r3);
            return true;
        }
    }

    public final void BLG(boolean z, boolean z2, float f, float f2, float f3, float f4) {
        C177317hi r1;
        if (z2) {
            Integer num = this.A02;
            if (num == Constants.ONE) {
                C175207e5 r12 = this.A0G.A03;
                if (r12 != null && r12.A05.Afd()) {
                    AnonymousClass1EG r4 = r12.A04;
                    r4.A05(r4.A00() - ((double) (-f2)), true);
                }
            } else if (num == Constants.ZERO) {
                NametagBackgroundController nametagBackgroundController = this.A09;
                if (nametagBackgroundController.A03 == C177297hg.EMOJI) {
                    C178187jH r13 = nametagBackgroundController.A05;
                    if (!r13.A05() && f2 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                        r13.A04(true);
                    } else if (r13.A05()) {
                        C178187jH.A00(r13, f2);
                    }
                }
            }
        } else if (z && (r1 = this.A0H) != null) {
            AnonymousClass1EG r42 = r1.A00;
            r42.A05((double) ((float) (r42.A00() - ((double) (f / ((float) r1.A01.getWidth()))))), true);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
        if (r8 == null) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0095, code lost:
        r3 = r6.A09;
        r2 = r3.mRootView.getContext();
        r1 = r3.A03.A02;
        r0 = com.facebook.C0003R.color.grey_9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a4, code lost:
        if (r1 == false) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a6, code lost:
        r0 = com.facebook.C0003R.color.white;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a9, code lost:
        r2 = p000X.C019000b.A00(r2, r0);
        r1 = p000X.C26771Ff.A00(r2);
        r3.mBottomButton.setTextColor(r2);
        r3.mBottomButton.getCompoundDrawables()[0].mutate().setColorFilter(r1);
     */
    private void A01(Integer num, Integer num2) {
        switch (num.intValue()) {
            case 0:
                TextView textView = this.mBottomButton;
                boolean z = this.A0E;
                int i = C0003R.string.scan_a_nametag;
                if (z) {
                    i = C0003R.string.qr_scan_a_nametag;
                }
                textView.setText(i);
                this.mBottomButton.setCompoundDrawablesWithIntrinsicBounds(C0003R.C0004drawable.instagram_camera_outline_24, 0, 0, 0);
                if (num2 == Constants.ONE) {
                    this.A0G.A0A(true);
                    this.mBottomButton.getCompoundDrawables()[0].mutate().setColorFilter(C26771Ff.A00(-1));
                    break;
                }
                break;
            case 1:
                if (!C35251g3.A07(this.A05, "android.permission.CAMERA")) {
                    if (num2 == null || num2 == Constants.A0C) {
                        this.A02 = Constants.A0N;
                    } else {
                        this.A02 = num2;
                    }
                    this.A0G.A07();
                    this.mBottomButton.setEnabled(true);
                    break;
                } else {
                    C177717iS r1 = this.A0G;
                    if (!r1.A06) {
                        r1.A06 = true;
                        r1.A07();
                        C175127dx r0 = r1.A02;
                        if (r0 != null) {
                            r0.A03 = true;
                        }
                    }
                    if (num2 == Constants.ZERO) {
                        TextView textView2 = this.mBottomButton;
                        boolean z2 = this.A0D;
                        int i2 = C0003R.string.back_to_your_nametag;
                        if (z2) {
                            i2 = C0003R.string.go_to_your_nametag;
                        }
                        textView2.setText(i2);
                        this.mBottomButton.setCompoundDrawablesWithIntrinsicBounds(C0003R.C0004drawable.ic_nametag, 0, 0, 0);
                    }
                }
                break;
            case 2:
                this.mGradientOverlay.setVisibility(0);
                return;
            case 4:
                C13300iJ r2 = this.A01;
                if (r2 != null) {
                    C177587iD r12 = this.A00;
                    if (r12 != null) {
                        C177717iS r02 = this.A0G;
                        r02.A0A(false);
                        C177717iS.A02(r02);
                        r02.A0U.A05(r2, r12);
                        return;
                    }
                    C177717iS r03 = this.A0G;
                    r03.A0A(false);
                    C177717iS.A02(r03);
                    r03.A0U.A04(r2);
                    return;
                }
                return;
            default:
                return;
        }
        this.A01 = null;
    }

    public NametagController(Activity activity, C27341Hl r19, ViewGroup viewGroup, AnonymousClass0C1 r21, String str, String str2, RectF rectF, boolean z, C177767iY r26, C77433Zu r27, C27511Id r28, String str3) {
        Activity activity2 = activity;
        this.A05 = activity2;
        C27341Hl r11 = r19;
        this.A0B = r11;
        this.A06 = r11.getContext();
        C77433Zu r1 = r27;
        r1.A00.A0C(this);
        ViewGroup viewGroup2 = viewGroup;
        this.mRootView = viewGroup2;
        AnonymousClass0C1 r13 = r21;
        this.A0C = r13;
        this.mGradientOverlay = viewGroup2.findViewById(C0003R.C0005id.gradient_overlay);
        NametagCardView nametagCardView = (NametagCardView) viewGroup2.findViewById(C0003R.C0005id.card_view);
        this.mCardView = nametagCardView;
        String str4 = str;
        nametagCardView.setName(str4, str2);
        AnonymousClass0C1 r7 = this.A0C;
        AnonymousClass0L7 r6 = AnonymousClass0L7.QR_CODE_NAMETAG;
        AnonymousClass04H r3 = AnonymousClass0LY.A07;
        boolean booleanValue = ((Boolean) AnonymousClass0L6.A02(r7, r6, "is_enabled", false, r3)).booleanValue();
        this.A0E = booleanValue;
        if (booleanValue) {
            boolean booleanValue2 = ((Boolean) AnonymousClass0L6.A02(this.A0C, r6, "entry_animation_enabled", false, r3)).booleanValue();
            NametagCardView nametagCardView2 = this.mCardView;
            C177277he r32 = C177277he.NAMETAG_QR;
            if (nametagCardView2.A04 != r32) {
                nametagCardView2.A04 = r32;
                if (r32 == r32) {
                    nametagCardView2.A0G.A02(booleanValue2);
                }
                NametagCardView.A01(nametagCardView2);
            }
            this.A0H = new C177317hi(this.mCardView, booleanValue2);
            ImageView imageView = (ImageView) viewGroup2.findViewById(C0003R.C0005id.page_indicator);
            C177637iJ r62 = new C177637iJ(Math.round(C06220Of.A03(activity2, 7)), Math.round(C06220Of.A03(activity2, 5)), Math.round(C06220Of.A03(activity2, 0)));
            imageView.setImageDrawable(r62);
            imageView.setVisibility(0);
            if (true != r62.A03) {
                r62.A03 = true;
                r62.invalidateSelf();
            }
            r62.A02 = 2;
            r62.invalidateSelf();
            this.mCardView.getViewTreeObserver().addOnPreDrawListener(new C177687iO(this, r62));
        } else {
            this.A0H = null;
        }
        this.mTopBar = viewGroup2.findViewById(C0003R.C0005id.top_bar);
        C35651gi r33 = new C35651gi(viewGroup2.findViewById(C0003R.C0005id.close_button));
        r33.A05 = new C177707iR(this);
        r33.A00();
        C35651gi r34 = new C35651gi(viewGroup2.findViewById(C0003R.C0005id.share_button));
        r34.A05 = new C177627iI(this, str4);
        r34.A00();
        this.mBottomBar = viewGroup2.findViewById(C0003R.C0005id.bottom_bar);
        this.mBottomButton = (TextView) viewGroup2.findViewById(C0003R.C0005id.bottom_button);
        this.mBottomButton.setCompoundDrawablesWithIntrinsicBounds(C019000b.A03(activity2, C0003R.C0004drawable.instagram_camera_outline_24), (Drawable) null, (Drawable) null, (Drawable) null);
        C35651gi r35 = new C35651gi(this.mBottomButton);
        r35.A05 = new C176817gq(this);
        r35.A07 = true;
        r35.A0A = true;
        r35.A00();
        if (Build.VERSION.SDK_INT < 21) {
            this.mBottomButton.getPaint().setFakeBoldText(true);
        }
        C178157jE r36 = new C178157jE(activity2, (TouchInterceptorFrameLayout) viewGroup2);
        this.A0A = r36;
        if (!r36.A0G.contains(this)) {
            r36.A0G.add(this);
        }
        C178157jE r0 = this.A0A;
        r0.A0F.A00(r0.A0E, r0.A0D);
        NametagBackgroundController nametagBackgroundController = new NametagBackgroundController(this.A05, r11, viewGroup2, r13, r26, this.A0A, r28);
        this.A09 = nametagBackgroundController;
        r1.A00.A0C(nametagBackgroundController);
        C177717iS r9 = new C177717iS(activity2, r11, viewGroup2, r13, this.A0A, this, str3);
        this.A0G = r9;
        r1.A00.A0C(r9);
        RectF rectF2 = rectF;
        AnonymousClass7Qk r4 = new AnonymousClass7Qk(this.A05, this.A0B, this, rectF2, rectF2);
        this.A0F = r4;
        r1.A00.A0C(r4);
        this.A08 = new C170377Qd(viewGroup2, this.A0E);
        this.A0D = z;
        if (z) {
            this.A02 = Constants.A0C;
        }
        Integer num = this.A02;
        if (num == null || (num == Constants.A0Y && this.A01 == null)) {
            this.A02 = Constants.ZERO;
        }
        Integer num2 = this.A02;
        if (num2 == Constants.ONE || num2 == Constants.A0C || num2 == Constants.A0Y) {
            this.A04 = false;
            this.mCardView.setVisibility(8);
            this.mBottomButton.setText(this.A0D ? C0003R.string.go_to_your_nametag : C0003R.string.back_to_your_nametag);
            this.mBottomButton.setCompoundDrawablesWithIntrinsicBounds(C0003R.C0004drawable.ic_nametag, 0, 0, 0);
            this.A09.A05(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
        A01(this.A02, (Integer) null);
    }
}
