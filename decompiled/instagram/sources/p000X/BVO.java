package p000X;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.C0003R;
import com.fbpay.hub.form.cell.label.LabelCellParams;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.BVO */
public final class BVO extends FrameLayout implements C26582Bnz {
    public TextView A00;
    public C25466BMa A01;
    public final AnonymousClass1N6 A02 = new BVQ(this);

    public BVO(Context context) {
        super(context);
        View inflate = inflate(getContext(), C0003R.layout.hub_cell_label, this);
        AnonymousClass0a4.A06(inflate);
        this.A00 = (TextView) AnonymousClass1E1.A07(inflate, C0003R.C0005id.label);
    }

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0Z0.A06(-1819147536);
        super.onAttachedToWindow();
        this.A01.A01.A08(this.A02);
        AnonymousClass0Z0.A0D(1778140767, A06);
    }

    public final void onDetachedFromWindow() {
        int A06 = AnonymousClass0Z0.A06(-1834750378);
        super.onDetachedFromWindow();
        this.A01.A01.A07(this.A02);
        AnonymousClass0Z0.A0D(1363817847, A06);
    }

    public void setViewModel(C25466BMa bMa) {
        this.A01 = bMa;
        TextView textView = this.A00;
        Context context = getContext();
        String str = bMa.A03;
        int i = bMa.A00;
        if (i != 0) {
            str = context.getString(i);
        }
        AnonymousClass0a4.A06(str);
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (int i2 = 0; i2 < bMa.A02.size(); i2++) {
            str = str.replace(((LabelCellParams.LinkParams) bMa.A02.get(i2)).A01, context.getString(((LabelCellParams.LinkParams) bMa.A02.get(i2)).A00));
        }
        for (int i3 = 0; i3 < bMa.A02.size(); i3++) {
            String string = context.getString(((LabelCellParams.LinkParams) bMa.A02.get(i3)).A00);
            int indexOf = str.indexOf(string);
            BreakIterator characterInstance = BreakIterator.getCharacterInstance();
            characterInstance.setText(string);
            arrayList.add(new BVN(characterInstance.last(), indexOf, ((LabelCellParams.LinkParams) bMa.A02.get(i3)).A02));
        }
        AnonymousClass1HQ r2 = bMa.A01;
        if (arrayList.size() == 1) {
            z = true;
        }
        r2.A0A(Boolean.valueOf(z));
        textView.setText(new BVM(str, Collections.unmodifiableList(arrayList)).A00(new C25467BMb(bMa, context)));
        this.A00.setMovementMethod(new LinkMovementMethod());
    }
}
