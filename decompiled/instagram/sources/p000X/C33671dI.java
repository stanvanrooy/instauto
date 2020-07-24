package p000X;

import java.util.Observable;

/* renamed from: X.1dI  reason: invalid class name and case insensitive filesystem */
public final class C33671dI extends Observable implements AnonymousClass0Q6 {
    public static C33671dI A02;
    public String A00 = "";
    public boolean A01 = true;

    public final void A00(String str) {
        this.A00 = str;
        setChanged();
        notifyObservers();
    }

    public C33671dI() {
        AnonymousClass0Q7.A03().A0B(this);
    }

    public final void onAppBackgrounded() {
        int A03 = AnonymousClass0Z0.A03(999799061);
        this.A01 = false;
        setChanged();
        notifyObservers();
        AnonymousClass0Z0.A0A(-1889941938, A03);
    }

    public final void onAppForegrounded() {
        int A03 = AnonymousClass0Z0.A03(1913549138);
        this.A01 = true;
        setChanged();
        notifyObservers();
        AnonymousClass0Z0.A0A(-162586604, A03);
    }
}
