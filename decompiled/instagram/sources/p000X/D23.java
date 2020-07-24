package p000X;

import android.net.Uri;
import android.util.LruCache;
import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.D23 */
public final class D23 {
    public final AtomicInteger A00 = new AtomicInteger(12);
    public final AtomicReference A01 = new AtomicReference(new LruCache(10));

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0043, code lost:
        if (r7.getPath().endsWith("init.m4v") != false) goto L_0x0045;
     */
    public final void A00(String str, Uri uri, byte[] bArr, int i) {
        D3E d3e;
        boolean z;
        Queue queue;
        if (str == null || uri == null || bArr == null) {
            C40431oe.A01("DashChunkMemoryCache", "Invalid input is given", new Object[0]);
            return;
        }
        synchronized (this.A01) {
            d3e = (D3E) ((LruCache) this.A01.get()).get(str);
            if (d3e == null) {
                d3e = new D3E(this);
                ((LruCache) this.A01.get()).put(str, d3e);
            }
        }
        synchronized (d3e) {
            if (!uri.getPath().endsWith("init.m4a")) {
                z = false;
            }
            z = true;
            if (z) {
                queue = d3e.A03;
            } else {
                queue = d3e.A02;
            }
            if (!d3e.A01.containsKey(uri)) {
                C29661D3u d3u = new C29661D3u(Arrays.copyOf(bArr, i), uri);
                queue.add(uri);
                d3e.A01.put(uri, d3u);
                if (!z && queue.size() > d3e.A06.A00.get()) {
                    d3e.A01.remove((Uri) queue.remove());
                }
            }
        }
    }

    public final byte[] A01(String str, Uri uri) {
        D3E d3e;
        C29661D3u d3u;
        if (str == null || uri == null) {
            C40431oe.A01("DashChunkMemoryCache", "Invalid input is given for getDashChunkData", new Object[0]);
            return null;
        }
        synchronized (this.A01) {
            d3e = (D3E) ((LruCache) this.A01.get()).get(str);
        }
        if (d3e == null) {
            return null;
        }
        synchronized (d3e) {
            d3u = (C29661D3u) d3e.A01.get(uri);
        }
        if (d3u != null) {
            return d3u.A01;
        }
        return null;
    }
}
