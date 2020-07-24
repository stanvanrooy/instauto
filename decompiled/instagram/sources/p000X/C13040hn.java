package p000X;

import org.webrtc.CameraVideoCapturer;

/* renamed from: X.0hn  reason: invalid class name and case insensitive filesystem */
public final class C13040hn {
    public final byte[][] A00 = new byte[Constants.ZERO(4).length][];
    public final char[][] A01 = new char[Constants.ZERO(4).length][];

    public final byte[] A00(Integer num) {
        int i;
        int intValue = num.intValue();
        byte[][] bArr = this.A00;
        byte[] bArr2 = bArr[intValue];
        if (bArr2 == null) {
            switch (intValue) {
                case 2:
                case 3:
                    i = CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
                    break;
                default:
                    i = CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS;
                    break;
            }
            return new byte[i];
        }
        bArr[intValue] = null;
        return bArr2;
    }

    public final char[] A01(Integer num, int i) {
        if (AnonymousClass40H.A00(num) > i) {
            i = AnonymousClass40H.A00(num);
        }
        int intValue = num.intValue();
        char[][] cArr = this.A01;
        char[] cArr2 = cArr[intValue];
        if (cArr2 == null || cArr2.length < i) {
            return new char[i];
        }
        cArr[intValue] = null;
        return cArr2;
    }
}
