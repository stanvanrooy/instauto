package p000X;

import android.view.View;
import com.facebook.C0003R;
import java.util.HashMap;

/* renamed from: X.AL9 */
public final class AL9 implements View.OnClickListener {
    public final /* synthetic */ ALP A00;
    public final /* synthetic */ AL6 A01;

    public AL9(ALP alp, AL6 al6) {
        this.A00 = alp;
        this.A01 = al6;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(903913362);
        AL6 al6 = this.A01;
        String[] strArr = ALD.A04;
        switch (C35251g3.A00(strArr, new HashMap(al6.A01.A00.A05)).ordinal()) {
            case 1:
                C35251g3.A02(al6.A01.A01, al6, strArr);
                break;
            case 2:
                C169287Le.A03(al6.A01.A01, C0003R.string.camera_permission_name);
                break;
        }
        AnonymousClass0Z0.A0C(841489416, A05);
    }
}
