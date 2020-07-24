package p000X;

import com.facebook.common.dextricks.classid.ClassId;
import com.facebook.profilo.logger.Logger;
import com.facebook.profilo.provider.class_load.ClassLoadProvider;

/* renamed from: X.0bn  reason: invalid class name and case insensitive filesystem */
public final class C09670bn implements C04210Cz {
    public final void A8U(String str, Class cls) {
        Logger.writeStandardEntry(ClassLoadProvider.A01, 7, 81, 0, 0, 0, 0, ClassId.getClassId(cls));
    }

    public final void A8V(String str) {
        Logger.writeStandardEntry(ClassLoadProvider.A01, 7, 82, 0, 0, 0, 0, 0);
    }

    public final void A8W(String str) {
        Logger.writeStandardEntry(ClassLoadProvider.A01, 7, 80, 0, 0, 0, 0, 0);
    }
}
