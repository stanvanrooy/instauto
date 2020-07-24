package com.instagram.challenge.activity;

import android.os.Bundle;
import com.facebook.C0003R;
import com.instagram.base.activity.BaseFragmentActivity;
import java.util.ArrayList;
import p000X.Constants;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass4MC;
import p000X.AnonymousClass4MD;
import p000X.C06360Ot;
import p000X.C06590Pq;
import p000X.C114894wf;
import p000X.C138835vv;
import p000X.C138855vx;
import p000X.C138965w8;
import p000X.C138975w9;
import p000X.C139175xA;
import p000X.C139205xE;
import p000X.C139225xG;
import p000X.C16960pS;
import p000X.C17550qQ;
import p000X.C17970r6;
import p000X.C18960sh;
import p000X.C224999mQ;
import p000X.C52362Om;
import p000X.C53772Uh;

public class ChallengeActivity extends BaseFragmentActivity implements AnonymousClass0RN {
    public Bundle A00;
    public C06590Pq A01;
    public Integer A02;

    public final String getModuleName() {
        return "challenge";
    }

    public final C06590Pq A0L() {
        return this.A01;
    }

    public final void A0V(Bundle bundle) {
        if (A05().A0L(C0003R.C0005id.layout_container_main) == null) {
            AnonymousClass1HD r0 = null;
            switch (this.A02.intValue()) {
                case 0:
                    C16960pS.A00.A00();
                    Bundle bundle2 = this.A00;
                    r0 = new C139225xG();
                    r0.setArguments(bundle2);
                    break;
                case 1:
                    r0 = C17550qQ.A00.A00().A00(this.A01, Constants.A0N, Constants.ONE, false).A01();
                    break;
                case 2:
                    C16960pS.A00.A00();
                    Bundle bundle3 = this.A00;
                    r0 = new C138965w8();
                    r0.setArguments(bundle3);
                    break;
                case 3:
                    C16960pS.A00.A00();
                    Bundle bundle4 = this.A00;
                    r0 = new C138975w9();
                    r0.setArguments(bundle4);
                    break;
                case 4:
                    AnonymousClass4MC r6 = new AnonymousClass4MC(this.A01, this, this);
                    r6.A06 = true;
                    int i = this.A00.getInt("ChallengeFragment.bloksAction");
                    C53772Uh A002 = C53772Uh.A00(this.A01);
                    C139175xA r5 = (C139175xA) A002.A01.get(i);
                    if (r5 == null) {
                        ArrayList arrayList = new ArrayList();
                        for (int i2 = 0; i2 <= A002.A00; i2++) {
                            if (A002.A01.get(i2) instanceof C138855vx) {
                                arrayList.add(Integer.valueOf(i2));
                            }
                        }
                        String A04 = C06360Ot.A04(",", arrayList);
                        String A042 = C06360Ot.A04(",", A002.A02);
                        AnonymousClass0QD.A02("missing_challenge_action", "Looking for action with " + i + " but found " + A04 + " - removed keys: " + A042);
                    }
                    C224999mQ.A01(r6, r5);
                    break;
                case 5:
                    C16960pS.A00.A00();
                    new AnonymousClass4MD().setArguments(this.A00);
                    break;
                case 6:
                    break;
            }
            C18960sh.A00.A00();
            r0 = new C114894wf();
            AnonymousClass0QD.A01("Challenge", "unknown challenge type found");
            if (r0 != null) {
                C52362Om r2 = new C52362Om(this, this.A01);
                r2.A02 = r0;
                r2.A02();
            }
        }
    }

    public final void finish() {
        C139205xE A002;
        super.finish();
        if (this.A02 == Constants.A0Y) {
            C53772Uh.A00(this.A01).A02(this.A00.getInt("ChallengeFragment.bloksAction"));
        }
        if (AnonymousClass0J1.A00(getIntent().getBundleExtra("ChallengeFragment.arguments")) != null && (A002 = C17970r6.A00(AnonymousClass0J1.A00(getIntent().getBundleExtra("ChallengeFragment.arguments")))) != null) {
            A002.A01();
        }
    }

    public final void onCreate(Bundle bundle) {
        Integer num;
        int A002 = AnonymousClass0Z0.A00(-1837165060);
        Bundle bundleExtra = getIntent().getBundleExtra("ChallengeFragment.arguments");
        this.A00 = bundleExtra;
        this.A01 = AnonymousClass0J1.A00(bundleExtra);
        String stringExtra = getIntent().getStringExtra("ChallengeFragment.challengeType");
        Integer[] A003 = Constants.ZERO(8);
        int length = A003.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                num = Constants.A12;
                break;
            }
            num = A003[i];
            if (C138835vv.A00(num).equals(stringExtra)) {
                break;
            }
            i++;
        }
        this.A02 = num;
        super.onCreate(bundle);
        AnonymousClass0Z0.A07(1893283964, A002);
    }
}
