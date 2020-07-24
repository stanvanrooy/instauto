package com.instagram.actionbar;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ViewSwitcher;
import com.facebook.C0003R;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import com.instagram.p009ui.widget.spinner.RefreshSpinner;

public class ActionButton extends ViewSwitcher {
    public ImageView A00;
    public ImageView A01;

    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(20);
        public int A00;

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A00);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.A00 = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public final void A00(Context context) {
        ImageView imageView = new ImageView(context);
        this.A00 = imageView;
        imageView.setImageResource(C0003R.C0004drawable.nav_refresh);
        this.A00.setScaleType(ImageView.ScaleType.CENTER);
        addView(this.A00);
        this.A01 = new RefreshSpinner(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(this.A01, new FrameLayout.LayoutParams(-2, -2));
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0003R.dimen.refresh_button_size);
        addView(frameLayout, new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize, 17));
    }

    public void setButtonDrawable(Drawable drawable) {
        this.A00.setImageDrawable(drawable);
    }

    public void setButtonResource(int i) {
        this.A00.setImageResource(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A00.getDrawable().mutate().setColorFilter(colorFilter);
        this.A01.getDrawable().mutate().setColorFilter(colorFilter);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setDisplayedChild(savedState.A00);
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.A00 = getDisplayedChild();
        return savedState;
    }

    public void setDisplayedChild(int i) {
        super.setDisplayedChild(i);
        boolean z = false;
        if (i == 0) {
            z = true;
        }
        setClickable(z);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        Drawable mutate = this.A00.getDrawable().mutate();
        int i = 77;
        if (z) {
            i = 255;
        }
        mutate.setAlpha(i);
    }

    public ActionButton(Context context) {
        super(context);
        A00(context);
    }

    public ActionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context);
    }
}
