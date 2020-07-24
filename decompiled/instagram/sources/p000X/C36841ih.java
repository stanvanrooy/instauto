package p000X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1ih  reason: invalid class name and case insensitive filesystem */
public final class C36841ih implements C36851ii, C36861ij, C36871ik {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public Parcelable A0A;
    public C32501bN A0B;
    public C49012Aj A0C;
    public C36881il A0D;
    public C17070pd A0E;
    public C39561n7 A0F;
    public AnonymousClass27S A0G;
    public C29901Rs A0H;
    public Boolean A0I;
    public Integer A0J;
    public Integer A0K;
    public Integer A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public WeakReference A0W;
    public WeakReference A0X;
    public WeakReference A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u;
    public boolean A0v;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y;
    public boolean A0z;
    public boolean A10;
    public boolean A11;
    public boolean A12;
    public boolean A13;
    public boolean A14;
    public boolean A15;
    public boolean A16;
    public int A17;
    public int A18;
    public C43271u7 A19;
    public AnonymousClass29R A1A;
    public WeakReference A1B;
    public final SparseIntArray A1C = new SparseIntArray();
    public final SparseArray A1D = new SparseArray();
    public final Map A1E = new HashMap();
    public final Set A1F;

    public static String A00(AnonymousClass1RO r3, boolean z, Integer num) {
        int i;
        Object[] objArr = new Object[2];
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        objArr[0] = Integer.valueOf(i);
        Object obj = r3;
        if (z) {
            obj = r3.getClass();
        }
        objArr[1] = Integer.valueOf(obj.hashCode());
        return C06360Ot.formatString("%d%d", objArr);
    }

    public final void A0B(AnonymousClass1RO r2, boolean z) {
        A0D(r2, z, (Integer) null);
    }

    public final void A0C(AnonymousClass1RO r2, boolean z) {
        A0E(r2, z, (Integer) null);
    }

    public static void A01(C36841ih r5, int i) {
        synchronized (r5.A1E) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : r5.A1E.entrySet()) {
                AnonymousClass1RO r0 = (AnonymousClass1RO) ((WeakReference) entry.getValue()).get();
                if (r0 != null) {
                    r0.BB7(r5, i);
                } else {
                    arrayList.add(entry.getKey());
                }
            }
            r5.A1E.keySet().removeAll(arrayList);
        }
    }

    public final int A02() {
        int i;
        int i2 = this.A17;
        synchronized (this.A1C) {
            i = this.A1C.get(i2);
        }
        return i;
    }

    public final C49012Aj A03() {
        if (this.A0C == null) {
            this.A0C = new C49012Aj();
        }
        return this.A0C;
    }

    public final C38741ll A04(int i) {
        C38741ll r1;
        synchronized (this.A1D) {
            r1 = (C38741ll) this.A1D.get(i);
            if (r1 == null) {
                r1 = new C38741ll();
                r1.A00 = Constants.ONE;
                this.A1D.put(i, r1);
            }
        }
        return r1;
    }

    public final void A05(int i) {
        if (i != this.A01) {
            this.A01 = i;
            A01(this, 4);
        }
    }

    public final void A06(int i) {
        if (i != this.A17) {
            this.A17 = i;
            A01(this, 7);
        }
    }

    public final void A07(int i) {
        int i2 = this.A17;
        synchronized (this.A1C) {
            this.A1C.put(i2, i);
        }
    }

    public final void A08(int i, String str, C29751Rc r6) {
        if (this.A0G == null) {
            this.A0G = new AnonymousClass27S();
            for (WeakReference add : this.A1F) {
                this.A0G.A07.add(add);
            }
        }
        this.A06 = i;
        this.A0Q = str;
        this.A0G.A02(r6);
    }

    public final void A09(Context context) {
        ValueAnimator valueAnimator;
        if (this.A19 == null) {
            this.A19 = new C43271u7(context);
        }
        C43271u7 r3 = this.A19;
        Integer num = r3.A04;
        Integer num2 = Constants.ZERO;
        if (!(num == num2 || (valueAnimator = r3.A02) == null)) {
            valueAnimator.removeAllListeners();
            r3.A02.removeAllUpdateListeners();
            r3.A02.cancel();
            r3.A04 = num2;
        }
        r3.A04 = Constants.ONE;
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f}).setDuration((long) r3.A05);
        r3.A02 = duration;
        duration.setStartDelay((long) r3.A00);
        ValueAnimator valueAnimator2 = r3.A02;
        if (r3.A01 == null) {
            r3.A01 = new C43281u8(r3);
        }
        valueAnimator2.addUpdateListener(r3.A01);
        ValueAnimator valueAnimator3 = r3.A02;
        if (r3.A03 == null) {
            r3.A03 = new C43291u9(r3);
        }
        valueAnimator3.addListener(r3.A03);
        r3.A02.start();
    }

    public final void A0A(C37371jY r4) {
        boolean z;
        WeakReference weakReference = this.A0X;
        if ((weakReference != null || r4 == null) && (weakReference == null || weakReference.get() == r4)) {
            z = false;
        } else {
            z = true;
        }
        this.A0X = new WeakReference(r4);
        if (z) {
            A01(this, 1);
        }
    }

    public final void A0D(AnonymousClass1RO r5, boolean z, Integer num) {
        synchronized (this.A1E) {
            this.A1E.put(A00(r5, z, num), new WeakReference(r5));
        }
    }

    public final void A0E(AnonymousClass1RO r4, boolean z, Integer num) {
        synchronized (this.A1E) {
            this.A1E.remove(A00(r4, z, num));
        }
    }

    public final void A0F(C32571bU r3) {
        WeakReference weakReference;
        if (this.A0F == null) {
            this.A0F = new C39561n7();
        }
        C39561n7 r1 = this.A0F;
        if (r3 != null) {
            weakReference = new WeakReference(r3);
        } else {
            weakReference = null;
        }
        r1.A01 = weakReference;
        C39561n7.A00(r1);
    }

    public final void A0G(C38791lr r4) {
        if (r4 != null) {
            this.A1F.add(new WeakReference(r4));
        }
        if (this.A0G != null) {
            for (WeakReference add : this.A1F) {
                this.A0G.A07.add(add);
            }
        }
    }

    public final void A0H(C38791lr r4) {
        if (this.A0G != null) {
            Iterator it = this.A1F.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == r4) {
                    this.A0G.A07.remove(weakReference);
                    it.remove();
                }
            }
        }
    }

    public final void A0I(C32121ac r3) {
        WeakReference weakReference;
        if (r3 != null) {
            weakReference = new WeakReference(r3);
        } else {
            weakReference = null;
        }
        this.A1B = weakReference;
        AnonymousClass29R r0 = this.A1A;
        if (r0 != null) {
            r0.A00(weakReference);
        }
    }

    public final void A0J(C32121ac r3) {
        WeakReference weakReference;
        if (r3 != null) {
            weakReference = new WeakReference(r3);
        } else {
            weakReference = null;
        }
        this.A0W = weakReference;
        AnonymousClass29R r0 = this.A1A;
        if (r0 != null) {
            r0.A01(weakReference);
        }
    }

    public final void A0K(C32121ac r2) {
        WeakReference weakReference = this.A1B;
        if (weakReference != null && weakReference.get() == r2) {
            A0I((C32121ac) null);
        }
    }

    public final void A0L(boolean z) {
        if (this.A0i != z) {
            this.A0i = z;
            A01(this, 19);
        }
    }

    public final void A0M(boolean z) {
        if (z != this.A0v) {
            this.A0v = z;
            A01(this, 10);
        }
    }

    public final void A0N(boolean z) {
        if (this.A0z != z) {
            this.A0z = z;
            A01(this, 8);
        }
    }

    public final void A0O(boolean z, boolean z2) {
        if (z != this.A0a) {
            this.A0a = z;
            this.A0g = z2;
            A01(this, 5);
        }
    }

    public final void A0P(boolean z, boolean z2, boolean z3) {
        if (this.A1A == null) {
            AnonymousClass29R r1 = new AnonymousClass29R();
            this.A1A = r1;
            WeakReference weakReference = this.A1B;
            if (weakReference != null) {
                r1.A00(weakReference);
                this.A1A.A01(this.A0W);
            }
        }
        this.A1A.A02(z, z2, z3);
    }

    public final boolean A0Q() {
        C37371jY r0;
        WeakReference weakReference = this.A0X;
        if (weakReference == null) {
            r0 = null;
        } else {
            r0 = (C37371jY) weakReference.get();
        }
        if (r0 != null) {
            return true;
        }
        return false;
    }

    public final boolean A0R() {
        if (this.A18 != -1) {
            return true;
        }
        return false;
    }

    public final int AHt() {
        return this.A17;
    }

    public final boolean Ai7() {
        if (this.A0K != Constants.A08) {
            return true;
        }
        return false;
    }

    public final int getPosition() {
        boolean z = false;
        if (this.A18 >= 0) {
            z = true;
        }
        AnonymousClass0a4.A0B(z, "Position is not set. Time since start up in ms is " + (AwakeTimeSinceBootClock.INSTANCE.now() - C06480Pf.A00) + "; Start up type is " + C06480Pf.A01);
        return this.A18;
    }

    public C36841ih(AnonymousClass1NJ r4) {
        int i = 0;
        this.A11 = false;
        this.A0s = false;
        this.A0B = C32501bN.IDLE;
        this.A08 = 0;
        this.A0D = C36881il.Original;
        this.A0K = Constants.A08;
        Integer num = Constants.ZERO;
        this.A0L = num;
        this.A0i = false;
        this.A0J = num;
        this.A16 = false;
        this.A18 = -1;
        this.A14 = false;
        this.A0O = "";
        this.A1F = new HashSet(1);
        this.A0E = C17070pd.NOT_SET;
        boolean A1W = r4.A1W();
        this.A0k = A1W;
        i = !A1W ? -1 : i;
        this.A17 = i;
        this.A02 = i;
    }

    public final void Bja(int i) {
        C12670hC.A02();
        this.A18 = i;
    }
}
