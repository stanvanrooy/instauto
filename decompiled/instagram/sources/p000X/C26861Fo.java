package p000X;

import android.view.View;
import com.instagram.mainactivity.MainActivity;

/* renamed from: X.1Fo  reason: invalid class name and case insensitive filesystem */
public final class C26861Fo implements View.OnLongClickListener {
    public final /* synthetic */ MainActivity A00;

    public C26861Fo(MainActivity mainActivity) {
        this.A00 = mainActivity;
    }

    public final boolean onLongClick(View view) {
        this.A00.Bl4(AnonymousClass1DU.SEARCH, false);
        this.A00.A05().A16("composite_search_back_stack", 1);
        MainActivity mainActivity = this.A00;
        C52362Om r2 = new C52362Om(mainActivity, mainActivity.A06);
        r2.A02 = C22120xs.A00().A02().A00();
        r2.A04 = "composite_search_back_stack";
        r2.A02();
        return true;
    }
}
