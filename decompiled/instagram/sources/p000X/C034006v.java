package p000X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.PowerManager;
import android.os.RemoteException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.06v  reason: invalid class name and case insensitive filesystem */
public final class C034006v {
    public static C034006v A02;
    public static final long A03 = TimeUnit.SECONDS.toMillis(60);
    public final Context A00;
    public final C032306d A01;

    public static synchronized C034006v A00(Context context) {
        C034006v r0;
        synchronized (C034006v.class) {
            if (A02 == null) {
                A02 = new C034006v(context);
            }
            r0 = A02;
        }
        return r0;
    }

    public static String A01(C034006v r2, String str, int i) {
        try {
            return str.concat(r2.A00.getResources().getResourceEntryName(i));
        } catch (Resources.NotFoundException e) {
            AnonymousClass0DB.A0R("UploadServiceLogic", e, "Resource not found for id: %d", Integer.valueOf(i));
            return Integer.toString(i);
        }
    }

    public static void A02(C034006v r3, String str, C033806t r5, C033906u r6, String str2, C032406e r8) {
        if ("com.facebook.analytics2.logger.UPLOAD_NOW".equals(str)) {
            C032306d r4 = r3.A01;
            AnonymousClass0FY.A00(r4);
            AnonymousClass06X r32 = new AnonymousClass06X(r5.A02, r5.A06, r5.A08);
            if (r5.A01 == null) {
                r5.A01 = new C024302i(r5, C032906k.A00(r5.A03));
            }
            r4.A01(r32, new C024202h(r5.A01, r6, str2, r8));
        } else if ("com.facebook.analytics2.logger.USER_LOGOUT".equals(str)) {
            Bundle bundle = r5.A04;
            AnonymousClass0FY.A00(bundle);
            new C033606r(bundle);
            C032306d r42 = r3.A01;
            AnonymousClass0FY.A00(r42);
            int i = r5.A02;
            AnonymousClass06W r1 = r5.A06;
            String str3 = r5.A08;
            AnonymousClass0FY.A00(str3);
            AnonymousClass06X r33 = new AnonymousClass06X(i, r1, str3);
            if (r5.A01 == null) {
                r5.A01 = new C024302i(r5, C032906k.A00(r5.A03));
            }
            r42.A01(r33, new C024202h(r5.A01, r6, str2, r8));
        } else {
            throw new IllegalArgumentException(AnonymousClass000.A0E("Unknown action=", str));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008c, code lost:
        p000X.AnonymousClass0DB.A0H("UploadServiceLogic", "Misunderstood service intent: %s", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0092, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0093, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009d, code lost:
        p000X.AnonymousClass0FY.A00((java.lang.Object) null);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008b A[ExcHandler: 05p (r1v3 'e' X.05p A[CUSTOM_DECLARE]), Splitter:B:2:0x0006] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009d  */
    public final int A03(Intent intent, C033906u r12) {
        C032406e r9;
        String str = null;
        C033906u r7 = r12;
        if (intent != null) {
            try {
                C033806t A002 = C033806t.A00(intent.getExtras(), this.A00);
                PowerManager.WakeLock A003 = AnonymousClass0ZP.A00((PowerManager) A002.A03.getApplicationContext().getSystemService("power"), 1, AnonymousClass000.A0K("UploadServiceLogic-", intent.getComponent().getShortClassName(), "-service-", A002.A02));
                A002.A00 = A003;
                AnonymousClass0ZP.A03(A003);
                AnonymousClass0ZP.A04(A002.A00, A03);
                Messenger messenger = A002.A05;
                if (messenger != null) {
                    try {
                        messenger.send(Message.obtain());
                    } catch (RemoteException unused) {
                        AnonymousClass0DB.A0E("UploadServiceLogic", "The peer died unexpectedly, possible wakelock gap detected.");
                    }
                }
                String str2 = A002.A06.A07;
                String str3 = str2;
                if (str2 == null) {
                    r9 = null;
                } else {
                    AnonymousClass05J A004 = AnonymousClass05J.A00(this.A00);
                    r9 = (C032406e) AnonymousClass05J.A02(A004, A004.A02, str3);
                }
                if (r9 != null) {
                    str = A01(this, "SERVICE-", A002.A02);
                }
                if (r9 != null) {
                    AnonymousClass0FY.A00(str);
                }
                A02(this, intent.getAction(), A002, r7, str, r9);
                return 3;
            } catch (IllegalArgumentException e) {
                e = e;
                AnonymousClass0DB.A0H("UploadServiceLogic", "Failure in runJobNow", e);
                if (r9 != null) {
                }
                r12.A01.stopSelf(r12.A00);
                return 2;
            } catch (C031305p e2) {
            }
        } else {
            throw new C031305p("Received a null intent in runJobFromService, did you ever return START_STICKY?");
        }
    }

    public C034006v(Context context) {
        this.A00 = context.getApplicationContext();
        this.A01 = new C032306d(context);
    }
}
