package p000X;

import java.util.Map;

/* renamed from: X.0dq  reason: invalid class name and case insensitive filesystem */
public final class C10770dq implements AnonymousClass0I3 {
    public String A00 = null;
    public final /* synthetic */ C10780dr A01;
    public final /* synthetic */ Map A02;

    public final void Btq(String str, double d) {
    }

    public final void Btt(String str, String str2) {
    }

    public final void Btu(String str, boolean z) {
    }

    public final void Btv(String str, int[] iArr) {
    }

    public final void Btw(String str, long[] jArr) {
    }

    public final void Btx(String str, String[] strArr) {
    }

    public C10770dq(C10780dr r2, Map map) {
        this.A01 = r2;
        this.A02 = map;
    }

    public final void Btr(String str, int i) {
        Map map;
        String str2 = this.A00;
        if (str2 != null) {
            map = this.A02;
            str = AnonymousClass000.A0J(str2, ".", str);
        } else {
            map = this.A02;
        }
        map.put(str, Long.valueOf((long) i));
    }

    public final void Bts(String str, long j) {
        Map map;
        String str2 = this.A00;
        if (str2 != null) {
            map = this.A02;
            str = AnonymousClass000.A0J(str2, ".", str);
        } else {
            map = this.A02;
        }
        map.put(str, Long.valueOf(j));
    }

    public final void Btz(String str) {
        this.A00 = str;
    }
}
