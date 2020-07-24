package p000X;

import android.app.Dialog;
import android.os.Handler;
import android.os.Message;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.C0003R;
import java.lang.ref.WeakReference;

/* renamed from: X.1Wd  reason: invalid class name and case insensitive filesystem */
public final class C31021Wd extends Handler {
    public final WeakReference A00;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (r1 == false) goto L_0x0026;
     */
    public final void handleMessage(Message message) {
        boolean z;
        Dialog dialog;
        C31011Wc r4 = (C31011Wc) this.A00.get();
        if (r4 != null && message.what == 3) {
            if (r4.A09.hasWindowFocus()) {
                C27321Hj r0 = r4.A0C;
                if (r0 != null) {
                    boolean A0G = r0.A0C.A01.A0G();
                    z = false;
                }
                z = true;
                if (z) {
                    B3G b3g = r4.A04;
                    if (b3g == null) {
                        return;
                    }
                    if (b3g.A00 != Constants.ONE || r4.A0B.Ahq()) {
                        B3D b3d = new B3D(r4);
                        B3E b3e = new B3E(r4, b3g);
                        r4.A05 = new B3N(r4, b3g);
                        if (b3g.A05) {
                            AnonymousClass5F4 r6 = new AnonymousClass5F4(r4.A09, C0003R.layout.multiple_question_dialog, C0003R.style.IgDialog);
                            r6.A08(true);
                            r6.A09(true);
                            r6.A01(C0003R.string.survey_dialog_title);
                            r6.A07(r6.A01.getString(C0003R.string.survey_dialog_done), b3d);
                            r6.A06(r6.A01.getString(C0003R.string.survey_dialog_view_results), b3e);
                            r4.A01 = r6.A00();
                        } else {
                            String upperCase = r4.A09.getResources().getString(C0003R.string.survey_dialog_done).toUpperCase(r4.A09.getResources().getConfiguration().locale);
                            AnonymousClass5F4 r62 = new AnonymousClass5F4(r4.A09, C0003R.layout.multiple_question_dialog, C0003R.style.IgDialog);
                            r62.A08(true);
                            r62.A09(true);
                            r62.A01(C0003R.string.survey_dialog_title);
                            B3C b3c = new B3C(r4);
                            TextView textView = r62.A07;
                            textView.setText(upperCase);
                            textView.setOnClickListener(new AnonymousClass5F6(r62, b3c, -1));
                            r62.A07.setVisibility(0);
                            Dialog A002 = r62.A00();
                            r4.A01 = A002;
                            ((TextView) A002.findViewById(C0003R.C0005id.button_blue)).setVisibility(8);
                        }
                        r4.A03 = (TextView) r4.A01.findViewById(C0003R.C0005id.multi_question_survey_title);
                        Dialog dialog2 = r4.A01;
                        dialog2.setOnShowListener(new C27523CGn(r4));
                        C31011Wc.A02(r4, dialog2, b3g, r4.A00);
                        ((ListView) dialog2.findViewById(C0003R.C0005id.multiQuestionSurveyList)).setOnItemClickListener(new B3M(r4, b3g));
                        r4.A01.setOnDismissListener(new C26580Bnx(r4));
                        String str = b3g.A02;
                        if (str != null) {
                            String upperCase2 = r4.A09.getResources().getString(C0003R.string.next).toUpperCase(r4.A09.getResources().getConfiguration().locale);
                            AnonymousClass2OA r3 = new AnonymousClass2OA(r4.A09);
                            r3.A0M(str);
                            r3.A07(C0003R.string.survey_dialog_title);
                            r3.A0S(upperCase2, new B3B(r4, b3g), false, Constants.A0C);
                            r3.A0E(new B3A(r4, b3g));
                            r3.A0U(true);
                            r3.A0V(false);
                            Dialog A03 = r3.A03();
                            r4.A02 = A03;
                            A03.setOnShowListener(new C26624Bof(r4));
                            dialog = r4.A02;
                        } else {
                            dialog = r4.A01;
                        }
                        dialog.show();
                        return;
                    }
                    C31011Wc.A00(r4);
                    return;
                }
            }
            C31011Wc.A01(r4);
        }
    }

    public C31021Wd(C31011Wc r2) {
        this.A00 = new WeakReference(r2);
    }
}
