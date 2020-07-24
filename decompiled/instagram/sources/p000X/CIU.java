package p000X;

import android.view.View;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout;

/* renamed from: X.CIU */
public final class CIU implements C44611wS {
    public final /* synthetic */ IgSegmentedTabLayout A00;

    public CIU(IgSegmentedTabLayout igSegmentedTabLayout) {
        this.A00 = igSegmentedTabLayout;
    }

    public final void onPageScrollStateChanged(int i) {
        IgSegmentedTabLayout igSegmentedTabLayout = this.A00;
        igSegmentedTabLayout.A00 = igSegmentedTabLayout.A01;
        igSegmentedTabLayout.A01 = i;
    }

    public final void onPageScrolled(int i, float f, int i2) {
        IgSegmentedTabLayout igSegmentedTabLayout = this.A00;
        int i3 = igSegmentedTabLayout.A01;
        if (i3 == 1 || (i3 == 2 && igSegmentedTabLayout.A00 == 1)) {
            View childAt = igSegmentedTabLayout.A02.getChildAt((int) Math.ceil((double) (((float) i) + f)));
            View childAt2 = this.A00.A02.getChildAt(i);
            float width = (float) ((this.A00.getWidth() - childAt2.getWidth()) / 2);
            this.A00.scrollTo((int) (((((float) childAt.getLeft()) - ((float) ((this.A00.getWidth() - childAt.getWidth()) / 2))) * f) + ((1.0f - f) * (((float) childAt2.getLeft()) - width))), 0);
            this.A00.A02.onPageScrolled(i, f, i2);
        }
    }

    public final void onPageSelected(int i) {
    }
}
