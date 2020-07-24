package com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;

public class DeviceConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(7);
    public static final Boolean DEFAULT_IS_CALIBRATED_DEVICE = false;
    public static final Boolean DEFAULT_IS_SLAM_CAPABLE = false;
    public static final Boolean DEFAULT_SKIP_ATTITUDE_INPUT = false;
    public static final Boolean DEFAULT_USE_VISION_ONLY_SLAM = false;
    public final double attitudeTimeDelay;
    public final double imuFromLandscapeCameraX;
    public final double imuFromLandscapeCameraY;
    public final double imuFromLandscapeCameraZ;
    public final boolean isCalibratedDeviceConfig;
    public final boolean isSlamCapable;
    public CameraConfig mCameraConfig;
    public final boolean skipAttitudeInput;
    public final String slamConfigurationParams;
    public final boolean useVisionOnlySlam;

    public int describeContents() {
        return 0;
    }

    public CameraConfig getCameraConfig() {
        return this.mCameraConfig;
    }

    public double getCameraDistortion1() {
        return this.mCameraConfig.A00;
    }

    public double getCameraDistortion2() {
        return this.mCameraConfig.A01;
    }

    public double getCameraFocalLength() {
        return this.mCameraConfig.A02;
    }

    public double getCameraPrincipalPointX() {
        return this.mCameraConfig.A03;
    }

    public double getCameraPrincipalPointY() {
        return this.mCameraConfig.A04;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.imuFromLandscapeCameraX);
        parcel.writeDouble(this.imuFromLandscapeCameraY);
        parcel.writeDouble(this.imuFromLandscapeCameraZ);
        parcel.writeByte(this.skipAttitudeInput ? (byte) 1 : 0);
        parcel.writeDouble(this.attitudeTimeDelay);
        parcel.writeByte(this.useVisionOnlySlam ? (byte) 1 : 0);
        parcel.writeByte(this.isSlamCapable ? (byte) 1 : 0);
        parcel.writeString(this.slamConfigurationParams);
        parcel.writeParcelable(this.mCameraConfig, i);
        parcel.writeByte(this.isCalibratedDeviceConfig ? (byte) 1 : 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public DeviceConfig(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, Boolean bool, Boolean bool2, String str, Boolean bool3) {
        this(r1, r3, r5, r7, r9, d6, r13, 0.0d, DEFAULT_SKIP_ATTITUDE_INPUT, d9, bool, bool2, "", bool3);
        double d10 = d5;
        double d11 = d4;
        double d12 = d3;
        double d13 = d7;
        double d14 = d2;
        double d15 = d;
    }

    public DeviceConfig(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, Boolean bool, double d9, Boolean bool2, Boolean bool3, String str, Boolean bool4) {
        double d10 = d;
        this.mCameraConfig = new CameraConfig(d10, d2, d3, d4, d5);
        this.imuFromLandscapeCameraX = d6;
        this.imuFromLandscapeCameraY = d7;
        this.imuFromLandscapeCameraZ = 0.0d;
        this.skipAttitudeInput = bool.booleanValue();
        this.attitudeTimeDelay = d9;
        this.useVisionOnlySlam = bool2.booleanValue();
        this.isSlamCapable = bool3.booleanValue();
        this.slamConfigurationParams = "";
        this.isCalibratedDeviceConfig = bool4.booleanValue();
    }

    public DeviceConfig(Parcel parcel) {
        this.imuFromLandscapeCameraX = parcel.readDouble();
        this.imuFromLandscapeCameraY = parcel.readDouble();
        this.imuFromLandscapeCameraZ = parcel.readDouble();
        boolean z = true;
        this.skipAttitudeInput = parcel.readByte() != 0;
        this.attitudeTimeDelay = parcel.readDouble();
        this.useVisionOnlySlam = parcel.readByte() != 0;
        this.isSlamCapable = parcel.readByte() != 0;
        this.slamConfigurationParams = parcel.readString();
        this.mCameraConfig = (CameraConfig) parcel.readParcelable(CameraConfig.class.getClassLoader());
        this.isCalibratedDeviceConfig = parcel.readByte() == 0 ? false : z;
    }
}
