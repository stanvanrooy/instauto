package p000X;

import java.io.Writer;

/* renamed from: X.08g  reason: invalid class name and case insensitive filesystem */
public final class C037308g implements AnonymousClass04M {
    public final boolean A4Z(Writer writer, AnonymousClass04L r6) {
        try {
            int openFDCount = AnonymousClass030.A00().getOpenFDCount();
            AnonymousClass02z openFDLimits = AnonymousClass030.A00().getOpenFDLimits();
            writer.append("\"openFDCount\":");
            writer.append(Integer.toString(openFDCount));
            if (openFDLimits != null) {
                writer.append(",");
                writer.append("\"softFDLimit\":");
                writer.append(Integer.toString(openFDLimits.A01));
                writer.append(",");
                writer.append("\"hardFDLimit\":");
                writer.append(Integer.toString(openFDLimits.A00));
            }
            return true;
        } catch (Exception unused) {
            writer.append("\"FDReportError\":1");
            return true;
        }
    }
}
