package p000X;

import com.instagram.model.reels.Reel;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1hK  reason: invalid class name and case insensitive filesystem */
public final class C36031hK {
    public C36041hL A00 = new C36041hL();
    public AnonymousClass0C1 A01;

    public C36031hK() {
    }

    public C36031hK(List list, AnonymousClass0C1 r8) {
        C36051hM r1;
        this.A01 = r8;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Reel reel = (Reel) it.next();
            AnonymousClass0C1 r2 = this.A01;
            boolean equals = r2.A06.equals(reel.A0F());
            boolean A0m = reel.A0m(r2);
            if (reel.A0W()) {
                C36051hM.A00(this.A00.A00, false, reel.A0w, false);
            } else {
                if (reel.A0X()) {
                    r1 = this.A00.A01;
                } else {
                    r1 = this.A00.A02;
                }
                C36051hM.A00(r1, equals, reel.A0w, A0m);
            }
        }
    }
}
