package p000X;

import com.instagram.model.hashtag.Hashtag;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.1Qx  reason: invalid class name and case insensitive filesystem */
public final class C29701Qx implements C27021Ge {
    public final /* synthetic */ C29671Qu A00;

    public C29701Qx(C29671Qu r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean A2J(Object obj) {
        return C29671Qu.A03(this.A00);
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        String str;
        String str2;
        int A03 = AnonymousClass0Z0.A03(763134538);
        C35371gG r12 = (C35371gG) obj;
        int A032 = AnonymousClass0Z0.A03(1913142505);
        AnonymousClass1NJ r2 = r12.A00;
        String str3 = r12.A01;
        boolean z = r12.A02;
        C29671Qu r0 = this.A00;
        AnonymousClass2o1.A01(r0.A0J, r0.A0I, r2, str3);
        C29671Qu r02 = this.A00;
        AnonymousClass2o1.A00(r02.A0J, r02.A03, r2);
        AnonymousClass2UR A01 = C17910r0.A00.A01();
        Hashtag hashtag = new Hashtag(str3);
        String moduleName = this.A00.A0I.getModuleName();
        if (z) {
            str = "caption";
        } else {
            str = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT;
        }
        AnonymousClass1HD A012 = A01.A01(hashtag, moduleName, str);
        if (z) {
            str2 = "media_caption_hashtag";
        } else {
            str2 = "media_comments_hashtag";
        }
        C29671Qu r5 = this.A00;
        C29671Qu.A01(r5, r5.A04, A012, r5.A0J, str2, C62612o2.VIEW_HASHTAG_FROM_COMMENTS);
        AnonymousClass0Z0.A0A(-232365114, A032);
        AnonymousClass0Z0.A0A(1848497129, A03);
    }
}
