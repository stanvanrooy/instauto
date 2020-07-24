package p000X;

import android.os.Bundle;
import com.facebook.C0003R;

/* renamed from: X.Bg2 */
public final class Bg2 implements AnonymousClass1N6 {
    public final /* synthetic */ C26105Bfi A00;

    public Bg2(C26105Bfi bfi) {
        this.A00 = bfi;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        AnonymousClass2MW r5 = (AnonymousClass2MW) obj;
        C26105Bfi bfi = this.A00;
        C26170Bgo A002 = AnonymousClass11G.A00();
        Object obj2 = r5.A00;
        AnonymousClass11J.A00(obj2);
        AnonymousClass1HD A01 = A002.A04.A01((String) obj2, (Bundle) r5.A01);
        AnonymousClass1H6 A0Q = bfi.getChildFragmentManager().A0Q();
        A0Q.A02(C0003R.C0005id.auth_container_view, A01);
        A0Q.A09();
    }
}
