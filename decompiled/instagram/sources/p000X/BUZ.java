package p000X;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.media.FaceDetector;
import com.instagram.common.gallery.Medium;
import java.util.ArrayList;

/* renamed from: X.BUZ */
public final class BUZ implements BUi {
    public final FaceDetector A00 = new FaceDetector(320, 320, 3);
    public final FaceDetector.Face[] A01 = new FaceDetector.Face[3];

    public final boolean Ape() {
        return true;
    }

    public final String getName() {
        return "FaceScanner";
    }

    public final int getVersion() {
        return 2;
    }

    public final boolean Bec(Medium medium, BUT but, Bitmap bitmap) {
        int i;
        int i2;
        float width;
        float height;
        int findFaces = this.A00.findFaces(bitmap, this.A01);
        PointF pointF = new PointF();
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (true) {
            boolean z = true;
            if (i3 < findFaces) {
                FaceDetector.Face face = this.A01[i3];
                face.getMidPoint(pointF);
                if (medium.AUk() % 180 == 0) {
                    z = false;
                }
                if (z) {
                    i = medium.A04;
                } else {
                    i = medium.A09;
                }
                if (z) {
                    i2 = medium.A09;
                } else {
                    i2 = medium.A04;
                }
                float f = ((float) i) / ((float) i2);
                if (f > 1.0f) {
                    width = pointF.x / ((float) bitmap.getWidth());
                    float height2 = ((float) bitmap.getHeight()) / f;
                    float height3 = pointF.y - ((((float) bitmap.getHeight()) - height2) / 2.0f);
                    pointF.y = height3;
                    height = height3 / height2;
                } else {
                    if (f < 1.0f) {
                        float width2 = ((float) bitmap.getWidth()) * f;
                        float width3 = pointF.x - ((((float) bitmap.getWidth()) - width2) / 2.0f);
                        pointF.x = width3;
                        width = width3 / width2;
                    } else {
                        width = pointF.x / ((float) bitmap.getWidth());
                    }
                    height = pointF.y / ((float) bitmap.getHeight());
                }
                arrayList.add(new C25671BUl(width, height, face.confidence()));
                i3++;
            } else {
                but.A01 = new C25672BUm(arrayList);
                return true;
            }
        }
    }
}
