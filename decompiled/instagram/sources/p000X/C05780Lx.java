package p000X;

import android.os.MessageQueue;
import java.lang.reflect.Method;

/* renamed from: X.0Lx  reason: invalid class name and case insensitive filesystem */
public final class C05780Lx extends AnonymousClass0ON {
    public Method A00;

    public C05780Lx() {
        super(true);
    }

    public final /* bridge */ /* synthetic */ Object A01(Object obj) {
        return (Boolean) this.A00.invoke((MessageQueue) obj, new Object[0]);
    }

    public final void A02() {
        Method declaredMethod = MessageQueue.class.getDeclaredMethod("isIdling", new Class[0]);
        this.A00 = declaredMethod;
        declaredMethod.setAccessible(true);
    }
}
