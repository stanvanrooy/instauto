package p000X;

import android.content.Context;
import android.view.View;
import com.instagram.business.insights.controller.InsightsStoryViewerController;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.C89 */
public final class C89 implements C225709nb {
    public final /* synthetic */ C8A A00;

    public C89(C8A c8a) {
        this.A00 = c8a;
    }

    public final void B71(View view, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        C8A c8a = this.A00;
        AnonymousClass1OY r4 = AnonymousClass1OY.BUSINESS_INSIGHTS;
        Context context = c8a.getContext();
        if (context != null) {
            AnonymousClass0C1 r1 = (AnonymousClass0C1) c8a.getSession();
            new C28341Li(context, r1, AnonymousClass1L8.A00(c8a)).A02(InsightsStoryViewerController.A00(arrayList, r1), c8a.A00.A01(c8a, r4));
        }
        this.A00.A01 = new WeakReference(view);
    }
}
