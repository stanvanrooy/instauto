package p000X;

import android.net.Uri;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.19j  reason: invalid class name and case insensitive filesystem */
public final class C255819j extends AnonymousClass19k {
    public static boolean A00;
    public static final C256019m A01;
    public static final C256019m A02;
    public static final Map A03 = new HashMap();

    static {
        C255919l r1 = new C255919l();
        C15920nk r2 = C15920nk.Other;
        r1.A03 = r2;
        r1.A05 = Constants.A0C;
        A02 = r1.A00();
        C255919l r12 = new C255919l();
        r12.A03 = r2;
        r12.A05 = Constants.ONE;
        A01 = r12.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009e, code lost:
        if (r8 != null) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00a3 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:43:0x00a3=Splitter:B:43:0x00a3, B:33:0x0097=Splitter:B:33:0x0097} */
    public final C204758pW A02(Uri uri, C204778pY r12) {
        C256019m r0;
        Boolean bool;
        AnonymousClass18O BWk = AnonymousClass18O.A04.BWk(r12.A02);
        int andIncrement = C62602o0.A01.getAndIncrement();
        String str = r12.A01;
        C62602o0.A00.markerStart(38797316, andIncrement);
        C62602o0.A00.markerAnnotate(38797316, "File Downloaded", str);
        boolean z = A00;
        if (!z && (bool = (Boolean) A03.get(r12.A02)) != null) {
            z = bool.booleanValue();
        }
        C204758pW r9 = null;
        try {
            C256819v r1 = C256819v.A00;
            if (z) {
                r0 = A01;
            } else {
                r0 = A02;
            }
            C44171vi A06 = r1.A06(BWk, r0);
            C62602o0.A00.markerEnd(38797316, andIncrement, 2);
            File A032 = this.A00.A03(A06.ANj(), r12.A00);
            if (A032 == null || !A032.isFile()) {
                AnonymousClass19k.A01(this, -2147483639);
            } else {
                C204728pT r3 = this.A01;
                if (r3 != null) {
                    Object A9n = r3.A02.A08().A9n(A032);
                    synchronized (r3.A03) {
                        r3.A03.set(A9n);
                        r3.A00 = 2;
                    }
                    r3.A02();
                }
                AnonymousClass19k.A01(this, -2147483638);
                r9 = new C204758pW(r12.A01, r12.A00, A032, false);
            }
            A06.close();
            return r9;
        } catch (Exception e) {
            AnonymousClass0QD.A05("RasDownloader", "Download failed.", e);
            C62602o0.A00.markerEnd(38797316, andIncrement, 3);
            return r9;
        } catch (Throwable ) {
            throw th;
        }
    }

    public C255819j(C197038bt r4, boolean z) {
        super(r4);
        A03.put(r4.A0B(), Boolean.valueOf(z));
    }

    public final C204798pa A03() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        if (newSingleThreadExecutor instanceof C204798pa) {
            return (C204798pa) newSingleThreadExecutor;
        }
        if (newSingleThreadExecutor instanceof ScheduledExecutorService) {
            return new AnonymousClass92x((ScheduledExecutorService) newSingleThreadExecutor);
        }
        return new C2098192y(newSingleThreadExecutor);
    }
}
