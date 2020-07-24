package p000X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;
import java.lang.reflect.Method;

/* renamed from: X.C0H */
public final class C0H {
    public JsonDeserializer A00;
    public final C27148BzD A01;
    public final C0L A02;
    public final Method A03;

    public final void A02(Object obj, String str, Object obj2) {
        String name;
        try {
            this.A03.invoke(obj, new Object[]{str, obj2});
        } catch (Exception e) {
            if (e instanceof IllegalArgumentException) {
                if (obj2 == null) {
                    name = "[NULL]";
                } else {
                    name = obj2.getClass().getName();
                }
                StringBuilder sb = new StringBuilder("Problem deserializing \"any\" property '");
                sb.append(str);
                sb.append(AnonymousClass000.A0J("' of class ", this.A03.getDeclaringClass().getName(), " (expected type: "));
                sb.append(this.A02);
                sb.append("; actual type: ");
                sb.append(name);
                sb.append(")");
                String message = e.getMessage();
                if (message != null) {
                    sb.append(", problem: ");
                    sb.append(message);
                } else {
                    sb.append(" (no error message provided)");
                }
                throw new C27125Bya(sb.toString(), (C116574zW) null, e);
            } else if (!(e instanceof IOException)) {
                boolean z = e instanceof RuntimeException;
                Throwable th = e;
                if (z) {
                    throw ((RuntimeException) e);
                }
                while (th.getCause() != null) {
                    th = th.getCause();
                }
                throw new C27125Bya(th.getMessage(), (C116574zW) null, th);
            } else {
                throw ((IOException) e);
            }
        }
    }

    public final String toString() {
        return AnonymousClass000.A0J("[any property on class ", this.A03.getDeclaringClass().getName(), "]");
    }

    public C0H(C27148BzD bzD, Method method, C0L c0l, JsonDeserializer jsonDeserializer) {
        this.A01 = bzD;
        this.A02 = c0l;
        this.A03 = method;
        this.A00 = jsonDeserializer;
    }

    public final Object A00(C13080hr r3, C27123ByY byY) {
        if (r3.A0g() == C13120hv.VALUE_NULL) {
            return null;
        }
        return this.A00.A06(r3, byY);
    }

    public final void A01(C13080hr r2, C27123ByY byY, Object obj, String str) {
        A02(obj, str, A00(r2, byY));
    }
}
