package com.instagram.p009ui.widget.loadmore;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ViewAnimator;
import com.facebook.C0003R;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.p009ui.widget.spinner.SpinnerImageView;
import p000X.Constants;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass1Ht;
import p000X.C019000b;
import p000X.C29081On;
import p000X.C36161hb;
import p000X.C36171hc;

/* renamed from: com.instagram.ui.widget.loadmore.LoadMoreButton */
public class LoadMoreButton extends ViewAnimator {
    public C29081On A00;
    public final float A01;

    public final void A03(C29081On r2) {
        A04(r2, (AnonymousClass1Ht) null);
    }

    public final void A04(C29081On r3, AnonymousClass1Ht r4) {
        String str;
        this.A00 = r3;
        getChildAt(Constants.A0C.intValue()).setOnClickListener(new C36161hb(this, r3, r4));
        getChildAt(Constants.A0N.intValue()).setOnClickListener(new C36171hc(this, r3, r4));
        if (!A02(r3)) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        if (r4 != null) {
            switch (A01(this.A00).intValue()) {
                case 1:
                    str = "INDEX_LOADING";
                    break;
                case 2:
                    str = "INDEX_LOAD_MORE";
                    break;
                case 3:
                    str = "INDEX_RETRY";
                    break;
                case 4:
                    str = NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED;
                    break;
                default:
                    str = "INDEX_NO_ITEMS";
                    break;
            }
            r4.B9d(str);
        }
        setViewType(this, r3, r4);
    }

    public static View A00(Context context, ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(context);
        View inflate = from.inflate(C0003R.layout.row_load_more, viewGroup, false);
        LoadMoreButton loadMoreButton = (LoadMoreButton) inflate.findViewById(C0003R.C0005id.row_load_more_button);
        View inflate2 = from.inflate(i, loadMoreButton, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        SpinnerImageView spinnerImageView = new SpinnerImageView(context);
        spinnerImageView.setBackgroundResource(C0003R.C0004drawable.spinner_large);
        spinnerImageView.setLayoutParams(layoutParams);
        spinnerImageView.setContentDescription(context.getResources().getString(C0003R.string.loading));
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(C019000b.A03(context, C0003R.C0004drawable.loadmore_add_compound));
        imageView.setLayoutParams(layoutParams);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(C019000b.A03(context, C0003R.C0004drawable.loadmore_icon_refresh_compound));
        imageView2.setContentDescription(context.getResources().getString(C0003R.string.retry));
        imageView2.setLayoutParams(layoutParams);
        loadMoreButton.addView(inflate2, Constants.ZERO.intValue());
        loadMoreButton.addView(spinnerImageView, Constants.ONE.intValue());
        loadMoreButton.addView(imageView, Constants.A0C.intValue());
        loadMoreButton.addView(imageView2, Constants.A0N.intValue());
        return inflate;
    }

    public static Integer A01(C29081On r1) {
        if (r1.AgL()) {
            return Constants.ONE;
        }
        if (r1.AfR()) {
            return Constants.A0N;
        }
        if (!r1.Abq()) {
            return Constants.ZERO;
        }
        if (r1.Abs()) {
            return Constants.A0C;
        }
        return Constants.A0Y;
    }

    public static boolean A02(C29081On r1) {
        if (!r1.AgJ()) {
            return false;
        }
        if (r1.AgL() || r1.AfR() || r1.Abs() || !r1.Abq()) {
            return true;
        }
        return false;
    }

    public static void setViewType(LoadMoreButton loadMoreButton, C29081On r3, AnonymousClass1Ht r4) {
        if (r3.AgL() && r4 != null) {
            r4.BMe();
        }
        Integer A012 = A01(r3);
        if (Constants.A0Y != A012) {
            loadMoreButton.setDisplayedChild(A012.intValue());
        }
    }

    public final void onMeasure(int i, int i2) {
        int round;
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        if (this.A01 == -1.0f) {
            round = getMeasuredHeight();
        } else {
            round = Math.round(((float) getMeasuredWidth()) / this.A01);
        }
        setMeasuredDimension(measuredWidth, round);
    }

    public LoadMoreButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public LoadMoreButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass1EM.A2g);
        this.A01 = obtainStyledAttributes.getFloat(0, -1.0f);
        obtainStyledAttributes.recycle();
    }
}
