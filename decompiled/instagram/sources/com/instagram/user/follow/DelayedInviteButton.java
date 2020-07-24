package com.instagram.user.follow;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.C0003R;
import com.instagram.p009ui.widget.gradientspinner.SpinningGradientBorder;
import p000X.C019000b;
import p000X.C128835fN;
import p000X.C128855fP;
import p000X.C128895fT;
import p000X.C128925fW;

public class DelayedInviteButton extends InviteButton {
    public SpinningGradientBorder A00;

    public static void setInviteState(DelayedInviteButton delayedInviteButton, C128895fT r6, C128925fW r7) {
        C128835fN r4 = new C128835fN(delayedInviteButton, r6, r7);
        delayedInviteButton.setText(C0003R.string.invite_button_invite);
        delayedInviteButton.setTextColor(C019000b.A00(delayedInviteButton.getContext(), C0003R.color.white));
        delayedInviteButton.setBackgroundResource(C0003R.C0004drawable.primary_button_selector);
        delayedInviteButton.A00.setSpinnerState(1);
        delayedInviteButton.setOnClickListener(r4);
    }

    public static void setUndoState(DelayedInviteButton delayedInviteButton, C128895fT r6, C128925fW r7) {
        C128855fP r4 = new C128855fP(delayedInviteButton, r6, r7);
        delayedInviteButton.setText(C0003R.string.invite_button_inviting);
        delayedInviteButton.setTextColor(C019000b.A00(delayedInviteButton.getContext(), C0003R.color.black));
        delayedInviteButton.setBackgroundResource(C0003R.C0004drawable.bg_rounded_white);
        delayedInviteButton.A00.setSpinnerState(2);
        delayedInviteButton.setOnClickListener(r4);
    }

    public DelayedInviteButton(Context context) {
        super(context, (AttributeSet) null, 0);
    }

    public DelayedInviteButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public DelayedInviteButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
