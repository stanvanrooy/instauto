package p000X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.C0003R;

/* renamed from: X.CPB */
public final class CPB {
    public static CPE A00(ViewGroup viewGroup) {
        CPE cpe = new CPE(LayoutInflater.from(viewGroup.getContext()).inflate(C0003R.layout.product_picker_spinner_row, viewGroup, false));
        cpe.A00.setVisibility(0);
        return cpe;
    }
}
