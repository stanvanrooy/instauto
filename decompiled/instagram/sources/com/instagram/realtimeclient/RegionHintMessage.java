package com.instagram.realtimeclient;

import java.nio.ByteBuffer;

public class RegionHintMessage {
    public static final int FIELD_MESSAGE_REGION = 1;
    public String mRegion;

    public RegionHintMessage(byte[] bArr) {
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
            if (i == 1 && b2 == 8) {
                this.mRegion = TCompactProtocol.getStringFromByteBuffer(wrap, TCompactProtocol.readVarint(wrap));
                return;
            }
        }
    }

    public String getRegion() {
        return this.mRegion;
    }
}
