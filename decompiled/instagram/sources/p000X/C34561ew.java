package p000X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.model.MusicAssetModel;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: X.1ew  reason: invalid class name and case insensitive filesystem */
public final class C34561ew {
    public int A00;
    public ImageUrl A01;
    public ImageUrl A02;
    public ImageUrl A03;
    public C34571ex A04 = C34571ex.UNSET;
    public C32011aO A05;
    public C13300iJ A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public ArrayList A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C34561ew r5 = (C34561ew) obj;
            if (this.A00 != r5.A00 || this.A0O != r5.A0O || this.A0N != r5.A0N || this.A0P != r5.A0P || this.A0Q != r5.A0Q || this.A0R != r5.A0R || !Objects.equals(this.A07, r5.A07) || !Objects.equals(this.A08, r5.A08) || !Objects.equals(this.A09, r5.A09) || !Objects.equals(this.A0A, r5.A0A) || !Objects.equals(this.A0D, r5.A0D) || !Objects.equals(this.A0B, r5.A0B) || this.A04 != r5.A04 || !Objects.equals(this.A0J, r5.A0J) || !Objects.equals(this.A0C, r5.A0C) || !Objects.equals(this.A0K, r5.A0K) || !Objects.equals(this.A0E, r5.A0E) || !Objects.equals(this.A0L, r5.A0L) || !Objects.equals(this.A0I, r5.A0I) || !Objects.equals(this.A0F, r5.A0F) || !Objects.equals(this.A01, r5.A01) || !Objects.equals(this.A02, r5.A02) || !Objects.equals(this.A0G, r5.A0G) || !Objects.equals(this.A05, r5.A05) || !Objects.equals(this.A06, r5.A06) || !Objects.equals(this.A03, r5.A03) || !Objects.equals(this.A0H, r5.A0H)) {
                return false;
            }
        }
        return true;
    }

    public static C34561ew A00(C34561ew r2) {
        C34561ew r1 = new C34561ew();
        r1.A07 = r2.A07;
        r1.A08 = r2.A08;
        r1.A09 = r2.A09;
        r1.A0A = r2.A0A;
        r1.A0D = r2.A0D;
        r1.A0B = r2.A0B;
        r1.A04 = r2.A04;
        r1.A0J = r2.A0J;
        r1.A0C = r2.A0C;
        r1.A0K = r2.A0K;
        r1.A00 = r2.A00;
        r1.A0E = r2.A0E;
        r1.A0L = r2.A0L;
        r1.A0I = r2.A0I;
        r1.A0F = r2.A0F;
        r1.A01 = r2.A01;
        r1.A02 = r2.A02;
        r1.A0O = r2.A0O;
        r1.A0N = r2.A0N;
        r1.A05 = r2.A05;
        r1.A06 = r2.A06;
        r1.A03 = r2.A03;
        r1.A0R = r2.A0R;
        r1.A0H = r2.A0H;
        r1.A0P = r2.A0P;
        r1.A0M = r2.A0M;
        r1.A0G = r2.A0G;
        r1.A0Q = r2.A0Q;
        return r1;
    }

    public static void A01(C34561ew r4) {
        String str = r4.A0K;
        if (str == null && r4.A0E == null) {
            AnonymousClass0QD.A02("MusicOverlayStickerModel", String.format("Progressive Download Url and Dash Manifest cannot both be null for music asset id: %s", new Object[]{r4.A0J}));
        } else {
            r4.A05 = new C32011aO(str, r4.A0E);
        }
        if (r4.A07 == null) {
            r4.A07 = 0;
        }
        if (r4.A0A == null) {
            r4.A0A = Integer.valueOf(r4.A00);
        }
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.A07, this.A08, this.A09, this.A0A, this.A0D, this.A0B, this.A04, this.A0J, this.A0C, this.A0K, Integer.valueOf(this.A00), this.A0E, this.A0L, this.A0I, this.A0F, this.A01, this.A02, Boolean.valueOf(this.A0O), Boolean.valueOf(this.A0N), Boolean.valueOf(this.A0P), this.A0G, Boolean.valueOf(this.A0Q), this.A05, this.A06, this.A03, Boolean.valueOf(this.A0R), this.A0H});
    }

    public final void A02(int i) {
        this.A07 = Integer.valueOf(i);
    }

    public final void A03(int i) {
        this.A0A = Integer.valueOf(i);
    }

    public C34561ew() {
    }

    public C34561ew(C34571ex r2, MusicAssetModel musicAssetModel, String str) {
        this.A04 = r2;
        this.A0J = musicAssetModel.A07;
        this.A0C = musicAssetModel.A04;
        this.A0K = musicAssetModel.A09;
        this.A00 = musicAssetModel.A00;
        this.A0E = musicAssetModel.A05;
        this.A0L = musicAssetModel.A0B;
        this.A0I = musicAssetModel.A0A;
        this.A0F = musicAssetModel.A06;
        this.A01 = musicAssetModel.A01;
        this.A02 = musicAssetModel.A02;
        this.A0O = musicAssetModel.A0E;
        this.A0N = musicAssetModel.A0D;
        this.A0P = musicAssetModel.A0F;
        this.A0M = musicAssetModel.A0C;
        this.A0G = musicAssetModel.A08;
        this.A0D = str;
        this.A0B = musicAssetModel.A03;
        this.A09 = 0;
        A01(this);
    }
}
