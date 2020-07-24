package p000X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0003R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.AJF */
public final class AJF extends AnonymousClass1PH {
    public List A00 = new ArrayList();
    public AJO A01;

    public final AnonymousClass1ZK onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new AJI(this, LayoutInflater.from(viewGroup.getContext()).inflate(C0003R.layout.layout_iglive_fundraiser_donor_empty_state, viewGroup, false));
        }
        if (i == 1) {
            return new AJE(LayoutInflater.from(viewGroup.getContext()).inflate(C0003R.layout.layout_iglive_fundraiser_donor, viewGroup, false), this.A01);
        }
        throw new IllegalStateException(AnonymousClass000.A05("Unsupported view type: ", i));
    }

    public AJF(AJO ajo) {
        this.A01 = ajo;
    }

    public final int getItemCount() {
        int size;
        int A03 = AnonymousClass0Z0.A03(1112581606);
        if (this.A00.isEmpty()) {
            size = 1;
        } else {
            size = this.A00.size();
        }
        AnonymousClass0Z0.A0A(-1624307715, A03);
        return size;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r4.A00.isEmpty() == false) goto L_0x0015;
     */
    public final int getItemViewType(int i) {
        int i2;
        int i3;
        int A03 = AnonymousClass0Z0.A03(-477923172);
        if (i == 0) {
            i2 = 0;
            i3 = 894558841;
        }
        i2 = 1;
        i3 = 1361090312;
        AnonymousClass0Z0.A0A(i3, A03);
        return i2;
    }

    public final void onBindViewHolder(AnonymousClass1ZK r7, int i) {
        int itemViewType = getItemViewType(i);
        if (itemViewType != 0 && itemViewType == 1) {
            AJE aje = (AJE) r7;
            AJL ajl = (AJL) this.A00.get(i);
            C13300iJ r1 = ajl.A00;
            aje.A01 = r1.getId();
            aje.A05.setUrl(r1.ASv(), "ig_live_donor");
            aje.A03.setText(ajl.A00.AZn());
            aje.A02.setText(ajl.A01);
            TextView textView = aje.A04;
            textView.setText(textView.getResources().getString(C0003R.string.live_wave_button_text_with_emoji, new Object[]{"👋"}));
        }
    }
}
