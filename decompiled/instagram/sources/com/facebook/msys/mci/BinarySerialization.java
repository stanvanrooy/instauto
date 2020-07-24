package com.facebook.msys.mci;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import p000X.AnonymousClass0DB;
import p000X.C208928zC;

public class BinarySerialization {
    public static native void nativeInitialize();

    public static HashMap decode(byte[] bArr) {
        try {
            return (HashMap) new ObjectInputStream(new ByteArrayInputStream(bArr)).readObject();
        } catch (IOException | ClassNotFoundException e) {
            AnonymousClass0DB.A0G("BinarySerialization", "Decode failed.", e);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x001e */
    public static byte[] encode(HashMap hashMap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(hashMap);
            objectOutputStream.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            objectOutputStream.close();
            return byteArray;
        } catch (IOException e) {
            AnonymousClass0DB.A0G("BinarySerialization", "Encode failed.", e);
            return null;
        } catch (Throwable ) {
            throw th;
        }
    }

    static {
        C208928zC.A00();
    }
}
