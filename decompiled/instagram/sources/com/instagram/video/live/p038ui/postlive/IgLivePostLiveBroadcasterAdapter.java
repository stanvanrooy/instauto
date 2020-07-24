package com.instagram.video.live.p038ui.postlive;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.C0003R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.List;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass2MG;
import p000X.AnonymousClass2MJ;
import p000X.AnonymousClass75Z;
import p000X.AnonymousClass9m5;
import p000X.AnonymousClass9m6;
import p000X.C019000b;
import p000X.C13150hy;
import p000X.C13300iJ;
import p000X.C1657174s;
import p000X.C1658075b;
import p000X.C2102995b;
import p000X.C218509bV;
import p000X.C224609lj;
import p000X.C224659lp;
import p000X.C224689ls;
import p000X.C224699lt;
import p000X.C224709lu;
import p000X.C224719lv;
import p000X.C224729lw;
import p000X.C224789m2;
import p000X.C224809m7;
import p000X.C224859mC;
import p000X.C224879mE;
import p000X.C224889mF;
import p000X.C224899mG;
import p000X.C224909mH;
import p000X.C224919mI;
import p000X.C224939mK;
import p000X.C68832zy;

/* renamed from: com.instagram.video.live.ui.postlive.IgLivePostLiveBroadcasterAdapter */
public class IgLivePostLiveBroadcasterAdapter implements C2102995b {
    public static final C218509bV A0C = new C218509bV("KEY_VIEWER_LIST_DIVIDER");
    public int A00 = 0;
    public C224699lt A01;
    public List A02 = new ArrayList();
    public boolean A03 = false;
    public C224729lw A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Context A08;
    public final AnonymousClass2MG A09;
    public final AnonymousClass0C1 A0A;
    public final boolean A0B;
    public C224919mI mDelegate;
    public C68832zy mViewModels;

    public final int AW5() {
        return 0;
    }

    public static C68832zy A00(IgLivePostLiveBroadcasterAdapter igLivePostLiveBroadcasterAdapter) {
        String quantityString;
        String str;
        C68832zy r5 = new C68832zy();
        C224729lw r0 = igLivePostLiveBroadcasterAdapter.A04;
        if (r0 != null) {
            r5.A01(new C224709lu(r0.A00, r0.A01, r0.A02));
        }
        C224699lt r02 = igLivePostLiveBroadcasterAdapter.A01;
        if (!(r02 == null || (str = r02.A00) == null)) {
            String str2 = r02.A01;
            String str3 = str2;
            if (str2 != null) {
                C13300iJ r6 = igLivePostLiveBroadcasterAdapter.A0A.A06;
                Context context = igLivePostLiveBroadcasterAdapter.A08;
                int parseInt = Integer.parseInt(str3);
                C13150hy.A02(context, "context");
                C13150hy.A02(str, "amount");
                String string = context.getString(C0003R.string.post_live_broadcaster_user_pay_summary_info, new Object[]{str, Integer.valueOf(parseInt)});
                C13150hy.A01(string, "context.getString(\n     …fo, amount, numSupporter)");
                r5.A01(new C1658075b(r6, string));
            }
        }
        if (!igLivePostLiveBroadcasterAdapter.A02.isEmpty()) {
            ImageUrl imageUrl = null;
            String str4 = "";
            ImageUrl imageUrl2 = null;
            String str5 = str4;
            for (int i = 0; i < Math.min(igLivePostLiveBroadcasterAdapter.A02.size(), 2); i++) {
                if (i == 0) {
                    str4 = ((C13300iJ) igLivePostLiveBroadcasterAdapter.A02.get(i)).AZn();
                    imageUrl = ((C13300iJ) igLivePostLiveBroadcasterAdapter.A02.get(i)).ASv();
                } else if (i == 1) {
                    str5 = ((C13300iJ) igLivePostLiveBroadcasterAdapter.A02.get(i)).AZn();
                    imageUrl2 = ((C13300iJ) igLivePostLiveBroadcasterAdapter.A02.get(i)).ASv();
                }
            }
            if (igLivePostLiveBroadcasterAdapter.A00 != 2 || imageUrl2 == null) {
                Resources resources = igLivePostLiveBroadcasterAdapter.A08.getResources();
                int i2 = igLivePostLiveBroadcasterAdapter.A00;
                quantityString = resources.getQuantityString(C0003R.plurals.post_live_viewer_count_1, i2, new Object[]{str4, str5, Integer.valueOf(i2 - 2)});
            } else {
                quantityString = igLivePostLiveBroadcasterAdapter.A08.getString(C0003R.string.post_live_viewer_count_two_usernames, new Object[]{str4, str5});
            }
            r5.A01(new AnonymousClass9m6(quantityString, igLivePostLiveBroadcasterAdapter.A08.getResources().getQuantityString(C0003R.plurals.post_live_viewer_count_2, igLivePostLiveBroadcasterAdapter.A00), imageUrl, imageUrl2));
        }
        if (!(igLivePostLiveBroadcasterAdapter.A04 == null && igLivePostLiveBroadcasterAdapter.A01 == null && igLivePostLiveBroadcasterAdapter.A02.isEmpty())) {
            r5.A01(A0C);
        }
        if (!igLivePostLiveBroadcasterAdapter.A06) {
            r5.A01(new AnonymousClass9m5(igLivePostLiveBroadcasterAdapter.A08.getString(C0003R.string.post_live_to_igtv), C019000b.A03(igLivePostLiveBroadcasterAdapter.A08, C0003R.C0004drawable.instagram_igtv_outline_24), new C224879mE(igLivePostLiveBroadcasterAdapter), true));
        }
        if (!igLivePostLiveBroadcasterAdapter.A06 && !igLivePostLiveBroadcasterAdapter.A05) {
            r5.A01(new AnonymousClass9m5(igLivePostLiveBroadcasterAdapter.A08.getString(C0003R.string.post_live_download_video), C019000b.A03(igLivePostLiveBroadcasterAdapter.A08, C0003R.C0004drawable.instagram_download_outline_24), new C224859mC(igLivePostLiveBroadcasterAdapter), igLivePostLiveBroadcasterAdapter.A03));
        }
        r5.A01(new AnonymousClass9m5(igLivePostLiveBroadcasterAdapter.A08.getString(C0003R.string.post_live_delete_video), C019000b.A03(igLivePostLiveBroadcasterAdapter.A08, C0003R.C0004drawable.instagram_delete_outline_24), new C224889mF(igLivePostLiveBroadcasterAdapter), true));
        if (igLivePostLiveBroadcasterAdapter.A07) {
            r5.A01(new AnonymousClass9m5(igLivePostLiveBroadcasterAdapter.A08.getString(C0003R.string.post_live_get_support), C019000b.A03(igLivePostLiveBroadcasterAdapter.A08, C0003R.C0004drawable.instagram_heart_outline_24), new C224899mG(igLivePostLiveBroadcasterAdapter), true));
        }
        if (igLivePostLiveBroadcasterAdapter.A0B) {
            r5.A01(A0C);
            r5.A01(new C224939mK(igLivePostLiveBroadcasterAdapter.A08.getString(C0003R.string.post_live_simulcast_to_fb_text)));
        }
        return r5;
    }

    public IgLivePostLiveBroadcasterAdapter(AnonymousClass0C1 r5, Context context, C224919mI r7, boolean z, boolean z2, boolean z3, boolean z4, C224729lw r12) {
        this.A0A = r5;
        this.A08 = context;
        AnonymousClass2MJ A002 = AnonymousClass2MG.A00(context);
        A002.A01(new C224789m2(this.A08, this.A0A));
        A002.A01(new C224809m7(this.A08));
        A002.A01(new C224719lv(this.A08));
        A002.A01(new AnonymousClass75Z(this.A08));
        A002.A01(new C224689ls());
        A002.A01(new C224609lj());
        A002.A01(new C224659lp(this.A08, (C224909mH) null));
        A002.A01(new C1657174s(this.A08));
        A002.A01 = true;
        this.A09 = A002.A00();
        this.mDelegate = r7;
        this.A0B = z;
        this.A06 = z2;
        this.A05 = z3;
        this.A07 = z4;
        this.A04 = r12;
        C68832zy A003 = A00(this);
        this.mViewModels = A003;
        this.A09.A06(A003);
    }

    public final AnonymousClass2MG ATh() {
        return this.A09;
    }
}
