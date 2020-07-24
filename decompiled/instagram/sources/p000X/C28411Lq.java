package p000X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.1Lq  reason: invalid class name and case insensitive filesystem */
public final class C28411Lq implements C28401Lo {
    public long A00;
    public final C04140Cp A01;
    public final C27641Iq A02;
    public final AnonymousClass0C1 A03;
    public final AtomicLong A04 = new AtomicLong(-1);

    public final void BJB() {
    }

    public final void BP6() {
    }

    private AnonymousClass0P4 A00(String str, C15880ng r5) {
        String str2;
        AnonymousClass0P4 A012 = AnonymousClass0P4.A01(str, "feed_timeline");
        A012.A0G("reason", C16120o4.A00(r5.A04));
        A012.A0G("is_background", AnonymousClass0Q7.A03().A08());
        A012.A0G("last_navigation_module", C26441Dh.A00(this.A03).A05);
        boolean z = false;
        if (C26441Dh.A00(this.A03).A03 != null) {
            z = true;
        }
        A012.A0A("nav_in_transit", Boolean.valueOf(z));
        A012.A0E("view_info_count", Integer.valueOf(r5.A03));
        if (r5.A04 == Constants.A12) {
            str2 = "load_more";
        } else {
            str2 = "reload";
        }
        A012.A0G("fetch_action", str2);
        return A012;
    }

    public final void BJ5(C15880ng r7, Throwable th, int i) {
        AnonymousClass0P4 A002 = A00("ig_main_feed_request_failed", r7);
        A002.A0E("num_of_items", 0);
        A002.A0E(TraceFieldType.StatusCode, Integer.valueOf(i));
        if (th != null) {
            C06270Ok A003 = C06270Ok.A00();
            A003.A09(DialogModule.KEY_MESSAGE, th.toString());
            if (!(th == null || th.getCause() == null || !(th.getCause() instanceof C45381xm))) {
                String str = ((C45381xm) th.getCause()).A00;
                if (str != null) {
                    str = str.substring(0, Math.min(str.length(), 1000));
                }
                A003.A09("body", str);
            }
            A002.A08("error", A003);
        }
        A002.A0F("request_duration", Long.valueOf(this.A04.longValue()));
        AnonymousClass0WN.A01(this.A03).BcG(A002);
    }

    public final void BJ7(C15880ng r6) {
        this.A04.set(this.A01.now() - this.A00);
    }

    public final void BJK(C15880ng r4) {
        this.A00 = this.A01.now();
        AnonymousClass0WN.A01(this.A03).BcG(A00("ig_main_feed_request_began", r4));
        AnonymousClass0RU A012 = AnonymousClass0WN.A01(this.A03);
        AnonymousClass0P4 A013 = AnonymousClass0P4.A01("instagram_feed_request_sent", "feed_timeline");
        C28741Mx.A01(A013, r4);
        A012.BcG(A013);
    }

    public final void BJS(C15880ng r4, C28661Mp r5, boolean z) {
        AnonymousClass0P4 A002 = A00("ig_main_feed_request_succeeded", r4);
        A002.A0E("num_of_items", Integer.valueOf(r5.A01().size()));
        if (!Collections.unmodifiableSet(this.A02.A02).isEmpty()) {
            A002.A0J("interaction_events", (String[]) Collections.unmodifiableSet(this.A02.A02).toArray(new String[Collections.unmodifiableSet(this.A02.A02).size()]));
        }
        A002.A0A("new_items_delivered", Boolean.valueOf(z));
        A002.A0F("request_duration", Long.valueOf(this.A04.longValue()));
        AnonymousClass0WN.A01(this.A03).BcG(A002);
        AnonymousClass0WN.A01(this.A03).BcG(AnonymousClass0P4.A01("instagram_feed_request_completed", "feed_timeline"));
    }

    public final void BJX(C15880ng r6, C28661Mp r7) {
        this.A04.set(this.A01.now() - this.A00);
    }

    public C28411Lq(AnonymousClass0C1 r4, C04140Cp r5, C27641Iq r6) {
        this.A03 = r4;
        this.A01 = r5;
        this.A02 = r6;
    }
}
