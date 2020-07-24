package com.instagram.feed.tooltip;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.facebook.C0003R;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass19r;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass1RC;
import p000X.AnonymousClass1RD;
import p000X.C14090jk;
import p000X.C16180oA;
import p000X.C255119b;
import p000X.C27591Il;
import p000X.C32401bA;
import p000X.C36371hw;
import p000X.C36421i1;
import p000X.C36461i5;
import p000X.C54252Wm;

public class HideLikeCountAuthorTooltipManager extends C27591Il implements AnonymousClass19r, AnonymousClass1RC {
    public final AnonymousClass0C1 A00;
    public final AnonymousClass1RD A01;
    public final String A02 = this.mContext.getResources().getString(C0003R.string.hide_like_count_author_tooltip_nux);
    public Context mContext;

    public final void Ar3(int i, int i2, Intent intent) {
    }

    public final void AyU() {
    }

    public final void Ayk(View view) {
    }

    public final void Azd() {
    }

    public final void BE0() {
    }

    public final void BJx() {
    }

    public final void BKp(Bundle bundle) {
    }

    public final void BP6() {
    }

    public final void BVf(View view, Bundle bundle) {
    }

    public final void BVv(Bundle bundle) {
    }

    public final boolean BnA() {
        return false;
    }

    public final void onStart() {
    }

    public final void BRx() {
        C16180oA A002 = C16180oA.A00(this.A00);
        A002.A00.edit().putInt("hide_like_count_author_tooltip_nux_seen_count", A002.A00.getInt("hide_like_count_author_tooltip_nux_seen_count", 0) + 1).apply();
        A002.A00.edit().putLong("hide_like_count_author_tooltip_nux_last_shown_time_sec", TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())).apply();
    }

    public final boolean BnS() {
        if (!C16180oA.A00(this.A00).A00.getBoolean("has_seen_daisy_header", false)) {
            boolean z = false;
            if (C16180oA.A00(this.A00).A00.getInt("hide_like_count_author_tooltip_nux_seen_count", 0) < 3) {
                z = true;
            }
            if (z) {
                boolean z2 = true;
                if (C16180oA.A00(this.A00).A00.getInt("hide_like_count_author_tooltip_nux_seen_count", 0) != 0) {
                    if (TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - C16180oA.A00(this.A00).A00.getLong("hide_like_count_author_tooltip_nux_last_shown_time_sec", 0) <= 43200) {
                        z2 = false;
                    }
                }
                if (!z2) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public HideLikeCountAuthorTooltipManager(AnonymousClass0C1 r3, Activity activity) {
        this.A00 = r3;
        this.mContext = activity;
        this.A01 = new AnonymousClass1RD(activity, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0055, code lost:
        if (r1 != false) goto L_0x0057;
     */
    public final void A08(C255119b r13, int i) {
        int i2;
        boolean z;
        List list;
        int A03 = AnonymousClass0Z0.A03(233860505);
        if (i != 0 || !BnS()) {
            i2 = -1491774590;
        } else {
            C255119b r7 = r13;
            int ALs = r13.ALs();
            int AOh = r13.AOh();
            while (true) {
                if (ALs > AOh) {
                    break;
                }
                boolean z2 = false;
                if (C36371hw.A06(r13, ALs) == C36421i1.MEDIA_FEEDBACK) {
                    z2 = true;
                }
                if (z2) {
                    C32401bA r4 = (C32401bA) r13.AI4(ALs).getTag();
                    AnonymousClass1NJ r3 = r4.A0E;
                    if (r3 != null && C14090jk.A03(this.A00, r3) && C36461i5.A00(this.A00).A02(r3.A0N()) && (list = r3.A2Y) != null) {
                        boolean isEmpty = list.isEmpty();
                        z = true;
                    }
                    z = false;
                    if (z) {
                        C54252Wm.A00(r4.A00(), r7, this.A01, this.A02, 500);
                        break;
                    }
                }
                ALs++;
            }
            i2 = -529706833;
        }
        AnonymousClass0Z0.A0A(i2, A03);
    }

    public final void Azh() {
        HideLikeCountAuthorTooltipManagerLifecycleUtil.cleanupReferences(this);
    }
}
