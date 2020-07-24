package p000X;

/* renamed from: X.BSP */
public enum BSP {
    DOWNLOAD(Constants.ZERO),
    UPLOAD(Constants.ONE);
    
    public final Integer A00;

    /* access modifiers changed from: public */
    BSP(Integer num) {
        this.A00 = num;
    }
}
