package p000X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.AB8 */
public final class AB8 extends ABX {
    public final AB3 A00;
    public final List A01;

    public AB8(C23043A0y a0y, AB3 ab3) {
        A1e array = a0y.getArray("transforms");
        this.A01 = new ArrayList(array.size());
        for (int i = 0; i < array.size(); i++) {
            C23043A0y map = array.getMap(i);
            String string = map.getString("property");
            if (map.getString("type").equals("animated")) {
                C23178ABg aBg = new C23178ABg(this);
                aBg.A00 = string;
                aBg.A00 = map.getInt("nodeTag");
                this.A01.add(aBg);
            } else {
                C23177ABf aBf = new C23177ABf(this);
                aBf.A00 = string;
                aBf.A00 = map.getDouble("value");
                this.A01.add(aBf);
            }
        }
        this.A00 = ab3;
    }
}
