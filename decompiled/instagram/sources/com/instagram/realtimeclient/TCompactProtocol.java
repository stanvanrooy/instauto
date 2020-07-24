package com.instagram.realtimeclient;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public class TCompactProtocol {
    public static final byte TYPE_BINARY = 8;
    public static final byte TYPE_I32 = 5;
    public static final byte TYPE_STOP = 0;

    public static int fromZigZag(int i) {
        return (-(i & 1)) ^ (i >> 1);
    }

    public static int readVarint(ByteBuffer byteBuffer) {
        int i = 0;
        int i2 = 0;
        while (byteBuffer.hasRemaining()) {
            byte b = byteBuffer.get() & 255;
            i |= (b & Byte.MAX_VALUE) << i2;
            if ((b >> 7) == 0) {
                break;
            }
            i2 += 7;
        }
        return i;
    }

    public static String getStringFromByteBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        return getStringFromByteBuffer(byteBuffer, byteBuffer.remaining());
    }

    public static String getStringFromByteBuffer(ByteBuffer byteBuffer, int i) {
        if (byteBuffer == null) {
            return null;
        }
        return new String(byteBuffer.array(), byteBuffer.position(), i, Charset.forName("UTF-8"));
    }
}
