package p000X;

import android.text.method.LinkMovementMethod;
import com.google.common.collect.ImmutableList;
import com.instagram.common.p004ui.base.IgTextView;

/* renamed from: X.CJ6 */
public final class CJ6 extends C17920r1 {
    public final /* synthetic */ CJ5 A00;

    public CJ6(CJ5 cj5) {
        this.A00 = cj5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        if (r0 == false) goto L_0x002f;
     */
    public final void onFail(C43791v5 r6) {
        String str;
        Object obj;
        int A03 = AnonymousClass0Z0.A03(-1039643832);
        if (r6.A02()) {
            str = r6.A01.getMessage();
        } else if (!r6.A03() || (obj = r6.A00) == null) {
            str = null;
        } else {
            str = ((C27587CJg) obj).getErrorMessage();
        }
        CJ5.A04(this.A00, str);
        this.A00.A0B.B3V();
        CJ5 cj5 = this.A00;
        CJ4 cj4 = cj5.A06;
        AnonymousClass6MW r2 = cj5.A09;
        if (r2 != null) {
            boolean z = false;
            if (AnonymousClass6MW.STORY_COMMENTS == r2) {
                z = true;
            }
        }
        AnonymousClass6NI.A04(cj4.getActivity());
        AnonymousClass0Z0.A0A(913203226, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0Z0.A03(834743181);
        CJ5.A00(this.A00);
        AnonymousClass0Z0.A0A(1242288525, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0Z0.A03(-1220533332);
        CJ5.A01(this.A00);
        AnonymousClass0Z0.A0A(1701133533, A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a5, code lost:
        if (r0 == false) goto L_0x00a7;
     */
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        IgTextView igTextView;
        int A03 = AnonymousClass0Z0.A03(-1985509767);
        C27587CJg cJg = (C27587CJg) obj;
        int A032 = AnonymousClass0Z0.A03(1772396484);
        C27585CJe cJe = cJg.A00;
        if (cJe.A03.booleanValue()) {
            CJ5.A02(this.A00);
            CJ5 cj5 = this.A00;
            cj5.A02 = cJe.A04;
            cj5.A01 = cJg.A01;
            CJ4 cj4 = cj5.A06;
            cj4.A02.A0C(cJe.A02.A00);
            if (!(cJe.A00 == null || (igTextView = cj4.A00) == null)) {
                igTextView.setVisibility(0);
                cj4.A00.setText(cJe.A00.A00());
                cj4.A00.setMovementMethod(LinkMovementMethod.getInstance());
            }
            CIh cIh = cj4.A04;
            String str = cJe.A01.A00;
            ImmutableList A09 = ImmutableList.A09(cJe.A05);
            cIh.A02 = str;
            cIh.A03.clear();
            if (A09 != null && !A09.isEmpty()) {
                cIh.A03.addAll(A09);
            }
            cIh.A01 = null;
            cIh.A00 = null;
            CIh.A00(cIh);
        } else {
            CJ5.A04(this.A00, "StartFRXReportModel is not enabled");
            this.A00.A0B.B3V();
            CJ5 cj52 = this.A00;
            CJ4 cj42 = cj52.A06;
            AnonymousClass6MW r2 = cj52.A09;
            if (r2 != null) {
                boolean z = false;
                if (AnonymousClass6MW.STORY_COMMENTS == r2) {
                    z = true;
                }
            }
            AnonymousClass6NI.A04(cj42.getActivity());
        }
        AnonymousClass0Z0.A0A(-1226981264, A032);
        AnonymousClass0Z0.A0A(420279273, A03);
    }
}
