package p000X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* renamed from: X.1zC  reason: invalid class name and case insensitive filesystem */
public final class C46141zC extends C29121Or {
    public final Context A00;

    public final void A72(C29491Qc r2, Object obj, Object obj2) {
        r2.A00(0);
    }

    public final int ANH(int i, Object obj, Object obj2) {
        return Objects.hash(new Object[]{obj, obj2});
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C46141zC(Context context) {
        this.A00 = context;
    }

    public final void A6f(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0Z0.A03(1814628622);
        C66792w3.A02((C66782w2) view.getTag(), (AnonymousClass2PB) obj, (AnonymousClass2Oq) obj2);
        AnonymousClass0Z0.A0A(-960849321, A03);
    }

    public final View ABB(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0Z0.A03(-1104655762);
        View A002 = C66792w3.A00(this.A00, viewGroup);
        AnonymousClass0Z0.A0A(-395420675, A03);
        return A002;
    }
}
