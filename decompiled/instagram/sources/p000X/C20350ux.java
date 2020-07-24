package p000X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.pendingmedia.store.PendingMediaStoreSerializer;
import java.util.List;

/* renamed from: X.0ux  reason: invalid class name and case insensitive filesystem */
public final class C20350ux implements C19490tZ, C20360uy, C20370uz {
    public static final C05110Id A05 = new C20380v0();
    public final C92803zk A00;
    public final C92803zk A01;
    public final C92803zk A02;
    public final C65882uZ A03;
    public final AnonymousClass0C1 A04;

    public final /* bridge */ /* synthetic */ void A9J(C19410tR r8, C104664fb r9, C73233Ja r10) {
        C73233Ja r2 = r10;
        A00((C20330uv) r8, r2, r9.A00, r9, false, (String) null);
    }

    public final /* bridge */ /* synthetic */ void A9K(C19410tR r8, C104674fc r9, C73233Ja r10) {
        C73233Ja r2 = r10;
        A00((C20330uv) r8, r2, r9.A00, r9, true, r9.A01);
    }

    public final /* bridge */ /* synthetic */ void A9L(C19410tR r10, PendingMedia pendingMedia, C73233Ja r12) {
        int i;
        C20330uv r3 = (C20330uv) r10;
        String str = pendingMedia.A24;
        boolean A0x = pendingMedia.A0x();
        String str2 = pendingMedia.A27;
        C42291s7 r1 = pendingMedia.A0n;
        synchronized (r1) {
            i = r1.A00;
            r1.A00 = i + 1;
        }
        A00(r3, r12, str, new AnonymousClass43J(pendingMedia.A24, i, pendingMedia.A0g), A0x, str2);
    }

    private void A00(C19410tR r16, C73233Ja r17, String str, AnonymousClass43K r19, boolean z, String str2) {
        Object A022;
        C19410tR r6 = r16;
        List A06 = r6.A06();
        boolean z2 = true;
        if (A06.size() != 1) {
            z2 = false;
        }
        AnonymousClass0a4.A09(z2);
        String A052 = r6.A05();
        C104604fV r4 = new C104604fV(this, r19);
        AnonymousClass3LQ r0 = r6.A02;
        AnonymousClass0C1 r5 = this.A04;
        String str3 = r6.A03;
        boolean z3 = r0.A03;
        String str4 = r0.A01;
        boolean z4 = r0.A02;
        C15890nh r8 = new C15890nh(r5);
        r8.A09 = Constants.ONE;
        C99664Sn.A02(r8, (DirectThreadKey) A06.get(0), A052, str3, z3, str4, z4);
        r8.A09("upload_id", str);
        if (z) {
            r8.A0C = "direct_v2/threads/broadcast/configure_video/";
            if (!((Boolean) AnonymousClass0L6.A02(r5, AnonymousClass0L7.DIRECT_PERM_SEGMENTED, "stop_sending_video_result", false, (AnonymousClass04H) null)).booleanValue()) {
                String str5 = str2;
                AnonymousClass11J.A00(str5);
                r8.A09("video_result", str5);
            }
            A022 = AnonymousClass0L6.A02(r5, AnonymousClass0L7.EU_CONFIGURE_DISABLED_DIRECT_PERM, "enable_video", false, (AnonymousClass04H) null);
        } else {
            r8.A0C = "direct_v2/threads/broadcast/configure_photo/";
            r8.A0C("allow_full_aspect_ratio", true);
            A022 = AnonymousClass0L6.A02(r5, AnonymousClass0L7.EU_CONFIGURE_DISABLED_DIRECT_PERM, "enable_photo", false, (AnonymousClass04H) null);
        }
        if (((Boolean) A022).booleanValue()) {
            r8.A08("X-IG-EU-CONFIGURE-DISABLED", "true");
        }
        r8.A06(AnonymousClass3K3.class, false);
        C17850qu A032 = r8.A03();
        A032.A00 = new AnonymousClass4T2(this.A04, r17, r4);
        C12810hQ.A02(A032);
    }

    public final /* bridge */ /* synthetic */ boolean AiL(C17090pf r3) {
        C20330uv r32 = (C20330uv) r3;
        if (r32.A00.A04 != null || r32.A07() != null) {
            return AnonymousClass2n2.A00(this.A03, r32);
        }
        AnonymousClass0QD.A02("dmm_apply_updates", "Invalid mutation has neither pending media nor publisher information");
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r8.A07() != null) goto L_0x0011;
     */
    public final /* bridge */ /* synthetic */ void BfK(C17090pf r16, C06270Ok r17, C73233Ja r18) {
        boolean z;
        C20330uv r8 = (C20330uv) r16;
        if (r8.A00.A04 == null) {
            z = false;
        }
        z = true;
        AnonymousClass0a4.A0C(z, "ConfigureMedia mutation lacks primary key for underlying infra");
        C73233Ja r6 = r18;
        C06270Ok r2 = r17;
        if (r8.A00.A04 != null) {
            ((PendingMediaStoreSerializer) this.A01.get()).A03(new C102854cE((PendingMediaStore) this.A00.get(), r8.A00.A04, r6, this, r8, false));
        } else if (r8.A07() != null) {
            ((AnonymousClass14Q) this.A02.get()).A0N(new C100164Uo(r8.A07(), r6, r8.A00.A01, this, r8));
        } else {
            return;
        }
        AnonymousClass3LX.A0C(r2, Constants.A0C);
    }

    public C20350ux(AnonymousClass0C1 r1, C65882uZ r2, C92803zk r3, C92803zk r4, C92803zk r5) {
        this.A04 = r1;
        this.A03 = r2;
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = r5;
    }

    public final void A9O(C19410tR r1, PendingMedia pendingMedia, C73233Ja r3) {
    }
}
