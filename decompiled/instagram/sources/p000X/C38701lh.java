package p000X;

import android.view.View;
import com.instagram.model.mediatype.MediaType;
import com.instagram.model.shopping.ProductTag;
import java.util.ArrayList;

/* renamed from: X.1lh  reason: invalid class name and case insensitive filesystem */
public final class C38701lh extends C38301l3 {
    public final /* synthetic */ AnonymousClass1NJ A00;
    public final /* synthetic */ C27371Ho A01;
    public final /* synthetic */ C36841ih A02;
    public final /* synthetic */ AnonymousClass0C1 A03;
    public final /* synthetic */ C30411Ts A04;
    public final /* synthetic */ C38691lg A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38701lh(C06590Pq r2, AnonymousClass1NJ r3, AnonymousClass0C1 r4, C27371Ho r5, C36841ih r6, C30411Ts r7, C38691lg r8) {
        super(r2, true);
        this.A00 = r3;
        this.A03 = r4;
        this.A01 = r5;
        this.A02 = r6;
        this.A04 = r7;
        this.A05 = r8;
    }

    public final C33071cK A00() {
        switch (C38721lj.A00(this.A00, this.A03).intValue()) {
            case 2:
            case 5:
                return new C33061cJ(C33051cI.VIEW_PRODUCTS).A00();
            default:
                return null;
        }
    }

    public final void A01(View view) {
        Integer A002 = C38721lj.A00(this.A00, this.A03);
        C27371Ho r7 = this.A01;
        AnonymousClass0C1 r6 = this.A03;
        String A003 = AnonymousClass83S.A00(this.A02.A04(this.A00.A0B(r6)).A00);
        String A004 = C200168hY.A00(A002);
        AnonymousClass1NJ r0 = this.A00;
        String id = r0.getId();
        MediaType APx = r0.APx();
        AnonymousClass0P4 A005 = AnonymousClass0P4.A00("instagram_media_tag_indicator_tapped", r7);
        A005.A0G("indicator_state", A003);
        A005.A0G("indicator_type", A004);
        C98564Np.A00(A005, id, APx);
        AnonymousClass0WN.A01(r6).BcG(A005);
        switch (A002.intValue()) {
            case 1:
                this.A04.BE7(this.A00, this.A05);
                return;
            case 2:
            case 5:
                C30411Ts r4 = this.A04;
                AnonymousClass1NJ r3 = this.A00;
                AnonymousClass0a4.A09(r3.A1P());
                ArrayList A0w = r3.A0w();
                AnonymousClass0a4.A06(A0w);
                r4.BG4(r3, ((ProductTag) A0w.get(0)).A01.A02, this.A02, this.A05);
                return;
            case 3:
                this.A04.B6x(this.A00, this.A02.A04, this.A01, "icon_tap");
                return;
            case 4:
                this.A04.ArL(this.A00.A0Q(this.A03), this.A02);
                return;
            case 6:
                this.A04.Awn(this.A01, this.A00, this.A02.A04);
                return;
            default:
                return;
        }
    }
}
