package p000X;

import com.facebook.common.dextricks.OdexSchemeArtXdex;

/* renamed from: X.1lz  reason: invalid class name and case insensitive filesystem */
public class C38871lz {
    public C39401mr A00;
    public C222139hV A01;
    public C39931nn A02;
    public C38891m1 A03;
    public AnonymousClass5JN A04;
    public C1657474v A05;
    public C173727bX A06;
    public C28771CmR A07;
    public AnonymousClass2CJ A08;
    public AnonymousClass9UB A09;
    public C217329Yv A0A;
    public AnonymousClass1NJ A0B;
    public C43411uN A0C;
    public C472522v A0D;
    public C120925Gn A0E;
    public C28487Chi A0F;
    public Object A0G;

    public C38871lz A00() {
        C39401mr r0;
        AnonymousClass2CJ r1 = this.A08;
        if (r1 != null) {
            this.A00 = C39401mr.REELS;
            this.A0G = r1;
            return this;
        }
        C39931nn r12 = this.A02;
        if (r12 != null) {
            this.A00 = C39401mr.CHANNEL;
            this.A0G = r12;
            return this;
        }
        AnonymousClass1NJ r13 = this.A0B;
        if (r13 != null) {
            this.A00 = C39401mr.MEDIA;
            this.A0G = r13;
            return this;
        }
        C43411uN r02 = this.A0C;
        if (r02 != null) {
            this.A0G = r02;
            r0 = C39401mr.ACCOUNT_RECS_AS_NETEGO;
        } else {
            C28487Chi chi = this.A0F;
            if (chi != null) {
                this.A00 = C39401mr.ACCOUNT_REC;
                this.A0G = chi;
                return this;
            }
            C173727bX r14 = this.A06;
            if (r14 != null) {
                this.A00 = C39401mr.IGTV_MEDIA;
                this.A0G = r14;
                return this;
            }
            C217329Yv r15 = this.A0A;
            if (r15 != null) {
                this.A00 = C39401mr.SHOPPING;
                this.A0G = r15;
                return this;
            }
            AnonymousClass5JN r16 = this.A04;
            if (r16 != null) {
                this.A00 = C39401mr.DESTINATION_PIVOT;
                this.A0G = r16;
                return this;
            }
            AnonymousClass9UB r17 = this.A09;
            if (r17 != null) {
                this.A00 = C39401mr.SHOPPING_CAROUSEL;
                this.A0G = r17;
                return this;
            }
            C1657474v r18 = this.A05;
            if (r18 != null) {
                this.A00 = C39401mr.IGTV_CHANNEL;
                this.A0G = r18;
                return this;
            }
            C28771CmR cmR = this.A07;
            if (cmR != null) {
                this.A00 = C39401mr.MEDIA_LOCATION_MAP;
                this.A0G = cmR;
                return this;
            }
            C38891m1 r19 = this.A03;
            if (r19 != null) {
                this.A00 = C39401mr.CLIPS;
                this.A0G = r19;
                return this;
            }
            C222139hV r110 = this.A01;
            if (r110 != null) {
                this.A00 = C39401mr.BLOKS;
                this.A0G = r110;
                return this;
            }
            C120925Gn r111 = this.A0E;
            if (r111 != null) {
                this.A00 = C39401mr.GUIDES;
                this.A0G = r111;
                return this;
            }
            C472522v r112 = this.A0D;
            if (r112 != null) {
                this.A00 = C39401mr.GUIDES_CHANNEL;
                this.A0G = r112;
                return this;
            }
            r0 = C39401mr.UNKNOWN;
        }
        this.A00 = r0;
        return this;
    }

    public final String A01() {
        switch (this.A00.ordinal()) {
            case 1:
                return this.A0B.getId();
            case 2:
                return this.A02.A01;
            case 4:
                return this.A08.A07;
            case 8:
                return this.A0C.getId();
            case 15:
                return this.A0F.A05;
            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM /*17*/:
                return this.A06.A00.getId();
            case 18:
                return this.A0A.A03;
            case 20:
                return this.A04.A01;
            case C120125Dh.NUM_VIEW_TYPES /*22*/:
                return this.A09.getId();
            case 23:
                return this.A05.A00.A02;
            case 24:
                return "map_tile_with_pins";
            case 25:
                return this.A03.A04;
            case OdexSchemeArtXdex.OREO_SDK_INT /*26*/:
                return this.A01.A01;
            case 27:
                return this.A0E.A05;
            case 28:
                return this.A0D.A01;
            default:
                return null;
        }
    }
}
