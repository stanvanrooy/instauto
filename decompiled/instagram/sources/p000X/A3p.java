package p000X;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModule;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.A3p */
public final class A3p implements Iterator {
    public int A00 = 0;
    public final /* synthetic */ A41 A01;

    public A3p(A41 a41) {
        this.A01 = a41;
    }

    public final boolean hasNext() {
        if (this.A00 < this.A01.A00.size()) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        List list = this.A01.A00;
        int i = this.A00;
        this.A00 = i + 1;
        return new ModuleHolder((NativeModule) list.get(i));
    }

    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove methods ");
    }
}
