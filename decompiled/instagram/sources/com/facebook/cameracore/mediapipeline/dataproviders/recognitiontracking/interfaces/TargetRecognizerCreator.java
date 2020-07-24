package com.facebook.cameracore.mediapipeline.dataproviders.recognitiontracking.interfaces;

import com.facebook.cameracore.mediapipeline.services.targetrecognition.interfaces.TargetRecognitionServiceDataSource;
import p000X.C30466Dcr;

public class TargetRecognizerCreator extends IRecognizerCreator {
    public String mDetectionExecNetPath;
    public String mDetectionPredictNetPath;
    public String mExecNetPath;
    public String mPredictNetPath;
    public boolean mShouldDownsampleFrames;
    public final TargetRecognitionServiceDataSource mTargetRecognitionServiceDataSource;
    public String mTensorName;

    public TargetRecognizerCreator(String str, String str2, String str3, String str4, String str5, TargetRecognitionServiceDataSource targetRecognitionServiceDataSource, boolean z) {
        this.mExecNetPath = str;
        this.mPredictNetPath = str2;
        this.mDetectionExecNetPath = str3;
        this.mDetectionPredictNetPath = str4;
        this.mTensorName = str5;
        this.mTargetRecognitionServiceDataSource = targetRecognitionServiceDataSource;
        this.mShouldDownsampleFrames = z;
    }

    public TargetRecognitionServiceDataSource getDataSource() {
        return this.mTargetRecognitionServiceDataSource;
    }

    public String getDetectionExecNetPath() {
        return this.mDetectionExecNetPath;
    }

    public String getDetectionPredictNetPath() {
        return this.mDetectionPredictNetPath;
    }

    public String getExecNetPath() {
        return this.mExecNetPath;
    }

    public String getPredictNetPath() {
        return this.mPredictNetPath;
    }

    public C30466Dcr getRecognizerCreatorType() {
        return C30466Dcr.A01;
    }

    public boolean getShouldDownsampleFrames() {
        return this.mShouldDownsampleFrames;
    }

    public String getTensorName() {
        return this.mTensorName;
    }

    public void setDetectionExecNetPath(String str) {
        this.mDetectionExecNetPath = str;
    }

    public void setDetectionPredictNetPath(String str) {
        this.mDetectionPredictNetPath = str;
    }

    public void setExecNetPath(String str) {
        this.mExecNetPath = str;
    }

    public void setPredictNetPath(String str) {
        this.mPredictNetPath = str;
    }

    public void setShouldDownsampleFrames(boolean z) {
        this.mShouldDownsampleFrames = z;
    }

    public void setTensorName(String str) {
        this.mTensorName = str;
    }
}
