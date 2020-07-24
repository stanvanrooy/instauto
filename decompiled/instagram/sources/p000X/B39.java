package p000X;

/* renamed from: X.B39 */
public final class B39 {
    public static void A00(AnonymousClass0C1 r1, AnonymousClass0P4 r2, Integer num) {
        if (num == Constants.ONE) {
            AnonymousClass0WN.A01(r1).BdB(r2);
        } else if (num == Constants.ZERO) {
            AnonymousClass0WN.A01(r1).BcG(r2);
        } else {
            throw new UnsupportedOperationException("Unhandled survey type");
        }
    }

    public static void A01(AnonymousClass0C1 r3, B3G b3g, AnonymousClass0RN r5, boolean z) {
        AnonymousClass0P4 A00 = AnonymousClass0P4.A00(AnonymousClass000.A0E(AnonymousClass0C5.$const$string(9), "survey_primer_response"), r5);
        A00.A0G("survey_id", b3g.A01);
        A00.A0A("responses", Boolean.valueOf(z));
        A00.A0G("tracking_token", b3g.A03);
        AnonymousClass0WN.A01(r3).BcG(A00);
    }
}
