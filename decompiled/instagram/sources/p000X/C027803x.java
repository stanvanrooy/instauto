package p000X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.03x  reason: invalid class name and case insensitive filesystem */
public final class C027803x implements FilenameFilter {
    public final /* synthetic */ AnonymousClass040 A00;
    public final /* synthetic */ String A01;

    public C027803x(AnonymousClass040 r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final boolean accept(File file, String str) {
        if (str.indexOf(this.A01) != 0 || file.equals(AnonymousClass0FK.A00) || str.indexOf(95, this.A01.length() + 1) != -1 || !str.endsWith(OptSvcAnalyticsStore.FILE_SUFFIX)) {
            return false;
        }
        return true;
    }
}
