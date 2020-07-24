package com.instagram.creation.base.p029ui.mediaeditactionbar;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.facebook.C0003R;
import com.instagram.common.p004ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.creation.state.CreationState;
import com.instagram.p009ui.widget.base.TriangleSpinner;
import p000X.Constants;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1X5;
import p000X.AnonymousClass7x3;
import p000X.C11200ea;
import p000X.C120125Dh;
import p000X.C182797rM;
import p000X.C183927tU;
import p000X.C183997tb;
import p000X.C186047x8;
import p000X.C186077xB;
import p000X.C186267xU;
import p000X.C23300zv;

/* renamed from: com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar */
public class MediaEditActionBar extends ViewSwitcher implements C11200ea {
    public boolean A00;
    public boolean A01;
    public boolean A02 = false;
    public final LinearLayout A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final ColorFilterAlphaImageView A07;
    public final TriangleSpinner A08;
    public final boolean A09;
    public final Paint A0A;
    public final C23300zv A0B;

    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.dispatchDraw(canvas);
        if (this.A00) {
            int left = getLeft();
            int right = getRight();
            float bottom = (float) (getBottom() - 1);
            canvas2.drawLine((float) left, bottom, (float) right, bottom, this.A0A);
        }
    }

    public MediaEditActionBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = getContext();
        this.A0B = C23300zv.A00(((C182797rM) context2).AZl());
        LayoutInflater.from(context).inflate(C0003R.layout.media_edit_action_bar, this);
        ColorFilterAlphaImageView colorFilterAlphaImageView = (ColorFilterAlphaImageView) findViewById(C0003R.C0005id.button_back);
        this.A07 = colorFilterAlphaImageView;
        colorFilterAlphaImageView.setOnClickListener(new AnonymousClass7x3(this));
        this.A06 = (TextView) findViewById(C0003R.C0005id.action_bar_textview_title);
        this.A08 = (TriangleSpinner) findViewById(C0003R.C0005id.user_spinner);
        this.A05 = (TextView) findViewById(C0003R.C0005id.next_button_textview);
        getContext();
        this.A09 = C183997tb.A02(context2);
        Paint paint = new Paint();
        this.A0A = paint;
        getContext();
        paint.setColor(AnonymousClass1BA.A01(context2, C0003R.attr.creationDividerColor));
        this.A0A.setStyle(Paint.Style.STROKE);
        this.A0A.setStrokeWidth(1.0f);
        if (this.A09) {
            this.A04 = null;
        } else {
            getContext();
            FrameLayout frameLayout = new FrameLayout(context2);
            View inflate = LayoutInflater.from(context).inflate(C0003R.layout.accept_reject_edit_buttons_small, frameLayout, false);
            inflate.setId(C0003R.C0005id.primary_accept_buttons);
            View inflate2 = LayoutInflater.from(context).inflate(C0003R.layout.accept_reject_edit_buttons_small, frameLayout, false);
            inflate2.setId(C0003R.C0005id.secondary_accept_buttons);
            setupDividers(inflate);
            setupDividers(inflate2);
            frameLayout.addView(inflate);
            frameLayout.addView(inflate2);
            addView(frameLayout);
            this.A04 = (TextView) findViewById(C0003R.C0005id.primary_accept_buttons).findViewById(C0003R.C0005id.adjust_title);
        }
        getContext();
        LinearLayout linearLayout = new LinearLayout(context2);
        this.A03 = linearLayout;
        linearLayout.setId(C0003R.C0005id.creation_secondary_actions);
        this.A03.setGravity(17);
        ((LinearLayout) getChildAt(0)).addView(this.A03, 1, new LinearLayout.LayoutParams(0, -1, 1.0f));
        this.A06.setVisibility(8);
    }

    private void setupDividers(View view) {
        View findViewById = view.findViewById(C0003R.C0005id.button_cancel_adjust);
        Context context = getContext();
        Resources.Theme theme = context.getTheme();
        Integer num = Constants.ZERO;
        findViewById.setBackground(new AnonymousClass1X5(theme, num));
        View findViewById2 = view.findViewById(C0003R.C0005id.button_accept_adjust);
        getContext();
        findViewById2.setBackground(new AnonymousClass1X5(context.getTheme(), num));
    }

    public TriangleSpinner getUserSpinner() {
        return this.A08;
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0Z0.A06(1311023865);
        super.onAttachedToWindow();
        ((C183927tU) getContext()).BZV(this);
        AnonymousClass0Z0.A0D(-464394390, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0Z0.A06(-49481709);
        super.onDetachedFromWindow();
        this.A0B.A03(C186077xB.class, this);
        AnonymousClass0Z0.A0D(-1598417570, A062);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0040, code lost:
        p000X.AnonymousClass0Z0.A0A(436187193, r2);
        p000X.AnonymousClass0Z0.A0A(188944928, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f3, code lost:
        r0.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f6, code lost:
        r0 = r7.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f8, code lost:
        if (r0 == null) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00fa, code lost:
        r0.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0181, code lost:
        r1.setText(r0);
        r7.A03.setVisibility(8);
        r7.A05.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        if (r4 == com.instagram.creation.state.CreationState.A02) goto L_0x0021;
     */
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        boolean z;
        TextView textView;
        int i;
        TextView textView2;
        TextView textView3;
        int i2;
        int A032 = AnonymousClass0Z0.A03(314483075);
        C186077xB r8 = (C186077xB) obj;
        int A033 = AnonymousClass0Z0.A03(-1397635106);
        CreationState creationState = r8.A02;
        if (!(creationState == CreationState.PHOTO_EDIT || creationState == CreationState.VIDEO_EDIT)) {
            z = false;
        }
        z = true;
        if (z != this.A00) {
            this.A00 = z;
            invalidate();
        }
        this.A05.setVisibility(8);
        this.A08.setVisibility(8);
        switch (r8.A02.ordinal()) {
            case 0:
                this.A07.setVisibility(0);
                setupBackButton(C186047x8.BACK);
                this.A06.setVisibility(0);
                this.A06.setText(C0003R.string.alt_text_title);
                this.A03.setVisibility(8);
                this.A05.setVisibility(0);
                break;
            case 1:
                if (!this.A09) {
                    this.A04.setText(((C186267xU) r8.A00.A00).A00);
                    setDisplayedChild(1);
                    break;
                } else {
                    this.A06.setText(((C186267xU) r8.A00.A00).A00);
                    this.A06.setVisibility(0);
                    setupBackButton(C186047x8.GONE);
                    this.A07.setVisibility(8);
                }
            case 2:
                this.A07.setVisibility(0);
                setupBackButton(C186047x8.BACK);
                this.A06.setVisibility(0);
                textView = this.A06;
                i = C0003R.string.advanced_settings;
                break;
            case 3:
                this.A05.setVisibility(0);
                this.A06.setVisibility(8);
                this.A07.setVisibility(0);
                this.A03.setVisibility(0);
                break;
            case 6:
                this.A07.setVisibility(0);
                this.A06.setVisibility(0);
                textView = this.A06;
                i = C0003R.string.branded_content_tag_opt_in;
                break;
            case C120125Dh.VIEW_TYPE_SPINNER:
                this.A07.setVisibility(0);
                this.A06.setVisibility(0);
                textView = this.A06;
                i = C0003R.string.limit_locations;
                break;
            case C120125Dh.VIEW_TYPE_LINK:
                setupBackButton(C186047x8.FINISH);
                this.A06.setText(C0003R.string.manage_filters_title);
                textView2 = this.A06;
                break;
            case 15:
                setupBackButton(C186047x8.CANCEL);
                this.A06.setVisibility(0);
                textView2 = this.A05;
                break;
            case 16:
            case 20:
            case C120125Dh.VIEW_TYPE_BRANDING:
                this.A05.setVisibility(0);
                this.A06.setVisibility(8);
                this.A07.setVisibility(0);
                this.A03.setVisibility(0);
                setDisplayedChild(0);
                break;
            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM:
                setupBackButton(C186047x8.BACK);
                this.A05.setVisibility(0);
                LinearLayout linearLayout = this.A03;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                if (this.A01) {
                    textView3 = this.A06;
                    i2 = C0003R.string.new_profile_photo;
                } else if (this.A02) {
                    this.A06.setVisibility(8);
                    this.A08.setVisibility(0);
                    break;
                } else {
                    textView3 = this.A06;
                    i2 = C0003R.string.share_new_post_title;
                }
                textView3.setText(i2);
                this.A06.setVisibility(0);
                this.A08.setVisibility(8);
                break;
            case 18:
                this.A07.setVisibility(0);
                setupBackButton(C186047x8.CANCEL);
                this.A06.setVisibility(0);
                textView = this.A06;
                i = C0003R.string.preview_title;
                break;
        }
    }

    public void setupBackButton(C186047x8 r5) {
        ColorFilterAlphaImageView colorFilterAlphaImageView;
        int i;
        switch (r5.ordinal()) {
            case 0:
                colorFilterAlphaImageView = this.A07;
                i = C0003R.C0004drawable.instagram_arrow_back_24;
                break;
            case 3:
                colorFilterAlphaImageView = this.A07;
                i = C0003R.C0004drawable.instagram_x_outline_24;
                break;
            case 4:
                colorFilterAlphaImageView = this.A07;
                i = C0003R.C0004drawable.check;
                break;
            case 5:
                this.A07.setVisibility(8);
                return;
            default:
                return;
        }
        colorFilterAlphaImageView.setImageResource(i);
        this.A07.setBackground(new AnonymousClass1X5(getContext().getTheme(), Constants.ZERO));
    }

    public void setIsProfilePhoto(boolean z) {
        this.A01 = z;
    }

    public void setShouldShowUserSpinner(boolean z) {
        this.A02 = z;
    }
}
