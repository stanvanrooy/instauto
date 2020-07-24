package p000X;

import android.content.Context;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.pendingmedia.model.constants.ShareType;

/* renamed from: X.1sW  reason: invalid class name and case insensitive filesystem */
public final class C42541sW implements C23170zg {
    public final boolean Apg(AnonymousClass0C1 r2, PendingMedia pendingMedia) {
        return true;
    }

    public final AnonymousClass1C3 A6x(Context context, AnonymousClass0C1 r8, Object obj, long j, String str, String str2, String str3, boolean z, String str4, ShareType shareType, String str5) {
        boolean z2 = false;
        if (shareType == ShareType.NAMETAG_SELFIE) {
            z2 = true;
        }
        AnonymousClass0a4.A0A(z2);
        AnonymousClass0C1 r1 = r8;
        C15890nh A00 = C160416ss.A00(C160566t8.NAMETAG, r1, str, z, str4, C05860Mt.A00(context));
        A00.A09("upload_id", str);
        return A00.A04();
    }

    public final AnonymousClass1NJ BPV(AnonymousClass0C1 r6, PendingMedia pendingMedia, C28691Ms r8, Context context) {
        AnonymousClass1NJ r4 = ((C158786qC) r8).A00;
        C13300iJ A02 = C13510ie.A00(r6).A02(r4.A0c(r6).getId());
        if (A02 != null) {
            C13260iE r2 = A02.A0O;
            if (r2 == null) {
                r2 = new C13260iE();
            }
            ExtendedImageUrl A0S = r4.A0S(context);
            r2.A05 = A0S.AZc();
            A02.A0O = r2;
            C13510ie.A00(r6).A03(A02);
            AnonymousClass12C.A0c.A0G(A0S);
        }
        return r4;
    }

    public final C28691Ms BWq(AnonymousClass0C1 r2, C33861dc r3) {
        return (C28691Ms) new C158746q8(this, r2).then(r3);
    }

    public final void BXX(AnonymousClass0C1 r3, PendingMedia pendingMedia, C155546ka r5) {
        r5.A01(pendingMedia, pendingMedia.A0d, true);
        r5.A00(pendingMedia);
    }

    public final Object A73(PendingMedia pendingMedia) {
        return null;
    }
}
