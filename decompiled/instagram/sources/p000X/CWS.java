package p000X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.CWS */
public final class CWS extends AnonymousClass1S9 {
    public final CWR A00;
    public final RecyclerView A01;
    public final AnonymousClass1SI A02;

    public final /* bridge */ /* synthetic */ void AqA(Object obj) {
        C27920CWi cWi = (C27920CWi) obj;
        CWR cwr = this.A00;
        if (cwr != null && !cWi.AZB().equals(C93.SWIPE_TO_OPEN)) {
            cwr.A02(cWi.getId());
        }
    }

    public final /* bridge */ /* synthetic */ void AqC(Object obj, int i) {
        C27920CWi cWi = (C27920CWi) obj;
        CWR cwr = this.A00;
        if (cwr != null && !cWi.AZB().equals(C93.SWIPE_TO_OPEN)) {
            cwr.A05.put(cWi.getId(), new C27918CWg(Long.valueOf(System.currentTimeMillis())));
        }
    }

    public final void Bu0(AnonymousClass1SM r8, int i) {
        C27920CWi cWi = (C27920CWi) this.A02.AYs(i);
        r8.Bu2(cWi.getId(), cWi, i);
        RecyclerView recyclerView = this.A01;
        View childAt = recyclerView.getChildAt(i - ((LinearLayoutManager) recyclerView.A0L).A1g());
        if (this.A00 != null) {
            float f = 1.0f;
            if (childAt.getBottom() > this.A01.getHeight()) {
                f = 1.0f - (((float) (childAt.getBottom() - this.A01.getHeight())) / ((float) childAt.getHeight()));
            }
            CWR cwr = this.A00;
            double d = (double) f;
            if (!cWi.AZB().equals(C93.SWIPE_TO_OPEN)) {
                Float f2 = (Float) cwr.A07.get(cWi.getId());
                if (f2 == null) {
                    f2 = Float.valueOf(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                }
                if (d > ((double) f2.floatValue())) {
                    cwr.A07.put(cWi.getId(), Float.valueOf((float) d));
                }
            }
        }
    }

    public CWS(AnonymousClass1SI r1, CWR cwr, RecyclerView recyclerView) {
        this.A02 = r1;
        this.A00 = cwr;
        this.A01 = recyclerView;
    }

    public final Class AYu() {
        return C27920CWi.class;
    }

    public final void AqD(Object obj, View view, double d) {
    }
}
