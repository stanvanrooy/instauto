package p000X;

import com.facebook.C0003R;

/* renamed from: X.1ul  reason: invalid class name and case insensitive filesystem */
public enum C43611ul {
    SMALL(false, C0003R.C0004drawable.following_avatar, C0003R.C0004drawable.follow_avatar, C0003R.C0004drawable.requested_avatar, C0003R.C0004drawable.follow_avatar),
    MEDIUM(true, C0003R.C0004drawable.following_icon, 0, C0003R.C0004drawable.requested_icon, 0),
    LARGE(true, C0003R.C0004drawable.following_icon, 0, C0003R.C0004drawable.requested_icon, C0003R.C0004drawable.follow_icon),
    ACTIONABLE_TEXT(true, C0003R.C0004drawable.actionable_chevron_down, 0, 0, 0),
    ACTIONBARICON(false, C0003R.C0004drawable.following_avatar, C0003R.C0004drawable.follow_avatar, C0003R.C0004drawable.requested_avatar, C0003R.C0004drawable.follow_avatar),
    INLINE_ICON(false, C0003R.C0004drawable.instagram_user_following_filled_24, C0003R.C0004drawable.instagram_user_follow_outline_24, C0003R.C0004drawable.instagram_user_requested_filled_24, C0003R.C0004drawable.instagram_user_follow_outline_24),
    MESSAGE_OPTION(true, 0, 0, 0, 0);
    
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final boolean A04;

    /* access modifiers changed from: public */
    C43611ul(boolean z, int i, int i2, int i3, int i4) {
        this.A04 = z;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = i4;
    }
}
