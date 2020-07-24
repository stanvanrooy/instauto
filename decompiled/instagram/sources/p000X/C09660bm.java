package p000X;

import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.provider.atrace.Atrace;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0bm  reason: invalid class name and case insensitive filesystem */
public final class C09660bm extends AnonymousClass0GW {
    public static final int A00 = ProvidersRegistry.A00.A02("atrace");

    public C09660bm() {
        super("profilo_atrace");
    }

    public final int getSupportedProviders() {
        return A00;
    }

    public final void disable() {
        Method method;
        int A03 = AnonymousClass0Z0.A03(1420678510);
        if (Atrace.hasHacks()) {
            Atrace.restoreSystraceNative();
            Field field = AnonymousClass0HI.A00;
            if (!(field == null || (method = AnonymousClass0HI.A01) == null)) {
                try {
                    field.set((Object) null, method.invoke((Object) null, new Object[0]));
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
        }
        AnonymousClass0Z0.A0A(-1450636393, A03);
    }

    public final void enable() {
        Method method;
        int A03 = AnonymousClass0Z0.A03(2059097745);
        if (Atrace.hasHacks()) {
            Atrace.enableSystraceNative();
            Field field = AnonymousClass0HI.A00;
            if (!(field == null || (method = AnonymousClass0HI.A01) == null)) {
                try {
                    field.set((Object) null, method.invoke((Object) null, new Object[0]));
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
        }
        AnonymousClass0Z0.A0A(-252517447, A03);
    }

    public final int getTracingProviders() {
        if (Atrace.isEnabled()) {
            return A00;
        }
        return 0;
    }
}
