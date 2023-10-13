package p021c4;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p021c4.C1308d;
import p041f3.C1920g;
import p041f3.C1924k;
import p062i4.C2111f;
import p062i4.C2113g;
import p140v3.C3423b;

/* renamed from: c4.j */
public final class C1342j implements Closeable {

    /* renamed from: j */
    private static final Logger f4857j = Logger.getLogger(C1311e.class.getName());

    /* renamed from: k */
    public static final C1343a f4858k = new C1343a((C1920g) null);

    /* renamed from: d */
    private final C2111f f4859d;

    /* renamed from: e */
    private int f4860e = 16384;

    /* renamed from: f */
    private boolean f4861f;

    /* renamed from: g */
    private final C1308d.C1310b f4862g;

    /* renamed from: h */
    private final C2113g f4863h;

    /* renamed from: i */
    private final boolean f4864i;

    /* renamed from: c4.j$a */
    public static final class C1343a {
        private C1343a() {
        }

        public /* synthetic */ C1343a(C1920g gVar) {
            this();
        }
    }

    public C1342j(C2113g gVar, boolean z) {
        C1924k.m9142h(gVar, "sink");
        this.f4863h = gVar;
        this.f4864i = z;
        C2111f fVar = new C2111f();
        this.f4859d = fVar;
        this.f4862g = new C1308d.C1310b(0, false, fVar, 3, (C1920g) null);
    }

    /* renamed from: G */
    private final void m6423G(int i, long j) {
        while (j > 0) {
            long min = Math.min((long) this.f4860e, j);
            j -= min;
            mo5276i(i, (int) min, 9, j == 0 ? 4 : 0);
            this.f4863h.mo5092I(this.f4859d, min);
        }
    }

    /* renamed from: B */
    public final synchronized void mo5266B(int i, int i2, List<C1306c> list) {
        C1924k.m9142h(list, "requestHeaders");
        if (!this.f4861f) {
            this.f4862g.mo5146g(list);
            long h0 = this.f4859d.mo7931h0();
            int min = (int) Math.min(((long) this.f4860e) - 4, h0);
            long j = (long) min;
            mo5276i(i, min + 4, 5, h0 == j ? 4 : 0);
            this.f4863h.mo7895A(i2 & Integer.MAX_VALUE);
            this.f4863h.mo5092I(this.f4859d, j);
            if (h0 > j) {
                m6423G(i, h0 - j);
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: C */
    public final synchronized void mo5267C(int i, C1304b bVar) {
        C1924k.m9142h(bVar, "errorCode");
        if (!this.f4861f) {
            if (bVar.mo5130a() != -1) {
                mo5276i(i, 4, 3, 0);
                this.f4863h.mo7895A(bVar.mo5130a());
                this.f4863h.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: D */
    public final synchronized void mo5268D(C1349m mVar) {
        C1924k.m9142h(mVar, "settings");
        if (!this.f4861f) {
            int i = 0;
            mo5276i(0, mVar.mo5299i() * 6, 4, 0);
            while (i < 10) {
                if (mVar.mo5296f(i)) {
                    this.f4863h.mo7968x(i != 4 ? i != 7 ? i : 4 : 3);
                    this.f4863h.mo7895A(mVar.mo5291a(i));
                }
                i++;
            }
            this.f4863h.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: F */
    public final synchronized void mo5269F(int i, long j) {
        if (!this.f4861f) {
            if (j != 0 && j <= 2147483647L) {
                mo5276i(i, 4, 8, 0);
                this.f4863h.mo7895A((int) j);
                this.f4863h.flush();
            } else {
                throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public final synchronized void mo5270a(C1349m mVar) {
        C1924k.m9142h(mVar, "peerSettings");
        if (!this.f4861f) {
            this.f4860e = mVar.mo5295e(this.f4860e);
            if (mVar.mo5292b() != -1) {
                this.f4862g.mo5144e(mVar.mo5292b());
            }
            mo5276i(0, 0, 4, 1);
            this.f4863h.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: c */
    public final synchronized void mo5271c() {
        if (this.f4861f) {
            throw new IOException("closed");
        } else if (this.f4864i) {
            Logger logger = f4857j;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C3423b.m15099q(">> CONNECTION " + C1311e.f4695a.mo7988k(), new Object[0]));
            }
            this.f4863h.mo7899E(C1311e.f4695a);
            this.f4863h.flush();
        }
    }

    public synchronized void close() {
        this.f4861f = true;
        this.f4863h.close();
    }

    /* renamed from: f */
    public final synchronized void mo5273f(boolean z, int i, C2111f fVar, int i2) {
        if (!this.f4861f) {
            mo5275h(i, z ? 1 : 0, fVar, i2);
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void flush() {
        if (!this.f4861f) {
            this.f4863h.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: h */
    public final void mo5275h(int i, int i2, C2111f fVar, int i3) {
        mo5276i(i, i3, 0, i2);
        if (i3 > 0) {
            C2113g gVar = this.f4863h;
            if (fVar == null) {
                C1924k.m9150p();
            }
            gVar.mo5092I(fVar, (long) i3);
        }
    }

    /* renamed from: i */
    public final void mo5276i(int i, int i2, int i3, int i4) {
        Logger logger = f4857j;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C1311e.f4699e.mo5149b(false, i, i2, i3, i4));
        }
        boolean z = true;
        if (i2 <= this.f4860e) {
            if ((((int) 2147483648L) & i) != 0) {
                z = false;
            }
            if (z) {
                C3423b.m15082V(this.f4863h, i2);
                this.f4863h.mo7913U(i3 & 255);
                this.f4863h.mo7913U(i4 & 255);
                this.f4863h.mo7895A(i & Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException(("reserved bit set: " + i).toString());
        }
        throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f4860e + ": " + i2).toString());
    }

    /* renamed from: k */
    public final synchronized void mo5277k(int i, C1304b bVar, byte[] bArr) {
        C1924k.m9142h(bVar, "errorCode");
        C1924k.m9142h(bArr, "debugData");
        if (!this.f4861f) {
            boolean z = false;
            if (bVar.mo5130a() != -1) {
                mo5276i(0, bArr.length + 8, 7, 0);
                this.f4863h.mo7895A(i);
                this.f4863h.mo7895A(bVar.mo5130a());
                if (bArr.length == 0) {
                    z = true;
                }
                if (!z) {
                    this.f4863h.mo7925e(bArr);
                }
                this.f4863h.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: n */
    public final synchronized void mo5278n(boolean z, int i, List<C1306c> list) {
        C1924k.m9142h(list, "headerBlock");
        if (!this.f4861f) {
            this.f4862g.mo5146g(list);
            long h0 = this.f4859d.mo7931h0();
            long min = Math.min((long) this.f4860e, h0);
            int i2 = h0 == min ? 4 : 0;
            if (z) {
                i2 |= 1;
            }
            mo5276i(i, (int) min, 1, i2);
            this.f4863h.mo5092I(this.f4859d, min);
            if (h0 > min) {
                m6423G(i, h0 - min);
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: s */
    public final int mo5279s() {
        return this.f4860e;
    }

    /* renamed from: w */
    public final synchronized void mo5280w(boolean z, int i, int i2) {
        if (!this.f4861f) {
            mo5276i(0, 8, 6, z ? 1 : 0);
            this.f4863h.mo7895A(i);
            this.f4863h.mo7895A(i2);
            this.f4863h.flush();
        } else {
            throw new IOException("closed");
        }
    }
}
