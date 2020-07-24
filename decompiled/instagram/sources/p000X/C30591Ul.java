package p000X;

/* renamed from: X.1Ul  reason: invalid class name and case insensitive filesystem */
public final class C30591Ul extends AnonymousClass1SZ {
    public final C27371Ho A00;
    public final AnonymousClass0C1 A01;
    public final String A02;

    public final /* bridge */ /* synthetic */ void A01(Object obj, Object obj2) {
        AnonymousClass1NJ r6 = (AnonymousClass1NJ) obj;
        if (r6 == null || !r6.A0Q(this.A01).Aho()) {
            C215299Pr.A02(this.A00, this.A01, r6, false, this.A02);
            return;
        }
        C27371Ho r3 = this.A00;
        AnonymousClass0C1 r2 = this.A01;
        C37141jB A022 = C37591ju.A02("tags_list_entry_point_impression", r3);
        A022.A0B(r2, r6);
        A022.A4E = null;
        A022.A2w = AnonymousClass9PT.A00(Constants.ZERO);
        A022.A04();
        AnonymousClass9FJ.A01(r2, A022, r6, r3);
    }

    public final /* bridge */ /* synthetic */ void A02(Object obj, Object obj2) {
        AnonymousClass1NJ r6 = (AnonymousClass1NJ) obj;
        if (r6 == null || !r6.A0Q(this.A01).Aho()) {
            C215299Pr.A02(this.A00, this.A01, r6, true, this.A02);
            return;
        }
        C27371Ho r3 = this.A00;
        AnonymousClass0C1 r2 = this.A01;
        C37141jB A022 = C37591ju.A02("tags_list_entry_point_sub_impression", r3);
        A022.A0B(r2, r6);
        A022.A4E = null;
        A022.A2w = AnonymousClass9PT.A00(Constants.ZERO);
        A022.A04();
        AnonymousClass9FJ.A01(r2, A022, r6, r3);
    }

    public C30591Ul(C27371Ho r2, AnonymousClass0C1 r3, String str) {
        super(C28191Kt.A00(r3).A01());
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = str;
    }
}
