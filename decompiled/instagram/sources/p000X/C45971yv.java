package p000X;

/* renamed from: X.1yv  reason: invalid class name and case insensitive filesystem */
public final class C45971yv extends C45981yw {
    public final /* synthetic */ AnonymousClass1NJ A00;
    public final /* synthetic */ C163046xV A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45971yv(C163046xV r1, AnonymousClass0C1 r2, C27371Ho r3, String str, AnonymousClass1NJ r5) {
        super(r2, r3, str);
        this.A01 = r1;
        this.A00 = r5;
    }

    public final void A04(AnonymousClass0P4 r12) {
        C58442fx AaP;
        String str;
        C163046xV r1 = this.A01;
        C162986xO r0 = r1.A03;
        if (r0 != null && (AaP = r0.AaP()) != null) {
            String AI0 = AaP.AI0();
            AnonymousClass1NJ r02 = this.A00;
            String str2 = r02.A25;
            boolean z = r02.A3T;
            String str3 = r1.A0D;
            String str4 = r1.A0F;
            String str5 = r1.A0G;
            String str6 = r1.A0H;
            String str7 = r1.A0E;
            if (AaP.AZF() == Constants.A0C) {
                str = AaP.AN8().A01;
            } else {
                str = null;
            }
            r12.A0G("channel_pk", AI0);
            r12.A0G("mezql_token", str2);
            r12.A0G("host_video_pk", str);
            C06270Ok A002 = AnonymousClass52V.A00(AnonymousClass52V.A00(AnonymousClass52V.A00(AnonymousClass52V.A00(AnonymousClass52V.A00((C06270Ok) null, "igtv_browse_session_id", str3), "igtv_destination_session_id", str4), "entry_point", str5), "surface", str6), "component_type", str7);
            if (A002 == null) {
                A002 = C06270Ok.A00();
            }
            A002.A05("was_live", Boolean.valueOf(z));
            if (A002 != null) {
                r12.A08("adhoc_data", A002);
            }
        }
    }
}
