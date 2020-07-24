package p000X;

import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.venue.Venue;

/* renamed from: X.0uf  reason: invalid class name and case insensitive filesystem */
public final class C20170uf extends C19410tR implements C19460tW {
    public static final C17120pi A02 = new C20180ug();
    public DirectForwardingParams A00;
    public Venue A01;

    public final String A01() {
        return "send_location_share_message";
    }

    public final C58022fB A03() {
        return C58022fB.LOCATION;
    }

    public final /* bridge */ /* synthetic */ Object A04() {
        return this.A01;
    }

    public final DirectForwardingParams AM6() {
        return this.A00;
    }

    public C20170uf() {
    }

    public C20170uf(AnonymousClass3LQ r7, DirectThreadKey directThreadKey, Venue venue, Long l, long j, DirectForwardingParams directForwardingParams) {
        super(r7, directThreadKey, l, j);
        this.A01 = venue;
        this.A00 = directForwardingParams;
    }
}
