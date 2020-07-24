package p000X;

import java.util.List;

/* renamed from: X.AJP */
public final class AJP extends C17920r1 {
    public final /* synthetic */ AJO A00;

    public AJP(AJO ajo) {
        this.A00 = ajo;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(-737800304);
        AJQ ajq = (AJQ) obj;
        int A032 = AnonymousClass0Z0.A03(-190167825);
        super.onSuccess(ajq);
        AJF ajf = this.A00.A02;
        ajf.A00.addAll(ajq.A00);
        ajf.notifyDataSetChanged();
        List list = ajq.A00;
        if (list != null) {
            int size = list.size();
            if (size >= 7) {
                this.A00.A00 = 0.7f;
            } else if (size > 3) {
                this.A00.A00 = ((((float) (size - 3)) / 4.0f) * 0.29999998f) + 0.4f;
            } else {
                this.A00.A00 = 0.4f;
            }
            C31201Wx.A01(this.A00.getContext()).A0K(true);
        }
        AnonymousClass0Z0.A0A(-1110226581, A032);
        AnonymousClass0Z0.A0A(1619294230, A03);
    }
}
