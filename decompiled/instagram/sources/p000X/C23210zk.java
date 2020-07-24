package p000X;

import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectVisualMessageTarget;

/* renamed from: X.0zk  reason: invalid class name and case insensitive filesystem */
public final class C23210zk implements C17120pi {
    public final /* synthetic */ C23090zX A00;

    public C23210zk(C23090zX r1) {
        this.A00 = r1;
    }

    public final void BfU(C13460iZ r3, Object obj) {
        C106684iu r4 = (C106684iu) obj;
        r3.A0T();
        if (r4.A01 != null) {
            r3.A0d("direct_expiring_media_target");
            AnonymousClass4UK.A00(r3, r4.A01);
        }
        String str = r4.A02;
        if (str != null) {
            r3.A0H("client_context", str);
        }
        r3.A0I("is_configured_in_server", r4.A05);
        r3.A0F("sub_share_id", r4.A00);
        if (r4.A04 != null) {
            r3.A0d("direct_visual_message_targets");
            r3.A0S();
            for (DirectVisualMessageTarget directVisualMessageTarget : r4.A04) {
                if (directVisualMessageTarget != null) {
                    AnonymousClass4UK.A00(r3, directVisualMessageTarget);
                }
            }
            r3.A0P();
        }
        if (r4.A03 != null) {
            r3.A0d("direct_share_targets");
            r3.A0S();
            for (DirectShareTarget directShareTarget : r4.A03) {
                if (directShareTarget != null) {
                    AnonymousClass4UI.A00(r3, directShareTarget);
                }
            }
            r3.A0P();
        }
        r3.A0Q();
    }

    public final Object BWo(C13080hr r2) {
        return AnonymousClass4UP.parseFromJson(r2);
    }
}
