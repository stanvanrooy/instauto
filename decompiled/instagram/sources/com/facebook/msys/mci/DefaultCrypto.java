package com.facebook.msys.mci;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class DefaultCrypto implements Crypto {
    public static final Crypto A00 = new DefaultCrypto();

    public byte[] computeMd5(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            int length = digest.length;
            for (int i = 0; i < length; i++) {
                sb.append(String.format("%02x", new Object[]{Byte.valueOf(digest[i])}));
            }
            return sb.toString().getBytes();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("MD5 algorithm was not found. Should not happen", e);
        }
    }
}
