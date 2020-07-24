package com.instagram.showreelnative.p037ui.feed;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import java.io.IOException;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0DB;
import p000X.C25268BBj;
import p000X.C25271BBm;
import p000X.C28088CbC;
import p000X.C28089CbD;
import p000X.C28865Cnz;
import p000X.C28866Co1;
import p000X.C28867Co2;
import p000X.C28870Co5;
import p000X.C28941CpH;
import p000X.C29012CqQ;
import p000X.C29021CqZ;

/* renamed from: com.instagram.showreelnative.ui.feed.ShowreelNativeMediaView */
public class ShowreelNativeMediaView extends ImageView {
    public C28865Cnz A00;
    public C28870Co5 A01;

    public void setAnimation(C28865Cnz cnz, AnonymousClass0C1 r9, C28089CbD cbD) {
        C28867Co2 co2;
        if (!cnz.equals(this.A00)) {
            String str = null;
            C28870Co5 co5 = this.A01;
            if (co5 != null) {
                co5.A00.cancel(true);
            }
            this.A00 = cnz;
            C29012CqQ cqQ = (C29012CqQ) r9.AVA(C29012CqQ.class, new C29021CqZ(r9));
            try {
                String str2 = cnz.A00;
                String str3 = cnz.A02;
                String str4 = cnz.A01;
                C28866Co1 co1 = new C28866Co1(this, cnz);
                try {
                    C25268BBj bBj = new C25268BBj(str3, str4, (String) null);
                    if (cbD != null) {
                        try {
                            str = C28088CbC.A00(cbD);
                        } catch (IOException e) {
                            co2 = new C28867Co2("Serialize loggingIdentifiers to Json failed", e);
                            throw co2;
                        }
                    }
                    this.A01 = (C28870Co5) cqQ.A05(new C28941CpH(str2, bBj, str, co1)).first;
                } catch (C25271BBm e2) {
                    co2 = new C28867Co2("ShowreelNativeAnimation is invalid", e2);
                    throw co2;
                }
            } catch (C28867Co2 e3) {
                AnonymousClass0DB.A0G("ShowreelNativeMediaView", "Failed to query ", e3);
                this.A00 = null;
            }
        }
    }

    public ShowreelNativeMediaView(Context context) {
        super(context);
    }

    public ShowreelNativeMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
