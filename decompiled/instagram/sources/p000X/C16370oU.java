package p000X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import com.instagram.video.live.p038ui.postlive.IgLivePostLiveFragment;
import java.util.Set;

/* renamed from: X.0oU  reason: invalid class name and case insensitive filesystem */
public final class C16370oU extends C16380oV {
    public C12830hS A00;
    public C25081Azf A01;
    public C2104295p A02;
    public C60882kj A03;

    public final C25081Azf A00() {
        if (this.A01 == null) {
            this.A01 = new C25081Azf();
        }
        return this.A01;
    }

    public final C2104295p A01() {
        if (this.A02 == null) {
            this.A02 = new C2104295p();
        }
        return this.A02;
    }

    public final C60882kj A02() {
        if (this.A03 == null) {
            this.A03 = new C60882kj();
        }
        return this.A03;
    }

    public final C224629ll A03(AnonymousClass0C1 r13, Context context, View view, boolean z, C13300iJ r17, C23334AIl aIl, C72063Dm r19) {
        AnonymousClass0C1 r4 = r13;
        C224629ll r3 = new C224629ll(r4, context, r17, aIl, r19);
        C2104095n r6 = new C2104095n(r13);
        r3.A00 = r6;
        Bundle bundle = new Bundle();
        bundle.putBoolean("ARG_IS_POLICY_VIOLATION", z);
        C16380oV.A00.A01();
        IgLivePostLiveFragment igLivePostLiveFragment = new IgLivePostLiveFragment();
        igLivePostLiveFragment.setArguments(bundle);
        igLivePostLiveFragment.A00 = r3;
        RecyclerView recyclerView = igLivePostLiveFragment.mRecyclerView;
        if (recyclerView != null && recyclerView.A0J == null) {
            IgLivePostLiveFragment.A00(igLivePostLiveFragment);
        }
        Context context2 = context;
        C2104095n.A01(r6, context2, igLivePostLiveFragment, view, true, new C2103895l(this, igLivePostLiveFragment));
        return r3;
    }

    public final void A04(Context context, AnonymousClass1L8 r14, AnonymousClass0C1 r15, AnonymousClass1AM r16, Reel reel, C39941no r18) {
        AnonymousClass5PL r5 = new AnonymousClass5PL(context, r14, r15, r16, reel, r18);
        C38031kc r3 = r5.A04.A09;
        C38051ke r2 = r3.A08;
        boolean z = false;
        if (r2 == C38051ke.POST_LIVE_POSTING_INITIATED) {
            z = true;
        }
        AnonymousClass0a4.A0A(!z);
        if (r2.A01()) {
            C250016x A0S = C17020pY.A00().A0S(r5.A05);
            String str = r5.A04.A09.A0I;
            synchronized (A0S) {
                AnonymousClass170 r1 = A0S.A01;
                synchronized (r1) {
                    r1.A03.remove(str);
                    AnonymousClass170.A00(r1);
                }
                C250016x.A03(A0S, (Reel) A0S.A02.get(C250216z.REPLAY));
            }
            r5.A03.A0N(r5.A05);
            return;
        }
        AnonymousClass0C1 r0 = r5.A05;
        String str2 = r3.A0I;
        C15890nh r32 = new C15890nh(r0);
        r32.A09 = Constants.ONE;
        r32.A0E("live/%s/delete_post_live/", str2);
        r32.A06(AnonymousClass1N4.class, true);
        r32.A0G = true;
        C17850qu A032 = r32.A03();
        A032.A00 = new AnonymousClass5PK(r5);
        C28351Lj.A00(r5.A00, r5.A02, A032);
    }

    public final void A06(AnonymousClass0C1 r4, Context context, AnonymousClass1L8 r6, C17920r1 r7) {
        C15890nh r2 = new C15890nh(r4);
        r2.A09 = Constants.A0N;
        r2.A0C = "live/get_live_presence/";
        r2.A06(AnonymousClass7YR.class, true);
        C17850qu A032 = r2.A03();
        A032.A00 = r7;
        C28351Lj.A00(context, r6, A032);
    }

    public final void A07(AnonymousClass0C1 r15, FragmentActivity fragmentActivity, C27341Hl r17, C72023Df r18, C699934l r19, C699834k r20, C699634i r21, C699734j r22, AnonymousClass3Dj r23, AnonymousClass3Dj r24, AnonymousClass1OY r25, AnonymousClass2OR r26) {
        C27341Hl r6 = r17;
        AnonymousClass3Dj r10 = r23;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        C699734j r8 = r22;
        C72023Df r2 = r18;
        r2.A00(new C72063Dm(r15, fragmentActivity2, r6, r20, r8, r19, r10, r24, r25, r26));
        r2.A00(new C72123Ds(r15, r6, r10, r21));
    }

    public final void A08(AnonymousClass0C1 r3, C27321Hj r4) {
        C32901c2 r1 = (C32901c2) r3.AVA(C32901c2.class, new C32911c3());
        synchronized (r1) {
            r1.A00.add(r4);
        }
    }

    public final void A09(AnonymousClass0C1 r3, C27321Hj r4) {
        C32901c2 r1 = (C32901c2) r3.AVA(C32901c2.class, new C32911c3());
        synchronized (r1) {
            r1.A00.remove(r4);
        }
    }

    public final void A0A(AnonymousClass0C1 r5, C38071kg r6, String str) {
        C15890nh r3 = new C15890nh(r5);
        r3.A09 = Constants.ONE;
        r3.A0E("live/%s/set_subscription_preference/", str);
        r3.A09("preference", r6.A01);
        r3.A06(AnonymousClass1N4.class, true);
        C17850qu A032 = r3.A03();
        if (this.A00 == null) {
            this.A00 = C12810hQ.A00();
        }
        this.A00.schedule(A032);
    }

    public final void A0E(AnonymousClass0C1 r5, String str, C17920r1 r7) {
        C15890nh r3 = new C15890nh(r5);
        r3.A09 = Constants.A0N;
        r3.A0E("live/%s/get_post_live_thumbnails/", str);
        r3.A06(AnonymousClass4WU.class, true);
        r3.A0G = true;
        C17850qu A032 = r3.A03();
        A032.A00 = r7;
        C12810hQ.A02(A032);
    }

    public final void A0I(String str, AnonymousClass0C1 r15, Integer num, Reel reel, AnonymousClass5MD r18) {
        Integer num2 = num;
        AnonymousClass0C1 r4 = r15;
        AnonymousClass5MD r6 = r18;
        if (num2 == Constants.ZERO) {
            C17020pY.A00().A0S(r15).A07(r6.A01, r6.A02, r6.A00, C38051ke.POST_LIVE_POSTING_INITIATED);
            C16180oA.A00(r15).A0P(C250216z.REPLAY.name());
        }
        C15890nh r3 = new C15890nh(r15);
        r3.A09 = Constants.ONE;
        r3.A0E("live/%s/add_to_post_live/", str);
        r3.A06(AnonymousClass26G.class, true);
        r3.A0G = true;
        C17850qu A032 = r3.A03();
        A032.A00 = new AnonymousClass5MC(this, r4, num2, r6, reel);
        C12810hQ.A02(A032);
    }

    public final void A0J(String str, AnonymousClass0C1 r6, String str2, String str3, String str4, boolean z, boolean z2, String str5, String str6, C17920r1 r14) {
        C15890nh r2 = new C15890nh(r6);
        r2.A09 = Constants.ONE;
        r2.A0E("live/add_post_live_to_igtv/", str);
        r2.A09(TraceFieldType.BroadcastId, str);
        r2.A09("cover_upload_id", str4);
        r2.A09(DialogModule.KEY_TITLE, str2);
        r2.A09("description", str3);
        r2.A0C("igtv_share_preview_to_feed", z);
        r2.A0C("internal_only", z2);
        r2.A09("igtv_composer_session_id", str6);
        r2.A09("igtv_series_id", str5);
        r2.A06(AnonymousClass1N4.class, true);
        r2.A0G = true;
        C17850qu A032 = r2.A03();
        A032.A00 = r14;
        C12810hQ.A02(A032);
    }

    public final void A05(AnonymousClass0C1 r4) {
        if (!AnonymousClass3YS.A00(r4).A02) {
            C15890nh r2 = new C15890nh(r4);
            r2.A09 = Constants.A0N;
            r2.A0C = "live/pre_live_tools/";
            r2.A06(C76773Xg.class, true);
            C17850qu A032 = r2.A03();
            A032.A00 = new C76783Xh(this, r4);
            C12810hQ.A02(A032);
        }
    }

    public final void A0B(AnonymousClass0C1 r5, String str) {
        C57312dz A002 = C57312dz.A00(r5);
        boolean z = false;
        if (A002.A00 != null) {
            z = true;
        }
        if (z) {
            for (Reel reel : C17020pY.A00().A0Q(A002.A00).A0M(false)) {
                if (reel.A0W() && reel.A0C.A0I.equals(str)) {
                    C57312dz.A06(reel.getId(), A002.A00);
                }
            }
        }
    }

    public final void A0C(AnonymousClass0C1 r4, String str) {
        C57312dz A002 = C57312dz.A00(r4);
        boolean z = false;
        if (A002.A00 != null) {
            z = true;
        }
        if (z) {
            C57312dz.A05(A002, str, true, true, new C155796l0(A002));
        }
    }

    public final void A0D(AnonymousClass0C1 r3, String str, C17920r1 r5) {
        C17850qu A002 = AnonymousClass5FT.A00(r3, str);
        A002.A00 = new C98594Ns(r3, r5);
        C12810hQ.A02(A002);
    }

    public final void A0F(AnonymousClass0C1 r10, String str, String str2, boolean z, boolean z2, Long l) {
        C57312dz A002 = C57312dz.A00(r10);
        boolean z3 = false;
        if (A002.A00 != null) {
            z3 = true;
        }
        if (z3) {
            Reel reel = null;
            for (Reel reel2 : C17020pY.A00().A0Q(A002.A00).A0M(false)) {
                if (reel2.A0W()) {
                    C249916w r7 = reel2.A0M;
                    if (r7.AZG() == Constants.ONE && r7.getId().equals(str2)) {
                        C38031kc r1 = reel2.A0C;
                        if (r1.A0I.equals(str)) {
                            reel = reel2;
                        } else if (!r1.A08.A00()) {
                            C57312dz.A06(reel2.getId(), A002.A00);
                        }
                    }
                }
            }
            if (reel != null) {
                reel.A0C.A0F = l;
                C57312dz.A02(A002, reel, z, (C13300iJ) null);
                return;
            }
            C57312dz.A05(A002, str, false, z2, new C59312hN(A002, z));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r1 == false) goto L_0x0031;
     */
    public final void A0G(AnonymousClass0C1 r7, String str, Set set, boolean z, Long l) {
        C38031kc r2;
        boolean z2;
        Boolean bool;
        C57312dz A002 = C57312dz.A00(r7);
        boolean z3 = false;
        if (A002.A00 != null) {
            z3 = true;
        }
        if (z3) {
            ReelStore A0Q = C17020pY.A00().A0Q(A002.A00);
            Reel A0G = A0Q.A0G(str);
            if (A0G == null || (r2 = A0G.A0C) == null) {
                C57312dz.A05(A002, str, false, true, new C155786kz(A002, z, set));
                return;
            }
            C13410iU r0 = r2.A0C.A0C;
            if (!(r0 == null || (bool = r0.A03) == null)) {
                boolean booleanValue = bool.booleanValue();
                z2 = true;
            }
            z2 = false;
            if (z2 || !set.isEmpty()) {
                r2.A0V.clear();
                r2.A0V.addAll(set);
                r2.A0F = l;
                if (set != null && set.size() == 1) {
                    C57312dz.A02(A002, A0G, z, (C13300iJ) set.iterator().next());
                }
                if (C38051ke.HIDDEN.equals(r2.A08)) {
                    r2.A08 = C38051ke.ACTIVE;
                    A0Q.A0O(A0G);
                }
            } else {
                r2.A08 = C38051ke.HIDDEN;
            }
            A0G.A0O(A002.A00);
        }
    }

    public final void A0H(String str, AnonymousClass0C1 r2) {
        C57312dz.A06(str, r2);
    }
}
