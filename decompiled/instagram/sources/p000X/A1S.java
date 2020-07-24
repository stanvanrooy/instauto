package p000X;

import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.A1S */
public final class A1S implements ReadableMapKeySetIterator {
    public Iterator A00;
    public final /* synthetic */ A1N A01;

    public A1S(A1N a1n) {
        this.A01 = a1n;
        this.A00 = a1n.A00.entrySet().iterator();
    }

    public final boolean Aby() {
        return this.A00.hasNext();
    }

    public final String Aq1() {
        return (String) ((Map.Entry) this.A00.next()).getKey();
    }
}
