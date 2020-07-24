package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;
import p000X.AnonymousClass0Z0;
import p000X.C25198B6j;

/* renamed from: com.google.android.play.core.internal.bj */
public final class C0115bj extends C0119i implements C0116bl {
    public C0115bj(IBinder iBinder) {
        super(iBinder);
        AnonymousClass0Z0.A0A(2047894458, AnonymousClass0Z0.A03(245723964));
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.google.android.play.core.internal.bn, android.os.IBinder] */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final void A2D(String str, int i, Bundle bundle, C0118bn r7) {
        int A03 = AnonymousClass0Z0.A03(2005827599);
        Parcel A00 = A00();
        A00.writeString(str);
        A00.writeInt(i);
        C25198B6j.A01(A00, bundle);
        A00.writeStrongBinder(r7);
        A01(3, A00);
        AnonymousClass0Z0.A0A(821013104, A03);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.google.android.play.core.internal.bn, android.os.IBinder] */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final void A2E(String str, List list, Bundle bundle, C0118bn r7) {
        int A03 = AnonymousClass0Z0.A03(1574826008);
        Parcel A00 = A00();
        A00.writeString(str);
        A00.writeTypedList(list);
        C25198B6j.A01(A00, bundle);
        A00.writeStrongBinder(r7);
        A01(2, A00);
        AnonymousClass0Z0.A0A(-1645912260, A03);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.google.android.play.core.internal.bn, android.os.IBinder] */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final void A6F(String str, int i, Bundle bundle, C0118bn r7) {
        int A03 = AnonymousClass0Z0.A03(1282054653);
        Parcel A00 = A00();
        A00.writeString(str);
        A00.writeInt(i);
        C25198B6j.A01(A00, bundle);
        A00.writeStrongBinder(r7);
        A01(4, A00);
        AnonymousClass0Z0.A0A(-875801626, A03);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.google.android.play.core.internal.bn, android.os.IBinder] */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final void A6G(String str, List list, Bundle bundle, C0118bn r7) {
        int A03 = AnonymousClass0Z0.A03(-582626196);
        Parcel A00 = A00();
        A00.writeString(str);
        A00.writeTypedList(list);
        C25198B6j.A01(A00, bundle);
        A00.writeStrongBinder(r7);
        A01(7, A00);
        AnonymousClass0Z0.A0A(279541178, A03);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.google.android.play.core.internal.bn, android.os.IBinder] */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final void A7G(String str, List list, Bundle bundle, C0118bn r7) {
        int A03 = AnonymousClass0Z0.A03(35881964);
        Parcel A00 = A00();
        A00.writeString(str);
        A00.writeTypedList(list);
        C25198B6j.A01(A00, bundle);
        A00.writeStrongBinder(r7);
        A01(8, A00);
        AnonymousClass0Z0.A0A(-1212051567, A03);
    }
}
