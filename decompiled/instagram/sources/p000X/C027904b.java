package p000X;

import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.modules.camera.CameraRollManager;

/* renamed from: X.04b  reason: invalid class name and case insensitive filesystem */
public final class C027904b {
    public static Integer[] A00 = {Constants.A07, Constants.A09, Constants.A0B, Constants.A0u, Constants.A05, Constants.A03, Constants.A0C, Constants.A0N, Constants.A0W, Constants.A0V, Constants.A0Q, Constants.A0R, Constants.A0Y, Constants.ONE, Constants.A08, Constants.A0A, Constants.A0D, Constants.A0O, Constants.A0P, Constants.A15, Constants.A0I, Constants.A0F, Constants.A0M, Constants.A02, Constants.A12, Constants.A0J, Constants.A14, Constants.A0K, Constants.A0L, Constants.A06, Constants.A0H, Constants.A0G, Constants.ZERO, Constants.A0E, Constants.A0U, Constants.A0S, Constants.A0T, Constants.A0j, Constants.A04};
    public static final long[] A01 = new long[Constants.ZERO(39).length];
    public static final String[] A02 = new String[Constants.ZERO(39).length];

    static {
        String str;
        Integer[] A002 = Constants.ZERO(39);
        int length = A002.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Integer num = A002[i];
            String[] strArr = A02;
            int i3 = i2 + 1;
            switch (num.intValue()) {
                case 1:
                    str = "MemFree:";
                    break;
                case 2:
                    str = "Buffers:";
                    break;
                case 3:
                    str = "Cached:";
                    break;
                case 4:
                    str = "Dirty:";
                    break;
                case 5:
                    str = "Writeback:";
                    break;
                case 6:
                    str = "AnonPages:";
                    break;
                case 7:
                case OdexSchemeArtXdex.OREO_SDK_INT /*26*/:
                    str = "Shmem:";
                    break;
                case 8:
                    str = "Slab:";
                    break;
                case 9:
                    str = "KernelStack:";
                    break;
                case 10:
                    str = "PageTables:";
                    break;
                case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                    str = "Bounce:";
                    break;
                case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                    str = "WritebackTmp:";
                    break;
                case C120125Dh.VIEW_TYPE_BADGE /*13*/:
                    str = "MemAvailable:";
                    break;
                case C120125Dh.VIEW_TYPE_LINK /*14*/:
                    str = "SwapCached:";
                    break;
                case 15:
                    str = "Active:";
                    break;
                case 16:
                    str = "Inactive:";
                    break;
                case C120125Dh.VIEW_TYPE_CUSTOM_ITEM /*17*/:
                    str = "Active(anon):";
                    break;
                case 18:
                    str = "Inactive(anon):";
                    break;
                case 19:
                    str = "Active(file):";
                    break;
                case 20:
                    str = "Inactive(file):";
                    break;
                case C120125Dh.VIEW_TYPE_BRANDING /*21*/:
                    str = "Unevictable:";
                    break;
                case C120125Dh.NUM_VIEW_TYPES /*22*/:
                    str = "Mlocked:";
                    break;
                case 23:
                    str = "SwapTotal:";
                    break;
                case 24:
                    str = "SwapFree:";
                    break;
                case 25:
                    str = "Mapped:";
                    break;
                case 27:
                    str = "SReclaimable:";
                    break;
                case 28:
                    str = "SUnreclaim:";
                    break;
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                    str = "NFS_Unstable:";
                    break;
                case 30:
                    str = "ION_heap:";
                    break;
                case 31:
                    str = "ION_page_pool:";
                    break;
                case 32:
                    str = "CommitLimit:";
                    break;
                case 33:
                    str = "Committed_AS:";
                    break;
                case 34:
                    str = "VmallocTotal:";
                    break;
                case 35:
                    str = "VmallocUsed:";
                    break;
                case 36:
                    str = "VmallocChunk:";
                    break;
                case 37:
                    str = "CmaTotal:";
                    break;
                case 38:
                    str = "CmaFree:";
                    break;
                default:
                    str = "MemTotal:";
                    break;
            }
            strArr[i2] = str;
            i++;
            i2 = i3;
        }
    }

    public static long A00() {
        long[] jArr = A01;
        return jArr[Constants.A0C.intValue()] + jArr[Constants.A0Y.intValue()] + jArr[Constants.A0j.intValue()] + jArr[Constants.A04.intValue()];
    }

    public static long A01() {
        long[] jArr = A01;
        return jArr[Constants.A14.intValue()] + jArr[Constants.A15.intValue()] + jArr[Constants.A02.intValue()] + jArr[Constants.A03.intValue()];
    }
}
