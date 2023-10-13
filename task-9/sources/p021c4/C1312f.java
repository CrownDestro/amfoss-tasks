package p021c4;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p021c4.C1333h;
import p034e3.C1769a;
import p035e4.C1809h;
import p041f3.C1920g;
import p041f3.C1924k;
import p041f3.C1931r;
import p041f3.C1932s;
import p062i4.C2111f;
import p062i4.C2113g;
import p062i4.C2114h;
import p062i4.C2115i;
import p127t2.C3184p;
import p127t2.C3187s;
import p140v3.C3423b;
import p158y3.C3574a;
import p158y3.C3576c;
import p158y3.C3577d;
import p158y3.C3578e;

/* renamed from: c4.f */
public final class C1312f implements Closeable {
    /* access modifiers changed from: private */

    /* renamed from: F */
    public static final C1349m f4700F;

    /* renamed from: G */
    public static final C1315c f4701G = new C1315c((C1920g) null);
    /* access modifiers changed from: private */

    /* renamed from: A */
    public long f4702A;

    /* renamed from: B */
    private final Socket f4703B;

    /* renamed from: C */
    private final C1342j f4704C;

    /* renamed from: D */
    private final C1319e f4705D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public final Set<Integer> f4706E;

    /* renamed from: d */
    private final boolean f4707d;

    /* renamed from: e */
    private final C1316d f4708e;

    /* renamed from: f */
    private final Map<Integer, C1337i> f4709f = new LinkedHashMap();

    /* renamed from: g */
    private final String f4710g;

    /* renamed from: h */
    private int f4711h;

    /* renamed from: i */
    private int f4712i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f4713j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C3578e f4714k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C3577d f4715l;

    /* renamed from: m */
    private final C3577d f4716m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C3577d f4717n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C1346l f4718o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public long f4719p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public long f4720q;

    /* renamed from: r */
    private long f4721r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public long f4722s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public long f4723t;

    /* renamed from: u */
    private long f4724u;

    /* renamed from: v */
    private final C1349m f4725v;

    /* renamed from: w */
    private C1349m f4726w;

    /* renamed from: x */
    private long f4727x;

    /* renamed from: y */
    private long f4728y;

    /* renamed from: z */
    private long f4729z;

    /* renamed from: c4.f$a */
    public static final class C1313a extends C3574a {

        /* renamed from: e */
        final /* synthetic */ String f4730e;

        /* renamed from: f */
        final /* synthetic */ C1312f f4731f;

        /* renamed from: g */
        final /* synthetic */ long f4732g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1313a(String str, String str2, C1312f fVar, long j) {
            super(str2, false, 2, (C1920g) null);
            this.f4730e = str;
            this.f4731f = fVar;
            this.f4732g = j;
        }

        /* renamed from: f */
        public long mo5184f() {
            boolean z;
            synchronized (this.f4731f) {
                if (this.f4731f.f4720q < this.f4731f.f4719p) {
                    z = true;
                } else {
                    C1312f fVar = this.f4731f;
                    fVar.f4719p = fVar.f4719p + 1;
                    z = false;
                }
            }
            C1312f fVar2 = this.f4731f;
            if (z) {
                fVar2.m6245a0((IOException) null);
                return -1;
            }
            fVar2.mo5153E0(false, 1, 0);
            return this.f4732g;
        }
    }

    /* renamed from: c4.f$b */
    public static final class C1314b {

        /* renamed from: a */
        public Socket f4733a;

        /* renamed from: b */
        public String f4734b;

        /* renamed from: c */
        public C2114h f4735c;

        /* renamed from: d */
        public C2113g f4736d;

        /* renamed from: e */
        private C1316d f4737e = C1316d.f4742a;

        /* renamed from: f */
        private C1346l f4738f = C1346l.f4872a;

        /* renamed from: g */
        private int f4739g;

        /* renamed from: h */
        private boolean f4740h;

        /* renamed from: i */
        private final C3578e f4741i;

        public C1314b(boolean z, C3578e eVar) {
            C1924k.m9142h(eVar, "taskRunner");
            this.f4740h = z;
            this.f4741i = eVar;
        }

        /* renamed from: a */
        public final C1312f mo5185a() {
            return new C1312f(this);
        }

        /* renamed from: b */
        public final boolean mo5186b() {
            return this.f4740h;
        }

        /* renamed from: c */
        public final String mo5187c() {
            String str = this.f4734b;
            if (str == null) {
                C1924k.m9154t("connectionName");
            }
            return str;
        }

        /* renamed from: d */
        public final C1316d mo5188d() {
            return this.f4737e;
        }

        /* renamed from: e */
        public final int mo5189e() {
            return this.f4739g;
        }

        /* renamed from: f */
        public final C1346l mo5190f() {
            return this.f4738f;
        }

        /* renamed from: g */
        public final C2113g mo5191g() {
            C2113g gVar = this.f4736d;
            if (gVar == null) {
                C1924k.m9154t("sink");
            }
            return gVar;
        }

        /* renamed from: h */
        public final Socket mo5192h() {
            Socket socket = this.f4733a;
            if (socket == null) {
                C1924k.m9154t("socket");
            }
            return socket;
        }

        /* renamed from: i */
        public final C2114h mo5193i() {
            C2114h hVar = this.f4735c;
            if (hVar == null) {
                C1924k.m9154t("source");
            }
            return hVar;
        }

        /* renamed from: j */
        public final C3578e mo5194j() {
            return this.f4741i;
        }

        /* renamed from: k */
        public final C1314b mo5195k(C1316d dVar) {
            C1924k.m9142h(dVar, "listener");
            this.f4737e = dVar;
            return this;
        }

        /* renamed from: l */
        public final C1314b mo5196l(int i) {
            this.f4739g = i;
            return this;
        }

        /* renamed from: m */
        public final C1314b mo5197m(Socket socket, String str, C2114h hVar, C2113g gVar) {
            StringBuilder sb;
            C1924k.m9142h(socket, "socket");
            C1924k.m9142h(str, "peerName");
            C1924k.m9142h(hVar, "source");
            C1924k.m9142h(gVar, "sink");
            this.f4733a = socket;
            if (this.f4740h) {
                sb = new StringBuilder();
                sb.append(C3423b.f11240i);
                sb.append(' ');
            } else {
                sb = new StringBuilder();
                sb.append("MockWebServer ");
            }
            sb.append(str);
            this.f4734b = sb.toString();
            this.f4735c = hVar;
            this.f4736d = gVar;
            return this;
        }
    }

    /* renamed from: c4.f$c */
    public static final class C1315c {
        private C1315c() {
        }

        public /* synthetic */ C1315c(C1920g gVar) {
            this();
        }

        /* renamed from: a */
        public final C1349m mo5198a() {
            return C1312f.f4700F;
        }
    }

    /* renamed from: c4.f$d */
    public static abstract class C1316d {

        /* renamed from: a */
        public static final C1316d f4742a = new C1317a();

        /* renamed from: b */
        public static final C1318b f4743b = new C1318b((C1920g) null);

        /* renamed from: c4.f$d$a */
        public static final class C1317a extends C1316d {
            C1317a() {
            }

            /* renamed from: b */
            public void mo5200b(C1337i iVar) {
                C1924k.m9142h(iVar, "stream");
                iVar.mo5234d(C1304b.REFUSED_STREAM, (IOException) null);
            }
        }

        /* renamed from: c4.f$d$b */
        public static final class C1318b {
            private C1318b() {
            }

            public /* synthetic */ C1318b(C1920g gVar) {
                this();
            }
        }

        /* renamed from: a */
        public void mo5199a(C1312f fVar, C1349m mVar) {
            C1924k.m9142h(fVar, "connection");
            C1924k.m9142h(mVar, "settings");
        }

        /* renamed from: b */
        public abstract void mo5200b(C1337i iVar);
    }

    /* renamed from: c4.f$e */
    public final class C1319e implements C1333h.C1336c, C1769a<C3187s> {

        /* renamed from: d */
        private final C1333h f4744d;

        /* renamed from: e */
        final /* synthetic */ C1312f f4745e;

        /* renamed from: c4.f$e$a */
        public static final class C1320a extends C3574a {

            /* renamed from: e */
            final /* synthetic */ String f4746e;

            /* renamed from: f */
            final /* synthetic */ boolean f4747f;

            /* renamed from: g */
            final /* synthetic */ C1319e f4748g;

            /* renamed from: h */
            final /* synthetic */ boolean f4749h;

            /* renamed from: i */
            final /* synthetic */ C1932s f4750i;

            /* renamed from: j */
            final /* synthetic */ C1349m f4751j;

            /* renamed from: k */
            final /* synthetic */ C1931r f4752k;

            /* renamed from: l */
            final /* synthetic */ C1932s f4753l;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C1320a(String str, boolean z, String str2, boolean z2, C1319e eVar, boolean z3, C1932s sVar, C1349m mVar, C1931r rVar, C1932s sVar2) {
                super(str2, z2);
                this.f4746e = str;
                this.f4747f = z;
                this.f4748g = eVar;
                this.f4749h = z3;
                this.f4750i = sVar;
                this.f4751j = mVar;
                this.f4752k = rVar;
                this.f4753l = sVar2;
            }

            /* renamed from: f */
            public long mo5184f() {
                this.f4748g.f4745e.mo5162e0().mo5199a(this.f4748g.f4745e, (C1349m) this.f4750i.f6903d);
                return -1;
            }
        }

        /* renamed from: c4.f$e$b */
        public static final class C1321b extends C3574a {

            /* renamed from: e */
            final /* synthetic */ String f4754e;

            /* renamed from: f */
            final /* synthetic */ boolean f4755f;

            /* renamed from: g */
            final /* synthetic */ C1337i f4756g;

            /* renamed from: h */
            final /* synthetic */ C1319e f4757h;

            /* renamed from: i */
            final /* synthetic */ C1337i f4758i;

            /* renamed from: j */
            final /* synthetic */ int f4759j;

            /* renamed from: k */
            final /* synthetic */ List f4760k;

            /* renamed from: l */
            final /* synthetic */ boolean f4761l;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C1321b(String str, boolean z, String str2, boolean z2, C1337i iVar, C1319e eVar, C1337i iVar2, int i, List list, boolean z3) {
                super(str2, z2);
                this.f4754e = str;
                this.f4755f = z;
                this.f4756g = iVar;
                this.f4757h = eVar;
                this.f4758i = iVar2;
                this.f4759j = i;
                this.f4760k = list;
                this.f4761l = z3;
            }

            /* renamed from: f */
            public long mo5184f() {
                try {
                    this.f4757h.f4745e.mo5162e0().mo5200b(this.f4756g);
                    return -1;
                } catch (IOException e) {
                    C1809h g = C1809h.f6654c.mo7501g();
                    g.mo7497k("Http2Connection.Listener failure for " + this.f4757h.f4745e.mo5159c0(), 4, e);
                    try {
                        this.f4756g.mo5234d(C1304b.PROTOCOL_ERROR, e);
                        return -1;
                    } catch (IOException unused) {
                        return -1;
                    }
                }
            }
        }

        /* renamed from: c4.f$e$c */
        public static final class C1322c extends C3574a {

            /* renamed from: e */
            final /* synthetic */ String f4762e;

            /* renamed from: f */
            final /* synthetic */ boolean f4763f;

            /* renamed from: g */
            final /* synthetic */ C1319e f4764g;

            /* renamed from: h */
            final /* synthetic */ int f4765h;

            /* renamed from: i */
            final /* synthetic */ int f4766i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C1322c(String str, boolean z, String str2, boolean z2, C1319e eVar, int i, int i2) {
                super(str2, z2);
                this.f4762e = str;
                this.f4763f = z;
                this.f4764g = eVar;
                this.f4765h = i;
                this.f4766i = i2;
            }

            /* renamed from: f */
            public long mo5184f() {
                this.f4764g.f4745e.mo5153E0(true, this.f4765h, this.f4766i);
                return -1;
            }
        }

        /* renamed from: c4.f$e$d */
        public static final class C1323d extends C3574a {

            /* renamed from: e */
            final /* synthetic */ String f4767e;

            /* renamed from: f */
            final /* synthetic */ boolean f4768f;

            /* renamed from: g */
            final /* synthetic */ C1319e f4769g;

            /* renamed from: h */
            final /* synthetic */ boolean f4770h;

            /* renamed from: i */
            final /* synthetic */ C1349m f4771i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C1323d(String str, boolean z, String str2, boolean z2, C1319e eVar, boolean z3, C1349m mVar) {
                super(str2, z2);
                this.f4767e = str;
                this.f4768f = z;
                this.f4769g = eVar;
                this.f4770h = z3;
                this.f4771i = mVar;
            }

            /* renamed from: f */
            public long mo5184f() {
                this.f4769g.mo5211p(this.f4770h, this.f4771i);
                return -1;
            }
        }

        public C1319e(C1312f fVar, C1333h hVar) {
            C1924k.m9142h(hVar, "reader");
            this.f4745e = fVar;
            this.f4744d = hVar;
        }

        /* renamed from: a */
        public void mo5201a(boolean z, int i, C2114h hVar, int i2) {
            C1924k.m9142h(hVar, "source");
            if (this.f4745e.mo5177t0(i)) {
                this.f4745e.mo5173p0(i, hVar, i2, z);
                return;
            }
            C1337i i0 = this.f4745e.mo5167i0(i);
            if (i0 == null) {
                this.f4745e.mo5155G0(i, C1304b.PROTOCOL_ERROR);
                long j = (long) i2;
                this.f4745e.mo5150B0(j);
                hVar.mo7963v(j);
                return;
            }
            i0.mo5252w(hVar, i2);
            if (z) {
                i0.mo5253x(C3423b.f11233b, true);
            }
        }

        /* renamed from: b */
        public void mo5202b(boolean z, int i, int i2, List<C1306c> list) {
            boolean z2 = z;
            int i3 = i;
            List<C1306c> list2 = list;
            C1924k.m9142h(list2, "headerBlock");
            if (this.f4745e.mo5177t0(i3)) {
                this.f4745e.mo5174q0(i3, list2, z2);
                return;
            }
            synchronized (this.f4745e) {
                C1337i i0 = this.f4745e.mo5167i0(i3);
                if (i0 != null) {
                    C3187s sVar = C3187s.f10561a;
                    i0.mo5253x(C3423b.m15072L(list), z2);
                } else if (!this.f4745e.f4713j) {
                    if (i3 > this.f4745e.mo5161d0()) {
                        if (i3 % 2 != this.f4745e.mo5163f0() % 2) {
                            C1337i iVar = new C1337i(i, this.f4745e, false, z, C3423b.m15072L(list));
                            this.f4745e.mo5180w0(i3);
                            this.f4745e.mo5168j0().put(Integer.valueOf(i), iVar);
                            String str = this.f4745e.mo5159c0() + '[' + i3 + "] onStream";
                            this.f4745e.f4714k.mo11711i().mo11701i(new C1321b(str, true, str, true, iVar, this, i0, i, list, z), 0);
                        }
                    }
                }
            }
        }

        /* renamed from: c */
        public /* bridge */ /* synthetic */ Object mo3839c() {
            mo5212q();
            return C3187s.f10561a;
        }

        /* renamed from: d */
        public void mo5203d() {
        }

        /* renamed from: e */
        public void mo5204e(int i, long j) {
            Object obj;
            if (i == 0) {
                Object obj2 = this.f4745e;
                synchronized (obj2) {
                    C1312f fVar = this.f4745e;
                    fVar.f4702A = fVar.mo5169k0() + j;
                    C1312f fVar2 = this.f4745e;
                    if (fVar2 != null) {
                        fVar2.notifyAll();
                        C3187s sVar = C3187s.f10561a;
                        obj = obj2;
                    } else {
                        throw new C3184p("null cannot be cast to non-null type java.lang.Object");
                    }
                }
            } else {
                C1337i i0 = this.f4745e.mo5167i0(i);
                if (i0 != null) {
                    synchronized (i0) {
                        i0.mo5231a(j);
                        C3187s sVar2 = C3187s.f10561a;
                        obj = i0;
                    }
                } else {
                    return;
                }
            }
        }

        /* renamed from: g */
        public void mo5205g(int i, int i2, List<C1306c> list) {
            C1924k.m9142h(list, "requestHeaders");
            this.f4745e.mo5175r0(i2, list);
        }

        /* renamed from: h */
        public void mo5206h(boolean z, int i, int i2) {
            if (z) {
                synchronized (this.f4745e) {
                    if (i == 1) {
                        C1312f fVar = this.f4745e;
                        fVar.f4720q = fVar.f4720q + 1;
                    } else if (i != 2) {
                        if (i == 3) {
                            C1312f fVar2 = this.f4745e;
                            fVar2.f4723t = fVar2.f4723t + 1;
                            C1312f fVar3 = this.f4745e;
                            if (fVar3 != null) {
                                fVar3.notifyAll();
                            } else {
                                throw new C3184p("null cannot be cast to non-null type java.lang.Object");
                            }
                        }
                        C3187s sVar = C3187s.f10561a;
                    } else {
                        C1312f fVar4 = this.f4745e;
                        fVar4.f4722s = fVar4.f4722s + 1;
                    }
                }
                return;
            }
            String str = this.f4745e.mo5159c0() + " ping";
            this.f4745e.f4715l.mo11701i(new C1322c(str, true, str, true, this, i, i2), 0);
        }

        /* renamed from: i */
        public void mo5207i(boolean z, C1349m mVar) {
            C1924k.m9142h(mVar, "settings");
            String str = this.f4745e.mo5159c0() + " applyAndAckSettings";
            this.f4745e.f4715l.mo11701i(new C1323d(str, true, str, true, this, z, mVar), 0);
        }

        /* renamed from: j */
        public void mo5208j(int i, int i2, int i3, boolean z) {
        }

        /* renamed from: m */
        public void mo5209m(int i, C1304b bVar) {
            C1924k.m9142h(bVar, "errorCode");
            if (this.f4745e.mo5177t0(i)) {
                this.f4745e.mo5176s0(i, bVar);
                return;
            }
            C1337i u0 = this.f4745e.mo5178u0(i);
            if (u0 != null) {
                u0.mo5254y(bVar);
            }
        }

        /* renamed from: o */
        public void mo5210o(int i, C1304b bVar, C2115i iVar) {
            int i2;
            C1337i[] iVarArr;
            C1924k.m9142h(bVar, "errorCode");
            C1924k.m9142h(iVar, "debugData");
            iVar.mo7999u();
            synchronized (this.f4745e) {
                Object[] array = this.f4745e.mo5168j0().values().toArray(new C1337i[0]);
                if (array != null) {
                    iVarArr = (C1337i[]) array;
                    this.f4745e.f4713j = true;
                    C3187s sVar = C3187s.f10561a;
                } else {
                    throw new C3184p("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            for (C1337i iVar2 : iVarArr) {
                if (iVar2.mo5239j() > i && iVar2.mo5249t()) {
                    iVar2.mo5254y(C1304b.REFUSED_STREAM);
                    this.f4745e.mo5178u0(iVar2.mo5239j());
                }
            }
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
            java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
            	at java.base/java.util.Objects.checkIndex(Objects.java:372)
            	at java.base/java.util.ArrayList.get(ArrayList.java:458)
            	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        /* renamed from: p */
        public final void mo5211p(boolean r22, p021c4.C1349m r23) {
            /*
                r21 = this;
                r12 = r21
                r0 = r23
                java.lang.String r1 = "settings"
                p041f3.C1924k.m9142h(r0, r1)
                f3.r r13 = new f3.r
                r13.<init>()
                f3.s r14 = new f3.s
                r14.<init>()
                f3.s r15 = new f3.s
                r15.<init>()
                c4.f r1 = r12.f4745e
                c4.j r16 = r1.mo5170l0()
                monitor-enter(r16)
                c4.f r11 = r12.f4745e     // Catch:{ all -> 0x010d }
                monitor-enter(r11)     // Catch:{ all -> 0x010d }
                c4.f r1 = r12.f4745e     // Catch:{ all -> 0x0108 }
                c4.m r1 = r1.mo5166h0()     // Catch:{ all -> 0x0108 }
                if (r22 == 0) goto L_0x002d
                r15.f6903d = r0     // Catch:{ all -> 0x0108 }
                goto L_0x003a
            L_0x002d:
                c4.m r2 = new c4.m     // Catch:{ all -> 0x0108 }
                r2.<init>()     // Catch:{ all -> 0x0108 }
                r2.mo5297g(r1)     // Catch:{ all -> 0x0108 }
                r2.mo5297g(r0)     // Catch:{ all -> 0x0108 }
                r15.f6903d = r2     // Catch:{ all -> 0x0108 }
            L_0x003a:
                T r2 = r15.f6903d     // Catch:{ all -> 0x0108 }
                c4.m r2 = (p021c4.C1349m) r2     // Catch:{ all -> 0x0108 }
                int r2 = r2.mo5293c()     // Catch:{ all -> 0x0108 }
                long r2 = (long) r2     // Catch:{ all -> 0x0108 }
                int r1 = r1.mo5293c()     // Catch:{ all -> 0x0108 }
                long r4 = (long) r1     // Catch:{ all -> 0x0108 }
                long r2 = r2 - r4
                r13.f6902d = r2     // Catch:{ all -> 0x0108 }
                r10 = 0
                r8 = 0
                int r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                if (r1 == 0) goto L_0x007c
                c4.f r1 = r12.f4745e     // Catch:{ all -> 0x0108 }
                java.util.Map r1 = r1.mo5168j0()     // Catch:{ all -> 0x0108 }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0108 }
                if (r1 == 0) goto L_0x005f
                goto L_0x007c
            L_0x005f:
                c4.f r1 = r12.f4745e     // Catch:{ all -> 0x0108 }
                java.util.Map r1 = r1.mo5168j0()     // Catch:{ all -> 0x0108 }
                java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x0108 }
                c4.i[] r2 = new p021c4.C1337i[r10]     // Catch:{ all -> 0x0108 }
                java.lang.Object[] r1 = r1.toArray(r2)     // Catch:{ all -> 0x0108 }
                if (r1 == 0) goto L_0x0074
                c4.i[] r1 = (p021c4.C1337i[]) r1     // Catch:{ all -> 0x0108 }
                goto L_0x007d
            L_0x0074:
                t2.p r0 = new t2.p     // Catch:{ all -> 0x0108 }
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T>"
                r0.<init>(r1)     // Catch:{ all -> 0x0108 }
                throw r0     // Catch:{ all -> 0x0108 }
            L_0x007c:
                r1 = 0
            L_0x007d:
                r14.f6903d = r1     // Catch:{ all -> 0x0108 }
                c4.f r1 = r12.f4745e     // Catch:{ all -> 0x0108 }
                T r2 = r15.f6903d     // Catch:{ all -> 0x0108 }
                c4.m r2 = (p021c4.C1349m) r2     // Catch:{ all -> 0x0108 }
                r1.mo5181x0(r2)     // Catch:{ all -> 0x0108 }
                c4.f r1 = r12.f4745e     // Catch:{ all -> 0x0108 }
                y3.d r7 = r1.f4717n     // Catch:{ all -> 0x0108 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0108 }
                r1.<init>()     // Catch:{ all -> 0x0108 }
                c4.f r2 = r12.f4745e     // Catch:{ all -> 0x0108 }
                java.lang.String r2 = r2.mo5159c0()     // Catch:{ all -> 0x0108 }
                r1.append(r2)     // Catch:{ all -> 0x0108 }
                java.lang.String r2 = " onSettings"
                r1.append(r2)     // Catch:{ all -> 0x0108 }
                java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x0108 }
                r5 = 1
                c4.f$e$a r6 = new c4.f$e$a     // Catch:{ all -> 0x0108 }
                r1 = r6
                r2 = r4
                r3 = r5
                r17 = r6
                r6 = r21
                r18 = r7
                r7 = r22
                r8 = r15
                r9 = r23
                r19 = 0
                r10 = r13
                r20 = r11
                r11 = r14
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0106 }
                r1 = r17
                r0 = r18
                r2 = 0
                r0.mo11701i(r1, r2)     // Catch:{ all -> 0x0106 }
                t2.s r0 = p127t2.C3187s.f10561a     // Catch:{ all -> 0x0106 }
                monitor-exit(r20)     // Catch:{ all -> 0x010d }
                c4.f r0 = r12.f4745e     // Catch:{ IOException -> 0x00d9 }
                c4.j r0 = r0.mo5170l0()     // Catch:{ IOException -> 0x00d9 }
                T r1 = r15.f6903d     // Catch:{ IOException -> 0x00d9 }
                c4.m r1 = (p021c4.C1349m) r1     // Catch:{ IOException -> 0x00d9 }
                r0.mo5270a(r1)     // Catch:{ IOException -> 0x00d9 }
                goto L_0x00df
            L_0x00d9:
                r0 = move-exception
                c4.f r1 = r12.f4745e     // Catch:{ all -> 0x010d }
                r1.m6245a0(r0)     // Catch:{ all -> 0x010d }
            L_0x00df:
                t2.s r0 = p127t2.C3187s.f10561a     // Catch:{ all -> 0x010d }
                monitor-exit(r16)
                T r0 = r14.f6903d
                r1 = r0
                c4.i[] r1 = (p021c4.C1337i[]) r1
                if (r1 == 0) goto L_0x0105
                c4.i[] r0 = (p021c4.C1337i[]) r0
                if (r0 != 0) goto L_0x00f0
                p041f3.C1924k.m9150p()
            L_0x00f0:
                int r1 = r0.length
                r10 = 0
            L_0x00f2:
                if (r10 >= r1) goto L_0x0105
                r2 = r0[r10]
                monitor-enter(r2)
                long r3 = r13.f6902d     // Catch:{ all -> 0x0102 }
                r2.mo5231a(r3)     // Catch:{ all -> 0x0102 }
                t2.s r3 = p127t2.C3187s.f10561a     // Catch:{ all -> 0x0102 }
                monitor-exit(r2)
                int r10 = r10 + 1
                goto L_0x00f2
            L_0x0102:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L_0x0105:
                return
            L_0x0106:
                r0 = move-exception
                goto L_0x010b
            L_0x0108:
                r0 = move-exception
                r20 = r11
            L_0x010b:
                monitor-exit(r20)     // Catch:{ all -> 0x010d }
                throw r0     // Catch:{ all -> 0x010d }
            L_0x010d:
                r0 = move-exception
                monitor-exit(r16)
                goto L_0x0111
            L_0x0110:
                throw r0
            L_0x0111:
                goto L_0x0110
            */
            throw new UnsupportedOperationException("Method not decompiled: p021c4.C1312f.C1319e.mo5211p(boolean, c4.m):void");
        }

        /* renamed from: q */
        public void mo5212q() {
            C1304b bVar;
            C1304b bVar2 = C1304b.INTERNAL_ERROR;
            e = null;
            try {
                this.f4744d.mo5217f(this);
                while (this.f4744d.mo5215c(false, this)) {
                }
                bVar = C1304b.NO_ERROR;
                try {
                    this.f4745e.mo5157T(bVar, C1304b.CANCEL, (IOException) null);
                } catch (IOException e) {
                    e = e;
                    try {
                        C1304b bVar3 = C1304b.PROTOCOL_ERROR;
                        this.f4745e.mo5157T(bVar3, bVar3, e);
                        C3423b.m15092j(this.f4744d);
                    } catch (Throwable th) {
                        th = th;
                        this.f4745e.mo5157T(bVar, bVar2, e);
                        C3423b.m15092j(this.f4744d);
                        throw th;
                    }
                }
            } catch (IOException e2) {
                e = e2;
                bVar = bVar2;
                C1304b bVar32 = C1304b.PROTOCOL_ERROR;
                this.f4745e.mo5157T(bVar32, bVar32, e);
                C3423b.m15092j(this.f4744d);
            } catch (Throwable th2) {
                th = th2;
                bVar = bVar2;
                this.f4745e.mo5157T(bVar, bVar2, e);
                C3423b.m15092j(this.f4744d);
                throw th;
            }
            C3423b.m15092j(this.f4744d);
        }
    }

    /* renamed from: c4.f$f */
    public static final class C1324f extends C3574a {

        /* renamed from: e */
        final /* synthetic */ String f4772e;

        /* renamed from: f */
        final /* synthetic */ boolean f4773f;

        /* renamed from: g */
        final /* synthetic */ C1312f f4774g;

        /* renamed from: h */
        final /* synthetic */ int f4775h;

        /* renamed from: i */
        final /* synthetic */ C2111f f4776i;

        /* renamed from: j */
        final /* synthetic */ int f4777j;

        /* renamed from: k */
        final /* synthetic */ boolean f4778k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1324f(String str, boolean z, String str2, boolean z2, C1312f fVar, int i, C2111f fVar2, int i2, boolean z3) {
            super(str2, z2);
            this.f4772e = str;
            this.f4773f = z;
            this.f4774g = fVar;
            this.f4775h = i;
            this.f4776i = fVar2;
            this.f4777j = i2;
            this.f4778k = z3;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            return -1;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo5184f() {
            /*
                r5 = this;
                c4.f r0 = r5.f4774g     // Catch:{ IOException -> 0x003e }
                c4.l r0 = r0.f4718o     // Catch:{ IOException -> 0x003e }
                int r1 = r5.f4775h     // Catch:{ IOException -> 0x003e }
                i4.f r2 = r5.f4776i     // Catch:{ IOException -> 0x003e }
                int r3 = r5.f4777j     // Catch:{ IOException -> 0x003e }
                boolean r4 = r5.f4778k     // Catch:{ IOException -> 0x003e }
                boolean r0 = r0.mo5289c(r1, r2, r3, r4)     // Catch:{ IOException -> 0x003e }
                if (r0 == 0) goto L_0x0021
                c4.f r1 = r5.f4774g     // Catch:{ IOException -> 0x003e }
                c4.j r1 = r1.mo5170l0()     // Catch:{ IOException -> 0x003e }
                int r2 = r5.f4775h     // Catch:{ IOException -> 0x003e }
                c4.b r3 = p021c4.C1304b.CANCEL     // Catch:{ IOException -> 0x003e }
                r1.mo5267C(r2, r3)     // Catch:{ IOException -> 0x003e }
            L_0x0021:
                if (r0 != 0) goto L_0x0027
                boolean r0 = r5.f4778k     // Catch:{ IOException -> 0x003e }
                if (r0 == 0) goto L_0x003e
            L_0x0027:
                c4.f r0 = r5.f4774g     // Catch:{ IOException -> 0x003e }
                monitor-enter(r0)     // Catch:{ IOException -> 0x003e }
                c4.f r1 = r5.f4774g     // Catch:{ all -> 0x003b }
                java.util.Set r1 = r1.f4706E     // Catch:{ all -> 0x003b }
                int r2 = r5.f4775h     // Catch:{ all -> 0x003b }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x003b }
                r1.remove(r2)     // Catch:{ all -> 0x003b }
                monitor-exit(r0)     // Catch:{ IOException -> 0x003e }
                goto L_0x003e
            L_0x003b:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ IOException -> 0x003e }
                throw r1     // Catch:{ IOException -> 0x003e }
            L_0x003e:
                r0 = -1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p021c4.C1312f.C1324f.mo5184f():long");
        }
    }

    /* renamed from: c4.f$g */
    public static final class C1325g extends C3574a {

        /* renamed from: e */
        final /* synthetic */ String f4779e;

        /* renamed from: f */
        final /* synthetic */ boolean f4780f;

        /* renamed from: g */
        final /* synthetic */ C1312f f4781g;

        /* renamed from: h */
        final /* synthetic */ int f4782h;

        /* renamed from: i */
        final /* synthetic */ List f4783i;

        /* renamed from: j */
        final /* synthetic */ boolean f4784j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1325g(String str, boolean z, String str2, boolean z2, C1312f fVar, int i, List list, boolean z3) {
            super(str2, z2);
            this.f4779e = str;
            this.f4780f = z;
            this.f4781g = fVar;
            this.f4782h = i;
            this.f4783i = list;
            this.f4784j = z3;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            return -1;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo5184f() {
            /*
                r4 = this;
                c4.f r0 = r4.f4781g
                c4.l r0 = r0.f4718o
                int r1 = r4.f4782h
                java.util.List r2 = r4.f4783i
                boolean r3 = r4.f4784j
                boolean r0 = r0.mo5288b(r1, r2, r3)
                if (r0 == 0) goto L_0x001f
                c4.f r1 = r4.f4781g     // Catch:{ IOException -> 0x003c }
                c4.j r1 = r1.mo5170l0()     // Catch:{ IOException -> 0x003c }
                int r2 = r4.f4782h     // Catch:{ IOException -> 0x003c }
                c4.b r3 = p021c4.C1304b.CANCEL     // Catch:{ IOException -> 0x003c }
                r1.mo5267C(r2, r3)     // Catch:{ IOException -> 0x003c }
            L_0x001f:
                if (r0 != 0) goto L_0x0025
                boolean r0 = r4.f4784j     // Catch:{ IOException -> 0x003c }
                if (r0 == 0) goto L_0x003c
            L_0x0025:
                c4.f r0 = r4.f4781g     // Catch:{ IOException -> 0x003c }
                monitor-enter(r0)     // Catch:{ IOException -> 0x003c }
                c4.f r1 = r4.f4781g     // Catch:{ all -> 0x0039 }
                java.util.Set r1 = r1.f4706E     // Catch:{ all -> 0x0039 }
                int r2 = r4.f4782h     // Catch:{ all -> 0x0039 }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0039 }
                r1.remove(r2)     // Catch:{ all -> 0x0039 }
                monitor-exit(r0)     // Catch:{ IOException -> 0x003c }
                goto L_0x003c
            L_0x0039:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ IOException -> 0x003c }
                throw r1     // Catch:{ IOException -> 0x003c }
            L_0x003c:
                r0 = -1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p021c4.C1312f.C1325g.mo5184f():long");
        }
    }

    /* renamed from: c4.f$h */
    public static final class C1326h extends C3574a {

        /* renamed from: e */
        final /* synthetic */ String f4785e;

        /* renamed from: f */
        final /* synthetic */ boolean f4786f;

        /* renamed from: g */
        final /* synthetic */ C1312f f4787g;

        /* renamed from: h */
        final /* synthetic */ int f4788h;

        /* renamed from: i */
        final /* synthetic */ List f4789i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1326h(String str, boolean z, String str2, boolean z2, C1312f fVar, int i, List list) {
            super(str2, z2);
            this.f4785e = str;
            this.f4786f = z;
            this.f4787g = fVar;
            this.f4788h = i;
            this.f4789i = list;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            return -1;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo5184f() {
            /*
                r3 = this;
                c4.f r0 = r3.f4787g
                c4.l r0 = r0.f4718o
                int r1 = r3.f4788h
                java.util.List r2 = r3.f4789i
                boolean r0 = r0.mo5287a(r1, r2)
                if (r0 == 0) goto L_0x0034
                c4.f r0 = r3.f4787g     // Catch:{ IOException -> 0x0034 }
                c4.j r0 = r0.mo5170l0()     // Catch:{ IOException -> 0x0034 }
                int r1 = r3.f4788h     // Catch:{ IOException -> 0x0034 }
                c4.b r2 = p021c4.C1304b.CANCEL     // Catch:{ IOException -> 0x0034 }
                r0.mo5267C(r1, r2)     // Catch:{ IOException -> 0x0034 }
                c4.f r0 = r3.f4787g     // Catch:{ IOException -> 0x0034 }
                monitor-enter(r0)     // Catch:{ IOException -> 0x0034 }
                c4.f r1 = r3.f4787g     // Catch:{ all -> 0x0031 }
                java.util.Set r1 = r1.f4706E     // Catch:{ all -> 0x0031 }
                int r2 = r3.f4788h     // Catch:{ all -> 0x0031 }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0031 }
                r1.remove(r2)     // Catch:{ all -> 0x0031 }
                monitor-exit(r0)     // Catch:{ IOException -> 0x0034 }
                goto L_0x0034
            L_0x0031:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ IOException -> 0x0034 }
                throw r1     // Catch:{ IOException -> 0x0034 }
            L_0x0034:
                r0 = -1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p021c4.C1312f.C1326h.mo5184f():long");
        }
    }

    /* renamed from: c4.f$i */
    public static final class C1327i extends C3574a {

        /* renamed from: e */
        final /* synthetic */ String f4790e;

        /* renamed from: f */
        final /* synthetic */ boolean f4791f;

        /* renamed from: g */
        final /* synthetic */ C1312f f4792g;

        /* renamed from: h */
        final /* synthetic */ int f4793h;

        /* renamed from: i */
        final /* synthetic */ C1304b f4794i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1327i(String str, boolean z, String str2, boolean z2, C1312f fVar, int i, C1304b bVar) {
            super(str2, z2);
            this.f4790e = str;
            this.f4791f = z;
            this.f4792g = fVar;
            this.f4793h = i;
            this.f4794i = bVar;
        }

        /* renamed from: f */
        public long mo5184f() {
            this.f4792g.f4718o.mo5290d(this.f4793h, this.f4794i);
            synchronized (this.f4792g) {
                this.f4792g.f4706E.remove(Integer.valueOf(this.f4793h));
            }
            return -1;
        }
    }

    /* renamed from: c4.f$j */
    public static final class C1328j extends C3574a {

        /* renamed from: e */
        final /* synthetic */ String f4795e;

        /* renamed from: f */
        final /* synthetic */ boolean f4796f;

        /* renamed from: g */
        final /* synthetic */ C1312f f4797g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1328j(String str, boolean z, String str2, boolean z2, C1312f fVar) {
            super(str2, z2);
            this.f4795e = str;
            this.f4796f = z;
            this.f4797g = fVar;
        }

        /* renamed from: f */
        public long mo5184f() {
            this.f4797g.mo5153E0(false, 2, 0);
            return -1;
        }
    }

    /* renamed from: c4.f$k */
    public static final class C1329k extends C3574a {

        /* renamed from: e */
        final /* synthetic */ String f4798e;

        /* renamed from: f */
        final /* synthetic */ boolean f4799f;

        /* renamed from: g */
        final /* synthetic */ C1312f f4800g;

        /* renamed from: h */
        final /* synthetic */ int f4801h;

        /* renamed from: i */
        final /* synthetic */ C1304b f4802i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1329k(String str, boolean z, String str2, boolean z2, C1312f fVar, int i, C1304b bVar) {
            super(str2, z2);
            this.f4798e = str;
            this.f4799f = z;
            this.f4800g = fVar;
            this.f4801h = i;
            this.f4802i = bVar;
        }

        /* renamed from: f */
        public long mo5184f() {
            try {
                this.f4800g.mo5154F0(this.f4801h, this.f4802i);
                return -1;
            } catch (IOException e) {
                this.f4800g.m6245a0(e);
                return -1;
            }
        }
    }

    /* renamed from: c4.f$l */
    public static final class C1330l extends C3574a {

        /* renamed from: e */
        final /* synthetic */ String f4803e;

        /* renamed from: f */
        final /* synthetic */ boolean f4804f;

        /* renamed from: g */
        final /* synthetic */ C1312f f4805g;

        /* renamed from: h */
        final /* synthetic */ int f4806h;

        /* renamed from: i */
        final /* synthetic */ long f4807i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1330l(String str, boolean z, String str2, boolean z2, C1312f fVar, int i, long j) {
            super(str2, z2);
            this.f4803e = str;
            this.f4804f = z;
            this.f4805g = fVar;
            this.f4806h = i;
            this.f4807i = j;
        }

        /* renamed from: f */
        public long mo5184f() {
            try {
                this.f4805g.mo5170l0().mo5269F(this.f4806h, this.f4807i);
                return -1;
            } catch (IOException e) {
                this.f4805g.m6245a0(e);
                return -1;
            }
        }
    }

    static {
        C1349m mVar = new C1349m();
        mVar.mo5298h(7, 65535);
        mVar.mo5298h(5, 16384);
        f4700F = mVar;
    }

    public C1312f(C1314b bVar) {
        C1924k.m9142h(bVar, "builder");
        boolean b = bVar.mo5186b();
        this.f4707d = b;
        this.f4708e = bVar.mo5188d();
        String c = bVar.mo5187c();
        this.f4710g = c;
        this.f4712i = bVar.mo5186b() ? 3 : 2;
        C3578e j = bVar.mo5194j();
        this.f4714k = j;
        C3577d i = j.mo11711i();
        this.f4715l = i;
        this.f4716m = j.mo11711i();
        this.f4717n = j.mo11711i();
        this.f4718o = bVar.mo5190f();
        C1349m mVar = new C1349m();
        if (bVar.mo5186b()) {
            mVar.mo5298h(7, 16777216);
        }
        this.f4725v = mVar;
        C1349m mVar2 = f4700F;
        this.f4726w = mVar2;
        this.f4702A = (long) mVar2.mo5293c();
        this.f4703B = bVar.mo5192h();
        this.f4704C = new C1342j(bVar.mo5191g(), b);
        this.f4705D = new C1319e(this, new C1333h(bVar.mo5193i(), b));
        this.f4706E = new LinkedHashSet();
        if (bVar.mo5189e() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos((long) bVar.mo5189e());
            String str = c + " ping";
            i.mo11701i(new C1313a(str, str, this, nanos), nanos);
        }
    }

    /* renamed from: A0 */
    public static /* synthetic */ void m6234A0(C1312f fVar, boolean z, C3578e eVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            eVar = C3578e.f11605h;
        }
        fVar.mo5183z0(z, eVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public final void m6245a0(IOException iOException) {
        C1304b bVar = C1304b.PROTOCOL_ERROR;
        mo5157T(bVar, bVar, iOException);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0048  */
    /* renamed from: n0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p021c4.C1337i m6252n0(int r11, java.util.List<p021c4.C1306c> r12, boolean r13) {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            c4.j r7 = r10.f4704C
            monitor-enter(r7)
            monitor-enter(r10)     // Catch:{ all -> 0x0084 }
            int r0 = r10.f4712i     // Catch:{ all -> 0x0081 }
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L_0x0013
            c4.b r0 = p021c4.C1304b.REFUSED_STREAM     // Catch:{ all -> 0x0081 }
            r10.mo5182y0(r0)     // Catch:{ all -> 0x0081 }
        L_0x0013:
            boolean r0 = r10.f4713j     // Catch:{ all -> 0x0081 }
            if (r0 != 0) goto L_0x007b
            int r8 = r10.f4712i     // Catch:{ all -> 0x0081 }
            int r0 = r8 + 2
            r10.f4712i = r0     // Catch:{ all -> 0x0081 }
            c4.i r9 = new c4.i     // Catch:{ all -> 0x0081 }
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0081 }
            r0 = 1
            if (r13 == 0) goto L_0x0041
            long r1 = r10.f4729z     // Catch:{ all -> 0x0081 }
            long r3 = r10.f4702A     // Catch:{ all -> 0x0081 }
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 >= 0) goto L_0x0041
            long r1 = r9.mo5247r()     // Catch:{ all -> 0x0081 }
            long r3 = r9.mo5246q()     // Catch:{ all -> 0x0081 }
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 < 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r13 = 0
            goto L_0x0042
        L_0x0041:
            r13 = 1
        L_0x0042:
            boolean r1 = r9.mo5250u()     // Catch:{ all -> 0x0081 }
            if (r1 == 0) goto L_0x0051
            java.util.Map<java.lang.Integer, c4.i> r1 = r10.f4709f     // Catch:{ all -> 0x0081 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0081 }
            r1.put(r2, r9)     // Catch:{ all -> 0x0081 }
        L_0x0051:
            t2.s r1 = p127t2.C3187s.f10561a     // Catch:{ all -> 0x0081 }
            monitor-exit(r10)     // Catch:{ all -> 0x0084 }
            if (r11 != 0) goto L_0x005c
            c4.j r11 = r10.f4704C     // Catch:{ all -> 0x0084 }
            r11.mo5278n(r6, r8, r12)     // Catch:{ all -> 0x0084 }
            goto L_0x0066
        L_0x005c:
            boolean r1 = r10.f4707d     // Catch:{ all -> 0x0084 }
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x006f
            c4.j r0 = r10.f4704C     // Catch:{ all -> 0x0084 }
            r0.mo5266B(r11, r8, r12)     // Catch:{ all -> 0x0084 }
        L_0x0066:
            monitor-exit(r7)
            if (r13 == 0) goto L_0x006e
            c4.j r11 = r10.f4704C
            r11.flush()
        L_0x006e:
            return r9
        L_0x006f:
            java.lang.String r11 = "client streams shouldn't have associated stream IDs"
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0084 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0084 }
            r12.<init>(r11)     // Catch:{ all -> 0x0084 }
            throw r12     // Catch:{ all -> 0x0084 }
        L_0x007b:
            c4.a r11 = new c4.a     // Catch:{ all -> 0x0081 }
            r11.<init>()     // Catch:{ all -> 0x0081 }
            throw r11     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0084 }
            throw r11     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p021c4.C1312f.m6252n0(int, java.util.List, boolean):c4.i");
    }

    /* renamed from: B0 */
    public final synchronized void mo5150B0(long j) {
        long j2 = this.f4727x + j;
        this.f4727x = j2;
        long j3 = j2 - this.f4728y;
        if (j3 >= ((long) (this.f4725v.mo5293c() / 2))) {
            mo5156H0(0, j3);
            this.f4728y += j3;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:28|29|30) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r5 = (int) java.lang.Math.min(r13, r6 - r4);
        r3.f6901d = r5;
        r4 = java.lang.Math.min(r5, r9.f4704C.mo5279s());
        r3.f6901d = r4;
        r9.f4729z += (long) r4;
        r3 = p127t2.C3187s.f10561a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0073, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0067 */
    /* renamed from: C0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5151C0(int r10, boolean r11, p062i4.C2111f r12, long r13) {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            int r3 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x000d
            c4.j r13 = r9.f4704C
            r13.mo5273f(r11, r10, r12, r0)
            return
        L_0x000d:
            int r3 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0076
            f3.q r3 = new f3.q
            r3.<init>()
            monitor-enter(r9)
        L_0x0017:
            long r4 = r9.f4729z     // Catch:{ InterruptedException -> 0x0067 }
            long r6 = r9.f4702A     // Catch:{ InterruptedException -> 0x0067 }
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x0037
            java.util.Map<java.lang.Integer, c4.i> r4 = r9.f4709f     // Catch:{ InterruptedException -> 0x0067 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)     // Catch:{ InterruptedException -> 0x0067 }
            boolean r4 = r4.containsKey(r5)     // Catch:{ InterruptedException -> 0x0067 }
            if (r4 == 0) goto L_0x002f
            r9.wait()     // Catch:{ InterruptedException -> 0x0067 }
            goto L_0x0017
        L_0x002f:
            java.io.IOException r10 = new java.io.IOException     // Catch:{ InterruptedException -> 0x0067 }
            java.lang.String r11 = "stream closed"
            r10.<init>(r11)     // Catch:{ InterruptedException -> 0x0067 }
            throw r10     // Catch:{ InterruptedException -> 0x0067 }
        L_0x0037:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r13, r6)     // Catch:{ all -> 0x0065 }
            int r5 = (int) r4     // Catch:{ all -> 0x0065 }
            r3.f6901d = r5     // Catch:{ all -> 0x0065 }
            c4.j r4 = r9.f4704C     // Catch:{ all -> 0x0065 }
            int r4 = r4.mo5279s()     // Catch:{ all -> 0x0065 }
            int r4 = java.lang.Math.min(r5, r4)     // Catch:{ all -> 0x0065 }
            r3.f6901d = r4     // Catch:{ all -> 0x0065 }
            long r5 = r9.f4729z     // Catch:{ all -> 0x0065 }
            long r7 = (long) r4     // Catch:{ all -> 0x0065 }
            long r5 = r5 + r7
            r9.f4729z = r5     // Catch:{ all -> 0x0065 }
            t2.s r3 = p127t2.C3187s.f10561a     // Catch:{ all -> 0x0065 }
            monitor-exit(r9)
            long r5 = (long) r4
            long r13 = r13 - r5
            c4.j r3 = r9.f4704C
            if (r11 == 0) goto L_0x0060
            int r5 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x0060
            r5 = 1
            goto L_0x0061
        L_0x0060:
            r5 = 0
        L_0x0061:
            r3.mo5273f(r5, r10, r12, r4)
            goto L_0x000d
        L_0x0065:
            r10 = move-exception
            goto L_0x0074
        L_0x0067:
            java.lang.Thread r10 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0065 }
            r10.interrupt()     // Catch:{ all -> 0x0065 }
            java.io.InterruptedIOException r10 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0065 }
            r10.<init>()     // Catch:{ all -> 0x0065 }
            throw r10     // Catch:{ all -> 0x0065 }
        L_0x0074:
            monitor-exit(r9)
            throw r10
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p021c4.C1312f.mo5151C0(int, boolean, i4.f, long):void");
    }

    /* renamed from: D0 */
    public final void mo5152D0(int i, boolean z, List<C1306c> list) {
        C1924k.m9142h(list, "alternating");
        this.f4704C.mo5278n(z, i, list);
    }

    /* renamed from: E0 */
    public final void mo5153E0(boolean z, int i, int i2) {
        try {
            this.f4704C.mo5280w(z, i, i2);
        } catch (IOException e) {
            m6245a0(e);
        }
    }

    /* renamed from: F0 */
    public final void mo5154F0(int i, C1304b bVar) {
        C1924k.m9142h(bVar, "statusCode");
        this.f4704C.mo5267C(i, bVar);
    }

    /* renamed from: G0 */
    public final void mo5155G0(int i, C1304b bVar) {
        C1924k.m9142h(bVar, "errorCode");
        String str = this.f4710g + '[' + i + "] writeSynReset";
        this.f4715l.mo11701i(new C1329k(str, true, str, true, this, i, bVar), 0);
    }

    /* renamed from: H0 */
    public final void mo5156H0(int i, long j) {
        String str = this.f4710g + '[' + i + "] windowUpdate";
        this.f4715l.mo11701i(new C1330l(str, true, str, true, this, i, j), 0);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:6|7|8|45|(2:22|(5:24|25|26|39|27))|29|30|31|32|33|35) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0084 */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5157T(p021c4.C1304b r4, p021c4.C1304b r5, java.io.IOException r6) {
        /*
            r3 = this;
            java.lang.String r0 = "connectionCode"
            p041f3.C1924k.m9142h(r4, r0)
            java.lang.String r0 = "streamCode"
            p041f3.C1924k.m9142h(r5, r0)
            boolean r0 = p140v3.C3423b.f11239h
            if (r0 == 0) goto L_0x0041
            boolean r0 = java.lang.Thread.holdsLock(r3)
            if (r0 != 0) goto L_0x0015
            goto L_0x0041
        L_0x0015:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Thread "
            r5.append(r6)
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r0 = "Thread.currentThread()"
            p041f3.C1924k.m9137c(r6, r0)
            java.lang.String r6 = r6.getName()
            r5.append(r6)
            java.lang.String r6 = " MUST NOT hold lock on "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L_0x0041:
            r3.mo5182y0(r4)     // Catch:{ IOException -> 0x0044 }
        L_0x0044:
            r4 = 0
            monitor-enter(r3)
            java.util.Map<java.lang.Integer, c4.i> r0 = r3.f4709f     // Catch:{ all -> 0x0099 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0099 }
            r0 = r0 ^ 1
            r1 = 0
            if (r0 == 0) goto L_0x006f
            java.util.Map<java.lang.Integer, c4.i> r4 = r3.f4709f     // Catch:{ all -> 0x0099 }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x0099 }
            c4.i[] r0 = new p021c4.C1337i[r1]     // Catch:{ all -> 0x0099 }
            java.lang.Object[] r4 = r4.toArray(r0)     // Catch:{ all -> 0x0099 }
            if (r4 == 0) goto L_0x0067
            c4.i[] r4 = (p021c4.C1337i[]) r4     // Catch:{ all -> 0x0099 }
            java.util.Map<java.lang.Integer, c4.i> r0 = r3.f4709f     // Catch:{ all -> 0x0099 }
            r0.clear()     // Catch:{ all -> 0x0099 }
            goto L_0x006f
        L_0x0067:
            t2.p r4 = new t2.p     // Catch:{ all -> 0x0099 }
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T>"
            r4.<init>(r5)     // Catch:{ all -> 0x0099 }
            throw r4     // Catch:{ all -> 0x0099 }
        L_0x006f:
            t2.s r0 = p127t2.C3187s.f10561a     // Catch:{ all -> 0x0099 }
            monitor-exit(r3)
            if (r4 == 0) goto L_0x007f
            int r0 = r4.length
        L_0x0075:
            if (r1 >= r0) goto L_0x007f
            r2 = r4[r1]
            r2.mo5234d(r5, r6)     // Catch:{ IOException -> 0x007c }
        L_0x007c:
            int r1 = r1 + 1
            goto L_0x0075
        L_0x007f:
            c4.j r4 = r3.f4704C     // Catch:{ IOException -> 0x0084 }
            r4.close()     // Catch:{ IOException -> 0x0084 }
        L_0x0084:
            java.net.Socket r4 = r3.f4703B     // Catch:{ IOException -> 0x0089 }
            r4.close()     // Catch:{ IOException -> 0x0089 }
        L_0x0089:
            y3.d r4 = r3.f4715l
            r4.mo11705n()
            y3.d r4 = r3.f4716m
            r4.mo11705n()
            y3.d r4 = r3.f4717n
            r4.mo11705n()
            return
        L_0x0099:
            r4 = move-exception
            monitor-exit(r3)
            goto L_0x009d
        L_0x009c:
            throw r4
        L_0x009d:
            goto L_0x009c
        */
        throw new UnsupportedOperationException("Method not decompiled: p021c4.C1312f.mo5157T(c4.b, c4.b, java.io.IOException):void");
    }

    /* renamed from: b0 */
    public final boolean mo5158b0() {
        return this.f4707d;
    }

    /* renamed from: c0 */
    public final String mo5159c0() {
        return this.f4710g;
    }

    public void close() {
        mo5157T(C1304b.NO_ERROR, C1304b.CANCEL, (IOException) null);
    }

    /* renamed from: d0 */
    public final int mo5161d0() {
        return this.f4711h;
    }

    /* renamed from: e0 */
    public final C1316d mo5162e0() {
        return this.f4708e;
    }

    /* renamed from: f0 */
    public final int mo5163f0() {
        return this.f4712i;
    }

    public final void flush() {
        this.f4704C.flush();
    }

    /* renamed from: g0 */
    public final C1349m mo5165g0() {
        return this.f4725v;
    }

    /* renamed from: h0 */
    public final C1349m mo5166h0() {
        return this.f4726w;
    }

    /* renamed from: i0 */
    public final synchronized C1337i mo5167i0(int i) {
        return this.f4709f.get(Integer.valueOf(i));
    }

    /* renamed from: j0 */
    public final Map<Integer, C1337i> mo5168j0() {
        return this.f4709f;
    }

    /* renamed from: k0 */
    public final long mo5169k0() {
        return this.f4702A;
    }

    /* renamed from: l0 */
    public final C1342j mo5170l0() {
        return this.f4704C;
    }

    /* renamed from: m0 */
    public final synchronized boolean mo5171m0(long j) {
        if (this.f4713j) {
            return false;
        }
        return this.f4722s >= this.f4721r || j < this.f4724u;
    }

    /* renamed from: o0 */
    public final C1337i mo5172o0(List<C1306c> list, boolean z) {
        C1924k.m9142h(list, "requestHeaders");
        return m6252n0(0, list, z);
    }

    /* renamed from: p0 */
    public final void mo5173p0(int i, C2114h hVar, int i2, boolean z) {
        C1924k.m9142h(hVar, "source");
        C2111f fVar = new C2111f();
        long j = (long) i2;
        hVar.mo7906N(j);
        hVar.mo5087M(fVar, j);
        String str = this.f4710g + '[' + i + "] onData";
        this.f4716m.mo11701i(new C1324f(str, true, str, true, this, i, fVar, i2, z), 0);
    }

    /* renamed from: q0 */
    public final void mo5174q0(int i, List<C1306c> list, boolean z) {
        C1924k.m9142h(list, "requestHeaders");
        String str = this.f4710g + '[' + i + "] onHeaders";
        this.f4716m.mo11701i(new C1325g(str, true, str, true, this, i, list, z), 0);
    }

    /* renamed from: r0 */
    public final void mo5175r0(int i, List<C1306c> list) {
        C1924k.m9142h(list, "requestHeaders");
        synchronized (this) {
            if (this.f4706E.contains(Integer.valueOf(i))) {
                mo5155G0(i, C1304b.PROTOCOL_ERROR);
                return;
            }
            this.f4706E.add(Integer.valueOf(i));
            String str = this.f4710g + '[' + i + "] onRequest";
            this.f4716m.mo11701i(new C1326h(str, true, str, true, this, i, list), 0);
        }
    }

    /* renamed from: s0 */
    public final void mo5176s0(int i, C1304b bVar) {
        C1924k.m9142h(bVar, "errorCode");
        String str = this.f4710g + '[' + i + "] onReset";
        this.f4716m.mo11701i(new C1327i(str, true, str, true, this, i, bVar), 0);
    }

    /* renamed from: t0 */
    public final boolean mo5177t0(int i) {
        return i != 0 && (i & 1) == 0;
    }

    /* renamed from: u0 */
    public final synchronized C1337i mo5178u0(int i) {
        C1337i remove;
        remove = this.f4709f.remove(Integer.valueOf(i));
        notifyAll();
        return remove;
    }

    /* renamed from: v0 */
    public final void mo5179v0() {
        synchronized (this) {
            long j = this.f4722s;
            long j2 = this.f4721r;
            if (j >= j2) {
                this.f4721r = j2 + 1;
                this.f4724u = System.nanoTime() + ((long) 1000000000);
                C3187s sVar = C3187s.f10561a;
                String str = this.f4710g + " ping";
                this.f4715l.mo11701i(new C1328j(str, true, str, true, this), 0);
            }
        }
    }

    /* renamed from: w0 */
    public final void mo5180w0(int i) {
        this.f4711h = i;
    }

    /* renamed from: x0 */
    public final void mo5181x0(C1349m mVar) {
        C1924k.m9142h(mVar, "<set-?>");
        this.f4726w = mVar;
    }

    /* renamed from: y0 */
    public final void mo5182y0(C1304b bVar) {
        C1924k.m9142h(bVar, "statusCode");
        synchronized (this.f4704C) {
            synchronized (this) {
                if (!this.f4713j) {
                    this.f4713j = true;
                    int i = this.f4711h;
                    C3187s sVar = C3187s.f10561a;
                    this.f4704C.mo5277k(i, bVar, C3423b.f11232a);
                }
            }
        }
    }

    /* renamed from: z0 */
    public final void mo5183z0(boolean z, C3578e eVar) {
        C1924k.m9142h(eVar, "taskRunner");
        if (z) {
            this.f4704C.mo5271c();
            this.f4704C.mo5268D(this.f4725v);
            int c = this.f4725v.mo5293c();
            if (c != 65535) {
                this.f4704C.mo5269F(0, (long) (c - 65535));
            }
        }
        C3577d i = eVar.mo11711i();
        String str = this.f4710g;
        i.mo11701i(new C3576c(this.f4705D, str, true, str, true), 0);
    }
}
