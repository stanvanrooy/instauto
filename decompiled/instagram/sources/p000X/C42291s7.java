package p000X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1s7  reason: invalid class name and case insensitive filesystem */
public final class C42291s7 {
    public int A00 = 1;
    public ArrayList A01 = new ArrayList();
    public ArrayList A02 = new ArrayList();
    public ArrayList A03 = new ArrayList();
    public boolean A04 = false;

    public final synchronized List A00() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.A02);
        arrayList.removeAll(this.A03);
        arrayList.removeAll(this.A01);
        return Collections.unmodifiableList(arrayList);
    }
}
