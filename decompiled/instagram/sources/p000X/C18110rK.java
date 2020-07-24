package p000X;

import android.content.Context;
import com.instagram.model.mediatype.MediaType;
import com.instagram.pendingmedia.model.constants.ShareType;

/* renamed from: X.0rK  reason: invalid class name and case insensitive filesystem */
public abstract class C18110rK {
    public static C18110rK A00;

    public abstract C106554ih A04(C105814hT r1);

    public abstract AnonymousClass43I A05(Context context, C105804hS r2);

    public abstract C105774hP A06(C105774hP r1, ShareType shareType, MediaType mediaType, float f);

    public abstract C105774hP A07(C105774hP r1, AnonymousClass15G r2);

    public abstract C105774hP A08(C105774hP r1, AnonymousClass15G r2);

    public abstract C105804hS A09(Context context, C105804hS r2, AnonymousClass15G r3, String str);

    public abstract String A0A(AnonymousClass14Q r1, AnonymousClass43I r2);

    public abstract void A0B(Context context, AnonymousClass0C1 r2, AnonymousClass43K r3, String str);

    public abstract void A0C(Context context, AnonymousClass0C1 r2, C105814hT r3, AnonymousClass43I r4, String str);

    public abstract void A0D(C106264iC r1, C105814hT r2, C105884ha r3, String str);

    public static C18110rK A03() {
        C18110rK r0 = A00;
        if (r0 != null) {
            return r0;
        }
        throw new RuntimeException("No implementation for MediaTransactionFactory");
    }
}
