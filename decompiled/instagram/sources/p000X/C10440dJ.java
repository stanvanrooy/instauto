package p000X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0dJ  reason: invalid class name and case insensitive filesystem */
public final class C10440dJ implements AnonymousClass0I3 {
    public Map A00;
    public final /* synthetic */ AnonymousClass0I4 A01;
    public final /* synthetic */ Map A02;

    public C10440dJ(AnonymousClass0I4 r1, Map map) {
        this.A01 = r1;
        this.A02 = map;
    }

    public final void Btq(String str, double d) {
        this.A00.put(str, String.valueOf(d));
    }

    public final void Btr(String str, int i) {
        this.A00.put(str, String.valueOf(i));
    }

    public final void Bts(String str, long j) {
        this.A00.put(str, String.valueOf(j));
    }

    public final void Btt(String str, String str2) {
        this.A00.put(str, str2);
    }

    public final void Btu(String str, boolean z) {
        this.A00.put(str, String.valueOf(z));
    }

    public final void Btv(String str, int[] iArr) {
        this.A00.put(str, Arrays.toString(iArr));
    }

    public final void Btw(String str, long[] jArr) {
        this.A00.put(str, Arrays.toString(jArr));
    }

    public final void Btx(String str, String[] strArr) {
        this.A00.put(str, Arrays.toString(strArr));
    }

    public final void Btz(String str) {
        HashMap hashMap = new HashMap();
        this.A00 = hashMap;
        this.A02.put(str, hashMap);
    }
}
