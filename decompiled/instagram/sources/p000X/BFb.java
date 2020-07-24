package p000X;

/* renamed from: X.BFb */
public final class BFb extends BFa {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    public BFb(int i) {
        super(String.format("Split Install Error(%d): %s", r5));
        String str;
        Object[] objArr = new Object[2];
        Integer valueOf = Integer.valueOf(i);
        objArr[0] = valueOf;
        if (!BFd.A00.containsKey(valueOf) || !BFd.A01.containsKey(valueOf)) {
            str = "";
        } else {
            String str2 = (String) BFd.A00.get(valueOf);
            String str3 = (String) BFd.A01.get(valueOf);
            int length = String.valueOf(str2).length();
            StringBuilder sb = new StringBuilder(length + 118 + String.valueOf(str3).length());
            sb.append(str2);
            sb.append(" (https://developer.android.com/reference/com/google/android/play/core/splitinstall/model/SplitInstallErrorCode.html#");
            sb.append(str3);
            sb.append(")");
            str = sb.toString();
        }
        objArr[1] = str;
        if (i != 0) {
            this.A00 = i;
            return;
        }
        throw new IllegalArgumentException("errorCode should not be 0.");
    }

    public final int A00() {
        return this.A00;
    }
}
