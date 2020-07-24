package p000X;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.facebook.C0003R;

/* renamed from: X.CCS */
public final class CCS implements B0M {
    public final /* synthetic */ CDC A00;
    public final /* synthetic */ CCK A01;

    public CCS(CDC cdc, CCK cck) {
        this.A00 = cdc;
        this.A01 = cck;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r4.A00.A00 == false) goto L_0x0011;
     */
    public final void AvH(View view, boolean z) {
        boolean z2;
        this.A01.A01(z);
        CCK cck = this.A01;
        boolean z3 = true;
        if (z) {
            z2 = true;
        }
        z2 = false;
        cck.A00(z2);
        String str = (String) view.getTag();
        CCK cck2 = this.A01;
        if (!z || CDC.A01(this.A00, str)) {
            z3 = false;
        }
        TextView textView = (TextView) cck2.findViewById(C0003R.C0005id.warning_text);
        if (!TextUtils.isEmpty(textView.getText())) {
            int i = 8;
            if (z3) {
                i = 0;
            }
            textView.setVisibility(i);
        }
    }
}
