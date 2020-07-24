package p000X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.C0003R;

/* renamed from: X.CEG */
public final class CEG extends AnonymousClass1PH {
    public final CGZ A00;
    public final CD3 A01;
    public final CDA A02;

    public final /* bridge */ /* synthetic */ void onBindViewHolder(AnonymousClass1ZK r4, int i) {
        CG1 cg1 = (CG1) r4;
        C27473CEp cEp = (C27473CEp) this.A01.A07.A05.get(i);
        cg1.A00.setText(cEp.A05);
        cg1.itemView.setOnClickListener(new CEC(cg1, cEp));
    }

    public CEG(CD3 cd3, CDA cda, CGZ cgz) {
        this.A01 = cd3;
        this.A02 = cda;
        this.A00 = cgz;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0Z0.A03(997707517);
        int size = this.A01.A07.A05.size();
        AnonymousClass0Z0.A0A(-141023191, A03);
        return size;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass1ZK onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new CG1(LayoutInflater.from(viewGroup.getContext()).inflate(C0003R.layout.promote_create_audience_selected_location, viewGroup, false), this.A00);
    }
}
