package p000X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.DCV */
public final class DCV {
    public DEW A00;
    public boolean[] A01;
    public final Matrix A02 = new Matrix();
    public final C29819DCd A03;
    public final Map A04;
    public final Map A05;
    public final RectF[] A06;

    public DCV(C29819DCd dCd, Map map, DEW dew, boolean[] zArr) {
        this.A03 = dCd;
        this.A04 = map;
        if (dCd.A07 != null) {
            this.A05 = new HashMap();
        }
        List list = dCd.A05;
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                if (map == null || !map.containsKey(((C29817DCb) list.get(i)).A02)) {
                    C29817DCb dCb = (C29817DCb) list.get(i);
                    byte[] bArr = dCb.A03;
                    if (bArr != null && dCb.A00 == null) {
                        dCb.A00 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                    }
                } else {
                    ((C29817DCb) list.get(i)).A00 = (Bitmap) map.get(((C29817DCb) list.get(i)).A02);
                }
            }
        }
        this.A00 = dew == null ? new DEW() : dew;
        this.A06 = new RectF[2];
        int i2 = 0;
        while (true) {
            RectF[] rectFArr = this.A06;
            if (i2 < rectFArr.length) {
                rectFArr[i2] = new RectF();
                i2++;
            } else {
                this.A01 = zArr;
                return;
            }
        }
    }
}
