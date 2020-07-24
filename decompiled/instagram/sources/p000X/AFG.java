package p000X;

import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* renamed from: X.AFG */
public final class AFG implements View.OnKeyListener {
    public final /* synthetic */ SearchView A00;

    public AFG(SearchView searchView) {
        this.A00 = searchView;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        int length;
        SearchView searchView = this.A00;
        if (searchView.A02 != null) {
            if (!searchView.A0d.isPopupShowing() || this.A00.A0d.getListSelection() == -1) {
                boolean z = false;
                if (TextUtils.getTrimmedLength(this.A00.A0d.getText()) == 0) {
                    z = true;
                }
                if (!z && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i == 66) {
                    view.cancelLongPress();
                    SearchView searchView2 = this.A00;
                    searchView2.getContext().startActivity(SearchView.A00(searchView2, "android.intent.action.SEARCH", (Uri) null, (String) null, searchView2.A0d.getText().toString()));
                    return true;
                }
            } else {
                SearchView searchView3 = this.A00;
                if (searchView3.A02 == null || searchView3.A06 == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                    return false;
                }
                if (i == 66 || i == 84 || i == 61) {
                    return searchView3.A0J(searchView3.A0d.getListSelection());
                }
                if (i == 21 || i == 22) {
                    if (i == 21) {
                        length = 0;
                    } else {
                        length = searchView3.A0d.length();
                    }
                    searchView3.A0d.setSelection(length);
                    searchView3.A0d.setListSelection(0);
                    searchView3.A0d.clearListSelection();
                    searchView3.A0d.A00();
                    return true;
                } else if (i != 19) {
                    return false;
                } else {
                    searchView3.A0d.getListSelection();
                    return false;
                }
            }
        }
        return false;
    }
}
