package p000X;

import android.content.Context;
import com.facebook.C0003R;
import java.util.ArrayList;

/* renamed from: X.C9N */
public final class C9N implements C7C {
    public final /* synthetic */ C9L A00;

    public final void BG0(String str) {
    }

    public C9N(C9L c9l) {
        this.A00 = c9l;
    }

    public final void AtO() {
        C9L.A00(this.A00);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00df, code lost:
        if (r0 == false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e9, code lost:
        if (r0 == false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f3, code lost:
        if (r0 == false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00fd, code lost:
        if (r0 == false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0107, code lost:
        if (r0 == false) goto L_0x00ba;
     */
    public final void B6W() {
        int i;
        char c;
        C9L c9l = this.A00;
        if (c9l.A03 != null) {
            Integer num = Constants.A05;
            C22300yB A002 = C22290yA.A00.A00();
            String token = c9l.getSession().getToken();
            String string = this.A00.getString(C0003R.string.interactions_info_title);
            String string2 = this.A00.getString(C0003R.string.story_interactions_info_message);
            C9L c9l2 = this.A00;
            C9M c9m = c9l2.A03;
            Context context = c9l2.getContext();
            ArrayList arrayList = new ArrayList();
            C9Q c9q = c9m.A03;
            if (c9q != null) {
                C9R c9r = c9q.A02;
                if (c9r.A00 > 0) {
                    arrayList.add(context.getString(C0003R.string.story_interactions_links_title));
                    arrayList.add(context.getString(C0003R.string.story_interactions_links_message));
                }
                if (c9r.A04 > 0) {
                    arrayList.add(context.getString(C0003R.string.story_interactions_shares_title));
                    arrayList.add(context.getString(C0003R.string.story_interactions_shares_message));
                }
                if (c9r.A01 > 0) {
                    arrayList.add(context.getString(C0003R.string.story_interactions_product_click_title));
                    arrayList.add(context.getString(C0003R.string.story_interactions_product_click_message));
                }
                arrayList.add(context.getString(C0003R.string.interactions_profile_visit_title));
                arrayList.add(context.getString(C0003R.string.interactions_profile_visit_message));
                boolean z = false;
                boolean z2 = false;
                boolean z3 = false;
                boolean z4 = false;
                boolean z5 = false;
                for (C9D c9d : c9r.A07) {
                    if (c9d.A00 > 0) {
                        String str = c9d.A01;
                        switch (str.hashCode()) {
                            case -2075921735:
                                boolean equals = str.equals("BIO_LINK_CLICKED");
                                c = 0;
                                break;
                            case 2060894:
                                boolean equals2 = str.equals("CALL");
                                c = 1;
                                break;
                            case 2571565:
                                boolean equals3 = str.equals("TEXT");
                                c = 4;
                                break;
                            case 66081660:
                                boolean equals4 = str.equals("EMAIL");
                                c = 3;
                                break;
                            case 1824003935:
                                boolean equals5 = str.equals("DIRECTION");
                                c = 2;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        if (c == 0) {
                            z = true;
                        } else if (c == 1) {
                            z2 = true;
                        } else if (c == 2) {
                            z3 = true;
                        } else if (c == 3) {
                            z4 = true;
                        } else if (c == 4) {
                            z5 = true;
                        }
                    }
                }
                if (z) {
                    arrayList.add(context.getString(C0003R.string.interactions_bio_link_title));
                    arrayList.add(context.getString(C0003R.string.interactions_bio_link_message));
                }
                if (z2) {
                    arrayList.add(context.getString(C0003R.string.interactions_call_title));
                    arrayList.add(context.getString(C0003R.string.interactions_call_message));
                }
                if (z3) {
                    arrayList.add(context.getString(C0003R.string.interactions_direction_title));
                    arrayList.add(context.getString(C0003R.string.interactions_direction_message));
                }
                if (z4) {
                    arrayList.add(context.getString(C0003R.string.interactions_email_title));
                    arrayList.add(context.getString(C0003R.string.interactions_email_message));
                }
                if (z5) {
                    arrayList.add(context.getString(C0003R.string.interactions_text_title));
                    arrayList.add(context.getString(C0003R.string.interactions_text_message));
                }
                if (c9r.A05 > 0) {
                    arrayList.add(context.getString(C0003R.string.story_interactions_sticker_title));
                    i = C0003R.string.story_interactions_sticker_message;
                }
                C9L.A01(c9l, num, A002.A02(token, string, string2, (String[]) arrayList.toArray(new String[0])));
            }
            arrayList.add(context.getString(C0003R.string.interactions_profile_visit_title));
            i = C0003R.string.interactions_profile_visit_message;
            arrayList.add(context.getString(i));
            C9L.A01(c9l, num, A002.A02(token, string, string2, (String[]) arrayList.toArray(new String[0])));
        }
    }
}
