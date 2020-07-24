package p000X;

/* renamed from: X.1Vx  reason: invalid class name and case insensitive filesystem */
public final class C30961Vx {
    public static boolean A00(String str) {
        if (str.startsWith("reel_") || str.startsWith("replay_") || str.startsWith("live_") || str.startsWith("reel_netego_ad4ad_") || str.startsWith("self_reel_")) {
            return true;
        }
        return false;
    }
}
