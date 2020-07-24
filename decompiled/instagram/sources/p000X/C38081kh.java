package p000X;

import com.facebook.react.modules.dialog.DialogModule;
import java.util.ArrayList;

/* renamed from: X.1kh  reason: invalid class name and case insensitive filesystem */
public final class C38081kh {
    public static C38091ki parseFromJson(C13080hr r7) {
        ArrayList arrayList;
        String A0t;
        C49042Am r1;
        C38091ki r4 = new C38091ki();
        if (r7.A0g() != C13120hv.START_OBJECT) {
            r7.A0f();
            return null;
        }
        while (r7.A0p() != C13120hv.END_OBJECT) {
            String A0i = r7.A0i();
            r7.A0p();
            if ("gating_type".equals(A0i)) {
                String A0r = r7.A0r();
                C49042Am[] values = C49042Am.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        r1 = null;
                        break;
                    }
                    r1 = values[i];
                    if (r1.A00.equals(A0r)) {
                        break;
                    }
                    i++;
                }
                r4.A00 = r1;
            } else {
                String str = null;
                if (DialogModule.KEY_TITLE.equals(A0i)) {
                    if (r7.A0g() != C13120hv.VALUE_NULL) {
                        str = r7.A0t();
                    }
                    r4.A04 = str;
                } else if ("description".equals(A0i)) {
                    if (r7.A0g() != C13120hv.VALUE_NULL) {
                        str = r7.A0t();
                    }
                    r4.A02 = str;
                } else if ("buttons".equals(A0i)) {
                    if (r7.A0g() == C13120hv.START_ARRAY) {
                        arrayList = new ArrayList();
                        while (r7.A0p() != C13120hv.END_ARRAY) {
                            if (r7.A0g() == C13120hv.VALUE_NULL) {
                                A0t = null;
                            } else {
                                A0t = r7.A0t();
                            }
                            if (A0t != null) {
                                arrayList.add(A0t);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    r4.A05 = arrayList;
                } else if ("center_button".equals(A0i)) {
                    if (r7.A0g() != C13120hv.VALUE_NULL) {
                        str = r7.A0t();
                    }
                    r4.A01 = str;
                } else if ("post_reveal_cta".equals(A0i)) {
                    if (r7.A0g() != C13120hv.VALUE_NULL) {
                        str = r7.A0t();
                    }
                    r4.A03 = str;
                }
            }
            r7.A0f();
        }
        return r4;
    }

    public static void A00(C13460iZ r2, C38091ki r3) {
        r2.A0T();
        C49042Am r0 = r3.A00;
        if (r0 != null) {
            r2.A0H("gating_type", r0.A00);
        }
        String str = r3.A04;
        if (str != null) {
            r2.A0H(DialogModule.KEY_TITLE, str);
        }
        String str2 = r3.A02;
        if (str2 != null) {
            r2.A0H("description", str2);
        }
        if (r3.A05 != null) {
            r2.A0d("buttons");
            r2.A0S();
            for (String str3 : r3.A05) {
                if (str3 != null) {
                    r2.A0g(str3);
                }
            }
            r2.A0P();
        }
        String str4 = r3.A01;
        if (str4 != null) {
            r2.A0H("center_button", str4);
        }
        String str5 = r3.A03;
        if (str5 != null) {
            r2.A0H("post_reveal_cta", str5);
        }
        r2.A0Q();
    }
}
