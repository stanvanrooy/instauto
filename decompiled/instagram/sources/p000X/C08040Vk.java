package p000X;

/* renamed from: X.0Vk  reason: invalid class name and case insensitive filesystem */
public final class C08040Vk extends Exception {
    public C08040Vk() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C08040Vk(Integer num) {
        super(1 - num.intValue() != 0 ? "NOT_CONNECTED" : "REF_CODE_EXPIRED");
    }

    public C08040Vk(String str) {
        super(str, (Throwable) null);
    }
}
