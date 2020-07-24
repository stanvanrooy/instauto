package p000X;

import android.util.Log;
import java.lang.reflect.Method;
import org.json.JSONObject;

/* renamed from: X.BNC */
public final class BNC implements C25501BNl {
    public final String A00;
    public final String A01;

    public final boolean AfK(Object obj) {
        BNC bnc = (BNC) obj;
        if (!this.A00.equals(bnc.A00) || !this.A01.equals(bnc.A01)) {
            return false;
        }
        return true;
    }

    public final int Boo() {
        return this.A00.getBytes().length + this.A01.getBytes().length;
    }

    public final /* bridge */ /* synthetic */ JSONObject BrS(Object obj, JSONObject jSONObject) {
        jSONObject.put(this.A00, this.A01);
        return jSONObject;
    }

    public BNC(String str) {
        Method method;
        this.A00 = str;
        String str2 = "NOT_FOUND";
        try {
            Object[] objArr = {str};
            Class cls = BND.A01;
            if (!(cls == null || (method = BND.A02) == null)) {
                str2 = (String) method.invoke(cls, objArr);
            }
        } catch (Exception e) {
            Log.e("SystemProperty", "Error fetching System Property", e);
        }
        this.A01 = str2;
    }
}
