package p000X;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.BWP */
public final class BWP {
    public JSONArray A00 = new JSONArray();
    public final BYN A01;

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    public final synchronized void A00(String str, String... strArr) {
        if (str != null) {
            JSONObject put = new JSONObject().put(str, System.currentTimeMillis() / 1000);
            for (int i = 0; i < strArr.length; i += 2) {
                put.put(strArr[i], strArr[i + 1]);
            }
            this.A00.put(put);
        }
    }

    public final synchronized String toString() {
        return this.A00.toString();
    }

    public BWP(BYN byn) {
        this.A01 = byn;
    }
}
