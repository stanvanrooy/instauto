package p000X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.DIV */
public interface DIV {
    public static final ByteBuffer A00 = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    DIU A9H(DIU diu);

    ByteBuffer ARL();

    boolean Ae3();

    boolean AfJ();

    void BYo();

    void BYp(ByteBuffer byteBuffer);

    void flush();
}
