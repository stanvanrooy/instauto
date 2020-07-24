package p000X;

import android.net.Uri;
import android.util.LruCache;

/* renamed from: X.D20 */
public final class D20 implements C29645D3c {
    public final D23 A00;

    public final String ASU(String str) {
        D3E d3e;
        String str2;
        D23 d23 = this.A00;
        if (str == null) {
            C40431oe.A01("DashChunkMemoryCache", "Invalid input is given for getPrefetchFormatId", new Object[0]);
        } else {
            synchronized (d23.A01) {
                d3e = (D3E) ((LruCache) d23.A01.get()).get(str);
            }
            if (d3e != null) {
                synchronized (d3e) {
                    str2 = d3e.A00;
                }
                return str2;
            }
        }
        return null;
    }

    public final boolean Aea(String str, long j, long j2, Uri uri, String str2) {
        boolean z;
        D1W d1w = new D1W(str2, uri);
        D24 d24 = D1J.A0C;
        synchronized (d24) {
            D15 A002 = d24.A00(d1w);
            z = false;
            if (A002 != null) {
                z = true;
            }
        }
        if (z || this.A00.A01(str2, uri) != null) {
            return true;
        }
        return false;
    }

    public final void Bjd(String str, String str2) {
        D3E d3e;
        D23 d23 = this.A00;
        if (str == null || str2 == null) {
            C40431oe.A01("DashChunkMemoryCache", "Invalid input is given for setPrefetchFormatId", new Object[0]);
            return;
        }
        synchronized (d23.A01) {
            d3e = (D3E) ((LruCache) d23.A01.get()).get(str);
        }
        if (d3e != null) {
            synchronized (d3e) {
                d3e.A00 = str2;
            }
        }
    }

    public D20(D23 d23) {
        this.A00 = d23;
    }
}
