package p000X;

/* renamed from: X.BUN */
public enum BUN {
    LOW_MEMORY(r1),
    EXCEPTION(r1),
    A07(r1),
    STOPPED(r13),
    ITEM_SCAN_LIMIT_REACHED(r13),
    COMPLETED(r13);
    
    public Integer A00;

    /* access modifiers changed from: public */
    BUN(Integer num) {
        this.A00 = num;
    }
}
