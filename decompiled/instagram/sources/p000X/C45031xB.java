package p000X;

import com.mediatek.perfservice.PerfServiceWrapper;
import org.json.JSONObject;

/* renamed from: X.1xB  reason: invalid class name and case insensitive filesystem */
public final class C45031xB implements C12430gj {
    public static boolean A00;

    private int A00(PerfServiceWrapper perfServiceWrapper, int[] iArr, int i) {
        if (i != 3) {
            try {
                int length = iArr.length;
                if (length == 4 && A00) {
                    return perfServiceWrapper.userRegBigLittle(iArr[0], iArr[1], iArr[2], iArr[3]);
                }
                if (length == 2) {
                    return perfServiceWrapper.userReg(iArr[0], iArr[1]);
                }
            } catch (UnsatisfiedLinkError unused) {
                return A00(perfServiceWrapper, iArr, i + 1);
            }
        }
        return -1;
    }

    public final int ASC() {
        return 5;
    }

    public final int ASD() {
        return 4;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", "mediatek");
            jSONObject.put("framework", "PerfService");
            jSONObject.put("extra", A00 ? "BL" : "");
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r3 = new com.mediatek.perfservice.PerfServiceWrapper((android.content.Context) null);
     */
    public final C12390gf AAF(C12450gl r7, C51762Ma r8) {
        PerfServiceWrapper perfServiceWrapper;
        int A002;
        int[] AGt = r7.AGt(r8);
        if (AGt == null || AGt.length < 2 || (A002 = A00(perfServiceWrapper, AGt, 0)) < 0) {
            return null;
        }
        return new C30729DiI(perfServiceWrapper, r8.A01, AGt, A002);
    }
}
