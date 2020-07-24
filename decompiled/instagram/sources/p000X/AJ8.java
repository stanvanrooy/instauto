package p000X;

import android.view.View;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.imageview.CircularImageView;
import java.util.ArrayList;

/* renamed from: X.AJ8 */
public final class AJ8 implements C11200ea {
    public final /* synthetic */ AKB A00;

    public AJ8(AKB akb) {
        this.A00 = akb;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0Z0.A03(-1137576052);
        int A032 = AnonymousClass0Z0.A03(303213815);
        AKB akb = this.A00;
        C13300iJ r10 = ((AJK) obj).A00.A00;
        C06220Of.A0E(akb.A0D);
        View A002 = AKB.A00(akb);
        CircularImageView circularImageView = (CircularImageView) A002.findViewById(C0003R.C0005id.guest_avatar);
        View findViewById = A002.findViewById(C0003R.C0005id.wave_reaction);
        TextView textView = (TextView) A002.findViewById(C0003R.C0005id.wave_text);
        textView.setText(textView.getResources().getString(C0003R.string.live_wave_viewer_success_text, new Object[]{r10.AZn()}));
        circularImageView.setBackgroundDrawable(C019000b.A03(circularImageView.getContext(), C0003R.C0004drawable.white_circle_bg));
        circularImageView.setUrl(C30941Vv.A01("👋"));
        ((CircularImageView) A002.findViewById(C0003R.C0005id.host_avatar)).setUrl(r10.ASv());
        A002.setVisibility(0);
        C476524w A01 = AJ0.A01(findViewById);
        AJ7 aj7 = new AJ7(akb, circularImageView, findViewById, A01);
        if (akb.A0A == null) {
            akb.A0A = new ArrayList();
        }
        akb.A0A.add(A01);
        A01.A09 = aj7;
        A01.A0O();
        AnonymousClass0Z0.A0A(456113924, A032);
        AnonymousClass0Z0.A0A(-1778921465, A03);
    }
}
