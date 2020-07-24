package p000X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import com.facebook.C0003R;

/* renamed from: X.1Vh  reason: invalid class name and case insensitive filesystem */
public final class C30811Vh {
    public final AnonymousClass1UI A00;
    public final Context A01;

    public final void A00(AnonymousClass2XA r6, AnonymousClass1NJ r7, C36841ih r8, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        C108864mY r3 = new C108864mY(this, r7, r8, i);
        String AZn = r7.A0b().AZn();
        String string = this.A01.getString(C0003R.string.sponsor_tag_label);
        C17050pb.A05(spannableStringBuilder, AZn, string, r3);
        r6.A00.setText(spannableStringBuilder);
        r8.A0U = AZn;
        r8.A0I = Boolean.valueOf(!TextUtils.isEmpty(string));
        r6.A00.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public C30811Vh(Context context, AnonymousClass1UI r2) {
        this.A01 = context;
        this.A00 = r2;
    }
}
