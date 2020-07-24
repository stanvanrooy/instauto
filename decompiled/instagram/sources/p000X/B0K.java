package p000X;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0003R;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.B0K */
public final class B0K extends LinearLayout implements C27025Bwb {
    public static final int[] A03 = {16842912};
    public boolean A00;
    public boolean A01;
    public final Set A02 = new LinkedHashSet(1);

    public final void A3h(B0M b0m) {
        this.A02.add(b0m);
    }

    public final void BbD(B0M b0m) {
        this.A02.remove(b0m);
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, A03);
        }
        return onCreateDrawableState;
    }

    public void setChecked(boolean z) {
        if (this.A01 != z) {
            this.A01 = z;
            refreshDrawableState();
            if (!this.A00) {
                this.A00 = true;
                for (B0M AvH : this.A02) {
                    AvH.AvH(this, this.A01);
                }
                this.A00 = false;
            }
        }
    }

    public B0K(Context context) {
        super(context);
        LayoutInflater.from(getContext()).inflate(C0003R.layout.layout_radio_button_with_secondary_text_and_button, this, true);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setGravity(16);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0003R.dimen.root_padding);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        setOnClickListener(new B0L(this));
    }

    public final boolean isChecked() {
        return this.A01;
    }

    public void setExtraButtonText(String str) {
        ((Button) findViewById(C0003R.C0005id.extra_btn)).setText(str);
    }

    public void setSubtitle(String str) {
        ((TextView) findViewById(C0003R.C0005id.subtitle)).setText(str);
    }

    public void setTitle(String str) {
        ((TextView) findViewById(C0003R.C0005id.title)).setText(str);
    }

    public final void toggle() {
        if (!isChecked()) {
            setChecked(!this.A01);
        }
    }
}
