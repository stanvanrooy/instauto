package p000X;

import androidx.viewpager.widget.ViewPager;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CIL */
public final class CIL extends AnonymousClass3DL {
    public final ViewPager A00;
    public final IgSegmentedTabLayout A01;
    public final CIJ A02;
    public final List A03 = new ArrayList();

    public final AnonymousClass1HD createItem(int i) {
        CIJ cij = this.A02;
        CIO cio = (CIO) this.A03.get(i);
        switch (cio.ordinal()) {
            case 0:
                return cij.A00;
            case 1:
                return cij.A01;
            default:
                throw new IllegalStateException("Invalid tabModel: " + cio);
        }
    }

    public final int getCount() {
        return this.A03.size();
    }

    public CIL(CIJ cij, AnonymousClass1AM r3, ViewPager viewPager, IgSegmentedTabLayout igSegmentedTabLayout) {
        super(r3);
        this.A02 = cij;
        this.A00 = viewPager;
        this.A01 = igSegmentedTabLayout;
        igSegmentedTabLayout.setViewPager(viewPager);
        ViewPager viewPager2 = this.A00;
        setContainer(viewPager2);
        viewPager2.setAdapter(this);
    }
}
