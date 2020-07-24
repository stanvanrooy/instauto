package p000X;

import com.facebook.react.modules.statusbar.StatusBarModule;

/* renamed from: X.1iD  reason: invalid class name and case insensitive filesystem */
public final class C36541iD implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C15730nR A03;
    public final /* synthetic */ String A04;

    public C36541iD(C15730nR r1, String str, int i, int i2, int i3) {
        this.A03 = r1;
        this.A04 = str;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }

    public final void run() {
        int hashCode = this.A04.hashCode();
        synchronized (this.A03.A04) {
            if (C15730nR.A02(this.A03, hashCode)) {
                this.A03.A03.markerAnnotate(23396353, hashCode, "WIDTH", this.A02);
                this.A03.A03.markerAnnotate(23396353, hashCode, StatusBarModule.HEIGHT_KEY, this.A00);
                this.A03.A03.markerAnnotate(23396353, hashCode, "BYTE_SIZE", this.A01);
            }
        }
    }
}
