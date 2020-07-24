package p000X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.C0003R;

/* renamed from: X.AKI */
public final class AKI extends AnonymousClass1PH {
    public final AKB A00;
    public final C23386AKl[] A01;

    public final /* bridge */ /* synthetic */ void onBindViewHolder(AnonymousClass1ZK r4, int i) {
        AKY aky = (AKY) r4;
        C23386AKl aKl = this.A01[i];
        aKl.A00 = i;
        aky.A00.setText(aKl.A01);
        aky.itemView.setOnClickListener(new AKH(this, aKl));
    }

    public AKI(AKB akb, C23386AKl[] aKlArr) {
        this.A00 = akb;
        this.A01 = aKlArr;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0Z0.A03(-673457433);
        int length = this.A01.length;
        AnonymousClass0Z0.A0A(-637541677, A03);
        return length;
    }

    public final AnonymousClass1ZK onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new AKY(LayoutInflater.from(viewGroup.getContext()).inflate(C0003R.layout.layout_iglive_comment_prompt_item, viewGroup, false));
    }
}
