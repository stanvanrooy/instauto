package p000X;

import android.app.Dialog;
import android.view.View;
import com.facebook.C0003R;

/* renamed from: X.Aw2 */
public final class Aw2 extends C35681gl {
    public final /* synthetic */ C24935Awd A00;

    public Aw2(C24935Awd awd) {
        this.A00 = awd;
    }

    public final boolean BR2(View view) {
        C24891Avp avp;
        C13150hy.A02(view, "touchHandlingView");
        C24907AwA A01 = this.A00.A01();
        C24903Aw4 aw4 = A01.A00;
        C24890Avo avo = aw4.A01;
        if (avo == null || (avp = avo.A00) == null) {
            return true;
        }
        C24892Avq avq = avp.A00;
        if (!(avq instanceof C24870AvR)) {
            return true;
        }
        C24752Ast ast = aw4.A08;
        C24901Aw1 aw1 = new C24901Aw1(avq, A01);
        C13150hy.A02(aw1, "onReportClick");
        String string = ast.A00.getString(C0003R.string.report);
        C13150hy.A01(string, "context.getString(R.string.report)");
        String[] strArr = {string};
        AnonymousClass2OA r2 = new AnonymousClass2OA(ast.A00);
        r2.A0W((CharSequence[]) strArr, new C24761At3(ast, strArr, aw1));
        r2.A0U(true);
        r2.A0V(true);
        Dialog A03 = r2.A03();
        C13150hy.A01(A03, "DialogBuilder(context)\n …e(true)\n        .create()");
        A01.A00.A06.A02(new C24594AqJ(Constants.ZERO, A03));
        return true;
    }
}
