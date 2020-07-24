package p000X;

import com.android.internal.util.Predicate;
import com.instagram.pendingmedia.model.PendingMedia;
import java.util.Set;

/* renamed from: X.1uV  reason: invalid class name and case insensitive filesystem */
public final class C43491uV implements Predicate {
    public final /* synthetic */ PendingMedia A00;
    public final /* synthetic */ Set A01;

    public C43491uV(PendingMedia pendingMedia, Set set) {
        this.A00 = pendingMedia;
        this.A01 = set;
    }

    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        return this.A01.contains(((C23160zf) obj).AVv());
    }
}
