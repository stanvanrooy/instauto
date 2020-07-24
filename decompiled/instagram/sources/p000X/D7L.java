package p000X;

/* renamed from: X.D7L */
public final /* synthetic */ class D7L implements D9C {
    public static final /* synthetic */ D7L A00 = new D7L();

    public final int AVB(Object obj) {
        String str = ((D70) obj).A02;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (C25948Bd0.A00 >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}
