package com.facebook.rsys.call.gen;

import com.facebook.djinni.msys.infra.McfReference;
import java.util.Arrays;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.AnonymousClass92S;

public class DataMessage {
    public static AnonymousClass921 CONVERTER = new AnonymousClass92S();
    public final byte[] payload;
    public final String topic;

    public static native DataMessage createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof DataMessage)) {
            return false;
        }
        DataMessage dataMessage = (DataMessage) obj;
        if (!this.topic.equals(dataMessage.topic) || !Arrays.equals(this.payload, dataMessage.payload)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((527 + this.topic.hashCode()) * 31) + Arrays.hashCode(this.payload);
    }

    public String toString() {
        return "DataMessage{topic=" + this.topic + "," + "payload=" + this.payload + "}";
    }

    public DataMessage(String str, byte[] bArr) {
        AnonymousClass920.A00(str);
        AnonymousClass920.A00(bArr);
        this.topic = str;
        this.payload = bArr;
    }
}
