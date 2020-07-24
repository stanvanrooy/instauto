package p000X;

import android.view.View;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.BX4 */
public class BX4 extends C38371lA implements AnonymousClass2O9 {
    public static final int NO_LIMIT = 0;
    public int A00;
    public int A01;
    public long A02;
    public QuickPromotionSurface A03;
    public C49182Bc A04;
    public C49262Bl A05;
    public C49242Bj A06;
    public BXX A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public List A0C;
    public boolean A0D;
    public boolean A0E;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            BX4 bx4 = (BX4) obj;
            if (!this.A0B.equals(bx4.A0B) || !this.A0A.equals(bx4.A0A)) {
                return false;
            }
        }
        return true;
    }

    public final View AGz() {
        AnonymousClass2DG A002 = this.A05.A00();
        if (A002 != null) {
            return A002.A02.getView();
        }
        return null;
    }

    public final Set AZ3() {
        return EnumSet.copyOf(this.A0C);
    }

    public final int hashCode() {
        return (this.A0B.hashCode() * 31) + this.A0A.hashCode();
    }

    public final long AL9() {
        return this.A02;
    }

    public final String AT8() {
        return this.A0A;
    }

    public final QuickPromotionSurface AXN() {
        return this.A03;
    }

    public final String AZi() {
        return this.A0B;
    }

    public final boolean Bn3() {
        return this.A0E;
    }

    public BX4() {
    }

    public BX4(String str, C49262Bl r3, C49162Ba r4, QuickPromotionSurface quickPromotionSurface, long j, int i, boolean z, boolean z2, BXX bxx) {
        int i2;
        this.A05 = r3;
        this.A06 = r4.A01;
        List list = r4.A07;
        this.A0C = list == null ? Collections.emptyList() : list;
        this.A08 = r4.A03;
        this.A0A = r4.A05;
        this.A03 = quickPromotionSurface;
        this.A0B = str;
        this.A02 = j;
        Integer num = r4.A02;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        this.A00 = i2;
        this.A01 = i;
        this.A07 = bxx;
        this.A0E = z;
        this.A0D = z2;
        this.A09 = r4.A04;
        this.A04 = r4.A00;
    }
}
