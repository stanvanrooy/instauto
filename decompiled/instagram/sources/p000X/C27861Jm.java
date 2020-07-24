package p000X;

/* renamed from: X.1Jm  reason: invalid class name and case insensitive filesystem */
public abstract class C27861Jm {
    public static final int A00 = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    public abstract void A01(DR5 dr5);

    public final void A00(C30126DRi dRi) {
        AnonymousClass1J6.A01(dRi, "s is null");
        try {
            AnonymousClass1J6.A01(dRi, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            A01(dRi);
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
}
