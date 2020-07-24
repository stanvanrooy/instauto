package p000X;

import com.instagram.direct.model.DirectAREffectShare;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.0ub  reason: invalid class name and case insensitive filesystem */
public final class C20130ub extends C19410tR implements C19460tW {
    public static final C17120pi A02 = new C20140uc();
    public DirectAREffectShare A00;
    public DirectForwardingParams A01;

    public final String A01() {
        return "send_ar_effect_share_message";
    }

    public final C58022fB A03() {
        return C58022fB.AR_EFFECT;
    }

    public final /* bridge */ /* synthetic */ Object A04() {
        return this.A00;
    }

    public final DirectForwardingParams AM6() {
        return this.A01;
    }

    public C20130ub() {
    }

    public C20130ub(AnonymousClass3LQ r7, DirectThreadKey directThreadKey, DirectAREffectShare directAREffectShare, Long l, long j, DirectForwardingParams directForwardingParams) {
        super(r7, directThreadKey, l, j);
        this.A00 = directAREffectShare;
        this.A01 = directForwardingParams;
    }
}
