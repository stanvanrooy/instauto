package p000X;

import java.util.List;

/* renamed from: X.CBR */
public final class CBR implements AnonymousClass07S {
    public final /* synthetic */ CBO A00;

    public CBR(CBO cbo) {
        this.A00 = cbo;
    }

    public final void Bp4(String str, AnonymousClass07R r6) {
        String str2;
        String str3 = this.A00.A01;
        if (str3 != null) {
            str = AnonymousClass000.A0J(str, ":", str3);
        }
        List<String> list = r6.A02;
        switch (r6.A00.intValue()) {
            case 1:
                str2 = "Camera opened while the app was backgrounded.";
                break;
            case 2:
                str2 = "Camera opened but not used.";
                break;
            default:
                str2 = "Camera wasn't closed before the app was backgrounded.";
                break;
        }
        if (!list.isEmpty()) {
            StringBuilder sb = new StringBuilder(str2);
            sb.append(" ");
            for (String append : list) {
                sb.append(append);
            }
            str2 = sb.toString();
        }
        AnonymousClass0QD.A08(str, str2, r6.A01, 1);
    }
}
