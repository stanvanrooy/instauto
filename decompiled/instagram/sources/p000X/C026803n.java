package p000X;

import java.io.DataInput;
import java.io.DataOutput;

/* renamed from: X.03n  reason: invalid class name and case insensitive filesystem */
public final class C026803n extends AnonymousClass082 {
    public final AnonymousClass00N A00 = new AnonymousClass00N();
    public final AnonymousClass00N A01 = new AnonymousClass00N();
    public final AnonymousClass00N A02 = new AnonymousClass00N();

    public final long A00() {
        return -3137023965338009377L;
    }

    public final /* bridge */ /* synthetic */ void A01(C035307i r7, DataOutput dataOutput) {
        C021901k r72 = (C021901k) r7;
        int size = this.A02.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (r72.A08((Class) this.A02.A06(i2))) {
                i++;
            }
        }
        dataOutput.writeInt(i);
        for (int i3 = 0; i3 < size; i3++) {
            Class cls = (Class) this.A02.A06(i3);
            if (r72.A08(cls)) {
                AnonymousClass082 r2 = (AnonymousClass082) this.A02.A08(i3);
                dataOutput.writeLong(r2.A00());
                r2.A01(r72.A04(cls), dataOutput);
            }
        }
    }

    public final /* bridge */ /* synthetic */ boolean A02(C035307i r7, DataInput dataInput) {
        C021901k r72 = (C021901k) r7;
        AnonymousClass00N r4 = r72.A00;
        int size = r4.size();
        for (int i = 0; i < size; i++) {
            r72.A07((Class) r4.A06(i), false);
        }
        int readInt = dataInput.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            long readLong = dataInput.readLong();
            AnonymousClass00N r0 = this.A01;
            Long valueOf = Long.valueOf(readLong);
            AnonymousClass082 r2 = (AnonymousClass082) r0.get(valueOf);
            Class cls = (Class) this.A00.get(valueOf);
            if (r2 == null || cls == null || !r2.A02(r72.A04(cls), dataInput)) {
                return false;
            }
            r72.A07(cls, true);
        }
        return true;
    }

    public final void A03(Class cls, AnonymousClass082 r8) {
        AnonymousClass00N r0 = this.A00;
        long A002 = r8.A00();
        Long valueOf = Long.valueOf(A002);
        Class cls2 = (Class) r0.get(valueOf);
        if (cls2 == null || cls2 == cls) {
            this.A02.put(cls, r8);
            this.A01.put(valueOf, r8);
            this.A00.put(valueOf, cls);
            return;
        }
        throw new RuntimeException("Serializers " + cls2.getCanonicalName() + " and " + cls.getCanonicalName() + " have a conflicting tag: `" + A002 + "`.");
    }
}
