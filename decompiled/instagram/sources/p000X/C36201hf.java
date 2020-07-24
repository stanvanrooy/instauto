package p000X;

import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1hf  reason: invalid class name and case insensitive filesystem */
public final class C36201hf extends C256219o {
    public final /* synthetic */ AnonymousClass2KG A00;

    public C36201hf(AnonymousClass2KG r1) {
        this.A00 = r1;
    }

    public final void A08(C255119b r3, int i) {
        int A03 = AnonymousClass0Z0.A03(461936046);
        this.A00.A0S.A08(r3, i);
        AnonymousClass0Z0.A0A(35428549, A03);
    }

    public final void A09(C255119b r5, int i, int i2, int i3, int i4, int i5) {
        AnonymousClass1I1 r0;
        int A03 = AnonymousClass0Z0.A03(-1731488030);
        ViewGroup AaK = r5.AaK();
        if (r5.AgC()) {
            AbsListView absListView = (AbsListView) AaK;
            AnonymousClass2KG r1 = this.A00;
            if (!r1.A02.Aey()) {
                r0 = r1.A0S;
            } else if (C256119n.A04(absListView)) {
                AnonymousClass2KG r12 = this.A00;
                r12.A02.Aq6();
                r0 = r12.A0S;
            }
            r0.onScroll(absListView, i, i2, i3);
        } else {
            this.A00.A0S.onScrolled((RecyclerView) AaK, i4, i5);
            this.A00.A02.Aq6();
        }
        AnonymousClass0Z0.A0A(2109017180, A03);
    }
}
