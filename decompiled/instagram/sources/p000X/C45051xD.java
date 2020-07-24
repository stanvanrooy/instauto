package p000X;

import com.mediatek.powerhalmgr.PowerHalMgr;
import org.json.JSONObject;

/* renamed from: X.1xD  reason: invalid class name and case insensitive filesystem */
public final class C45051xD implements C12430gj {
    public final int ASC() {
        return 10;
    }

    public final int ASD() {
        return 4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r8 = com.mediatek.powerhalmgr.PowerHalMgrFactory.getInstance().makePowerHalMgr();
     */
    public final C12390gf AAF(C12450gl r16, C51762Ma r17) {
        int length;
        PowerHalMgr makePowerHalMgr;
        int scnReg;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C51762Ma r1 = r17;
        int[] AGt = r16.AGt(r1);
        if (!(AGt == null || (length = AGt.length) < 2 || (scnReg = makePowerHalMgr.scnReg()) == -1)) {
            if (length == 4) {
                i2 = 0;
                i3 = 0;
                makePowerHalMgr.scnConfig(scnReg, 1, 1, AGt[0], 0, 0);
                makePowerHalMgr.scnConfig(scnReg, 3, 1, AGt[1], 0, 0);
                i = 0;
                makePowerHalMgr.scnConfig(scnReg, 1, 0, AGt[2], 0, 0);
                i4 = 3;
                i5 = AGt[3];
            } else if (length == 2) {
                i = 0;
                i2 = 0;
                i3 = 0;
                makePowerHalMgr.scnConfig(scnReg, 1, 0, AGt[0], 0, 0);
                i4 = 3;
                i5 = AGt[1];
            }
            makePowerHalMgr.scnConfig(scnReg, i4, i, i5, i2, i3);
            return new C30728DiH(makePowerHalMgr, r1.A01, AGt, scnReg);
        }
        return null;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", "mediatek");
            jSONObject.put("framework", "PowerHalMgr");
            jSONObject.put("extra", "");
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }
}
