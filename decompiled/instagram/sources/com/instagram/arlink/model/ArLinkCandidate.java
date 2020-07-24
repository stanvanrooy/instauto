package com.instagram.arlink.model;

import android.graphics.RectF;
import android.text.TextUtils;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.List;

public class ArLinkCandidate {
    public final float mConfidenceScore;
    public final String mDetectedText;
    public final boolean mHasLineCode;
    public final RectF mIconRect;
    public final int mLineCode;
    public final float mOCRScore;
    public final List mTextBoxes;

    public float getRotationDegree() {
        if (!this.mTextBoxes.isEmpty()) {
            return ((ArLinkTextBox) this.mTextBoxes.get(0)).mRotationDegree;
        }
        return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    public RectF getTextRect() {
        if (this.mTextBoxes.isEmpty()) {
            return null;
        }
        RectF rectF = new RectF(((ArLinkTextBox) this.mTextBoxes.get(0)).mTextRect);
        for (int i = 1; i < this.mTextBoxes.size(); i++) {
            RectF rectF2 = ((ArLinkTextBox) this.mTextBoxes.get(i)).mTextRect;
            rectF.left = Math.min(rectF2.left, rectF.left);
            rectF.top = Math.min(rectF2.top, rectF.top);
            rectF.right = Math.max(rectF2.right, rectF.right);
            rectF.bottom = Math.max(rectF2.bottom, rectF.bottom);
        }
        return rectF;
    }

    public ArLinkCandidate(float f, RectF rectF, List list, int i, List list2, float f2, boolean z) {
        this.mConfidenceScore = f;
        this.mIconRect = rectF;
        this.mTextBoxes = list;
        this.mLineCode = i;
        this.mOCRScore = f2;
        this.mDetectedText = TextUtils.join("", list2);
        this.mHasLineCode = z;
    }

    public float getConfidenceScore() {
        return this.mConfidenceScore;
    }

    public String getDetectedText() {
        return this.mDetectedText;
    }

    public RectF getIconRect() {
        return this.mIconRect;
    }

    public int getLineCode() {
        return this.mLineCode;
    }

    public float getOCRScore() {
        return this.mOCRScore;
    }

    public List getTextBoxes() {
        return this.mTextBoxes;
    }

    public boolean hasLineCode() {
        return this.mHasLineCode;
    }
}
