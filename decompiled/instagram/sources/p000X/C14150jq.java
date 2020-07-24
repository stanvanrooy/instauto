package p000X;

import com.facebook.AccessToken;

/* renamed from: X.0jq  reason: invalid class name and case insensitive filesystem */
public final class C14150jq extends C14160jr {
    public AccessToken A00;

    public final AccessToken A02() {
        return this.A00;
    }

    public final void A03(AccessToken accessToken) {
        AccessToken accessToken2 = this.A00;
        this.A00 = accessToken;
        A06(accessToken, accessToken2);
    }

    public C14150jq(String str, C14120jn r3, C14140jp r4) {
        super(str, r3, r4);
        this.A00 = r4.A00();
    }
}
