package p000X;

import com.google.android.exoplayer2.Format;
import java.util.List;

/* renamed from: X.D36 */
public final class D36 {
    public static Format[] A00(List list) {
        Format[] formatArr = new Format[list.size()];
        for (int i = 0; i < list.size(); i++) {
            formatArr[i] = ((C29677D4l) list.get(i)).A01;
        }
        return formatArr;
    }
}
