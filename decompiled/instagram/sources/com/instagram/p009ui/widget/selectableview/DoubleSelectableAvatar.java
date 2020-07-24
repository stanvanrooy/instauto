package com.instagram.p009ui.widget.selectableview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.imageview.CircularImageView;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass6BI;
import p000X.AnonymousClass7GS;
import p000X.C019000b;
import p000X.C06220Of;
import p000X.C26771Ff;

/* renamed from: com.instagram.ui.widget.selectableview.DoubleSelectableAvatar */
public class DoubleSelectableAvatar extends AnonymousClass6BI {
    public int A00;
    public ImageView A01;
    public CircularImageView A02;
    public CircularImageView A03;

    private void A00(Context context, AttributeSet attributeSet) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A17);
        Context context2 = getContext();
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(C0003R.dimen.avatar_size_large);
        this.A00 = dimensionPixelSize;
        if (obtainStyledAttributes.hasValue(0)) {
            this.A00 = obtainStyledAttributes.getDimensionPixelSize(0, this.A00);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            z = obtainStyledAttributes.getBoolean(1, true);
        } else {
            z = true;
        }
        obtainStyledAttributes.recycle();
        getContext();
        View inflate = LayoutInflater.from(context2).inflate(C0003R.layout.selectable_avatar_double, this, true);
        this.A03 = (CircularImageView) inflate.findViewById(C0003R.C0005id.selectable_avatar_front);
        this.A02 = (CircularImageView) inflate.findViewById(C0003R.C0005id.selectable_avatar_back);
        ImageView imageView = (ImageView) inflate.findViewById(C0003R.C0005id.select_check_mark);
        this.A01 = imageView;
        getContext();
        imageView.setColorFilter(C26771Ff.A00(C019000b.A00(context2, C0003R.color.white)));
        if (this.A00 != dimensionPixelSize) {
            getContext();
            this.A00 = (int) Math.floor((double) ((this.A00 * dimensionPixelSize) / context2.getResources().getDimensionPixelSize(C0003R.dimen.avatar_size_xxlarge)));
            this.A03.getLayoutParams().width = this.A00;
            this.A03.getLayoutParams().height = this.A00;
            this.A02.getLayoutParams().width = this.A00;
            this.A02.getLayoutParams().height = this.A00;
            View findViewById = inflate.findViewById(C0003R.C0005id.selectable_avatar_front_container);
            int floor = (int) Math.floor((double) ((((int) C06220Of.A05(getResources().getDisplayMetrics(), 10)) * this.A00) / dimensionPixelSize));
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(findViewById.getLayoutParams());
            marginLayoutParams.setMargins(floor, floor, 0, 0);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(marginLayoutParams);
            layoutParams.gravity = 0;
            findViewById.setLayoutParams(layoutParams);
            View findViewById2 = inflate.findViewById(C0003R.C0005id.selectable_avatar_front_background);
            int i = this.A00;
            getContext();
            int dimensionPixelSize2 = i + (context2.getResources().getDimensionPixelSize(C0003R.dimen.selectable_view_stroke_width) << 1);
            findViewById2.getLayoutParams().width = dimensionPixelSize2;
            findViewById2.getLayoutParams().height = dimensionPixelSize2;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.A02.getLayoutParams();
        if (z) {
            getContext();
            int dimensionPixelSize3 = context2.getResources().getDimensionPixelSize(C0003R.dimen.selectable_view_stroke_width);
            marginLayoutParams2.setMargins(dimensionPixelSize3, dimensionPixelSize3, 0, 0);
        } else {
            this.A05 = 0;
            marginLayoutParams2.setMargins(0, 0, 0, 0);
        }
        this.A01 = getStrokeDrawable();
    }

    public Drawable getStrokeDrawable() {
        Context context = getContext();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0003R.dimen.selectable_view_stroke_width);
        getContext();
        int A002 = C019000b.A00(context, C0003R.color.blue_5);
        int i = this.A00;
        getContext();
        return new AnonymousClass7GS(dimensionPixelSize, A002, i, context.getResources().getDimensionPixelSize(C0003R.dimen.selectable_view_stroke_padding));
    }

    public void setCheckmark(boolean z) {
        if (z) {
            ColorFilter A002 = C26771Ff.A00(C019000b.A00(getContext(), C0003R.color.black_60_transparent));
            this.A03.setColorFilter(A002);
            this.A02.setColorFilter(A002);
            this.A01.setVisibility(0);
            return;
        }
        this.A03.setColorFilter((ColorFilter) null);
        this.A02.setColorFilter((ColorFilter) null);
        this.A01.setVisibility(8);
    }

    public void setUrls(String str, String str2) {
        if (str != null) {
            this.A03.setUrl(str);
        } else {
            this.A03.A04();
        }
        if (str2 != null) {
            this.A02.setUrl(str2);
        } else {
            this.A02.A04();
        }
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.A03.setAlpha(255);
        this.A02.setAlpha(255);
    }

    public DoubleSelectableAvatar(Context context) {
        super(context);
        A00(context, (AttributeSet) null);
    }

    public DoubleSelectableAvatar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }

    public DoubleSelectableAvatar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }
}
