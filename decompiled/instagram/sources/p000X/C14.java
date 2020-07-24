package p000X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.lang.reflect.Method;

/* renamed from: X.C14 */
public final class C14 extends C27176Bzt {
    public final C0F A00;
    public final transient Method A01;

    public C14(C27194C0y c0y, C0L c0l, C27106By5 by5, C27225C3o c3o, C0F c0f) {
        super(c0y, c0l, by5, c3o);
        this.A00 = c0f;
        this.A01 = c0f.A01;
    }

    public C14(C14 c14, JsonDeserializer jsonDeserializer) {
        super((C27176Bzt) c14, jsonDeserializer);
        this.A00 = c14.A00;
        this.A01 = c14.A01;
    }

    public C14(C14 c14, String str) {
        super((C27176Bzt) c14, str);
        this.A00 = c14.A00;
        this.A01 = c14.A01;
    }
}
