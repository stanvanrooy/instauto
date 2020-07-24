package com.instagram.creation.capture;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass25L;
import p000X.C173847bj;
import p000X.C182367qa;
import p000X.C25913Bc3;

public class GalleryMediaGridView extends RecyclerView {
    public int A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final GridLayoutManager A06;

    public int getFirstVisibleItemPosition() {
        return this.A06.A1g();
    }

    public int getScrollOffset() {
        int i;
        int i2;
        C182367qa r7 = (C182367qa) this.A0J;
        int A1g = this.A06.A1g();
        View A0Z = this.A06.A0Z(A1g);
        int i3 = 0;
        if (A0Z == null) {
            return 0;
        }
        int A022 = this.A06.A02.A02(A1g, getSpanCount());
        int i4 = this.A05 + this.A02;
        int i5 = RecyclerView.A01(A0Z).mItemViewType;
        if (i5 == 0) {
            if (!r7.A0G.isEmpty()) {
                i3 = (this.A03 + this.A02) << 1;
                A022 -= 2;
            }
            if (this.A01) {
                i--;
                i2 = this.A04 + this.A02;
                i3 += i2;
            }
        } else if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    throw new IllegalStateException("Invalid view type");
                } else if (A022 != 0) {
                    i3 = (this.A03 + this.A02) << 1;
                    i = A022 - 2;
                }
            } else if (A022 != 0) {
                i = A022 - 1;
                i3 = this.A03;
                i2 = this.A02;
                i3 += i2;
            }
            i = 0;
        } else {
            i3 = this.A02 + this.A03;
            i = A022 - 1;
        }
        return (i3 + (i * i4)) - A0Z.getTop();
    }

    public int getSpanCount() {
        return this.A06.A01;
    }

    public float getContentEdge() {
        int childCount = getChildCount();
        int height = getHeight();
        if (childCount == 0) {
            return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        View childAt = getChildAt(childCount - 1);
        return Math.min((float) height, (float) (childAt.getTop() + childAt.getHeight()));
    }

    public int getGridPadding() {
        return this.A02;
    }

    public int getThumbnailDimension() {
        return this.A05;
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i) + this.A02, C25913Bc3.MAX_SIGNED_POWER_OF_TWO), i2);
    }

    public void setBottomRowSpacing(int i) {
        this.A00 = i;
    }

    public void setShouldShowGalleryImportButton(boolean z) {
        this.A01 = z;
    }

    public GalleryMediaGridView(Context context) {
        this(context, (AttributeSet) null);
    }

    public GalleryMediaGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GalleryMediaGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A1x, i, 0);
        int i2 = obtainStyledAttributes.getInt(0, 4);
        this.A02 = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        obtainStyledAttributes.recycle();
        Resources resources = getResources();
        this.A05 = Math.round((float) ((resources.getDisplayMetrics().widthPixels - (this.A02 * (i2 - 1))) / i2));
        getResources();
        this.A03 = resources.getDimensionPixelSize(C0003R.dimen.gallery_header_row_height);
        getResources();
        this.A04 = resources.getDimensionPixelSize(C0003R.dimen.gallery_import_button_row_height);
        getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(i2);
        this.A06 = gridLayoutManager;
        gridLayoutManager.A23(new AnonymousClass25L(this));
        GridLayoutManager gridLayoutManager2 = this.A06;
        gridLayoutManager2.A02.A00 = true;
        setLayoutManager(gridLayoutManager2);
        A0r(new C173847bj(this));
        setOverScrollMode(2);
        setClipToPadding(false);
    }
}
