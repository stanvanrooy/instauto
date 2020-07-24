package com.facebook.rsys.transport.gen;

import com.facebook.djinni.msys.infra.McfReference;
import java.util.Arrays;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.AnonymousClass92U;

public class SignalingMessage {
    public static AnonymousClass921 CONVERTER = new AnonymousClass92U();
    public final byte[] payload;
    public final int source;
    public final int type;

    public static native SignalingMessage createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof SignalingMessage)) {
            return false;
        }
        SignalingMessage signalingMessage = (SignalingMessage) obj;
        if (this.type == signalingMessage.type && this.source == signalingMessage.source && Arrays.equals(this.payload, signalingMessage.payload)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.type) * 31) + this.source) * 31) + Arrays.hashCode(this.payload);
    }

    public String toString() {
        return "SignalingMessage{type=" + this.type + "," + "source=" + this.source + "," + "payload=" + this.payload + "}";
    }

    public SignalingMessage(int i, int i2, byte[] bArr) {
        AnonymousClass920.A00(Integer.valueOf(i));
        AnonymousClass920.A00(Integer.valueOf(i2));
        AnonymousClass920.A00(bArr);
        this.type = i;
        this.source = i2;
        this.payload = bArr;
    }
}
