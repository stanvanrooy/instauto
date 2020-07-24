package p000X;

import android.graphics.Color;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.List;

/* renamed from: X.1hF  reason: invalid class name and case insensitive filesystem */
public class C35981hF {
    public C36001hH A00;
    public C36001hH A01;
    public String A02;
    public List A03;
    public List A04;

    public C36001hH A00() {
        return this.A00;
    }

    public C36001hH A01() {
        return this.A01;
    }

    public String A02() {
        return this.A02;
    }

    public float[] A03() {
        float f;
        float[] fArr = new float[this.A04.size()];
        int i = 0;
        for (Float f2 : this.A04) {
            int i2 = i + 1;
            if (f2 != null) {
                f = f2.floatValue();
            } else {
                f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            fArr[i] = f;
            i = i2;
        }
        return fArr;
    }

    public int[] A04() {
        String A0E;
        int[] iArr = new int[this.A03.size()];
        for (int i = 0; i < this.A03.size(); i++) {
            if (((String) this.A03.get(i)).startsWith("#")) {
                A0E = (String) this.A03.get(i);
            } else {
                A0E = AnonymousClass000.A0E("#", (String) this.A03.get(i));
            }
            iArr[i] = Color.parseColor(A0E);
        }
        return iArr;
    }
}
