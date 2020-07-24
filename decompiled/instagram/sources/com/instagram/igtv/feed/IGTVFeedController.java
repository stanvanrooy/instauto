package com.instagram.igtv.feed;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.facebook.C0003R;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass14J;
import p000X.AnonymousClass17M;
import p000X.AnonymousClass19r;
import p000X.AnonymousClass1LQ;
import p000X.AnonymousClass1LR;
import p000X.AnonymousClass1LS;
import p000X.AnonymousClass1LT;
import p000X.AnonymousClass1LU;
import p000X.AnonymousClass2J5;
import p000X.AnonymousClass2J7;
import p000X.AnonymousClass2MT;
import p000X.C019000b;
import p000X.C12810hQ;
import p000X.C16180oA;
import p000X.C175297eE;
import p000X.C32611bY;

public class IGTVFeedController implements AnonymousClass19r, AnonymousClass1LQ {
    public AnonymousClass1LS A00;
    public boolean A01;
    public final AnonymousClass1LR A02;
    public final AnonymousClass0C1 A03;
    public final Drawable A04;
    public final Drawable A05;
    public ImageView mEntryPointButton;
    public C32611bY mPendingMediaObserver;

    public final void Ar3(int i, int i2, Intent intent) {
    }

    public final void Ayk(View view) {
    }

    public final void Azd() {
    }

    public final void BE0() {
        this.A01 = false;
    }

    public final void BJx() {
        this.A01 = true;
        A00(this);
    }

    public final void BKp(Bundle bundle) {
    }

    public final void BP6() {
    }

    public final void BVv(Bundle bundle) {
    }

    public final void onStart() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00bd  */
    public static void A00(IGTVFeedController iGTVFeedController) {
        AnonymousClass1LS r2;
        int i;
        AnonymousClass1LS r1;
        String string;
        boolean z;
        if (iGTVFeedController.mEntryPointButton != null && iGTVFeedController.A01) {
            boolean A002 = C32611bY.A00(iGTVFeedController.A03, iGTVFeedController.A02.A00());
            boolean A012 = C32611bY.A01(iGTVFeedController.A03, iGTVFeedController.A02.A00());
            Drawable drawable = null;
            if (A002) {
                drawable = iGTVFeedController.A04;
                AnonymousClass1LS r22 = iGTVFeedController.A00;
                C019000b.A00(r22.A0B, C0003R.color.grey_9_20_transparent);
                r22.invalidateSelf();
                AnonymousClass1LS r23 = iGTVFeedController.A00;
                r23.A01 = C019000b.A00(r23.A0B, C0003R.color.white);
                r23.invalidateSelf();
                r2 = iGTVFeedController.A00;
                i = C0003R.color.grey_9_20_transparent;
            } else {
                if (A012) {
                    drawable = iGTVFeedController.A05;
                    AnonymousClass1LS r24 = iGTVFeedController.A00;
                    C019000b.A00(r24.A0B, C0003R.color.grey_9_20_transparent);
                    r24.invalidateSelf();
                    AnonymousClass1LS r25 = iGTVFeedController.A00;
                    r25.A01 = C019000b.A00(r25.A0B, C0003R.color.white);
                    r25.invalidateSelf();
                    r2 = iGTVFeedController.A00;
                    i = C0003R.color.igds_error_or_destructive;
                }
                r1 = iGTVFeedController.A00;
                if (drawable != r1.A05) {
                    r1.A05 = drawable;
                    r1.invalidateSelf();
                }
                string = C16180oA.A00(iGTVFeedController.A03).A00.getString("felix_last_received_newness_token", "felix_never_fetched");
                String string2 = C16180oA.A00(iGTVFeedController.A03).A00.getString("felix_last_viewer_seen_newness_token", (String) null);
                if (string != "felix_never_fetched") {
                    z = false;
                } else {
                    z = !AnonymousClass17M.A00(string, string2);
                }
                boolean z2 = true;
                if (!z) {
                    if (drawable == null) {
                        iGTVFeedController.A00.A00();
                    }
                    iGTVFeedController.mEntryPointButton.setActivated(true);
                    return;
                }
                ImageView imageView = iGTVFeedController.mEntryPointButton;
                if (drawable == null) {
                    z2 = false;
                }
                imageView.setActivated(z2);
                return;
            }
            r2.A02 = C019000b.A00(r2.A0B, i);
            r2.invalidateSelf();
            r1 = iGTVFeedController.A00;
            if (drawable != r1.A05) {
            }
            string = C16180oA.A00(iGTVFeedController.A03).A00.getString("felix_last_received_newness_token", "felix_never_fetched");
            String string22 = C16180oA.A00(iGTVFeedController.A03).A00.getString("felix_last_viewer_seen_newness_token", (String) null);
            if (string != "felix_never_fetched") {
            }
            boolean z22 = true;
            if (!z) {
            }
        }
    }

    public final void A01() {
        if (((Boolean) AnonymousClass0L6.A02(this.A03, AnonymousClass0L7.IGTV_HOME_ICON, "show_home_icon", false, (AnonymousClass04H) null)).booleanValue()) {
            C12810hQ.A03(AnonymousClass2J5.A00(AnonymousClass2J5.A01(this.A03), true, new AnonymousClass2J7(this), (String) null), 228, 2, false, false);
        }
    }

    public final void Azh() {
        C32611bY r0 = this.mPendingMediaObserver;
        if (r0 != null) {
            r0.A01.A03(AnonymousClass14J.class, r0.A00);
        }
        IGTVFeedControllerLifecycleUtil.cleanupReferences(this);
    }

    public final void BVf(View view, Bundle bundle) {
        C32611bY r2 = new C32611bY(this.A03, this, this.A02.A00());
        this.mPendingMediaObserver = r2;
        r2.A02();
    }

    public IGTVFeedController(Context context, AnonymousClass0C1 r14) {
        this.A03 = r14;
        this.A02 = new AnonymousClass1LR(r14);
        this.A00 = new AnonymousClass1LS(context, C0003R.C0004drawable.igtv_action_bar_icon, C0003R.C0004drawable.igtv_action_bar_icon, C0003R.color.igds_text_on_color, C0003R.color.igds_icon_badge, C0003R.color.igds_text_on_color);
        this.A04 = AnonymousClass1LT.A04(context, C0003R.C0004drawable.igtv_profile_badge_uploading, C0003R.color.grey_9);
        this.A05 = AnonymousClass1LT.A04(context, C0003R.C0004drawable.igtv_profile_badge_error, C0003R.color.igds_error_or_destructive);
        if (!AnonymousClass1LU.A00(context).exists()) {
            AnonymousClass1LU.A0A.schedule(new AnonymousClass2MT(459, new C175297eE(context, System.currentTimeMillis())));
        }
    }

    public final void AyU() {
        A01();
    }

    public final void B6t(boolean z, boolean z2) {
        A00(this);
    }
}
