package p000X;

import android.content.Context;

/* renamed from: X.1Vd  reason: invalid class name and case insensitive filesystem */
public final class C30771Vd {
    public final C30781Ve A00;
    public final C30781Ve A01;
    public final C30781Ve A02;

    public C30771Vd(Context context, AnonymousClass0C1 r7, AnonymousClass1VJ r8, AnonymousClass1VL r9, AnonymousClass1VQ r10) {
        AnonymousClass0PR r3 = new AnonymousClass0PR(context, ((Boolean) AnonymousClass0L6.A02(r7, AnonymousClass0L7.ADAPTER_LEAK_LAUNCHER, "fix_async_layout_inflater_leak", false, (AnonymousClass04H) null)).booleanValue());
        if (((Boolean) AnonymousClass0L6.A02(r7, AnonymousClass0L7.VIEW_PREALLOCATION_LAUNCHER, "inflator_thread_priority_change_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            int intValue = ((Integer) AnonymousClass0L6.A02(r7, AnonymousClass0L7.VIEW_PREALLOCATION_LAUNCHER, "inflator_thread_priority", 4, (AnonymousClass04H) null)).intValue();
            r3.A02.A01 = Integer.valueOf(intValue);
        }
        AnonymousClass0L7 r2 = AnonymousClass0L7.VIEW_PREALLOCATION_LAUNCHER;
        this.A01 = new C30781Ve(r8, ((Integer) AnonymousClass0L6.A02(r7, r2, "header_count", 0, (AnonymousClass04H) null)).intValue(), r3);
        this.A00 = new C30781Ve(r9, ((Integer) AnonymousClass0L6.A02(r7, r2, "content_count", 0, (AnonymousClass04H) null)).intValue(), r3);
        this.A02 = new C30781Ve(r10, 2, r3);
        this.A01.A01();
        this.A00.A01();
        this.A02.A01();
    }
}
