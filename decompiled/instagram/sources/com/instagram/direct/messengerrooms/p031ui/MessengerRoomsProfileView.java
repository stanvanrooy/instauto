package com.instagram.direct.messengerrooms.p031ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.imageview.CircularImageView;
import com.instagram.direct.messengerrooms.api.MessengerRoom;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass1E1;
import p000X.C14100jl;
import p000X.C205728rK;

/* renamed from: com.instagram.direct.messengerrooms.ui.MessengerRoomsProfileView */
public class MessengerRoomsProfileView extends LinearLayout {
    public TextView A00;
    public TextView A01;
    public CircularImageView A02;

    private void A00() {
        setOrientation(1);
        setGravity(1);
        inflate(getContext(), C0003R.layout.content_messenger_rooms_profile, this);
        this.A02 = (CircularImageView) AnonymousClass1E1.A07(this, C0003R.C0005id.avatar_imageview);
        this.A01 = (TextView) AnonymousClass1E1.A07(this, C0003R.C0005id.messenger_rooms_link_room_name);
        this.A00 = (TextView) AnonymousClass1E1.A07(this, C0003R.C0005id.messenger_rooms_link_room_link);
    }

    public void setRoom(AnonymousClass0C1 r7, MessengerRoom messengerRoom) {
        this.A02.setUrl(C205728rK.A02(C14100jl.A00(r7)));
        if (messengerRoom != null) {
            this.A01.setVisibility(0);
            this.A01.setText(getResources().getString(C0003R.string.messenger_rooms_link_room_name, new Object[]{messengerRoom.A02}));
            this.A00.setVisibility(0);
            this.A00.setText(messengerRoom.A01);
            return;
        }
        this.A01.setVisibility(8);
        this.A00.setVisibility(8);
    }

    public MessengerRoomsProfileView(Context context) {
        super(context);
        A00();
    }

    public MessengerRoomsProfileView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public MessengerRoomsProfileView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }
}
