package com.facebook.yoga;

import com.facebook.react.uimanager.BaseViewManager;
import java.util.ArrayList;
import java.util.List;
import p000X.A5P;
import p000X.A6E;
import p000X.A8M;
import p000X.A90;
import p000X.A9D;
import p000X.A9J;
import p000X.AD3;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass2DN;
import p000X.AnonymousClass2DO;
import p000X.AnonymousClass2DP;
import p000X.C211719Bd;
import p000X.C230049z6;
import p000X.C23126A8e;

public abstract class YogaNodeJNIBase extends A8M implements Cloneable {
    public float[] arr = null;
    public List mChildren;
    public Object mData;
    public boolean mHasNewLayout = true;
    public int mLayoutDirection = 0;
    public A5P mMeasureFunction;
    public long mNativePointer;
    public YogaNodeJNIBase mOwner;

    public void reset() {
        this.mMeasureFunction = null;
        this.mData = null;
        this.arr = null;
        this.mHasNewLayout = true;
        this.mLayoutDirection = 0;
        YogaNative.jni_YGNodeResetJNI(this.mNativePointer);
    }

    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i) {
        List list = this.mChildren;
        if (list != null) {
            list.remove(i);
            this.mChildren.add(i, yogaNodeJNIBase);
            yogaNodeJNIBase.mOwner = this;
            return yogaNodeJNIBase.mNativePointer;
        }
        throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
    }

    public static C211719Bd valueFromLong(long j) {
        Integer num;
        float intBitsToFloat = Float.intBitsToFloat((int) j);
        int i = (int) (j >> 32);
        if (i == 0) {
            num = Constants.ZERO;
        } else if (i == 1) {
            num = Constants.ONE;
        } else if (i == 2) {
            num = Constants.A0C;
        } else if (i == 3) {
            num = Constants.A0N;
        } else {
            throw new IllegalArgumentException(AnonymousClass000.A05("Unknown enum value: ", i));
        }
        return new C211719Bd(intBitsToFloat, num);
    }

    public void addChildAt(A8M a8m, int i) {
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) a8m;
        if (yogaNodeJNIBase.mOwner == null) {
            if (this.mChildren == null) {
                this.mChildren = new ArrayList(4);
            }
            this.mChildren.add(i, yogaNodeJNIBase);
            yogaNodeJNIBase.mOwner = this;
            YogaNative.jni_YGNodeInsertChildJNI(this.mNativePointer, yogaNodeJNIBase.mNativePointer, i);
            return;
        }
        throw new IllegalStateException("Child already has a parent, it must be removed first.");
    }

    public void calculateLayout(float f, float f2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i = 0; i < arrayList.size(); i++) {
            List list = ((YogaNodeJNIBase) arrayList.get(i)).mChildren;
            if (list != null) {
                arrayList.addAll(list);
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        int length = yogaNodeJNIBaseArr.length;
        long[] jArr = new long[length];
        for (int i2 = 0; i2 < length; i2++) {
            jArr[i2] = yogaNodeJNIBaseArr[i2].mNativePointer;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.mNativePointer, f, f2, jArr, yogaNodeJNIBaseArr);
    }

    public void dirty() {
        YogaNative.jni_YGNodeMarkDirtyJNI(this.mNativePointer);
    }

    public /* bridge */ /* synthetic */ A8M getChildAt(int i) {
        List list = this.mChildren;
        if (list != null) {
            return (YogaNodeJNIBase) list.get(i);
        }
        throw new IllegalStateException("YogaNode does not have children");
    }

    public int getChildCount() {
        List list = this.mChildren;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public A9D getDisplay() {
        int jni_YGNodeStyleGetDisplayJNI = YogaNative.jni_YGNodeStyleGetDisplayJNI(this.mNativePointer);
        if (jni_YGNodeStyleGetDisplayJNI == 0) {
            return A9D.FLEX;
        }
        if (jni_YGNodeStyleGetDisplayJNI == 1) {
            return A9D.NONE;
        }
        throw new IllegalArgumentException(AnonymousClass000.A05("Unknown enum value: ", jni_YGNodeStyleGetDisplayJNI));
    }

    public C211719Bd getHeight() {
        return valueFromLong(YogaNative.jni_YGNodeStyleGetHeightJNI(this.mNativePointer));
    }

    public AD3 getLayoutDirection() {
        int i;
        float[] fArr = this.arr;
        if (fArr != null) {
            i = (int) fArr[5];
        } else {
            i = this.mLayoutDirection;
        }
        if (i == 0) {
            return AD3.INHERIT;
        }
        if (i == 1) {
            return AD3.LTR;
        }
        if (i == 2) {
            return AD3.RTL;
        }
        throw new IllegalArgumentException(AnonymousClass000.A05("Unknown enum value: ", i));
    }

    public float getLayoutHeight() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        return r5[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        if (getLayoutDirection() == p000X.AD3.RTL) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        return r5[r2 + 2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
        if (getLayoutDirection() == p000X.AD3.RTL) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
        return r5[r2];
     */
    public float getLayoutPadding(C23126A8e a8e) {
        float[] fArr = this.arr;
        if (fArr == null) {
            return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        int i = 0;
        int i2 = (int) fArr[0];
        if ((i2 & 2) != 2) {
            return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        if ((i2 & 1) != 1) {
            i = 4;
        }
        int i3 = 10 - i;
        switch (a8e.ordinal()) {
            case 0:
                break;
            case 1:
                i3++;
                break;
            case 2:
                i3 += 2;
                break;
            case 3:
                i3 += 3;
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                throw new IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
        }
    }

    public float getLayoutWidth() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    public float getLayoutX() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    public float getLayoutY() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    public C211719Bd getWidth() {
        return valueFromLong(YogaNative.jni_YGNodeStyleGetWidthJNI(this.mNativePointer));
    }

    public boolean hasNewLayout() {
        float[] fArr = this.arr;
        if (fArr == null) {
            return this.mHasNewLayout;
        }
        if ((((int) fArr[0]) & 16) == 16) {
            return true;
        }
        return false;
    }

    public boolean isDirty() {
        return YogaNative.jni_YGNodeIsDirtyJNI(this.mNativePointer);
    }

    public boolean isMeasureDefined() {
        if (this.mMeasureFunction != null) {
            return true;
        }
        return false;
    }

    public void markLayoutSeen() {
        float[] fArr = this.arr;
        if (fArr != null) {
            fArr[0] = (float) (((int) fArr[0]) & -17);
        }
        this.mHasNewLayout = false;
    }

    public /* bridge */ /* synthetic */ A8M removeChildAt(int i) {
        List list = this.mChildren;
        if (list != null) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) list.remove(i);
            yogaNodeJNIBase.mOwner = null;
            YogaNative.jni_YGNodeRemoveChildJNI(this.mNativePointer, yogaNodeJNIBase.mNativePointer);
            return yogaNodeJNIBase;
        }
        throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
    }

    public void setAlignContent(AnonymousClass2DP r4) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.mNativePointer, r4.A00);
    }

    public void setAlignItems(AnonymousClass2DP r4) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.mNativePointer, r4.A00);
    }

    public void setAlignSelf(AnonymousClass2DP r4) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.mNativePointer, r4.A00);
    }

    public void setAspectRatio(float f) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.mNativePointer, f);
    }

    public void setBorder(C23126A8e a8e, float f) {
        YogaNative.jni_YGNodeStyleSetBorderJNI(this.mNativePointer, a8e.A00, f);
    }

    public void setDirection(AD3 ad3) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.mNativePointer, ad3.A00);
    }

    public void setDisplay(A9D a9d) {
        YogaNative.jni_YGNodeStyleSetDisplayJNI(this.mNativePointer, a9d.A00);
    }

    public void setFlex(float f) {
        YogaNative.jni_YGNodeStyleSetFlexJNI(this.mNativePointer, f);
    }

    public void setFlexBasis(float f) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.mNativePointer, f);
    }

    public void setFlexBasisAuto() {
        YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(this.mNativePointer);
    }

    public void setFlexBasisPercent(float f) {
        YogaNative.jni_YGNodeStyleSetFlexBasisPercentJNI(this.mNativePointer, f);
    }

    public void setFlexDirection(AnonymousClass2DN r4) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.mNativePointer, r4.A00);
    }

    public void setFlexGrow(float f) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.mNativePointer, f);
    }

    public void setFlexShrink(float f) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.mNativePointer, f);
    }

    public void setHeight(float f) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.mNativePointer, f);
    }

    public void setHeightAuto() {
        YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.mNativePointer);
    }

    public void setHeightPercent(float f) {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.mNativePointer, f);
    }

    public void setJustifyContent(AnonymousClass2DO r4) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.mNativePointer, r4.A00);
    }

    public void setMargin(C23126A8e a8e, float f) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.mNativePointer, a8e.A00, f);
    }

    public void setMarginAuto(C23126A8e a8e) {
        YogaNative.jni_YGNodeStyleSetMarginAutoJNI(this.mNativePointer, a8e.A00);
    }

    public void setMarginPercent(C23126A8e a8e, float f) {
        YogaNative.jni_YGNodeStyleSetMarginPercentJNI(this.mNativePointer, a8e.A00, f);
    }

    public void setMaxHeight(float f) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.mNativePointer, f);
    }

    public void setMaxHeightPercent(float f) {
        YogaNative.jni_YGNodeStyleSetMaxHeightPercentJNI(this.mNativePointer, f);
    }

    public void setMaxWidth(float f) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.mNativePointer, f);
    }

    public void setMaxWidthPercent(float f) {
        YogaNative.jni_YGNodeStyleSetMaxWidthPercentJNI(this.mNativePointer, f);
    }

    public void setMeasureFunction(A5P a5p) {
        this.mMeasureFunction = a5p;
        long j = this.mNativePointer;
        boolean z = false;
        if (a5p != null) {
            z = true;
        }
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(j, z);
    }

    public void setMinHeight(float f) {
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.mNativePointer, f);
    }

    public void setMinHeightPercent(float f) {
        YogaNative.jni_YGNodeStyleSetMinHeightPercentJNI(this.mNativePointer, f);
    }

    public void setMinWidth(float f) {
        YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.mNativePointer, f);
    }

    public void setMinWidthPercent(float f) {
        YogaNative.jni_YGNodeStyleSetMinWidthPercentJNI(this.mNativePointer, f);
    }

    public void setOverflow(A6E a6e) {
        YogaNative.jni_YGNodeStyleSetOverflowJNI(this.mNativePointer, a6e.A00);
    }

    public void setPadding(C23126A8e a8e, float f) {
        YogaNative.jni_YGNodeStyleSetPaddingJNI(this.mNativePointer, a8e.A00, f);
    }

    public void setPaddingPercent(C23126A8e a8e, float f) {
        YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(this.mNativePointer, a8e.A00, f);
    }

    public void setPosition(C23126A8e a8e, float f) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(this.mNativePointer, a8e.A00, f);
    }

    public void setPositionPercent(C23126A8e a8e, float f) {
        YogaNative.jni_YGNodeStyleSetPositionPercentJNI(this.mNativePointer, a8e.A00, f);
    }

    public void setPositionType(A9J a9j) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.mNativePointer, a9j.A00);
    }

    public void setWidth(float f) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.mNativePointer, f);
    }

    public void setWidthAuto() {
        YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.mNativePointer);
    }

    public void setWidthPercent(float f) {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.mNativePointer, f);
    }

    public void setWrap(A90 a90) {
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.mNativePointer, a90.A00);
    }

    public YogaNodeJNIBase(long j) {
        if (j != 0) {
            this.mNativePointer = j;
            return;
        }
        throw new IllegalStateException("Failed to allocate native memory");
    }

    public final long measure(float f, int i, float f2, int i2) {
        C230049z6 r4;
        C230049z6 r6;
        if (isMeasureDefined()) {
            A5P a5p = this.mMeasureFunction;
            if (i == 0) {
                r4 = C230049z6.UNDEFINED;
            } else if (i == 1) {
                r4 = C230049z6.EXACTLY;
            } else if (i == 2) {
                r4 = C230049z6.AT_MOST;
            } else {
                throw new IllegalArgumentException(AnonymousClass000.A05("Unknown enum value: ", i));
            }
            if (i2 == 0) {
                r6 = C230049z6.UNDEFINED;
            } else if (i2 == 1) {
                r6 = C230049z6.EXACTLY;
            } else if (i2 == 2) {
                r6 = C230049z6.AT_MOST;
            } else {
                throw new IllegalArgumentException(AnonymousClass000.A05("Unknown enum value: ", i2));
            }
            return a5p.Ap5(this, f, r4, f2, r6);
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    public final float baseline(float f, float f2) {
        throw null;
    }

    public void setData(Object obj) {
        this.mData = obj;
    }

    public YogaNodeJNIBase cloneWithChildren() {
        try {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) super.clone();
            long jni_YGNodeCloneJNI = YogaNative.jni_YGNodeCloneJNI(this.mNativePointer);
            yogaNodeJNIBase.mOwner = null;
            yogaNodeJNIBase.mNativePointer = jni_YGNodeCloneJNI;
            int i = 0;
            while (i < yogaNodeJNIBase.getChildCount()) {
                List list = yogaNodeJNIBase.mChildren;
                if (list != null) {
                    YogaNodeJNIBase cloneWithChildren = ((YogaNodeJNIBase) list.get(i)).cloneWithChildren();
                    yogaNodeJNIBase.mChildren.remove(i);
                    yogaNodeJNIBase.mChildren.add(i, cloneWithChildren);
                    cloneWithChildren.mOwner = yogaNodeJNIBase;
                    YogaNative.jni_YGNodeSwapChildJNI(yogaNodeJNIBase.mNativePointer, cloneWithChildren.mNativePointer, i);
                    i++;
                } else {
                    throw new IllegalStateException("YogaNode does not have children");
                }
            }
            return yogaNodeJNIBase;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
