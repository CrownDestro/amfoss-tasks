package p021c4;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p005a4.C0029d;
import p005a4.C0030e;
import p005a4.C0032g;
import p005a4.C0034i;
import p005a4.C0037k;
import p041f3.C1920g;
import p041f3.C1924k;
import p062i4.C2100b0;
import p062i4.C2136z;
import p127t2.C3184p;
import p134u3.C3288b0;
import p134u3.C3299c0;
import p134u3.C3304d0;
import p134u3.C3313f0;
import p134u3.C3359w;
import p140v3.C3423b;
import p164z3.C3642f;

/* renamed from: c4.g */
public final class C1331g implements C0029d {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final List<String> f4808g = C3423b.m15102t("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final List<String> f4809h = C3423b.m15102t("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: i */
    public static final C1332a f4810i = new C1332a((C1920g) null);

    /* renamed from: a */
    private volatile C1337i f4811a;

    /* renamed from: b */
    private final C3299c0 f4812b;

    /* renamed from: c */
    private volatile boolean f4813c;

    /* renamed from: d */
    private final C3642f f4814d;

    /* renamed from: e */
    private final C0032g f4815e;

    /* renamed from: f */
    private final C1312f f4816f;

    /* renamed from: c4.g$a */
    public static final class C1332a {
        private C1332a() {
        }

        public /* synthetic */ C1332a(C1920g gVar) {
            this();
        }

        /* renamed from: a */
        public final List<C1306c> mo5213a(C3304d0 d0Var) {
            C1924k.m9142h(d0Var, "request");
            C3359w f = d0Var.mo10915f();
            ArrayList arrayList = new ArrayList(f.size() + 4);
            arrayList.add(new C1306c(C1306c.f4666f, d0Var.mo10917h()));
            arrayList.add(new C1306c(C1306c.f4667g, C0034i.f133a.mo88c(d0Var.mo10920k())));
            String d = d0Var.mo10913d("Host");
            if (d != null) {
                arrayList.add(new C1306c(C1306c.f4669i, d));
            }
            arrayList.add(new C1306c(C1306c.f4668h, d0Var.mo10920k().mo11139r()));
            int i = 0;
            int size = f.size();
            while (i < size) {
                String x = f.mo11110x(i);
                Locale locale = Locale.US;
                C1924k.m9137c(locale, "Locale.US");
                if (x != null) {
                    String lowerCase = x.toLowerCase(locale);
                    C1924k.m9137c(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    if (!C1331g.f4808g.contains(lowerCase) || (C1924k.m9136b(lowerCase, "te") && C1924k.m9136b(f.mo11102A(i), "trailers"))) {
                        arrayList.add(new C1306c(lowerCase, f.mo11102A(i)));
                    }
                    i++;
                } else {
                    throw new C3184p("null cannot be cast to non-null type java.lang.String");
                }
            }
            return arrayList;
        }

        /* renamed from: b */
        public final C3313f0.C3314a mo5214b(C3359w wVar, C3299c0 c0Var) {
            C1924k.m9142h(wVar, "headerBlock");
            C1924k.m9142h(c0Var, "protocol");
            C3359w.C3360a aVar = new C3359w.C3360a();
            int size = wVar.size();
            C0037k kVar = null;
            for (int i = 0; i < size; i++) {
                String x = wVar.mo11110x(i);
                String A = wVar.mo11102A(i);
                if (C1924k.m9136b(x, ":status")) {
                    C0037k.C0038a aVar2 = C0037k.f136d;
                    kVar = aVar2.mo90a("HTTP/1.1 " + A);
                } else if (!C1331g.f4809h.contains(x)) {
                    aVar.mo11115d(x, A);
                }
            }
            if (kVar != null) {
                return new C3313f0.C3314a().mo10976p(c0Var).mo10967g(kVar.f138b).mo10973m(kVar.f139c).mo10971k(aVar.mo11116e());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
    }

    public C1331g(C3288b0 b0Var, C3642f fVar, C0032g gVar, C1312f fVar2) {
        C1924k.m9142h(b0Var, "client");
        C1924k.m9142h(fVar, "connection");
        C1924k.m9142h(gVar, "chain");
        C1924k.m9142h(fVar2, "http2Connection");
        this.f4814d = fVar;
        this.f4815e = gVar;
        this.f4816f = fVar2;
        List<C3299c0> B = b0Var.mo10803B();
        C3299c0 c0Var = C3299c0.H2_PRIOR_KNOWLEDGE;
        this.f4812b = !B.contains(c0Var) ? C3299c0.HTTP_2 : c0Var;
    }

    /* renamed from: a */
    public C2100b0 mo61a(C3313f0 f0Var) {
        C1924k.m9142h(f0Var, "response");
        C1337i iVar = this.f4811a;
        if (iVar == null) {
            C1924k.m9150p();
        }
        return iVar.mo5245p();
    }

    /* renamed from: b */
    public void mo62b() {
        C1337i iVar = this.f4811a;
        if (iVar == null) {
            C1924k.m9150p();
        }
        iVar.mo5243n().close();
    }

    /* renamed from: c */
    public C2136z mo63c(C3304d0 d0Var, long j) {
        C1924k.m9142h(d0Var, "request");
        C1337i iVar = this.f4811a;
        if (iVar == null) {
            C1924k.m9150p();
        }
        return iVar.mo5243n();
    }

    public void cancel() {
        this.f4813c = true;
        C1337i iVar = this.f4811a;
        if (iVar != null) {
            iVar.mo5235f(C1304b.CANCEL);
        }
    }

    /* renamed from: d */
    public void mo65d() {
        this.f4816f.flush();
    }

    /* renamed from: e */
    public long mo66e(C3313f0 f0Var) {
        C1924k.m9142h(f0Var, "response");
        if (!C0030e.m101b(f0Var)) {
            return 0;
        }
        return C3423b.m15101s(f0Var);
    }

    /* renamed from: f */
    public void mo67f(C3304d0 d0Var) {
        C1924k.m9142h(d0Var, "request");
        if (this.f4811a == null) {
            this.f4811a = this.f4816f.mo5172o0(f4810i.mo5213a(d0Var), d0Var.mo10910a() != null);
            if (this.f4813c) {
                C1337i iVar = this.f4811a;
                if (iVar == null) {
                    C1924k.m9150p();
                }
                iVar.mo5235f(C1304b.CANCEL);
                throw new IOException("Canceled");
            }
            C1337i iVar2 = this.f4811a;
            if (iVar2 == null) {
                C1924k.m9150p();
            }
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            iVar2.mo5251v().mo7882g((long) this.f4815e.mo80h(), timeUnit);
            C1337i iVar3 = this.f4811a;
            if (iVar3 == null) {
                C1924k.m9150p();
            }
            iVar3.mo5230E().mo7882g((long) this.f4815e.mo82j(), timeUnit);
        }
    }

    /* renamed from: g */
    public C3313f0.C3314a mo68g(boolean z) {
        C1337i iVar = this.f4811a;
        if (iVar == null) {
            C1924k.m9150p();
        }
        C3313f0.C3314a b = f4810i.mo5214b(iVar.mo5228C(), this.f4812b);
        if (!z || b.mo10968h() != 100) {
            return b;
        }
        return null;
    }

    /* renamed from: h */
    public C3642f mo69h() {
        return this.f4814d;
    }
}
