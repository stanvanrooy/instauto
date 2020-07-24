package p000X;

/* renamed from: X.1Pc  reason: invalid class name and case insensitive filesystem */
public final class C29231Pc implements C29241Pd {
    public final AnonymousClass1PH A00;

    public final void Auy(int i, int i2, Object obj) {
        this.A00.notifyItemRangeChanged(i, i2, obj);
    }

    public final void B7Z(int i, int i2) {
        this.A00.notifyItemRangeInserted(i, i2);
    }

    public final void BBx(int i, int i2) {
        this.A00.notifyItemMoved(i, i2);
    }

    public final void BIS(int i, int i2) {
        this.A00.notifyItemRangeRemoved(i, i2);
    }

    public C29231Pc(AnonymousClass1PH r1) {
        this.A00 = r1;
    }
}
