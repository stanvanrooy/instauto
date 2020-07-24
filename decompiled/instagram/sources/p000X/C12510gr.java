package p000X;

import android.util.SparseArray;
import org.json.JSONObject;

/* renamed from: X.0gr  reason: invalid class name and case insensitive filesystem */
public final class C12510gr extends C12470gn {
    public static int[] A02 = new int[0];
    public static final SparseArray A03 = new SparseArray();
    public static final C12390gf A04 = C12370gd.A00;
    public boolean A00;
    public final int A01;

    public final C12390gf A00(int i, C51762Ma r7) {
        if (!this.A00 || r7 == null) {
            return A04;
        }
        int i2 = r7.A03;
        boolean z = false;
        boolean z2 = false;
        if ((i2 & 1) == 1) {
            z2 = true;
        }
        if ((i2 & 2) == 2) {
            z = true;
        }
        C45131xL r1 = new C45131xL(this.A01, z2, z);
        A03.put(i, r1);
        return r1;
    }

    public final C51762Ma A01(int i, JSONObject jSONObject) {
        int optInt = jSONObject.optJSONArray("boostedThreads").optInt(0);
        int optInt2 = jSONObject.optJSONArray("enabledCoreConfigs").optInt(0);
        C51762Ma r0 = new C51762Ma();
        r0.A03 = optInt;
        r0.A00 = optInt2;
        return r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r5.A07 == false) goto L_0x0014;
     */
    public C12510gr() {
        int i;
        C12290gV r5 = C12260gS.A00().A07;
        boolean z = r5.A04() ? true : z;
        z = false;
        this.A00 = z;
        if (z) {
            int i2 = r5.A00;
            i = 0;
            for (int i3 = 0; i3 < i2; i3++) {
                i |= 1 << (r5.A01 + i3);
            }
        } else {
            i = -1;
        }
        this.A01 = i;
    }
}
