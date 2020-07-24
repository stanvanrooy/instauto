package p000X;

import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.BEM */
public final class BEM {
    public final BEN A00 = new BEN();
    public final XmlPullParser A01;

    public BEM(XmlPullParser xmlPullParser) {
        this.A01 = xmlPullParser;
    }

    public static final String A00(BEM bem, String str) {
        for (int i = 0; i < bem.A01.getAttributeCount(); i++) {
            if (bem.A01.getAttributeName(i).equals(str)) {
                return bem.A01.getAttributeValue(i);
            }
        }
        return null;
    }

    public static final void A01(BEM bem) {
        int i = 1;
        while (i != 0) {
            int next = bem.A01.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }
}
