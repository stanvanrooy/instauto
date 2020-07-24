package p000X;

import android.os.SystemClock;
import android.view.MenuItem;

/* renamed from: X.AHD */
public final class AHD implements AnonymousClass99S {
    public final /* synthetic */ AH3 A00;

    public AHD(AH3 ah3) {
        this.A00 = ah3;
    }

    public final void B87(C54042Vn r10, MenuItem menuItem) {
        C54042Vn r5;
        C23314AHp aHp = null;
        AnonymousClass0ZA.A07(this.A00.A0F, (Object) null);
        int size = this.A00.A0M.size();
        int i = 0;
        while (true) {
            r5 = r10;
            if (i < size) {
                if (r10 == ((C23314AHp) this.A00.A0M.get(i)).A01) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i != -1) {
            int i2 = i + 1;
            if (i2 < this.A00.A0M.size()) {
                aHp = (C23314AHp) this.A00.A0M.get(i2);
            }
            AnonymousClass0ZA.A0A(this.A00.A0F, new AHL(this, aHp, menuItem, r10), r5, SystemClock.uptimeMillis() + 200, 2089103285);
        }
    }

    public final void B88(C54042Vn r2, MenuItem menuItem) {
        AnonymousClass0ZA.A07(this.A00.A0F, r2);
    }
}
