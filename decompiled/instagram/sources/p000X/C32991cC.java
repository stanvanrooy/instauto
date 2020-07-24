package p000X;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1cC  reason: invalid class name and case insensitive filesystem */
public final class C32991cC extends C33001cD implements C06570Po, C06580Pp {
    public C33031cG A00 = C33031cG.UNDEFINED;
    public final C06590Pq A01;

    public final void onSessionIsEnding() {
    }

    public final void onUserSessionWillEnd(boolean z) {
    }

    public static C32991cC A00(C06590Pq r2) {
        return (C32991cC) r2.AVA(C32991cC.class, new C33011cE(r2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00e4  */
    public final void A06(List list, C215759Rq r11, List list2) {
        String AEu;
        AnonymousClass0QV r0;
        C33501d1 A002 = C33501d1.A00(this.A01);
        C33031cG r2 = this.A00;
        C06170Oa A003 = C06170Oa.A00();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            C33071cK r6 = (C33071cK) it.next();
            C06270Ok A004 = C06270Ok.A00();
            A004.A08("type", Long.valueOf(((C33051cI) r6.A01).A00));
            Integer num = r6.A00;
            Integer num2 = num;
            if (num != null) {
                A004.A07("index", num2);
            }
            String str = r6.A03;
            String str2 = str;
            if (str != null) {
                A004.A09("thumbnail_id", str2);
            }
            String str3 = r6.A02;
            String str4 = str3;
            if (str3 != null) {
                A004.A09("product_id", str4);
            }
            A003.A00.add(A004);
        }
        C215739Ro r3 = new C215739Ro(list, r11, list2, A003);
        boolean z = true;
        C33501d1.A02(A002, true);
        A002.A01 = r3;
        C39031mF r02 = r3.A01.A01;
        if (r02 == null) {
            AEu = null;
        } else {
            AEu = r02.AEu();
        }
        A002.A04 = AEu;
        C06590Pq r5 = A002.A02;
        C215759Rq r03 = r3.A01;
        AnonymousClass0RN r1 = (AnonymousClass0RN) r03.A02;
        if (r03.A03) {
            r0 = AnonymousClass0QV.A06;
        } else {
            r0 = AnonymousClass0QV.A03;
        }
        C90673wJ r52 = new C90673wJ(AnonymousClass0QT.A01(r5, r1, r0).A02("instagram_media_metrics"));
        List A012 = C215659Rf.A01(r3);
        r52.A08("event_trace_id", r3.A03);
        r52.A09("tracking", r3.A04);
        r52.A09("tracking_nodes", A012);
        r52.A02("gesture_type", r2);
        if (A002.A04 != null && ((Boolean) AnonymousClass0L6.A00(A002.A02, AnonymousClass0L7.SANITIZED_DEST_URL_KILL_SWITCH, "sanitize_url", false, (AnonymousClass04H) null)).booleanValue()) {
            try {
                r52.A08("sanitized_dest_uri", C23456ANd.A00(C08480Xf.A00(A002.A04), C23457ANe.A04).BrU());
            } catch (Exception unused) {
            }
            if (!z) {
                r52.A08("dest_uri", A002.A04);
            }
            r52.A01();
            C215669Rg.A00(A002.A02).A00 = r3;
            this.A00 = C33031cG.UNDEFINED;
        }
        z = false;
        if (!z) {
        }
        r52.A01();
        C215669Rg.A00(A002.A02).A00 = r3;
        this.A00 = C33031cG.UNDEFINED;
    }

    public final void A07(View view, C33051cI r3) {
        A05(view, new C33061cJ(r3).A00());
    }

    public C32991cC(C06590Pq r6) {
        this.A01 = r6;
        AnonymousClass0L7 r3 = AnonymousClass0L7.AL_CLEAN_LOG_CONTEXT_ON_NAV;
        this.A00 = (long) ((Integer) AnonymousClass0L6.A00(r6, r3, "clear_registry_on_nav_delay_time_in_ms", 1000, (AnonymousClass04H) null)).intValue();
        this.A01 = (long) ((Integer) AnonymousClass0L6.A00(this.A01, r3, "log_context_grace_period_in_ms", 5000, (AnonymousClass04H) null)).intValue();
    }

    public final void A05(View view, C33071cK r2) {
        super.A05(view, r2);
    }
}
