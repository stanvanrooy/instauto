package p000X;

/* renamed from: X.CZV */
public final class CZV {
    public int A00;
    public String A01;

    public static String A00(int i) {
        StringBuilder sb;
        String str;
        String[] split = "0:OK/1:User Canceled/2:Unknown/3:Billing Unavailable/4:Item unavailable/5:Developer Error/6:Error/7:Item Already Owned/8:Item not owned".split("/");
        String[] split2 = "0:OK/-1001:Remote exception during initialization/-1002:Bad response received/-1003:Purchase signature verification failed/-1004:Send intent failed/-1005:User cancelled/-1006:Unknown purchase response/-1007:Missing token/-1008:Unknown error/-1009:Subscriptions not available/-1010:Invalid consumption attempt".split("/");
        if (i <= -1000) {
            int i2 = -1000 - i;
            if (i2 >= 0 && i2 < split2.length) {
                return split2[i2];
            }
            sb = new StringBuilder();
            sb.append(String.valueOf(i));
            str = ":Unknown IAB Helper Error";
        } else if (i >= 0 && i < split.length) {
            return split[i];
        } else {
            sb = new StringBuilder();
            sb.append(String.valueOf(i));
            str = ":Unknown";
        }
        sb.append(str);
        return sb.toString();
    }

    public final String toString() {
        return AnonymousClass000.A0E("IabResult: ", this.A01);
    }

    public CZV(int i, String str) {
        String A002;
        this.A00 = i;
        if (str == null || str.trim().length() == 0) {
            A002 = A00(i);
        } else {
            A002 = AnonymousClass000.A0N(str, " (response: ", A00(i), ")");
        }
        this.A01 = A002;
    }
}
