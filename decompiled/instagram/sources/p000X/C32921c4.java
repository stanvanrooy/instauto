package p000X;

import android.content.Context;
import com.facebook.phonenumbers.PhoneNumberUtil;

/* renamed from: X.1c4  reason: invalid class name and case insensitive filesystem */
public final class C32921c4 implements AnonymousClass12J {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public boolean A04 = false;

    public C32921c4() {
    }

    public C32921c4(Context context, String str, String str2) {
        this.A03 = str;
        this.A02 = str2;
        try {
            C73223Iz A0F = PhoneNumberUtil.A01(context).A0F(str2, (String) null);
            this.A00 = String.valueOf(A0F.A00);
            this.A01 = String.valueOf(A0F.A02);
        } catch (C45471xw unused) {
            AnonymousClass0QD.A01("PhoneNumberVerifiedEvent", "Unable to parse verified phone number.");
            this.A04 = true;
        }
    }
}
