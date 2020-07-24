package p000X;

import android.view.View;

/* renamed from: X.1Vi  reason: invalid class name and case insensitive filesystem */
public final class C30821Vi implements View.OnClickListener {
    public C30261Td A00;
    public AnonymousClass0C1 A01;
    public C467520s A02;
    public String A03;

    public C30821Vi(AnonymousClass0C1 r1, C30261Td r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final void onClick(View view) {
        int i;
        int i2;
        int A05 = AnonymousClass0Z0.A05(1803589636);
        C30261Td r1 = this.A00;
        AnonymousClass1IU r0 = r1.A04.A1U;
        if (r0 != null) {
            i = r0.A00;
        } else {
            i = 0;
        }
        C30261Td.A01(r1, i);
        AnonymousClass0P4 A002 = AnonymousClass0P4.A00("business_conversion_netego_click_convert_button", (AnonymousClass0RN) null);
        AnonymousClass1IU r02 = this.A00.A04.A1U;
        if (r02 != null) {
            i2 = r02.A00;
        } else {
            i2 = 0;
        }
        A002.A0E("entry_position", Integer.valueOf(i2));
        A002.A0G("id", this.A02.getId());
        A002.A0G("tracking_token", this.A02.AYw());
        A002.A0G("type", "business_conversion");
        A002.A0G("session_id", this.A03);
        AnonymousClass0WN.A01(this.A01).BcG(A002);
        AnonymousClass0Z0.A0C(1233964252, A05);
    }
}
