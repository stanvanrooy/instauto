package p000X;

import android.widget.NumberPicker;
import com.instagram.igds.components.datepicker.IgDatePicker;

/* renamed from: X.CM0 */
public final class CM0 implements NumberPicker.OnValueChangeListener {
    public final /* synthetic */ CM1 A00;
    public final /* synthetic */ IgDatePicker A01;

    public CM0(IgDatePicker igDatePicker, CM1 cm1) {
        this.A01 = igDatePicker;
        this.A00 = cm1;
    }

    public final void onValueChange(NumberPicker numberPicker, int i, int i2) {
        CM1 cm1 = this.A00;
        C27652CLu.A00(cm1.A00, this.A01.A01.getValue(), this.A01.A00.getValue());
    }
}
