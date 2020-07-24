package p000X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0ek  reason: invalid class name and case insensitive filesystem */
public final class C11300ek extends C11310el {
    public final List A00;

    public final AnonymousClass2MW A00(String str, C06590Pq r6) {
        for (C11330en r2 : this.A00) {
            Bundle A7i = r2.A7i(str, r6);
            if (A7i != null) {
                return new AnonymousClass2MW(r2, A7i);
            }
        }
        return null;
    }

    public C11300ek() {
        if (C06530Pk.A00) {
            AnonymousClass0ZB.A01("initUrlHandlerHelper", 2097720336);
        }
        try {
            ArrayList arrayList = new ArrayList();
            this.A00 = arrayList;
            arrayList.add(new C11320em());
            this.A00.add(new C11340eo());
            this.A00.add(new C11350ep());
            this.A00.add(new C11360eq());
            this.A00.add(new C11370er());
            this.A00.add(new C11380es());
            this.A00.add(new C11390et());
            this.A00.add(new C11400eu());
            C11410ev r2 = new C11410ev();
            this.A00.add(r2);
            this.A00.add(new C11420ew());
            this.A00.add(new C11430ex());
            this.A00.add(new C11440ey());
            this.A00.add(new C11450ez());
            this.A00.add(new C11460f0(r2));
            this.A00.add(new C11470f1());
            this.A00.add(new C11480f2());
            this.A00.add(new C11490f3());
            this.A00.add(new C11500f4());
            this.A00.add(new C11510f5());
            this.A00.add(new C11520f6());
        } finally {
            if (C06530Pk.A00) {
                AnonymousClass0ZB.A00(14356510);
            }
        }
    }
}
