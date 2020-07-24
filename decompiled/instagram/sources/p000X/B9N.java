package p000X;

import android.media.AudioRecord;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.CameraEnumerationAndroid;

/* renamed from: X.B9N */
public final class B9N {
    public static String A00;
    public static List A01;
    public static final int[] A02 = {CameraEnumerationAndroid.C01581.MIN_FPS_THRESHOLD, 11025, 16000, 22050, 32000, 37800, 44056, 44100, 47250, 48000, 50000, 50400, 88200, 96000, 176400, 192000, 352800, 2822400, 5644800};
    public static final short[] A03 = {16, 12};
    public static final short[] A04 = {3, 2, 4};

    public static String A00(List list) {
        if (A00 == null) {
            StringBuilder sb = new StringBuilder();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int[] iArr = (int[]) it.next();
                sb.append("(");
                sb.append(iArr[0]);
                sb.append(",");
                sb.append(iArr[1]);
                sb.append(",");
                sb.append(iArr[2]);
                sb.append(");");
            }
            A00 = sb.toString();
        }
        return A00;
    }

    public static List A01() {
        if (A01 == null) {
            A01 = new ArrayList();
            for (short s : A03) {
                for (short s2 : A04) {
                    if (Build.VERSION.SDK_INT >= 21 || s2 != 4) {
                        for (int i : A02) {
                            if (AudioRecord.getMinBufferSize(i, s, s2) >= 0) {
                                A01.add(new int[]{i, s, s2});
                            }
                        }
                    }
                }
            }
        }
        return A01;
    }
}
