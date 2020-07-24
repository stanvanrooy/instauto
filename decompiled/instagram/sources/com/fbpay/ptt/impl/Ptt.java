package com.fbpay.ptt.impl;

import com.facebook.jni.HybridData;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p000X.AnonymousClass0Y1;

public class Ptt {
    public Set mAtFingerprints;
    public HybridData mHybridData;

    private native String generatePtt(String str);

    private native String getE2eeError();

    private native byte[] getSigningPayload(String str);

    public static native HybridData initHybrid(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr, String str);

    static {
        AnonymousClass0Y1.A08("fbpayptt-android");
    }

    public Map getSigningPayloads() {
        HashMap hashMap = new HashMap();
        for (String str : this.mAtFingerprints) {
            hashMap.put(str, getSigningPayload(str));
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public Ptt(byte[] bArr, byte[] bArr2, byte[] bArr3, Set set, String str) {
        this.mAtFingerprints = set;
        this.mHybridData = initHybrid(bArr, bArr2, bArr3, (String[]) set.toArray(new String[0]), str);
    }

    public String createPtt(String str) {
        return generatePtt(str);
    }

    public String getEncryptionError() {
        return getE2eeError();
    }
}
