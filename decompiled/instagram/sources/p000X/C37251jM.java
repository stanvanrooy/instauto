package p000X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1jM  reason: invalid class name and case insensitive filesystem */
public final class C37251jM {
    public long A00;
    public long A01;
    public final String A02;
    public final List A03;

    public final AnonymousClass1NG A00() {
        if (this.A03.isEmpty() || ((C28661Mp) this.A03.get(0)).A01().isEmpty()) {
            return null;
        }
        return (AnonymousClass1NG) ((C28661Mp) this.A03.get(0)).A01().get(0);
    }

    public C37251jM(String str, C28661Mp r3, long j) {
        this.A02 = str;
        ArrayList arrayList = new ArrayList();
        this.A03 = arrayList;
        arrayList.add(r3);
        this.A00 = j;
        this.A01 = j;
    }
}
