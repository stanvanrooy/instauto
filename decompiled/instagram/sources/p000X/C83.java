package p000X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.C0003R;

/* renamed from: X.C83 */
public final class C83 extends AnonymousClass2MK {
    public C88 A00;
    public String A01;

    public final /* bridge */ /* synthetic */ AnonymousClass1ZK A01(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C82(layoutInflater.inflate(C0003R.layout.creators_row, viewGroup, false), this.A00);
    }

    public final /* bridge */ /* synthetic */ void A04(C40371oY r4, AnonymousClass1ZK r5) {
        ((C82) r5).A00.A04(((C84) r4).A00, this.A01);
    }

    public C83(String str, C88 c88) {
        this.A01 = str;
        this.A00 = c88;
    }

    public final Class A02() {
        return C84.class;
    }
}
