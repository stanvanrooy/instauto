package p000X;

import java.util.HashMap;

/* renamed from: X.1Ko  reason: invalid class name and case insensitive filesystem */
public final class C28141Ko implements C28111Kl {
    public final C28091Kj A00;

    public final void ADd(AnonymousClass1TY r6, C32761bo r7) {
        String str;
        C43411uN r4 = (C43411uN) r6.A01;
        if (r7.A04(r6) == Constants.ZERO) {
            HashMap hashMap = new HashMap();
            String str2 = r4.A08;
            if (str2 != null) {
                hashMap.put("insertion_context", str2);
            }
            if (r4.A0F == null) {
                if (r4.A0G != null) {
                    str = "profile";
                }
                this.A00.A00((C36321hr) r6.A01, ((C36851ii) r6.A02).getPosition(), hashMap);
            } else if (r4.ALf() == C29261Pf.DISCOVER_ACCOUNTS_FEED_CARD) {
                str = "topic_card";
            } else {
                str = "preview";
            }
            hashMap.put("format", str);
            this.A00.A00((C36321hr) r6.A01, ((C36851ii) r6.A02).getPosition(), hashMap);
        }
    }

    public C28141Ko(C28091Kj r1) {
        this.A00 = r1;
    }
}
