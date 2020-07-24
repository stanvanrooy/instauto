package p000X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.reels.fragment.ReelViewerFragment;

/* renamed from: X.AK0 */
public final class AK0 implements View.OnClickListener {
    public final /* synthetic */ C109074mt A00;
    public final /* synthetic */ C109034mp A01;
    public final /* synthetic */ C13300iJ A02;
    public final /* synthetic */ AKU A03;
    public final /* synthetic */ AKS A04;
    public final /* synthetic */ C23358AJj A05;
    public final /* synthetic */ AK9 A06;
    public final /* synthetic */ C23371AJw A07;
    public final /* synthetic */ C23370AJv A08;
    public final /* synthetic */ AK8 A09;
    public final /* synthetic */ CharSequence A0A;

    public AK0(C23370AJv aJv, C13300iJ r2, CharSequence charSequence, C109034mp r4, C109074mt r5, AK9 ak9, AKS aks, C23358AJj aJj, AK8 ak8, AKU aku, C23371AJw aJw) {
        this.A08 = aJv;
        this.A02 = r2;
        this.A0A = charSequence;
        this.A01 = r4;
        this.A00 = r5;
        this.A06 = ak9;
        this.A04 = aks;
        this.A05 = aJj;
        this.A09 = ak8;
        this.A03 = aku;
        this.A07 = aJw;
    }

    public final void onClick(View view) {
        boolean A052;
        int A053 = AnonymousClass0Z0.A05(-243668054);
        String string = this.A08.A00.getString(C0003R.string.hide_live_video_from_user, new Object[]{this.A02.AZn()});
        String string2 = this.A08.A00.getString(C0003R.string.unhide_live_video_from_user, new Object[]{this.A02.AZn()});
        if (this.A0A.equals(string) || this.A0A.equals(string2)) {
            this.A01.A00(this.A02, this.A00, "InstaVideoComments", false, true);
        } else if (this.A0A.equals(this.A08.A00.getString(C0003R.string.live_unpin_comment))) {
            this.A06.A0K(this.A04);
        } else {
            if (this.A0A.equals(this.A08.A00.getString(C0003R.string.live_pin_comment))) {
                AKS aks = this.A04;
                if (!C67892y3.A00(aks.A0I)) {
                    AK9 ak9 = this.A06;
                    AKS aks2 = ak9.A08;
                    AnonymousClass0C1 r1 = ak9.A0L;
                    String AS8 = aks.AS8();
                    String str = ak9.A0A;
                    long AFH = ak9.A03.AFH();
                    C15890nh r7 = new C15890nh(r1);
                    r7.A09 = Constants.ONE;
                    r7.A0C = C06360Ot.formatString("live/%s/pin_comment/", str);
                    r7.A09("offset_to_video_start", Long.toString(AFH / 1000));
                    r7.A06(AnonymousClass1N4.class, true);
                    r7.A09("comment_id", AS8);
                    r7.A0G = true;
                    C17850qu A032 = r7.A03();
                    A032.A00 = new AK1(ak9, aks2, aks);
                    ak9.A0D(aks);
                    ak9.A0K.schedule(A032);
                }
            }
            if (this.A0A.equals(this.A08.A00.getString(C0003R.string.report_comment))) {
                C23358AJj aJj = this.A05;
                AKS aks3 = this.A04;
                C27573CIr A012 = C22220y2.A00.A01(aJj.A0L);
                C27341Hl r3 = aJj.A0K;
                String AS82 = aks3.AS8();
                C13300iJ AZf = aks3.AZf();
                AnonymousClass0a4.A06(AZf);
                A012.A00(r3, AS82, AZf.getId());
                AnonymousClass2TH r12 = new AnonymousClass2TH(aJj.A0L);
                r12.A0L = aks3.AZf().AZn();
                r12.A0T = true;
                r12.A00 = 0.7f;
                AnonymousClass2TI A002 = r12.A00();
                AK5 A003 = C22220y2.A00.A00().A00(aJj.A0L, aks3, false, false);
                A003.A00(A002);
                A003.A01(new C23374AJz(aJj, A002, aks3));
                C27341Hl r0 = aJj.A0K;
                FragmentActivity activity = r0.getActivity();
                AnonymousClass0a4.A06(activity);
                Context context = r0.getContext();
                C31201Wx.A00(activity);
                A002.A01(context, A003);
                C31221Wz A013 = C31201Wx.A01(aJj.A0K.getContext());
                if (A013 != null) {
                    A013.A06(new AK3(aJj, aks3));
                }
            } else {
                if (this.A0A.equals(this.A08.A00.getString(C0003R.string.live_broadcast_invite_option, new Object[]{this.A02.AZn()}))) {
                    AK8 ak8 = this.A09;
                    AKU aku = this.A03;
                    C13300iJ r8 = this.A02;
                    AMF amf = ak8.A00;
                    if (amf != null && A052) {
                        AnonymousClass0a4.A0A((A052 = aku.A05()));
                        if (amf.A02 == null) {
                            amf.A02 = new ALB(amf.A0C.getContext());
                        }
                        amf.A02.A00(amf.A0B, amf.A0D.A06, r8, new AK4(amf, aku, r8), false);
                    }
                } else if (this.A0A.equals(this.A08.A00.getString(C0003R.string.delete_comment))) {
                    C23371AJw aJw = this.A07;
                    AKS aks4 = this.A04;
                    C699634i r13 = aJw.A00;
                    String AS83 = aks4.AS8();
                    String id = aks4.AZf().getId();
                    ReelViewerFragment reelViewerFragment = r13.A00;
                    AnonymousClass35C r4 = reelViewerFragment.A0f;
                    C39941no A1E = reelViewerFragment.A1E();
                    AnonymousClass0P4 A004 = AnonymousClass0P4.A00("reel_replay_delete_comment", r13.A00);
                    A004.A0G("m_pk", A1E.A09.A0P);
                    A004.A0G("c_pk", AS83);
                    A004.A0G("ca_pk", id);
                    AnonymousClass35C.A06(r4, A004, (AnonymousClass3GS) r4.A0D.get(A1E.A0N()));
                    AnonymousClass0WN.A01(r4.A07).BcG(A004);
                    AnonymousClass0C1 r02 = aJw.A0L;
                    String str2 = aJw.A0A;
                    C15890nh r42 = new C15890nh(r02);
                    r42.A09 = Constants.ONE;
                    r42.A0E("live/%s/delete_comment/%s/", str2, aks4.AS8());
                    r42.A06(AnonymousClass1N4.class, true);
                    r42.A0G = true;
                    C17850qu A033 = r42.A03();
                    A033.A00 = new C23373AJy(aJw, aks4);
                    C12810hQ.A02(A033);
                }
            }
        }
        AnonymousClass0Z0.A0C(-908696236, A053);
    }
}
