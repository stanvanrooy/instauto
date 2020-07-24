package com.fasterxml.jackson.databind.deser.std;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.UUID;
import p000X.AnonymousClass000;
import p000X.C27123ByY;
import p000X.C27125Bya;

public final class JdkDeserializers$UUIDDeserializer extends FromStringDeserializer {
    public static final JdkDeserializers$UUIDDeserializer A00 = new JdkDeserializers$UUIDDeserializer();

    public JdkDeserializers$UUIDDeserializer() {
        super(UUID.class);
    }

    public final /* bridge */ /* synthetic */ Object A0L(Object obj, C27123ByY byY) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            if (length != 16) {
                C27125Bya.A00(byY.A05, AnonymousClass000.A06("Can only construct UUIDs from 16 byte arrays; got ", length, " bytes"));
            }
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
            return new UUID(dataInputStream.readLong(), dataInputStream.readLong());
        }
        super.A0L(obj, byY);
        return null;
    }
}
