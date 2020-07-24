package p000X;

/* renamed from: X.0gQ  reason: invalid class name and case insensitive filesystem */
public final class C12240gQ {
    public static C12240gQ A01;
    public final C12210gM A00;

    public final void A00(C12390gf r8, int i, int i2, boolean z) {
        int i3;
        if (this.A00.A00 && !(r8 instanceof C12370gd) && (r8 instanceof C12380ge)) {
            C12380ge r82 = (C12380ge) r8;
            String A002 = AnonymousClass299.A00(r82.AGu());
            if ("".equals(A002)) {
                A002 = r82.getClass().getSimpleName();
            }
            C45121xK A02 = r82.A02(i, i2);
            Integer valueOf = Integer.valueOf(i2);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(A002);
            stringBuffer.append("_");
            stringBuffer.append(i);
            stringBuffer.append("_");
            if (valueOf != null) {
                i3 = valueOf.intValue();
            } else {
                i3 = 0;
            }
            stringBuffer.append(i3);
            String stringBuffer2 = stringBuffer.toString();
            AnonymousClass29A r0 = (AnonymousClass29A) this.A00.A01.A00.get(stringBuffer2);
            AnonymousClass29A r3 = r0;
            if (r0 != null) {
                if (A02 != null) {
                    r0.A09.A02.putAll(A02.A02);
                    r3.A09.A01.putAll(A02.A01);
                    r3.A09.A00.putAll(A02.A00);
                }
                int i4 = 2;
                if (z) {
                    i4 = 4;
                }
                try {
                    r3.A00(i4);
                    this.A00.AlA(r3);
                    this.A00.A01.A00.remove(stringBuffer2);
                } catch (Throwable th) {
                    AnonymousClass0DB.A0P("MBLog", th, "Failed to end event for %s with trigger id: %d and key: %d, is timed out: %s ", A002, Integer.valueOf(i), valueOf, Boolean.valueOf(z));
                }
            }
        }
    }

    public C12240gQ(C12210gM r1) {
        this.A00 = r1;
    }
}
