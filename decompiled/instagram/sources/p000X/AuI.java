package p000X;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.C0003R;

/* renamed from: X.AuI */
public final class AuI extends C18690sG implements C18720sJ {
    public final /* synthetic */ AuH A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AuI(AuH auH) {
        super(0);
        this.A00 = auH;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        ViewGroup viewGroup = this.A00.A00.A08;
        Context context = viewGroup.getContext();
        viewGroup.getContext();
        AnonymousClass5F9.A02(context, context.getString(C0003R.string.call_stack_indicator));
        return C50622Ha.A00;
    }
}
