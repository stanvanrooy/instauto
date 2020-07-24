package p000X;

import android.view.View;
import java.util.ArrayList;

/* renamed from: X.B3L */
public final class B3L implements View.OnClickListener {
    public final /* synthetic */ B3N A00;

    public B3L(B3N b3n) {
        this.A00 = b3n;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(2068506173);
        B3N b3n = this.A00;
        B3I b3i = (B3I) b3n.A00.A04.get(b3n.A01.A00);
        ArrayList arrayList = new ArrayList();
        for (B3K b3k : b3i.A04) {
            if (b3k.A03) {
                arrayList.add(b3k.A02);
            }
        }
        for (B3K b3k2 : b3i.A04) {
            if (arrayList.contains(b3k2.A02)) {
                b3k2.A00++;
            }
        }
        C31011Wc.A03(b3n.A01, b3n.A00, (String[]) arrayList.toArray(new String[0]));
        AnonymousClass0Z0.A0C(1378057701, A05);
    }
}
