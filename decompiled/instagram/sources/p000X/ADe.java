package p000X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.ADe */
public abstract class ADe extends AnonymousClass1PH {
    public int A00 = -1;
    public int A01 = -1;
    public RecyclerView A02;
    public final C23164AAs A03;
    public final AEC A04;
    public final List A05 = new ArrayList();
    public final Map A06 = new HashMap();

    public AEB A01(Context context) {
        if (this instanceof C23216ADf) {
            return new C23215ADd(context);
        }
        C23215ADd aDd = new C23215ADd(context);
        aDd.setLayoutParams(new AnonymousClass1ZN(-1, -2));
        return aDd;
    }

    public Object A02() {
        return !(this instanceof C23216ADf) ? ((C23217ADg) this).A01 : ((C23216ADf) this).A02;
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.A02 = null;
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(AnonymousClass1ZK r12, int i) {
        ViewGroup.LayoutParams layoutParams;
        C23159AAn A002;
        C211709Bc r1;
        C211709Bc r13;
        C23230ADt aDt = (C23230ADt) r12;
        AEC aec = this.A04;
        if (aec == null || this.A01 == -1) {
            layoutParams = null;
        } else {
            Object obj = this.A05.get(i);
            int i2 = this.A01;
            int i3 = this.A00;
            AnonymousClass2D8 r5 = (AnonymousClass2D8) obj;
            if (aec.A00 == 1) {
                layoutParams = new ViewGroup.LayoutParams(-1, -2);
            } else {
                layoutParams = new ViewGroup.LayoutParams(-2, -1);
            }
            C15400mu r6 = r5.A00;
            if (r6 != null && (r6 instanceof C23226ADp)) {
                C23226ADp aDp = (C23226ADp) r6;
                int i4 = aec.A00;
                if (i4 == 0 && (r13 = aDp.A01) != null) {
                    switch (r13.A01.intValue()) {
                        case 0:
                            layoutParams.width = (int) r13.A00;
                            break;
                        case 1:
                            layoutParams.width = (int) (((double) (r13.A00 * ((float) i2))) / 100.0d);
                            break;
                    }
                }
                if (i4 == 1 && (r1 = aDp.A00) != null) {
                    switch (r1.A01.intValue()) {
                        case 0:
                            layoutParams.height = (int) r1.A00;
                            break;
                        case 1:
                            layoutParams.height = (int) (((double) (r1.A00 * ((float) i3))) / 100.0d);
                            break;
                    }
                }
            }
            aDt.itemView.setLayoutParams(layoutParams);
        }
        if (aDt.A01 && layoutParams == null) {
            aDt.itemView.setLayoutParams(this.A02.A0L.A1F());
        }
        boolean z = false;
        if (layoutParams != null) {
            z = true;
        }
        aDt.A01 = z;
        AnonymousClass2D9 r3 = (AnonymousClass2D9) this.A05.get(i);
        C23159AAn aAn = (C23159AAn) this.A06.get(Long.valueOf(getItemId(i)));
        Context context = aDt.itemView.getContext();
        int AIA = this.A03.AIA(r3, this.A01);
        int AI7 = this.A03.AI7(r3, this.A00);
        if (C23159AAn.A02(r3, AIA, AI7, aAn)) {
            A002 = aAn;
        } else {
            A002 = C23159AAn.A00(context, new C23227ADq(this, r3), A02(), aAn, 0, AIA, AI7);
        }
        if (A002 != aAn) {
            this.A06.put(Long.valueOf(getItemId(i)), A002);
        }
        ((AEB) aDt.itemView).setRenderTree(A002.A03);
        aDt.A00 = this.A05.get(i);
    }

    public final /* bridge */ /* synthetic */ void onViewRecycled(AnonymousClass1ZK r3) {
        C23230ADt aDt = (C23230ADt) r3;
        super.onViewRecycled(aDt);
        ((AEB) aDt.itemView).setRenderTree((C23161AAp) null);
        aDt.A00 = null;
    }

    public ADe(AEC aec, C23164AAs aAs) {
        this.A04 = aec;
        this.A03 = aAs;
        setHasStableIds(true);
    }

    public final void A03(C211479Ad r5) {
        Object AOn = r5.AOn();
        if (AOn != null) {
            for (Map.Entry entry : ((Map) AOn).entrySet()) {
                this.A06.put(entry.getKey(), (C23159AAn) entry.getValue());
            }
            int width = r5.getWidth();
            int height = r5.getHeight();
            if (this.A01 != width || this.A00 != height) {
                this.A01 = width;
                this.A00 = height;
                notifyDataSetChanged();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("MeasureResult should contain LayoutData");
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0Z0.A03(-1617054002);
        int size = this.A05.size();
        AnonymousClass0Z0.A0A(1509134364, A032);
        return size;
    }

    public final long getItemId(int i) {
        int A032 = AnonymousClass0Z0.A03(-718755108);
        long AIE = ((AnonymousClass2D8) this.A05.get(i)).AIE();
        AnonymousClass0Z0.A0A(-1269378423, A032);
        return AIE;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass1ZK onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C23230ADt((View) A01(viewGroup.getContext()));
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.A02 = recyclerView;
    }
}
