package p000X;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0003R;
import com.instagram.business.insights.p014ui.InsightsView;
import com.instagram.p009ui.widget.spinner.SpinnerImageView;
import java.util.Map;

/* renamed from: X.C9L */
public final class C9L extends C27341Hl {
    public View A00;
    public View A01;
    public View A02;
    public C9M A03;
    public InsightsView A04;
    public InsightsView A05;
    public SpinnerImageView A06;
    public AnonymousClass0C1 A07;
    public String A08;

    public final String getModuleName() {
        return "insights_story";
    }

    public static void A00(C9L c9l) {
        AnonymousClass2OA r2 = new AnonymousClass2OA(c9l.getContext());
        r2.A03 = c9l.getString(C0003R.string.insights_value_not_available_dialog_title);
        r2.A0M(c9l.getString(C0003R.string.insights_value_not_available_dialog_message));
        r2.A0A(C0003R.string.f118ok, (DialogInterface.OnClickListener) null);
        r2.A03().show();
    }

    public static void A01(C9L c9l, Integer num, AnonymousClass1HD r14) {
        String str;
        C9M c9m = c9l.A03;
        if (c9m != null) {
            C9Q c9q = c9m.A03;
            AnonymousClass0a4.A06(c9q);
            C27355CAa cAa = c9m.A06;
            Integer num2 = Constants.A0C;
            Integer num3 = Constants.A03;
            Integer num4 = Constants.A0A;
            String str2 = c9q.A06;
            String str3 = c9q.A05;
            String str4 = c9q.A04;
            C9U c9u = c9q.A00;
            if (c9u == null) {
                str = null;
            } else {
                str = c9u.A00;
            }
            cAa.A05(num2, num3, num4, num, num2, (Map) null, str2, str3, str4, str);
            AnonymousClass2TH r1 = new AnonymousClass2TH(c9l.getSession());
            r1.A00 = 0.35f;
            r1.A0T = false;
            AnonymousClass2TI A002 = r1.A00();
            Context context = c9l.getContext();
            c9l.getChildFragmentManager();
            A002.A01(context, r14);
        }
    }

    public final void A02(String str) {
        C8J c8j;
        if (str != null) {
            C9M c9m = this.A03;
            if (c9m != null) {
                C9Q c9q = c9m.A03;
                if (c9q != null && !str.equals(c9q.A05)) {
                    C9M.A02(c9m);
                }
                if ((c9m.A03 == null && c9m.A02 == null) || ((c8j = c9m.A02) != null && !str.equals(c8j.A02))) {
                    if (c9m.A04) {
                        C9L c9l = c9m.A07;
                        C06220Of.A0T(c9l.A00, 8);
                        C06220Of.A0T(c9l.A02, 8);
                        C06220Of.A0T(c9l.A06, 0);
                        C06220Of.A0T(c9l.A01, 8);
                    }
                    c9m.A00 = System.currentTimeMillis();
                    C8J c8j2 = new C8J(c9m.A08, str, Constants.ZERO, c9m);
                    c9m.A02 = c8j2;
                    if (!C8Q.A04(c8j2)) {
                        C12810hQ.A02(C8Q.A00(c8j2, AGL.A00(c8j2.A01).toLowerCase(), new C9T(c8j2.A03), new C30338DaK(c8j2)));
                        return;
                    }
                    return;
                }
                return;
            }
            this.A08 = str;
        }
    }

    public final C06590Pq getSession() {
        return AnonymousClass0J1.A06(this.mArguments);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-2037500229);
        super.onCreate(bundle);
        AnonymousClass0C1 r2 = (AnonymousClass0C1) getSession();
        this.A07 = r2;
        this.A03 = new C9M(r2, new C27355CAa(r2, this), this);
        AnonymousClass0Z0.A09(662804967, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(680235617);
        View inflate = layoutInflater.inflate(C0003R.layout.insights_story_fragment, viewGroup, false);
        AnonymousClass0Z0.A09(1391701165, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(2018646576);
        super.onDestroy();
        C9M c9m = this.A03;
        if (c9m != null) {
            c9m.Azd();
        }
        AnonymousClass0Z0.A09(561330357, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-846211614);
        this.A06 = null;
        this.A05 = null;
        this.A04 = null;
        this.A01 = null;
        this.A00 = null;
        this.A02 = null;
        super.onDestroyView();
        C9M c9m = this.A03;
        if (c9m != null) {
            c9m.Azh();
        }
        AnonymousClass0Z0.A09(1657913136, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A06 = (SpinnerImageView) view.findViewById(C0003R.C0005id.story_insights_loading_spinner);
        this.A05 = (InsightsView) view.findViewById(C0003R.C0005id.story_insights_interactions);
        this.A04 = (InsightsView) view.findViewById(C0003R.C0005id.story_insights_discovery);
        this.A01 = view.findViewById(C0003R.C0005id.story_insights_error_view);
        this.A00 = view.findViewById(C0003R.C0005id.story_insights_content_view);
        this.A02 = view.findViewById(C0003R.C0005id.story_insights_not_enough_reach);
        C06220Of.A0T(this.A00, 8);
        C06220Of.A0T(this.A02, 8);
        C06220Of.A0T(this.A06, 0);
        C06220Of.A0T(this.A01, 8);
        C9M c9m = this.A03;
        if (c9m != null) {
            c9m.BVf(view, bundle);
        }
        InsightsView insightsView = this.A05;
        if (insightsView != null) {
            insightsView.A06 = new C9N(this);
        }
        InsightsView insightsView2 = this.A04;
        if (insightsView2 != null) {
            insightsView2.A06 = new C9O(this);
        }
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && bundle2.getBoolean(AnonymousClass40t.$const$string(49), false)) {
            String str = this.A08;
            if (str == null) {
                A02(bundle2.getString(AnonymousClass40t.$const$string(50)));
            } else {
                A02(str);
            }
        }
    }
}
