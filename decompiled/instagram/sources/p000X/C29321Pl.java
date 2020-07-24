package p000X;

/* renamed from: X.1Pl  reason: invalid class name and case insensitive filesystem */
public final class C29321Pl implements C29311Pk {
    public final /* synthetic */ AnonymousClass1PE A00;

    public C29321Pl(AnonymousClass1PE r1) {
        this.A00 = r1;
    }

    public final void AlB(String str, int i, int i2, String str2) {
        AnonymousClass1PE r0 = this.A00;
        C92343z0 r2 = new C92343z0(AnonymousClass0QT.A00(r0.A0b, r0.A0I).A02("ig_main_feed_group_header_tapped"));
        if (r2.A0B()) {
            r2.A08("module", this.A00.A0I.getModuleName());
            r2.A07("media_id", Long.valueOf(Long.parseLong(str)));
            r2.A07("feed_recs_media_index", Long.valueOf((long) i2));
            r2.A07("media_index", Long.valueOf((long) i));
            r2.A08("feed_session_id", this.A00.A0d.AVo());
            r2.A01();
        }
    }
}
