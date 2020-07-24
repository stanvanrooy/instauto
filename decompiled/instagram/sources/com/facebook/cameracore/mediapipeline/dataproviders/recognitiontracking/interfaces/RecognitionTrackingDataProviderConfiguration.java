package com.facebook.cameracore.mediapipeline.dataproviders.recognitiontracking.interfaces;

import com.google.common.collect.ImmutableList;
import java.util.List;
import p000X.C30466Dcr;

public class RecognitionTrackingDataProviderConfiguration {
    public List mRecognizerCreators;
    public int mThreadPriority;
    public List mTrackerCreators;

    public ImmutableList getRecognizerCreators() {
        return ImmutableList.A09(this.mRecognizerCreators);
    }

    public ImmutableList getTrackerCreators() {
        return ImmutableList.A09(this.mTrackerCreators);
    }

    public void updateTargetRecognizerNetPath(String str, String str2, String str3, String str4) {
        for (IRecognizerCreator iRecognizerCreator : this.mRecognizerCreators) {
            if (iRecognizerCreator.getRecognizerCreatorType() == C30466Dcr.A01) {
                TargetRecognizerCreator targetRecognizerCreator = (TargetRecognizerCreator) iRecognizerCreator;
                targetRecognizerCreator.mExecNetPath = str;
                targetRecognizerCreator.mPredictNetPath = str2;
                targetRecognizerCreator.mDetectionExecNetPath = str3;
                targetRecognizerCreator.mDetectionPredictNetPath = str4;
            }
        }
    }

    public RecognitionTrackingDataProviderConfiguration(List list, List list2, int i) {
        this.mRecognizerCreators = list;
        this.mTrackerCreators = list2;
        this.mThreadPriority = i;
    }

    public int getThreadPriority() {
        return this.mThreadPriority;
    }
}
