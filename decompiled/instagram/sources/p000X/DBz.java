package p000X;

import java.nio.ByteBuffer;

/* renamed from: X.DBz */
public final class DBz {
    public final ByteBuffer A00;
    public final ByteBuffer A01;

    public static DBz A00(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int limit = byteBuffer2.limit();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(limit);
        byteBuffer2.mark();
        while (true) {
            int position = byteBuffer2.position();
            if (position >= limit) {
                byteBuffer2.reset();
                allocateDirect.flip();
                return new DBz(byteBuffer, allocateDirect);
            } else if (limit - position > 3 && byteBuffer2.get(position) == 0 && byteBuffer2.get(position + 1) == 0 && byteBuffer2.get(position + 2) == 3) {
                allocateDirect.put(byteBuffer2.get());
                allocateDirect.put(byteBuffer2.get());
                byteBuffer2.get();
            } else {
                allocateDirect.put(byteBuffer2.get());
            }
        }
    }

    public DBz(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        this.A00 = byteBuffer;
        this.A01 = byteBuffer2;
    }
}
