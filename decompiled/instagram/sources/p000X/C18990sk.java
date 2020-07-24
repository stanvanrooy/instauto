package p000X;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.instagram.arlink.fragment.ArLinkScanControllerImpl;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;

/* renamed from: X.0sk  reason: invalid class name and case insensitive filesystem */
public final class C18990sk extends C19000sl {
    public C128615ey A00;
    public BEb A01;

    public final ArLinkScanControllerImpl A00(C27341Hl r2, AnonymousClass0C1 r3, C85533nX r4) {
        return new ArLinkScanControllerImpl(r2, r3, r4);
    }

    public final C128615ey A01() {
        if (this.A00 == null) {
            this.A00 = new C128615ey();
        }
        return this.A00;
    }

    public final BEb A02() {
        if (this.A01 == null) {
            this.A01 = new BEb();
        }
        return this.A01;
    }

    public final C177517i6 A03(Activity activity, ViewGroup viewGroup, AnonymousClass0C1 r11, C85543nY r12, String str, boolean z, String str2) {
        C177857ij r5 = new C177857ij(r11, str);
        return C22160xw.A00.A00(activity, viewGroup, r11, r12, r5, z, str2);
    }

    public final void A05(Context context, AnonymousClass0C1 r5, C77383Zp r6) {
        AnonymousClass0P4 A002 = C77393Zq.A00(Constants.ZERO);
        A002.A0G("origin", r6.A00);
        A002.A0A("has_camera_permission", Boolean.valueOf(C35251g3.A07(context, "android.permission.CAMERA")));
        A002.A0A("has_storage_permission", Boolean.valueOf(C35251g3.A07(context, "android.permission.READ_EXTERNAL_STORAGE")));
        AnonymousClass0WN.A01(r5).BcG(A002);
    }

    public final void A06(AnonymousClass0C1 r2) {
        C77393Zq.A02(Constants.A0K, r2);
    }

    public final void A07(AnonymousClass0C1 r2) {
        C77393Zq.A02(Constants.A0V, r2);
        C13920jT.A00("instagram_nametag").A08();
    }

    public final void A08(AnonymousClass0C1 r4, int i) {
        AnonymousClass0P4 A002 = C77393Zq.A00(Constants.A0L);
        A002.A0E("fail_count", Integer.valueOf(i));
        AnonymousClass0WN.A01(r4).BcG(A002);
    }

    public final void A04(Context context, AnonymousClass0C1 r4) {
        C483127m.A00(r4).BpH(context, "app_startup");
    }

    public final void A09(AnonymousClass0C1 r5, C13300iJ r6) {
        AnonymousClass0RU A012 = AnonymousClass0WN.A01(r5);
        AnonymousClass0P4 A013 = C77393Zq.A01(Constants.A0M, r6.getId(), r6.AZn());
        A013.A0G("origin", "qr");
        A012.BcG(A013);
    }

    public final void A0A(AnonymousClass0C1 r6, C13300iJ r7) {
        AnonymousClass0RU A012 = AnonymousClass0WN.A01(r6);
        AnonymousClass0P4 A002 = C77393Zq.A00(Constants.A0G);
        A002.A0A("from_camera", false);
        A002.A0E("confidence_score", 1);
        A002.A0G("username", r7.AZn());
        A002.A0G(MemoryDumpUploadJob.EXTRA_USER_ID, r7.getId());
        A002.A0A("self_scan", Boolean.valueOf(C14090jk.A05(r6, r7)));
        A002.A0A("qr", true);
        A012.BcG(A002);
    }
}
