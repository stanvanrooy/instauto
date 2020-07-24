package p000X;

import com.instagram.comments.fragment.CommentThreadFragment;

/* renamed from: X.1Qy  reason: invalid class name and case insensitive filesystem */
public final class C29711Qy implements C27021Ge {
    public final /* synthetic */ C29671Qu A00;

    public C29711Qy(C29671Qu r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean A2J(Object obj) {
        return C29671Qu.A03(this.A00);
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        String str;
        int A03 = AnonymousClass0Z0.A03(-1188963253);
        C35301g9 r11 = (C35301g9) obj;
        int A032 = AnonymousClass0Z0.A03(952637758);
        AnonymousClass1NJ A0Q = r11.A00.A0C.A0Q(this.A00.A0J);
        if (!A0Q.A3L) {
            C29671Qu r6 = this.A00;
            Class<?> cls = r6.A03.getClass();
            C16980pU.A00.A00();
            if (cls != CommentThreadFragment.class) {
                boolean z = false;
                if (r11.A00.A0K == Constants.ONE) {
                    z = true;
                }
                AnonymousClass0C1 r4 = r6.A0J;
                C27371Ho r3 = r6.A0I;
                if (z) {
                    str = "caption";
                } else {
                    str = "preview_comment";
                }
                AnonymousClass2o1.A03(r4, r3, A0Q, str);
                C29671Qu r0 = this.A00;
                AnonymousClass2o1.A00(r0.A0J, r0.A03, A0Q);
                if (A0Q.Aho()) {
                    C46401zg A01 = C46401zg.A01(this.A00.A0J);
                    C46401zg.A01(this.A00.A0J);
                    A01.A03(C46401zg.A00(A0Q), "comment_text");
                }
                AnonymousClass2VA A002 = C16980pU.A00.A00().A00(A0Q.APo());
                AnonymousClass0C1 r02 = this.A00.A0J;
                A002.A05(r02.A06.equals(A0Q.A0c(r02)));
                A002.A01(this.A00.A0I);
                AnonymousClass1I6 r03 = this.A00.A01;
                if (r03 != null) {
                    A002.A02(r03);
                }
                if (z) {
                    A002.A03(Constants.ONE);
                } else {
                    A002.A04(r11.A00.AS8());
                }
                C29671Qu r42 = this.A00;
                C29671Qu.A01(r42, r42.A04, A002.A00(), this.A00.A0J, (String) null, C62612o2.VIEW_COMMENTS_FROM_COMMENTS);
            }
        }
        AnonymousClass0Z0.A0A(638740820, A032);
        AnonymousClass0Z0.A0A(-1824004666, A03);
    }
}
