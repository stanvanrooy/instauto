package p000X;

import android.os.Message;
import android.os.MessageQueue;
import java.lang.reflect.Field;

/* renamed from: X.0Ls  reason: invalid class name and case insensitive filesystem */
public final class C05730Ls extends AnonymousClass0ON {
    public Field A00;

    public C05730Ls() {
        super((Object) null);
    }

    public final /* bridge */ /* synthetic */ Object A01(Object obj) {
        return (Message) this.A00.get((MessageQueue) obj);
    }

    public final void A02() {
        Field declaredField = MessageQueue.class.getDeclaredField("mMessages");
        this.A00 = declaredField;
        declaredField.setAccessible(true);
    }
}
