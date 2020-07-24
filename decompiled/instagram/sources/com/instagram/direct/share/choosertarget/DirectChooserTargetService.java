package com.instagram.direct.share.choosertarget;

import android.content.ComponentName;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.service.chooser.ChooserTarget;
import android.service.chooser.ChooserTargetService;
import com.facebook.C0003R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.List;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass12C;
import p000X.AnonymousClass3K7;
import p000X.C05210Iq;
import p000X.C06590Pq;
import p000X.C19290tE;
import p000X.C66112uw;
import p000X.C72663Gk;

public class DirectChooserTargetService extends ChooserTargetService {
    public final List onGetChooserTargets(ComponentName componentName, IntentFilter intentFilter) {
        Icon createWithResource;
        ChooserTarget chooserTarget;
        C06590Pq A01 = AnonymousClass0J1.A01(this);
        if (!A01.AgN()) {
            return new ArrayList();
        }
        AnonymousClass0C1 A02 = C05210Iq.A02(A01);
        ArrayList arrayList = new ArrayList();
        List AWI = C19290tE.A00(A02).AWI(false, -1);
        int min = Math.min(AWI.size(), 8);
        for (int i = 0; i < min; i++) {
            C66112uw r6 = (C66112uw) AWI.get(i);
            if (r6.AY5() == null) {
                chooserTarget = null;
            } else {
                String AYB = r6.AYB();
                ImageUrl A00 = AnonymousClass3K7.A00(A02, r6.AQ1());
                Bitmap A002 = AnonymousClass12C.A00(AnonymousClass12C.A0c, A00.AZc(), false, true, "DirectChooserTargetService", A00.AV6(), A00.ALI());
                if (A002 != null) {
                    createWithResource = Icon.createWithBitmap(C72663Gk.A03(A002));
                } else {
                    createWithResource = Icon.createWithResource(this, C0003R.C0004drawable.profile_anonymous_user);
                }
                Bundle bundle = new Bundle();
                bundle.putString("com.instagram.share.choosertarget.DirectChooserTargetService.THREAD_ID", r6.AY5());
                chooserTarget = new ChooserTarget(AYB, createWithResource, 0.9f, componentName, bundle);
            }
            if (chooserTarget != null) {
                arrayList.add(chooserTarget);
            }
        }
        return arrayList;
    }
}
