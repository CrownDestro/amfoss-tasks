package p088n;

import java.util.ArrayList;
import java.util.Iterator;
import p088n.C2658d;
import p088n.C2667i;

/* renamed from: n.b */
public class C2655b implements C2658d.C2659a {

    /* renamed from: a */
    C2667i f8909a = null;

    /* renamed from: b */
    float f8910b = 0.0f;

    /* renamed from: c */
    boolean f8911c = false;

    /* renamed from: d */
    ArrayList<C2667i> f8912d = new ArrayList<>();

    /* renamed from: e */
    public C2656a f8913e;

    /* renamed from: f */
    boolean f8914f = false;

    /* renamed from: n.b$a */
    public interface C2656a {
        /* renamed from: a */
        float mo9333a(int i);

        /* renamed from: b */
        float mo9334b(C2667i iVar);

        /* renamed from: c */
        void mo9335c(C2667i iVar, float f, boolean z);

        void clear();

        /* renamed from: d */
        float mo9337d(C2655b bVar, boolean z);

        /* renamed from: e */
        boolean mo9338e(C2667i iVar);

        /* renamed from: f */
        C2667i mo9339f(int i);

        /* renamed from: g */
        void mo9340g(C2667i iVar, float f);

        /* renamed from: h */
        void mo9341h(float f);

        /* renamed from: i */
        float mo9342i(C2667i iVar, boolean z);

        /* renamed from: j */
        void mo9343j();

        /* renamed from: k */
        int mo9344k();
    }

    public C2655b() {
    }

    public C2655b(C2657c cVar) {
        this.f8913e = new C2654a(this, cVar);
    }

    /* renamed from: v */
    private boolean m12066v(C2667i iVar, C2658d dVar) {
        return iVar.f8965m <= 1;
    }

    /* renamed from: x */
    private C2667i m12067x(boolean[] zArr, C2667i iVar) {
        C2667i.C2668a aVar;
        int k = this.f8913e.mo9344k();
        C2667i iVar2 = null;
        float f = 0.0f;
        for (int i = 0; i < k; i++) {
            float a = this.f8913e.mo9333a(i);
            if (a < 0.0f) {
                C2667i f2 = this.f8913e.mo9339f(i);
                if ((zArr == null || !zArr[f2.f8955c]) && f2 != iVar && (((aVar = f2.f8962j) == C2667i.C2668a.SLACK || aVar == C2667i.C2668a.ERROR) && a < f)) {
                    f = a;
                    iVar2 = f2;
                }
            }
        }
        return iVar2;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bb  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo9346A() {
        /*
            r9 = this;
            n.i r0 = r9.f8909a
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0014
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            goto L_0x0021
        L_0x0014:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            n.i r1 = r9.f8909a
            r0.append(r1)
        L_0x0021:
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r9.f8910b
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0052
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r9.f8910b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L_0x0053
        L_0x0052:
            r1 = 0
        L_0x0053:
            n.b$a r5 = r9.f8913e
            int r5 = r5.mo9344k()
        L_0x0059:
            if (r2 >= r5) goto L_0x00d6
            n.b$a r6 = r9.f8913e
            n.i r6 = r6.mo9339f(r2)
            if (r6 != 0) goto L_0x0064
            goto L_0x00d3
        L_0x0064:
            n.b$a r7 = r9.f8913e
            float r7 = r7.mo9333a(r2)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x006f
            goto L_0x00d3
        L_0x006f:
            java.lang.String r6 = r6.toString()
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0086
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x00af
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            goto L_0x00a6
        L_0x0086:
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x009c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00af
        L_0x009c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
        L_0x00a6:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r7 = r7 * r8
        L_0x00af:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00bb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L_0x00c8
        L_0x00bb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        L_0x00c8:
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            r1 = 1
        L_0x00d3:
            int r2 = r2 + 1
            goto L_0x0059
        L_0x00d6:
            if (r1 != 0) goto L_0x00e9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00e9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p088n.C2655b.mo9346A():java.lang.String");
    }

    /* renamed from: B */
    public void mo9347B(C2658d dVar, C2667i iVar, boolean z) {
        if (iVar.f8959g) {
            this.f8910b += iVar.f8958f * this.f8913e.mo9334b(iVar);
            this.f8913e.mo9342i(iVar, z);
            if (z) {
                iVar.mo9411c(this);
            }
        }
    }

    /* renamed from: C */
    public void mo9348C(C2655b bVar, boolean z) {
        this.f8910b += bVar.f8910b * this.f8913e.mo9337d(bVar, z);
        if (z) {
            bVar.f8909a.mo9411c(this);
        }
    }

    /* renamed from: D */
    public void mo9349D(C2658d dVar) {
        if (dVar.f8928f.length != 0) {
            boolean z = false;
            while (!z) {
                int k = this.f8913e.mo9344k();
                for (int i = 0; i < k; i++) {
                    C2667i f = this.f8913e.mo9339f(i);
                    if (f.f8956d != -1 || f.f8959g) {
                        this.f8912d.add(f);
                    }
                }
                if (this.f8912d.size() > 0) {
                    Iterator<C2667i> it = this.f8912d.iterator();
                    while (it.hasNext()) {
                        C2667i next = it.next();
                        if (next.f8959g) {
                            mo9347B(dVar, next, true);
                        } else {
                            mo9348C(dVar.f8928f[next.f8956d], true);
                        }
                    }
                    this.f8912d.clear();
                } else {
                    z = true;
                }
            }
        }
    }

    /* renamed from: a */
    public C2667i mo9350a(C2658d dVar, boolean[] zArr) {
        return m12067x(zArr, (C2667i) null);
    }

    /* renamed from: b */
    public void mo9351b(C2667i iVar) {
        int i = iVar.f8957e;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.f8913e.mo9340g(iVar, f);
    }

    /* renamed from: c */
    public void mo9352c(C2658d.C2659a aVar) {
        if (aVar instanceof C2655b) {
            C2655b bVar = (C2655b) aVar;
            this.f8909a = null;
            this.f8913e.clear();
            for (int i = 0; i < bVar.f8913e.mo9344k(); i++) {
                this.f8913e.mo9335c(bVar.f8913e.mo9339f(i), bVar.f8913e.mo9333a(i), true);
            }
        }
    }

    public void clear() {
        this.f8913e.clear();
        this.f8909a = null;
        this.f8910b = 0.0f;
    }

    /* renamed from: d */
    public C2655b mo9354d(C2658d dVar, int i) {
        this.f8913e.mo9340g(dVar.mo9390o(i, "ep"), 1.0f);
        this.f8913e.mo9340g(dVar.mo9390o(i, "em"), -1.0f);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C2655b mo9355e(C2667i iVar, int i) {
        this.f8913e.mo9340g(iVar, (float) i);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo9356f(C2658d dVar) {
        boolean z;
        C2667i g = mo9357g(dVar);
        if (g == null) {
            z = true;
        } else {
            mo9375y(g);
            z = false;
        }
        if (this.f8913e.mo9344k() == 0) {
            this.f8914f = true;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C2667i mo9357g(C2658d dVar) {
        int k = this.f8913e.mo9344k();
        C2667i iVar = null;
        C2667i iVar2 = null;
        boolean z = false;
        boolean z2 = false;
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = 0; i < k; i++) {
            float a = this.f8913e.mo9333a(i);
            C2667i f3 = this.f8913e.mo9339f(i);
            if (f3.f8962j == C2667i.C2668a.UNRESTRICTED) {
                if (iVar == null || f > a) {
                    z = m12066v(f3, dVar);
                    f = a;
                    iVar = f3;
                } else if (!z && m12066v(f3, dVar)) {
                    f = a;
                    iVar = f3;
                    z = true;
                }
            } else if (iVar == null && a < 0.0f) {
                if (iVar2 == null || f2 > a) {
                    z2 = m12066v(f3, dVar);
                    f2 = a;
                    iVar2 = f3;
                } else if (!z2 && m12066v(f3, dVar)) {
                    f2 = a;
                    iVar2 = f3;
                    z2 = true;
                }
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    public C2667i getKey() {
        return this.f8909a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C2655b mo9359h(C2667i iVar, C2667i iVar2, int i, float f, C2667i iVar3, C2667i iVar4, int i2) {
        float f2;
        int i3;
        if (iVar2 == iVar3) {
            this.f8913e.mo9340g(iVar, 1.0f);
            this.f8913e.mo9340g(iVar4, 1.0f);
            this.f8913e.mo9340g(iVar2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.f8913e.mo9340g(iVar, 1.0f);
            this.f8913e.mo9340g(iVar2, -1.0f);
            this.f8913e.mo9340g(iVar3, -1.0f);
            this.f8913e.mo9340g(iVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                i3 = (-i) + i2;
            }
            return this;
        }
        if (f <= 0.0f) {
            this.f8913e.mo9340g(iVar, -1.0f);
            this.f8913e.mo9340g(iVar2, 1.0f);
            f2 = (float) i;
        } else if (f >= 1.0f) {
            this.f8913e.mo9340g(iVar4, -1.0f);
            this.f8913e.mo9340g(iVar3, 1.0f);
            i3 = -i2;
        } else {
            float f3 = 1.0f - f;
            this.f8913e.mo9340g(iVar, f3 * 1.0f);
            this.f8913e.mo9340g(iVar2, f3 * -1.0f);
            this.f8913e.mo9340g(iVar3, -1.0f * f);
            this.f8913e.mo9340g(iVar4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                f2 = (((float) (-i)) * f3) + (((float) i2) * f);
            }
            return this;
        }
        this.f8910b = f2;
        return this;
        f2 = (float) i3;
        this.f8910b = f2;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C2655b mo9360i(C2667i iVar, int i) {
        this.f8909a = iVar;
        float f = (float) i;
        iVar.f8958f = f;
        this.f8910b = f;
        this.f8914f = true;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C2655b mo9361j(C2667i iVar, C2667i iVar2, float f) {
        this.f8913e.mo9340g(iVar, -1.0f);
        this.f8913e.mo9340g(iVar2, f);
        return this;
    }

    /* renamed from: k */
    public C2655b mo9362k(C2667i iVar, C2667i iVar2, C2667i iVar3, C2667i iVar4, float f) {
        this.f8913e.mo9340g(iVar, -1.0f);
        this.f8913e.mo9340g(iVar2, 1.0f);
        this.f8913e.mo9340g(iVar3, f);
        this.f8913e.mo9340g(iVar4, -f);
        return this;
    }

    /* renamed from: l */
    public C2655b mo9363l(float f, float f2, float f3, C2667i iVar, C2667i iVar2, C2667i iVar3, C2667i iVar4) {
        this.f8910b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.f8913e.mo9340g(iVar, 1.0f);
            this.f8913e.mo9340g(iVar2, -1.0f);
            this.f8913e.mo9340g(iVar4, 1.0f);
            this.f8913e.mo9340g(iVar3, -1.0f);
        } else if (f == 0.0f) {
            this.f8913e.mo9340g(iVar, 1.0f);
            this.f8913e.mo9340g(iVar2, -1.0f);
        } else if (f3 == 0.0f) {
            this.f8913e.mo9340g(iVar3, 1.0f);
            this.f8913e.mo9340g(iVar4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f8913e.mo9340g(iVar, 1.0f);
            this.f8913e.mo9340g(iVar2, -1.0f);
            this.f8913e.mo9340g(iVar4, f4);
            this.f8913e.mo9340g(iVar3, -f4);
        }
        return this;
    }

    /* renamed from: m */
    public C2655b mo9364m(C2667i iVar, int i) {
        C2656a aVar;
        float f;
        if (i < 0) {
            this.f8910b = (float) (i * -1);
            aVar = this.f8913e;
            f = 1.0f;
        } else {
            this.f8910b = (float) i;
            aVar = this.f8913e;
            f = -1.0f;
        }
        aVar.mo9340g(iVar, f);
        return this;
    }

    /* renamed from: n */
    public C2655b mo9365n(C2667i iVar, C2667i iVar2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f8910b = (float) i;
        }
        if (!z) {
            this.f8913e.mo9340g(iVar, -1.0f);
            this.f8913e.mo9340g(iVar2, 1.0f);
        } else {
            this.f8913e.mo9340g(iVar, 1.0f);
            this.f8913e.mo9340g(iVar2, -1.0f);
        }
        return this;
    }

    /* renamed from: o */
    public C2655b mo9366o(C2667i iVar, C2667i iVar2, C2667i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f8910b = (float) i;
        }
        if (!z) {
            this.f8913e.mo9340g(iVar, -1.0f);
            this.f8913e.mo9340g(iVar2, 1.0f);
            this.f8913e.mo9340g(iVar3, 1.0f);
        } else {
            this.f8913e.mo9340g(iVar, 1.0f);
            this.f8913e.mo9340g(iVar2, -1.0f);
            this.f8913e.mo9340g(iVar3, -1.0f);
        }
        return this;
    }

    /* renamed from: p */
    public C2655b mo9367p(C2667i iVar, C2667i iVar2, C2667i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f8910b = (float) i;
        }
        if (!z) {
            this.f8913e.mo9340g(iVar, -1.0f);
            this.f8913e.mo9340g(iVar2, 1.0f);
            this.f8913e.mo9340g(iVar3, -1.0f);
        } else {
            this.f8913e.mo9340g(iVar, 1.0f);
            this.f8913e.mo9340g(iVar2, -1.0f);
            this.f8913e.mo9340g(iVar3, 1.0f);
        }
        return this;
    }

    /* renamed from: q */
    public C2655b mo9368q(C2667i iVar, C2667i iVar2, C2667i iVar3, C2667i iVar4, float f) {
        this.f8913e.mo9340g(iVar3, 0.5f);
        this.f8913e.mo9340g(iVar4, 0.5f);
        this.f8913e.mo9340g(iVar, -0.5f);
        this.f8913e.mo9340g(iVar2, -0.5f);
        this.f8910b = -f;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo9369r() {
        float f = this.f8910b;
        if (f < 0.0f) {
            this.f8910b = f * -1.0f;
            this.f8913e.mo9343j();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo9370s() {
        C2667i iVar = this.f8909a;
        return iVar != null && (iVar.f8962j == C2667i.C2668a.UNRESTRICTED || this.f8910b >= 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo9371t(C2667i iVar) {
        return this.f8913e.mo9338e(iVar);
    }

    public String toString() {
        return mo9346A();
    }

    /* renamed from: u */
    public boolean mo9373u() {
        return this.f8909a == null && this.f8910b == 0.0f && this.f8913e.mo9344k() == 0;
    }

    /* renamed from: w */
    public C2667i mo9374w(C2667i iVar) {
        return m12067x((boolean[]) null, iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo9375y(C2667i iVar) {
        C2667i iVar2 = this.f8909a;
        if (iVar2 != null) {
            this.f8913e.mo9340g(iVar2, -1.0f);
            this.f8909a = null;
        }
        float i = this.f8913e.mo9342i(iVar, true) * -1.0f;
        this.f8909a = iVar;
        if (i != 1.0f) {
            this.f8910b /= i;
            this.f8913e.mo9341h(i);
        }
    }

    /* renamed from: z */
    public void mo9376z() {
        this.f8909a = null;
        this.f8913e.clear();
        this.f8910b = 0.0f;
        this.f8914f = false;
    }
}
