package p000X;

/* renamed from: X.0zL  reason: invalid class name and case insensitive filesystem */
public final class C22980zL {
    public static final String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "warm_start_with_feed";
            case 2:
                return "background_pre_fetch";
            case 3:
                return "pull_to_refresh";
            case 4:
                return "second_page_of_tray";
            case 5:
                return "direct_app";
            case 6:
                return "profile_stories";
            default:
                return "cold_start";
        }
    }
}
