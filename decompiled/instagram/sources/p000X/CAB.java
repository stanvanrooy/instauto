package p000X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.framelayout.MediaFrameLayout;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.model.mediatype.MediaType;
import com.instagram.p009ui.mediaactions.MediaActionsView;

/* renamed from: X.CAB */
public final class CAB extends AnonymousClass2MK {
    public CA8 A00;
    public AnonymousClass0RN A01;
    public AnonymousClass0C1 A02;
    public final float A03;

    public final /* bridge */ /* synthetic */ void A04(C40371oY r7, AnonymousClass1ZK r8) {
        Object[] objArr;
        String str;
        CA7 ca7 = (CA7) r7;
        CAD cad = (CAD) r8;
        AnonymousClass11J.A00(this.A02);
        AnonymousClass11J.A00(this.A01);
        AnonymousClass11J.A00(this.A00);
        boolean z = false;
        if (cad.A00 != null) {
            z = true;
        }
        if (z) {
            cad.APt().A0H(cad.AGJ().A00());
        }
        C36841ih r0 = ca7.A01;
        AnonymousClass11J.A00(r0);
        cad.A00 = r0;
        C38641lb.A00(this.A02, ca7.A00, cad.ANP(), this.A01, (Context) null);
        new AnonymousClass1VM().A01(cad.APf(), cad.ANP(), ca7.A02, ca7.A00, cad.APt());
        C38781lp.A00(cad.AGJ(), ca7.A00, cad.APt());
        cad.APt().A0G(cad.AGJ().A00());
        View APn = cad.APn();
        if (ca7.A00.APx() == MediaType.VIDEO) {
            objArr = new Object[1];
            str = "Video";
        } else {
            objArr = new Object[1];
            str = "Photo";
        }
        objArr[0] = str;
        APn.setContentDescription(C06360Ot.formatString("Media Thumbnail %s Cell", objArr));
        CA8 ca8 = this.A00;
        if (ca8.A00.A07.A03(ca7.A00.APo()) == 0) {
            CA9 ca9 = ca8.A00.A00;
            AnonymousClass11J.A00(ca9);
            AnonymousClass1NJ r3 = ca7.A00;
            AnonymousClass1NJ r02 = ca9.A02;
            if (r02 != null && r02.equals(r3)) {
                CA9.A03(ca9, "media_mismatch", true);
                CA9.A02(ca9, r3, cad, 0);
            }
        }
        View APn2 = cad.APn();
        APn2.setOnClickListener(new CAC(ca8, ca7, cad));
        APn2.setOnTouchListener(new CA6(ca8, ca7));
    }

    public CAB(float f) {
        this.A03 = f;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass1ZK A01(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(C0003R.layout.media_thumbnail_preview_item_layout, viewGroup, false);
        MediaFrameLayout mediaFrameLayout = (MediaFrameLayout) AnonymousClass1E1.A07(inflate, C0003R.C0005id.thumbnail_preview_container);
        mediaFrameLayout.setAspectRatio(this.A03);
        return new CAD(inflate, mediaFrameLayout, (IgProgressImageView) AnonymousClass1E1.A07(inflate, C0003R.C0005id.media_image_preview), mediaFrameLayout, (MediaActionsView) AnonymousClass1E1.A07(inflate, C0003R.C0005id.preview_media_actions_view), new C32221an((ViewStub) AnonymousClass1E1.A07(inflate, C0003R.C0005id.audio_icon_view_stub)), new C32231ao((ViewStub) AnonymousClass1E1.A07(inflate, C0003R.C0005id.video_subtitle_view_stub)));
    }

    public final Class A02() {
        return CA7.class;
    }
}
