package p000X;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import com.facebook.C0003R;
import com.instagram.p009ui.recyclerpager.HorizontalRecyclerPager;
import com.instagram.realtimeclient.RealtimeClientManager;
import java.util.List;

/* renamed from: X.AKB */
public final class AKB implements C23389AKo {
    public long A00 = 0;
    public View A01;
    public Animation A02;
    public AnonymousClass1YW A03;
    public C11200ea A04;
    public HorizontalRecyclerPager A05;
    public C23334AIl A06;
    public String A07;
    public String A08;
    public List A09;
    public List A0A;
    public boolean A0B;
    public boolean A0C;
    public final ViewGroup A0D;
    public final C473823q A0E = new C195238Xf(this);
    public final C27341Hl A0F;
    public final C699734j A0G;
    public final C699834k A0H;
    public final AnonymousClass0C1 A0I;
    public final C13300iJ A0J;
    public final C13300iJ A0K;
    public final AK9 A0L;
    public final AMD A0M;
    public final AKD A0N;
    public final C227679qt A0O;
    public final Handler A0P;
    public final C23442AMp A0Q = new C227659qr(this);
    public final C30484Dd9 A0R = new AKA(this);
    public final AND A0S = new C23382AKh(this);
    public final C23430AMd A0T = new C227639qp(this);

    public AKB(ViewGroup viewGroup, C27341Hl r33, AnonymousClass0C1 r34, C13300iJ r35, C23334AIl aIl, C699834k r37, C699734j r38, C227679qt r39, AnonymousClass3Dj r40, C23381AKg aKg, AKU aku, boolean z) {
        C27341Hl r8 = r33;
        this.A0F = r8;
        AnonymousClass0C1 r9 = r34;
        this.A0I = r9;
        this.A0K = r9.A06;
        C13300iJ r6 = r35;
        this.A0J = r6;
        this.A06 = aIl;
        ViewGroup viewGroup2 = viewGroup;
        this.A0D = viewGroup2;
        this.A0O = r39;
        this.A0G = r38;
        this.A0H = r37;
        this.A0P = new Handler(Looper.getMainLooper());
        AKU aku2 = aku;
        boolean z2 = z;
        AnonymousClass3Dj r11 = r40;
        this.A0L = new AK9(r6, viewGroup2, r8, r9, new AK8(), r11, aKg, this, aku2, z2);
        boolean booleanValue = ((Boolean) AnonymousClass0L6.A03(this.A0I, AnonymousClass0L7.LIVE_QA_VIEWER_V1, "is_enabled", false, (AnonymousClass04H) null)).booleanValue();
        this.A0B = ((Boolean) AnonymousClass0L6.A02(this.A0I, AnonymousClass0L7.LIVE_HIDE_COMMENT_PROMPTS, "comment_prompts_disabled", false, (AnonymousClass04H) null)).booleanValue();
        this.A0M = AMD.A00(viewGroup2, r8, r9, r6, this.A0L, r11, aku2, new C23444AMr(true, false, false, true, false, booleanValue, true), C0003R.layout.iglive_viewer_buttons_container, this.A06, z2);
        C27341Hl r0 = this.A0F;
        this.A0N = new AKD(r0.getContext(), AnonymousClass1L8.A00(r0), this.A0I, this, r11);
        AMD amd = this.A0M;
        amd.A0K.A03 = this.A0T;
        amd.A0H.A00 = this.A0R;
        amd.A06 = this.A0Q;
        amd.A07 = this.A0S;
    }

    public static View A00(AKB akb) {
        View inflate;
        if (akb.A01 == null) {
            ViewStub viewStub = (ViewStub) akb.A0D.findViewById(C0003R.C0005id.wave_reaction_overlay_stub);
            if (viewStub == null) {
                inflate = akb.A0D.findViewById(C0003R.C0005id.wave_reaction_overlay);
            } else {
                inflate = viewStub.inflate();
            }
            akb.A01 = inflate;
        }
        return akb.A01;
    }

    public static void A01(AKB akb) {
        AMD amd = akb.A0M;
        int height = akb.A05.getHeight();
        AMG amg = amd.A0K;
        float f = (float) height;
        View view = amg.A07.A02;
        view.setTranslationY(view.getY() + f);
        akb.A05.setVisibility(8);
    }

    public static void A02(AKB akb) {
        AMD amd = akb.A0M;
        int i = -akb.A05.getHeight();
        AMG amg = amd.A0K;
        float f = (float) i;
        View view = amg.A07.A02;
        view.setTranslationY(view.getY() + f);
        akb.A05.setVisibility(0);
    }

    public static void A03(AKB akb, String str) {
        AMD amd = akb.A0M;
        akb.A0G.A00(amd.A0H.A00(str, amd.A0G.getId(), amd.A09));
    }

    public final void A04() {
        if (((Boolean) AnonymousClass0L6.A02(this.A0I, AnonymousClass0L7.LIVE_DONATIONS, "are_comment_prompts_disabled", false, (AnonymousClass04H) null)).booleanValue()) {
            this.A0B = true;
            if (this.A05 != null) {
                A01(this);
            }
        }
        AK9 ak9 = this.A0L;
        ak9.A07 = true;
        AK9.A07(ak9);
    }

    public final void A05() {
        if (this.A0C) {
            this.A0C = false;
            AKD akd = this.A0N;
            if (akd.A06) {
                akd.A06 = false;
                AnonymousClass0ZA.A07(akd.A03, (Object) null);
                akd.A03 = null;
            }
            AnonymousClass0ZA.A07(this.A0P, (Object) null);
            if (this.A09 != null) {
                RealtimeClientManager.getInstance(this.A0I).graphqlUnsubscribeCommand(this.A09);
                this.A09 = null;
            }
            if (this.A04 != null) {
                C23300zv.A00(this.A0I).A03(AJK.class, this.A04);
            }
            this.A0M.A05();
        }
    }

    public final void AxN(boolean z) {
        this.A0M.A0D(z);
        if (z && this.A05.getVisibility() == 0) {
            A01(this);
        } else if (!z && !this.A0B && this.A05.getVisibility() == 8) {
            A02(this);
        }
    }
}
