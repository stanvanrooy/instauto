package p000X;

import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.BEQ */
public final class BEQ {
    public static boolean A00(XmlPullParser xmlPullParser, String str) {
        boolean z = false;
        if (xmlPullParser.getEventType() == 3) {
            z = true;
        }
        if (!z || !xmlPullParser.getName().equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean A01(XmlPullParser xmlPullParser, String str) {
        boolean z = false;
        if (xmlPullParser.getEventType() == 2) {
            z = true;
        }
        if (!z || !xmlPullParser.getName().equals(str)) {
            return false;
        }
        return true;
    }
}
