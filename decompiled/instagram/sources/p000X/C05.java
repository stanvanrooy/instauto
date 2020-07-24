package p000X;

import com.fasterxml.jackson.databind.JsonSerializer;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.IdentityHashMap;

/* renamed from: X.C05 */
public abstract class C05 extends C06 implements Serializable {
    public transient ArrayList A00;
    public transient IdentityHashMap A01;

    public C05 A0G(C27191C0q c0q, C2H c2h) {
        return new C2X((C2X) this, c0q, c2h);
    }

    public final void A0H(C13460iZ r6, Object obj) {
        JsonSerializer jsonSerializer;
        boolean z = false;
        if (obj == null) {
            jsonSerializer = this.A02;
        } else {
            Class<?> cls = obj.getClass();
            jsonSerializer = A09(cls, (C27148BzD) null);
            z = this.A05.A06(C15.WRAP_ROOT_VALUE);
            if (z) {
                r6.A0T();
                r6.A0b(this.A09.A00(cls, this.A05));
            }
        }
        try {
            jsonSerializer.A0B(obj, r6, this);
            if (z) {
                r6.A0Q();
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            String message = e2.getMessage();
            if (message == null) {
                message = AnonymousClass000.A0J("[no message for ", e2.getClass().getName(), "]");
            }
            throw new C27125Bya(message, (Throwable) e2);
        }
    }

    public C05() {
    }

    public C05(C06 c06, C27191C0q c0q, C2H c2h) {
        super(c06, c0q, c2h);
    }
}
