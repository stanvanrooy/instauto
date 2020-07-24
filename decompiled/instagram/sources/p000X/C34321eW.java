package p000X;

import com.instagram.feed.media.ProfilePicture;

/* renamed from: X.1eW  reason: invalid class name and case insensitive filesystem */
public final class C34321eW {
    public static ProfilePicture parseFromJson(C13080hr r3) {
        ProfilePicture profilePicture = new ProfilePicture();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("uri".equals(A0i)) {
                profilePicture.A00 = C13270iF.A00(r3);
            }
            r3.A0f();
        }
        return profilePicture;
    }
}
