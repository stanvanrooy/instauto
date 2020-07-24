package p000X;

import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.facebook.C0003R;

/* renamed from: X.AUP */
public class AUP extends DialogFragment {
    public AUJ A00;

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window = getDialog().getWindow();
        window.setBackgroundDrawableResource(C0003R.C0004drawable.bottom_sheet_background);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 80;
        attributes.windowAnimations = C0003R.style.bottom_sheet_animation;
        window.setAttributes(attributes);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.getWindow().setLayout(-1, -2);
        }
    }
}
