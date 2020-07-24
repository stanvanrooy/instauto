package p000X;

import android.view.View;
import android.widget.TextView;
import com.facebook.C0003R;

/* renamed from: X.ANQ */
public final class ANQ {
    public final View A00;
    public final View A01;
    public final TextView A02;
    public final TextView A03;

    public ANQ(View view) {
        this.A02 = (TextView) view.findViewById(C0003R.C0005id.iglive_label);
        View findViewById = view.findViewById(C0003R.C0005id.iglive_view_count_container);
        this.A01 = findViewById;
        this.A03 = (TextView) findViewById.findViewById(C0003R.C0005id.iglive_view_count);
        this.A00 = view.findViewById(C0003R.C0005id.iglive_livewith_kickout);
    }
}
