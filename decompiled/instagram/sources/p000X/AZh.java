package p000X;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.AZh */
public final class AZh {
    public final LinkedList A00;

    public static String A00(String str, int i, int i2, boolean z) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            AnonymousClass0a4.A0C(z, "Start Bitrate is supported for video codec only");
            sb.append("x-google-start-bitrate");
            sb.append('=');
            sb.append(i);
        }
        if (i2 > 0) {
            if (sb.length() > 0) {
                sb.append("; ");
            }
            if (z) {
                str2 = "x-google-max-bitrate";
            } else {
                str2 = "maxaveragebitrate";
            }
            sb.append(str2);
            sb.append('=');
            if (!z) {
                i2 *= 1000;
            }
            sb.append(i2);
        }
        sb.insert(0, str);
        return sb.toString();
    }

    public static void A01(AZh aZh, String str, int i, int i2, boolean z) {
        String str2;
        int i3;
        Pattern compile = Pattern.compile(AnonymousClass000.A0J("^a=rtpmap:(\\d+) ", str, "(/\\d+)+[\r]?$"));
        ListIterator listIterator = aZh.A00.listIterator();
        while (true) {
            str2 = null;
            if (!listIterator.hasNext()) {
                i3 = -1;
                break;
            }
            i3 = listIterator.nextIndex();
            Matcher matcher = compile.matcher((String) listIterator.next());
            if (matcher.matches()) {
                str2 = matcher.group(1);
                break;
            }
        }
        if (str2 == null) {
            AnonymousClass0DB.A0K("SdpEditor", "No rtpmap for %s codec", str);
            return;
        }
        Pattern compile2 = Pattern.compile(AnonymousClass000.A0J("^a=fmtp:", str2, " \\w+=\\d+.*[\r]?$"));
        ListIterator listIterator2 = aZh.A00.listIterator();
        while (listIterator2.hasNext()) {
            String str3 = (String) listIterator2.next();
            if (compile2.matcher(str3).matches()) {
                listIterator2.set(A00(AnonymousClass000.A0E(str3, "; "), i, i2, z));
                return;
            }
        }
        if (i3 > -1) {
            aZh.A00.add(i3 + 1, A00(AnonymousClass000.A0J("a=fmtp:", str2, " "), i, i2, z));
        }
    }

    public static void A02(AZh aZh, String str, boolean z) {
        String str2;
        Object[] objArr;
        String str3;
        Pattern compile = Pattern.compile(AnonymousClass000.A0J("^a=rtpmap:(\\d+) ", str, "(/\\d+)+[\r]?$"));
        if (z) {
            str2 = "m=audio ";
        } else {
            str2 = "m=video ";
        }
        ListIterator listIterator = aZh.A00.listIterator();
        String str4 = null;
        String str5 = null;
        int i = -1;
        while (listIterator.hasNext()) {
            int nextIndex = listIterator.nextIndex();
            String str6 = (String) listIterator.next();
            if (str6.startsWith(str2)) {
                i = nextIndex;
                str5 = str6;
            } else {
                Matcher matcher = compile.matcher(str6);
                if (matcher.matches()) {
                    str4 = matcher.group(1);
                }
            }
        }
        if (i == -1) {
            objArr = new Object[]{str2, str};
            str3 = "No %s line, so can't prefer %s";
        } else if (str4 == null) {
            objArr = new Object[]{str};
            str3 = "No rtpmap for %s";
        } else {
            String[] split = str5.split(" ");
            int length = split.length;
            if (length > 3) {
                StringBuilder sb = new StringBuilder();
                sb.append(split[0]);
                sb.append(" ");
                sb.append(split[1]);
                sb.append(" ");
                sb.append(split[2]);
                sb.append(" ");
                sb.append(str4);
                for (int i2 = 3; i2 < length; i2++) {
                    String str7 = split[i2];
                    if (!str7.equals(str4)) {
                        sb.append(" ");
                        sb.append(str7);
                    }
                }
                aZh.A00.set(i, sb.toString());
                return;
            }
            AnonymousClass0DB.A0J("SdpEditor", "Wrong SDP media description format: %s", str5);
            return;
        }
        AnonymousClass0DB.A0K("SdpEditor", str3, objArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append("\r\n");
        }
        return sb.toString();
    }

    public AZh(String str) {
        this.A00 = new LinkedList(Arrays.asList(str.split("\\r\\n?|\\n")));
    }

    public final void A03(Integer num) {
        String str;
        if (1 - num.intValue() != 0) {
            str = "ISAC";
        } else {
            str = "OPUS";
        }
        A02(this, str, true);
    }
}
