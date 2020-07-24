package p000X;

import android.app.Activity;
import android.app.Dialog;
import android.os.Handler;
import android.os.SystemClock;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.facebook.C0003R;

/* renamed from: X.1Wc  reason: invalid class name and case insensitive filesystem */
public final class C31011Wc extends C27591Il {
    public int A00 = 0;
    public Dialog A01;
    public Dialog A02;
    public TextView A03;
    public B3G A04;
    public B3N A05;
    public boolean A06 = false;
    public boolean A07;
    public final long A08 = SystemClock.elapsedRealtime();
    public final Activity A09;
    public final Handler A0A;
    public final C27371Ho A0B;
    public final C27321Hj A0C;
    public final AnonymousClass0C1 A0D;

    public static void A00(C31011Wc r2) {
        r2.A01 = null;
        r2.A02 = null;
        r2.A04 = null;
        r2.A06 = false;
        r2.A03 = null;
        AnonymousClass0ZA.A02(r2.A0A, 3);
        C27321Hj r0 = r2.A0C;
        if (r0 != null) {
            r0.A0C(r2);
        }
    }

    public static void A01(C31011Wc r8) {
        AnonymousClass0ZA.A02(r8.A0A, 3);
        if (r8.A0C.A00 == 0 && !r8.A07) {
            AnonymousClass0ZA.A03(r8.A0A, 3, (long) ((int) Math.max(2000, 15000 - (SystemClock.elapsedRealtime() - r8.A08))));
        }
    }

    public static void A03(C31011Wc r5, B3G b3g, String[] strArr) {
        AnonymousClass0P4 A002;
        Integer num;
        B3I b3i = (B3I) b3g.A04.get(r5.A00);
        b3i.A00++;
        AnonymousClass0C1 r3 = r5.A0D;
        C27371Ho r2 = r5.A0B;
        if (b3g.A00 == Constants.ONE) {
            A002 = AnonymousClass0P4.A00(AnonymousClass000.A0E("instagram_ad_", "survey_question_response"), r2);
            A002.A0J("responses", strArr);
            boolean z = false;
            if (b3g.A02 != null) {
                z = true;
            }
            A002.A0A("show_primer", Boolean.valueOf(z));
            A002.A0G("question_id", b3i.A02);
            A002.A0G("tracking_token", b3g.A03);
            num = Constants.ONE;
        } else {
            A002 = AnonymousClass0P4.A00("user_sentiment_survey", r2);
            A002.A0G("survey_id", b3g.A01);
            A002.A0G("selected_survey_answer", strArr[0]);
            num = Constants.ZERO;
        }
        B39.A00(r3, A002, num);
        r5.A00++;
        int size = b3g.A04.size() - 1;
        int i = r5.A00;
        if (i > size) {
            r5.A01.findViewById(C0003R.C0005id.alertTitleContainer).setVisibility(8);
            if (!b3g.A05) {
                ((TextView) r5.A01.findViewById(C0003R.C0005id.button_blue)).setVisibility(0);
            }
            ((ViewFlipper) r5.A01.findViewById(C0003R.C0005id.surveyFlipper)).showNext();
            r5.A00 = 0;
            return;
        }
        A02(r5, r5.A01, b3g, i);
    }

    public C31011Wc(Activity activity, AnonymousClass0C1 r4, C27371Ho r5, C27321Hj r6) {
        this.A09 = activity;
        this.A0B = r5;
        this.A0C = r6;
        this.A0D = r4;
        this.A0A = new C31021Wd(this);
    }

    public static void A02(C31011Wc r4, Dialog dialog, B3G b3g, int i) {
        B3I b3i = (B3I) b3g.A04.get(i);
        r4.A03.setText(b3i.A03);
        ((ListView) dialog.findViewById(C0003R.C0005id.multiQuestionSurveyList)).setAdapter(new B3Q(b3i, r4.A05));
        if (b3g.A00 == Constants.ZERO) {
            AnonymousClass0C1 r3 = r4.A0D;
            AnonymousClass0P4 A002 = AnonymousClass0P4.A00("user_sentiment_survey_presented", r4.A0B);
            A002.A0G("survey_id", b3g.A01);
            B39.A00(r3, A002, Constants.ZERO);
        }
    }

    public final void A08(C255119b r3, int i) {
        int A032 = AnonymousClass0Z0.A03(1709331444);
        A01(this);
        AnonymousClass0Z0.A0A(1326561033, A032);
    }
}
