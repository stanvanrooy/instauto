package p000X;

import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;

/* renamed from: X.CEW */
public final class CEW implements View.OnLongClickListener {
    public final /* synthetic */ C27459CEb A00;
    public final /* synthetic */ C27481CEx A01;

    public CEW(C27459CEb cEb, C27481CEx cEx) {
        this.A00 = cEb;
        this.A01 = cEx;
    }

    public final boolean onLongClick(View view) {
        C27480CEw cEw = this.A00.A0D;
        C27481CEx cEx = this.A01;
        CDB cdb = cEw.A00;
        FragmentActivity activity = cdb.getActivity();
        AnonymousClass0a4.A06(activity);
        AnonymousClass2OA r3 = new AnonymousClass2OA(activity);
        r3.A0V(true);
        r3.A0A(C0003R.string.rename, new CEY(cdb, cEx));
        r3.A0B(C0003R.string.delete, new C27446CDo(cdb, cEx), Constants.A0Y);
        r3.A09(C0003R.string.cancel, (DialogInterface.OnClickListener) null);
        r3.A03().show();
        return true;
    }
}
