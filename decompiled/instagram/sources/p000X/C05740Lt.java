package p000X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.0Lt  reason: invalid class name and case insensitive filesystem */
public final class C05740Lt extends AnonymousClass2MK {
    public final C28384Cg2 A00;
    public final C28391Cg9 A01;

    public final Class A02() {
        return C28353CfX.class;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0021, code lost:
        if (r5.A08 != false) goto L_0x0023;
     */
    public final /* bridge */ /* synthetic */ void A04(C40371oY r11, AnonymousClass1ZK r12) {
        boolean z;
        C28353CfX cfX = (C28353CfX) r11;
        C28259Ce0 ce0 = cfX.A00;
        View view = ((C28362Cfg) r12).itemView;
        Context context = view.getContext();
        AnonymousClass5JJ r4 = cfX.A00;
        C28384Cg2 cg2 = this.A00;
        C28391Cg9 cg9 = this.A01;
        C28324Cf4 cf4 = (C28324Cf4) view.getTag();
        boolean z2 = ce0.A0A;
        if (!ce0.A0B) {
            z = false;
        }
        z = true;
        C28316Cew.A01(context, r4, ce0, cg2, cg9, cf4, new C28395CgD(false, z2, z));
    }

    public C05740Lt(C28384Cg2 cg2, C28391Cg9 cg9) {
        this.A00 = cg2;
        this.A01 = cg9;
    }

    public final AnonymousClass1ZK A01(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C28362Cfg(C28316Cew.A00(viewGroup.getContext(), viewGroup));
    }
}
