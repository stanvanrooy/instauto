package com.instagram.user.follow;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.facebook.C0003R;
import com.instagram.p009ui.widget.textview.UpdatableButton;
import java.util.Set;
import p000X.AnonymousClass5JK;
import p000X.C13300iJ;
import p000X.C23199ACj;
import p000X.C23200ACk;

public class BlockButton extends UpdatableButton {
    public boolean A00;

    public static void A00(BlockButton blockButton, C13300iJ r6) {
        boolean z = blockButton.A00;
        int i = C0003R.string.blocking_button_block;
        if (z) {
            i = C0003R.string.blocking_button_unblock;
        }
        blockButton.setText(i);
        Context context = blockButton.getContext();
        boolean z2 = blockButton.A00;
        String A0B = r6.A0B();
        int i2 = C0003R.string.blocking_button_block_voice;
        if (z2) {
            i2 = C0003R.string.blocking_button_unblock_voice;
        }
        blockButton.setContentDescription(context.getString(i2, new Object[]{A0B}));
        blockButton.setEnabled(true);
    }

    public static void A01(BlockButton blockButton, C13300iJ r3, C23199ACj aCj) {
        Set set;
        boolean z = !blockButton.A00;
        blockButton.A00 = z;
        blockButton.setIsBlueButton(!z);
        blockButton.refreshDrawableState();
        C23200ACk aCk = aCj.A00;
        AnonymousClass5JK r1 = new AnonymousClass5JK(r3);
        if (aCk.A0B.contains(r1)) {
            if (aCk.A0C.contains(r1)) {
                aCk.A0C.remove(r1);
            } else {
                aCk.A0D.add(r1);
            }
            aCk.A0B.remove(r1);
            set = aCk.A0E;
        } else {
            if (aCk.A0D.contains(r1)) {
                aCk.A0D.remove(r1);
            } else {
                aCk.A0C.add(r1);
            }
            aCk.A0E.remove(r1);
            set = aCk.A0B;
        }
        set.add(r1);
        if (!TextUtils.isEmpty(aCj.A02.getText())) {
            aCj.A02.setText("");
            aCj.A02.clearFocus();
            aCj.A02.A03();
        }
    }

    public BlockButton(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public BlockButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BlockButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
