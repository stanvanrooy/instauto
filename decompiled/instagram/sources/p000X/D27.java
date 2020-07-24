package p000X;

import android.util.LruCache;
import java.io.IOException;

/* renamed from: X.D27 */
public final class D27 extends LruCache {
    public final /* synthetic */ D24 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public D27(D24 d24, int i) {
        super(i);
        this.A00 = d24;
    }

    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        D1W d1w = (D1W) obj;
        D15 d15 = (D15) obj2;
        if (z) {
            try {
                d15.close();
            } catch (IOException unused) {
            } catch (Throwable th) {
                this.A00.A02.remove(d1w);
                throw th;
            }
            this.A00.A02.remove(d1w);
        } else if (size() == 0) {
            this.A00.A03.remove(d1w.A01);
        }
    }
}
