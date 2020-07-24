package p000X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.instagram.common.analytics.intf.AnalyticsEventDebugInfo;

/* renamed from: X.BXG */
public final class BXG extends C27341Hl implements AnonymousClass1HM {
    public TextView A00;
    public ScrollView A01;
    public AnalyticsEventDebugInfo A02;
    public C06590Pq A03;

    public final String getModuleName() {
        return "dict_debug";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final void configureActionBar(AnonymousClass1EX r3) {
        r3.setTitle(this.A02.A01);
        r3.Bo6(true);
        r3.A4S("COPY", new BXF(this));
    }

    public final C06590Pq getSession() {
        return this.A03;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-337325863);
        super.onCreate(bundle);
        this.A03 = AnonymousClass0J1.A00(this.mArguments);
        this.A02 = (AnalyticsEventDebugInfo) this.mArguments.getParcelable("EventInfoFragment.EventInfo");
        AnonymousClass0Z0.A09(2006611628, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1098474441);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.A01 = new ScrollView(getActivity());
        TextView textView = new TextView(getActivity());
        this.A00 = textView;
        textView.setText(this.A02.A00);
        this.A00.setTextSize(12.0f);
        this.A00.setLineSpacing(5.0f, 1.0f);
        this.A00.setPadding(50, 50, 50, 50);
        this.A01.addView(this.A00);
        ScrollView scrollView = this.A01;
        AnonymousClass0Z0.A09(-373379740, A022);
        return scrollView;
    }
}
