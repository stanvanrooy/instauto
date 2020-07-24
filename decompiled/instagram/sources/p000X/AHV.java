package p000X;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: X.AHV */
public final class AHV implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AH6 A00;
    public final /* synthetic */ AnonymousClass2AW A01;

    public AHV(AH6 ah6, AnonymousClass2AW r2) {
        this.A00 = ah6;
        this.A01 = r2;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.A00.A04.setSelection(i);
        if (this.A00.A04.getOnItemClickListener() != null) {
            AH6 ah6 = this.A00;
            ah6.A04.performItemClick(view, i, ah6.A00.getItemId(i));
        }
        this.A00.dismiss();
    }
}
