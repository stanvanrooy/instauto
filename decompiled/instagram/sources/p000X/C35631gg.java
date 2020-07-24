package p000X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.C0003R;

/* renamed from: X.1gg  reason: invalid class name and case insensitive filesystem */
public final class C35631gg extends AnonymousClass1ZK {
    public final C26571Ea A00;
    public final String A01;
    public final int A02;
    public final int A03;
    public final ViewGroup A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;

    public C35631gg(View view, boolean z) {
        super(view);
        this.A01 = view.getResources().getString(C0003R.string.my_reel_your_story);
        Context context = view.getContext();
        this.A02 = C019000b.A00(context, C0003R.color.igds_secondary_text);
        this.A03 = C019000b.A00(context, z ? C0003R.color.igds_text_on_color : C0003R.color.igds_primary_text);
        this.A04 = (ViewGroup) view.findViewById(C0003R.C0005id.title_container);
        this.A07 = (TextView) view.findViewById(C0003R.C0005id.username);
        this.A06 = (TextView) view.findViewById(C0003R.C0005id.subtitle);
        this.A05 = (TextView) view.findViewById(C0003R.C0005id.plus_one);
        this.A00 = new C26571Ea((ViewStub) view.findViewById(C0003R.C0005id.notification));
    }
}
