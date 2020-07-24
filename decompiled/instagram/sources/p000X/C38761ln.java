package p000X;

import android.widget.TextView;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1ln  reason: invalid class name and case insensitive filesystem */
public final class C38761ln {
    public static void A00(C32231ao r1) {
        TextView textView = r1.A02;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public static void A01(C32231ao r4, List list) {
        if (list.isEmpty()) {
            A00(r4);
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CharSequence charSequence = (CharSequence) it.next();
            if (sb.length() > 0) {
                sb.append("\n");
            }
            sb.append(charSequence);
        }
        if (r4.A02 == null) {
            TextView textView = (TextView) r4.A01.inflate();
            r4.A02 = textView;
            textView.getPaint().setFakeBoldText(true);
        }
        int i = r4.A00;
        if (i != 0) {
            C06220Of.A0I(r4.A02, i);
        }
        r4.A02.setText(sb);
        r4.A02.setVisibility(0);
    }
}
