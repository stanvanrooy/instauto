package p000X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.facebook.AccessToken;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0jr  reason: invalid class name and case insensitive filesystem */
public class C14160jr extends C14110jm {
    public C25178B5f A00;
    public Date A01 = new Date(0);
    public final C14120jn A02;
    public final C14140jp A03;
    public final C14180jt A04 = new C14170js(this);
    public final String A05;

    public final void A06(AccessToken accessToken, AccessToken accessToken2) {
        boolean equals;
        this.A00 = null;
        this.A01 = new Date(0);
        if (accessToken != null) {
            C14140jp r3 = this.A03;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("version", 1);
                jSONObject.put("token", accessToken.A02);
                jSONObject.put("expires_at", accessToken.A04.getTime());
                jSONObject.put("permissions", new JSONArray(accessToken.A07));
                jSONObject.put("declined_permissions", new JSONArray(accessToken.A06));
                jSONObject.put("last_refresh", accessToken.A05.getTime());
                jSONObject.put("source", C42241s0.A01(accessToken.A00));
                jSONObject.put("application_id", accessToken.A01);
                jSONObject.put(MemoryDumpUploadJob.EXTRA_USER_ID, accessToken.A03);
                String str = r3.A00;
                C14190ju.A00(str, Constants.A0o).edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", jSONObject.toString()).apply();
            } catch (JSONException unused) {
            }
        } else {
            C14190ju.A00(this.A03.A00, Constants.A0o).edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        }
        if (accessToken2 == null) {
            equals = false;
            if (accessToken == null) {
                equals = true;
            }
        } else {
            equals = accessToken2.equals(accessToken);
        }
        if (!equals) {
            Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", accessToken2);
            intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accessToken);
            this.A02.A01(intent);
        }
    }

    public AccessToken A02() {
        return this.A03.A00();
    }

    public C14160jr(String str, C14120jn r5, C14140jp r6) {
        this.A05 = str;
        this.A02 = r5;
        this.A03 = r6;
    }

    public void A03(AccessToken accessToken) {
        A06(accessToken, A02());
    }

    public void A04(C14180jt r8) {
        Intent intent;
        ResolveInfo resolveService;
        if (A02() != null) {
            C25178B5f b5f = new C25178B5f(this, this.A05, A02(), r8);
            this.A00 = b5f;
            Context context = C12840hT.A00;
            Iterator it = C25190B5v.A02.iterator();
            while (true) {
                if (!it.hasNext()) {
                    intent = null;
                    break;
                }
                intent = new Intent().setClassName(((B63) it.next()).A01(), "com.facebook.katana.platform.TokenRefreshService");
                if (intent == null || (resolveService = context.getPackageManager().resolveService(intent, 0)) == null || !B63.A00(context, resolveService.serviceInfo.packageName)) {
                    intent = null;
                    continue;
                }
                if (intent != null) {
                    break;
                }
            }
            if (intent == null || !AnonymousClass0ZI.A02(context, intent, b5f, 1, -1673581699)) {
                C25178B5f.A00(b5f);
                return;
            }
            b5f.A03.A01 = new Date();
        }
    }

    public boolean A05() {
        boolean z;
        AccessToken A022 = A02();
        if (A022 == null || this.A00 != null) {
            return false;
        }
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        switch (A022.A00.intValue()) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        if (!z) {
            return false;
        }
        long longValue = valueOf.longValue();
        if (longValue - this.A01.getTime() <= 3600000 || longValue - A022.A05.getTime() <= 86400000) {
            return false;
        }
        return true;
    }
}
