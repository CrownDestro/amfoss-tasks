package p100p;

import java.util.ArrayList;
import p088n.C2658d;
import p094o.C2827d;
import p094o.C2830e;
import p094o.C2833f;
import p094o.C2836h;
import p094o.C2838i;
import p094o.C2840k;
import p094o.C2841l;

/* renamed from: p.b */
public class C2885b {

    /* renamed from: a */
    private final ArrayList<C2830e> f9556a = new ArrayList<>();

    /* renamed from: b */
    private C2886a f9557b = new C2886a();

    /* renamed from: c */
    private C2833f f9558c;

    /* renamed from: p.b$a */
    public static class C2886a {

        /* renamed from: a */
        public C2830e.C2832b f9559a;

        /* renamed from: b */
        public C2830e.C2832b f9560b;

        /* renamed from: c */
        public int f9561c;

        /* renamed from: d */
        public int f9562d;

        /* renamed from: e */
        public int f9563e;

        /* renamed from: f */
        public int f9564f;

        /* renamed from: g */
        public int f9565g;

        /* renamed from: h */
        public boolean f9566h;

        /* renamed from: i */
        public boolean f9567i;

        /* renamed from: j */
        public boolean f9568j;
    }

    /* renamed from: p.b$b */
    public interface C2887b {
        /* renamed from: a */
        void mo2238a();

        /* renamed from: b */
        void mo2239b(C2830e eVar, C2886a aVar);
    }

    public C2885b(C2833f fVar) {
        this.f9558c = fVar;
    }

    /* renamed from: a */
    private boolean m13121a(C2887b bVar, C2830e eVar, boolean z) {
        this.f9557b.f9559a = eVar.mo9733y();
        this.f9557b.f9560b = eVar.mo9679M();
        this.f9557b.f9561c = eVar.mo9682P();
        this.f9557b.f9562d = eVar.mo9727v();
        C2886a aVar = this.f9557b;
        aVar.f9567i = false;
        aVar.f9568j = z;
        C2830e.C2832b bVar2 = aVar.f9559a;
        C2830e.C2832b bVar3 = C2830e.C2832b.MATCH_CONSTRAINT;
        boolean z2 = bVar2 == bVar3;
        boolean z3 = aVar.f9560b == bVar3;
        boolean z4 = z2 && eVar.f9208Q > 0.0f;
        boolean z5 = z3 && eVar.f9208Q > 0.0f;
        if (z4 && eVar.f9244n[0] == 4) {
            aVar.f9559a = C2830e.C2832b.FIXED;
        }
        if (z5 && eVar.f9244n[1] == 4) {
            aVar.f9560b = C2830e.C2832b.FIXED;
        }
        bVar.mo2239b(eVar, aVar);
        eVar.mo9666E0(this.f9557b.f9563e);
        eVar.mo9700h0(this.f9557b.f9564f);
        eVar.mo9699g0(this.f9557b.f9566h);
        eVar.mo9693b0(this.f9557b.f9565g);
        C2886a aVar2 = this.f9557b;
        aVar2.f9568j = false;
        return aVar2.f9567i;
    }

    /* renamed from: b */
    private void m13122b(C2833f fVar) {
        int size = fVar.f9361w0.size();
        C2887b U0 = fVar.mo9743U0();
        for (int i = 0; i < size; i++) {
            C2830e eVar = fVar.f9361w0.get(i);
            if (!(eVar instanceof C2836h) && (!eVar.f9226e.f9619e.f9589j || !eVar.f9228f.f9619e.f9589j)) {
                C2830e.C2832b s = eVar.mo9721s(0);
                boolean z = true;
                C2830e.C2832b s2 = eVar.mo9721s(1);
                C2830e.C2832b bVar = C2830e.C2832b.MATCH_CONSTRAINT;
                if (s != bVar || eVar.f9240l == 1 || s2 != bVar || eVar.f9242m == 1) {
                    z = false;
                }
                if (!z) {
                    m13121a(U0, eVar, false);
                }
            }
        }
        U0.mo2238a();
    }

    /* renamed from: c */
    private void m13123c(C2833f fVar, String str, int i, int i2) {
        int E = fVar.mo9665E();
        int D = fVar.mo9663D();
        fVar.mo9726u0(0);
        fVar.mo9724t0(0);
        fVar.mo9666E0(i);
        fVar.mo9700h0(i2);
        fVar.mo9726u0(E);
        fVar.mo9724t0(D);
        this.f9558c.mo9737K0();
    }

    /* renamed from: d */
    public long mo10029d(C2833f fVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10;
        boolean z;
        boolean z2;
        boolean z3;
        C2887b bVar;
        int i11;
        int i12;
        int i13;
        boolean z4;
        boolean z5;
        int i14;
        C2833f fVar2 = fVar;
        int i15 = i;
        int i16 = i4;
        int i17 = i6;
        C2887b U0 = fVar.mo9743U0();
        int size = fVar2.f9361w0.size();
        int P = fVar.mo9682P();
        int v = fVar.mo9727v();
        boolean b = C2840k.m12879b(i15, 128);
        boolean z6 = b || C2840k.m12879b(i15, 64);
        if (z6) {
            int i18 = 0;
            while (true) {
                if (i18 >= size) {
                    break;
                }
                C2830e eVar = fVar2.f9361w0.get(i18);
                C2830e.C2832b y = eVar.mo9733y();
                C2830e.C2832b bVar2 = C2830e.C2832b.MATCH_CONSTRAINT;
                boolean z7 = (y == bVar2) && (eVar.mo9679M() == bVar2) && eVar.mo9723t() > 0.0f;
                if ((!eVar.mo9687V() || !z7) && ((!eVar.mo9689X() || !z7) && !(eVar instanceof C2841l) && !eVar.mo9687V() && !eVar.mo9689X())) {
                    i18++;
                }
            }
            z6 = false;
        }
        if (z6) {
            boolean z8 = C2658d.f8920r;
        }
        if (z6 && ((i16 == 1073741824 && i17 == 1073741824) || b)) {
            int min = Math.min(fVar.mo9661C(), i5);
            int min2 = Math.min(fVar.mo9659B(), i7);
            if (i16 == 1073741824 && fVar.mo9682P() != min) {
                fVar2.mo9666E0(min);
                fVar.mo9746X0();
            }
            if (i17 == 1073741824 && fVar.mo9727v() != min2) {
                fVar2.mo9700h0(min2);
                fVar.mo9746X0();
            }
            if (i16 == 1073741824 && i17 == 1073741824) {
                z = fVar2.mo9740R0(b);
                i10 = 2;
            } else {
                boolean S0 = fVar2.mo9741S0(b);
                if (i16 == 1073741824) {
                    z5 = S0 & fVar2.mo9742T0(b, 0);
                    i14 = 1;
                } else {
                    z5 = S0;
                    i14 = 0;
                }
                if (i17 == 1073741824) {
                    boolean T0 = fVar2.mo9742T0(b, 1) & z5;
                    i10 = i14 + 1;
                    z = T0;
                } else {
                    i10 = i14;
                    z = z5;
                }
            }
            if (z) {
                fVar2.mo9674I0(i16 == 1073741824, i17 == 1073741824);
            }
        } else {
            z = false;
            i10 = 0;
        }
        if (z && i10 == 2) {
            return 0;
        }
        if (size > 0) {
            m13122b(fVar);
        }
        int V0 = fVar.mo9744V0();
        int size2 = this.f9556a.size();
        if (size > 0) {
            m13123c(fVar2, "First pass", P, v);
        }
        if (size2 > 0) {
            C2830e.C2832b y2 = fVar.mo9733y();
            C2830e.C2832b bVar3 = C2830e.C2832b.WRAP_CONTENT;
            boolean z9 = y2 == bVar3;
            boolean z10 = fVar.mo9679M() == bVar3;
            int max = Math.max(fVar.mo9682P(), this.f9558c.mo9665E());
            int max2 = Math.max(fVar.mo9727v(), this.f9558c.mo9663D());
            int i19 = 0;
            boolean z11 = false;
            while (i19 < size2) {
                C2830e eVar2 = this.f9556a.get(i19);
                if (!(eVar2 instanceof C2841l)) {
                    i13 = V0;
                } else {
                    int P2 = eVar2.mo9682P();
                    int v2 = eVar2.mo9727v();
                    i13 = V0;
                    boolean a = z11 | m13121a(U0, eVar2, true);
                    int P3 = eVar2.mo9682P();
                    boolean z12 = a;
                    int v3 = eVar2.mo9727v();
                    if (P3 != P2) {
                        eVar2.mo9666E0(P3);
                        if (z9 && eVar2.mo9673I() > max) {
                            max = Math.max(max, eVar2.mo9673I() + eVar2.mo9709m(C2827d.C2829b.RIGHT).mo9644c());
                        }
                        z4 = true;
                    } else {
                        z4 = z12;
                    }
                    if (v3 != v2) {
                        eVar2.mo9700h0(v3);
                        if (z10 && eVar2.mo9715p() > max2) {
                            max2 = Math.max(max2, eVar2.mo9715p() + eVar2.mo9709m(C2827d.C2829b.BOTTOM).mo9644c());
                        }
                        z4 = true;
                    }
                    z11 = z4 | ((C2841l) eVar2).mo9807V0();
                }
                i19++;
                V0 = i13;
            }
            int i20 = V0;
            int i21 = 0;
            while (i21 < 2) {
                int i22 = 0;
                while (i22 < size2) {
                    C2830e eVar3 = this.f9556a.get(i22);
                    if ((!(eVar3 instanceof C2838i) || (eVar3 instanceof C2841l)) && !(eVar3 instanceof C2836h) && eVar3.mo9681O() != 8 && ((!eVar3.f9226e.f9619e.f9589j || !eVar3.f9228f.f9619e.f9589j) && !(eVar3 instanceof C2841l))) {
                        int P4 = eVar3.mo9682P();
                        int v4 = eVar3.mo9727v();
                        i11 = size2;
                        int n = eVar3.mo9711n();
                        i12 = i21;
                        z11 |= m13121a(U0, eVar3, true);
                        int P5 = eVar3.mo9682P();
                        bVar = U0;
                        int v5 = eVar3.mo9727v();
                        if (P5 != P4) {
                            eVar3.mo9666E0(P5);
                            if (z9 && eVar3.mo9673I() > max) {
                                max = Math.max(max, eVar3.mo9673I() + eVar3.mo9709m(C2827d.C2829b.RIGHT).mo9644c());
                            }
                            z11 = true;
                        }
                        if (v5 != v4) {
                            eVar3.mo9700h0(v5);
                            if (z10 && eVar3.mo9715p() > max2) {
                                max2 = Math.max(max2, eVar3.mo9715p() + eVar3.mo9709m(C2827d.C2829b.BOTTOM).mo9644c());
                            }
                            z11 = true;
                        }
                        if (eVar3.mo9685S() && n != eVar3.mo9711n()) {
                            z11 = true;
                        }
                    } else {
                        i12 = i21;
                        i11 = size2;
                        bVar = U0;
                    }
                    i22++;
                    size2 = i11;
                    U0 = bVar;
                    i21 = i12;
                }
                int i23 = i21;
                int i24 = size2;
                C2887b bVar4 = U0;
                if (z11) {
                    m13123c(fVar2, "intermediate pass", P, v);
                    z11 = false;
                }
                i21 = i23 + 1;
                size2 = i24;
                U0 = bVar4;
            }
            if (z11) {
                m13123c(fVar2, "2nd pass", P, v);
                if (fVar.mo9682P() < max) {
                    fVar2.mo9666E0(max);
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (fVar.mo9727v() < max2) {
                    fVar2.mo9700h0(max2);
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (z3) {
                    m13123c(fVar2, "3rd pass", P, v);
                }
            }
            V0 = i20;
        }
        fVar2.mo9754g1(V0);
        return 0;
    }

    /* renamed from: e */
    public void mo10030e(C2833f fVar) {
        C2830e.C2832b bVar;
        this.f9556a.clear();
        int size = fVar.f9361w0.size();
        for (int i = 0; i < size; i++) {
            C2830e eVar = fVar.f9361w0.get(i);
            C2830e.C2832b y = eVar.mo9733y();
            C2830e.C2832b bVar2 = C2830e.C2832b.MATCH_CONSTRAINT;
            if (y == bVar2 || eVar.mo9733y() == (bVar = C2830e.C2832b.MATCH_PARENT) || eVar.mo9679M() == bVar2 || eVar.mo9679M() == bVar) {
                this.f9556a.add(eVar);
            }
        }
        fVar.mo9746X0();
    }
}
