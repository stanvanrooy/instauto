package p000X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: X.0Vq  reason: invalid class name and case insensitive filesystem */
public final class C08100Vq extends AnonymousClass2MK {
    public final Context A00;
    public final C110864py A01;

    public final AnonymousClass1ZK A01(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new AnonymousClass44B(C110604pY.A00(layoutInflater, viewGroup));
    }

    public final Class A02() {
        return C109794oC.class;
    }

    public final /* bridge */ /* synthetic */ void A04(C40371oY r8, AnonymousClass1ZK r9) {
        C109794oC r82 = (C109794oC) r8;
        C110604pY.A01(this.A00, (C110704pi) ((AnonymousClass44B) r9).itemView.getTag(), r82.A01, r82.A00, r82.A02, this.A01);
    }

    public C08100Vq(Context context, C110864py r2) {
        this.A00 = context;
        this.A01 = r2;
    }
}
