package p000X;

import java.util.GregorianCalendar;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.0kR  reason: invalid class name and case insensitive filesystem */
public final class C14410kR {
    public C14400kQ A00;
    public C14400kQ A01;
    public C14400kQ A02;
    public C14400kQ A03;
    public C14390kP A04;
    public ScheduledExecutorService A05;
    public final Random A06 = new Random();

    public static boolean A00(C14410kR r3, C14400kQ r4) {
        int i;
        if (r4.A00 <= 0 || ((r4.A06 >= 0 && r4.A05 >= 0 && (i = GregorianCalendar.getInstance().get(11)) >= r4.A06 && i <= r4.A05) || r3.A06.nextInt(r4.A00) != 0)) {
            return false;
        }
        return true;
    }

    public C14410kR(C14400kQ r2, C14400kQ r3, C14400kQ r4, C14400kQ r5, ScheduledExecutorService scheduledExecutorService, C14390kP r7) {
        this.A03 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r5;
        this.A05 = scheduledExecutorService;
        this.A04 = r7;
    }
}
