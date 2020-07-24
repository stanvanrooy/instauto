package p000X;

import java.io.Writer;

/* renamed from: X.07c  reason: invalid class name and case insensitive filesystem */
public final class C034707c implements AnonymousClass04M {
    public final boolean A4Z(Writer writer, AnonymousClass04L r5) {
        C028404g A00 = C028504h.A00();
        if (A00 == null) {
            return false;
        }
        writer.append("\"oom_adj\":");
        writer.append(Integer.toString(A00.A00));
        writer.append(",");
        writer.append("\"oom_score\":");
        writer.append(Integer.toString(A00.A01));
        writer.append(",");
        writer.append("\"oom_score_adj\":");
        writer.append(Integer.toString(A00.A02));
        return true;
    }
}
