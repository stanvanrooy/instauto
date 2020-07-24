package p000X;

import android.text.TextUtils;
import com.facebook.grimsey.GrimseyFBsystraceListener;

/* renamed from: X.BG1 */
public final class BG1 {
    public int A00 = 16;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public final /* synthetic */ GrimseyFBsystraceListener A04;

    public BG1(GrimseyFBsystraceListener grimseyFBsystraceListener, String str) {
        Class cls;
        Object[] objArr;
        String str2;
        this.A04 = grimseyFBsystraceListener;
        if (!TextUtils.isEmpty(str)) {
            for (String str3 : str.split(" ")) {
                String[] split = str3.split("=", 2);
                if (split.length == 2) {
                    String str4 = split[0];
                    try {
                        int parseInt = Integer.parseInt(split[1]);
                        char c = 65535;
                        switch (str4.hashCode()) {
                            case -1589488751:
                                if (str4.equals("MAX_STACK_DEPTH")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 53437699:
                                if (str4.equals("MIN_TRACKED_SIZE")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 117306161:
                                if (str4.equals("MAX_TRACKED_SIZE")) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case 546650689:
                                if (str4.equals("MIN_SIZE_FOR_STACK")) {
                                    c = 1;
                                    break;
                                }
                                break;
                        }
                        if (c == 0) {
                            this.A00 = parseInt;
                        } else if (c == 1) {
                            this.A02 = parseInt;
                        } else if (c == 2) {
                            this.A01 = parseInt;
                        } else if (c != 3) {
                            AnonymousClass0DB.A08(GrimseyFBsystraceListener.A02, "Unrecognized Setting %s", str4);
                        } else {
                            this.A03 = parseInt;
                        }
                    } catch (NumberFormatException unused) {
                        cls = GrimseyFBsystraceListener.A02;
                        objArr = new Object[]{str4, split[1]};
                        str2 = "%s has an invalid value %s";
                        AnonymousClass0DB.A08(cls, str2, objArr);
                    } catch (Exception e) {
                        cls = GrimseyFBsystraceListener.A02;
                        objArr = new Object[]{str3, e};
                        str2 = "Failed to parse option %s";
                        AnonymousClass0DB.A08(cls, str2, objArr);
                    }
                }
            }
        }
    }
}
