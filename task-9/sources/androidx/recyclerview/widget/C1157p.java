package androidx.recyclerview.widget;

import androidx.core.util.C0609e;
import androidx.core.util.C0610f;
import androidx.recyclerview.widget.RecyclerView;
import p070k.C2340d;
import p070k.C2348g;

/* renamed from: androidx.recyclerview.widget.p */
class C1157p {

    /* renamed from: a */
    final C2348g<RecyclerView.C1070d0, C1158a> f4053a = new C2348g<>();

    /* renamed from: b */
    final C2340d<RecyclerView.C1070d0> f4054b = new C2340d<>();

    /* renamed from: androidx.recyclerview.widget.p$a */
    static class C1158a {

        /* renamed from: d */
        static C0609e<C1158a> f4055d = new C0610f(20);

        /* renamed from: a */
        int f4056a;

        /* renamed from: b */
        RecyclerView.C1078l.C1081c f4057b;

        /* renamed from: c */
        RecyclerView.C1078l.C1081c f4058c;

        private C1158a() {
        }

        /* renamed from: a */
        static void m5769a() {
            do {
            } while (f4055d.mo2664b() != null);
        }

        /* renamed from: b */
        static C1158a m5770b() {
            C1158a b = f4055d.mo2664b();
            return b == null ? new C1158a() : b;
        }

        /* renamed from: c */
        static void m5771c(C1158a aVar) {
            aVar.f4056a = 0;
            aVar.f4057b = null;
            aVar.f4058c = null;
            f4055d.mo2663a(aVar);
        }
    }

    /* renamed from: androidx.recyclerview.widget.p$b */
    interface C1159b {
        /* renamed from: a */
        void mo4210a(RecyclerView.C1070d0 d0Var);

        /* renamed from: b */
        void mo4211b(RecyclerView.C1070d0 d0Var, RecyclerView.C1078l.C1081c cVar, RecyclerView.C1078l.C1081c cVar2);

        /* renamed from: c */
        void mo4212c(RecyclerView.C1070d0 d0Var, RecyclerView.C1078l.C1081c cVar, RecyclerView.C1078l.C1081c cVar2);

        /* renamed from: d */
        void mo4213d(RecyclerView.C1070d0 d0Var, RecyclerView.C1078l.C1081c cVar, RecyclerView.C1078l.C1081c cVar2);
    }

    C1157p() {
    }

    /* renamed from: l */
    private RecyclerView.C1078l.C1081c m5752l(RecyclerView.C1070d0 d0Var, int i) {
        C1158a m;
        RecyclerView.C1078l.C1081c cVar;
        int f = this.f4053a.mo8783f(d0Var);
        if (f >= 0 && (m = this.f4053a.mo8794m(f)) != null) {
            int i2 = m.f4056a;
            if ((i2 & i) != 0) {
                int i3 = (i ^ -1) & i2;
                m.f4056a = i3;
                if (i == 4) {
                    cVar = m.f4057b;
                } else if (i == 8) {
                    cVar = m.f4058c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    this.f4053a.mo8792k(f);
                    C1158a.m5771c(m);
                }
                return cVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4751a(RecyclerView.C1070d0 d0Var, RecyclerView.C1078l.C1081c cVar) {
        C1158a aVar = this.f4053a.get(d0Var);
        if (aVar == null) {
            aVar = C1158a.m5770b();
            this.f4053a.put(d0Var, aVar);
        }
        aVar.f4056a |= 2;
        aVar.f4057b = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4752b(RecyclerView.C1070d0 d0Var) {
        C1158a aVar = this.f4053a.get(d0Var);
        if (aVar == null) {
            aVar = C1158a.m5770b();
            this.f4053a.put(d0Var, aVar);
        }
        aVar.f4056a |= 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4753c(long j, RecyclerView.C1070d0 d0Var) {
        this.f4054b.mo8702m(j, d0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4754d(RecyclerView.C1070d0 d0Var, RecyclerView.C1078l.C1081c cVar) {
        C1158a aVar = this.f4053a.get(d0Var);
        if (aVar == null) {
            aVar = C1158a.m5770b();
            this.f4053a.put(d0Var, aVar);
        }
        aVar.f4058c = cVar;
        aVar.f4056a |= 8;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo4755e(RecyclerView.C1070d0 d0Var, RecyclerView.C1078l.C1081c cVar) {
        C1158a aVar = this.f4053a.get(d0Var);
        if (aVar == null) {
            aVar = C1158a.m5770b();
            this.f4053a.put(d0Var, aVar);
        }
        aVar.f4057b = cVar;
        aVar.f4056a |= 4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo4756f() {
        this.f4053a.clear();
        this.f4054b.mo8696d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public RecyclerView.C1070d0 mo4757g(long j) {
        return this.f4054b.mo8698i(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo4758h(RecyclerView.C1070d0 d0Var) {
        C1158a aVar = this.f4053a.get(d0Var);
        return (aVar == null || (aVar.f4056a & 1) == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo4759i(RecyclerView.C1070d0 d0Var) {
        C1158a aVar = this.f4053a.get(d0Var);
        return (aVar == null || (aVar.f4056a & 4) == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo4760j() {
        C1158a.m5769a();
    }

    /* renamed from: k */
    public void mo4761k(RecyclerView.C1070d0 d0Var) {
        mo4765p(d0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public RecyclerView.C1078l.C1081c mo4762m(RecyclerView.C1070d0 d0Var) {
        return m5752l(d0Var, 8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public RecyclerView.C1078l.C1081c mo4763n(RecyclerView.C1070d0 d0Var) {
        return m5752l(d0Var, 4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo4764o(C1159b bVar) {
        RecyclerView.C1078l.C1081c cVar;
        RecyclerView.C1078l.C1081c cVar2;
        for (int size = this.f4053a.size() - 1; size >= 0; size--) {
            RecyclerView.C1070d0 i = this.f4053a.mo8789i(size);
            C1158a k = this.f4053a.mo8792k(size);
            int i2 = k.f4056a;
            if ((i2 & 3) != 3) {
                if ((i2 & 1) != 0) {
                    cVar = k.f4057b;
                    if (cVar != null) {
                        cVar2 = k.f4058c;
                    }
                } else {
                    if ((i2 & 14) != 14) {
                        if ((i2 & 12) == 12) {
                            bVar.mo4213d(i, k.f4057b, k.f4058c);
                        } else if ((i2 & 4) != 0) {
                            cVar = k.f4057b;
                            cVar2 = null;
                        } else if ((i2 & 8) == 0) {
                        }
                        C1158a.m5771c(k);
                    }
                    bVar.mo4211b(i, k.f4057b, k.f4058c);
                    C1158a.m5771c(k);
                }
                bVar.mo4212c(i, cVar, cVar2);
                C1158a.m5771c(k);
            }
            bVar.mo4210a(i);
            C1158a.m5771c(k);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo4765p(RecyclerView.C1070d0 d0Var) {
        C1158a aVar = this.f4053a.get(d0Var);
        if (aVar != null) {
            aVar.f4056a &= -2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo4766q(RecyclerView.C1070d0 d0Var) {
        int q = this.f4054b.mo8705q() - 1;
        while (true) {
            if (q < 0) {
                break;
            } else if (d0Var == this.f4054b.mo8706r(q)) {
                this.f4054b.mo8704p(q);
                break;
            } else {
                q--;
            }
        }
        C1158a remove = this.f4053a.remove(d0Var);
        if (remove != null) {
            C1158a.m5771c(remove);
        }
    }
}
