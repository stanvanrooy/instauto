package p000X;

import java.util.concurrent.Callable;

/* renamed from: X.DQn */
public final class DQn {
    public static boolean A00(C27831Jj r3, C27841Jk r4, C64602rk r5) {
        if (!(r3 instanceof Callable)) {
            return false;
        }
        try {
            Object call = ((Callable) r3).call();
            if (call != null) {
                Object apply = r5.apply(call);
                AnonymousClass1J6.A01(apply, "The mapper returned a null ObservableSource");
                C27831Jj r1 = (C27831Jj) apply;
                if (r1 instanceof Callable) {
                    Object call2 = ((Callable) r1).call();
                    if (call2 != null) {
                        DR0 dr0 = new DR0(r4, call2);
                        r4.BPT(dr0);
                        dr0.run();
                        return true;
                    }
                } else {
                    r1.Bqn(r4);
                    return true;
                }
            }
            DQm.A00(r4);
            return true;
        } catch (Throwable th) {
            C29942DHs.A00(th);
            DQm.A01(th, r4);
            return true;
        }
    }
}
