package p000X;

import android.content.DialogInterface;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

/* renamed from: X.AP3 */
public final class AP3 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ C228659vP A00;
    public final /* synthetic */ C27990CZa A01;
    public final /* synthetic */ Map A02;

    public AP3(C27990CZa cZa, Map map, C228659vP r3) {
        this.A01 = cZa;
        this.A02 = map;
        this.A00 = r3;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.A01.A05.A06(C27998CZi.ACTION_PURCHASE_FAILED, ImmutableMap.A01(this.A02));
        this.A00.BGh(Constants.A15);
    }
}
