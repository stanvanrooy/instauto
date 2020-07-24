package p000X;

import android.content.pm.ResolveInfo;
import java.util.Comparator;

/* renamed from: X.0Ns  reason: invalid class name and case insensitive filesystem */
public final class C06090Ns implements Comparator {
    public final int compare(Object obj, Object obj2) {
        return ((ResolveInfo) obj).activityInfo.packageName.compareTo(((ResolveInfo) obj2).activityInfo.packageName);
    }
}
