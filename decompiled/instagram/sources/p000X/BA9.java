package p000X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.BA9 */
public final class BA9 implements DialogInterface.OnKeyListener {
    public final /* synthetic */ FragmentActivity A00;

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        this.A00.finish();
        return false;
    }

    public BA9(FragmentActivity fragmentActivity) {
        this.A00 = fragmentActivity;
    }
}
