package p000X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.C0003R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.AEG */
public final class AEG extends AnonymousClass1PH {
    public final AEJ A00 = new AEJ();
    public final List A01 = new ArrayList();

    public static void A00(AEG aeg, List list, List list2) {
        AnonymousClass1zR.A00(new AEH(aeg, list, list2), true).A03(aeg);
    }

    public final void A01(C13300iJ r5) {
        AEI aei = new AEI(r5, C24309Ala.A04);
        int indexOf = this.A01.indexOf(aei);
        if (indexOf < 0 || !((AEI) this.A01.get(indexOf)).A02.A02()) {
            ArrayList arrayList = new ArrayList(this.A01);
            if (indexOf >= 0) {
                this.A01.set(indexOf, aei);
            } else {
                this.A01.add(aei);
            }
            Collections.sort(this.A01, this.A00);
            A00(this, arrayList, this.A01);
        }
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(AnonymousClass1ZK r6, int i) {
        AEI aei;
        AnonymousClass74M r62 = (AnonymousClass74M) r6;
        if (i < 0 || i >= this.A01.size()) {
            aei = null;
        } else {
            aei = (AEI) this.A01.get(i);
        }
        if (aei != null) {
            r62.A01.setUrl(aei.A03.ASv());
            C24309Ala ala = aei.A02;
            if (ala.A00()) {
                if (aei.A00) {
                    r62.A02.A01 = 0;
                } else {
                    r62.A02.A01 = 1;
                    aei.A00 = true;
                }
                r62.A00.setImageDrawable(r62.A02);
                r62.A00.setVisibility(0);
            } else if (ala.A02()) {
                r62.A00.setVisibility(8);
                r62.A01.setAlpha(0.3f);
                return;
            } else {
                r62.A00.setVisibility(8);
            }
            r62.A01.setAlpha(1.0f);
        }
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0Z0.A03(634919492);
        int size = this.A01.size();
        AnonymousClass0Z0.A0A(829000728, A03);
        return size;
    }

    public final AnonymousClass1ZK onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new AnonymousClass74M(LayoutInflater.from(viewGroup.getContext()).inflate(C0003R.layout.direct_video_call_participant_avatar, viewGroup, false));
    }
}
