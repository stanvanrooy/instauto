package p000X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.lang.reflect.Constructor;

/* renamed from: X.C0R */
public final class C0R extends C27176Bzt {
    public final C27176Bzt A00;
    public final Constructor A01;

    public C0R(C27176Bzt bzt, Constructor constructor) {
        super(bzt);
        this.A00 = bzt;
        this.A01 = constructor;
    }

    public C0R(C0R c0r, JsonDeserializer jsonDeserializer) {
        super((C27176Bzt) c0r, jsonDeserializer);
        this.A00 = c0r.A00.A02(jsonDeserializer);
        this.A01 = c0r.A01;
    }

    public C0R(C0R c0r, String str) {
        super((C27176Bzt) c0r, str);
        this.A00 = c0r.A00.A03(str);
        this.A01 = c0r.A01;
    }
}
