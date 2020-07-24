package p000X;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.BSL */
public abstract class BSL extends BBV {
    public Random A00;
    public final boolean A01;

    /* JADX WARNING: Removed duplicated region for block: B:57:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e7  */
    public static BBZ A01(String str, String str2, BSR bsr) {
        int i;
        String str3;
        String str4;
        IllegalStateException th;
        FutureTask futureTask;
        RuntimeException runtimeException;
        BSS bss;
        BSS bss2;
        String str5;
        String str6 = null;
        try {
            str4 = InetAddress.getByName(str2).getHostAddress();
            try {
                if (bsr.A01 == null) {
                    ScheduledExecutorService scheduledExecutorService = bsr.A05;
                    Integer num = bsr.A04.A00;
                    BSU bsu = bsr.A03;
                    BSV bsv = new BSV();
                    bsv.A00 = bsu.A00;
                    bsv.A01 = bsu.A01;
                    bsv.A02 = bsu.A02;
                    bsv.A03 = bsu.A03;
                    BSQ bsq = new BSQ(scheduledExecutorService, num, bsv);
                    bsr.A01 = bsq;
                    BSO bso = new BSO(bsr);
                    if (bsq.A00 == null) {
                        Integer num2 = bsq.A03;
                        int intValue = num2.intValue();
                        switch (intValue) {
                            case 0:
                                futureTask = new FutureTask(new BSN(bsq, bso));
                                break;
                            case 1:
                                futureTask = new FutureTask(new BSM(bsq, bso));
                                break;
                            default:
                                if (num2 == null) {
                                    str5 = "null";
                                } else if (1 - intValue != 0) {
                                    str5 = "DOWNLOAD";
                                } else {
                                    str5 = "UPLOAD";
                                }
                                throw new UnsupportedOperationException(AnonymousClass000.A0E("Unsupported speed test direction: ", str5));
                        }
                        bsq.A00 = futureTask;
                        AnonymousClass0Z9.A03(bsq.A01, bsq.A00, 1978632992);
                        ScheduledFuture<?> schedule = bsr.A05.schedule(new BST(bsr), bsr.A03.A00, TimeUnit.MILLISECONDS);
                        bsr.A02 = schedule;
                        if (schedule != null) {
                            try {
                                schedule.get();
                            } catch (Exception e) {
                                runtimeException = new RuntimeException("Unexpected exception when waiting.", e);
                            }
                        }
                        synchronized (bsr) {
                            try {
                                BSS bss3 = bsr.A00;
                                if (bss3 == null) {
                                    bss = null;
                                    bss2 = null;
                                } else {
                                    bss = new BSS(bss3);
                                    bss2 = bss;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        if (bss != null) {
                            str3 = bss2.A05;
                            i = (int) bss2.A01;
                            if (str4 != null) {
                                str6 = AnonymousClass000.A0G(str4, ":", 443);
                            }
                            boolean z = false;
                            if (str3 != null) {
                                z = true;
                            }
                            return new BBZ(str6, str, z, str3, i);
                        }
                        runtimeException = new RuntimeException("Unexpected null speed test.");
                        throw runtimeException;
                    }
                    th = new IllegalStateException();
                } else {
                    th = new IllegalStateException();
                }
                throw th;
            } catch (UnknownHostException e2) {
                e = e2;
                str3 = e.getMessage();
                i = 0;
                if (str4 != null) {
                }
                boolean z2 = false;
                if (str3 != null) {
                }
                return new BBZ(str6, str, z2, str3, i);
            }
        } catch (UnknownHostException e3) {
            e = e3;
            str4 = null;
            str3 = e.getMessage();
            i = 0;
            if (str4 != null) {
            }
            boolean z22 = false;
            if (str3 != null) {
            }
            return new BBZ(str6, str, z22, str3, i);
        }
    }

    public BSL(C14400kQ r1, ScheduledExecutorService scheduledExecutorService, C14390kP r3, Random random, boolean z) {
        super(r1, scheduledExecutorService, r3);
        this.A01 = z;
        this.A00 = random;
    }
}
