package p000X;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.0pK  reason: invalid class name and case insensitive filesystem */
public final class C16890pK extends C15190mU implements C14250k8 {
    public static final Pattern A01 = Pattern.compile("rtt=(\\d+)");
    public final C14250k8 A00;

    public final void onResponseStarted(AnonymousClass1C4 r6, C256019m r7, C33851db r8) {
        if (r8.A02("X-FB-Connection-Quality")) {
            Matcher matcher = A01.matcher(r8.A00("X-FB-Connection-Quality").A01);
            if (matcher.find()) {
                try {
                    double parseDouble = Double.parseDouble(matcher.group(1));
                    if (parseDouble > 1.0d) {
                        C15710nP.A00().A01.A00(parseDouble);
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
    }

    public C16890pK(C14250k8 r1) {
        this.A00 = r1;
    }

    public final C26211Cc startRequest(AnonymousClass1C4 r2, C256019m r3, AnonymousClass1CB r4) {
        r4.A04(this);
        return this.A00.startRequest(r2, r3, r4);
    }
}
