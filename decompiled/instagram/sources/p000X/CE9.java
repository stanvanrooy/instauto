package p000X;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import com.facebook.C0003R;
import java.util.List;

/* renamed from: X.CE9 */
public final class CE9 implements C27517CGh {
    public final /* synthetic */ CE7 A00;

    public CE9(CE7 ce7) {
        this.A00 = ce7;
    }

    public final void B82(C27473CEp cEp) {
        boolean z;
        boolean A02 = CDX.A02(cEp, this.A00.A07.A07.A05);
        CE7 ce7 = this.A00;
        Context context = ce7.getContext();
        AnonymousClass0a4.A06(context);
        if (!((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(ce7.A02.getWindowToken(), 0)) {
            CEG ceg = ce7.A06;
            List list = ceg.A01.A07.A05;
            list.add(cEp);
            CFS cfs = ceg.A01.A07;
            AnonymousClass0a4.A06(list);
            cfs.A05 = list;
            CDA.A00(ceg.A02, Constants.A14);
            ceg.notifyDataSetChanged();
            ce7.A00.getText().clear();
            z = true;
        } else {
            z = false;
        }
        if (z && A02) {
            this.A00.A09.add(cEp);
            CE7 ce72 = this.A00;
            Context context2 = ce72.getContext();
            AnonymousClass0a4.A06(context2);
            C53642Tq.A01(context2, ce72.getString(C0003R.string.ad_geo_location_overlapping_error_message, cEp.A05), 0).show();
            CE7.A00(this.A00);
        }
    }
}
