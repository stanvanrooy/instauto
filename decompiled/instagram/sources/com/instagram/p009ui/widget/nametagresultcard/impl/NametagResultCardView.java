package com.instagram.p009ui.widget.nametagresultcard.impl;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0003R;
import com.facebook.forker.Process;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.p004ui.widget.imageview.CircularImageView;
import com.instagram.p009ui.widget.nametag.NametagCardView;
import com.instagram.p009ui.widget.nametag.UsernameTextView;
import com.instagram.p009ui.widget.textview.UpdatableButton;
import com.instagram.user.follow.FollowButton;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0Z0;
import p000X.C06220Of;
import p000X.C13300iJ;
import p000X.C13390iS;
import p000X.C14090jk;
import p000X.C177447hz;
import p000X.C177457i0;
import p000X.C177477i2;
import p000X.C177487i3;
import p000X.C177507i5;
import p000X.C26661Ek;
import p000X.C46031z1;
import p000X.C467220p;
import p000X.C476524w;
import p000X.C476624x;

/* renamed from: com.instagram.ui.widget.nametagresultcard.impl.NametagResultCardView */
public class NametagResultCardView extends FrameLayout {
    public int A00;
    public View A01;
    public View A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public CircularImageView A06;
    public UsernameTextView A07;
    public C177487i3 A08;
    public UpdatableButton A09;
    public FollowButton A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public int A0E;
    public int A0F;
    public View A0G;
    public final C467220p A0H = new C177477i2(this);
    public final Runnable A0I = new C177507i5(this);

    public static void A01(NametagResultCardView nametagResultCardView) {
        int i = (int) (((float) nametagResultCardView.A00) * 0.05f);
        nametagResultCardView.setPadding(i, i, i, i);
        int i2 = nametagResultCardView.A00 - (i << 1);
        nametagResultCardView.A0F = i2;
        C06220Of.A0V(nametagResultCardView.A02, i2, i2);
        CircularImageView circularImageView = nametagResultCardView.A06;
        int i3 = (int) (((float) nametagResultCardView.A00) * 0.25f);
        C06220Of.A0V(circularImageView, i3, i3);
        Paint.FontMetrics fontMetrics = nametagResultCardView.A07.getPaint().getFontMetrics();
        UsernameTextView usernameTextView = nametagResultCardView.A07;
        float f = (float) nametagResultCardView.A00;
        usernameTextView.A02((f * 0.038f) - fontMetrics.ascent, (int) (f * 0.83f));
        UsernameTextView usernameTextView2 = nametagResultCardView.A07;
        int i4 = (int) (((float) nametagResultCardView.A00) * 0.057f);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) usernameTextView2.getLayoutParams();
        layoutParams.topMargin = i4;
        usernameTextView2.setLayoutParams(layoutParams);
        nametagResultCardView.A04.measure(View.MeasureSpec.makeMeasureSpec((int) (((float) nametagResultCardView.A00) * 0.83f), Process.WAIT_RESULT_TIMEOUT), View.MeasureSpec.makeMeasureSpec(0, 0));
        Paint.FontMetrics fontMetrics2 = nametagResultCardView.A04.getPaint().getFontMetrics();
        TextView textView = nametagResultCardView.A04;
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams2.topMargin = (int) ((((((float) nametagResultCardView.A00) * 0.057f) - fontMetrics.bottom) + fontMetrics2.top) - fontMetrics2.ascent);
        textView.setLayoutParams(layoutParams2);
        nametagResultCardView.A02.setVisibility(0);
        int[] iArr = NametagCardView.A0J[2];
        nametagResultCardView.A07.getPaint().setShader(new LinearGradient((float) nametagResultCardView.A07.getMeasuredWidth(), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) nametagResultCardView.A07.getMeasuredHeight(), iArr[0], iArr[1], Shader.TileMode.CLAMP));
        nametagResultCardView.post(nametagResultCardView.A0I);
    }

    public void setDelegate(C177487i3 r3) {
        this.A08 = r3;
        this.A0G.setOnClickListener(new C177457i0(this));
    }

    private void A00() {
        inflate(getContext(), C0003R.layout.nametag_result_card_view_layout, this);
        ((LinearLayout) findViewById(C0003R.C0005id.nametag_card_container)).setLayoutTransition(new LayoutTransition());
        this.A0G = findViewById(C0003R.C0005id.dismiss_button);
        this.A02 = findViewById(C0003R.C0005id.user_container);
        this.A06 = (CircularImageView) findViewById(C0003R.C0005id.profile_photo);
        this.A07 = (UsernameTextView) findViewById(C0003R.C0005id.username_view);
        this.A04 = (TextView) findViewById(C0003R.C0005id.full_name_view);
        this.A01 = findViewById(C0003R.C0005id.button_container);
        FollowButton followButton = (FollowButton) findViewById(C0003R.C0005id.follow_button);
        this.A0A = followButton;
        followButton.A02.A03 = "nametag";
        UpdatableButton updatableButton = (UpdatableButton) findViewById(C0003R.C0005id.deeplink_button);
        this.A09 = updatableButton;
        updatableButton.setIsBlueButton(true);
        this.A03 = (TextView) findViewById(C0003R.C0005id.follow_status_view);
        TextView textView = (TextView) findViewById(C0003R.C0005id.view_profile_button);
        this.A05 = textView;
        if (Build.VERSION.SDK_INT < 21) {
            textView.getPaint().setFakeBoldText(true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r10.A0l() == false) goto L_0x0015;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c7  */
    public final void A02(AnonymousClass0C1 r9, C13300iJ r10) {
        boolean z;
        TextView textView;
        Resources resources;
        int i;
        int i2;
        C13390iS A0J = C26661Ek.A00(r9).A0J(r10);
        C13390iS r5 = C13390iS.FollowStatusFollowing;
        if (A0J == r5) {
            z = true;
        }
        z = false;
        this.A0D = z;
        if (C14090jk.A05(r9, r10)) {
            this.A0A.setVisibility(8);
            this.A03.setText(C0003R.string.follow_status_you);
        } else {
            if (A0J == r5) {
                this.A0A.setVisibility(8);
                textView = this.A03;
                resources = getResources();
                if (this.A0C) {
                    i = C0003R.string.follow_status_now_following;
                } else {
                    boolean z2 = this.A0D;
                    i = C0003R.string.follow_status_already_following;
                    if (z2) {
                        i = C0003R.string.follow_status_mutual_following;
                    }
                }
            } else if (A0J == C13390iS.FollowStatusRequested) {
                this.A0A.setVisibility(8);
                textView = this.A03;
                resources = getResources();
                i = C0003R.string.follow_status_requested;
            } else {
                this.A0A.setVisibility(0);
                this.A0A.A02.A01(r9, r10, this.A0H);
                this.A03.setVisibility(8);
                if (this.A0B) {
                    if (this.A0C || !this.A0D) {
                        C476624x.A09(false, this.A02);
                    } else {
                        this.A02.setAlpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                        this.A08.BCT(this.A00, this.A0E, false);
                    }
                }
                this.A05.setOnClickListener(new C177447hz(this, r10));
                i2 = this.A0F;
                if (i2 <= 0) {
                    C06220Of.A0U(this.A01, i2);
                    this.A01.setVisibility(0);
                    return;
                }
                this.A02.setVisibility(8);
                return;
            }
            textView.setText(C46031z1.A01(resources, i, r10.AZn()));
        }
        this.A03.setVisibility(0);
        if (this.A0B) {
        }
        this.A05.setOnClickListener(new C177447hz(this, r10));
        i2 = this.A0F;
        if (i2 <= 0) {
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        setMeasuredDimension(measuredWidth, Math.max(getMeasuredHeight(), measuredWidth));
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0Z0.A06(1391801969);
        super.onSizeChanged(i, i2, i3, i4);
        this.A00 = i;
        this.A0E = i2;
        if (i != i3) {
            A01(this);
        } else if (i < i2 && i3 == i4 && !this.A0B) {
            if (this.A0D) {
                this.A08.BCT(i, i2, true);
                C476524w A072 = C476624x.A07(this.A02);
                A072.A0G(1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                A072.A0T(true).A0O();
            }
            this.A0B = true;
        }
        AnonymousClass0Z0.A0D(-1913244077, A062);
    }

    public NametagResultCardView(Context context) {
        super(context);
        A00();
    }

    public NametagResultCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public NametagResultCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }
}
