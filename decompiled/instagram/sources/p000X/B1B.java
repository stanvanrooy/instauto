package p000X;

import java.util.HashMap;

/* renamed from: X.B1B */
public final class B1B extends HashMap<B1q, Object> {
    public final /* synthetic */ B1C A00;
    public final /* synthetic */ String A01;

    public B1B(B1C b1c, String str, String str2) {
        this.A00 = b1c;
        this.A01 = str2;
        put(B1q.PIXEL_EVENT_NAME, str);
        put(B1q.PIXEL_EVENT_PIXEL_ID, this.A01);
    }
}
