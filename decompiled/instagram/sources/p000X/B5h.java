package p000X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;

/* renamed from: X.B5h */
public class B5h {
    public int A00 = 16973840;
    public Context A01;
    public Bundle A02;
    public C23971AeW A03;
    public String A04;
    public String A05;
    public AccessToken A06;

    public C23965AeQ A00() {
        if (!(this instanceof C25181B5j)) {
            AccessToken accessToken = this.A06;
            if (accessToken != null) {
                this.A02.putString("app_id", accessToken.A01);
                this.A02.putString("access_token", this.A06.A02);
            } else {
                this.A02.putString("app_id", this.A05);
            }
            return new C23965AeQ(this.A01, this.A04, this.A02, this.A00, this.A03);
        }
        C25181B5j b5j = (C25181B5j) this;
        Bundle bundle = b5j.A02;
        bundle.putString("redirect_uri", "fbconnect://success");
        bundle.putString("client_id", b5j.A05);
        bundle.putString("e2e", b5j.A00);
        bundle.putString("response_type", "token,signed_request");
        bundle.putString("return_scopes", "true");
        if (b5j.A01) {
            bundle.putString("auth_type", "rerequest");
        }
        return new C23965AeQ(b5j.A01, "oauth", bundle, b5j.A00, b5j.A03);
    }

    public B5h(Context context, String str, Bundle bundle) {
        this.A05 = str == null ? C12840hT.A02 : str;
        this.A01 = context;
        this.A04 = "oauth";
        this.A02 = bundle;
    }

    public B5h(Context context, String str, Bundle bundle, String str2) {
        AccessToken A022 = C14110jm.A00(str2).A02();
        this.A06 = A022;
        if (A022 == null) {
            String str3 = C12840hT.A02;
            if (str3 != null) {
                this.A05 = str3;
            } else {
                throw new C25183B5l("Attempted to create a builder without a valid access token or a valid default Application ID.");
            }
        }
        this.A01 = context;
        this.A04 = str;
        if (bundle != null) {
            this.A02 = bundle;
        } else {
            this.A02 = new Bundle();
        }
    }
}
