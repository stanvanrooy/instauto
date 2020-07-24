package p000X;

/* renamed from: X.1Ji  reason: invalid class name and case insensitive filesystem */
public abstract class C27821Ji implements C27831Jj {
    public static C27821Ji A01(C64602rk r1, int i, C27831Jj... r3) {
        C27821Ji r0;
        if (r3.length == 0) {
            r0 = AnonymousClass1K9.A00;
        } else {
            AnonymousClass1J6.A01(r1, "zipper is null");
            AnonymousClass1J6.A00(i, "bufferSize");
            r0 = new C27991Jz(r3, r1, i);
        }
        return AnonymousClass1J9.A00(r0);
    }

    public abstract void A03(C27841Jk r1);

    public final C27821Ji A02(C64602rk r4) {
        C27821Ji r0;
        int i = C27861Jm.A00;
        AnonymousClass1J6.A01(r4, "mapper is null");
        AnonymousClass1J6.A00(Integer.MAX_VALUE, "maxConcurrency");
        AnonymousClass1J6.A00(i, "bufferSize");
        if (!(this instanceof AnonymousClass1K4)) {
            return AnonymousClass1J9.A00(new C64652rp(this, r4, i));
        }
        Object call = ((AnonymousClass1K4) this).call();
        if (call == null) {
            r0 = AnonymousClass1K9.A00;
        } else {
            r0 = new AnonymousClass1K0(call, r4);
        }
        return AnonymousClass1J9.A00(r0);
    }

    public final void Bqn(C27841Jk r4) {
        AnonymousClass1J6.A01(r4, "observer is null");
        try {
            AnonymousClass1J6.A01(r4, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            A03(r4);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C29942DHs.A00(th);
            AnonymousClass1J9.A03(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public static C27821Ji A00(C64602rk r2, int i, C27831Jj... r4) {
        C27821Ji dQy;
        AnonymousClass1J6.A01(r4, "sources is null");
        if (r4.length == 0) {
            dQy = AnonymousClass1K9.A00;
        } else {
            AnonymousClass1J6.A01(r2, "combiner is null");
            AnonymousClass1J6.A00(i, "bufferSize");
            dQy = new C30116DQy(r4, r2, i << 1);
        }
        return AnonymousClass1J9.A00(dQy);
    }
}
