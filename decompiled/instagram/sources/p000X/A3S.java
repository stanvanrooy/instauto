package p000X;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactMarker;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.A3S */
public final class A3S implements Iterator {
    public int A00 = 0;
    public final /* synthetic */ C23055A3k A01;

    public A3S(C23055A3k a3k) {
        this.A01 = a3k;
    }

    public final boolean hasNext() {
        if (this.A00 < this.A01.A01.size()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ Object next() {
        List list = this.A01.A01;
        int i = this.A00;
        this.A00 = i + 1;
        A3X a3x = (A3X) list.get(i);
        String str = a3x.A00;
        A42 a42 = (A42) this.A01.A02.get(str);
        if (a42 != null) {
            return new ModuleHolder(a42, a3x.A01);
        }
        ReactMarker.logMarker(A3L.CREATE_MODULE_START, str, 0);
        try {
            NativeModule nativeModule = (NativeModule) a3x.A01.get();
            ReactMarker.logMarker(A3L.CREATE_MODULE_END);
            return new ModuleHolder(nativeModule);
        } catch (Throwable th) {
            ReactMarker.logMarker(A3L.CREATE_MODULE_END);
            throw th;
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove native modules from the list");
    }
}
