package p000X;

import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import com.facebook.AccessToken;
import com.facebook.login.LoginClient$Request;
import com.facebook.login.LoginClient$Result;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import org.json.JSONObject;

/* renamed from: X.B5n */
public final class B5n {
    public int A00;
    public LoginClient$Request A01;
    public C25188B5r A02;
    public String A03;
    public C25191B5x[] A04;
    public final AnonymousClass1HD A05;

    public static AccessToken A00(Collection collection, Bundle bundle, Integer num, String str) {
        ArrayList arrayList;
        Collection collection2 = collection;
        Date A002 = AccessToken.A00(bundle, new Date());
        String string = bundle.getString("access_token");
        String string2 = bundle.getString("granted_scopes");
        if (!C55062a0.A03(string2)) {
            collection2 = new ArrayList(Arrays.asList(string2.split(",")));
        }
        String string3 = bundle.getString("denied_scopes");
        if (!C55062a0.A03(string3)) {
            arrayList = new ArrayList(Arrays.asList(string3.split(",")));
        } else {
            arrayList = null;
        }
        if (C55062a0.A03(string)) {
            return null;
        }
        String string4 = bundle.getString("userid");
        if (string4 == null) {
            String string5 = bundle.getString("signed_request");
            if (string5 != null && !string5.isEmpty()) {
                try {
                    String[] split = string5.split("\\.");
                    if (split.length == 2) {
                        string4 = new JSONObject(new String(Base64.decode(split[1], 0), "UTF-8")).getString(MemoryDumpUploadJob.EXTRA_USER_ID);
                    }
                } catch (Exception e) {
                    e.toString();
                }
            }
            string4 = null;
        }
        return new AccessToken(string, str, string4, collection2, arrayList, num, A002, new Date());
    }

    public final void A02(LoginClient$Result loginClient$Result) {
        AccessToken accessToken;
        this.A01 = null;
        C25188B5r b5r = this.A02;
        if (b5r != null) {
            if (loginClient$Result.A04 == Constants.ZERO && (accessToken = loginClient$Result.A03) != null) {
                C14110jm.A00(b5r.A00).A03(accessToken);
            }
            int i = -1;
            if (loginClient$Result.A04 == Constants.ONE) {
                i = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("com.facebook.LoginFragment:Result", loginClient$Result);
            Intent intent = new Intent();
            intent.putExtras(bundle);
            b5r.getActivity().setResult(i, intent);
            b5r.getActivity().finish();
        }
    }

    public final void A01() {
        C25191B5x b5x;
        int i = this.A00 + 1;
        this.A00 = i;
        C25191B5x[] b5xArr = this.A04;
        if (i < b5xArr.length) {
            b5x = b5xArr[i];
        } else {
            b5x = null;
        }
        if (b5x != null) {
            b5x.Brp(this.A01);
        } else {
            A02(LoginClient$Result.A02(this.A01, "Login attempt failed.", (String) null));
        }
    }

    public final void A03(LoginClient$Result loginClient$Result) {
        LoginClient$Result loginClient$Result2;
        if (loginClient$Result.A03 == null || C14110jm.A00(this.A03).A02() == null) {
            A02(loginClient$Result);
        } else if (loginClient$Result.A03 != null) {
            AccessToken A022 = C14110jm.A00(this.A03).A02();
            AccessToken accessToken = loginClient$Result.A03;
            if (!(A022 == null || accessToken == null)) {
                try {
                    if (A022.A03.equals(accessToken.A03)) {
                        loginClient$Result2 = LoginClient$Result.A00(this.A01, accessToken);
                        A02(loginClient$Result2);
                    }
                } catch (Exception e) {
                    A02(LoginClient$Result.A02(this.A01, "Caught exception", e.getMessage()));
                    return;
                }
            }
            loginClient$Result2 = LoginClient$Result.A02(this.A01, "User logged in as different Facebook user.", (String) null);
            A02(loginClient$Result2);
        } else {
            throw new C25183B5l("Can't validate without a token");
        }
    }

    public B5n(AnonymousClass1HD r6, LoginClient$Request loginClient$Request, int i) {
        C25191B5x[] b5xArr;
        String str;
        this.A05 = r6;
        this.A03 = loginClient$Request.A04;
        if (!(loginClient$Request.A00 == null || (str = loginClient$Request.A01) == null)) {
            Bundle bundle = new Bundle();
            bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", str);
            if (AnonymousClass4EQ.A00(AnonymousClass0J1.A00(bundle))) {
                b5xArr = new C25191B5x[]{new C25186B5p(this)};
                this.A04 = b5xArr;
                this.A02 = (C25188B5r) r6;
                this.A01 = loginClient$Request;
                this.A00 = i;
            }
        }
        b5xArr = new C25191B5x[]{new C25184B5m(this), new C25185B5o(this, this.A03)};
        this.A04 = b5xArr;
        this.A02 = (C25188B5r) r6;
        this.A01 = loginClient$Request;
        this.A00 = i;
    }
}
