package p000X;

import android.content.Context;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import java.net.HttpCookie;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0Bs  reason: invalid class name and case insensitive filesystem */
public final class C03980Bs implements AnonymousClass0Ik {
    public final void ADf(AnonymousClass0C1 r11, C05170Il r12, C05180Im r13) {
        String str;
        C126405bO r122 = (C126405bO) r12;
        AnonymousClass0Ii r5 = new AnonymousClass0Ii(r122.A02(), r13);
        try {
            Context A00 = r122.A00();
            AnonymousClass1L8 A01 = r122.A01();
            List<String> A03 = r122.A03();
            JSONArray jSONArray = new JSONArray();
            for (String str2 : A03) {
                HttpCookie A02 = AnonymousClass1BD.A02(AnonymousClass0k5.A01(str2), "sessionid");
                if (A02 == null) {
                    str = null;
                } else {
                    str = A02.getValue();
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(MemoryDumpUploadJob.EXTRA_USER_ID, Long.parseLong(str2));
                jSONObject.put("session_token", str);
                jSONArray.put(jSONObject);
            }
            C15890nh r2 = new C15890nh(r11);
            r2.A09 = Constants.ONE;
            r2.A0C = "multiple_accounts/set_child_accounts/";
            r2.A06(AnonymousClass1N4.class, false);
            r2.A09("child_account_ids", jSONArray.toString());
            C17850qu A032 = r2.A03();
            A032.A00 = r5;
            C28351Lj.A00(A00, A01, A032);
        } catch (JSONException unused) {
            r13.A9E((C05170Il) null);
        }
    }
}
