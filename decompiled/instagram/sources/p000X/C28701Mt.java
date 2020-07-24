package p000X;

/* renamed from: X.1Mt  reason: invalid class name and case insensitive filesystem */
public class C28701Mt implements C28711Mu {
    public int mStatusCode = -1;

    public int getStatusCode() {
        return this.mStatusCode;
    }

    public boolean isOk() {
        int i = this.mStatusCode;
        if (i < 200 || i >= 300) {
            return false;
        }
        return true;
    }

    public void setStatusCode(int i) {
        this.mStatusCode = i;
    }
}
