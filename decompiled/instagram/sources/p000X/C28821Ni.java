package p000X;

import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.modules.camera.CameraRollManager;
import java.util.EnumSet;

/* renamed from: X.1Ni  reason: invalid class name and case insensitive filesystem */
public final class C28821Ni implements C28831Nj {
    public final AnonymousClass1HD A00;
    public final AnonymousClass0RN A01;
    public final AnonymousClass0C1 A02;
    public final EnumSet A03 = EnumSet.allOf(C28841Nk.class);

    public final C152856g7 AMg(C28841Nk r6) {
        if (r6 == null) {
            r6 = C28841Nk.A0J;
        }
        switch (C140435zR.A00[r6.ordinal()]) {
            case 1:
                return new C115284xI(this.A00, this.A02);
            case 2:
                return new C113844ux(this.A00, this.A02);
            case 3:
                return new C115314xL(this.A00.getActivity(), this.A02);
            case 4:
                AnonymousClass1HD r0 = this.A00;
                return new C115094wz(r0.getContext(), this.A02, AnonymousClass1L8.A00(r0));
            case 5:
                return new C114174vU(this.A00.getActivity(), this.A02);
            case 6:
                AnonymousClass1HD r02 = this.A00;
                return new C114224vZ(r02.getActivity(), r02.getContext(), AnonymousClass1L8.A00(r02), this.A02);
            case 7:
                return new C138695vg(this.A00.getActivity(), this.A02);
            case 8:
                return new C138755vm(this.A00.getContext(), this.A02);
            case 9:
                return new AnonymousClass59M(this.A00.getContext(), this.A02);
            case 10:
                AnonymousClass1HD r03 = this.A00;
                return new C116504zP(r03.getContext(), AnonymousClass1L8.A00(r03), this.A02);
            case C120125Dh.VIEW_TYPE_BANNER /*11*/:
            case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                return new AnonymousClass4UY(this.A00.getActivity(), this.A02, this.A01.getModuleName());
            case C120125Dh.VIEW_TYPE_BADGE /*13*/:
                return new C101004Xz(this.A00.getContext(), this.A02);
            case C120125Dh.VIEW_TYPE_LINK /*14*/:
                return new C1185657a(this.A00.getContext());
            case 15:
                return new C114064vJ(this.A02);
            case 16:
                return new C939444n(this.A02, this.A00);
            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM /*17*/:
                return new AnonymousClass4B5(this.A00.getActivity(), this.A02);
            case 18:
                return new C95314At(this.A00.getActivity(), this.A02);
            case 19:
            case 20:
                return new AnonymousClass4RK(this.A00.getContext());
            case C120125Dh.VIEW_TYPE_BRANDING /*21*/:
                return new C95344Aw(this.A00.getActivity(), this.A02);
            case C120125Dh.NUM_VIEW_TYPES /*22*/:
                return new C1190358v(this.A00, this.A02);
            case 23:
                return new AnonymousClass42Q(this.A00, this.A02);
            case 24:
                return new AnonymousClass46R(this.A00, this.A02);
            case 25:
                return new C96944Hc(this.A00, this.A02);
            case OdexSchemeArtXdex.OREO_SDK_INT /*26*/:
                return new C1172251m(this.A00, this.A02);
            case 27:
                return new AnonymousClass51R(this.A00);
            case 28:
                return new AnonymousClass51S(this.A00, this.A02);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                AnonymousClass1HD r04 = this.A00;
                return new C1177853x(r04.getActivity(), this.A02, AnonymousClass1L8.A00(r04), this.A01);
            case 30:
                return new AnonymousClass4DJ(this.A00.getContext(), this.A02);
            case 31:
                return new AnonymousClass5E6(this.A00.getActivity(), this.A02);
            case 32:
            case 33:
            case 34:
                return new C140415zP(this.A00.getActivity(), this.A01, this.A02);
            case 35:
                return new AnonymousClass4EK(this.A00, this.A02);
            case 36:
                return new C1169250h(this.A00, this.A02);
            case 37:
                return new C120475Et(this.A00, this.A02);
            case 38:
                return new C119795By(this.A00, this.A02);
            case 39:
                return new AnonymousClass5RS(this.A00, this.A02);
            case 40:
                return new C127815dg(this.A00, this.A01, this.A02);
            case 41:
                return new C116424zH(this.A00, this.A02);
            case 42:
                return new C113044td(this.A00, this.A02);
            case 43:
                return new C128605ex(this.A00, this.A02);
            case 44:
                return new C97954Ld(this.A00, this.A02);
            case 45:
                return new AnonymousClass50g(this.A00, this.A02);
            case 46:
                return new C96324Er(this.A00, this.A02);
            case 47:
                return new C939544o(this.A00, this.A02);
            case 48:
                return new C939644p(this.A00, this.A02);
            case 49:
                return new C939744q(this.A00, this.A02);
            case AMD.MAX_LIKES_PER_FETCH /*50*/:
                return new AnonymousClass4D9(this.A00, this.A02);
            case 51:
                return new C939344m(this.A00, this.A02);
            case 52:
                return new C1169150f(this.A00, this.A02);
            case 53:
                return new C138255uy(this.A00, this.A02);
            case 54:
                return new C95294Ar(this.A00, this.A02);
            case 55:
                return new C935643a(this.A02);
            case 56:
                AnonymousClass1HD r2 = this.A00;
                return new C97844Kq(r2.getContext(), r2, this.A02);
            case 57:
                return new AnonymousClass49A(this.A00.getContext());
            case 58:
                return new AnonymousClass42R(this.A00.getActivity(), this.A02);
            case 59:
                return new AnonymousClass482(this.A00.getActivity(), this.A02);
            case 60:
                return new AnonymousClass42S(this.A00.getActivity(), this.A02);
            case 61:
                return new C140095yq(this.A00, this.A02, 0);
            case 62:
                return new C140095yq(this.A00, this.A02, 1);
            case 63:
                return new C152716fr(this.A00, this.A02);
            case 64:
                return new AnonymousClass483(this.A00.getActivity(), this.A02);
            case 65:
                return new C160016sE(this.A00.getActivity(), this.A02);
            case 66:
                return new C950549t(this.A00.getActivity(), this.A02);
            case 67:
                return new AnonymousClass6D9(this.A00.requireActivity(), this.A02);
            case 68:
                return new AnonymousClass5EU(this.A00.getActivity(), this.A01, this.A02);
            case 69:
                return new AnonymousClass4BL(this.A00.requireActivity(), this.A02);
            case 70:
                return new C95304As(this.A00.requireActivity(), this.A02);
            case 71:
                return new AnonymousClass4M0(this.A00, this.A02);
            case 72:
                return new AnonymousClass59N(this.A00.requireActivity(), this.A02);
            case 73:
                return new AnonymousClass4EL(this.A00, this.A02);
            case 74:
                return new C159616rZ(this.A00.requireActivity(), this.A02);
            case 75:
                return null;
            default:
                throw new IllegalArgumentException(AnonymousClass000.A0E("Don't have a handler for ", r6.toString()));
        }
    }

    public final EnumSet AXL() {
        return this.A03;
    }

    public C28821Ni(AnonymousClass1HD r2, AnonymousClass0RN r3, AnonymousClass0C1 r4) {
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }
}
