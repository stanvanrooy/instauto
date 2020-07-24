package p000X;

import android.content.Context;
import android.content.Intent;
import com.instagram.pendingmedia.service.uploadretrypolicy.PendingMediaNotificationService;

/* renamed from: X.0ft  reason: invalid class name and case insensitive filesystem */
public final class C11920ft extends C09790c1 implements C06560Pn {
    public final Context A00;

    public final void As0(C06590Pq r1) {
    }

    public static void A00(C11920ft r4, String str) {
        Intent intent = new Intent(r4.A00, PendingMediaNotificationService.class);
        intent.setAction(str);
        Context context = r4.A00;
        Intent A0C = AnonymousClass0XM.A00().A08().A00.A0C(intent, context, (String) null);
        if (A0C != null) {
            context.startService(A0C);
        }
    }

    public final void Arz(C06590Pq r6) {
        if (r6 instanceof AnonymousClass0C1) {
            C17870qw A002 = C17870qw.A00(this.A00, (AnonymousClass0C1) r6);
            if (A002.A0L() && ((Boolean) AnonymousClass0L6.A01(r6, AnonymousClass0L7.INGESTION_KEEPALIVE, "enable_foreground_service", false, (AnonymousClass04H) null)).booleanValue()) {
                A002.A03.add(new C106874jE(this, A002));
                A00(this, "Show_Notification");
            }
        }
    }

    public C11920ft(Context context) {
        this.A00 = context;
    }

    public final void A07() {
        int A03 = AnonymousClass0Z0.A03(1445606311);
        C13890jP.A00().A01(this);
        AnonymousClass0Z0.A0A(1229291787, A03);
    }
}
