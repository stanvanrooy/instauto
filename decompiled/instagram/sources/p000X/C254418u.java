package p000X;

import android.app.Application;
import android.content.Context;

/* renamed from: X.18u  reason: invalid class name and case insensitive filesystem */
public final class C254418u implements AnonymousClass0IT {
    public final /* synthetic */ Context A00;

    public C254418u(Context context) {
        this.A00 = context;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        C92803zk r0;
        C51962Mu r1;
        Context context = this.A00;
        synchronized (C254018q.class) {
            C254018q.A00();
            r0 = C254018q.A01;
        }
        C51922Mq r3 = (C51922Mq) r0.get();
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            if (C51932Mr.A00.get() == null) {
                C51932Mr r2 = new C51932Mr();
                if (C51932Mr.A00.compareAndSet((Object) null, r2)) {
                    C51952Mt.A00(application);
                    C51952Mt.A04.A02(r2);
                }
            }
        }
        String trim = "[DEFAULT]".trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (C51962Mu.A0D) {
            boolean z = false;
            if (!C51962Mu.A0E.containsKey(trim)) {
                z = true;
            }
            AnonymousClass0a2.A09(z, AnonymousClass000.A0J("FirebaseApp name ", trim, " already exists!"));
            AnonymousClass0a2.A03(context, "Application context cannot be null.");
            r1 = new C51962Mu(context, trim, r3);
            C51962Mu.A0E.put(trim, r1);
        }
        C51962Mu.A02(r1);
        return r1;
    }
}
