package p000X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.facebook.C0003R;

/* renamed from: X.1f1  reason: invalid class name and case insensitive filesystem */
public final class C34611f1 implements C32211am {
    public final /* synthetic */ C34601f0 A00;

    public C34611f1(C34601f0 r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void B7G(View view) {
        TextView textView = (TextView) view;
        C34601f0 r0 = this.A00;
        r0.A01 = textView;
        Context context = textView.getContext();
        r0.A00 = context;
        boolean A02 = C06400Ox.A02(context);
        int i = C0003R.C0004drawable.chevron_right;
        if (A02) {
            i = C0003R.C0004drawable.chevron_left;
        }
        this.A00.A01.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, C019000b.A03(context, i), (Drawable) null);
    }
}
