package p000X;

import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableNativeMap;
import java.util.Iterator;

/* renamed from: X.A1T */
public final class A1T implements ReadableMapKeySetIterator {
    public final Iterator A00;

    public final boolean Aby() {
        return this.A00.hasNext();
    }

    public final String Aq1() {
        return (String) this.A00.next();
    }

    public A1T(ReadableNativeMap readableNativeMap) {
        this.A00 = ReadableNativeMap.getLocalMap(readableNativeMap).keySet().iterator();
    }
}
