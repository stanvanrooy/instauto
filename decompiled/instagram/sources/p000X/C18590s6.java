package p000X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.facebook.C0003R;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.modal.ModalActivity;
import com.instagram.pendingmedia.model.PendingMedia;

/* renamed from: X.0s6  reason: invalid class name and case insensitive filesystem */
public final class C18590s6 extends C18600s7 {
    public C148706Xq A00;
    public C155846l5 A01;

    public final C148706Xq A00() {
        if (this.A00 == null) {
            this.A00 = new C148706Xq();
        }
        return this.A00;
    }

    public final C184477uU A01(AnonymousClass0C1 r2, String str) {
        return new C184477uU(r2, str);
    }

    public final AnonymousClass395 A02(Context context, AnonymousClass0C1 r3, C13300iJ r4) {
        return new C159936s6(context, r3, r4);
    }

    public final void A03(Context context, PendingMedia pendingMedia) {
        C155846l5 r2 = this.A01;
        if (r2 != null) {
            C11130eT.A01.BXT(new C33471cy(r2));
            this.A01 = null;
        }
    }

    public final void A04(Context context, AnonymousClass0C1 r5, PendingMedia pendingMedia) {
        if (this.A01 == null) {
            C155826l3 r0 = new C155826l3(context, r5, pendingMedia);
            pendingMedia.A0X(r0);
            C155866l7 r2 = new C155866l7(r0);
            r2.A00 = context.getResources().getDimensionPixelOffset(C0003R.dimen.tab_bar_height);
            AnonymousClass0a4.A06(r2.A01);
            this.A01 = new C155846l5(r2);
        }
        C11130eT.A01.BXT(new C33461cx(this.A01));
    }

    public final void A05(AnonymousClass0C1 r9, Activity activity, AnonymousClass1HD r11, AnonymousClass1NJ r12, String str) {
        C68172yZ r2 = new C68172yZ(activity);
        r2.A00(activity.getString(C0003R.string.loading));
        AnonymousClass2MT A002 = AnonymousClass6X8.A00(activity, r12, "ClipsReshareToStoryHelper", false);
        A002.A00 = new AnonymousClass4K8(r2, activity, r9, r11, r12, str);
        C12810hQ.A02(A002);
    }

    public final void A06(AnonymousClass0C1 r10, Activity activity, ClipsViewerConfig clipsViewerConfig, AnonymousClass0RN r13) {
        C930940w r2 = new C930940w(r10, activity);
        Bundle bundle = new Bundle();
        bundle.putBoolean("ClipsViewerLauncher.KEY_OPENED_VIEWER_FROM_LAUNCHER", true);
        bundle.putParcelable("ClipsViewerLauncher.KEY_CONFIG", clipsViewerConfig);
        C59032gv r3 = new C59032gv(r2.A01, ModalActivity.class, "clips_feed_viewer", bundle, r2.A00);
        r3.A0A = ModalActivity.A05;
        r3.A06(r2.A00);
    }

    public C18590s6() {
        C17870qw.A0G.add(new C18610s8());
    }
}
