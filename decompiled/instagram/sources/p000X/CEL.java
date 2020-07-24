package p000X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.C0003R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CEL */
public final class CEL extends AnonymousClass1PH {
    public C27517CGh A00;
    public List A01 = new ArrayList();

    public final /* bridge */ /* synthetic */ void onBindViewHolder(AnonymousClass1ZK r4, int i) {
        C27507CFx cFx = (C27507CFx) r4;
        C27473CEp cEp = (C27473CEp) this.A01.get(i);
        cFx.A00.setText(cEp.A05);
        cFx.A01.setText(cEp.A03.A00);
        cFx.itemView.setOnClickListener(new C27508CFy(cFx, cEp));
    }

    public CEL(C27517CGh cGh) {
        this.A00 = cGh;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0Z0.A03(1299539326);
        int size = this.A01.size();
        AnonymousClass0Z0.A0A(-842344788, A03);
        return size;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass1ZK onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C27507CFx(LayoutInflater.from(viewGroup.getContext()).inflate(C0003R.layout.location_typeahead_item_view, viewGroup, false), this.A00);
    }
}
