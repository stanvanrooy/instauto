package p000X;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.facebook.react.uimanager.BaseViewManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.A7X */
public final class A7X {
    public static boolean A04(int i) {
        return i >= 28 && i <= 31;
    }

    public static Animator A00(Context context, int i) {
        Resources.NotFoundException notFoundException;
        Context context2 = context;
        if (Build.VERSION.SDK_INT >= 24) {
            return AnimatorInflater.loadAnimator(context, i);
        }
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        XmlResourceParser xmlResourceParser = null;
        try {
            XmlResourceParser animation = resources.getAnimation(i);
            Animator A01 = A01(context2, resources, theme, animation, Xml.asAttributeSet(animation), (AnimatorSet) null, 0);
            if (animation == null) {
                return A01;
            }
            animation.close();
            return A01;
        } catch (XmlPullParserException e) {
            notFoundException = new Resources.NotFoundException(AnonymousClass000.A0E("Can't load animation resource ID #0x", Integer.toHexString(i)));
            notFoundException.initCause(e);
        } catch (IOException e2) {
            notFoundException = new Resources.NotFoundException(AnonymousClass000.A0E("Can't load animation resource ID #0x", Integer.toHexString(i)));
            notFoundException.initCause(e2);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
        throw notFoundException;
    }

    public static PropertyValuesHolder A02(TypedArray typedArray, int i, int i2, int i3, String str) {
        int i4;
        int i5;
        C23104A7i a7i;
        int i6;
        int[] iArr;
        int i7;
        int i8;
        float f;
        float[] fArr;
        float f2;
        float f3;
        C23102A7g a7g;
        Object[] objArr;
        int i9 = i;
        int i10 = i2;
        TypedValue peekValue = typedArray.peekValue(i10);
        boolean z = false;
        if (peekValue != null) {
            z = true;
        }
        if (z) {
            i4 = peekValue.type;
        } else {
            i4 = 0;
        }
        int i11 = i3;
        TypedValue peekValue2 = typedArray.peekValue(i11);
        boolean z2 = false;
        if (peekValue2 != null) {
            z2 = true;
        }
        if (z2) {
            i5 = peekValue2.type;
        } else {
            i5 = 0;
        }
        if (i9 == 4) {
            if ((!z || !A04(i4)) && (!z2 || !A04(i5))) {
                i9 = 0;
            } else {
                i9 = 3;
            }
        }
        boolean z3 = false;
        if (i9 == 0) {
            z3 = true;
        }
        PropertyValuesHolder propertyValuesHolder = null;
        String str2 = str;
        if (i9 == 2) {
            String string = typedArray.getString(i10);
            String string2 = typedArray.getString(i11);
            AnonymousClass21G[] A03 = AnonymousClass21E.A03(string);
            AnonymousClass21G[] A032 = AnonymousClass21E.A03(string2);
            if (A03 == null && A032 == null) {
                return null;
            }
            if (A03 != null) {
                a7g = new C23102A7g();
                if (A032 == null) {
                    objArr = new Object[]{A03};
                } else if (AnonymousClass21E.A01(A03, A032)) {
                    objArr = new Object[]{A03, A032};
                } else {
                    throw new InflateException(AnonymousClass000.A0N(" Can't morph from ", string, " to ", string2));
                }
            } else if (A032 == null) {
                return null;
            } else {
                a7g = new C23102A7g();
                objArr = new Object[]{A032};
            }
            return PropertyValuesHolder.ofObject(str2, a7g, objArr);
        }
        if (i9 == 3) {
            a7i = C23104A7i.A00;
        } else {
            a7i = null;
        }
        if (z3) {
            if (z) {
                if (i4 == 5) {
                    f2 = typedArray.getDimension(i10, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                } else {
                    f2 = typedArray.getFloat(i10, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                }
                if (z2) {
                    if (i5 == 5) {
                        f3 = typedArray.getDimension(i11, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    } else {
                        f3 = typedArray.getFloat(i11, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    }
                    fArr = new float[]{f2, f3};
                } else {
                    fArr = new float[]{f2};
                }
            } else {
                if (i5 == 5) {
                    f = typedArray.getDimension(i11, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                } else {
                    f = typedArray.getFloat(i11, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                }
                fArr = new float[]{f};
            }
            propertyValuesHolder = PropertyValuesHolder.ofFloat(str2, fArr);
        } else {
            if (z) {
                if (i4 == 5) {
                    i7 = (int) typedArray.getDimension(i10, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                } else if (A04(i4)) {
                    i7 = typedArray.getColor(i10, 0);
                } else {
                    i7 = typedArray.getInt(i10, 0);
                }
                if (z2) {
                    if (i5 == 5) {
                        i8 = (int) typedArray.getDimension(i11, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    } else if (A04(i5)) {
                        i8 = typedArray.getColor(i11, 0);
                    } else {
                        i8 = typedArray.getInt(i11, 0);
                    }
                    iArr = new int[]{i7, i8};
                } else {
                    iArr = new int[]{i7};
                }
            } else if (z2) {
                if (i5 == 5) {
                    i6 = (int) typedArray.getDimension(i11, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                } else if (A04(i5)) {
                    i6 = typedArray.getColor(i11, 0);
                } else {
                    i6 = typedArray.getInt(i11, 0);
                }
                iArr = new int[]{i6};
            }
            propertyValuesHolder = PropertyValuesHolder.ofInt(str2, iArr);
        }
        if (propertyValuesHolder == null || a7i == null) {
            return propertyValuesHolder;
        }
        propertyValuesHolder.setEvaluator(a7i);
        return propertyValuesHolder;
    }

    public static ValueAnimator A03(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, XmlPullParser xmlPullParser) {
        int resourceId;
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        int i;
        int i2;
        ValueAnimator valueAnimator2 = valueAnimator;
        Resources resources2 = resources;
        Resources.Theme theme2 = theme;
        AttributeSet attributeSet2 = attributeSet;
        TypedArray A02 = AnonymousClass21B.A02(resources2, theme2, attributeSet2, AnonymousClass21A.A03);
        TypedArray A022 = AnonymousClass21B.A02(resources2, theme2, attributeSet2, AnonymousClass21A.A07);
        if (valueAnimator == null) {
            valueAnimator2 = new ValueAnimator();
        }
        XmlPullParser xmlPullParser2 = xmlPullParser;
        long A01 = (long) AnonymousClass21B.A01(A02, xmlPullParser2, "duration", 1, DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
        long A012 = (long) AnonymousClass21B.A01(A02, xmlPullParser2, "startOffset", 2, 0);
        int A013 = AnonymousClass21B.A01(A02, xmlPullParser2, "valueType", 7, 4);
        if (AnonymousClass21B.A05(xmlPullParser2, "valueFrom") && AnonymousClass21B.A05(xmlPullParser2, "valueTo")) {
            if (A013 == 4) {
                TypedValue peekValue = A02.peekValue(5);
                boolean z = true;
                A013 = 0;
                boolean z2 = false;
                if (peekValue != null) {
                    z2 = true;
                }
                if (z2) {
                    i = peekValue.type;
                } else {
                    i = 0;
                }
                TypedValue peekValue2 = A02.peekValue(6);
                if (peekValue2 == null) {
                    z = false;
                }
                if (z) {
                    i2 = peekValue2.type;
                } else {
                    i2 = 0;
                }
                if ((z2 && A04(i)) || (z && A04(i2))) {
                    A013 = 3;
                }
            }
            PropertyValuesHolder A023 = A02(A02, A013, 5, 6, "");
            if (A023 != null) {
                valueAnimator2.setValues(new PropertyValuesHolder[]{A023});
            }
        }
        valueAnimator2.setDuration(A01);
        valueAnimator2.setStartDelay(A012);
        valueAnimator2.setRepeatCount(AnonymousClass21B.A01(A02, xmlPullParser2, "repeatCount", 3, 0));
        valueAnimator2.setRepeatMode(AnonymousClass21B.A01(A02, xmlPullParser2, "repeatMode", 4, 1));
        if (A022 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator2;
            String A04 = AnonymousClass21B.A04(A022, xmlPullParser2, "pathData", 1);
            if (A04 != null) {
                String A042 = AnonymousClass21B.A04(A022, xmlPullParser2, "propertyXName", 2);
                String A043 = AnonymousClass21B.A04(A022, xmlPullParser2, "propertyYName", 3);
                if (A042 == null && A043 == null) {
                    throw new InflateException(AnonymousClass000.A0E(A022.getPositionDescription(), " propertyXName or propertyYName is needed for PathData"));
                }
                Path A00 = AnonymousClass21E.A00(A04);
                float f = 1.0f * 0.5f;
                PathMeasure pathMeasure = new PathMeasure(A00, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
                float f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                do {
                    f2 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f2));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(A00, false);
                int min = Math.min(100, ((int) (f2 / f)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f3 = f2 / ((float) (min - 1));
                int i3 = 0;
                float f4 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                int i4 = 0;
                while (true) {
                    propertyValuesHolder = null;
                    if (i3 >= min) {
                        break;
                    }
                    pathMeasure2.getPosTan(f4 - ((Float) arrayList.get(i4)).floatValue(), fArr3, (float[]) null);
                    fArr[i3] = fArr3[0];
                    fArr2[i3] = fArr3[1];
                    f4 += f3;
                    int i5 = i4 + 1;
                    if (i5 < arrayList.size() && f4 > ((Float) arrayList.get(i5)).floatValue()) {
                        pathMeasure2.nextContour();
                        i4 = i5;
                    }
                    i3++;
                }
                if (A042 != null) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofFloat(A042, fArr);
                } else {
                    propertyValuesHolder2 = null;
                }
                if (A043 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(A043, fArr2);
                }
                if (propertyValuesHolder2 == null) {
                    objectAnimator.setValues(new PropertyValuesHolder[]{propertyValuesHolder});
                } else if (propertyValuesHolder == null) {
                    objectAnimator.setValues(new PropertyValuesHolder[]{propertyValuesHolder2});
                } else {
                    objectAnimator.setValues(new PropertyValuesHolder[]{propertyValuesHolder2, propertyValuesHolder});
                }
            } else {
                objectAnimator.setPropertyName(AnonymousClass21B.A04(A022, xmlPullParser2, "propertyName", 0));
            }
        }
        if (!AnonymousClass21B.A05(xmlPullParser2, "interpolator")) {
            resourceId = 0;
        } else {
            resourceId = A02.getResourceId(0, 0);
        }
        if (resourceId > 0) {
            valueAnimator2.setInterpolator(A7Z.A00(context, resourceId));
        }
        A02.recycle();
        if (A022 != null) {
            A022.recycle();
        }
        return valueAnimator2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: android.animation.Animator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: android.animation.Animator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: android.animation.Animator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: android.animation.Animator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v1, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: android.animation.Animator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: android.animation.Animator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: android.animation.Animator} */
    /* JADX WARNING: type inference failed for: r9v10, types: [android.animation.ValueAnimator] */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x016b, code lost:
        if (A04(r0.type) == false) goto L_0x016d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0200  */
    public static Animator A01(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i) {
        int i2;
        AnimatorSet animatorSet2;
        int size;
        int i3;
        float fraction;
        float fraction2;
        Keyframe ofObject;
        Keyframe ofObject2;
        TypedValue peekValue;
        Keyframe ofInt;
        int resourceId;
        TypedValue peekValue2;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        int depth = xmlPullParser2.getDepth();
        Animator animator = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser2.next();
            i2 = 0;
            animatorSet2 = animatorSet;
            if ((next != 3 || xmlPullParser2.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    String name = xmlPullParser2.getName();
                    Resources resources2 = resources;
                    Context context2 = context;
                    Resources.Theme theme2 = theme;
                    AttributeSet attributeSet2 = attributeSet;
                    if (name.equals("objectAnimator")) {
                        animator = new ObjectAnimator();
                        A03(context2, resources2, theme2, attributeSet2, animator, xmlPullParser2);
                    } else if (name.equals("animator")) {
                        animator = A03(context2, resources2, theme2, attributeSet2, (ValueAnimator) null, xmlPullParser2);
                    } else if (name.equals("set")) {
                        animator = new AnimatorSet();
                        TypedArray A02 = AnonymousClass21B.A02(resources2, theme2, attributeSet2, AnonymousClass21A.A04);
                        A01(context2, resources2, theme2, xmlPullParser2, attributeSet2, animator, AnonymousClass21B.A01(A02, xmlPullParser2, "ordering", 0, 0));
                        A02.recycle();
                    } else if (name.equals("propertyValuesHolder")) {
                        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser2);
                        XmlPullParser xmlPullParser3 = xmlPullParser2;
                        PropertyValuesHolder[] propertyValuesHolderArr = null;
                        ArrayList arrayList2 = null;
                        while (true) {
                            int eventType = xmlPullParser2.getEventType();
                            if (eventType != 3 && eventType != 1) {
                                if (eventType == 2 && xmlPullParser2.getName().equals("propertyValuesHolder")) {
                                    TypedArray A022 = AnonymousClass21B.A02(resources2, theme2, asAttributeSet, AnonymousClass21A.A08);
                                    TypedArray typedArray = A022;
                                    XmlPullParser xmlPullParser4 = xmlPullParser3;
                                    String A04 = AnonymousClass21B.A04(typedArray, xmlPullParser4, "propertyName", 3);
                                    int A01 = AnonymousClass21B.A01(typedArray, xmlPullParser4, "valueType", 2, 4);
                                    XmlPullParser xmlPullParser5 = xmlPullParser4;
                                    int i4 = A01;
                                    PropertyValuesHolder propertyValuesHolder = null;
                                    ArrayList arrayList3 = null;
                                    while (true) {
                                        int next2 = xmlPullParser5.next();
                                        if (next2 == 3 || next2 == 1) {
                                            if (arrayList3 != null && (size = arrayList3.size()) > 0) {
                                                Keyframe keyframe = (Keyframe) arrayList3.get(0);
                                                Keyframe keyframe2 = (Keyframe) arrayList3.get(size - 1);
                                                fraction = keyframe2.getFraction();
                                                if (fraction < 1.0f) {
                                                    if (fraction < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                                                        keyframe2.setFraction(1.0f);
                                                    } else {
                                                        int size2 = arrayList3.size();
                                                        if (keyframe2.getType() == Float.TYPE) {
                                                            ofObject2 = Keyframe.ofFloat(1.0f);
                                                        } else if (keyframe2.getType() == Integer.TYPE) {
                                                            ofObject2 = Keyframe.ofInt(1.0f);
                                                        } else {
                                                            ofObject2 = Keyframe.ofObject(1.0f);
                                                        }
                                                        arrayList3.add(size2, ofObject2);
                                                        size++;
                                                    }
                                                }
                                                fraction2 = keyframe.getFraction();
                                                if (fraction2 != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                                                    if (fraction2 < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                                                        keyframe.setFraction(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                                                    } else {
                                                        if (keyframe.getType() == Float.TYPE) {
                                                            ofObject = Keyframe.ofFloat(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                                                        } else if (keyframe.getType() == Integer.TYPE) {
                                                            ofObject = Keyframe.ofInt(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                                                        } else {
                                                            ofObject = Keyframe.ofObject(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                                                        }
                                                        arrayList3.add(0, ofObject);
                                                        size++;
                                                    }
                                                }
                                                Keyframe[] keyframeArr = new Keyframe[size];
                                                arrayList3.toArray(keyframeArr);
                                                for (i3 = 0; i3 < size; i3++) {
                                                    Keyframe keyframe3 = keyframeArr[i3];
                                                    if (keyframe3.getFraction() < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                                                        if (i3 == 0) {
                                                            keyframe3.setFraction(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                                                        } else {
                                                            int i5 = size - 1;
                                                            if (i3 == i5) {
                                                                keyframe3.setFraction(1.0f);
                                                            } else {
                                                                int i6 = i3 + 1;
                                                                int i7 = i3;
                                                                while (i6 < i5 && keyframeArr[i6].getFraction() < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                                                                    i7 = i6;
                                                                    i6++;
                                                                }
                                                                float fraction3 = (keyframeArr[i7 + 1].getFraction() - keyframeArr[i3 - 1].getFraction()) / ((float) ((i7 - i3) + 2));
                                                                for (int i8 = i3; i8 <= i7; i8++) {
                                                                    keyframeArr[i8].setFraction(keyframeArr[i8 - 1].getFraction() + fraction3);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                propertyValuesHolder = PropertyValuesHolder.ofKeyframe(A04, keyframeArr);
                                                if (i4 == 3) {
                                                    propertyValuesHolder.setEvaluator(C23104A7i.A00);
                                                }
                                            }
                                        } else if (xmlPullParser5.getName().equals("keyframe")) {
                                            if (i4 == 4) {
                                                TypedArray A023 = AnonymousClass21B.A02(resources2, theme2, Xml.asAttributeSet(xmlPullParser5), AnonymousClass21A.A05);
                                                i4 = 0;
                                                if (!AnonymousClass21B.A05(xmlPullParser2, "value")) {
                                                    peekValue2 = null;
                                                } else {
                                                    peekValue2 = A023.peekValue(0);
                                                }
                                                boolean z = false;
                                                if (peekValue2 != null) {
                                                    z = true;
                                                }
                                                if (z && A04(peekValue2.type)) {
                                                    i4 = 3;
                                                }
                                                A023.recycle();
                                            }
                                            int i9 = i4;
                                            XmlPullParser xmlPullParser6 = xmlPullParser2;
                                            TypedArray A024 = AnonymousClass21B.A02(resources2, theme2, Xml.asAttributeSet(xmlPullParser5), AnonymousClass21A.A05);
                                            float A00 = AnonymousClass21B.A00(A024, xmlPullParser6, "fraction", 3, -1.0f);
                                            if (!AnonymousClass21B.A05(xmlPullParser6, "value")) {
                                                peekValue = null;
                                            } else {
                                                peekValue = A024.peekValue(0);
                                            }
                                            boolean z2 = false;
                                            if (peekValue != null) {
                                                z2 = true;
                                            }
                                            if (i9 == 4) {
                                                if (z2) {
                                                    i9 = 3;
                                                }
                                                i9 = 0;
                                            }
                                            if (z2) {
                                                if (i9 == 0) {
                                                    ofInt = Keyframe.ofFloat(A00, AnonymousClass21B.A00(A024, xmlPullParser6, "value", 0, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
                                                } else if (i9 == 1 || i9 == 3) {
                                                    ofInt = Keyframe.ofInt(A00, AnonymousClass21B.A01(A024, xmlPullParser6, "value", 0, 0));
                                                } else {
                                                    ofInt = null;
                                                }
                                            } else if (i9 == 0) {
                                                ofInt = Keyframe.ofFloat(A00);
                                            } else {
                                                ofInt = Keyframe.ofInt(A00);
                                            }
                                            if (!AnonymousClass21B.A05(xmlPullParser6, "interpolator")) {
                                                resourceId = 0;
                                            } else {
                                                resourceId = A024.getResourceId(1, 0);
                                            }
                                            if (resourceId > 0) {
                                                ofInt.setInterpolator(A7Z.A00(context2, resourceId));
                                            }
                                            A024.recycle();
                                            if (ofInt != null) {
                                                if (arrayList3 == null) {
                                                    arrayList3 = new ArrayList();
                                                }
                                                arrayList3.add(ofInt);
                                            }
                                            xmlPullParser5.next();
                                        }
                                    }
                                    Keyframe keyframe4 = (Keyframe) arrayList3.get(0);
                                    Keyframe keyframe22 = (Keyframe) arrayList3.get(size - 1);
                                    fraction = keyframe22.getFraction();
                                    if (fraction < 1.0f) {
                                    }
                                    fraction2 = keyframe4.getFraction();
                                    if (fraction2 != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                                    }
                                    Keyframe[] keyframeArr2 = new Keyframe[size];
                                    arrayList3.toArray(keyframeArr2);
                                    while (i3 < size) {
                                    }
                                    propertyValuesHolder = PropertyValuesHolder.ofKeyframe(A04, keyframeArr2);
                                    if (i4 == 3) {
                                    }
                                    if (propertyValuesHolder == null) {
                                        propertyValuesHolder = A02(A022, A01, 0, 1, A04);
                                    }
                                    if (propertyValuesHolder != null) {
                                        if (arrayList2 == null) {
                                            arrayList2 = new ArrayList();
                                        }
                                        arrayList2.add(propertyValuesHolder);
                                    }
                                    A022.recycle();
                                }
                                xmlPullParser2.next();
                            } else if (arrayList2 != null) {
                                int size3 = arrayList2.size();
                                propertyValuesHolderArr = new PropertyValuesHolder[size3];
                                for (int i10 = 0; i10 < size3; i10++) {
                                    propertyValuesHolderArr[i10] = (PropertyValuesHolder) arrayList2.get(i10);
                                }
                            }
                        }
                        if (arrayList2 != null) {
                        }
                        if (propertyValuesHolderArr != null && (animator instanceof ValueAnimator)) {
                            ((ValueAnimator) animator).setValues(propertyValuesHolderArr);
                        }
                        i2 = 1;
                    } else {
                        throw new RuntimeException(AnonymousClass000.A0E("Unknown animator name: ", xmlPullParser2.getName()));
                    }
                    if (animatorSet != null && i2 == 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(animator);
                    }
                }
            }
        }
        if (!(animatorSet == null || arrayList == null)) {
            Animator[] animatorArr = new Animator[arrayList.size()];
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                animatorArr[i2] = (Animator) it.next();
                i2++;
            }
            if (i == 0) {
                animatorSet2.playTogether(animatorArr);
            } else {
                animatorSet2.playSequentially(animatorArr);
                return animator;
            }
        }
        return animator;
    }
}
