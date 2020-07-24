package p000X;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.instagram.realtimeclient.RealtimeClientManager;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.AK9 */
public final class AK9 extends C23358AJj implements C23372AJx {
    public int A00;
    public AnonymousClass79M A01;
    public AKU A02;
    public AnonymousClass3Dj A03;
    public C23427AMa A04;
    public String A05;
    public LinkedHashSet A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final C23389AKo A0E;
    public final C23381AKg A0F;
    public final AKC A0G;
    public final Comparator A0H = new AKT(this);
    public final C23385AKk A0I;

    /* JADX WARNING: Illegal instructions before constructor call */
    public AK9(C13300iJ r11, View view, C27341Hl r13, AnonymousClass0C1 r14, AK8 ak8, AnonymousClass3Dj r16, C23381AKg aKg, C23389AKo aKo, AKU aku, boolean z) {
        super(r3, r4, r5, r6, ak8, r1.A05());
        AKU aku2 = aku;
        AnonymousClass0C1 r5 = r14;
        C27341Hl r4 = r13;
        View view2 = view;
        C13300iJ r6 = r11;
        C23385AKk aKk = new C23385AKk(this);
        this.A0I = aKk;
        this.A02 = aku2;
        this.A0G = new AKC(r5, new C23391AKq(C23300zv.A00(r14), RealtimeClientManager.getInstance(r14)), new AKE(r14, new Handler(Looper.getMainLooper()), C06190Oc.A00, ((Integer) AnonymousClass0L6.A02(this.A0L, AnonymousClass0L7.LIVE_COMMENT_POLLING_INTERVAL, "interval_in_ms", Integer.valueOf(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS), (AnonymousClass04H) null)).intValue()), this, aKk);
        this.A06 = new LinkedHashSet();
        this.A03 = r16;
        this.A0F = aKg;
        this.A0E = aKo;
        this.A08 = z;
    }

    public static void A06(AK9 ak9) {
        if (ak9.A06.size() == 0) {
            ak9.A00 = ((Integer) AnonymousClass0L6.A02(ak9.A0L, AnonymousClass0L7.LIVE_COMMENT_POLLING_INTERVAL, "interval_in_ms", Integer.valueOf(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS), (AnonymousClass04H) null)).intValue();
        } else {
            Iterator it = ak9.A06.iterator();
            AKX akx = (AKX) it.next();
            it.remove();
            ak9.A07.A02(akx);
            ak9.A0A();
            if (!ak9.A0L.equals(akx.AZf())) {
                AnonymousClass0C1 r2 = ak9.A0L;
                C27341Hl r1 = ak9.A0K;
                String str = ak9.A05;
                String id = ak9.A0M.getId();
                long AJe = ak9.A03.AJe();
                C23379AKe aKe = new C23379AKe(AnonymousClass0QT.A00(r2, r1).A02("ig_live_comment_impression"));
                aKe.A07("live_position", Long.valueOf(AJe));
                aKe.A08("comment_type", AJJ.A01(akx.AP6()));
                aKe.A08("ca_pk", akx.AZf().getId());
                aKe.A08("c_pk", akx.AS8());
                aKe.A08("m_pk", str);
                aKe.A08("a_pk", id);
                aKe.A01();
            }
        }
        AnonymousClass0ZA.A09(ak9.A0F, new C23377AKc(ak9), (long) ak9.A00, -1634145710);
    }

    public static void A07(AK9 ak9) {
        if (ak9.A07 && !ak9.A0D && ak9.A07.A02.size() > 0) {
            ak9.A0D = true;
            ak9.A03.setVisibility(0);
        }
    }

    public final View A0G() {
        if (this.A0G == null) {
            View A0G2 = super.A0G();
            this.A0G = A0G2;
            if (this.A02.A05()) {
                A0G2.setPadding(A0G2.getPaddingLeft(), this.A0G.getPaddingTop(), 0, this.A0G.getPaddingBottom());
                this.A0H.setOnClickListener(new AK7(this));
            }
        }
        return this.A0G;
    }

    public final void A0H() {
        this.A06.clear();
        this.A06 = null;
        this.A01 = null;
        this.A04 = null;
        this.A0A = false;
        this.A09 = false;
        super.A0H();
    }

    public final void A0J(AKX akx) {
        this.A07.A02(akx);
        A0A();
        AnonymousClass0C1 r2 = this.A0L;
        C27341Hl r1 = this.A0K;
        String str = this.A05;
        String id = this.A0M.getId();
        long AJe = this.A03.AJe();
        C23378AKd aKd = new C23378AKd(AnonymousClass0QT.A00(r2, r1).A02("ig_live_client_comment_impression"));
        aKd.A07("live_position", Long.valueOf(AJe));
        aKd.A08("comment_type", AJJ.A01(akx.AP6()));
        aKd.A08("ca_pk", akx.AZf().getId());
        aKd.A08("m_pk", str);
        aKd.A08("a_pk", id);
        aKd.A01();
        A07(this);
    }

    public final void A0K(AKS aks) {
        if (aks != this.A08) {
            AnonymousClass0QD.A01("live_comments", "Tried to unpin not currently pinned comment.");
        }
        AnonymousClass0C1 r1 = this.A0L;
        String AS8 = aks.AS8();
        String str = this.A0A;
        long AFH = this.A03.AFH();
        C15890nh r3 = new C15890nh(r1);
        r3.A09 = Constants.ONE;
        r3.A0C = C06360Ot.formatString("live/%s/unpin_comment/", str);
        r3.A09("offset_to_video_start", Long.toString(AFH / 1000));
        r3.A06(AnonymousClass1N4.class, true);
        r3.A09("comment_id", AS8);
        r3.A0G = true;
        C17850qu A032 = r3.A03();
        A032.A00 = new AK2(this, aks);
        A0D((AKS) null);
        this.A0K.schedule(A032);
    }

    public final void A0I() {
        super.A0I();
        AKC akc = this.A0G;
        akc.A04 = false;
        akc.A09.BqP();
        akc.A08.BqP();
        C23375AKa aKa = akc.A08;
        aKa.Bid((AKC) null);
        akc.A09.Bid((AKC) null);
        aKa.Bh9((AKC) null);
        akc.A01 = aKa;
        this.A0C = false;
        this.A05 = null;
    }

    public final void A0L(String str, String str2) {
        super.A0E(str);
        this.A0C = true;
        this.A05 = str2;
        AKC akc = this.A0G;
        String str3 = this.A0A;
        if (!akc.A04) {
            akc.A04 = true;
            akc.A02 = str3;
            C23375AKa aKa = akc.A08;
            aKa.Bid(akc);
            akc.A09.Bid(akc);
            aKa.Bh9(akc);
            akc.A01.Bpd(str3);
            if (TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - akc.A00 > 30) {
                akc.A00 = 0;
                akc.A03 = null;
            }
        }
        A06(this);
    }
}
