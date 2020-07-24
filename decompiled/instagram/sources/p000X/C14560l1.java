package p000X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContextable;
import java.util.concurrent.Executors;

/* renamed from: X.0l1  reason: invalid class name and case insensitive filesystem */
public final class C14560l1 implements CallerContextable {
    public static final String A02 = AnonymousClass000.A0E("i18n", C14560l1.class.getName());
    public final C14650lH A00;
    public final C14570l7 A01;

    public C14560l1(Context context) {
        this.A01 = C14570l7.A00(context);
        this.A00 = new C14650lH(context, new C14660lI(context), this.A01, new C14670lJ(), new C14690lL(), new C14720lO(), new C14730lP(), new C14750lS(), Executors.newSingleThreadExecutor());
    }
}
