package p000X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import com.facebook.C0003R;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.A7a */
public final class A7a {
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    public static ColorStateList A00(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2 || next == 1) {
                if (next != 2) {
                    return A01(resources, xmlPullParser, asAttributeSet, theme);
                }
                throw new XmlPullParserException("No start tag found");
            }
            next = xmlPullParser.next();
            break;
        } while (next == 1);
        if (next != 2) {
        }
    }

    /* JADX WARNING: type inference failed for: r1v11, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c2  */
    /* JADX WARNING: Unknown variable types count: 1 */
    public static ColorStateList A01(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        TypedArray obtainStyledAttributes;
        int attributeCount;
        int i;
        int i2;
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            AttributeSet attributeSet2 = attributeSet;
            int i3 = 1;
            int depth2 = xmlPullParser.getDepth() + 1;
            int[][] iArr = new int[20][];
            int[] iArr2 = new int[20];
            int i4 = 0;
            while (true) {
                int next = xmlPullParser.next();
                if (next == i3 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                    int[] iArr3 = new int[i4];
                    int[][] iArr4 = new int[i4][];
                    System.arraycopy(iArr2, 0, iArr3, 0, i4);
                    System.arraycopy(iArr, 0, iArr4, 0, i4);
                } else {
                    if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                        int[] iArr5 = C73133Im.A00;
                        Resources.Theme theme2 = theme;
                        if (theme == null) {
                            obtainStyledAttributes = resources.obtainAttributes(attributeSet2, iArr5);
                        } else {
                            obtainStyledAttributes = theme2.obtainStyledAttributes(attributeSet2, iArr5, 0, 0);
                        }
                        int color = obtainStyledAttributes.getColor(0, -65281);
                        float f = 1.0f;
                        int i5 = 1;
                        if (!obtainStyledAttributes.hasValue(1)) {
                            if (obtainStyledAttributes.hasValue(2)) {
                                i5 = 2;
                            }
                            obtainStyledAttributes.recycle();
                            attributeCount = attributeSet.getAttributeCount();
                            int[] iArr6 = new int[attributeCount];
                            int i6 = 0;
                            for (i = 0; i < attributeCount; i++) {
                                int attributeNameResource = attributeSet2.getAttributeNameResource(i);
                                if (!(attributeNameResource == 16843173 || attributeNameResource == 16843551 || attributeNameResource == C0003R.attr.alpha)) {
                                    int i7 = i6 + 1;
                                    if (!attributeSet2.getAttributeBooleanValue(i, false)) {
                                        attributeNameResource = -attributeNameResource;
                                    }
                                    iArr6[i6] = attributeNameResource;
                                    i6 = i7;
                                }
                            }
                            int[] trimStateSet = StateSet.trimStateSet(iArr6, i6);
                            int round = (color & 16777215) | (Math.round(((float) Color.alpha(color)) * f) << 24);
                            i2 = i4 + 1;
                            if (i2 > iArr2.length) {
                                int i8 = i4 << 1;
                                if (i4 <= 4) {
                                    i8 = 8;
                                }
                                int[] iArr7 = new int[i8];
                                System.arraycopy(iArr2, 0, iArr7, 0, i4);
                                iArr2 = iArr7;
                            }
                            iArr2[i4] = round;
                            if (i2 > iArr.length) {
                                Class<?> componentType = iArr.getClass().getComponentType();
                                int i9 = i4 << 1;
                                if (i4 <= 4) {
                                    i9 = 8;
                                }
                                ? r1 = (Object[]) Array.newInstance(componentType, i9);
                                System.arraycopy(iArr, 0, r1, 0, i4);
                                iArr = r1;
                            }
                            iArr[i4] = trimStateSet;
                            iArr = iArr;
                            i4 = i2;
                        }
                        f = obtainStyledAttributes.getFloat(i5, 1.0f);
                        obtainStyledAttributes.recycle();
                        attributeCount = attributeSet.getAttributeCount();
                        int[] iArr62 = new int[attributeCount];
                        int i62 = 0;
                        while (i < attributeCount) {
                        }
                        int[] trimStateSet2 = StateSet.trimStateSet(iArr62, i62);
                        int round2 = (color & 16777215) | (Math.round(((float) Color.alpha(color)) * f) << 24);
                        i2 = i4 + 1;
                        if (i2 > iArr2.length) {
                        }
                        iArr2[i4] = round2;
                        if (i2 > iArr.length) {
                        }
                        iArr[i4] = trimStateSet2;
                        iArr = iArr;
                        i4 = i2;
                    }
                    i3 = 1;
                }
            }
            int[] iArr32 = new int[i4];
            int[][] iArr42 = new int[i4][];
            System.arraycopy(iArr2, 0, iArr32, 0, i4);
            System.arraycopy(iArr, 0, iArr42, 0, i4);
            return new ColorStateList(iArr42, iArr32);
        }
        throw new XmlPullParserException(AnonymousClass000.A0J(xmlPullParser.getPositionDescription(), ": invalid color state list tag ", name));
    }
}
