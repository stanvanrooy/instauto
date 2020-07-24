package p000X;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializers$CalendarKeySerializer;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializers$DateKeySerializer;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

/* renamed from: X.C2H */
public abstract class C2H {
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0022 A[LOOP:0: B:6:0x0022->B:9:0x0032, LOOP_START, PHI: r3 
      PHI: (r3v2 com.fasterxml.jackson.databind.JsonSerializer) = (r3v0 com.fasterxml.jackson.databind.JsonSerializer), (r3v3 com.fasterxml.jackson.databind.JsonSerializer) binds: [B:5:0x0019, B:9:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    public JsonSerializer A02(C27191C0q c0q, C0L c0l, JsonSerializer jsonSerializer) {
        C27150BzH bzH = (C27150BzH) this;
        C0K A02 = c0q.A02(c0q.A03(c0l.A00));
        C1V[] c1vArr = bzH.A00.A01;
        boolean z = false;
        if (c1vArr.length > 0) {
            z = true;
        }
        JsonSerializer jsonSerializer2 = null;
        if (z) {
            Iterator it = new C27154BzL(c1vArr).iterator();
            while (it.hasNext() && (jsonSerializer2 = ((C1V) it.next()).AEN(c0q, c0l, A02)) == null) {
                while (it.hasNext() && (jsonSerializer2 = ((C1V) it.next()).AEN(c0q, c0l, A02)) == null) {
                }
            }
        }
        if (jsonSerializer2 != null) {
            jsonSerializer = jsonSerializer2;
        } else if (jsonSerializer == null) {
            if (c0l != null) {
                Class<Object> cls = c0l.A00;
                if (cls == String.class) {
                    jsonSerializer = C27155BzN.A01;
                } else if (cls != Object.class) {
                    if (Date.class.isAssignableFrom(cls)) {
                        jsonSerializer = StdKeySerializers$DateKeySerializer.A00;
                    } else if (Calendar.class.isAssignableFrom(cls)) {
                        jsonSerializer = StdKeySerializers$CalendarKeySerializer.A00;
                    }
                }
            }
            jsonSerializer = C27155BzN.A00;
        }
        C27153BzK bzK = bzH.A00;
        if (bzK.A00()) {
            Iterator it2 = new C27154BzL(bzK.A00).iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        return jsonSerializer;
    }

    public C27204C1t A03(C27191C0q c0q, C0L c0l) {
        Collection A00;
        C00 A04 = c0q.A02(c0q.A03(c0l.A00)).A04();
        C27179Bzx A01 = c0q.A01();
        C1e A0A = A01.A0A(c0q, A04, c0l);
        if (A0A == null) {
            A0A = null;
            A00 = null;
        } else {
            A00 = c0q.A00.A00(A04, c0q, A01);
        }
        if (A0A != null) {
            return A0A.A76(c0q, c0l, A00);
        }
        return null;
    }

    public abstract JsonSerializer A04(C06 c06, C0L c0l);
}
