package com.instagram.business.p015ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.text.TitleTextView;
import com.instagram.p009ui.widget.spinner.RefreshSpinner;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass3BL;
import p000X.AnonymousClass64Q;
import p000X.C06590Pq;

/* renamed from: com.instagram.business.ui.BusinessNavBar */
public class BusinessNavBar extends LinearLayout {
    public CharSequence A00;
    public View A01;
    public View A02;
    public View A03;
    public LinearLayout A04;
    public TextView A05;
    public TextView A06;
    public TitleTextView A07;
    public RefreshSpinner A08;
    public boolean A09;

    public final void A05(CharSequence charSequence, int i, int i2) {
        this.A07.setText(charSequence);
        this.A07.setIsBold(true);
        this.A07.setTextColor(i);
        this.A07.setTextSize(0, (float) i2);
    }

    public final void A00() {
        if (this.A01 != null) {
            boolean z = true;
            int i = 0;
            boolean z2 = false;
            if (this.A07.getVisibility() == 8) {
                z2 = true;
            }
            if (this.A04.getVisibility() != 8) {
                z = false;
            }
            View view = this.A01;
            if (!z2 || !z) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public final void A01() {
        this.A02.setVisibility(8);
        this.A04.setVisibility(0);
        this.A07.setPadding(0, 0, 0, 0);
        A00();
    }

    public final void A02() {
        this.A03.setVisibility(8);
    }

    public final void A06(boolean z) {
        TitleTextView titleTextView = this.A07;
        int i = 8;
        if (z) {
            i = 0;
        }
        titleTextView.setVisibility(i);
        A00();
    }

    public void setPrimaryButtonEnabled(boolean z) {
        this.A06.setEnabled(z);
        Drawable background = this.A03.getBackground();
        int i = 64;
        if (z) {
            i = 255;
        }
        background.setAlpha(i);
    }

    public void setPrimaryButtonOnclickListeners(View.OnClickListener onClickListener) {
        this.A06.setOnClickListener(onClickListener);
    }

    public void setSecondaryButtonOnclickListeners(View.OnClickListener onClickListener) {
        this.A07.setOnClickListener(onClickListener);
    }

    public void setShowProgressBarOnPrimaryButton(boolean z) {
        CharSequence charSequence;
        if (this.A09 != z) {
            this.A09 = z;
            RefreshSpinner refreshSpinner = this.A08;
            int i = 4;
            if (z) {
                i = 0;
            }
            refreshSpinner.setVisibility(i);
            TextView textView = this.A06;
            if (z) {
                charSequence = "";
            } else {
                charSequence = this.A00;
            }
            textView.setText(charSequence);
            setPrimaryButtonEnabled(!z);
        }
    }

    public final void A03(AttributeSet attributeSet) {
        Context context = getContext();
        View inflate = LayoutInflater.from(context).inflate(C0003R.layout.business_nav_bar, this);
        this.A03 = inflate.findViewById(C0003R.C0005id.primary_button_container);
        this.A06 = (TextView) inflate.findViewById(C0003R.C0005id.primary_button_text);
        this.A08 = (RefreshSpinner) inflate.findViewById(C0003R.C0005id.primary_button_progress);
        this.A07 = (TitleTextView) inflate.findViewById(C0003R.C0005id.secondary_button);
        this.A04 = (LinearLayout) inflate.findViewById(C0003R.C0005id.business_fb_page_footer);
        this.A05 = (TextView) inflate.findViewById(C0003R.C0005id.business_fb_page_footer_text);
        this.A02 = inflate.findViewById(C0003R.C0005id.divider_line);
        this.A01 = inflate.findViewById(C0003R.C0005id.bb_extra_padding);
        if (attributeSet != null) {
            getContext();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A0W);
            if (obtainStyledAttributes.hasValue(0)) {
                setPrimaryButtonText((CharSequence) obtainStyledAttributes.getString(0));
            }
            if (obtainStyledAttributes.hasValue(1)) {
                setSecondaryButtonText((CharSequence) obtainStyledAttributes.getString(1));
            }
            if (obtainStyledAttributes.hasValue(2) && obtainStyledAttributes.getBoolean(2, false)) {
                this.A07.setVisibility(0);
            }
            if (obtainStyledAttributes.hasValue(3) && obtainStyledAttributes.getBoolean(3, false)) {
                this.A04.setVisibility(0);
            }
            A00();
            obtainStyledAttributes.recycle();
        }
    }

    public final void A04(View view) {
        getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass64Q(this, view));
    }

    public BusinessNavBar(Context context) {
        super(context);
        A03((AttributeSet) null);
    }

    public BusinessNavBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A03(attributeSet);
    }

    public void setFooterTerms(C06590Pq r7, String str, String str2) {
        AnonymousClass3BL.A06(getContext(), r7, this.A05, str, str2, "https://www.facebook.com/page_guidelines.php");
    }

    public void setFooterTerms(C06590Pq r7, String str, String str2, String str3) {
        AnonymousClass3BL.A06(getContext(), r7, this.A05, str, str2, str3);
    }

    public void setFooterTerms(CharSequence charSequence) {
        this.A05.setText(charSequence);
    }

    public void setPrimaryButtonText(int i) {
        setPrimaryButtonText((CharSequence) getResources().getString(i));
    }

    public void setPrimaryButtonText(CharSequence charSequence) {
        this.A00 = charSequence;
        this.A06.setText(charSequence);
    }

    public void setSecondaryButtonText(int i) {
        this.A07.setText(getResources().getString(i));
    }

    public void setSecondaryButtonText(CharSequence charSequence) {
        this.A07.setText(charSequence);
    }
}
