package p000X;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* renamed from: X.0fA  reason: invalid class name and case insensitive filesystem */
public abstract class C11560fA implements C11570fB {
    public final C11590fD A00 = C11600fE.A00(new C11630fH(this));
    public final C11590fD A01 = C11600fE.A00(new C11640fI(this));
    public final C11590fD A02 = C11600fE.A00(new C11580fC(this));

    public abstract ImmutableSet A00();

    public abstract ImmutableSet A01();

    public abstract ImmutableSet A02();

    public final /* bridge */ /* synthetic */ Set AFB() {
        return (ImmutableSet) this.A02.get();
    }

    public final /* bridge */ /* synthetic */ Set AFC(Integer num) {
        C11590fD r0;
        switch (num.intValue()) {
            case 0:
                r0 = this.A00;
                break;
            case 1:
                r0 = this.A01;
                break;
            default:
                throw new IllegalArgumentException("Unhandled language set type");
        }
        return (ImmutableSet) r0.get();
    }
}
