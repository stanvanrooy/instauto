package p000X;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/* renamed from: X.0eX  reason: invalid class name and case insensitive filesystem */
public final class C11170eX {
    public final Queue A00 = new ArrayDeque();

    public final synchronized void A00(ArrayList arrayList) {
        if (arrayList.size() <= 8 && this.A00.size() < 32) {
            arrayList.clear();
            this.A00.add(arrayList);
        }
    }
}
