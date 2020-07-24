package com.facebook.cryptopub;

import p000X.AnonymousClass0Y1;

public class CryptoPubNative {
    private native String decryptNative(int i, String str, String str2, String str3, String str4);

    private native byte[] encryptNative(int encryptionKeyId, String encryptionPublicKey, String passwordToEncode, String timestamp);

    static {
        AnonymousClass0Y1.A08("cryptopub-jni");
    }

    public byte[] encrypt(int encryptionKeyId, String encryptionPublicKey, String passwordToEncode, String timestamp) {
        return encryptNative(encryptionKeyId, encryptionPublicKey, passwordToEncode, timestamp);
    }
}
