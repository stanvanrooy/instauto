package p000X;

import android.graphics.Color;
import android.text.TextUtils;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CYI */
public final class CYI {
    public static ImageInfo A01(CYT cyt) {
        if (cyt == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ExtendedImageUrl extendedImageUrl = new ExtendedImageUrl(((CYP) cyt.A00.get(0)).A02);
        extendedImageUrl.A00 = ((CYP) cyt.A00.get(0)).A00;
        extendedImageUrl.A01 = ((CYP) cyt.A00.get(0)).A01;
        arrayList.add(extendedImageUrl);
        ImageInfo imageInfo = new ImageInfo();
        imageInfo.A01 = arrayList;
        return imageInfo;
    }

    public static List A02(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CYO cyo = (CYO) it.next();
                arrayList.add(new AnonymousClass1UP(cyo.A02, cyo.A01, cyo.A03, cyo.A00));
            }
        }
        return arrayList;
    }

    public static int A00(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (!str.startsWith("#")) {
            str = AnonymousClass000.A0E("#", str);
        }
        return Color.parseColor(str);
    }
}
