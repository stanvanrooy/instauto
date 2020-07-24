package p000X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.ViewGroup;
import com.facebook.C0003R;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.videocall.VideoCallInfo;
import com.instagram.model.videocall.VideoCallSource;
import com.instagram.model.videocall.VideoCallThreadSurfaceKey;

/* renamed from: X.0xO  reason: invalid class name and case insensitive filesystem */
public final class C21850xO extends C21860xP {
    public final C28821CnH A00() {
        return new C28821CnH();
    }

    public final C28540Cia A01() {
        return new C28540Cia();
    }

    public final C24174AjO A02(ViewGroup viewGroup, AnonymousClass0C1 r3, C24129Aie aie) {
        return new C24174AjO(viewGroup, r3, aie);
    }

    public final void A03(Context context) {
        AnonymousClass2OA r2 = new AnonymousClass2OA(context);
        r2.A07(C0003R.string.videocall_create_call_during_call_error_title);
        r2.A06(C0003R.string.videocall_create_call_during_call_error_message);
        r2.A0A(C0003R.string.f118ok, (DialogInterface.OnClickListener) null);
        r2.A0V(true);
        r2.A03().show();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r3 = ((com.instagram.model.videocall.VideoCallThreadSurfaceKey) r7.A02).A00;
        r2 = p000X.C19290tE.A00(r5);
     */
    public final void A04(AnonymousClass0C1 r5, VideoCallInfo videoCallInfo, VideoCallSource videoCallSource) {
        DirectThreadKey directThreadKey;
        C65882uZ A00;
        String AZy;
        if (videoCallSource.A01 == C103484dZ.THREAD && (AZy = A00.AZy(directThreadKey)) != null && AZy.equals(videoCallInfo.A01)) {
            A00.Blh(directThreadKey, (String) null, (String) null);
        }
    }

    public final void A05(AnonymousClass0C1 r13, VideoCallInfo videoCallInfo, VideoCallSource videoCallSource, C23888Ad3 ad3) {
        String str = videoCallInfo.A01;
        C23888Ad3 ad32 = ad3;
        if (videoCallSource.A01 != C103484dZ.THREAD) {
            ad32.A01(new IllegalArgumentException("Attempt to attach incorrect surface"));
            return;
        }
        VideoCallSource.SurfaceKey surfaceKey = videoCallSource.A02;
        VideoCallThreadSurfaceKey videoCallThreadSurfaceKey = (VideoCallThreadSurfaceKey) surfaceKey;
        if (surfaceKey.getKey() == null) {
            ad32.A01(new IllegalArgumentException("Missing surface Key"));
            return;
        }
        String id = videoCallThreadSurfaceKey.getId();
        if (id == null) {
            String format = String.format("Null thread ID in surface key. VideoCallID=%s", new Object[]{str});
            AnonymousClass0QD.A02("DirectVideoCallAttachHelper", format);
            ad32.A01(new IllegalArgumentException(format));
            return;
        }
        Ad6 ad6 = new Ad6(r13, str, ad32, id, videoCallThreadSurfaceKey.A00);
        AnonymousClass0C1 r1 = ad6.A02;
        String str2 = ad6.A05;
        String str3 = ad6.A04;
        String A04 = C05860Mt.A02.A04();
        C15890nh r2 = new C15890nh(r1);
        r2.A09 = Constants.ONE;
        r2.A0G = true;
        r2.A0E("direct_v2/threads/%s/add_video_call/", str3);
        r2.A06(Ad8.class, false);
        r2.A09("device_id", A04);
        r2.A09("video_call_id", str2);
        C17850qu A03 = r2.A03();
        A03.A00 = ad6.A00;
        C12810hQ.A02(A03);
    }
}
