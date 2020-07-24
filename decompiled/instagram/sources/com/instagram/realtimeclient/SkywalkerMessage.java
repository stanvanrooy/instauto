package com.instagram.realtimeclient;

import java.nio.ByteBuffer;

public class SkywalkerMessage {
    public static final int FIELD_MESSAGE_PAYLOAD = 2;
    public static final int FIELD_MESSAGE_TYPE = 1;
    public ByteBuffer mMessagePayload;
    public Integer mMessageType;

    public ByteBuffer getMessagePayload() {
        return this.mMessagePayload;
    }

    public Integer getMessageType() {
        return this.mMessageType;
    }

    public String getPayloadAsString() {
        return TCompactProtocol.getStringFromByteBuffer(this.mMessagePayload);
    }

    public SkywalkerMessage(byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        int i = 0;
        while (wrap.hasRemaining()) {
            byte b = wrap.get() & 255;
            int i2 = b >> 4;
            if (i2 == 0) {
                i = TCompactProtocol.fromZigZag(TCompactProtocol.readVarint(wrap));
            } else {
                i += i2;
            }
            byte b2 = b & 15;
            if (b2 == 0) {
                return;
            }
            if (i == 1 && b2 == 5) {
                this.mMessageType = Integer.valueOf(TCompactProtocol.fromZigZag(TCompactProtocol.readVarint(wrap)));
            } else if (i == 2 && b2 == 8) {
                int readVarint = TCompactProtocol.readVarint(wrap);
                this.mMessagePayload = ByteBuffer.wrap(bArr, wrap.position(), readVarint);
                wrap.position(wrap.position() + readVarint);
            }
        }
    }
}
