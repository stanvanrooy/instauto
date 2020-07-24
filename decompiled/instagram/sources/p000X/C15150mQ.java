package p000X;

import android.util.LruCache;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.0mQ  reason: invalid class name and case insensitive filesystem */
public final class C15150mQ extends LruCache {
    public final /* synthetic */ C15140mP A00;

    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        try {
            this.A00.A03.invoke(obj2, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException e) {
            AnonymousClass0DB.A0I("BundledLayoutLoader", "Unable to close XMLBlock", e);
        }
    }

    public final int sizeOf(Object obj, Object obj2) {
        return ((Long) obj).intValue();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15150mQ(C15140mP r2) {
        super(98304);
        this.A00 = r2;
    }
}
