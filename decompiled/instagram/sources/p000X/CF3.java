package p000X;

import android.view.View;
import com.facebook.C0003R;

/* renamed from: X.CF3 */
public final class CF3 implements View.OnLongClickListener {
    public final /* synthetic */ CDC A00;
    public final /* synthetic */ CCK A01;
    public final /* synthetic */ String A02;

    public CF3(CDC cdc, CCK cck, String str) {
        this.A00 = cdc;
        this.A01 = cck;
        this.A02 = str;
    }

    public final boolean onLongClick(View view) {
        AnonymousClass2OA r6 = new AnonymousClass2OA(this.A00.A01);
        r6.A0V(true);
        r6.A0D(C0003R.string.delete, new CDS(this.A00, this.A02, this.A01), Constants.ZERO);
        r6.A03().show();
        return true;
    }
}
