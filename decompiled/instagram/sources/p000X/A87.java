package p000X;

import android.view.View;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.systrace.Systrace;
import com.facebook.systrace.SystraceMessage;

/* renamed from: X.A87 */
public final class A87 extends A9H {
    public final C230099zE A00;
    public final C23053A3d A01;
    public final String A02;
    public final /* synthetic */ A8K A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public A87(A8K a8k, C23053A3d a3d, int i, String str, C230099zE r9) {
        super(a8k, i);
        this.A03 = a8k;
        this.A01 = a3d;
        this.A02 = str;
        this.A00 = r9;
        Systrace.A04(33554432, "createView", this.A00);
    }

    /* JADX INFO: finally extract failed */
    public final void execute() {
        Systrace.A02(33554432, "createView", this.A00);
        A83 a83 = this.A03.A0L;
        C23053A3d a3d = this.A01;
        int i = this.A00;
        String str = this.A02;
        C230099zE r6 = this.A00;
        synchronized (a83) {
            C228039ra.A00();
            C08750Yk A022 = SystraceMessage.A02(33554432, "NativeViewHierarchyManager_createView");
            A022.A00(B5B.INTENT_PARAM_TAG, i);
            A022.A01("className", str);
            A022.A02();
            try {
                ViewManager A002 = a83.A09.A00(str);
                View createView = A002.createView(a3d, (C230099zE) null, (C230379zz) null, a83.A07);
                a83.A05.put(i, createView);
                a83.A04.put(i, A002);
                createView.setId(i);
                if (r6 != null) {
                    A002.updateProperties(createView, r6);
                }
                AnonymousClass0ZJ.A00(33554432, 892176907);
            } catch (Throwable th) {
                AnonymousClass0ZJ.A00(33554432, -1006303975);
                throw th;
            }
        }
    }
}
