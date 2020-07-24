package p000X;

/* renamed from: X.DFW */
public final class DFW extends Exception {
    public DFW(String str) {
        super(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DFW(String str, String str2) {
        super(AnonymousClass000.A0J(str, ": ", str2 == null ? "null" : str2));
    }
}
