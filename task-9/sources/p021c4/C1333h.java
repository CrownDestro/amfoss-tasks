package p021c4;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p021c4.C1308d;
import p041f3.C1920g;
import p041f3.C1924k;
import p062i4.C2100b0;
import p062i4.C2102c0;
import p062i4.C2111f;
import p062i4.C2114h;
import p062i4.C2115i;
import p068j3.C2324a;
import p140v3.C3423b;

/* renamed from: c4.h */
public final class C1333h implements Closeable {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final Logger f4817h;

    /* renamed from: i */
    public static final C1334a f4818i = new C1334a((C1920g) null);

    /* renamed from: d */
    private final C1335b f4819d;

    /* renamed from: e */
    private final C1308d.C1309a f4820e;

    /* renamed from: f */
    private final C2114h f4821f;

    /* renamed from: g */
    private final boolean f4822g;

    /* renamed from: c4.h$a */
    public static final class C1334a {
        private C1334a() {
        }

        public /* synthetic */ C1334a(C1920g gVar) {
            this();
        }

        /* renamed from: a */
        public final Logger mo5218a() {
            return C1333h.f4817h;
        }

        /* renamed from: b */
        public final int mo5219b(int i, int i2, int i3) {
            if ((i2 & 8) != 0) {
                i--;
            }
            if (i3 <= i) {
                return i - i3;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i3 + " > remaining length " + i);
        }
    }

    /* renamed from: c4.h$b */
    public static final class C1335b implements C2100b0 {

        /* renamed from: d */
        private int f4823d;

        /* renamed from: e */
        private int f4824e;

        /* renamed from: f */
        private int f4825f;

        /* renamed from: g */
        private int f4826g;

        /* renamed from: h */
        private int f4827h;

        /* renamed from: i */
        private final C2114h f4828i;

        public C1335b(C2114h hVar) {
            C1924k.m9142h(hVar, "source");
            this.f4828i = hVar;
        }

        /* renamed from: c */
        private final void m6357c() {
            int i = this.f4825f;
            int G = C3423b.m15067G(this.f4828i);
            this.f4826g = G;
            this.f4823d = G;
            int b = C3423b.m15084b(this.f4828i.readByte(), 255);
            this.f4824e = C3423b.m15084b(this.f4828i.readByte(), 255);
            C1334a aVar = C1333h.f4818i;
            if (aVar.mo5218a().isLoggable(Level.FINE)) {
                aVar.mo5218a().fine(C1311e.f4699e.mo5149b(true, this.f4825f, this.f4823d, b, this.f4824e));
            }
            int readInt = this.f4828i.readInt() & Integer.MAX_VALUE;
            this.f4825f = readInt;
            if (b != 9) {
                throw new IOException(b + " != TYPE_CONTINUATION");
            } else if (readInt != i) {
                throw new IOException("TYPE_CONTINUATION streamId changed");
            }
        }

        /* renamed from: M */
        public long mo5087M(C2111f fVar, long j) {
            C1924k.m9142h(fVar, "sink");
            while (true) {
                int i = this.f4826g;
                if (i == 0) {
                    this.f4828i.mo7963v((long) this.f4827h);
                    this.f4827h = 0;
                    if ((this.f4824e & 4) != 0) {
                        return -1;
                    }
                    m6357c();
                } else {
                    long M = this.f4828i.mo5087M(fVar, Math.min(j, (long) i));
                    if (M == -1) {
                        return -1;
                    }
                    this.f4826g -= (int) M;
                    return M;
                }
            }
        }

        /* renamed from: a */
        public final int mo5220a() {
            return this.f4826g;
        }

        public void close() {
        }

        /* renamed from: d */
        public C2102c0 mo5090d() {
            return this.f4828i.mo5090d();
        }

        /* renamed from: f */
        public final void mo5221f(int i) {
            this.f4824e = i;
        }

        /* renamed from: h */
        public final void mo5222h(int i) {
            this.f4826g = i;
        }

        /* renamed from: i */
        public final void mo5223i(int i) {
            this.f4823d = i;
        }

        /* renamed from: k */
        public final void mo5224k(int i) {
            this.f4827h = i;
        }

        /* renamed from: n */
        public final void mo5225n(int i) {
            this.f4825f = i;
        }
    }

    /* renamed from: c4.h$c */
    public interface C1336c {
        /* renamed from: a */
        void mo5201a(boolean z, int i, C2114h hVar, int i2);

        /* renamed from: b */
        void mo5202b(boolean z, int i, int i2, List<C1306c> list);

        /* renamed from: d */
        void mo5203d();

        /* renamed from: e */
        void mo5204e(int i, long j);

        /* renamed from: g */
        void mo5205g(int i, int i2, List<C1306c> list);

        /* renamed from: h */
        void mo5206h(boolean z, int i, int i2);

        /* renamed from: i */
        void mo5207i(boolean z, C1349m mVar);

        /* renamed from: j */
        void mo5208j(int i, int i2, int i3, boolean z);

        /* renamed from: m */
        void mo5209m(int i, C1304b bVar);

        /* renamed from: o */
        void mo5210o(int i, C1304b bVar, C2115i iVar);
    }

    static {
        Logger logger = Logger.getLogger(C1311e.class.getName());
        C1924k.m9137c(logger, "Logger.getLogger(Http2::class.java.name)");
        f4817h = logger;
    }

    public C1333h(C2114h hVar, boolean z) {
        C1924k.m9142h(hVar, "source");
        this.f4821f = hVar;
        this.f4822g = z;
        C1335b bVar = new C1335b(hVar);
        this.f4819d = bVar;
        this.f4820e = new C1308d.C1309a(bVar, 4096, 0, 4, (C1920g) null);
    }

    /* renamed from: B */
    private final void m6341B(C1336c cVar, int i, int i2, int i3) {
        if (i != 5) {
            throw new IOException("TYPE_PRIORITY length: " + i + " != 5");
        } else if (i3 != 0) {
            m6352w(cVar, i3);
        } else {
            throw new IOException("TYPE_PRIORITY streamId == 0");
        }
    }

    /* renamed from: C */
    private final void m6342C(C1336c cVar, int i, int i2, int i3) {
        if (i3 != 0) {
            int b = (i2 & 8) != 0 ? C3423b.m15084b(this.f4821f.readByte(), 255) : 0;
            cVar.mo5205g(i3, this.f4821f.readInt() & Integer.MAX_VALUE, m6349k(f4818i.mo5219b(i - 4, i2, b), b, i2, i3));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }

    /* renamed from: D */
    private final void m6343D(C1336c cVar, int i, int i2, int i3) {
        if (i != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i + " != 4");
        } else if (i3 != 0) {
            int readInt = this.f4821f.readInt();
            C1304b a = C1304b.f4662t.mo5131a(readInt);
            if (a != null) {
                cVar.mo5209m(i3, a);
                return;
            }
            throw new IOException("TYPE_RST_STREAM unexpected error code: " + readInt);
        } else {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
    }

    /* renamed from: F */
    private final void m6344F(C1336c cVar, int i, int i2, int i3) {
        int readInt;
        if (i3 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        } else if ((i2 & 1) != 0) {
            if (i == 0) {
                cVar.mo5203d();
                return;
            }
            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
        } else if (i % 6 == 0) {
            C1349m mVar = new C1349m();
            C2324a h = C2331f.m10822h(C2331f.m10823i(0, i), 6);
            int s = h.mo8648s();
            int x = h.mo8650x();
            int y = h.mo8651y();
            if (y < 0 ? s >= x : s <= x) {
                while (true) {
                    int c = C3423b.m15085c(this.f4821f.readShort(), 65535);
                    readInt = this.f4821f.readInt();
                    if (c != 2) {
                        if (c == 3) {
                            c = 4;
                        } else if (c == 4) {
                            c = 7;
                            if (readInt < 0) {
                                throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                            }
                        } else if (c == 5 && (readInt < 16384 || readInt > 16777215)) {
                        }
                    } else if (!(readInt == 0 || readInt == 1)) {
                        throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                    }
                    mVar.mo5298h(c, readInt);
                    if (s == x) {
                        break;
                    }
                    s += y;
                }
                throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + readInt);
            }
            cVar.mo5207i(false, mVar);
        } else {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + i);
        }
    }

    /* renamed from: G */
    private final void m6345G(C1336c cVar, int i, int i2, int i3) {
        if (i == 4) {
            long d = C3423b.m15086d(this.f4821f.readInt(), 2147483647L);
            if (d != 0) {
                cVar.mo5204e(i3, d);
                return;
            }
            throw new IOException("windowSizeIncrement was 0");
        }
        throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i);
    }

    /* renamed from: h */
    private final void m6347h(C1336c cVar, int i, int i2, int i3) {
        if (i3 != 0) {
            int i4 = 0;
            boolean z = true;
            boolean z2 = (i2 & 1) != 0;
            if ((i2 & 32) == 0) {
                z = false;
            }
            if (!z) {
                if ((i2 & 8) != 0) {
                    i4 = C3423b.m15084b(this.f4821f.readByte(), 255);
                }
                cVar.mo5201a(z2, i3, this.f4821f, f4818i.mo5219b(i, i2, i4));
                this.f4821f.mo7963v((long) i4);
                return;
            }
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
    }

    /* renamed from: i */
    private final void m6348i(C1336c cVar, int i, int i2, int i3) {
        if (i < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i);
        } else if (i3 == 0) {
            int readInt = this.f4821f.readInt();
            int readInt2 = this.f4821f.readInt();
            int i4 = i - 8;
            C1304b a = C1304b.f4662t.mo5131a(readInt2);
            if (a != null) {
                C2115i iVar = C2115i.f7357g;
                if (i4 > 0) {
                    iVar = this.f4821f.mo7958t((long) i4);
                }
                cVar.mo5210o(readInt, a, iVar);
                return;
            }
            throw new IOException("TYPE_GOAWAY unexpected error code: " + readInt2);
        } else {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
    }

    /* renamed from: k */
    private final List<C1306c> m6349k(int i, int i2, int i3, int i4) {
        this.f4819d.mo5222h(i);
        C1335b bVar = this.f4819d;
        bVar.mo5223i(bVar.mo5220a());
        this.f4819d.mo5224k(i2);
        this.f4819d.mo5221f(i3);
        this.f4819d.mo5225n(i4);
        this.f4820e.mo5142k();
        return this.f4820e.mo5140e();
    }

    /* renamed from: n */
    private final void m6350n(C1336c cVar, int i, int i2, int i3) {
        if (i3 != 0) {
            int i4 = 0;
            boolean z = (i2 & 1) != 0;
            if ((i2 & 8) != 0) {
                i4 = C3423b.m15084b(this.f4821f.readByte(), 255);
            }
            if ((i2 & 32) != 0) {
                m6352w(cVar, i3);
                i -= 5;
            }
            cVar.mo5202b(z, i3, -1, m6349k(f4818i.mo5219b(i, i2, i4), i4, i2, i3));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }

    /* renamed from: s */
    private final void m6351s(C1336c cVar, int i, int i2, int i3) {
        if (i != 8) {
            throw new IOException("TYPE_PING length != 8: " + i);
        } else if (i3 == 0) {
            int readInt = this.f4821f.readInt();
            int readInt2 = this.f4821f.readInt();
            boolean z = true;
            if ((i2 & 1) == 0) {
                z = false;
            }
            cVar.mo5206h(z, readInt, readInt2);
        } else {
            throw new IOException("TYPE_PING streamId != 0");
        }
    }

    /* renamed from: w */
    private final void m6352w(C1336c cVar, int i) {
        int readInt = this.f4821f.readInt();
        cVar.mo5208j(i, readInt & Integer.MAX_VALUE, C3423b.m15084b(this.f4821f.readByte(), 255) + 1, (readInt & ((int) 2147483648L)) != 0);
    }

    /* renamed from: c */
    public final boolean mo5215c(boolean z, C1336c cVar) {
        C1924k.m9142h(cVar, "handler");
        try {
            this.f4821f.mo7906N(9);
            int G = C3423b.m15067G(this.f4821f);
            if (G <= 16384) {
                int b = C3423b.m15084b(this.f4821f.readByte(), 255);
                if (!z || b == 4) {
                    int b2 = C3423b.m15084b(this.f4821f.readByte(), 255);
                    int readInt = this.f4821f.readInt() & Integer.MAX_VALUE;
                    Logger logger = f4817h;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(C1311e.f4699e.mo5149b(true, readInt, G, b, b2));
                    }
                    switch (b) {
                        case 0:
                            m6347h(cVar, G, b2, readInt);
                            return true;
                        case 1:
                            m6350n(cVar, G, b2, readInt);
                            return true;
                        case 2:
                            m6341B(cVar, G, b2, readInt);
                            return true;
                        case 3:
                            m6343D(cVar, G, b2, readInt);
                            return true;
                        case 4:
                            m6344F(cVar, G, b2, readInt);
                            return true;
                        case 5:
                            m6342C(cVar, G, b2, readInt);
                            return true;
                        case 6:
                            m6351s(cVar, G, b2, readInt);
                            return true;
                        case 7:
                            m6348i(cVar, G, b2, readInt);
                            return true;
                        case 8:
                            m6345G(cVar, G, b2, readInt);
                            return true;
                        default:
                            this.f4821f.mo7963v((long) G);
                            return true;
                    }
                } else {
                    throw new IOException("Expected a SETTINGS frame but was " + b);
                }
            } else {
                throw new IOException("FRAME_SIZE_ERROR: " + G);
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public void close() {
        this.f4821f.close();
    }

    /* renamed from: f */
    public final void mo5217f(C1336c cVar) {
        C1924k.m9142h(cVar, "handler");
        if (!this.f4822g) {
            C2114h hVar = this.f4821f;
            C2115i iVar = C1311e.f4695a;
            C2115i t = hVar.mo7958t((long) iVar.mo7999u());
            Logger logger = f4817h;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C3423b.m15099q("<< CONNECTION " + t.mo7988k(), new Object[0]));
            }
            if (!C1924k.m9136b(iVar, t)) {
                throw new IOException("Expected a connection header but was " + t.mo8002x());
            }
        } else if (!mo5215c(true, cVar)) {
            throw new IOException("Required SETTINGS preface not received");
        }
    }
}
