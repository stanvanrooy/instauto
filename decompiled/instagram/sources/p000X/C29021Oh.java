package p000X;

import android.content.Context;
import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.quickpromotion.intf.Trigger;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: X.1Oh  reason: invalid class name and case insensitive filesystem */
public final class C29021Oh implements C11200ea {
    public final AnonymousClass1L8 A00;
    public final C27341Hl A01;
    public final AnonymousClass1OE A02;
    public final AnonymousClass0C1 A03;
    public final C18750sM A04 = C29041Oj.A00(new C29061Ol(this));
    public final C18750sM A05 = C29041Oj.A00(new C29031Oi(this));

    public C29021Oh(C27341Hl r2, AnonymousClass0C1 r3, AnonymousClass1L8 r4, AnonymousClass1OE r5) {
        C13150hy.A02(r2, "fragment");
        C13150hy.A02(r3, "userSession");
        C13150hy.A02(r4, "loaderManager");
        C13150hy.A02(r5, "quickPromotionPresenter");
        this.A01 = r2;
        this.A03 = r3;
        this.A00 = r4;
        this.A02 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0051, code lost:
        if (r5.isEmpty() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002c, code lost:
        if (r5 != false) goto L_0x002e;
     */
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        boolean z;
        boolean z2;
        int A032 = AnonymousClass0Z0.A03(-741566676);
        C31091Wk r14 = (C31091Wk) obj;
        int A033 = AnonymousClass0Z0.A03(613594210);
        C13150hy.A02(r14, "event");
        PendingMedia pendingMedia = r14.A00;
        C13150hy.A01(pendingMedia, "event.mPendingMedia");
        AnonymousClass1NJ r1 = pendingMedia.A0d;
        List A18 = r1.A18(C34181eD.PRODUCT);
        boolean z3 = false;
        if (A18 != null) {
            boolean isEmpty = A18.isEmpty();
            z = false;
        }
        z = true;
        if (z) {
            AnonymousClass0Z0.A0A(-259614604, A033);
        } else {
            List A182 = r1.A18(C34181eD.MEDIA);
            List A183 = r1.A18(C34181eD.MENTION_RESHARE);
            if (A182 != null) {
                z2 = false;
            }
            z2 = true;
            if (z2) {
                if (A183 == null || A183.isEmpty()) {
                    z3 = true;
                }
                if (z3) {
                    if (!((Boolean) AnonymousClass0L6.A02(this.A03, AnonymousClass0L7.SHOPPING_AUTO_HIGHLIGHT, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                        AnonymousClass0Z0.A0A(-746433644, A033);
                    } else {
                        Object A022 = ((AnonymousClass1HQ) ((C122315Mb) this.A05.getValue()).A01.getValue()).A02();
                        if (A022 == null) {
                            C13150hy.A00();
                        }
                        C13150hy.A01(A022, "repository.autohighlightEnabled.value!!");
                        if (((Boolean) A022).booleanValue()) {
                            Context requireContext = this.A01.requireContext();
                            C13150hy.A01(requireContext, "fragment.requireContext()");
                            C27341Hl r8 = this.A01;
                            AnonymousClass1L8 r9 = this.A00;
                            C13150hy.A01(r1, "media");
                            String A0u = r1.A0u();
                            C13150hy.A01(A0u, "media.strippedMediaId");
                            ((C122315Mb) this.A05.getValue()).A01(requireContext, r8, r9, A0u, new C1659175o(this, r1), C101504a1.A00);
                        } else {
                            AnonymousClass0C1 r0 = this.A03;
                            C13150hy.A01(r1, "media");
                            C27665CMj.A00(r0).edit().putString("last_shopping_story_media_id", r1.A27).apply();
                            AnonymousClass1OE r2 = this.A02;
                            Set singleton = Collections.singleton(Trigger.SHOPPING_STORY_POSTED);
                            C13150hy.A01(singleton, "java.util.Collections.singleton(element)");
                            r2.BSq(singleton);
                        }
                        AnonymousClass0Z0.A0A(2098270657, A033);
                    }
                }
            }
            AnonymousClass0Z0.A0A(1719782301, A033);
        }
        AnonymousClass0Z0.A0A(471483441, A032);
    }
}
