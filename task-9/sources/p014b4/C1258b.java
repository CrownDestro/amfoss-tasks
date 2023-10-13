package p014b4;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import p005a4.C0029d;
import p005a4.C0030e;
import p005a4.C0034i;
import p005a4.C0037k;
import p041f3.C1920g;
import p041f3.C1924k;
import p062i4.C2100b0;
import p062i4.C2102c0;
import p062i4.C2111f;
import p062i4.C2113g;
import p062i4.C2114h;
import p062i4.C2119l;
import p062i4.C2136z;
import p127t2.C3184p;
import p134u3.C3288b0;
import p134u3.C3304d0;
import p134u3.C3313f0;
import p134u3.C3339p;
import p134u3.C3359w;
import p134u3.C3362x;
import p140v3.C3423b;
import p164z3.C3642f;

/* renamed from: b4.b */
public final class C1258b implements C0029d {

    /* renamed from: h */
    public static final C1262d f4293h = new C1262d((C1920g) null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f4294a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1256a f4295b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C3359w f4296c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C3288b0 f4297d;

    /* renamed from: e */
    private final C3642f f4298e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C2114h f4299f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C2113g f4300g;

    /* renamed from: b4.b$a */
    private abstract class C1259a implements C2100b0 {

        /* renamed from: d */
        private final C2119l f4301d;

        /* renamed from: e */
        private boolean f4302e;

        public C1259a() {
            this.f4301d = new C2119l(C1258b.this.f4299f.mo5090d());
        }

        /* renamed from: M */
        public long mo5087M(C2111f fVar, long j) {
            C1924k.m9142h(fVar, "sink");
            try {
                return C1258b.this.f4299f.mo5087M(fVar, j);
            } catch (IOException e) {
                C1258b.this.mo69h().mo11972y();
                mo5089c();
                throw e;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo5088a() {
            return this.f4302e;
        }

        /* renamed from: c */
        public final void mo5089c() {
            if (C1258b.this.f4294a != 6) {
                if (C1258b.this.f4294a == 5) {
                    C1258b.this.m6104r(this.f4301d);
                    C1258b.this.f4294a = 6;
                    return;
                }
                throw new IllegalStateException("state: " + C1258b.this.f4294a);
            }
        }

        /* renamed from: d */
        public C2102c0 mo5090d() {
            return this.f4301d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public final void mo5091f(boolean z) {
            this.f4302e = z;
        }
    }

    /* renamed from: b4.b$b */
    private final class C1260b implements C2136z {

        /* renamed from: d */
        private final C2119l f4304d;

        /* renamed from: e */
        private boolean f4305e;

        public C1260b() {
            this.f4304d = new C2119l(C1258b.this.f4300g.mo5094d());
        }

        /* renamed from: I */
        public void mo5092I(C2111f fVar, long j) {
            C1924k.m9142h(fVar, "source");
            if (!(!this.f4305e)) {
                throw new IllegalStateException("closed".toString());
            } else if (j != 0) {
                C1258b.this.f4300g.mo7949q(j);
                C1258b.this.f4300g.mo7908P("\r\n");
                C1258b.this.f4300g.mo5092I(fVar, j);
                C1258b.this.f4300g.mo7908P("\r\n");
            }
        }

        public synchronized void close() {
            if (!this.f4305e) {
                this.f4305e = true;
                C1258b.this.f4300g.mo7908P("0\r\n\r\n");
                C1258b.this.m6104r(this.f4304d);
                C1258b.this.f4294a = 3;
            }
        }

        /* renamed from: d */
        public C2102c0 mo5094d() {
            return this.f4304d;
        }

        public synchronized void flush() {
            if (!this.f4305e) {
                C1258b.this.f4300g.flush();
            }
        }
    }

    /* renamed from: b4.b$c */
    private final class C1261c extends C1259a {

        /* renamed from: g */
        private long f4307g = -1;

        /* renamed from: h */
        private boolean f4308h = true;

        /* renamed from: i */
        private final C3362x f4309i;

        /* renamed from: j */
        final /* synthetic */ C1258b f4310j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1261c(C1258b bVar, C3362x xVar) {
            super();
            C1924k.m9142h(xVar, "url");
            this.f4310j = bVar;
            this.f4309i = xVar;
        }

        /* renamed from: h */
        private final void m6129h() {
            if (this.f4307g != -1) {
                this.f4310j.f4299f.mo7904K();
            }
            try {
                this.f4307g = this.f4310j.f4299f.mo7915W();
                String K = this.f4310j.f4299f.mo7904K();
                if (K != null) {
                    String obj = C2647q.m11997A0(K).toString();
                    if (this.f4307g >= 0) {
                        if (!(obj.length() > 0) || C2646p.m11982B(obj, ";", false, 2, (Object) null)) {
                            if (this.f4307g == 0) {
                                this.f4308h = false;
                                C1258b bVar = this.f4310j;
                                bVar.f4296c = bVar.f4295b.mo5083a();
                                C3288b0 j = this.f4310j.f4297d;
                                if (j == null) {
                                    C1924k.m9150p();
                                }
                                C3339p p = j.mo10821p();
                                C3362x xVar = this.f4309i;
                                C3359w o = this.f4310j.f4296c;
                                if (o == null) {
                                    C1924k.m9150p();
                                }
                                C0030e.m105f(p, xVar, o);
                                mo5089c();
                                return;
                            }
                            return;
                        }
                    }
                    throw new ProtocolException("expected chunk size and optional extensions" + " but was \"" + this.f4307g + obj + '\"');
                }
                throw new C3184p("null cannot be cast to non-null type kotlin.CharSequence");
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        /* renamed from: M */
        public long mo5087M(C2111f fVar, long j) {
            C1924k.m9142h(fVar, "sink");
            if (!(j >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            } else if (!(true ^ mo5088a())) {
                throw new IllegalStateException("closed".toString());
            } else if (!this.f4308h) {
                return -1;
            } else {
                long j2 = this.f4307g;
                if (j2 == 0 || j2 == -1) {
                    m6129h();
                    if (!this.f4308h) {
                        return -1;
                    }
                }
                long M = super.mo5087M(fVar, Math.min(j, this.f4307g));
                if (M != -1) {
                    this.f4307g -= M;
                    return M;
                }
                this.f4310j.mo69h().mo11972y();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo5089c();
                throw protocolException;
            }
        }

        public void close() {
            if (!mo5088a()) {
                if (this.f4308h && !C3423b.m15098p(this, 100, TimeUnit.MILLISECONDS)) {
                    this.f4310j.mo69h().mo11972y();
                    mo5089c();
                }
                mo5091f(true);
            }
        }
    }

    /* renamed from: b4.b$d */
    public static final class C1262d {
        private C1262d() {
        }

        public /* synthetic */ C1262d(C1920g gVar) {
            this();
        }
    }

    /* renamed from: b4.b$e */
    private final class C1263e extends C1259a {

        /* renamed from: g */
        private long f4311g;

        public C1263e(long j) {
            super();
            this.f4311g = j;
            if (j == 0) {
                mo5089c();
            }
        }

        /* renamed from: M */
        public long mo5087M(C2111f fVar, long j) {
            C1924k.m9142h(fVar, "sink");
            if (!(j >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            } else if (true ^ mo5088a()) {
                long j2 = this.f4311g;
                if (j2 == 0) {
                    return -1;
                }
                long M = super.mo5087M(fVar, Math.min(j2, j));
                if (M != -1) {
                    long j3 = this.f4311g - M;
                    this.f4311g = j3;
                    if (j3 == 0) {
                        mo5089c();
                    }
                    return M;
                }
                C1258b.this.mo69h().mo11972y();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo5089c();
                throw protocolException;
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        public void close() {
            if (!mo5088a()) {
                if (this.f4311g != 0 && !C3423b.m15098p(this, 100, TimeUnit.MILLISECONDS)) {
                    C1258b.this.mo69h().mo11972y();
                    mo5089c();
                }
                mo5091f(true);
            }
        }
    }

    /* renamed from: b4.b$f */
    private final class C1264f implements C2136z {

        /* renamed from: d */
        private final C2119l f4313d;

        /* renamed from: e */
        private boolean f4314e;

        public C1264f() {
            this.f4313d = new C2119l(C1258b.this.f4300g.mo5094d());
        }

        /* renamed from: I */
        public void mo5092I(C2111f fVar, long j) {
            C1924k.m9142h(fVar, "source");
            if (!this.f4314e) {
                C3423b.m15091i(fVar.mo7931h0(), 0, j);
                C1258b.this.f4300g.mo5092I(fVar, j);
                return;
            }
            throw new IllegalStateException("closed".toString());
        }

        public void close() {
            if (!this.f4314e) {
                this.f4314e = true;
                C1258b.this.m6104r(this.f4313d);
                C1258b.this.f4294a = 3;
            }
        }

        /* renamed from: d */
        public C2102c0 mo5094d() {
            return this.f4313d;
        }

        public void flush() {
            if (!this.f4314e) {
                C1258b.this.f4300g.flush();
            }
        }
    }

    /* renamed from: b4.b$g */
    private final class C1265g extends C1259a {

        /* renamed from: g */
        private boolean f4316g;

        public C1265g() {
            super();
        }

        /* renamed from: M */
        public long mo5087M(C2111f fVar, long j) {
            C1924k.m9142h(fVar, "sink");
            if (!(j >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            } else if (!(!mo5088a())) {
                throw new IllegalStateException("closed".toString());
            } else if (this.f4316g) {
                return -1;
            } else {
                long M = super.mo5087M(fVar, j);
                if (M != -1) {
                    return M;
                }
                this.f4316g = true;
                mo5089c();
                return -1;
            }
        }

        public void close() {
            if (!mo5088a()) {
                if (!this.f4316g) {
                    mo5089c();
                }
                mo5091f(true);
            }
        }
    }

    public C1258b(C3288b0 b0Var, C3642f fVar, C2114h hVar, C2113g gVar) {
        C1924k.m9142h(fVar, "connection");
        C1924k.m9142h(hVar, "source");
        C1924k.m9142h(gVar, "sink");
        this.f4297d = b0Var;
        this.f4298e = fVar;
        this.f4299f = hVar;
        this.f4300g = gVar;
        this.f4295b = new C1256a(hVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public final void m6104r(C2119l lVar) {
        C2102c0 i = lVar.mo8012i();
        lVar.mo8013j(C2102c0.f7338d);
        i.mo7876a();
        i.mo7877b();
    }

    /* renamed from: s */
    private final boolean m6105s(C3304d0 d0Var) {
        return C2646p.m11985o("chunked", d0Var.mo10913d("Transfer-Encoding"), true);
    }

    /* renamed from: t */
    private final boolean m6106t(C3313f0 f0Var) {
        return C2646p.m11985o("chunked", C3313f0.m14621w(f0Var, "Transfer-Encoding", (String) null, 2, (Object) null), true);
    }

    /* renamed from: u */
    private final C2136z m6107u() {
        boolean z = true;
        if (this.f4294a != 1) {
            z = false;
        }
        if (z) {
            this.f4294a = 2;
            return new C1260b();
        }
        throw new IllegalStateException(("state: " + this.f4294a).toString());
    }

    /* renamed from: v */
    private final C2100b0 m6108v(C3362x xVar) {
        if (this.f4294a == 4) {
            this.f4294a = 5;
            return new C1261c(this, xVar);
        }
        throw new IllegalStateException(("state: " + this.f4294a).toString());
    }

    /* renamed from: w */
    private final C2100b0 m6109w(long j) {
        if (this.f4294a == 4) {
            this.f4294a = 5;
            return new C1263e(j);
        }
        throw new IllegalStateException(("state: " + this.f4294a).toString());
    }

    /* renamed from: x */
    private final C2136z m6110x() {
        boolean z = true;
        if (this.f4294a != 1) {
            z = false;
        }
        if (z) {
            this.f4294a = 2;
            return new C1264f();
        }
        throw new IllegalStateException(("state: " + this.f4294a).toString());
    }

    /* renamed from: y */
    private final C2100b0 m6111y() {
        if (this.f4294a == 4) {
            this.f4294a = 5;
            mo69h().mo11972y();
            return new C1265g();
        }
        throw new IllegalStateException(("state: " + this.f4294a).toString());
    }

    /* renamed from: A */
    public final void mo5085A(C3359w wVar, String str) {
        C1924k.m9142h(wVar, "headers");
        C1924k.m9142h(str, "requestLine");
        if (this.f4294a == 0) {
            this.f4300g.mo7908P(str).mo7908P("\r\n");
            int size = wVar.size();
            for (int i = 0; i < size; i++) {
                this.f4300g.mo7908P(wVar.mo11110x(i)).mo7908P(": ").mo7908P(wVar.mo11102A(i)).mo7908P("\r\n");
            }
            this.f4300g.mo7908P("\r\n");
            this.f4294a = 1;
            return;
        }
        throw new IllegalStateException(("state: " + this.f4294a).toString());
    }

    /* renamed from: a */
    public C2100b0 mo61a(C3313f0 f0Var) {
        long s;
        C1924k.m9142h(f0Var, "response");
        if (!C0030e.m101b(f0Var)) {
            s = 0;
        } else if (m6106t(f0Var)) {
            return m6108v(f0Var.mo10951Q().mo10920k());
        } else {
            s = C3423b.m15101s(f0Var);
            if (s == -1) {
                return m6111y();
            }
        }
        return m6109w(s);
    }

    /* renamed from: b */
    public void mo62b() {
        this.f4300g.flush();
    }

    /* renamed from: c */
    public C2136z mo63c(C3304d0 d0Var, long j) {
        C1924k.m9142h(d0Var, "request");
        if (d0Var.mo10910a() != null && d0Var.mo10910a().mo10937e()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        } else if (m6105s(d0Var)) {
            return m6107u();
        } else {
            if (j != -1) {
                return m6110x();
            }
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    public void cancel() {
        mo69h().mo11957d();
    }

    /* renamed from: d */
    public void mo65d() {
        this.f4300g.flush();
    }

    /* renamed from: e */
    public long mo66e(C3313f0 f0Var) {
        C1924k.m9142h(f0Var, "response");
        if (!C0030e.m101b(f0Var)) {
            return 0;
        }
        if (m6106t(f0Var)) {
            return -1;
        }
        return C3423b.m15101s(f0Var);
    }

    /* renamed from: f */
    public void mo67f(C3304d0 d0Var) {
        C1924k.m9142h(d0Var, "request");
        C0034i iVar = C0034i.f133a;
        Proxy.Type type = mo69h().mo11973z().mo11009b().type();
        C1924k.m9137c(type, "connection.route().proxy.type()");
        mo5085A(d0Var.mo10915f(), iVar.mo87a(d0Var, type));
    }

    /* renamed from: g */
    public C3313f0.C3314a mo68g(boolean z) {
        int i = this.f4294a;
        boolean z2 = true;
        if (!(i == 1 || i == 3)) {
            z2 = false;
        }
        if (z2) {
            try {
                C0037k a = C0037k.f136d.mo90a(this.f4295b.mo5084b());
                C3313f0.C3314a k = new C3313f0.C3314a().mo10976p(a.f137a).mo10967g(a.f138b).mo10973m(a.f139c).mo10971k(this.f4295b.mo5083a());
                if (z && a.f138b == 100) {
                    return null;
                }
                if (a.f138b == 100) {
                    this.f4294a = 3;
                    return k;
                }
                this.f4294a = 4;
                return k;
            } catch (EOFException e) {
                String p = mo69h().mo11973z().mo11008a().mo10791l().mo11137p();
                throw new IOException("unexpected end of stream on " + p, e);
            }
        } else {
            throw new IllegalStateException(("state: " + this.f4294a).toString());
        }
    }

    /* renamed from: h */
    public C3642f mo69h() {
        return this.f4298e;
    }

    /* renamed from: z */
    public final void mo5086z(C3313f0 f0Var) {
        C1924k.m9142h(f0Var, "response");
        long s = C3423b.m15101s(f0Var);
        if (s != -1) {
            C2100b0 w = m6109w(s);
            C3423b.m15069I(w, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            w.close();
        }
    }
}
