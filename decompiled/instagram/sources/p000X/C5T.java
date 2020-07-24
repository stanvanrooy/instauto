package p000X;

import android.graphics.Rect;
import com.facebook.smartcapture.docauth.DocumentType;

/* renamed from: X.C5T */
public final class C5T {
    public static Rect A00(float f, DocumentType documentType, int i, int i2) {
        float f2;
        int i3 = (int) (((float) 16) * f);
        float f3 = (float) (i - (i3 << 1));
        switch (documentType.ordinal()) {
            case 1:
                f2 = 1.418919f;
                break;
            case 2:
                f2 = 1.4204545f;
                break;
            default:
                f2 = 1.5857725f;
                break;
        }
        int i4 = (int) ((((float) i2) / 2.0f) - ((f3 * (1.0f / f2)) / 2.0f));
        return new Rect(i3, i4, i - i3, i2 - i4);
    }
}
