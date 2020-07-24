package p000X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0003R;

/* renamed from: X.B3E */
public final class B3E implements DialogInterface.OnClickListener {
    public final /* synthetic */ B3G A00;
    public final /* synthetic */ C31011Wc A01;

    public B3E(C31011Wc r1, B3G b3g) {
        this.A01 = r1;
        this.A00 = b3g;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Dialog A002 = new AnonymousClass5F4(this.A01.A09, C0003R.layout.results_dialog, C0003R.style.SurveyResultsDialog).A00();
        B3G b3g = this.A00;
        LinearLayout linearLayout = (LinearLayout) A002.findViewById(C0003R.C0005id.resultsList);
        ((TextView) A002.findViewById(C0003R.C0005id.action_bar_textview_title)).setText(A002.getContext().getText(C0003R.string.survey_dialog_survey_results));
        A002.findViewById(C0003R.C0005id.action_bar_button_back).setOnClickListener(new C23962AeM(A002));
        for (B3I b3i : b3g.A04) {
            View inflate = LayoutInflater.from(A002.getContext()).inflate(C0003R.layout.result_row, (ViewGroup) null);
            ((TextView) inflate.findViewById(C0003R.C0005id.question_header)).setText(b3i.A03);
            LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(C0003R.C0005id.answer_list);
            for (B3K answer : b3i.A04) {
                B3T b3t = new B3T(A002.getContext());
                b3t.setAnswer(answer);
                b3t.setTotalQuestionResponders(b3i.A00);
                linearLayout2.addView(b3t);
            }
            Resources resources = A002.getContext().getResources();
            int i2 = b3i.A00;
            ((TextView) inflate.findViewById(C0003R.C0005id.question_footer)).setText(resources.getQuantityString(C0003R.plurals.x_survey_question_responders, i2, new Object[]{Integer.valueOf(i2)}));
            linearLayout.addView(inflate);
        }
        A002.show();
    }
}
