package p000X;

import java.util.LinkedList;

/* renamed from: X.13u  reason: invalid class name and case insensitive filesystem */
public final class C242313u implements AnonymousClass0Q6, AnonymousClass0C2 {
    public AnonymousClass0C1 A00;

    public static void A00(C06590Pq r7) {
        AnonymousClass0k1 r2;
        LinkedList<C37021iz> linkedList;
        synchronized (AnonymousClass0k1.class) {
            r2 = AnonymousClass0k1.A04;
        }
        synchronized (r2) {
            if (r2.A02 == null) {
                AnonymousClass0QD.A02("InstagramDataUsageAggregator", "Buckets collection is null");
            }
            linkedList = new LinkedList<>(r2.A02.values());
            C37021iz r0 = r2.A00;
            if (r0 != null) {
                linkedList.add(r0);
            }
            C37021iz r02 = r2.A01;
            if (r02 != null) {
                linkedList.add(r02);
            }
            r2.A02.clear();
        }
        for (C37021iz r3 : linkedList) {
            if (((double) r3.A00) > 9.999999747378752E-5d) {
                AnonymousClass0P4 A002 = AnonymousClass0P4.A00("ig_network_data_usage", (AnonymousClass0RN) null);
                A002.A0C("mb_used", Double.valueOf((double) r3.A00));
                A002.A0G("request_type", r3.A03.name());
                A002.A0G("behavior", C26191Ca.A00(r3.A04));
                A002.A0E("data_type", Integer.valueOf(r3.A01));
                A002.A0E("total_requests_in_batch", Integer.valueOf(r3.A02));
                A002.A0A("is_on_wifi", Boolean.valueOf(r3.A05));
                AnonymousClass0WN.A01(r7).BcG(A002);
            }
        }
    }

    public final void onUserSessionWillEnd(boolean z) {
        A00(this.A00);
        AnonymousClass0Q7.A03().A0D(this);
    }

    public C242313u(AnonymousClass0C1 r1) {
        this.A00 = r1;
    }

    public final void onAppBackgrounded() {
        int A03 = AnonymousClass0Z0.A03(523660433);
        A00(this.A00);
        AnonymousClass0Z0.A0A(1803080447, A03);
    }

    public final void onAppForegrounded() {
        AnonymousClass0Z0.A0A(-93225517, AnonymousClass0Z0.A03(-2133455164));
    }

    public final void onUserSessionStart(boolean z) {
        AnonymousClass0Z0.A0A(951166514, AnonymousClass0Z0.A03(-375341831));
    }
}
