package p000X;

import android.os.Bundle;
import com.instagram.business.insights.fragment.InsightsRNChartFragment;
import java.util.ArrayList;

/* renamed from: X.0yB  reason: invalid class name and case insensitive filesystem */
public final class C22300yB {
    public final C27341Hl A00(String str, String str2, String str3, String str4, Integer num, Integer num2, ArrayList arrayList, String str5, String str6) {
        InsightsRNChartFragment insightsRNChartFragment = new InsightsRNChartFragment();
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", str);
        bundle.putString("ARG.Chart.Title", str2);
        bundle.putString("ARG.Chart.EmptyText", str3);
        bundle.putString("ARG.Chart.Type", str4);
        bundle.putString("ARG.Chart.Parent", AGM.A01(num));
        bundle.putString("ARG.Chart.Unit", AGM.A01(num2));
        bundle.putParcelableArrayList("ARG.Chart.Filters", arrayList);
        bundle.putString("ARG.Chart.Help.Title", str5);
        bundle.putString("ARG.Chart.Help.Message", str6);
        bundle.putStringArray("ARG.Chart.Help.Items", (String[]) null);
        insightsRNChartFragment.setArguments(bundle);
        return insightsRNChartFragment;
    }

    public final C27341Hl A02(String str, String str2, String str3, String[] strArr) {
        return A01(str, str2, str3, (String) null, (String) null, (String) null, (String) null, strArr);
    }

    public final C27341Hl A01(String str, String str2, String str3, String str4, String str5, String str6, String str7, String[] strArr) {
        C100864Xl r2 = new C100864Xl();
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", str);
        bundle.putString("ARG.Info.Title", str2);
        bundle.putString("ARG.Info.Message", str3);
        if (strArr != null) {
            bundle.putStringArray("ARG.Info.Items", strArr);
        }
        bundle.putString("ARG.Info.SpecialItem.Title", str4);
        bundle.putString("ARG.Info.SpecialItem.Message", str5);
        bundle.putString("ARG.Info.SpecialItem.Spannable", str6);
        bundle.putString("ARG.Info.SpecialItem.ClickUrl", str7);
        r2.setArguments(bundle);
        return r2;
    }
}
