package p000X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0003R;
import com.facebook.common.dextricks.OdexSchemeArtXdex;

/* renamed from: X.1Va  reason: invalid class name and case insensitive filesystem */
public final class C30741Va {
    public final AnonymousClass1UL A00;

    public final void A01(C57912ez r12, AnonymousClass1NJ r13) {
        long j;
        String str;
        r12.A00.setVisibility(0);
        r12.A02.setText(C0003R.string.reload_image);
        r12.A02.setOnClickListener(new AnonymousClass41D(this, r13));
        Context context = r12.A00.getContext();
        if (r13.A1W()) {
            int A07 = r13.A07();
            j = 0;
            for (int i = 0; i < A07; i++) {
                long A0J = AnonymousClass12C.A0c.A0J(r13.A0P(i).A0S(context).AZc());
                if (A0J == -1) {
                    A0J = 128000;
                }
                j += A0J;
            }
        } else {
            j = AnonymousClass12C.A0c.A0J(r13.A0S(context).AZc());
            if (j == -1) {
                j = 128000;
            }
        }
        if (j > 1048576) {
            str = (j / 1048576) + " MB";
        } else {
            str = (j / OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED) + " KB";
        }
        r12.A01.setText(str);
    }

    public C30741Va(AnonymousClass1UL r1) {
        this.A00 = r1;
    }

    public static final View A00(Context context, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(C0003R.layout.row_feed_reload, viewGroup, false);
        inflate.setTag(new C57912ez(inflate.findViewById(C0003R.C0005id.row_feed_reload), (TextView) inflate.findViewById(C0003R.C0005id.reload_text), (TextView) inflate.findViewById(C0003R.C0005id.reload_size_text)));
        return inflate;
    }
}
