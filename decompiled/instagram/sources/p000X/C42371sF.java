package p000X;

import android.hardware.Camera;
import android.media.MediaMetadataRetriever;
import com.instagram.model.mediatype.MediaType;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.model.PendingMedia;
import java.io.File;
import java.util.ArrayList;

/* 'enum' modifier removed */
/* renamed from: X.1sF  reason: invalid class name and case insensitive filesystem */
public final class C42371sF extends C42361sE {
    public C42371sF() {
        super("BASE", 1);
    }

    public final void A00(PendingMedia pendingMedia) {
        String str;
        C42421sK r0;
        C42421sK r02;
        if (pendingMedia.A0g == null) {
            pendingMedia.A0g = MediaType.PHOTO;
        }
        if (pendingMedia.A1l != null) {
            pendingMedia.A0v = C42421sK.NOT_UPLOADED;
            pendingMedia.A1l = null;
        }
        if (pendingMedia.A3F == null) {
            Boolean bool = pendingMedia.A1B;
            if (bool == null) {
                pendingMedia.A3F = C42421sK.CONFIGURED;
            } else {
                if (bool.booleanValue()) {
                    r02 = C42421sK.CONFIGURED;
                } else {
                    r02 = C42421sK.UPLOADED;
                }
                pendingMedia.A3F = r02;
            }
        }
        if (pendingMedia.A0v == null) {
            Boolean bool2 = pendingMedia.A1A;
            if (bool2 == null || !bool2.booleanValue()) {
                Boolean bool3 = pendingMedia.A19;
                if (bool3 != null && bool3.booleanValue()) {
                    r0 = C42421sK.UPLOADED;
                }
            } else {
                r0 = C42421sK.NOT_UPLOADED;
            }
            pendingMedia.A0v = r0;
        }
        if (pendingMedia.A0g == MediaType.VIDEO && pendingMedia.A2L.isEmpty() && (str = pendingMedia.A1z) != null) {
            ArrayList arrayList = new ArrayList();
            pendingMedia.A2L = arrayList;
            ClipInfo clipInfo = new ClipInfo();
            int i = 0;
            clipInfo.A0D = 0;
            clipInfo.A08 = 0;
            if (new File(str).exists()) {
                clipInfo.A04(pendingMedia.A1z);
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(clipInfo.A0F);
                clipInfo.A03(Integer.parseInt(mediaMetadataRetriever.extractMetadata(18)), Integer.parseInt(mediaMetadataRetriever.extractMetadata(19)));
                String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
                if (extractMetadata != null) {
                    i = Integer.parseInt(extractMetadata);
                }
                clipInfo.A06 = i;
                mediaMetadataRetriever.release();
            }
            Integer num = pendingMedia.A1D;
            if (num != null) {
                clipInfo.A05 = num.intValue();
            } else {
                Integer num2 = pendingMedia.A1G;
                if (num2 != null) {
                    int intValue = num2.intValue();
                    int numberOfCameras = Camera.getNumberOfCameras();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= numberOfCameras) {
                            i2 = 0;
                            break;
                        }
                        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                        Camera.getCameraInfo(i2, cameraInfo);
                        int i3 = cameraInfo.facing;
                        if ((intValue >= 4 && i3 == 1) || (intValue < 4 && i3 == 0)) {
                            break;
                        }
                        i2++;
                    }
                    clipInfo.A05 = i2;
                }
            }
            arrayList.add(clipInfo);
        }
        if (pendingMedia.A15 == null && pendingMedia.A18 != null) {
            PendingMedia.A05(pendingMedia);
        }
    }
}
