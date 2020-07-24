package com.instagram.follow.chaining;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.C0003R;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass2KM;
import p000X.AnonymousClass3H7;
import p000X.C019000b;
import p000X.C26771Ff;

public class FollowChainingButton extends FrameLayout {
    public View A00;
    public String A01;
    public int A02;
    public int A03;
    public ProgressBar A04;
    public AnonymousClass2KM A05 = AnonymousClass2KM.Closed;
    public AnonymousClass3H7 A06 = new AnonymousClass3H7(C0003R.C0004drawable.follow_chaining_button_following_selector, C0003R.C0004drawable.follow_chaining_button_not_following_selector, C0003R.color.grey_9, C0003R.color.white);
    public boolean A07;

    private void setImageButtonContent(AnonymousClass2KM r4, ColorFilter colorFilter) {
        Drawable A032;
        ImageView imageView = (ImageView) this.A00;
        imageView.setPadding(0, 0, 0, 0);
        if (r4 == AnonymousClass2KM.Loading) {
            A032 = null;
        } else {
            A032 = C019000b.A03(getContext(), this.A03);
        }
        imageView.setImageDrawable(A032);
        if (imageView.getDrawable() != null) {
            imageView.getDrawable().mutate().setColorFilter(colorFilter);
        }
    }

    public final void A01(AnonymousClass2KM r9, boolean z) {
        int i;
        int i2;
        String str;
        this.A05 = r9;
        this.A07 = z;
        if (z) {
            AnonymousClass3H7 r0 = this.A06;
            i = r0.A01;
            i2 = r0.A00;
        } else {
            AnonymousClass3H7 r02 = this.A06;
            i = r02.A03;
            i2 = r02.A02;
        }
        ProgressBar progressBar = this.A04;
        AnonymousClass2KM r6 = AnonymousClass2KM.Loading;
        int i3 = 4;
        if (r9 == r6) {
            i3 = 0;
        }
        progressBar.setVisibility(i3);
        View view = this.A00;
        boolean z2 = false;
        if (r9 == AnonymousClass2KM.Open) {
            z2 = true;
        }
        view.setSelected(z2);
        this.A00.setBackgroundResource(i2);
        Context context = getContext();
        ColorFilter A002 = C26771Ff.A00(C019000b.A02(context, i).getColorForState(getDrawableState(), 0));
        if (this.A02 != 1) {
            setImageButtonContent(r9, A002);
        } else {
            TextView textView = (TextView) this.A00;
            if (r9 == r6) {
                str = "";
            } else {
                str = this.A01;
            }
            textView.setText(str);
            getContext();
            textView.setTextColor(C019000b.A02(context, i));
        }
        this.A04.getIndeterminateDrawable().setColorFilter(A002);
    }

    public void setButtonStyle(AnonymousClass3H7 r3) {
        this.A06 = r3;
        A01(this.A05, this.A07);
    }

    public void setText(String str) {
        boolean z = true;
        if (this.A02 != 1) {
            z = false;
        }
        AnonymousClass0a4.A09(z);
        this.A01 = str;
        A01(this.A05, this.A07);
    }

    private void A00(AttributeSet attributeSet, int i) {
        Context context = getContext();
        LayoutInflater.from(context).inflate(C0003R.layout.chaining_button, this, true);
        this.A04 = (ProgressBar) findViewById(C0003R.C0005id.chaining_button_progress_bar);
        ViewStub viewStub = (ViewStub) findViewById(C0003R.C0005id.chaining_button_content_stub);
        this.A02 = 0;
        if (attributeSet != null) {
            getContext();
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AnonymousClass1EM.A1q, i, 0);
            try {
                this.A02 = obtainStyledAttributes.getInt(0, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        if (this.A02 != 1) {
            viewStub.setLayoutResource(C0003R.layout.chaining_button_image);
            this.A03 = C0003R.C0004drawable.instagram_chevron_down_outline_12;
        } else {
            viewStub.setLayoutResource(C0003R.layout.chaining_button_text);
            getContext();
            this.A01 = context.getString(C0003R.string.suggested);
        }
        this.A00 = viewStub.inflate();
    }

    public FollowChainingButton(Context context) {
        super(context);
        A00((AttributeSet) null, 0);
    }

    public FollowChainingButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(attributeSet, 0);
    }

    public FollowChainingButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(attributeSet, i);
    }
}
