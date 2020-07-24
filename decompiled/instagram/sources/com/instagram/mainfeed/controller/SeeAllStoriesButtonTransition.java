package com.instagram.mainfeed.controller;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;

public class SeeAllStoriesButtonTransition extends Transition {
    public static final String PROPNAME_Y_VALUE = "TranslationTransition_PROPNAME_Y_VALUE";

    private void captureValues(TransitionValues transitionValues) {
        transitionValues.values.put(PROPNAME_Y_VALUE, Float.valueOf(transitionValues.view.getY()));
    }

    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(transitionValues.view, "alpha", new float[]{BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER}), ObjectAnimator.ofFloat(transitionValues2.view, "y", new float[]{((Float) transitionValues.values.get(PROPNAME_Y_VALUE)).floatValue(), ((Float) transitionValues2.values.get(PROPNAME_Y_VALUE)).floatValue()}), ObjectAnimator.ofFloat(transitionValues2.view, "alpha", new float[]{BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f})});
        animatorSet.setDuration((long) viewGroup.getContext().getResources().getInteger(C0003R.integer.config_fadeTransitionDur));
        animatorSet.setInterpolator(new DecelerateInterpolator(1.5f));
        return animatorSet;
    }

    public void captureEndValues(TransitionValues transitionValues) {
        captureValues(transitionValues);
    }

    public void captureStartValues(TransitionValues transitionValues) {
        captureValues(transitionValues);
    }

    public SeeAllStoriesButtonTransition() {
    }

    public SeeAllStoriesButtonTransition(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
