package p000X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.pendingmedia.store.PendingMediaStoreSerializer;
import java.util.List;

/* renamed from: X.0vD  reason: invalid class name and case insensitive filesystem */
public final class C20500vD implements C19490tZ, C20360uy {
    public static final C05110Id A02 = new C20510vE();
    public final C65882uZ A00;
    public final AnonymousClass0C1 A01;

    public final /* bridge */ /* synthetic */ void BfK(C17090pf r10, C06270Ok r11, C73233Ja r12) {
        C20480vB r7 = (C20480vB) r10;
        PendingMediaStoreSerializer.A00(this.A01).A03(new C102854cE(PendingMediaStore.A01(this.A01), r7.A00.A07, r12, this, r7, false));
        AnonymousClass3LX.A0C(r11, Constants.A0C);
    }

    public final /* bridge */ /* synthetic */ void A9L(C19410tR r14, PendingMedia pendingMedia, C73233Ja r16) {
        Integer num;
        C20480vB r142 = (C20480vB) r14;
        List A06 = r142.A06();
        boolean z = true;
        if (A06.size() != 1) {
            z = false;
        }
        AnonymousClass0a4.A09(z);
        DirectThreadKey directThreadKey = (DirectThreadKey) A06.get(0);
        String A05 = r142.A05();
        C55412ab r1 = r142.A00;
        AnonymousClass3LQ r0 = r142.A02;
        AnonymousClass0C1 r5 = this.A01;
        String str = r142.A03;
        boolean z2 = r0.A03;
        String str2 = r0.A01;
        boolean z3 = r0.A02;
        String str3 = pendingMedia.A24;
        List A022 = r1.A02();
        AnonymousClass0a4.A06(A022);
        AnonymousClass1NJ r02 = r1.A02;
        if (r02 != null) {
            C54452Xj r03 = r02.A0J;
            AnonymousClass11J.A00(r03);
            num = Integer.valueOf(1000 / r03.A00);
        } else {
            num = r1.A05;
        }
        AnonymousClass0a4.A06(num);
        C15890nh r6 = new C15890nh(r5);
        r6.A09 = Constants.ONE;
        r6.A0C = "direct_v2/threads/broadcast/share_voice/";
        r6.A06(AnonymousClass1N4.class, false);
        C99664Sn.A02(r6, directThreadKey, A05, str, z2, str2, z3);
        r6.A09("upload_id", str3);
        r6.A09("waveform", AnonymousClass000.A0J("[", C36681iR.A00(',').A03(A022), "]"));
        r6.A09("waveform_sampling_frequency_hz", String.valueOf(num));
        C17850qu A03 = r6.A03();
        A03.A00 = AnonymousClass4T7.A00(this.A01, r16);
        C12810hQ.A02(A03);
    }

    public final /* bridge */ /* synthetic */ boolean AiL(C17090pf r2) {
        return AnonymousClass2n2.A00(this.A00, (C20480vB) r2);
    }

    public C20500vD(AnonymousClass0C1 r2) {
        this.A01 = r2;
        this.A00 = C19290tE.A00(r2);
    }

    public final void A9O(C19410tR r1, PendingMedia pendingMedia, C73233Ja r3) {
    }
}
