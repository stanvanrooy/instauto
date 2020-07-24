package p000X;

import java.util.ArrayList;

/* renamed from: X.DQl */
public final class DQl<T> extends ArrayList<Object> implements DR8<T> {
    public volatile int A00;

    public DQl() {
        super(16);
    }

    public final void A99() {
        add(C30104DQj.A01);
        this.A00++;
    }

    public final void ADO(Throwable th) {
        add(new C24010AgS(th));
        this.A00++;
    }

    public final void Aq0(Object obj) {
        add(obj);
        this.A00++;
    }

    public final void Bbt(DR4 dr4) {
        int i;
        if (dr4.getAndIncrement() == 0) {
            C27841Jk r4 = dr4.A01;
            int i2 = 1;
            while (!dr4.A03) {
                int i3 = this.A00;
                Integer num = (Integer) dr4.A00;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                while (i < i3) {
                    if (!C30104DQj.A00(get(i), r4) && !dr4.A03) {
                        i++;
                    } else {
                        return;
                    }
                }
                dr4.A00 = Integer.valueOf(i);
                i2 = dr4.addAndGet(-i2);
                if (i2 == 0) {
                    return;
                }
            }
        }
    }
}
