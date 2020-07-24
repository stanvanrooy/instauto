package com.instagram.nux.deviceverification.impl;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.instagram.strings.StringBridge;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.SecureRandom;
import p000X.AnonymousClass000;
import p000X.B57;
import p000X.BHB;
import p000X.BHC;
import p000X.BHF;
import p000X.BHG;
import p000X.BHJ;
import p000X.BHL;
import p000X.BHM;
import p000X.BHP;
import p000X.BHQ;
import p000X.BHT;
import p000X.BHV;
import p000X.BIG;
import p000X.C11130eT;
import p000X.C136055rM;
import p000X.C136105rR;
import p000X.C25390BHi;
import p000X.C60292jf;

public class VerificationPluginImpl extends C136105rR {
    public BHT A00;

    public void startDeviceValidation(Context context, String str) {
        byte[] bArr;
        BHT bht = new BHT();
        this.A00 = bht;
        String instagramString = StringBridge.getInstagramString("c30a13e660cb14207917cd82bcef975e");
        BHP bhp = new BHP(bht);
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String str2 = "unknown";
        if (str == null) {
            str = str2;
        }
        String str3 = str + "|" + currentTimeMillis + "|";
        byte[] bArr2 = new byte[24];
        new SecureRandom().nextBytes(bArr2);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(str3.getBytes());
            byteArrayOutputStream.write(bArr2);
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            bArr = null;
        }
        if (bArr != null) {
            str2 = Base64.encodeToString(bArr, 2);
        }
        int isGooglePlayServicesAvailable = GoogleApiAvailability.A00.isGooglePlayServicesAvailable(context);
        if (isGooglePlayServicesAvailable != 0) {
            C11130eT.A01.BXT(new C136055rM(AnonymousClass000.A0E("GOOGLE_PLAY_UNAVAILABLE: ", ConnectionResult.A00(isGooglePlayServicesAvailable)), str2));
            return;
        }
        C11130eT.A01.BXT(new C136055rM(AnonymousClass000.A0B("VERIFICATION_PENDING: request time is ", currentTimeMillis), str2));
        BIG big = new BHC(context).A04;
        C25390BHi A08 = big.A08(new BHV(big, bArr, instagramString));
        BHJ bhj = new BHJ(new BHQ());
        BHM bhm = BHL.A00;
        B57 b57 = new B57();
        A08.A03(new BHB(A08, b57, bhj, bhm));
        C60292jf r1 = b57.A00;
        r1.A03(new BHG(bhp, str2));
        r1.A02(new BHF(bhp, str2));
    }
}
