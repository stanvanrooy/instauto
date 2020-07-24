package p000X;

import android.util.Base64;

/* renamed from: X.0qp  reason: invalid class name and case insensitive filesystem */
public final class C17800qp implements C16090o1 {
    public final /* synthetic */ C15890nh A00;
    public final /* synthetic */ C17750qk A01;

    public C17800qp(C15890nh r1, C17750qk r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ Object then(Object obj) {
        String str;
        String str2;
        C17190pp A002;
        AnonymousClass1C3 r10 = (AnonymousClass1C3) obj;
        C15890nh r9 = this.A00;
        try {
            C33861dc r2 = (C33861dc) new AnonymousClass1C5(this.A01).then(r10);
            if (C33891df.A00.nextInt(1000) < 1) {
                AnonymousClass0P4 A003 = AnonymousClass0P4.A00("ig_api_analytics", (AnonymousClass0RN) null);
                A003.A0G("path", r9.A0C);
                A003.A0A("request_succeeded", true);
                AnonymousClass0WN.A01(r9.A05).BcG(A003);
            }
            if (AnonymousClass1C1.A00(r10.A02.A04.toString()) && (A002 = r2.A00("X-IG-Set-WWW-Claim")) != null) {
                C22510yY.A00(r9.A05).A01(A002.A01);
            }
            C17190pp A004 = r2.A00("IG-Set-Password-Encryption-Pub-Key");
            C17190pp A005 = r2.A00("IG-Set-Password-Encryption-Key-Id");
            if (A004 == null || A005 == null) {
                return r2;
            }
            if (StoredPasswordEncryptionPrefs.A01 == null) {
                StoredPasswordEncryptionPrefs.A01 = new StoredPasswordEncryptionPrefs(StoredPreferences.A00);
            }
            StoredPasswordEncryptionPrefs r102 = StoredPasswordEncryptionPrefs.A01;
            String str3 = A004.A01;
            int parseInt = Integer.parseInt(A005.A01);
            String str4 = new String(Base64.decode(str3, 2));
            if (1 - Constants.ZERO.intValue() != 0) {
                str = "ENCRYPTION_WITH_TAGGING";
            } else {
                str = "PLAINTEXT_WITH_TAGGING";
            }
            StoredDataAboutEncryptionArgs r12 = new StoredDataAboutEncryptionArgs(parseInt, str4, -1, str);
            int i = r12.A00;
            String str5 = r12.A03;
            long j = r12.A01;
            if (1 - r12.A02.intValue() != 0) {
                str2 = "ENCRYPTION_WITH_TAGGING";
            } else {
                str2 = "PLAINTEXT_WITH_TAGGING";
            }
            r102.A00.edit().putInt("pw_enc_key_id", i).putString("pw_enc_public_key", str5).putLong("pw_enc_key_expiry_timestamp_ms", j).putString("pw_enc_key_state", str2).apply();
            return r2;
        } catch (Exception e) {
            if (C33891df.A00.nextInt(1000) < 1) {
                AnonymousClass0P4 A006 = AnonymousClass0P4.A00("ig_api_analytics", (AnonymousClass0RN) null);
                A006.A0G("path", r9.A0C);
                A006.A0A("request_succeeded", false);
                A006.A0G("error_msg", e.toString());
                AnonymousClass0WN.A01(r9.A05).BcG(A006);
            }
            throw e;
        }
    }
}
