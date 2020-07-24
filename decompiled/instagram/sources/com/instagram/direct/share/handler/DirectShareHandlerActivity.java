package com.instagram.direct.share.handler;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.C0003R;
import com.instagram.base.activity.IgActivity;
import com.instagram.modal.TransparentModalActivity;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0P4;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0QT;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass0WN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1BH;
import p000X.AnonymousClass56E;
import p000X.C05210Iq;
import p000X.C06590Pq;
import p000X.C138545vR;
import p000X.C15790nX;
import p000X.C19020sn;
import p000X.C21980xe;
import p000X.C53642Tq;
import p000X.C59032gv;
import p000X.C91283xI;

public class DirectShareHandlerActivity extends IgActivity implements AnonymousClass0RN {
    public AnonymousClass0C1 A00;
    public String A01;

    public final String getModuleName() {
        return "direct_system_share_handler";
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 4919 && i2 == -1) {
            AnonymousClass1BH.A03(C138545vR.A00(this, 67174400, "all"), this);
        }
        finish();
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = AnonymousClass0Z0.A00(-217129551);
        super.onCreate(bundle);
        C06590Pq A012 = AnonymousClass0J1.A01(this);
        if (!A012.AgN()) {
            C15790nX.A00.A00(this, A012, (Bundle) null);
            i = 781338163;
        } else {
            this.A00 = C05210Iq.A02(A012);
            Intent intent = getIntent();
            String stringExtra = intent.getStringExtra("com.instagram.share.choosertarget.DirectChooserTargetService.THREAD_ID");
            String stringExtra2 = intent.getStringExtra("android.intent.extra.TEXT");
            if (TextUtils.isEmpty(stringExtra2)) {
                stringExtra2 = "";
            }
            this.A01 = stringExtra2;
            if (TextUtils.isEmpty(stringExtra2)) {
                C53642Tq.A01(this, getResources().getString(C0003R.string.direct_share_intent_unsupported_file_type), 0).show();
                AnonymousClass0QD.A01("DirectShareHandlerActivity", "share handler called with no content, or trying to send .txt file");
                finish();
            } else {
                C91283xI r1 = new C91283xI(AnonymousClass0QT.A00(this.A00, this).A02("direct_share_extension_external"));
                r1.A08("thread_id", stringExtra);
                r1.A01();
                if (stringExtra == null || stringExtra.isEmpty()) {
                    AnonymousClass0C1 r6 = this.A00;
                    AnonymousClass56E A03 = C19020sn.A00.A04().A03(r6);
                    A03.A00.putBoolean("DirectPrivateStoryRecipientFragment.DIRECT_IS_SHARE_INTENT", true);
                    A03.A00.putString("bundle_share_text", this.A01);
                    new C59032gv(r6, TransparentModalActivity.class, "direct_private_story_recipients", A03.A00, this).A05(this, 4919);
                    AnonymousClass0WN.A01(this.A00).BcG(AnonymousClass0P4.A00("direct_native_share_to_direct_text", this));
                } else {
                    AnonymousClass0WN.A01(this.A00).BcG(AnonymousClass0P4.A00("direct_native_share_to_thread_text", this));
                    String str = this.A01;
                    C21980xe A003 = C21980xe.A00(this, this.A00, "os_system_share", this);
                    A003.A05(stringExtra);
                    A003.A04(str);
                    A003.A0C();
                    finish();
                }
            }
            i = -1611867387;
        }
        AnonymousClass0Z0.A07(i, A002);
    }
}
