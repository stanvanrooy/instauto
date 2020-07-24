package p000X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.model.reels.Reel;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1Oc  reason: invalid class name and case insensitive filesystem */
public final class C28971Oc {
    public C28091Kj A00;
    public AnonymousClass0C1 A01;
    public final AnonymousClass0RN A02;
    public final String A03;
    public final String A04;
    public final Set A05 = new HashSet();
    public final Set A06 = new HashSet();
    public final String A07;
    public final Set A08 = new HashSet();

    public final void A04(Reel reel, int i, C36031hK r10, AnonymousClass1OR r11, Boolean bool) {
        A00(this, reel.getId(), reel, i, r10, r11, bool);
    }

    public static void A00(C28971Oc r5, String str, Reel reel, int i, C36031hK r9, AnonymousClass1OR r10, Boolean bool) {
        int i2;
        if (!r5.A08.contains(str)) {
            r5.A08.add(str);
            AnonymousClass0P4 A002 = AnonymousClass0P4.A00("reel_tray_impression", r5.A02);
            if (r10 != null) {
                i2 = new ArrayList(r10.A05).size();
            } else {
                i2 = 0;
            }
            C37311jS.A04(A002, r9, i2);
            A002.A0E("tray_position", Integer.valueOf(i));
            A002.A0G("tray_session_id", r5.A04);
            A002.A0G("viewer_session_id", r5.A07);
            boolean A0W = reel.A0W();
            String str2 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            String str3 = "0";
            if (A0W) {
                str3 = str2;
            }
            A002.A0G("is_live_reel", str3);
            String str4 = "0";
            if (reel.A0b()) {
                str4 = str2;
            }
            A002.A0G("is_live_questions_reel", str4);
            if (reel.A0m(r5.A01)) {
                str2 = "0";
            }
            A002.A0G("is_new_reel", str2);
            A002.A0G("reel_type", reel.A0I());
            A002.A0B("was_item_async_inflated", bool);
            A002.A0G("story_ranking_token", r5.A03);
            A002.A0G("reel_id", reel.getId());
            A002.A0A("is_besties_reel", Boolean.valueOf(reel.A0h(r5.A01)));
            if (reel.A0E(r5.A01) != null) {
                A002.A0G("ring_spec_name", reel.A0E(r5.A01).A02());
            }
            if (reel.A0D(r5.A01) != null) {
                A002.A0G("ring_glyph_name", reel.A0D(r5.A01).A00);
            }
            if (reel.A0W() && !reel.A0C.A04().isEmpty()) {
                A002.A0G("guest_id", ((C13300iJ) reel.A0C.A04().iterator().next()).getId());
                A002.A0G("m_pk", reel.A0C.A0P);
            }
            A002.A0K(reel.A0M.APN());
            AnonymousClass0WN.A01(r5.A01).BcG(A002);
        }
    }

    public final void A01(int i) {
        if (!this.A08.contains("spinner")) {
            this.A08.add("spinner");
            C91723y0 r2 = new C91723y0(AnonymousClass0QT.A00(this.A01, this.A02).A02("reel_tray_impression"));
            r2.A08("tray_session_id", this.A04);
            r2.A08("story_ranking_token", this.A03);
            r2.A08("reel_type", "spinner");
            r2.A06("tray_position", Integer.valueOf(i));
            r2.A01();
        }
    }

    public final void A02(long j, C36031hK r13, AnonymousClass1OR r14, boolean z, int i, Integer num) {
        AnonymousClass0P4 A002 = C37311jS.A00(this.A02, this.A04, this.A03, j, r13, r14, num, z, false);
        A002.A0E(TraceFieldType.StatusCode, Integer.valueOf(i));
        AnonymousClass0WN.A01(this.A01).BcG(A002);
    }

    public final void A03(long j, C36031hK r13, AnonymousClass1OR r14, boolean z, Integer num) {
        AnonymousClass0WN.A01(this.A01).BcG(C37311jS.A00(this.A02, this.A04, this.A03, j, r13, r14, num, z, true));
    }

    public C28971Oc(C28961Ob r2) {
        this.A01 = r2.A01;
        this.A02 = r2.A00;
        this.A03 = r2.A02;
        this.A07 = r2.A04;
        this.A04 = r2.A03;
    }
}
