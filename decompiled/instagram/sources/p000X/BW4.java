package p000X;

import java.util.HashMap;

/* renamed from: X.BW4 */
public final class BW4 extends HashMap<String, Object> {
    public final /* synthetic */ C28735Clq A00;

    public BW4(C28735Clq clq, String str) {
        this.A00 = clq;
        put("surface", str);
        put("bytes_downloaded", Long.valueOf(this.A00.A01.get()));
        put("cache_hit_count", Long.valueOf(this.A00.A00.get()));
        put("cache_miss_count", Long.valueOf(this.A00.A01.get()));
    }
}
