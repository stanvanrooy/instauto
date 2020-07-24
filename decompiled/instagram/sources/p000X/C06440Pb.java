package p000X;

import com.instagram.arlink.fragment.ArLinkScanControllerImpl;
import java.io.File;
import java.io.IOException;

/* renamed from: X.0Pb  reason: invalid class name and case insensitive filesystem */
public final class C06440Pb extends AnonymousClass0O9 {
    public final /* synthetic */ AnonymousClass059 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C06440Pb(AnonymousClass059 r4) {
        super(631, 4, false, false);
        this.A00 = r4;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:12|13|14|15|47) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0036 */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    public final void run() {
        File file;
        C33861dc BtX;
        AnonymousClass0RV r1;
        this.A00.A0J.set(false);
        while (!this.A00.A0I.isEmpty()) {
            Runnable runnable = (Runnable) this.A00.A0I.remove();
            if (this.A00.A06) {
                AnonymousClass0OQ A002 = AnonymousClass0OQ.A00();
                synchronized (A002.A01) {
                    if (A002.A00) {
                        A002.A01.wait(ArLinkScanControllerImpl.ERROR_DELAY_MS);
                    }
                }
            }
            runnable.run();
        }
        C08050Vl r12 = this.A00.A01;
        if (r12 != null) {
            try {
                file = r12.mAnalyticsSessionHandler.BXD(r12);
                try {
                    AnonymousClass059 r0 = this.A00;
                    r0.A0E.A04(r0.A05, true, r0.A01, Constants.ONE);
                    this.A00.A01 = null;
                } catch (IOException | IllegalStateException e) {
                    e = e;
                }
            } catch (IOException | IllegalStateException e2) {
                e = e2;
                file = null;
                AnonymousClass0DB.A0G("InstagramAnalyticsLoggerImpl", "[ZERO]", e);
                AnonymousClass0QD.A09("AnalyticsStorage[ZERO]", e);
                AnonymousClass059 r02 = this.A00;
                r02.A0E.A04(r02.A05, false, r02.A01, Constants.ONE);
                if (file != null || (BtX = this.A00.A0C.BtX(file)) != null) {
                }
            }
            if (file != null && (BtX = this.A00.A0C.BtX(file)) != null) {
                AnonymousClass1CA r03 = BtX.A00;
                AnonymousClass1CA r4 = r03;
                if (r03 != null) {
                    if (BtX.A01 == 200 && (r1 = this.A00.A0F) != null) {
                        try {
                            r1.BAN(r4.AHT());
                        } catch (IOException e3) {
                            AnonymousClass0DB.A0H("InstagramAnalyticsLoggerImpl", "Failed getByteStream", e3);
                        }
                    }
                    BtX.A00.A8w();
                }
            }
        }
    }
}
