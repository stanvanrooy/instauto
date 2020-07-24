package p000X;

import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0003R;

/* renamed from: X.CUM */
public final class CUM extends C29121Or {
    public final int getViewTypeCount() {
        return 1;
    }

    public final void A72(C29491Qc r3, Object obj, Object obj2) {
        r3.A01(0, (C27863CUd) obj, 0);
    }

    public final void A6f(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0Z0.A03(723797583);
        C27863CUd cUd = (C27863CUd) obj;
        C27860CUa cUa = (C27860CUa) view.getTag();
        cUa.A01.setText(cUd.A01);
        cUa.A00.setText(cUd.A00);
        cUa.A00.setText(cUd.A00);
        cUa.A00.setMovementMethod(LinkMovementMethod.getInstance());
        AnonymousClass0Z0.A0A(-1191980627, A03);
    }

    public final View ABB(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0Z0.A03(2135529451);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0003R.layout.catalog_inline_title_layout, viewGroup, false);
        inflate.setTag(new C27860CUa(inflate));
        AnonymousClass0Z0.A0A(496505020, A03);
        return inflate;
    }
}
