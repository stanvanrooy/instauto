package p000X;

import android.net.Uri;
import java.util.HashMap;

/* renamed from: X.B3Y */
public final class B3Y extends HashMap<String, String> {
    public final /* synthetic */ Uri A00;
    public final /* synthetic */ BVR A01;

    public B3Y(BVR bvr, String str, Uri uri) {
        this.A01 = bvr;
        this.A00 = uri;
        put("action", str);
        put("map_uri", this.A00.toString());
    }
}
