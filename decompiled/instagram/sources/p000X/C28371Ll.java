package p000X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1Ll  reason: invalid class name and case insensitive filesystem */
public final class C28371Ll {
    public final AnonymousClass0OT A00;
    public final AnonymousClass0C1 A01;
    public final C28331Lh A02;
    public final Object A03 = new Object();
    public final Map A04 = new LinkedHashMap();

    public List getCandidates() {
        return new ArrayList(this.A04.values());
    }

    public C28371Ll(AnonymousClass0OT r2, C28331Lh r3, AnonymousClass0C1 r4) {
        this.A00 = r2;
        this.A02 = r3;
        this.A01 = r4;
    }

    public C28371Ll(C28331Lh r3, AnonymousClass0C1 r4) {
        AnonymousClass0O1 A002 = AnonymousClass0O1.A00();
        A002.A01 = "FeedPool-worker";
        this.A00 = A002.A01();
        this.A02 = r3;
        this.A01 = r4;
    }
}
