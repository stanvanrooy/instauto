package p000X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.feed.media.Media__JsonHelper;
import java.io.StringWriter;
import java.util.List;

/* renamed from: X.CBB */
public final class CBB implements C109994oZ {
    public final C28287CeT AAU(long j, Object obj) {
        return new C28086CbA(j, (CBE) obj);
    }

    public final Object AJq(C28287CeT ceT) {
        return ((C28086CbA) ceT).A00;
    }

    public final String ANF(Object obj) {
        return ((CBE) obj).A01.getId();
    }

    public final String BfR(AnonymousClass0C1 r9, List list) {
        CBA cba = new CBA(list);
        StringWriter stringWriter = new StringWriter();
        C13460iZ A05 = C12890hY.A00.A05(stringWriter);
        A05.A0T();
        if (cba.A00 != null) {
            A05.A0d("places");
            A05.A0S();
            for (C28086CbA cbA : cba.A00) {
                if (cbA != null) {
                    A05.A0T();
                    if (cbA.A00 != null) {
                        A05.A0d("place");
                        CBE cbe = cbA.A00;
                        A05.A0T();
                        if (cbe.A01 != null) {
                            A05.A0d("location");
                            AnonymousClass27Y.A00(A05, cbe.A01);
                        }
                        String str = cbe.A04;
                        if (str != null) {
                            A05.A0H(DialogModule.KEY_TITLE, str);
                        }
                        String str2 = cbe.A03;
                        if (str2 != null) {
                            A05.A0H("subtitle", str2);
                        }
                        String str3 = cbe.A02;
                        if (str3 != null) {
                            A05.A0H("search_subtitle", str3);
                        }
                        if (cbe.A00 != null) {
                            A05.A0d("header_media");
                            BVH bvh = cbe.A00;
                            A05.A0T();
                            if (bvh.A00 != null) {
                                A05.A0d("media");
                                A05.A0S();
                                for (AnonymousClass1NJ r0 : bvh.A00) {
                                    if (r0 != null) {
                                        Media__JsonHelper.A01(A05, r0);
                                    }
                                }
                                A05.A0P();
                            }
                            AnonymousClass1N4.A00(A05, bvh);
                            A05.A0Q();
                        }
                        A05.A0Q();
                    }
                    C110154op.A00(A05, cbA);
                    A05.A0Q();
                }
            }
            A05.A0P();
        }
        A05.A0Q();
        A05.close();
        return stringWriter.toString();
    }

    public final List ABm(AnonymousClass0C1 r2, String str) {
        CBA parseFromJson = CB9.parseFromJson(AnonymousClass0IY.A00(r2, str));
        if (parseFromJson == null) {
            return null;
        }
        return parseFromJson.A00;
    }
}
