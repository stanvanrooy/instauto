package p000X;

import android.app.Dialog;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.pendingmedia.model.PendingMedia;
import java.util.Date;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.1Wa  reason: invalid class name and case insensitive filesystem */
public final class C30991Wa extends Handler {
    public final /* synthetic */ AnonymousClass1WZ A00;

    public C30991Wa(AnonymousClass1WZ r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005f, code lost:
        if (r4.A07 != false) goto L_0x0061;
     */
    public final void handleMessage(Message message) {
        boolean z;
        Object obj;
        if (message.what == 0) {
            PendingMedia pendingMedia = (PendingMedia) this.A00.A03.get(message.getData().getString("pending_media_key"));
            AnonymousClass1WZ.A01(this.A00, pendingMedia);
            C27321Hj r5 = this.A00.A02;
            if (r5 != null) {
                AnonymousClass1NJ r6 = pendingMedia.A0d;
                C225139mf r4 = new C225139mf(r5.getActivity());
                if (r4.A00 == -1) {
                    r4.A00 = CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
                }
                if (r4.A00 == 2000) {
                    if (r4.A04 == null) {
                        r4.A04 = new Date();
                    }
                    r4.A01++;
                } else {
                    r4.A00 = CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
                    r4.A04 = null;
                    r4.A02 = 0;
                    r4.A01 = 1;
                    r4.A07 = false;
                    r4.A06 = false;
                    r4.A05 = null;
                }
                C225139mf.A00(r4);
                if (r4.A02 >= 0 && r4.A01 >= 4 && !r4.A06) {
                    z = true;
                }
                z = false;
                if (z) {
                    Dialog dialog = new Dialog(r4.A03, C0003R.style.IgDialog);
                    Resources resources = r4.A03.getResources();
                    try {
                        obj = r4.A03.getPackageManager().getApplicationLabel(r4.A03.getPackageManager().getApplicationInfo(r4.A03.getPackageName(), 0));
                    } catch (PackageManager.NameNotFoundException unused) {
                        obj = "unknown";
                    }
                    dialog.setContentView(C0003R.layout.appirater);
                    ((TextView) dialog.findViewById(C0003R.C0005id.appirater_title_area)).setText(resources.getString(C0003R.string.APPIRATER_MESSAGE_TITLE, new Object[]{obj}));
                    ((TextView) dialog.findViewById(C0003R.C0005id.appirater_message_area)).setText(String.format(resources.getString(C0003R.string.APPIRATER_MESSAGE), new Object[]{obj}));
                    TextView textView = (TextView) dialog.findViewById(C0003R.C0005id.appirater_rate_button);
                    textView.setText(String.format(resources.getString(C0003R.string.APPIRATER_RATE_BUTTON), new Object[]{obj}));
                    View findViewById = dialog.findViewById(C0003R.C0005id.appirater_rate_later_button);
                    View findViewById2 = dialog.findViewById(C0003R.C0005id.appirater_cancel_button);
                    textView.setOnClickListener(new C225129me(r4, dialog));
                    findViewById.setOnClickListener(new C225149mg(r4, dialog));
                    findViewById2.setOnClickListener(new C225159mh(r4, dialog));
                    dialog.show();
                }
                if (r5.A0l) {
                    r5.A0l = false;
                    C51512Ky r3 = new C51512Ky();
                    r3.A09 = r5.getString(C0003R.string.posted_to_username_message, r5.A0V.A06.AZn());
                    r3.A04 = r6.A0F();
                    r3.A06 = Constants.ONE;
                    r3.A00 = 5000;
                    r3.A08 = r5.getString(C0003R.string.post_another_title);
                    r3.A05 = new AnonymousClass592(r5);
                    r3.A0B = true;
                    C11130eT.A01.BXT(new C33441cv(r3.A00()));
                }
            }
        }
    }
}
