package com.instagram.share.facebook.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.imageview.CircularImageView;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1EM;
import p000X.C019000b;
import p000X.C26771Ff;

public class FindPeopleButton extends LinearLayout {
    public int A00;
    public ImageView A01;
    public LinearLayout A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public CircularImageView A06;
    public String A07;
    public String A08;
    public String A09;

    public void setActionButtonOnClickListener(View.OnClickListener onClickListener) {
        this.A02.setOnClickListener(onClickListener);
    }

    public void setDismissButtonEnabled(boolean z) {
        ImageView imageView = this.A01;
        int i = 8;
        if (z) {
            i = 0;
        }
        imageView.setVisibility(i);
    }

    public void setDismissButtonOnClickListener(View.OnClickListener onClickListener) {
        this.A01.setOnClickListener(onClickListener);
    }

    public void setIcon(int i) {
        this.A06.setImageDrawable(C019000b.A03(getContext(), i));
    }

    private void A00(Context context, AttributeSet attributeSet) {
        View inflate = LayoutInflater.from(getContext()).inflate(C0003R.layout.layout_find_people_button, this);
        this.A02 = (LinearLayout) inflate.findViewById(C0003R.C0005id.layout_container_main);
        this.A06 = (CircularImageView) inflate.findViewById(C0003R.C0005id.find_people_imageview);
        this.A05 = (TextView) inflate.findViewById(C0003R.C0005id.find_people_title);
        this.A04 = (TextView) inflate.findViewById(C0003R.C0005id.find_people_subtitle);
        this.A03 = (TextView) inflate.findViewById(C0003R.C0005id.find_people_action_button);
        this.A01 = (ImageView) inflate.findViewById(C0003R.C0005id.find_people_dismiss_button);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A1j);
            if (obtainStyledAttributes.hasValue(3)) {
                this.A06.setImageDrawable(obtainStyledAttributes.getDrawable(3));
            }
            this.A00 = obtainStyledAttributes.getColor(4, AnonymousClass1BA.A01(context, C0003R.attr.glyphColorPrimary));
            int color = obtainStyledAttributes.getColor(6, 0);
            this.A06.A0A(obtainStyledAttributes.getDimensionPixelSize(7, 0), color);
            if (obtainStyledAttributes.hasValue(2)) {
                this.A09 = obtainStyledAttributes.getString(2);
            }
            if (obtainStyledAttributes.hasValue(1)) {
                this.A08 = obtainStyledAttributes.getString(1);
            }
            if (obtainStyledAttributes.hasValue(0)) {
                this.A07 = obtainStyledAttributes.getString(0);
            }
            if (obtainStyledAttributes.hasValue(5)) {
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(5, 0);
                this.A06.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        TextView textView = this.A05;
        Context context = getContext();
        textView.setTextColor(C019000b.A00(context, C0003R.color.igds_primary_text));
        this.A05.getPaint().setFakeBoldText(true);
        TextView textView2 = this.A04;
        getContext();
        textView2.setTextColor(C019000b.A00(context, C0003R.color.igds_secondary_text));
        this.A05.setText(this.A09);
        this.A04.setText(this.A08);
        this.A03.setText(this.A07);
        this.A06.getDrawable().mutate().setColorFilter(C26771Ff.A00(this.A00));
    }

    public void setButtonText(int i) {
        this.A07 = getContext().getString(i);
        this.A03.setText(i);
    }

    public void setSubtitle(int i) {
        this.A08 = getContext().getString(i);
        this.A04.setText(i);
    }

    public void setTitle(int i) {
        this.A09 = getContext().getString(i);
        this.A05.setText(i);
    }

    public FindPeopleButton(Context context) {
        super(context);
        A00(context, (AttributeSet) null);
    }

    public FindPeopleButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }

    public FindPeopleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }
}
