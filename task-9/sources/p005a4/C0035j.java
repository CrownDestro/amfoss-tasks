package p005a4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import p021c4.C1303a;
import p041f3.C1920g;
import p041f3.C1924k;
import p086m3.C2633f;
import p134u3.C3288b0;
import p134u3.C3304d0;
import p134u3.C3308e0;
import p134u3.C3313f0;
import p134u3.C3320g0;
import p134u3.C3362x;
import p134u3.C3366y;
import p140v3.C3423b;
import p164z3.C3634c;
import p164z3.C3638e;
import p164z3.C3651j;

/* renamed from: a4.j */
public final class C0035j implements C3366y {

    /* renamed from: b */
    public static final C0036a f134b = new C0036a((C1920g) null);

    /* renamed from: a */
    private final C3288b0 f135a;

    /* renamed from: a4.j$a */
    public static final class C0036a {
        private C0036a() {
        }

        public /* synthetic */ C0036a(C1920g gVar) {
            this();
        }
    }

    public C0035j(C3288b0 b0Var) {
        C1924k.m9142h(b0Var, "client");
        this.f135a = b0Var;
    }

    /* renamed from: b */
    private final C3304d0 m130b(C3313f0 f0Var, String str) {
        String w;
        C3362x q;
        C3308e0 e0Var = null;
        if (!this.f135a.mo10825u() || (w = C3313f0.m14621w(f0Var, "Location", (String) null, 2, (Object) null)) == null || (q = f0Var.mo10951Q().mo10920k().mo11138q(w)) == null) {
            return null;
        }
        if (!C1924k.m9136b(q.mo11139r(), f0Var.mo10951Q().mo10920k().mo11139r()) && !this.f135a.mo10826v()) {
            return null;
        }
        C3304d0.C3305a i = f0Var.mo10951Q().mo10918i();
        if (C0031f.m108b(str)) {
            int i2 = f0Var.mo10958i();
            C0031f fVar = C0031f.f120a;
            boolean z = fVar.mo72d(str) || i2 == 308 || i2 == 307;
            if (fVar.mo71c(str) && i2 != 308 && i2 != 307) {
                str = "GET";
            } else if (z) {
                e0Var = f0Var.mo10951Q().mo10910a();
            }
            i.mo10927f(str, e0Var);
            if (!z) {
                i.mo10928g("Transfer-Encoding");
                i.mo10928g("Content-Length");
                i.mo10928g("Content-Type");
            }
        }
        if (!C3423b.m15089g(f0Var.mo10951Q().mo10920k(), q)) {
            i.mo10928g("Authorization");
        }
        return i.mo10931j(q).mo10923b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r7.mo11906h();
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p134u3.C3304d0 m131c(p134u3.C3313f0 r6, p164z3.C3634c r7) {
        /*
            r5 = this;
            r0 = 0
            if (r7 == 0) goto L_0x000e
            z3.f r1 = r7.mo11906h()
            if (r1 == 0) goto L_0x000e
            u3.h0 r1 = r1.mo11973z()
            goto L_0x000f
        L_0x000e:
            r1 = r0
        L_0x000f:
            int r2 = r6.mo10958i()
            u3.d0 r3 = r6.mo10951Q()
            java.lang.String r3 = r3.mo10917h()
            r4 = 307(0x133, float:4.3E-43)
            if (r2 == r4) goto L_0x00e1
            r4 = 308(0x134, float:4.32E-43)
            if (r2 == r4) goto L_0x00e1
            r4 = 401(0x191, float:5.62E-43)
            if (r2 == r4) goto L_0x00d6
            r4 = 421(0x1a5, float:5.9E-43)
            if (r2 == r4) goto L_0x00af
            r7 = 503(0x1f7, float:7.05E-43)
            if (r2 == r7) goto L_0x0093
            r7 = 407(0x197, float:5.7E-43)
            if (r2 == r7) goto L_0x006f
            r7 = 408(0x198, float:5.72E-43)
            if (r2 == r7) goto L_0x003b
            switch(r2) {
                case 300: goto L_0x00e1;
                case 301: goto L_0x00e1;
                case 302: goto L_0x00e1;
                case 303: goto L_0x00e1;
                default: goto L_0x003a;
            }
        L_0x003a:
            return r0
        L_0x003b:
            u3.b0 r1 = r5.f135a
            boolean r1 = r1.mo10808G()
            if (r1 != 0) goto L_0x0044
            return r0
        L_0x0044:
            u3.d0 r1 = r6.mo10951Q()
            u3.e0 r1 = r1.mo10910a()
            if (r1 == 0) goto L_0x0055
            boolean r1 = r1.mo10938f()
            if (r1 == 0) goto L_0x0055
            return r0
        L_0x0055:
            u3.f0 r1 = r6.mo10948H()
            if (r1 == 0) goto L_0x0062
            int r1 = r1.mo10958i()
            if (r1 != r7) goto L_0x0062
            return r0
        L_0x0062:
            r7 = 0
            int r7 = r5.m135g(r6, r7)
            if (r7 <= 0) goto L_0x006a
            return r0
        L_0x006a:
            u3.d0 r6 = r6.mo10951Q()
            return r6
        L_0x006f:
            if (r1 != 0) goto L_0x0074
            p041f3.C1924k.m9150p()
        L_0x0074:
            java.net.Proxy r7 = r1.mo11009b()
            java.net.Proxy$Type r7 = r7.type()
            java.net.Proxy$Type r0 = java.net.Proxy.Type.HTTP
            if (r7 != r0) goto L_0x008b
            u3.b0 r7 = r5.f135a
            u3.b r7 = r7.mo10805D()
            u3.d0 r6 = r7.mo10801a(r1, r6)
            return r6
        L_0x008b:
            java.net.ProtocolException r6 = new java.net.ProtocolException
            java.lang.String r7 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
            r6.<init>(r7)
            throw r6
        L_0x0093:
            u3.f0 r1 = r6.mo10948H()
            if (r1 == 0) goto L_0x00a0
            int r1 = r1.mo10958i()
            if (r1 != r7) goto L_0x00a0
            return r0
        L_0x00a0:
            r7 = 2147483647(0x7fffffff, float:NaN)
            int r7 = r5.m135g(r6, r7)
            if (r7 != 0) goto L_0x00ae
            u3.d0 r6 = r6.mo10951Q()
            return r6
        L_0x00ae:
            return r0
        L_0x00af:
            u3.d0 r1 = r6.mo10951Q()
            u3.e0 r1 = r1.mo10910a()
            if (r1 == 0) goto L_0x00c0
            boolean r1 = r1.mo10938f()
            if (r1 == 0) goto L_0x00c0
            return r0
        L_0x00c0:
            if (r7 == 0) goto L_0x00d5
            boolean r1 = r7.mo11909k()
            if (r1 != 0) goto L_0x00c9
            goto L_0x00d5
        L_0x00c9:
            z3.f r7 = r7.mo11906h()
            r7.mo11971x()
            u3.d0 r6 = r6.mo10951Q()
            return r6
        L_0x00d5:
            return r0
        L_0x00d6:
            u3.b0 r7 = r5.f135a
            u3.b r7 = r7.mo10814g()
            u3.d0 r6 = r7.mo10801a(r1, r6)
            return r6
        L_0x00e1:
            u3.d0 r6 = r5.m130b(r6, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p005a4.C0035j.m131c(u3.f0, z3.c):u3.d0");
    }

    /* renamed from: d */
    private final boolean m132d(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z : (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException);
    }

    /* renamed from: e */
    private final boolean m133e(IOException iOException, C3638e eVar, C3304d0 d0Var, boolean z) {
        if (!this.f135a.mo10808G()) {
            return false;
        }
        return (!z || !m134f(iOException, d0Var)) && m132d(iOException, z) && eVar.mo11926B();
    }

    /* renamed from: f */
    private final boolean m134f(IOException iOException, C3304d0 d0Var) {
        C3308e0 a = d0Var.mo10910a();
        return (a != null && a.mo10938f()) || (iOException instanceof FileNotFoundException);
    }

    /* renamed from: g */
    private final int m135g(C3313f0 f0Var, int i) {
        String w = C3313f0.m14621w(f0Var, "Retry-After", (String) null, 2, (Object) null);
        if (w == null) {
            return i;
        }
        if (!new C2633f("\\d+").mo9325a(w)) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(w);
        C1924k.m9137c(valueOf, "Integer.valueOf(header)");
        return valueOf.intValue();
    }

    /* renamed from: a */
    public C3313f0 mo58a(C3366y.C3367a aVar) {
        IOException e;
        C1924k.m9142h(aVar, "chain");
        C0032g gVar = (C0032g) aVar;
        C3304d0 i = gVar.mo81i();
        C3638e e2 = gVar.mo77e();
        List f = C3263l.m14369f();
        C3313f0 f0Var = null;
        boolean z = true;
        int i2 = 0;
        while (true) {
            e2.mo11931k(i, z);
            try {
                if (!e2.mo10933c()) {
                    C3313f0 b = gVar.mo74b(i);
                    if (f0Var != null) {
                        b = b.mo10947G().mo10975o(f0Var.mo10947G().mo10964b((C3320g0) null).mo10965c()).mo10965c();
                    }
                    f0Var = b;
                    C3634c r = e2.mo11937r();
                    C3304d0 c = m131c(f0Var, r);
                    if (c == null) {
                        if (r != null && r.mo11910l()) {
                            e2.mo11927C();
                        }
                        e2.mo11932l(false);
                        return f0Var;
                    }
                    C3308e0 a = c.mo10910a();
                    if (a == null || !a.mo10938f()) {
                        C3320g0 a2 = f0Var.mo10953a();
                        if (a2 != null) {
                            C3423b.m15092j(a2);
                        }
                        i2++;
                        if (i2 <= 20) {
                            e2.mo11932l(true);
                            i = c;
                            z = true;
                        } else {
                            throw new ProtocolException("Too many follow-up requests: " + i2);
                        }
                    } else {
                        e2.mo11932l(false);
                        return f0Var;
                    }
                } else {
                    throw new IOException("Canceled");
                }
            } catch (C3651j e3) {
                if (m133e(e3.mo11985c(), e2, i, false)) {
                    e = e3.mo11984b();
                    f = C3271t.m14394I(f, e);
                    e2.mo11932l(true);
                    z = false;
                } else {
                    throw C3423b.m15081U(e3.mo11984b(), f);
                }
            } catch (IOException e4) {
                e = e4;
                if (m133e(e, e2, i, !(e instanceof C1303a))) {
                    f = C3271t.m14394I(f, e);
                    e2.mo11932l(true);
                    z = false;
                } else {
                    throw C3423b.m15081U(e, f);
                }
            } catch (Throwable th) {
                e2.mo11932l(true);
                throw th;
            }
        }
    }
}
