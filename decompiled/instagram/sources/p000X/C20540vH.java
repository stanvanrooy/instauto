package p000X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.pendingmedia.store.PendingMediaStoreSerializer;

/* renamed from: X.0vH  reason: invalid class name and case insensitive filesystem */
public final class C20540vH implements C19490tZ, C20360uy {
    public static final C05110Id A04 = new C20550vI();
    public final C92803zk A00;
    public final C92803zk A01;
    public final C65882uZ A02;
    public final AnonymousClass0C1 A03;

    public final /* bridge */ /* synthetic */ void BfK(C17090pf r10, C06270Ok r11, C73233Ja r12) {
        C20520vF r7 = (C20520vF) r10;
        ((PendingMediaStoreSerializer) this.A01.get()).A03(new C102854cE((PendingMediaStore) this.A00.get(), r7.A00.A04, r12, this, r7, false));
        AnonymousClass3LX.A0C(r11, Constants.A0C);
    }

    public final /* bridge */ /* synthetic */ void A9L(C19410tR r12, PendingMedia pendingMedia, C73233Ja r14) {
        C20520vF r122 = (C20520vF) r12;
        String str = pendingMedia.A24;
        AnonymousClass0C1 r3 = this.A03;
        DirectThreadKey directThreadKey = (DirectThreadKey) r122.A06().get(0);
        String A05 = r122.A05();
        String str2 = r122.A03;
        AnonymousClass3LQ r0 = r122.A02;
        boolean z = r0.A03;
        boolean z2 = r0.A02;
        C15890nh r4 = new C15890nh(r3);
        r4.A09 = Constants.ONE;
        r4.A0C = "direct_v2/threads/broadcast/share_selfie_sticker/";
        r4.A09("thread_id", directThreadKey.A00);
        r4.A09("upload_id", str);
        r4.A09("client_context", A05);
        r4.A09("mutation_token", str2);
        r4.A06(AnonymousClass1N4.class, false);
        C99664Sn.A02(r4, directThreadKey, A05, str2, z, (String) null, z2);
        C17850qu A032 = r4.A03();
        A032.A00 = AnonymousClass4T7.A00(this.A03, r14);
        C12810hQ.A02(A032);
    }

    public final /* bridge */ /* synthetic */ boolean AiL(C17090pf r2) {
        return AnonymousClass2n2.A00(this.A02, (C20520vF) r2);
    }

    public C20540vH(AnonymousClass0C1 r2, C92803zk r3, C92803zk r4) {
        this.A03 = r2;
        this.A02 = C19290tE.A00(r2);
        this.A00 = r3;
        this.A01 = r4;
    }

    public final void A9O(C19410tR r1, PendingMedia pendingMedia, C73233Ja r3) {
    }
}
