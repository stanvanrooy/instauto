package p000X;

import java.util.ArrayDeque;

/* renamed from: X.ACK */
public final class ACK {
    public static ACK A06;
    public int A00;
    public boolean A01;
    public final ACL A02;
    public final Object A03 = new Object();
    public final ArrayDeque[] A04;
    public volatile ACJ A05;

    public static void A00(ACK ack) {
        boolean z = false;
        if (ack.A00 >= 0) {
            z = true;
        }
        AnonymousClass0FY.A02(z);
        if (ack.A00 == 0 && ack.A01) {
            if (ack.A05 != null) {
                ACJ acj = ack.A05;
                ACL acl = ack.A02;
                if (acl.A00 == null) {
                    acl.A00 = new ACO(acl);
                }
                acj.A00.removeFrameCallback(acl.A00);
            }
            ack.A01 = false;
        }
    }

    public final void A01(Integer num, ACP acp) {
        synchronized (this.A03) {
            this.A04[ACU.A00(num)].addLast(acp);
            boolean z = true;
            int i = this.A00 + 1;
            this.A00 = i;
            if (i <= 0) {
                z = false;
            }
            AnonymousClass0FY.A02(z);
            if (!this.A01) {
                if (this.A05 == null) {
                    C228039ra.A01(new ACI(this, new ACM(this)));
                } else {
                    this.A05.A00(this.A02);
                    this.A01 = true;
                }
            }
        }
    }

    public final void A02(Integer num, ACP acp) {
        synchronized (this.A03) {
            if (this.A04[ACU.A00(num)].removeFirstOccurrence(acp)) {
                this.A00--;
                A00(this);
            } else {
                AnonymousClass0CH.A06("ReactNative", "Tried to remove non-existent frame callback");
            }
        }
    }

    public ACK() {
        int i = 0;
        this.A00 = 0;
        this.A01 = false;
        this.A02 = new ACL(this);
        this.A04 = new ArrayDeque[Constants.ZERO(5).length];
        while (true) {
            ArrayDeque[] arrayDequeArr = this.A04;
            if (i < arrayDequeArr.length) {
                arrayDequeArr[i] = new ArrayDeque();
                i++;
            } else {
                C228039ra.A01(new ACI(this, (Runnable) null));
                return;
            }
        }
    }
}
