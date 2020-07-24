package p000X;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Xr  reason: invalid class name and case insensitive filesystem */
public abstract class C31341Xr {
    public long A00 = 120;
    public long A01 = 250;
    public long A02 = 250;
    public long A03 = 120;
    public C31361Xx A04 = null;
    public ArrayList A05 = new ArrayList();

    public abstract void A09();

    public abstract void A0A(AnonymousClass1ZK r1);

    public abstract boolean A0B();

    public boolean A0C(AnonymousClass1ZK r2) {
        return true;
    }

    public abstract boolean A0D(AnonymousClass1ZK r1, C37351jW r2, C37351jW r3);

    public abstract boolean A0E(AnonymousClass1ZK r1, C37351jW r2, C37351jW r3);

    public abstract boolean A0F(AnonymousClass1ZK r1, C37351jW r2, C37351jW r3);

    public abstract boolean A0G(AnonymousClass1ZK r1, AnonymousClass1ZK r2, C37351jW r3, C37351jW r4);

    public abstract void A0I();

    public static int A04(AnonymousClass1ZK r4) {
        int i = r4.mFlags & 14;
        if (r4.isInvalid()) {
            return 4;
        }
        if ((i & 4) != 0) {
            return i;
        }
        int i2 = r4.mOldPosition;
        int adapterPosition = r4.getAdapterPosition();
        if (i2 == -1 || adapterPosition == -1 || i2 == adapterPosition) {
            return i;
        }
        return i | 2048;
    }

    public final C37351jW A07(AnonymousClass1ZK r4) {
        C37351jW r2 = new C37351jW();
        View view = r4.itemView;
        r2.A00 = view.getLeft();
        r2.A01 = view.getTop();
        view.getRight();
        view.getBottom();
        return r2;
    }

    public final void A08() {
        int size = this.A05.size();
        for (int i = 0; i < size; i++) {
            ((C223739kG) this.A05.get(i)).Arv();
        }
        this.A05.clear();
    }

    public boolean A0H(AnonymousClass1ZK r2, List list) {
        return A0C(r2);
    }
}
