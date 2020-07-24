package com.instagram.business.insights.controller;

import android.content.Context;
import android.graphics.RectF;
import androidx.fragment.app.FragmentActivity;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.List;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass1N2;
import p000X.AnonymousClass1OY;
import p000X.AnonymousClass1W5;
import p000X.AnonymousClass6R1;
import p000X.AnonymousClass6R5;
import p000X.C124685Vw;
import p000X.C15890nh;
import p000X.C17020pY;
import p000X.C17850qu;
import p000X.C27291Hg;
import p000X.C28591Mi;
import p000X.C34071dx;
import p000X.C36681iR;
import p000X.C53932Vb;
import p000X.C59012gt;

public class InsightsStoryViewerController extends C27291Hg implements AnonymousClass1W5 {
    public Context A00;
    public C124685Vw mHideAnimationCoordinator;

    public final void B4l(Reel reel, C59012gt r2) {
    }

    public final void BHS(Reel reel) {
    }

    public final void BHt(Reel reel) {
    }

    public static C17850qu A00(List list, AnonymousClass0C1 r3) {
        String A03 = C36681iR.A00(',').A03(list);
        C15890nh r2 = new C15890nh(r3);
        r2.A09 = Constants.A0N;
        r2.A0C = "media/infos/";
        r2.A09("media_ids", A03);
        r2.A09("ranked_content", "true");
        r2.A09("include_inactive_reel", "true");
        r2.A06(AnonymousClass1N2.class, false);
        return r2.A03();
    }

    public final C28591Mi A01(C53932Vb r2, AnonymousClass1OY r3) {
        return new AnonymousClass6R5(this, r2, r3);
    }

    public final void A02(Reel reel, int i, RectF rectF, FragmentActivity fragmentActivity, AnonymousClass0C1 r23, AnonymousClass1OY r24) {
        Reel reel2 = reel;
        if (reel != null) {
            FragmentActivity fragmentActivity2 = fragmentActivity;
            AnonymousClass0C1 r3 = r23;
            C34071dx A0V = C17020pY.A00().A0V(fragmentActivity2, r3);
            ArrayList arrayList = new ArrayList();
            arrayList.add(reel2.getId());
            if (A0V != null) {
                int i2 = i;
                RectF rectF2 = rectF;
                AnonymousClass1OY r5 = r24;
                A0V.A0W(reel2, i2, (RectF) null, rectF2, new AnonymousClass6R1(this, reel2, r3, arrayList, r5, i2, A0V, fragmentActivity2, rectF2), false, r5);
            }
        }
    }

    public InsightsStoryViewerController(Context context) {
        this.A00 = context;
    }
}
