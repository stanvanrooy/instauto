package com.facebook.react.views.text;

import android.graphics.Color;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p000X.A0G;
import p000X.A0i;
import p000X.A0k;
import p000X.A1e;
import p000X.A8I;
import p000X.A8M;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass0FY;
import p000X.AnonymousClass7G0;
import p000X.AnonymousClass7G1;
import p000X.C169427Mb;
import p000X.C173007aJ;
import p000X.C173197ad;
import p000X.C173207ae;
import p000X.C173787bd;
import p000X.C177227hX;
import p000X.C211719Bd;
import p000X.C230089zD;
import p000X.C230099zE;
import p000X.C230109zF;
import p000X.C230119zG;
import p000X.C230329zq;
import p000X.C230369zy;
import p000X.C23043A0y;

public abstract class ReactBaseTextShadowNode extends LayoutShadowNode {
    public int A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public A0G A0D;
    public C230089zD A0E;
    public String A0F;
    public String A0G;
    public Map A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r21 != null) goto L_0x000b;
     */
    public final Spannable A0D(ReactBaseTextShadowNode reactBaseTextShadowNode, String str, boolean z, A8I a8i) {
        boolean z2;
        HashMap hashMap;
        int i;
        int i2 = 0;
        A8I a8i2 = a8i;
        boolean z3 = z;
        if (z) {
            z2 = false;
        }
        z2 = true;
        AnonymousClass0FY.A03(z2, "nativeViewHierarchyOptimizer is required when inline views are supported");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList<C230329zq> arrayList = new ArrayList<>();
        if (z) {
            hashMap = new HashMap();
        } else {
            hashMap = null;
        }
        String str2 = str;
        ReactBaseTextShadowNode reactBaseTextShadowNode2 = reactBaseTextShadowNode;
        if (str != null) {
            spannableStringBuilder.append(C177227hX.A00(str2, reactBaseTextShadowNode2.A0E.A05));
        }
        A01(reactBaseTextShadowNode2, spannableStringBuilder, arrayList, (C230089zD) null, z3, hashMap, 0);
        reactBaseTextShadowNode2.A0J = false;
        reactBaseTextShadowNode2.A0H = hashMap;
        float f = Float.NaN;
        for (C230329zq r7 : arrayList) {
            AnonymousClass7G1 r8 = r7.A02;
            boolean z4 = r8 instanceof C230119zG;
            if (z4 || (r8 instanceof C169427Mb)) {
                if (z4) {
                    i = ((C230119zG) r8).A00();
                    reactBaseTextShadowNode2.A0J = true;
                } else {
                    C169427Mb r82 = (C169427Mb) r8;
                    i = r82.A00;
                    ReactShadowNode reactShadowNode = (ReactShadowNode) hashMap.get(Integer.valueOf(r82.A01));
                    if (reactShadowNode.Ag9()) {
                        A8I.A02(a8i2, reactShadowNode, (C230099zE) null);
                    }
                    reactShadowNode.BiR(reactBaseTextShadowNode2);
                }
                if (Float.isNaN(f) || ((float) i) > f) {
                    f = (float) i;
                }
            }
            int i3 = r7.A01;
            int i4 = 34;
            if (i3 == 0) {
                i4 = 18;
            }
            spannableStringBuilder.setSpan(r7.A02, i3, r7.A00, ((i2 << 16) & 16711680) | (i4 & -16711681));
            i2++;
        }
        reactBaseTextShadowNode2.A0E.A01 = f;
        return spannableStringBuilder;
    }

    @ReactProp(customType = "Color", name = "color")
    public void setColor(Integer num) {
        boolean z = false;
        if (num != null) {
            z = true;
        }
        this.A0M = z;
        if (z) {
            this.A06 = num.intValue();
        }
        A06();
    }

    @ReactProp(name = "textDecorationLine")
    public void setTextDecorationLine(String str) {
        this.A0O = false;
        this.A0N = false;
        if (str != null) {
            for (String str2 : str.split(" ")) {
                if ("underline".equals(str2)) {
                    this.A0O = true;
                } else if ("line-through".equals(str2)) {
                    this.A0N = true;
                }
            }
        }
        A06();
    }

    @ReactProp(name = "textShadowOffset")
    public void setTextShadowOffset(C23043A0y a0y) {
        this.A02 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        this.A03 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        if (a0y != null) {
            if (a0y.hasKey(IgReactMediaPickerNativeModule.WIDTH) && !a0y.isNull(IgReactMediaPickerNativeModule.WIDTH)) {
                this.A02 = C230109zF.A00((float) a0y.getDouble(IgReactMediaPickerNativeModule.WIDTH));
            }
            if (a0y.hasKey(IgReactMediaPickerNativeModule.HEIGHT) && !a0y.isNull(IgReactMediaPickerNativeModule.HEIGHT)) {
                this.A03 = C230109zF.A00((float) a0y.getDouble(IgReactMediaPickerNativeModule.HEIGHT));
            }
        }
        A06();
    }

    public static void A01(ReactBaseTextShadowNode reactBaseTextShadowNode, SpannableStringBuilder spannableStringBuilder, List list, C230089zD r21, boolean z, Map map, int i) {
        C230089zD r15;
        float layoutWidth;
        float layoutHeight;
        ReactBaseTextShadowNode reactBaseTextShadowNode2 = reactBaseTextShadowNode;
        C230089zD r1 = r21;
        if (r21 != null) {
            C230089zD r4 = reactBaseTextShadowNode2.A0E;
            r15 = new C230089zD();
            r15.A06 = r1.A06;
            float f = r4.A00;
            if (Float.isNaN(f)) {
                f = r1.A00;
            }
            r15.A00 = f;
            float f2 = r4.A03;
            if (Float.isNaN(f2)) {
                f2 = r1.A03;
            }
            r15.A03 = f2;
            float f3 = r4.A02;
            if (Float.isNaN(f3)) {
                f3 = r1.A02;
            }
            r15.A02 = f3;
            float f4 = r4.A04;
            if (Float.isNaN(f4)) {
                f4 = r1.A04;
            }
            r15.A04 = f4;
            float f5 = r4.A01;
            if (Float.isNaN(f5)) {
                f5 = r1.A01;
            }
            r15.A01 = f5;
            Integer num = r4.A05;
            if (num == Constants.A0Y) {
                num = r1.A05;
            }
            r15.A05 = num;
        } else {
            r15 = reactBaseTextShadowNode2.A0E;
        }
        int AI5 = reactBaseTextShadowNode2.AI5();
        int i2 = 0;
        while (true) {
            SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
            List list2 = list;
            if (i2 < AI5) {
                ReactShadowNodeImpl A052 = reactBaseTextShadowNode2.AI2(i2);
                if (A052 instanceof ReactRawTextShadowNode) {
                    spannableStringBuilder2.append(C177227hX.A00(((ReactRawTextShadowNode) A052).A00, r15.A05));
                } else {
                    Map map2 = map;
                    boolean z2 = z;
                    if (A052 instanceof ReactBaseTextShadowNode) {
                        A01((ReactBaseTextShadowNode) A052, spannableStringBuilder2, list2, r15, z2, map2, spannableStringBuilder2.length());
                    } else if (A052 instanceof ReactTextInlineImageShadowNode) {
                        spannableStringBuilder2.append("0");
                        list2.add(new C230329zq(spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), ((ReactTextInlineImageShadowNode) A052).A0D()));
                    } else if (z) {
                        int ATb = A052.ATb();
                        C211719Bd width = A052.A05.getWidth();
                        C211719Bd height = A052.A05.getHeight();
                        Integer num2 = width.A01;
                        Integer num3 = Constants.ONE;
                        if (num2 == num3 && height.A01 == num3) {
                            layoutWidth = width.A00;
                            layoutHeight = height.A00;
                        } else {
                            A052.A7J();
                            A8M a8m = A052.A05;
                            layoutWidth = a8m.getLayoutWidth();
                            layoutHeight = a8m.getLayoutHeight();
                        }
                        spannableStringBuilder2.append("0");
                        list2.add(new C230329zq(spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), new C169427Mb(ATb, (int) layoutWidth, (int) layoutHeight)));
                        map2.put(Integer.valueOf(ATb), A052);
                    } else {
                        throw new A0i("Unexpected view type nested under a <Text> or <TextInput> node: " + A052.getClass());
                    }
                }
                A052.Aoh();
                i2++;
            } else {
                int length = spannableStringBuilder2.length();
                int i3 = i;
                if (length >= i3) {
                    if (reactBaseTextShadowNode2.A0M) {
                        list2.add(new C230329zq(i3, length, new ReactForegroundColorSpan(reactBaseTextShadowNode2.A06)));
                    }
                    if (reactBaseTextShadowNode2.A0L) {
                        list2.add(new C230329zq(i3, length, new ReactBackgroundColorSpan(reactBaseTextShadowNode2.A05)));
                    }
                    if (Build.VERSION.SDK_INT >= 21) {
                        float A002 = r15.A00();
                        if (!Float.isNaN(A002) && (r21 == null || r1.A00() != A002)) {
                            list2.add(new C230329zq(i3, length, new C173007aJ(A002)));
                        }
                    }
                    int A022 = r15.A02();
                    if (r21 == null || r1.A02() != A022) {
                        list2.add(new C230329zq(i3, length, new ReactAbsoluteSizeSpan(A022)));
                    }
                    int i4 = reactBaseTextShadowNode2.A07;
                    if (!(i4 == -1 && reactBaseTextShadowNode2.A08 == -1 && reactBaseTextShadowNode2.A0F == null)) {
                        list2.add(new C230329zq(i3, length, new C173207ae(i4, reactBaseTextShadowNode2.A08, reactBaseTextShadowNode2.A0G, reactBaseTextShadowNode2.A0F, reactBaseTextShadowNode2.AY1().getAssets())));
                    }
                    if (reactBaseTextShadowNode2.A0O) {
                        list2.add(new C230329zq(i3, length, new ReactUnderlineSpan()));
                    }
                    if (reactBaseTextShadowNode2.A0N) {
                        list2.add(new C230329zq(i3, length, new ReactStrikethroughSpan()));
                    }
                    if (!((reactBaseTextShadowNode2.A02 == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && reactBaseTextShadowNode2.A03 == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && reactBaseTextShadowNode2.A04 == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) || Color.alpha(reactBaseTextShadowNode2.A0C) == 0)) {
                        list2.add(new C230329zq(i3, length, new C173197ad(reactBaseTextShadowNode2.A02, reactBaseTextShadowNode2.A03, reactBaseTextShadowNode2.A04, reactBaseTextShadowNode2.A0C)));
                    }
                    float A012 = r15.A01();
                    if (!Float.isNaN(A012) && (r21 == null || r1.A01() != A012)) {
                        list2.add(new C230329zq(i3, length, new AnonymousClass7G0(A012)));
                    }
                    list2.add(new C230329zq(i3, length, new C230369zy(reactBaseTextShadowNode2.ATb())));
                    return;
                }
                return;
            }
        }
    }

    @ReactProp(name = "adjustsFontSizeToFit")
    public void setAdjustFontSizeToFit(boolean z) {
        if (z != this.A0I) {
            this.A0I = z;
            A06();
        }
    }

    @ReactProp(defaultBoolean = true, name = "allowFontScaling")
    public void setAllowFontScaling(boolean z) {
        C230089zD r1 = this.A0E;
        if (z != r1.A06) {
            r1.A06 = z;
            A06();
        }
    }

    @ReactProp(name = "fontFamily")
    public void setFontFamily(String str) {
        this.A0F = str;
        A06();
    }

    @ReactProp(defaultFloat = Float.NaN, name = "fontSize")
    public void setFontSize(float f) {
        this.A0E.A00 = f;
        A06();
    }

    @ReactProp(name = "fontStyle")
    public void setFontStyle(String str) {
        int i;
        if ("italic".equals(str)) {
            i = 2;
        } else {
            i = -1;
            if ("normal".equals(str)) {
                i = 0;
            }
        }
        if (i != this.A07) {
            this.A07 = i;
            A06();
        }
    }

    @ReactProp(defaultFloat = Float.NaN, name = "letterSpacing")
    public void setLetterSpacing(float f) {
        this.A0E.A02 = f;
        A06();
    }

    @ReactProp(defaultFloat = Float.NaN, name = "lineHeight")
    public void setLineHeight(float f) {
        this.A0E.A03 = f;
        A06();
    }

    @ReactProp(defaultFloat = Float.NaN, name = "maxFontSizeMultiplier")
    public void setMaxFontSizeMultiplier(float f) {
        C230089zD r1 = this.A0E;
        if (f == r1.A04) {
            return;
        }
        if (f == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || f >= 1.0f) {
            r1.A04 = f;
            A06();
            return;
        }
        throw new A0k("maxFontSizeMultiplier must be NaN, 0, or >= 1");
    }

    @ReactProp(name = "minimumFontScale")
    public void setMinimumFontScale(float f) {
        if (f != this.A01) {
            this.A01 = f;
            A06();
        }
    }

    @ReactProp(defaultInt = -1, name = "numberOfLines")
    public void setNumberOfLines(int i) {
        if (i == 0) {
            i = -1;
        }
        this.A0A = i;
        A06();
    }

    @ReactProp(name = "textAlign")
    public void setTextAlign(String str) {
        if (!"justify".equals(str)) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.A09 = 0;
            }
            if (str == null || "auto".equals(str)) {
                this.A00 = 0;
                A06();
            } else if (!"left".equals(str)) {
                if ("right".equals(str)) {
                    this.A00 = 5;
                } else if ("center".equals(str)) {
                    this.A00 = 1;
                } else {
                    throw new A0k(AnonymousClass000.A0E("Invalid textAlign: ", str));
                }
                A06();
            }
        } else if (Build.VERSION.SDK_INT >= 26) {
            this.A09 = 1;
        }
        this.A00 = 3;
        A06();
    }

    @ReactProp(name = "textBreakStrategy")
    public void setTextBreakStrategy(String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            if (str == null || "highQuality".equals(str)) {
                this.A0B = 1;
            } else if ("simple".equals(str)) {
                this.A0B = 0;
            } else if ("balanced".equals(str)) {
                this.A0B = 2;
            } else {
                throw new A0k(AnonymousClass000.A0E("Invalid textBreakStrategy: ", str));
            }
            A06();
        }
    }

    @ReactProp(customType = "Color", defaultInt = 1426063360, name = "textShadowColor")
    public void setTextShadowColor(int i) {
        if (i != this.A0C) {
            this.A0C = i;
            A06();
        }
    }

    @ReactProp(defaultInt = 1, name = "textShadowRadius")
    public void setTextShadowRadius(float f) {
        if (f != this.A04) {
            this.A04 = f;
            A06();
        }
    }

    @ReactProp(name = "textTransform")
    public void setTextTransform(String str) {
        C230089zD r1;
        Integer num;
        if (str == null) {
            r1 = this.A0E;
            num = Constants.A0Y;
        } else if (NetInfoModule.CONNECTION_TYPE_NONE.equals(str)) {
            r1 = this.A0E;
            num = Constants.ZERO;
        } else if ("uppercase".equals(str)) {
            r1 = this.A0E;
            num = Constants.ONE;
        } else if ("lowercase".equals(str)) {
            r1 = this.A0E;
            num = Constants.A0C;
        } else if ("capitalize".equals(str)) {
            r1 = this.A0E;
            num = Constants.A0N;
        } else {
            throw new A0k(AnonymousClass000.A0E("Invalid textTransform: ", str));
        }
        r1.A05 = num;
        A06();
    }

    @ReactProp(customType = "Color", name = "backgroundColor")
    public void setBackgroundColor(Integer num) {
        if (AiS()) {
            boolean z = false;
            if (num != null) {
                z = true;
            }
            this.A0L = z;
            if (z) {
                this.A05 = num.intValue();
            }
            A06();
        }
    }

    @ReactProp(name = "fontVariant")
    public void setFontVariant(A1e a1e) {
        String A022 = C173787bd.A02(a1e);
        if (!Objects.equals(A022, this.A0G)) {
            this.A0G = A022;
            A06();
        }
    }

    @ReactProp(name = "fontWeight")
    public void setFontWeight(String str) {
        int A002 = C173787bd.A00(str);
        if (A002 != this.A08) {
            this.A08 = A002;
            A06();
        }
    }

    @ReactProp(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(boolean z) {
        this.A0K = z;
    }

    public ReactBaseTextShadowNode() {
        this((A0G) null);
    }

    public ReactBaseTextShadowNode(A0G a0g) {
        this.A0M = false;
        this.A0L = false;
        this.A0A = -1;
        this.A00 = 0;
        this.A0B = Build.VERSION.SDK_INT < 23 ? 0 : 1;
        this.A09 = 0;
        this.A02 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        this.A03 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        this.A04 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        this.A0C = 1426063360;
        this.A0O = false;
        this.A0N = false;
        this.A0K = true;
        this.A0I = false;
        this.A01 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        this.A07 = -1;
        this.A08 = -1;
        this.A0F = null;
        this.A0G = null;
        this.A0J = false;
        this.A0E = new C230089zD();
        this.A0D = a0g;
    }
}
