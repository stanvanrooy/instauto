package p000X;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.0Pc  reason: invalid class name and case insensitive filesystem */
public final class C06450Pc implements Handler.Callback {
    public final /* synthetic */ AnonymousClass0PR A00;

    public C06450Pc(AnonymousClass0PR r1) {
        this.A00 = r1;
    }

    public final boolean handleMessage(Message message) {
        AnonymousClass0PV r4 = (AnonymousClass0PV) message.obj;
        View view = r4.A01;
        if (view != null) {
            r4.A02.B7H(view, r4.A00, (ViewGroup) null);
        }
        AnonymousClass0PU r2 = this.A00.A02;
        r4.A02 = null;
        r4.A03 = null;
        r4.A00 = 0;
        r4.A01 = null;
        r2.A00.BaL(r4);
        return true;
    }
}
