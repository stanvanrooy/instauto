package p000X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.C0003R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.p009ui.widget.slidecontentlayout.SlideContentLayout;
import com.instagram.realtimeclient.RealtimeClientManager;

/* renamed from: X.CVK */
public final class CVK implements C24154Aj4 {
    public AnonymousClass8EB A00;
    public C23519APp A01;
    public CVL A02;
    public final C1880381c A03;
    public final CVR A04;
    public final CVM A05;
    public final CVN A06;

    public final void destroy() {
        this.A00 = null;
        this.A06.destroy();
        this.A05.destroy();
        C23519APp aPp = this.A01;
        if (aPp != null) {
            aPp.A00.clear();
        }
        CVL cvl = this.A02;
        if (cvl != null) {
            cvl.A00.clear();
        }
        this.A06.BsG();
        this.A05.BsG();
    }

    /* JADX WARNING: type inference failed for: r0v15, types: [X.CVN] */
    /* JADX WARNING: type inference failed for: r0v28 */
    /* JADX WARNING: type inference failed for: r0v29 */
    /* JADX WARNING: type inference failed for: r10v8, types: [X.CVb] */
    /* JADX WARNING: type inference failed for: r10v9, types: [X.CVa] */
    /* JADX WARNING: Multi-variable type inference failed */
    public static CVK A00(AnonymousClass0C1 r14, AnonymousClass3Di r15, CVR cvr, SlideContentLayout slideContentLayout, AnonymousClass1AM r18, boolean z, boolean z2) {
        CVM cUp;
        ? r0;
        int i;
        SlideContentLayout slideContentLayout2 = slideContentLayout;
        Context context = slideContentLayout2.getContext();
        Context applicationContext = context.getApplicationContext();
        String string = applicationContext.getString(C0003R.string.interactivity_ama_card_question_story_header);
        int A002 = C019000b.A00(applicationContext, C0003R.color.grey_9);
        C27902CVq cVq = C27902CVq.A02;
        C27907CVv cVv = C27907CVv.A02;
        CVO cvo = new CVO(new CVW(new C27903CVr(cVq, cVv, cVv, Constants.ZERO, A002, string, (ImageUrl) null, (String) null).A00(), new CV9(false, C27885CUz.A03)));
        AnonymousClass0C1 r12 = r14;
        C48 c48 = new C48(new C49(), new C27233C3z(new C25014Ay6(r14, C12810hQ.A00())));
        C25016Ay8 ay8 = new C25016Ay8(C23300zv.A00(r14), RealtimeClientManager.getInstance(r14), new C25014Ay6(r14, C12810hQ.A00()));
        C27906CVu cVu = new C27906CVu(C23300zv.A00(r14), RealtimeClientManager.getInstance(r14), r14.A04());
        ANJ anj = new ANJ(r15);
        C1880381c r2 = new C1880381c(c48);
        C4H c4h = new C4H(c48, ay8);
        CW1 cw1 = new CW1(c48, cVu, anj);
        C27896CVk cVk = new C27896CVk(new CVX(new CWK(), new CVZ(new C25014Ay6(r12, C12810hQ.A00()))), anj);
        slideContentLayout2.getContext();
        Resources resources = context.getResources();
        CVR cvr2 = cvr;
        int i2 = CVQ.A00[cvr2.ordinal()];
        AnonymousClass1AM r6 = r18;
        if (i2 == 1) {
            String string2 = resources.getString(C0003R.string.interactivity_ama_broadcaster_question_sheet_header_camera);
            String string3 = resources.getString(C0003R.string.f105x839d1bfc);
            C27890CVe cVe = new C27890CVe(context.getApplicationContext(), cvo, cw1, new C27891CVf(slideContentLayout2, true, true));
            cUp = new C27875CUp(context.getApplicationContext(), r12, cvo, c4h, new C27874CUo(new CHC(context, r6), string2, string3, z, z2), CVR.QUICK_CAPTURE);
            r0 = cVe;
        } else if (i2 == 2) {
            if (z) {
                i = C0003R.string.f107x68f96976;
            } else {
                i = C0003R.string.interactivity_ama_broadcaster_question_sheet_header_live;
                if (z2) {
                    i = C0003R.string.interactivity_ama_broadcaster_question_sheet_header_live_badges;
                }
            }
            String string4 = resources.getString(i);
            String string5 = resources.getString(C0003R.string.f104x2451fe1f);
            C27890CVe cVe2 = new C27890CVe(context.getApplicationContext(), cvo, cw1, new C27891CVf(slideContentLayout2, true, true));
            cUp = new C27875CUp(context.getApplicationContext(), r12, cvo, c4h, new C27874CUo(new CHC(context, r6), string4, string5, z, z2), CVR.A02);
            r0 = cVe2;
        } else if (i2 == 3 || i2 == 4) {
            C27887CVb cVb = new C27887CVb(context.getApplicationContext(), r12, cvo, new C27891CVf(slideContentLayout2, false, false), cw1);
            cUp = new CVP();
            r0 = cVb;
        } else if (i2 == 5) {
            C27886CVa cVa = new C27886CVa(context.getApplicationContext(), r12, cvo, new C27891CVf(slideContentLayout2, false, false), cVk);
            cUp = new CVP();
            r0 = cVa;
        } else {
            throw new RuntimeException("Undefined questions sheet header");
        }
        return new CVK(cUp, r0, cvr2, r2);
    }

    public final void A01() {
        this.A06.Bql();
        this.A05.Bql();
    }

    public final void A02(CVA cva) {
        this.A06.Bjw(cva);
        this.A05.Bjw(cva);
    }

    public final void A03(String str) {
        this.A03.A00.A01.A00 = str;
        this.A05.BgH(str);
        this.A06.BgH(str);
    }

    public final void Bdu() {
        this.A06.Bdu();
        this.A05.Bdu();
    }

    public final void pause() {
        this.A06.pause();
        this.A05.pause();
    }

    public CVK(CVM cvm, CVN cvn, CVR cvr, C1880381c r5) {
        this.A05 = cvm;
        this.A06 = cvn;
        this.A04 = cvr;
        this.A03 = r5;
        CVJ cvj = new CVJ(this);
        cvn.BlV(cvj);
        cvm.BlV(cvj);
    }
}
