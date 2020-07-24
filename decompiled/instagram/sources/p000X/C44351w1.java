package p000X;

import android.text.TextUtils;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.typedurl.ImageUrl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1w1  reason: invalid class name and case insensitive filesystem */
public final class C44351w1 implements C249916w {
    public ImageUrl A00;
    public Integer A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06 = "unknown";

    public final List AMd() {
        return null;
    }

    public final C13300iJ AZf() {
        return null;
    }

    public final Integer AH7() {
        switch (this.A01.intValue()) {
            case 0:
            case 4:
                return Constants.A0Y;
            case 2:
                return Constants.ONE;
            case 3:
                if (!TextUtils.isEmpty(this.A02)) {
                    return Constants.A0N;
                }
                return Constants.A0C;
            case 7:
                return Constants.A0u;
            case 8:
            case 9:
                return Constants.A12;
            default:
                return Constants.ZERO;
        }
    }

    public final String AJ4() {
        return this.A03;
    }

    public final ImageUrl AJ5() {
        return this.A00;
    }

    public final Map APN() {
        HashMap hashMap = new HashMap();
        hashMap.put("o_pk", getId());
        hashMap.put("o_t", this.A06);
        return hashMap;
    }

    public final Integer AQj() {
        switch (this.A01.intValue()) {
            case 2:
                return Constants.A0C;
            case 3:
                return Constants.A0N;
            case 7:
                return Constants.A0j;
            case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                return Constants.ONE;
            default:
                return Constants.ZERO;
        }
    }

    public final Integer AZG() {
        return this.A01;
    }

    public final String getId() {
        return this.A04;
    }

    public final String getName() {
        return this.A05;
    }

    public final String toString() {
        String str;
        String str2 = this.A05;
        switch (this.A01.intValue()) {
            case 1:
                str = "USER";
                break;
            case 2:
                str = "LOCATION";
                break;
            case 3:
                str = "HASHTAG";
                break;
            case 4:
                str = "STICKER";
                break;
            case 5:
                str = "SYSTEM";
                break;
            case 6:
                str = "ELECTION";
                break;
            case 7:
                str = "PRODUCT";
                break;
            case 8:
                str = "MENTIONS";
                break;
            case 9:
                str = "MENTIONSV2";
                break;
            case 10:
                str = "GROUP";
                break;
            case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                str = "TOP_CLIPS";
                break;
            case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                str = "EFFECTS";
                break;
            default:
                str = NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED;
                break;
        }
        return AnonymousClass000.A0O("{name: ", str2, " mas type: ", str, "}");
    }

    public final void Bgq(ImageUrl imageUrl) {
        this.A00 = imageUrl;
    }
}
