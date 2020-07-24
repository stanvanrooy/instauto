package p000X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.C0003R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CEZ */
public final class CEZ extends AnonymousClass1PH {
    public C27512CGc A00;
    public List A01 = new ArrayList();

    public final /* bridge */ /* synthetic */ void onBindViewHolder(AnonymousClass1ZK r4, int i) {
        C27506CFw cFw = (C27506CFw) r4;
        CG9 cg9 = (CG9) this.A01.get(i);
        cFw.A00.setText(cg9.A01);
        cFw.itemView.setOnClickListener(new C27458CEa(cFw, cg9));
    }

    public CEZ(C27512CGc cGc) {
        this.A00 = cGc;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0Z0.A03(1011513242);
        int size = this.A01.size();
        AnonymousClass0Z0.A0A(730684203, A03);
        return size;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass1ZK onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C27506CFw(LayoutInflater.from(viewGroup.getContext()).inflate(C0003R.layout.interest_typeahead_item_view, viewGroup, false), this.A00);
    }
}
