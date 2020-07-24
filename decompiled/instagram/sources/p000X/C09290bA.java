package p000X;

import com.facebook.profilo.core.ProvidersRegistry;
import java.util.List;
import java.util.TreeMap;

/* renamed from: X.0bA  reason: invalid class name and case insensitive filesystem */
public final class C09290bA implements AnonymousClass0GE {
    public int A00;
    public TreeMap A01;
    public TreeMap A02;
    public TreeMap A03;
    public final int A04;
    public final List A05;

    public C09290bA(int i, List list, TreeMap treeMap, TreeMap treeMap2, TreeMap treeMap3) {
        if (i > 0) {
            this.A04 = i;
            this.A05 = list;
            this.A03 = treeMap;
            this.A01 = treeMap2;
            this.A02 = treeMap3;
            this.A00 = ProvidersRegistry.A00.A00(list);
            return;
        }
        throw new IllegalArgumentException(AnonymousClass000.A06("coinflip_sample_rate (", i, ") <= 0"));
    }
}
