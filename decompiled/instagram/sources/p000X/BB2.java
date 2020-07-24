package p000X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.BB2 */
public final class BB2 {
    public static final BBH A04 = new BB5();
    public B8Y A00;
    public BB6 A01;
    public BBH A02;
    public BAx A03 = new BAx();

    public BB2() {
        BBH bbh = A04;
        this.A02 = bbh;
        this.A01 = new BB6(new BB8(), new BB4(this, bbh));
        HashMap hashMap = new HashMap();
        for (BB0 bb0 : BAx.A04) {
            C25216B8b b8b = bb0.A01;
            HashSet hashSet = new HashSet();
            if (hashMap.get(b8b) == null) {
                hashMap.put(b8b, hashSet);
            }
            Object obj = hashMap.get(bb0.A01);
            AnonymousClass0CW.A01(obj);
            ((Set) obj).add(bb0.A04);
        }
        this.A00 = new B8Y(hashMap);
    }
}
