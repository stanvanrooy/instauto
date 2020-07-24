package p000X;

import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.ABA */
public final class ABA extends ABX {
    public int A00 = -1;
    public A3o A01;
    public final AB3 A02;
    public final A1N A03;
    public final Map A04;

    public ABA(C23043A0y a0y, AB3 ab3) {
        C23043A0y map = a0y.getMap("props");
        ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
        this.A04 = new HashMap();
        while (keySetIterator.Aby()) {
            String Aq1 = keySetIterator.Aq1();
            this.A04.put(Aq1, Integer.valueOf(map.getInt(Aq1)));
        }
        this.A03 = new A1N();
        this.A02 = ab3;
    }
}
