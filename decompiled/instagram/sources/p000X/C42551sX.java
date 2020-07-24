package p000X;

import android.content.Context;
import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.pendingmedia.model.constants.ShareType;

/* renamed from: X.1sX  reason: invalid class name and case insensitive filesystem */
public final class C42551sX implements C23170zg {
    public final boolean Apg(AnonymousClass0C1 r2, PendingMedia pendingMedia) {
        return true;
    }

    public final AnonymousClass1C3 A6x(Context context, AnonymousClass0C1 r16, Object obj, long j, String str, String str2, String str3, boolean z, String str4, ShareType shareType, String str5) {
        C158806qE r2 = (C158806qE) obj;
        AnonymousClass0C1 r5 = r16;
        boolean z2 = z;
        C15890nh A00 = C160416ss.A00(C160566t8.A0B, r5, str, z2, str4, C05860Mt.A00(context));
        C160416ss.A08(r5, A00, C185537wE.A00(r2.A01), z2, j);
        C185727wa.A02(A00, shareType);
        PendingMedia pendingMedia = r2.A01;
        C185727wa.A04(r5, A00, pendingMedia.A0Z, C185727wa.A00(pendingMedia));
        C37171jE AGF = r2.A01.AGF();
        if (AGF != C37171jE.DEFAULT) {
            A00.A09("audience", AGF.A00);
        }
        AnonymousClass555.A01(r5, A00, AnonymousClass555.A00(r2.A01, (C23160zf) null), str3, str5);
        AnonymousClass5NO r0 = r2.A01.A0t;
        if (r0 != null) {
            A00.A0B("add_to_highlights", AnonymousClass5NO.A01(r0));
        }
        if (((Boolean) AnonymousClass0L6.A02(r5, AnonymousClass0L7.GEO_GATING, "is_enabled", false, (AnonymousClass04H) null)).booleanValue() && C16180oA.A00(r5).A0o("reel")) {
            C160416ss.A05(A00, new C160496t0(C16180oA.A00(r5).A06("reel")));
        }
        return A00.A04();
    }

    public final /* bridge */ /* synthetic */ Object A73(PendingMedia pendingMedia) {
        return new C158806qE(this, pendingMedia);
    }

    public final AnonymousClass1NJ BPV(AnonymousClass0C1 r6, PendingMedia pendingMedia, C28691Ms r8, Context context) {
        AnonymousClass1NJ r4 = ((C158786qC) r8).A00;
        C16270oK.A00.A04(r6, context, r4);
        if (((Boolean) AnonymousClass0L6.A03(r6, AnonymousClass0L7.XPOSTING_UPSELL_DIRECTLY_AFTER_SHARING_TO_STORY, "enabled", false, (AnonymousClass04H) null)).booleanValue() || ((Boolean) AnonymousClass0L6.A03(r6, AnonymousClass0L7.EXPANDED_XPOSTING_UPSELL_DIRECTLY_AFTER_SHARING_STORY, "enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            C76833Xm A00 = C76833Xm.A00(r6);
            String str = pendingMedia.A1h;
            synchronized (A00) {
                if (!(str == null || r4 == null)) {
                    if (A00.A05.get()) {
                        A00.A05.set(false);
                        if (A00.A02.equals(str)) {
                            C76833Xm.A01(A00, r4, A00.A00, A00.A03);
                        } else {
                            A00.A02 = str;
                            A00.A01 = r4;
                        }
                    }
                }
            }
        }
        return r4;
    }

    public final C28691Ms BWq(AnonymousClass0C1 r2, C33861dc r3) {
        return (C28691Ms) new C158766qA(this, r2).then(r3);
    }

    public final void BXX(AnonymousClass0C1 r3, PendingMedia pendingMedia, C155546ka r5) {
        r5.A01(pendingMedia, pendingMedia.A0d, false);
        C23300zv.A00(r3).BXT(new C31091Wk(pendingMedia));
        r5.A00(pendingMedia);
    }
}
