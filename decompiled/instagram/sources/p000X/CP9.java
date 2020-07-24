package p000X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.C0003R;

/* renamed from: X.CP9 */
public final class CP9 {
    public static CPA A00(ViewGroup viewGroup) {
        CPA cpa = new CPA(LayoutInflater.from(viewGroup.getContext()).inflate(C0003R.layout.product_picker_spinner_and_message_row, viewGroup, false));
        cpa.A01.A02(0);
        return cpa;
    }

    public static void A01(CPA cpa, String str) {
        if (str.isEmpty()) {
            cpa.A00.setText(C0003R.string.searching);
            return;
        }
        cpa.A00.setText(cpa.itemView.getContext().getString(C0003R.string.search_for_x, new Object[]{str}));
    }
}
