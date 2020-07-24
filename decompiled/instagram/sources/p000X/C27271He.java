package p000X;

/* renamed from: X.1He  reason: invalid class name and case insensitive filesystem */
public final class C27271He {
    public static AnonymousClass1DV A00(AnonymousClass1HD r3) {
        String str = r3.mTag;
        if (str != null) {
            char c = 65535;
            switch (str.hashCode()) {
                case -859263443:
                    if (str.equals("fragment_feed")) {
                        c = 0;
                        break;
                    }
                    break;
                case -859024542:
                    if (str.equals("fragment_news")) {
                        c = 3;
                        break;
                    }
                    break;
                case -855271120:
                    if (str.equals("fragment_share")) {
                        c = 2;
                        break;
                    }
                    break;
                case -746371465:
                    if (str.equals("fragment_search")) {
                        c = 1;
                        break;
                    }
                    break;
                case 354534074:
                    if (str.equals("fragment_profile")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1504437345:
                    if (str.equals("fragment_tab_shopping")) {
                        c = 8;
                        break;
                    }
                    break;
                case 1526200610:
                    if (str.equals("fragment_tab_direct")) {
                        c = 7;
                        break;
                    }
                    break;
                case 1600254799:
                    if (str.equals("fragment_panel_camera")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1636420627:
                    if (str.equals("fragment_panel_direct")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return AnonymousClass1DU.FEED;
                case 1:
                    return AnonymousClass1DU.SEARCH;
                case 2:
                    return AnonymousClass1DU.SHARE;
                case 3:
                    return AnonymousClass1DU.NEWS;
                case 4:
                    return AnonymousClass1DU.PROFILE;
                case 5:
                    return C26381Db.DIRECT;
                case 6:
                    return C26381Db.CAMERA;
                case 7:
                    return AnonymousClass1DU.DIRECT;
                case 8:
                    return AnonymousClass1DU.SHOPPING;
            }
        }
        AnonymousClass0QD.A01("IgHostConstants", AnonymousClass000.A0J("Fragment [", r3.getClass().getSimpleName(), "] Tag not covered by getHostByFragmentTag"));
        return null;
    }
}
