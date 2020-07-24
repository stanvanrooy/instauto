package p000X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.B8B */
public final class B8B implements C29337Cw6 {
    public static final long A00 = TimeUnit.MINUTES.toMillis(5);

    public final /* bridge */ /* synthetic */ Object get() {
        int i;
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min < 16777216) {
            i = 1048576;
        } else {
            i = 4194304;
            if (min < 33554432) {
                i = 2097152;
            }
        }
        return new C29548Czf(i, Integer.MAX_VALUE, i, i >> 3, A00);
    }
}
