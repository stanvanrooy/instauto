package p000X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.D0Y */
public enum D0Y {
    Cp437((String) new int[]{0, 2}, (int) new String[0]),
    ISO8859_1((String) new int[]{1, 3}, (int) new String[]{"ISO-8859-1"}),
    ISO8859_2((String) 4, (int) new String[]{"ISO-8859-2"}),
    ISO8859_3((String) 5, (int) new String[]{"ISO-8859-3"}),
    ISO8859_4((String) 6, (int) new String[]{"ISO-8859-4"}),
    ISO8859_5((String) 7, (int) new String[]{"ISO-8859-5"}),
    ISO8859_6((String) 8, (int) new String[]{"ISO-8859-6"}),
    ISO8859_7((String) 9, (int) new String[]{"ISO-8859-7"}),
    ISO8859_8((String) 10, (int) new String[]{"ISO-8859-8"}),
    ISO8859_9((String) 11, (int) new String[]{"ISO-8859-9"}),
    ISO8859_10((String) 12, (int) new String[]{"ISO-8859-10"}),
    ISO8859_11((String) 13, (int) new String[]{"ISO-8859-11"}),
    ISO8859_13((String) 15, (int) new String[]{"ISO-8859-13"}),
    ISO8859_14((String) 16, (int) new String[]{"ISO-8859-14"}),
    ISO8859_15((String) 17, (int) new String[]{"ISO-8859-15"}),
    ISO8859_16((String) 18, (int) new String[]{"ISO-8859-16"}),
    SJIS((String) 20, (int) new String[]{"Shift_JIS"}),
    Cp1250((String) 21, (int) new String[]{"windows-1250"}),
    Cp1251((String) 22, (int) new String[]{"windows-1251"}),
    Cp1252((String) 23, (int) new String[]{"windows-1252"}),
    Cp1256((String) 24, (int) new String[]{"windows-1256"}),
    UnicodeBigUnmarked((String) 25, (int) new String[]{"UTF-16BE", "UnicodeBig"}),
    UTF8((String) 26, (int) new String[]{"UTF-8"});
    
    public static final Map A02 = null;
    public static final Map A03 = null;
    public final int[] A00;
    public final String[] A01;

    /* access modifiers changed from: public */
    static {
        A03 = new HashMap();
        A02 = new HashMap();
        for (D0Y d0y : values()) {
            for (int valueOf : d0y.A00) {
                A03.put(Integer.valueOf(valueOf), d0y);
            }
            A02.put(d0y.name(), d0y);
            for (String put : d0y.A01) {
                A02.put(put, d0y);
            }
        }
    }

    /* access modifiers changed from: public */
    D0Y(int i, String... strArr) {
        this.A00 = new int[]{i};
        this.A01 = strArr;
    }

    /* access modifiers changed from: public */
    D0Y(int[] iArr, String... strArr) {
        this.A00 = iArr;
        this.A01 = strArr;
    }
}
