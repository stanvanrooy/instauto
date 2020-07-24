package p000X;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.0Dl  reason: invalid class name and case insensitive filesystem */
public final class C04310Dl implements Runnable {
    public final /* synthetic */ HashSet A00;
    public final /* synthetic */ boolean A01;

    public C04310Dl(HashSet hashSet, boolean z) {
        this.A00 = hashSet;
        this.A01 = z;
    }

    public final void run() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
