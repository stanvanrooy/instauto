package p000X;

import android.content.Intent;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.BER */
public final class BER implements Runnable {
    public final /* synthetic */ BEV A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ List A02;

    public BER(BEV bev, List list, List list2) {
        this.A00 = bev;
        this.A01 = list;
        this.A02 = list2;
    }

    public final void run() {
        BEV bev = this.A00;
        List list = this.A01;
        List list2 = this.A02;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            File file = (File) list.get(i);
            String A002 = BEL.A00(file);
            Uri fromFile = Uri.fromFile(file);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(fromFile, bev.A00.getContentResolver().getType(fromFile));
            intent.addFlags(1);
            intent.putExtra("module_name", A002.split("\\.config\\.", 2)[0]);
            intent.putExtra("split_id", A002);
            arrayList.add(intent);
            arrayList2.add(BEL.A00(file).split("\\.config\\.", 2)[0]);
        }
        C25325BEf bEf = (C25325BEf) bev.A07.get();
        if (bEf != null) {
            AnonymousClass0Z9.A03(bev.A05, new BES(bev, bEf.A06(), arrayList, arrayList2, list2), -1557525932);
        }
    }
}
