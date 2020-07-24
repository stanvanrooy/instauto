package p000X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.lang.reflect.Field;

/* renamed from: X.C17 */
public final class C17 extends C27176Bzt {
    public final C0e A00;
    public final transient Field A01;

    public C17(C27194C0y c0y, C0L c0l, C27106By5 by5, C27225C3o c3o, C0e c0e) {
        super(c0y, c0l, by5, c3o);
        this.A00 = c0e;
        this.A01 = c0e.A00;
    }

    public C17(C17 c17, JsonDeserializer jsonDeserializer) {
        super((C27176Bzt) c17, jsonDeserializer);
        this.A00 = c17.A00;
        this.A01 = c17.A01;
    }

    public C17(C17 c17, String str) {
        super((C27176Bzt) c17, str);
        this.A00 = c17.A00;
        this.A01 = c17.A01;
    }
}
