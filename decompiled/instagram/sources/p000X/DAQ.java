package p000X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;

/* renamed from: X.DAQ */
public final class DAQ extends Handler {
    public final /* synthetic */ DAO A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DAQ(DAO dao, Looper looper) {
        super(looper);
        this.A00 = dao;
    }

    public final void handleMessage(Message message) {
        DAO dao = this.A00;
        int i = message.what;
        boolean z = true;
        if (i == 0) {
            DAS das = (DAS) message.obj;
            int i2 = message.arg1;
            if (message.arg2 == -1) {
                z = false;
            }
            int i3 = dao.A02 - i2;
            dao.A02 = i3;
            if (i3 == 0) {
                if (das.A02 == -9223372036854775807L) {
                    das = das.A01(das.A04, 0, das.A01);
                }
                if ((!dao.A07.A03.A07() || dao.A09) && das.A03.A07()) {
                    dao.A00 = 0;
                    dao.A01 = 0;
                    dao.A05 = 0;
                    dao.A04 = 0;
                }
                int i4 = 2;
                if (dao.A09) {
                    i4 = 0;
                }
                boolean z2 = dao.A0A;
                dao.A09 = false;
                dao.A0A = false;
                DAO.A02(dao, das, z, i4, z2);
            }
        } else if (i == 1) {
            DAX dax = (DAX) message.obj;
            if (!dao.A08.equals(dax)) {
                dao.A08 = dax;
                Iterator it = dao.A0E.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        } else if (i == 2) {
            D3Z d3z = (D3Z) message.obj;
            dao.A06 = d3z;
            Iterator it2 = dao.A0E.iterator();
            while (it2.hasNext()) {
                ((C29797DAh) it2.next()).BEX(d3z);
            }
        } else if (i != 3) {
            if (i == 4) {
                Iterator it3 = dao.A0E.iterator();
                while (it3.hasNext()) {
                    it3.next();
                }
            } else if (i == 5) {
                Iterator it4 = dao.A0E.iterator();
                while (it4.hasNext()) {
                    ((C29797DAh) it4.next()).BTC((String) message.obj);
                }
            } else {
                throw new IllegalStateException();
            }
        } else if (dao.A0F) {
            int i5 = dao.A03 - 1;
            dao.A03 = i5;
            if (i5 == 0) {
                dao.A0C = ((Boolean) message.obj).booleanValue();
                Iterator it5 = dao.A0E.iterator();
                while (it5.hasNext()) {
                    C29797DAh dAh = (C29797DAh) it5.next();
                    boolean z3 = dao.A0C;
                    if (z3) {
                        if (!dao.A0F) {
                            z3 = dao.A0B;
                        }
                        dAh.BEY(z3, dao.A07.A00);
                    }
                }
            }
        }
    }
}
