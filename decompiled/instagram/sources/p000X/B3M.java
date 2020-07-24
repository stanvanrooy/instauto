package p000X;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: X.B3M */
public final class B3M implements AdapterView.OnItemClickListener {
    public final /* synthetic */ B3G A00;
    public final /* synthetic */ C31011Wc A01;

    public B3M(C31011Wc r1, B3G b3g) {
        this.A01 = r1;
        this.A00 = b3g;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C31011Wc r2 = this.A01;
        if (r2.A06) {
            B3I b3i = (B3I) this.A00.A04.get(r2.A00);
            boolean z = false;
            if (b3i.A01 == Constants.ONE) {
                z = true;
            }
            if (z) {
                B3K b3k = (B3K) b3i.A04.get(i);
                b3k.A03 = !b3k.A03;
                ((B3Q) adapterView.getAdapter()).A00();
                return;
            }
            B3K b3k2 = (B3K) adapterView.getItemAtPosition(i);
            b3k2.A00++;
            C31011Wc.A03(this.A01, this.A00, new String[]{b3k2.A02});
        }
    }
}
