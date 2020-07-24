package p000X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.Set;

/* renamed from: X.D7A */
public final class D7A extends AKU {
    public C38031kc A00;

    public final void A03(Set set, Integer num) {
        AnonymousClass0a4.A0A(false);
    }

    public final boolean A06(int i) {
        return false;
    }

    public final int A00() {
        return this.A00.A04().size() + 1;
    }

    public final Integer A02(AnonymousClass0C1 r17) {
        boolean booleanValue;
        MediaCodecInfo mediaCodecInfo;
        String str;
        D99 d99 = new D99();
        synchronized (C29757D8g.class) {
            if (C29757D8g.A00 == null) {
                boolean z = true;
                D8X d8x = new D8X(new D7N(), d99);
                String str2 = null;
                int i = 0;
                loop0:
                while (true) {
                    if (i >= MediaCodecList.getCodecCount()) {
                        break;
                    }
                    try {
                        mediaCodecInfo = MediaCodecList.getCodecInfoAt(i);
                    } catch (IllegalArgumentException e) {
                        AnonymousClass0DB.A0G("CodecCompatibilityChecker", "Cannot retrieve decoder codec info", e);
                        mediaCodecInfo = null;
                    }
                    if (mediaCodecInfo != null && !mediaCodecInfo.isEncoder()) {
                        String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                        int length = supportedTypes.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                str = null;
                                break;
                            } else if (supportedTypes[i2].equals("video/avc")) {
                                str = mediaCodecInfo.getName();
                                break;
                            } else {
                                i2++;
                            }
                        }
                        if (str != null && d8x.Aeh(str)) {
                            try {
                                for (int i3 = 0; i3 < r6; i3++) {
                                }
                                for (int i4 : C29757D8g.A01) {
                                    for (int i5 : mediaCodecInfo.getCapabilitiesForType("video/avc").colorFormats) {
                                        if (i5 == i4) {
                                            str2 = str;
                                            break loop0;
                                        }
                                    }
                                }
                                continue;
                            } catch (IllegalArgumentException e2) {
                                AnonymousClass0DB.A0G("CodecCompatibilityChecker", "Cannot retrieve decoder capabilities", e2);
                            }
                        }
                    }
                    i++;
                }
                if (str2 == null) {
                    z = false;
                }
                C29757D8g.A00 = Boolean.valueOf(z);
            }
            booleanValue = C29757D8g.A00.booleanValue();
        }
        if (booleanValue) {
            return Constants.ZERO;
        }
        return Constants.ONE;
    }

    public D7A(C38031kc r1) {
        this.A00 = r1;
    }

    public final Integer A01() {
        return Constants.A0C;
    }
}
