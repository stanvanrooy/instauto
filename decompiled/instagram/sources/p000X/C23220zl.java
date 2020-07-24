package p000X;

import com.instagram.pendingmedia.model.constants.ShareType;

/* renamed from: X.0zl  reason: invalid class name and case insensitive filesystem */
public final class C23220zl implements C17120pi {
    public final /* synthetic */ C23090zX A00;

    public C23220zl(C23090zX r1) {
        this.A00 = r1;
    }

    public final void BfU(C13460iZ r3, Object obj) {
        C51222Jr r4 = (C51222Jr) obj;
        r3.A0T();
        String str = r4.A04;
        if (str != null) {
            r3.A0H("user_story_target", str);
        }
        if (r4.A02 != null) {
            r3.A0d("user_story_target_holder");
            AnonymousClass2LO.A00(r3, r4.A02);
        }
        r3.A0I("is_configured_in_server", r4.A05);
        r3.A0F("sub_share_id", r4.A00);
        C37171jE r0 = r4.A01;
        if (r0 != null) {
            r3.A0H("media_audience", r0.A00);
        }
        ShareType shareType = r4.A03;
        if (shareType != null) {
            r3.A0H("share_type", shareType.toString());
        }
        r3.A0Q();
    }

    public final Object BWo(C13080hr r2) {
        return AnonymousClass2LN.parseFromJson(r2);
    }
}
