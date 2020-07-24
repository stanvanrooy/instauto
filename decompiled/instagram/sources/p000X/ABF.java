package p000X;

import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.ABF */
public final class ABF extends ABX {
    public final AB3 A00;
    public final Map A01 = new HashMap();

    public ABF(C23043A0y a0y, AB3 ab3) {
        C23043A0y map = a0y.getMap("style");
        ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
        while (keySetIterator.Aby()) {
            String Aq1 = keySetIterator.Aq1();
            this.A01.put(Aq1, Integer.valueOf(map.getInt(Aq1)));
        }
        this.A00 = ab3;
    }
}
