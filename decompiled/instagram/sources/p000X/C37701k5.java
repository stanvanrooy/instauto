package p000X;

import java.util.List;

/* renamed from: X.1k5  reason: invalid class name and case insensitive filesystem */
public final class C37701k5 implements Runnable {
    public final /* synthetic */ C37601jv A00;
    public final /* synthetic */ List A01;

    public C37701k5(C37601jv r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public final void run() {
        C37601jv r0 = this.A00;
        AnonymousClass0C1 r5 = r0.A05;
        boolean z = r0.A07;
        int i = r0.A00;
        List list = this.A01;
        String moduleName = r0.A03.getModuleName();
        if (z || i == 0) {
            AnonymousClass1F6.A00(r5).A0C(list, moduleName);
        } else {
            AnonymousClass1F6.A00(r5).A0B(list, moduleName);
        }
    }
}
