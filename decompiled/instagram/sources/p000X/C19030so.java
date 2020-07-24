package p000X;

import android.os.Bundle;
import java.util.Set;

/* renamed from: X.0so  reason: invalid class name and case insensitive filesystem */
public final class C19030so {
    public final C27341Hl A00(String str, C96714Gf r5, Set set, boolean z, String str2) {
        C103904eK r2 = new C103904eK();
        r2.A0D.addAll(set);
        C103904eK.A02(r2, r5);
        Bundle bundle = new Bundle();
        bundle.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID", str);
        bundle.putBoolean("DirectAllThreadJoinRequestsFragment.IS_THREAD_STARTED", z);
        bundle.putString("DirectAllThreadJoinRequestsFragment.ENTRY_POINT", str2);
        r2.setArguments(bundle);
        return r2;
    }

    public final AnonymousClass5BO A01(AnonymousClass0C1 r5, AnonymousClass0RN r6, String str) {
        AnonymousClass5BO r3 = new AnonymousClass5BO();
        r3.A00.putString("IgSessionManager.SESSION_TOKEN_KEY", r5.getToken());
        r3.A00.putString("DirectReplyModalFragment.source_module_name", r6.getModuleName());
        r3.A00.putString("DirectReplyModalFragment.entry_point", str);
        return r3;
    }

    public final C103844eE A02(AnonymousClass0C1 r2, C58022fB r3, AnonymousClass0RN r4) {
        return new C103844eE(r2, r3, r4);
    }

    public final AnonymousClass56E A03(AnonymousClass0C1 r5) {
        AnonymousClass56D r3 = new AnonymousClass56D();
        r3.A00.putString("IgSessionManager.SESSION_TOKEN_KEY", r5.getToken());
        return r3;
    }
}
