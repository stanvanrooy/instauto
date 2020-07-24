package p000X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.imageview.CircularImageView;
import com.instagram.p009ui.widget.textureview.CircularTextureView;
import java.util.concurrent.TimeUnit;

/* renamed from: X.AL2 */
public final class AL2 implements ALQ {
    public static final long A0B = TimeUnit.SECONDS.toMillis(5);
    public ObjectAnimator A00;
    public boolean A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final PopupWindow A05;
    public final ProgressBar A06;
    public final TextView A07;
    public final TextView A08;
    public final CircularImageView A09;
    public final CircularTextureView A0A;

    public final void AuT(boolean z) {
        Context context;
        int i;
        if (this.A05.isShowing()) {
            View view = this.A04;
            if (z) {
                context = view.getContext();
                i = C0003R.string.switch_back_camera;
            } else {
                context = view.getContext();
                i = C0003R.string.switch_front_camera;
            }
            view.setContentDescription(context.getString(i));
        }
    }

    public AL2(Context context) {
        View inflate = LayoutInflater.from(context).inflate(C0003R.layout.layout_iglive_livewith_autoaccept_popup, (ViewGroup) null);
        this.A05 = new PopupWindow(inflate, -1, -2, true);
        this.A09 = (CircularImageView) inflate.findViewById(C0003R.C0005id.iglive_reciever_avatar_imageview);
        this.A08 = (TextView) inflate.findViewById(C0003R.C0005id.iglive_livewith_auto_accept_title);
        this.A07 = (TextView) inflate.findViewById(C0003R.C0005id.iglive_livewith_auto_accept_subtitle);
        this.A03 = inflate.findViewById(C0003R.C0005id.iglive_livewith_auto_accept_cancel);
        this.A04 = inflate.findViewById(C0003R.C0005id.iglive_livewith_switch_camera);
        this.A06 = (ProgressBar) inflate.findViewById(C0003R.C0005id.iglive_auto_accept_progress_bar);
        this.A02 = inflate.findViewById(C0003R.C0005id.iglive_livewith_auto_accept_bottom_container);
        this.A0A = (CircularTextureView) inflate.findViewById(C0003R.C0005id.iglive_camera_preview_texture);
    }

    public final CircularTextureView AHi() {
        return this.A0A;
    }
}
