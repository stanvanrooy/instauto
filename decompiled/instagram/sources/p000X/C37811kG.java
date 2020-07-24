package p000X;

import android.text.Layout;
import java.util.Locale;
import java.util.regex.Matcher;

/* renamed from: X.1kG  reason: invalid class name and case insensitive filesystem */
public final class C37811kG {
    public static final CharSequence A00 = "…";

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0122, code lost:
        if (r8 > r3) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0124, code lost:
        r9 = r3 - r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0166, code lost:
        if (r2 > r3) goto L_0x0124;
     */
    public static CharSequence A01(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, AnonymousClass1PB r17) {
        int i2;
        int i3 = i;
        if (i3 >= 1) {
            CharSequence charSequence4 = charSequence;
            StringBuilder sb = new StringBuilder(charSequence);
            sb.append(charSequence2);
            AnonymousClass1PB r4 = r17;
            Layout A002 = r4.A00(sb);
            if (A002.getLineCount() > i3) {
                int i4 = i - 1;
                int lineStart = A002.getLineStart(i4);
                String substring = sb.substring(lineStart, A002.getLineEnd(i4));
                StringBuilder sb2 = new StringBuilder(substring);
                int length = sb2.length();
                CharSequence charSequence5 = charSequence3;
                sb2.append(charSequence3);
                float measureText = r4.A04.measureText(sb2, 0, sb2.length());
                boolean z = true;
                while (measureText > ((float) r4.A02)) {
                    if (z) {
                        i2 = Character.codePointCount(charSequence5, 0, charSequence5.length());
                        int codePointCount = sb2.codePointCount(0, length);
                        if (i2 > codePointCount) {
                            AnonymousClass0QD.A01("EllipsizeTextUtil.trimLineToFitSuffix#SuffixLongerThanContent", String.format(Locale.US, "Suffix longer than content: '%s', suffix: '%s', endOfLinePosition: %d trimCodePoints: %d", new Object[]{substring, charSequence5, Integer.valueOf(length), Integer.valueOf(i2)}));
                            i2 = codePointCount;
                        }
                    } else {
                        i2 = 1;
                    }
                    try {
                        length = sb2.offsetByCodePoints(length, -i2);
                        sb2.setLength(length);
                        sb2.append(charSequence5);
                        measureText = r4.A04.measureText(sb2, 0, sb2.length());
                        z = false;
                    } catch (IndexOutOfBoundsException unused) {
                        AnonymousClass0QD.A01("EllipsizeTextUtil.trimLineToFitSuffix#IndexOutOfBoundsException", String.format(Locale.US, "Attempted to trim line: '%s', suffix: '%s', endOfLinePosition: %d trimCodePoints: %d", new Object[]{substring, charSequence5, Integer.valueOf(length), Integer.valueOf(i2)}));
                    }
                }
                sb2.setLength(length);
                if (sb2.length() + lineStart < charSequence4.length()) {
                    return "";
                }
                StringBuilder sb3 = new StringBuilder(sb.subSequence(charSequence4.length(), lineStart + sb2.length()));
                int i5 = 0;
                String substring2 = sb.substring(charSequence4.length());
                String charSequence6 = sb3.toString();
                String charSequence7 = substring2.toString();
                int length2 = sb3.length() - 0;
                int lastIndexOf = charSequence6.lastIndexOf(64);
                if (lastIndexOf != -1) {
                    int i6 = -1;
                    if (charSequence7 != null && lastIndexOf >= 0 && lastIndexOf < charSequence7.length() && charSequence7.charAt(lastIndexOf) == '@') {
                        Matcher matcher = C06360Ot.A01.matcher(charSequence7);
                        if (matcher.find(lastIndexOf) && lastIndexOf == matcher.start()) {
                            i6 = matcher.end(1);
                        }
                    }
                }
                lastIndexOf = charSequence6.lastIndexOf(35);
                if (lastIndexOf != -1) {
                    int i7 = -1;
                    if (charSequence7 != null && lastIndexOf >= 0 && lastIndexOf < charSequence7.length() && charSequence7.charAt(lastIndexOf) == '#') {
                        Matcher A003 = C39011mD.A00(charSequence7);
                        if (A003.find(lastIndexOf) && A003.start() == lastIndexOf) {
                            i7 = A003.end(1);
                        }
                    }
                }
                sb3.setLength(sb3.length() - i5);
                sb3.setLength(A00(sb3));
                return sb3;
            }
        }
        return charSequence2;
    }

    public static int A00(CharSequence charSequence) {
        int length = charSequence.length();
        while (length > 0) {
            int i = length - 1;
            if (!Character.isWhitespace(charSequence.charAt(i))) {
                break;
            }
            length = i;
        }
        return length;
    }
}
