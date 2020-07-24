package p000X;

import android.util.SparseArray;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.0n8  reason: invalid class name and case insensitive filesystem */
public abstract class C15540n8 implements C15550n9 {
    public static C15530n7 A08 = new C15560nA();
    public FragmentActivity A00;
    public AnonymousClass1AM A01;
    public AnonymousClass0RN A02;
    public C06590Pq A03;
    public C12830hS A04;
    public Integer A05;
    public boolean A06 = false;
    public final SparseArray A07 = new SparseArray(0);

    public final Object A00(int i, Class cls) {
        return cls.cast(this.A07.get(i));
    }

    public final C30795DkP AGp() {
        return new C30795DkP();
    }

    public final C225019mS AGq() {
        return A08.AGr(this.A03);
    }

    public C15540n8(C06590Pq r3, FragmentActivity fragmentActivity, AnonymousClass1AM r5, C12830hS r6, AnonymousClass0RN r7) {
        this.A03 = r3;
        this.A00 = fragmentActivity;
        this.A01 = r5;
        this.A04 = r6;
        this.A02 = r7;
    }
}
