package p000X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.gallery.Medium;
import com.instagram.igtv.feed.IGTVFeedController;
import com.instagram.reels.fragment.ReelMoreOptionsFragment;

/* renamed from: X.0qa  reason: invalid class name and case insensitive filesystem */
public final class C17650qa extends C17660qb {
    public final C17670qc A00 = new C17670qc();
    public final C17680qd A01 = new C17680qd();

    public final int A00(AnonymousClass0C1 r5) {
        return ((Integer) AnonymousClass0L6.A02(r5, AnonymousClass0L7.FELIX_VIDEO_UPLOAD_LENGTH, "max_duration_ms", 900000, (AnonymousClass04H) null)).intValue();
    }

    public final int A01(AnonymousClass0C1 r5) {
        return ((Integer) AnonymousClass0L6.A02(r5, AnonymousClass0L7.FELIX_VIDEO_UPLOAD_LENGTH, "min_duration_ms", 60000, (AnonymousClass04H) null)).intValue();
    }

    public final C17690qe A02() {
        return this.A01;
    }

    public final C17690qe A03(AnonymousClass0C1 r3) {
        return (AnonymousClass13P) r3.AVA(AnonymousClass13P.class, new AnonymousClass13Q());
    }

    public final IGTVFeedController A04(Context context, AnonymousClass0C1 r3, C27371Ho r4) {
        return new IGTVFeedController(context, r3);
    }

    public final C17670qc A05() {
        return this.A00;
    }

    public final AnonymousClass73B A06(ViewGroup viewGroup, AnonymousClass0C1 r12, AnonymousClass1L8 r13, C71593Bj r14, C162826x8 r15, AnonymousClass3IK r16, C72593Gb r17, boolean z, C27371Ho r19, C256419q r20) {
        return AnonymousClass73A.A00(viewGroup, r12, r13, r14, r15, r16, r17, z, r19, r20);
    }

    public final AnonymousClass3IK A07(FragmentActivity fragmentActivity, C27371Ho r3, AnonymousClass1I6 r4) {
        return new C1648671j(fragmentActivity, r3, r4);
    }

    public final AnonymousClass3D6 A08(AnonymousClass0C1 r2) {
        return new AnonymousClass3D6(r2);
    }

    public final C1656174i A09(Context context, AnonymousClass1L8 r10, AnonymousClass0C1 r11, ReelMoreOptionsFragment reelMoreOptionsFragment, String str, AnonymousClass3D6 r14, C27371Ho r15) {
        return new C1656174i(context, r10, r11, reelMoreOptionsFragment, str, r14, r15);
    }

    public final C23160zf A0A(String str) {
        C13150hy.A02(str, "parentMediaId");
        C158706q4 r2 = new C158706q4();
        int A03 = C63262p9.A03(str, "_", 0);
        if (A03 > 0) {
            str = str.substring(0, A03);
            C13150hy.A01(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        r2.A01 = str;
        return r2;
    }

    public final void A0B(Activity activity, AnonymousClass0C1 r4, AnonymousClass2VU r5) {
        new AnonymousClass794(r4).A02(activity, r5, (String) null);
    }

    public final void A0C(Activity activity, AnonymousClass0C1 r5, String str, long j) {
        AnonymousClass794 r2 = new AnonymousClass794(r5);
        C13150hy.A02(activity, "activity");
        C13150hy.A02(str, "broadcastId");
        Intent A002 = AnonymousClass794.A00(r2, activity, AnonymousClass2VU.POST_LIVE, Constants.A0C);
        A002.putExtra("uploadflow.extra.live_broadcast_id", str);
        A002.putExtra("uploadflow.extra.live_duration_msec", j);
        A002.addFlags(813694976);
        AnonymousClass1BH.A03(A002, activity);
    }

    public final void A0D(FragmentActivity fragmentActivity, AnonymousClass0C1 r3, AnonymousClass1L8 r4, C58442fx r5) {
        if (fragmentActivity != null) {
            C28351Lj.A00(fragmentActivity, r4, AnonymousClass3DC.A01(r3, r5.APe()));
        }
    }

    public final void A0E(FragmentActivity fragmentActivity, AnonymousClass0C1 r3, AnonymousClass2VU r4, Medium medium, int i) {
        new AnonymousClass794(r3).A01(fragmentActivity, r4, medium, i);
    }

    public C17650qa() {
        C17870qw.A0G.add(new C17830qs());
    }
}
