package p005a4;

import java.net.ProtocolException;
import p041f3.C1924k;
import p062i4.C2113g;
import p062i4.C2123p;
import p134u3.C3304d0;
import p134u3.C3308e0;
import p134u3.C3313f0;
import p134u3.C3320g0;
import p134u3.C3366y;
import p140v3.C3423b;
import p164z3.C3634c;

/* renamed from: a4.b */
public final class C0026b implements C3366y {

    /* renamed from: a */
    private final boolean f114a;

    public C0026b(boolean z) {
        this.f114a = z;
    }

    /* renamed from: a */
    public C3313f0 mo58a(C3366y.C3367a aVar) {
        boolean z;
        C3313f0.C3314a aVar2;
        C3313f0.C3314a aVar3;
        C3320g0 g0Var;
        C1924k.m9142h(aVar, "chain");
        C0032g gVar = (C0032g) aVar;
        C3634c g = gVar.mo79g();
        if (g == null) {
            C1924k.m9150p();
        }
        C3304d0 i = gVar.mo81i();
        C3308e0 a = i.mo10910a();
        long currentTimeMillis = System.currentTimeMillis();
        g.mo11917t(i);
        Long l = null;
        if (!C0031f.m108b(i.mo10917h()) || a == null) {
            g.mo11912n();
            aVar2 = null;
            z = true;
        } else {
            if (C2646p.m11985o("100-continue", i.mo10913d("Expect"), true)) {
                g.mo11904f();
                aVar2 = g.mo11914p(true);
                g.mo11916r();
                z = false;
            } else {
                aVar2 = null;
                z = true;
            }
            if (aVar2 != null) {
                g.mo11912n();
                if (!g.mo11906h().mo11969v()) {
                    g.mo11911m();
                }
            } else if (a.mo10937e()) {
                g.mo11904f();
                a.mo7576g(C2123p.m9840c(g.mo11901c(i, true)));
            } else {
                C2113g c = C2123p.m9840c(g.mo11901c(i, false));
                a.mo7576g(c);
                c.close();
            }
        }
        if (a == null || !a.mo10937e()) {
            g.mo11903e();
        }
        if (aVar2 == null) {
            aVar2 = g.mo11914p(false);
            if (aVar2 == null) {
                C1924k.m9150p();
            }
            if (z) {
                g.mo11916r();
                z = false;
            }
        }
        C3313f0 c2 = aVar2.mo10978r(i).mo10969i(g.mo11906h().mo11965s()).mo10979s(currentTimeMillis).mo10977q(System.currentTimeMillis()).mo10965c();
        int i2 = c2.mo10958i();
        if (i2 == 100) {
            C3313f0.C3314a p = g.mo11914p(false);
            if (p == null) {
                C1924k.m9150p();
            }
            if (z) {
                g.mo11916r();
            }
            c2 = p.mo10978r(i).mo10969i(g.mo11906h().mo11965s()).mo10979s(currentTimeMillis).mo10977q(System.currentTimeMillis()).mo10965c();
            i2 = c2.mo10958i();
        }
        g.mo11915q(c2);
        if (!this.f114a || i2 != 101) {
            aVar3 = c2.mo10947G();
            g0Var = g.mo11913o(c2);
        } else {
            aVar3 = c2.mo10947G();
            g0Var = C3423b.f11234c;
        }
        C3313f0 c3 = aVar3.mo10964b(g0Var).mo10965c();
        if (C2646p.m11985o("close", c3.mo10951Q().mo10913d("Connection"), true) || C2646p.m11985o("close", C3313f0.m14621w(c3, "Connection", (String) null, 2, (Object) null), true)) {
            g.mo11911m();
        }
        if (i2 == 204 || i2 == 205) {
            C3320g0 a2 = c3.mo10953a();
            if ((a2 != null ? a2.mo84c() : -1) > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("HTTP ");
                sb.append(i2);
                sb.append(" had non-zero Content-Length: ");
                C3320g0 a3 = c3.mo10953a();
                if (a3 != null) {
                    l = Long.valueOf(a3.mo84c());
                }
                sb.append(l);
                throw new ProtocolException(sb.toString());
            }
        }
        return c3;
    }
}
