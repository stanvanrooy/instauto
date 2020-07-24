package p000X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediatype.MediaType;
import java.io.File;
import java.util.List;

/* renamed from: X.0tv  reason: invalid class name and case insensitive filesystem */
public final class C19710tv implements C19490tZ {
    public static final C05110Id A02 = new C19720tw();
    public final C65882uZ A00;
    public final AnonymousClass0C1 A01;

    public final /* bridge */ /* synthetic */ boolean AiL(C17090pf r2) {
        return AnonymousClass2n2.A00(this.A00, (C19690tt) r2);
    }

    public final /* bridge */ /* synthetic */ void BfK(C17090pf r19, C06270Ok r20, C73233Ja r21) {
        String str;
        C19690tt r4 = (C19690tt) r19;
        List A06 = r4.A06();
        boolean z = true;
        if (A06.size() != 1) {
            z = false;
        }
        AnonymousClass0a4.A09(z);
        AnonymousClass4SA r3 = r4.A00;
        if (r3.A02 == MediaType.VIDEO) {
            str = r3.A08;
        } else {
            str = r3.A05;
        }
        C73233Ja r2 = r21;
        if (!new File(str).exists()) {
            r2.BCO(AnonymousClass4R2.A08);
            return;
        }
        DirectThreadKey directThreadKey = (DirectThreadKey) A06.get(0);
        C58022fB A03 = r4.A03();
        String A05 = r4.A05();
        AnonymousClass3LQ r0 = r4.A02;
        boolean z2 = r0.A03;
        AnonymousClass0C1 r7 = this.A01;
        AnonymousClass4SA r42 = r4.A00;
        boolean z3 = r0.A02;
        MediaType mediaType = r42.A02;
        MediaType mediaType2 = MediaType.PHOTO;
        boolean z4 = false;
        if (mediaType == mediaType2) {
            z4 = true;
        }
        AnonymousClass11J.A02(z4);
        C15890nh r8 = new C15890nh(r7);
        r8.A09 = Constants.ONE;
        r8.A0C = C99664Sn.A01(C58022fB.MEDIA, mediaType2, false);
        r8.A06(AnonymousClass3K3.class, false);
        C99664Sn.A02(r8, directThreadKey, A05, (String) null, z2, (String) null, z3);
        r8.A07("photo", new File(r42.A05));
        C17850qu A032 = r8.A03();
        A032.A00 = new AnonymousClass4T1(this, this.A01, directThreadKey, A03, A05, r2);
        C12810hQ.A02(A032);
        AnonymousClass3LX.A0C(r20, Constants.ZERO);
    }

    public C19710tv(AnonymousClass0C1 r1, C65882uZ r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
