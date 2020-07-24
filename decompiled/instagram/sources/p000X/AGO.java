package p000X;

import android.content.Context;
import android.provider.Settings;
import org.json.JSONObject;

/* renamed from: X.AGO */
public final class AGO implements C25501BNl {
    public final String A00;
    public final String A01;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r7.A00 != null) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        if (r7.A01 != null) goto L_0x0016;
     */
    public final boolean AfK(Object obj) {
        boolean z;
        boolean z2;
        String str;
        String str2;
        AGO ago = (AGO) obj;
        String str3 = this.A00;
        if (str3 == null) {
            z = true;
        }
        z = false;
        String str4 = this.A01;
        if (str4 == null) {
            z2 = true;
        }
        z2 = false;
        if (!(str3 == null || (str2 = ago.A00) == null)) {
            z = str3.equals(str2);
        }
        if (!(str4 == null || (str = ago.A01) == null)) {
            z2 = str4.equals(str);
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public final int Boo() {
        String str;
        String str2 = this.A00;
        if (str2 == null || (str = this.A01) == null) {
            return 0;
        }
        return str2.getBytes().length + str.getBytes().length;
    }

    public final /* bridge */ /* synthetic */ JSONObject BrS(Object obj, JSONObject jSONObject) {
        jSONObject.put(this.A00, this.A01);
        return jSONObject;
    }

    public AGO(Context context, String str, Integer num) {
        String string;
        this.A00 = str;
        switch (num.intValue()) {
            case 0:
                string = Settings.Global.getString(context.getContentResolver(), str);
                break;
            case 1:
                string = Settings.Secure.getString(context.getContentResolver(), str);
                break;
            case 2:
                string = Settings.System.getString(context.getContentResolver(), str);
                break;
            default:
                string = "";
                break;
        }
        this.A01 = string;
    }
}
