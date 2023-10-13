package p005a4;

import java.util.List;
import p041f3.C1924k;
import p134u3.C3304d0;
import p134u3.C3306e;
import p134u3.C3313f0;
import p134u3.C3366y;
import p164z3.C3634c;
import p164z3.C3638e;

/* renamed from: a4.g */
public final class C0032g implements C3366y.C3367a {

    /* renamed from: a */
    private int f121a;

    /* renamed from: b */
    private final C3638e f122b;

    /* renamed from: c */
    private final List<C3366y> f123c;

    /* renamed from: d */
    private final int f124d;

    /* renamed from: e */
    private final C3634c f125e;

    /* renamed from: f */
    private final C3304d0 f126f;

    /* renamed from: g */
    private final int f127g;

    /* renamed from: h */
    private final int f128h;

    /* renamed from: i */
    private final int f129i;

    public C0032g(C3638e eVar, List<? extends C3366y> list, int i, C3634c cVar, C3304d0 d0Var, int i2, int i3, int i4) {
        C1924k.m9142h(eVar, "call");
        C1924k.m9142h(list, "interceptors");
        C1924k.m9142h(d0Var, "request");
        this.f122b = eVar;
        this.f123c = list;
        this.f124d = i;
        this.f125e = cVar;
        this.f126f = d0Var;
        this.f127g = i2;
        this.f128h = i3;
        this.f129i = i4;
    }

    /* renamed from: d */
    public static /* synthetic */ C0032g m113d(C0032g gVar, int i, C3634c cVar, C3304d0 d0Var, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = gVar.f124d;
        }
        if ((i5 & 2) != 0) {
            cVar = gVar.f125e;
        }
        C3634c cVar2 = cVar;
        if ((i5 & 4) != 0) {
            d0Var = gVar.f126f;
        }
        C3304d0 d0Var2 = d0Var;
        if ((i5 & 8) != 0) {
            i2 = gVar.f127g;
        }
        int i6 = i2;
        if ((i5 & 16) != 0) {
            i3 = gVar.f128h;
        }
        int i7 = i3;
        if ((i5 & 32) != 0) {
            i4 = gVar.f129i;
        }
        return gVar.mo75c(i, cVar2, d0Var2, i6, i7, i4);
    }

    /* renamed from: a */
    public C3304d0 mo73a() {
        return this.f126f;
    }

    /* renamed from: b */
    public C3313f0 mo74b(C3304d0 d0Var) {
        C1924k.m9142h(d0Var, "request");
        boolean z = false;
        if (this.f124d < this.f123c.size()) {
            this.f121a++;
            C3634c cVar = this.f125e;
            if (cVar != null) {
                if (cVar.mo11908j().mo11923h(d0Var.mo10920k())) {
                    if (!(this.f121a == 1)) {
                        throw new IllegalStateException(("network interceptor " + this.f123c.get(this.f124d - 1) + " must call proceed() exactly once").toString());
                    }
                } else {
                    throw new IllegalStateException(("network interceptor " + this.f123c.get(this.f124d - 1) + " must retain the same host and port").toString());
                }
            }
            C0032g d = m113d(this, this.f124d + 1, (C3634c) null, d0Var, 0, 0, 0, 58, (Object) null);
            C3366y yVar = this.f123c.get(this.f124d);
            C3313f0 a = yVar.mo58a(d);
            if (a != null) {
                if (this.f125e != null) {
                    if (!(this.f124d + 1 >= this.f123c.size() || d.f121a == 1)) {
                        throw new IllegalStateException(("network interceptor " + yVar + " must call proceed() exactly once").toString());
                    }
                }
                if (a.mo10953a() != null) {
                    z = true;
                }
                if (z) {
                    return a;
                }
                throw new IllegalStateException(("interceptor " + yVar + " returned a response with no body").toString());
            }
            throw new NullPointerException("interceptor " + yVar + " returned null");
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: c */
    public final C0032g mo75c(int i, C3634c cVar, C3304d0 d0Var, int i2, int i3, int i4) {
        C1924k.m9142h(d0Var, "request");
        return new C0032g(this.f122b, this.f123c, i, cVar, d0Var, i2, i3, i4);
    }

    public C3306e call() {
        return this.f122b;
    }

    /* renamed from: e */
    public final C3638e mo77e() {
        return this.f122b;
    }

    /* renamed from: f */
    public final int mo78f() {
        return this.f127g;
    }

    /* renamed from: g */
    public final C3634c mo79g() {
        return this.f125e;
    }

    /* renamed from: h */
    public final int mo80h() {
        return this.f128h;
    }

    /* renamed from: i */
    public final C3304d0 mo81i() {
        return this.f126f;
    }

    /* renamed from: j */
    public final int mo82j() {
        return this.f129i;
    }

    /* renamed from: k */
    public int mo83k() {
        return this.f128h;
    }
}
