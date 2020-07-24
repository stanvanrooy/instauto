package p000X;

import android.view.View;
import android.view.ViewStub;
import com.facebook.C0003R;
import com.instagram.business.instantexperiences.p028ui.InstantExperiencesAutofillBar;
import java.util.List;

/* renamed from: X.B1I */
public final class B1I implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ B1K A01;
    public final /* synthetic */ B15 A02;
    public final /* synthetic */ List A03;

    public B1I(B1K b1k, View view, List list, B15 b15) {
        this.A01 = b1k;
        this.A00 = view;
        this.A03 = list;
        this.A02 = b15;
    }

    public final void run() {
        if (this.A01.A00 == null) {
            this.A01.A00 = (InstantExperiencesAutofillBar) ((ViewStub) this.A00.findViewById(C0003R.C0005id.instant_experiences_autofill_bar)).inflate();
        }
        this.A01.A00.A00(this.A03, new B1J(this));
        this.A01.A02.A01(true);
    }
}
