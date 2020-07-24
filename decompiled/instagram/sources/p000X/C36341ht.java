package p000X;

/* renamed from: X.1ht  reason: invalid class name and case insensitive filesystem */
public enum C36341ht {
    IDLE("idle"),
    PREPARING("preparing"),
    PREPARED("prepared"),
    PLAYING("playing"),
    PAUSED("paused"),
    STOPPING("stopping");
    
    public final String A00;

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    C36341ht(String str) {
        this.A00 = str;
    }
}
