package p000X;

import com.instagram.closefriends.fragment.CloseFriendsHomeFragment;

/* renamed from: X.CI4 */
public final class CI4 implements Runnable {
    public final /* synthetic */ C27540CHf A00;

    public CI4(C27540CHf cHf) {
        this.A00 = cHf;
    }

    public final void run() {
        CloseFriendsHomeFragment closeFriendsHomeFragment = this.A00.A01;
        if (AnonymousClass1H4.A01(closeFriendsHomeFragment.mFragmentManager)) {
            closeFriendsHomeFragment.getActivity().onBackPressed();
        }
    }
}
