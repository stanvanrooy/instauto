package p000X;

import android.text.TextUtils;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.AO1 */
public final class AO1 extends C17920r1 {
    public final /* synthetic */ String A00;
    public final /* synthetic */ C23472ANu A01;

    public AO1(C23472ANu aNu, String str) {
        this.A01 = aNu;
        this.A00 = str;
    }

    public final void onFail(C43791v5 r3) {
        int A03 = AnonymousClass0Z0.A03(717057438);
        if (C23472ANu.A03(this.A01)) {
            this.A01.A04();
        }
        AnonymousClass0Z0.A0A(-149223906, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0Z0.A03(-562155665);
        C23472ANu aNu = this.A01;
        aNu.A0D = false;
        aNu.A03.setVisibility(8);
        AnonymousClass0ZA.A09(this.A01.A0E, new APM(this), 2000, 898404825);
        AnonymousClass0Z0.A0A(6837056, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(-859540180);
        C62462nl r11 = (C62462nl) obj;
        int A032 = AnonymousClass0Z0.A03(-1615089913);
        if (C23472ANu.A03(this.A01)) {
            TextView textView = this.A01.A05;
            int i = 0;
            int i2 = 8;
            if (r11.AOJ().isEmpty()) {
                i2 = 0;
            }
            textView.setVisibility(i2);
            AO6 ao6 = this.A01.A0A;
            List<C13300iJ> AOJ = r11.AOJ();
            List list = ao6.A02;
            ArrayList arrayList = new ArrayList();
            for (C13300iJ r1 : AOJ) {
                if (!list.contains(r1)) {
                    arrayList.add(r1);
                }
            }
            List<C13300iJ> list2 = ao6.A02;
            ArrayList<C13300iJ> arrayList2 = new ArrayList<>();
            for (C13300iJ r12 : list2) {
                if (!AOJ.contains(r12)) {
                    arrayList2.add(r12);
                }
            }
            if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
                ao6.A01.clear();
            }
            ao6.A02.addAll(arrayList);
            ao6.A02.removeAll(arrayList2);
            for (C13300iJ id : arrayList2) {
                ao6.A03.remove(id.getId());
            }
            AO6.A00(ao6);
            if (!TextUtils.isEmpty(this.A01.A0C)) {
                C23472ANu aNu = this.A01;
                aNu.A0A.A01(aNu.A0C);
            }
            for (C13300iJ r0 : r11.AOJ()) {
                if (r0.A1j == Constants.ZERO) {
                    i++;
                }
            }
            C225999o8 r2 = this.A01.A0B;
            if (r2 != null) {
                r2.BW6(r11.AOJ().size(), i, Constants.ONE);
            }
        }
        AnonymousClass0Z0.A0A(1291831734, A032);
        AnonymousClass0Z0.A0A(-523045608, A03);
    }
}
