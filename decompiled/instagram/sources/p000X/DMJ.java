package p000X;

import android.graphics.PointF;
import android.view.MotionEvent;
import com.facebook.C0003R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.DMJ */
public final class DMJ extends DNW {
    public DMJ() {
        super("Arrow", C0003R.raw.pen_vertex, C0003R.raw.point_textured_fragment, C0003R.raw.circle);
        this.A02 = new DMI(0.1f, 0.6f);
    }

    public final List AYk(MotionEvent motionEvent, List list) {
        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            int size = list.size();
            while (true) {
                int i = size - 1;
                if (size <= 0) {
                    break;
                }
                PointF pointF2 = (PointF) list.get(i);
                if (!pointF2.equals(pointF.x, pointF.y)) {
                    float f = pointF.x - pointF2.x;
                    float f2 = pointF.y - pointF2.y;
                    boolean z = false;
                    if (((float) Math.sqrt((double) ((f * f) + (f2 * f2)))) > ((float) 30)) {
                        z = true;
                    }
                    if (z) {
                        Float valueOf = Float.valueOf(70.0f);
                        PointF A00 = C29061CrE.A00(pointF, pointF2);
                        float f3 = pointF.x - pointF2.x;
                        float f4 = pointF.y - pointF2.y;
                        float sqrt = 1.0f / ((float) Math.sqrt((double) ((f3 * f3) + (f4 * f4))));
                        PointF pointF3 = new PointF(A00.x * sqrt, A00.y * sqrt);
                        PointF pointF4 = new PointF(-pointF3.y, pointF3.x);
                        float floatValue = valueOf.floatValue();
                        PointF A002 = C29061CrE.A00(pointF, new PointF(pointF3.x * floatValue, pointF3.y * floatValue));
                        PointF pointF5 = new PointF(pointF4.x * floatValue, pointF4.y * floatValue);
                        PointF pointF6 = new PointF(A002.x + pointF5.x, A002.y + pointF5.y);
                        PointF A003 = C29061CrE.A00(C29061CrE.A00(pointF, new PointF(pointF3.x * floatValue, pointF3.y * floatValue)), new PointF(pointF4.x * floatValue, pointF4.y * floatValue));
                        PointF pointF7 = new PointF[]{pointF6, A003}[0];
                        DMK dmk = new DMK(motionEvent);
                        dmk.A00 += 100;
                        arrayList.add(dmk);
                        DMK dmk2 = new DMK(motionEvent);
                        dmk2.A01 = A003;
                        dmk2.A00 += 200;
                        arrayList.add(dmk2);
                        DMK dmk3 = new DMK(motionEvent);
                        dmk3.A01 = pointF;
                        dmk3.A00 += 300;
                        arrayList.add(dmk3);
                        DMK dmk4 = new DMK(motionEvent);
                        dmk4.A01 = pointF7;
                        dmk4.A00 += 400;
                        arrayList.add(dmk4);
                        return arrayList;
                    }
                }
                size = i;
            }
        }
        return arrayList;
    }
}
