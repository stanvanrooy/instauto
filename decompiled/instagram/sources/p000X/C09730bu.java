package p000X;

import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.logger.Logger;

/* renamed from: X.0bu  reason: invalid class name and case insensitive filesystem */
public final class C09730bu extends AnonymousClass0GW implements C11080eO, C11090eP {
    public static final int A00 = ProvidersRegistry.A00.A02("frameworks");
    public static final C09730bu A01 = new C09730bu();

    public C09730bu() {
        super((String) null);
    }

    public final void Aqw(C29911DFv dFv) {
        if (TraceEvents.isEnabled(A00)) {
            int i = A00;
            int writeStandardEntry = Logger.writeStandardEntry(i, 7, 22, 0, 0, 0, 0, 0);
            Logger.writeBytesEntry(i, 1, 83, writeStandardEntry, dFv.A01());
            int writeBytesEntry = Logger.writeBytesEntry(i, 1, 56, writeStandardEntry, "runnable_parent");
            String A002 = A00(dFv);
            int i2 = A00;
            Logger.writeBytesEntry(i2, 1, 57, writeBytesEntry, A002);
            Logger.writeBytesEntry(i2, 1, 57, Logger.writeBytesEntry(i2, 1, 56, writeStandardEntry, "runnable_identifier"), C29914DFy.A00(dFv));
            int writeBytesEntry2 = Logger.writeBytesEntry(i2, 1, 56, writeStandardEntry, "app_custom_type");
            int i3 = A00;
            Logger.writeBytesEntry(i3, 1, 57, writeBytesEntry2, String.valueOf(dFv.A00()));
            if (!dFv.A03(1)) {
                Logger.writeBytesEntry(i3, 1, 57, Logger.writeBytesEntry(i3, 1, 56, writeStandardEntry, "indirect_edge"), Boolean.TRUE.toString());
            }
            if (dFv.A03(2)) {
                Logger.writeBytesEntry(i3, 1, 57, Logger.writeBytesEntry(i3, 1, 56, writeStandardEntry, "manual_point"), Boolean.TRUE.toString());
            }
        }
    }

    public final void AzD(C29911DFv dFv) {
        if (TraceEvents.isEnabled(A00)) {
            Logger.writeStandardEntry(A00, 7, 23, 0, 0, 0, 0, 0);
        }
    }

    public final int getSupportedProviders() {
        return A00;
    }

    public final int getTracingProviders() {
        return A00 & TraceEvents.sProviders;
    }

    public final boolean isEnabled() {
        return TraceEvents.isEnabled(A00);
    }

    public static String A00(C29911DFv dFv) {
        String A012 = C29914DFy.A01(dFv);
        if (A012 == null) {
            return "null";
        }
        return A012;
    }

    public final void disable() {
        AnonymousClass0Z0.A0A(1367702729, AnonymousClass0Z0.A03(490300291));
    }

    public final void enable() {
        AnonymousClass0Z0.A0A(-121883827, AnonymousClass0Z0.A03(-369493429));
    }
}
