package p000X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;

/* renamed from: X.CXD */
public final class CXD {
    public CYD A00;
    public View A01;
    public final View A02;
    public final View A03;
    public final ViewGroup A04;
    public final RecyclerView A05;

    public final View A00() {
        if (this.A01 == null) {
            ViewGroup viewGroup = this.A04;
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0003R.layout.canvas_swipe_to_open_block, viewGroup, false);
            this.A01 = inflate;
            this.A04.addView(inflate);
        }
        return this.A01;
    }

    public CXD(ViewGroup viewGroup, RecyclerView recyclerView, View view, View view2) {
        this.A04 = viewGroup;
        this.A05 = recyclerView;
        this.A02 = view;
        this.A03 = view2;
    }
}
