package p000X;

import android.content.Context;
import com.facebook.C0003R;

/* renamed from: X.0pD  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C16820pD implements AnonymousClass0IT {
    public final /* synthetic */ Context A00;

    public /* synthetic */ C16820pD(Context context) {
        this.A00 = context;
    }

    public final Object get() {
        Context context = this.A00;
        String string = context.getString(C0003R.string.videocall_headline);
        C176837gs r2 = new C176837gs(context);
        String string2 = context.getString(C0003R.string.videocall_minimize_tooltip_text);
        AnonymousClass0a4.A06(string);
        AnonymousClass0a4.A06(r2);
        return new C23878Acr(string, r2, string2);
    }
}
