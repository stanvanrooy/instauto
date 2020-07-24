package p000X;

import android.view.View;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout;

/* renamed from: X.CIW */
public final class CIW implements View.OnClickListener {
    public final /* synthetic */ IgSegmentedTabLayout A00;

    public CIW(IgSegmentedTabLayout igSegmentedTabLayout) {
        this.A00 = igSegmentedTabLayout;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(786951320);
        IgSegmentedTabLayout igSegmentedTabLayout = this.A00;
        igSegmentedTabLayout.setSelectedIndex(igSegmentedTabLayout.A02.indexOfChild(view));
        AnonymousClass0Z0.A0C(-1902092504, A05);
    }
}
