package com.instagram.share.handleractivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.IgActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000X.Constants;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass0Z0;
import p000X.C06590Pq;
import p000X.C200638iN;
import p000X.C200688iS;
import p000X.C200718iX;
import p000X.C36681iR;

public class StoryShareHandlerActivity extends IgActivity implements AnonymousClass0RN {
    public C06590Pq A00;

    public final String getModuleName() {
        return "share_handler";
    }

    private void A00() {
        List<Uri> singletonList;
        String str;
        Intent intent = getIntent();
        boolean equals = "android.intent.action.SEND_MULTIPLE".equals(intent.getAction());
        String $const$string = AnonymousClass0C5.$const$string(55);
        if (equals) {
            singletonList = intent.getParcelableArrayListExtra($const$string);
        } else {
            singletonList = Collections.singletonList((Uri) intent.getParcelableExtra($const$string));
        }
        ArrayList arrayList = new ArrayList();
        for (Uri uri : singletonList) {
            if (uri != null) {
                arrayList.add(uri);
            }
        }
        C06590Pq r2 = this.A00;
        Integer num = Constants.ZERO;
        if (!arrayList.isEmpty()) {
            str = C36681iR.A01(";").A03(arrayList);
        } else {
            str = null;
        }
        C200688iS.A00(r2, this, num, (String) null, str);
        C200638iN.A00(this, this.A00, intent, arrayList, (Uri) null, Constants.ZERO, (String) null, -16777216, -16777216, (String) null, new C200718iX(this));
    }

    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(2094589868);
        super.onCreate(bundle);
        this.A00 = AnonymousClass0J1.A01(this);
        A00();
        AnonymousClass0Z0.A07(-172127595, A002);
    }

    public final void onNewIntent(Intent intent) {
        setIntent(intent);
        A00();
    }
}
