package p000X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0003R;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1Pv  reason: invalid class name and case insensitive filesystem */
public final class C29421Pv extends C29121Or {
    public final Context A00;
    public final AnonymousClass1L4 A01;
    public final AnonymousClass0C1 A02;

    public final void A72(C29491Qc r2, Object obj, Object obj2) {
        r2.A00(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C29421Pv(Context context, AnonymousClass0C1 r2, AnonymousClass1L4 r3) {
        this.A00 = context;
        this.A02 = r2;
        this.A01 = r3;
    }

    public final void A6f(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0Z0.A03(1435552226);
        AnonymousClass0C1 r9 = this.A02;
        AnonymousClass5U3 r3 = (AnonymousClass5U3) view.getTag();
        AnonymousClass1L4 r8 = this.A01;
        r3.A02.setOnClickListener(new C124105Tk(r8));
        List unmodifiableList = Collections.unmodifiableList(((C124205Tu) obj).A02);
        boolean A012 = C124135Tn.A01(r3.A04, (C124215Tv) unmodifiableList.get(0), 0, r9, r8);
        boolean A013 = C124135Tn.A01(r3.A06, (C124215Tv) unmodifiableList.get(1), 1, r9, r8);
        boolean A014 = C124135Tn.A01(r3.A05, (C124215Tv) unmodifiableList.get(2), 2, r9, r8);
        if (A012 || A013 || A014) {
            int dimensionPixelSize = r3.A01.getResources().getDimensionPixelSize(C0003R.dimen.in_feed_netego_follow_requests_container_padding);
            r3.A01.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
            r3.A01.setVisibility(0);
            r3.A00.setVisibility(0);
        } else {
            r3.A01.setPadding(0, 0, 0, 0);
            r3.A01.setVisibility(8);
            r3.A00.setVisibility(8);
        }
        AnonymousClass0Z0.A0A(843203947, A03);
    }

    public final View ABB(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0Z0.A03(620742040);
        View inflate = LayoutInflater.from(this.A00).inflate(C0003R.layout.netego_follow_requests, viewGroup, false);
        AnonymousClass5U3 r3 = new AnonymousClass5U3();
        r3.A01 = inflate;
        r3.A00 = inflate.findViewById(C0003R.C0005id.header);
        r3.A03 = (TextView) inflate.findViewById(C0003R.C0005id.netego_title);
        r3.A02 = (TextView) inflate.findViewById(C0003R.C0005id.netego_cta);
        r3.A04 = C124135Tn.A00(inflate.findViewById(C0003R.C0005id.follow_request_one));
        r3.A06 = C124135Tn.A00(inflate.findViewById(C0003R.C0005id.follow_request_two));
        r3.A05 = C124135Tn.A00(inflate.findViewById(C0003R.C0005id.follow_request_three));
        inflate.setTag(r3);
        AnonymousClass0Z0.A0A(1209613846, A03);
        return inflate;
    }
}
