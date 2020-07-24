package p000X;

import android.os.Bundle;

/* renamed from: X.0oH  reason: invalid class name and case insensitive filesystem */
public final class C16240oH implements C16250oI {
    public final Bundle Apq(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("LocationFeedFragment.ARGUMENT_LOCATION_VENUE_ID", str);
        return bundle;
    }

    public final AnonymousClass1HD Apr(String str) {
        C221209fy r1 = new C221209fy();
        r1.setArguments(Apq(str));
        return r1;
    }

    public final AnonymousClass1HD Aps() {
        return new AnonymousClass6NW();
    }
}
