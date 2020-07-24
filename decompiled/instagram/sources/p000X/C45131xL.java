package p000X;

import android.os.Process;
import com.facebook.common.threadutils.ThreadUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.1xL  reason: invalid class name and case insensitive filesystem */
public final class C45131xL extends C12380ge {
    public final List A00 = new ArrayList();
    public final boolean A01;
    public final boolean A02;
    public final int A03;
    public final Set A04 = new HashSet();

    public final void A03() {
        try {
            for (Integer intValue : this.A00) {
                int intValue2 = intValue.intValue();
                int i = -1 & ThreadUtils.THE_ONE.mMaxAffinityMask;
                if (i != 0) {
                    ThreadUtils.nativeSetThreadAffinityMask(intValue2, i);
                }
            }
            Integer[] numArr = null;
            synchronized (this.A04) {
                if (!this.A04.isEmpty()) {
                    Set set = this.A04;
                    numArr = (Integer[]) set.toArray(new Integer[set.size()]);
                    this.A04.clear();
                }
            }
            if (numArr != null) {
                for (Integer intValue3 : numArr) {
                    int intValue4 = intValue3.intValue();
                    int i2 = -1 & ThreadUtils.THE_ONE.mMaxAffinityMask;
                    if (i2 != 0) {
                        ThreadUtils.nativeSetThreadAffinityMask(intValue4, i2);
                    }
                }
            }
        } catch (Exception e) {
            AnonymousClass0DB.A0P("BoosterAffinity", e, "release boost error, id=%s", Integer.toHexString(hashCode()));
        }
    }

    public final boolean A04() {
        try {
            if (this.A00.isEmpty()) {
                if (this.A01) {
                    this.A00.add(Integer.valueOf(Process.myPid()));
                }
                if (this.A02) {
                    int A002 = C45281xa.A00();
                    boolean z = false;
                    if (A002 >= 0) {
                        z = true;
                    }
                    if (z) {
                        this.A00.add(Integer.valueOf(A002));
                    }
                }
            }
            for (Integer intValue : this.A00) {
                int intValue2 = intValue.intValue();
                int i = this.A03 & ThreadUtils.THE_ONE.mMaxAffinityMask;
                if (i != 0) {
                    ThreadUtils.nativeSetThreadAffinityMask(intValue2, i);
                }
            }
            return true;
        } catch (Exception e) {
            AnonymousClass0DB.A0P("BoosterAffinity", e, "request boost error id=%s", Integer.toHexString(hashCode()));
            return false;
        }
    }

    public final int AGu() {
        return 5;
    }

    public C45131xL(int i, boolean z, boolean z2) {
        super(5000);
        this.A03 = i;
        this.A01 = z;
        this.A02 = z2;
    }
}
