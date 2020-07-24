package p000X;

import android.content.Context;
import com.facebook.C0003R;
import java.util.Map;

/* renamed from: X.AL6 */
public final class AL6 implements C51742Ly {
    public AWN A00;
    public final /* synthetic */ ALD A01;

    public AL6(ALD ald, AWN awn) {
        this.A01 = ald;
        this.A00 = awn;
    }

    public final void BE9(Map map) {
        if (C35251g3.A00(ALD.A04, map) == AnonymousClass2WY.GRANTED) {
            C178347jX r0 = this.A01.A00;
            if (r0 != null) {
                r0.A00();
            }
            this.A00.A02();
            return;
        }
        ALD ald = this.A01;
        if (ald.A00 == null) {
            ALP alp = ald.A03;
            Context context = alp.A00.getContext();
            String A06 = AnonymousClass1BA.A06(context);
            C178347jX r3 = new C178347jX(alp.A00, C0003R.layout.permission_empty_state_view);
            r3.A04.setText(context.getString(C0003R.string.camera_permission_rationale_title, new Object[]{A06}));
            r3.A03.setText(context.getString(C0003R.string.camera_permission_rationale_message, new Object[]{A06}));
            r3.A02.setText(C0003R.string.camera_permission_rationale_link);
            r3.A02.setOnClickListener(new AL9(alp, this));
            ald.A00 = r3;
        }
        this.A01.A00.A02(map);
    }
}
