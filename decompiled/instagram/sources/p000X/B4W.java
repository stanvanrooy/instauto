package p000X;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.B4W */
public final /* synthetic */ class B4W implements B4v {
    public final FirebaseInstanceId A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public B4W(FirebaseInstanceId firebaseInstanceId, String str, String str2, String str3) {
        this.A00 = firebaseInstanceId;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
    }

    public final C60302jg BrH(Object obj) {
        String str;
        FirebaseInstanceId firebaseInstanceId = this.A00;
        String str2 = this.A01;
        String str3 = this.A02;
        String str4 = (String) obj;
        C68492zD r3 = FirebaseInstanceId.A08;
        String A05 = firebaseInstanceId.A04.A05();
        synchronized (r3) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str4);
                jSONObject.put("appVersion", A05);
                jSONObject.put("timestamp", currentTimeMillis);
                str = jSONObject.toString();
            } catch (JSONException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(valueOf.length() + 24);
                sb.append("Failed to encode token: ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                str = null;
            }
            if (str != null) {
                SharedPreferences.Editor edit = r3.A01.edit();
                edit.putString(C68492zD.A01(str2, str3), str);
                edit.commit();
            }
        }
        C55382aY r1 = new C55382aY(str4);
        C60292jf r0 = new C60292jf();
        r0.A0I(r1);
        return r0;
    }
}
