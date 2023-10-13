package p088n;

import java.util.Arrays;
import java.util.HashMap;
import p088n.C2667i;
import p094o.C2827d;
import p094o.C2830e;

/* renamed from: n.d */
public class C2658d {

    /* renamed from: q */
    private static int f8919q = 1000;

    /* renamed from: r */
    public static boolean f8920r = true;

    /* renamed from: s */
    public static long f8921s;

    /* renamed from: t */
    public static long f8922t;

    /* renamed from: a */
    int f8923a;

    /* renamed from: b */
    private HashMap<String, C2667i> f8924b;

    /* renamed from: c */
    private C2659a f8925c;

    /* renamed from: d */
    private int f8926d;

    /* renamed from: e */
    private int f8927e;

    /* renamed from: f */
    C2655b[] f8928f;

    /* renamed from: g */
    public boolean f8929g;

    /* renamed from: h */
    public boolean f8930h;

    /* renamed from: i */
    private boolean[] f8931i;

    /* renamed from: j */
    int f8932j;

    /* renamed from: k */
    int f8933k;

    /* renamed from: l */
    private int f8934l;

    /* renamed from: m */
    final C2657c f8935m;

    /* renamed from: n */
    private C2667i[] f8936n;

    /* renamed from: o */
    private int f8937o;

    /* renamed from: p */
    private C2659a f8938p;

    /* renamed from: n.d$a */
    interface C2659a {
        /* renamed from: a */
        C2667i mo9350a(C2658d dVar, boolean[] zArr);

        /* renamed from: b */
        void mo9351b(C2667i iVar);

        /* renamed from: c */
        void mo9352c(C2659a aVar);

        void clear();

        C2667i getKey();
    }

    /* renamed from: n.d$b */
    class C2660b extends C2655b {
        public C2660b(C2657c cVar) {
            this.f8913e = new C2669j(this, cVar);
        }
    }

    public C2658d() {
        this.f8923a = 0;
        this.f8924b = null;
        this.f8926d = 32;
        this.f8927e = 32;
        this.f8928f = null;
        this.f8929g = false;
        this.f8930h = false;
        this.f8931i = new boolean[32];
        this.f8932j = 1;
        this.f8933k = 0;
        this.f8934l = 32;
        this.f8936n = new C2667i[f8919q];
        this.f8937o = 0;
        this.f8928f = new C2655b[32];
        m12108C();
        C2657c cVar = new C2657c();
        this.f8935m = cVar;
        this.f8925c = new C2664h(cVar);
        this.f8938p = f8920r ? new C2660b(cVar) : new C2655b(cVar);
    }

    /* renamed from: B */
    private final int m12107B(C2659a aVar, boolean z) {
        for (int i = 0; i < this.f8932j; i++) {
            this.f8931i[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            i2++;
            if (i2 >= this.f8932j * 2) {
                return i2;
            }
            if (aVar.getKey() != null) {
                this.f8931i[aVar.getKey().f8955c] = true;
            }
            C2667i a = aVar.mo9350a(this, this.f8931i);
            if (a != null) {
                boolean[] zArr = this.f8931i;
                int i3 = a.f8955c;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (a != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f8933k; i5++) {
                    C2655b bVar = this.f8928f[i5];
                    if (bVar.f8909a.f8962j != C2667i.C2668a.UNRESTRICTED && !bVar.f8914f && bVar.mo9371t(a)) {
                        float b = bVar.f8913e.mo9334b(a);
                        if (b < 0.0f) {
                            float f2 = (-bVar.f8910b) / b;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C2655b bVar2 = this.f8928f[i4];
                    bVar2.f8909a.f8956d = -1;
                    bVar2.mo9375y(a);
                    C2667i iVar = bVar2.f8909a;
                    iVar.f8956d = i4;
                    iVar.mo9415g(bVar2);
                }
            } else {
                z2 = true;
            }
        }
        return i2;
    }

    /* renamed from: C */
    private void m12108C() {
        int i = 0;
        if (f8920r) {
            while (true) {
                C2655b[] bVarArr = this.f8928f;
                if (i < bVarArr.length) {
                    C2655b bVar = bVarArr[i];
                    if (bVar != null) {
                        this.f8935m.f8915a.mo9398a(bVar);
                    }
                    this.f8928f[i] = null;
                    i++;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                C2655b[] bVarArr2 = this.f8928f;
                if (i < bVarArr2.length) {
                    C2655b bVar2 = bVarArr2[i];
                    if (bVar2 != null) {
                        this.f8935m.f8916b.mo9398a(bVar2);
                    }
                    this.f8928f[i] = null;
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private C2667i m12109a(C2667i.C2668a aVar, String str) {
        C2667i b = this.f8935m.f8917c.mo9399b();
        if (b == null) {
            b = new C2667i(aVar, str);
        } else {
            b.mo9412d();
        }
        b.mo9414f(aVar, str);
        int i = this.f8937o;
        int i2 = f8919q;
        if (i >= i2) {
            int i3 = i2 * 2;
            f8919q = i3;
            this.f8936n = (C2667i[]) Arrays.copyOf(this.f8936n, i3);
        }
        C2667i[] iVarArr = this.f8936n;
        int i4 = this.f8937o;
        this.f8937o = i4 + 1;
        iVarArr[i4] = b;
        return b;
    }

    /* renamed from: l */
    private final void m12110l(C2655b bVar) {
        C2662f<C2655b> fVar;
        C2655b bVar2;
        if (f8920r) {
            C2655b[] bVarArr = this.f8928f;
            int i = this.f8933k;
            if (bVarArr[i] != null) {
                fVar = this.f8935m.f8915a;
                bVar2 = bVarArr[i];
            }
            C2655b[] bVarArr2 = this.f8928f;
            int i2 = this.f8933k;
            bVarArr2[i2] = bVar;
            C2667i iVar = bVar.f8909a;
            iVar.f8956d = i2;
            this.f8933k = i2 + 1;
            iVar.mo9415g(bVar);
        }
        C2655b[] bVarArr3 = this.f8928f;
        int i3 = this.f8933k;
        if (bVarArr3[i3] != null) {
            fVar = this.f8935m.f8916b;
            bVar2 = bVarArr3[i3];
        }
        C2655b[] bVarArr22 = this.f8928f;
        int i22 = this.f8933k;
        bVarArr22[i22] = bVar;
        C2667i iVar2 = bVar.f8909a;
        iVar2.f8956d = i22;
        this.f8933k = i22 + 1;
        iVar2.mo9415g(bVar);
        fVar.mo9398a(bVar2);
        C2655b[] bVarArr222 = this.f8928f;
        int i222 = this.f8933k;
        bVarArr222[i222] = bVar;
        C2667i iVar22 = bVar.f8909a;
        iVar22.f8956d = i222;
        this.f8933k = i222 + 1;
        iVar22.mo9415g(bVar);
    }

    /* renamed from: n */
    private void m12111n() {
        for (int i = 0; i < this.f8933k; i++) {
            C2655b bVar = this.f8928f[i];
            bVar.f8909a.f8958f = bVar.f8910b;
        }
    }

    /* renamed from: s */
    public static C2655b m12112s(C2658d dVar, C2667i iVar, C2667i iVar2, float f) {
        return dVar.mo9393r().mo9361j(iVar, iVar2, f);
    }

    /* renamed from: u */
    private int m12113u(C2659a aVar) {
        float f;
        boolean z;
        int i = 0;
        while (true) {
            f = 0.0f;
            if (i >= this.f8933k) {
                z = false;
                break;
            }
            C2655b[] bVarArr = this.f8928f;
            if (bVarArr[i].f8909a.f8962j != C2667i.C2668a.UNRESTRICTED && bVarArr[i].f8910b < 0.0f) {
                z = true;
                break;
            }
            i++;
        }
        if (!z) {
            return 0;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            i2++;
            float f2 = Float.MAX_VALUE;
            int i3 = 0;
            int i4 = -1;
            int i5 = -1;
            int i6 = 0;
            while (i3 < this.f8933k) {
                C2655b bVar = this.f8928f[i3];
                if (bVar.f8909a.f8962j != C2667i.C2668a.UNRESTRICTED && !bVar.f8914f && bVar.f8910b < f) {
                    int i7 = 1;
                    while (i7 < this.f8932j) {
                        C2667i iVar = this.f8935m.f8918d[i7];
                        float b = bVar.f8913e.mo9334b(iVar);
                        if (b > f) {
                            for (int i8 = 0; i8 < 9; i8++) {
                                float f3 = iVar.f8960h[i8] / b;
                                if ((f3 < f2 && i8 == i6) || i8 > i6) {
                                    i6 = i8;
                                    f2 = f3;
                                    i4 = i3;
                                    i5 = i7;
                                }
                            }
                        }
                        i7++;
                        f = 0.0f;
                    }
                }
                i3++;
                f = 0.0f;
            }
            if (i4 != -1) {
                C2655b bVar2 = this.f8928f[i4];
                bVar2.f8909a.f8956d = -1;
                bVar2.mo9375y(this.f8935m.f8918d[i5]);
                C2667i iVar2 = bVar2.f8909a;
                iVar2.f8956d = i4;
                iVar2.mo9415g(bVar2);
            } else {
                z2 = true;
            }
            if (i2 > this.f8932j / 2) {
                z2 = true;
            }
            f = 0.0f;
        }
        return i2;
    }

    /* renamed from: w */
    public static C2661e m12114w() {
        return null;
    }

    /* renamed from: y */
    private void m12115y() {
        int i = this.f8926d * 2;
        this.f8926d = i;
        this.f8928f = (C2655b[]) Arrays.copyOf(this.f8928f, i);
        C2657c cVar = this.f8935m;
        cVar.f8918d = (C2667i[]) Arrays.copyOf(cVar.f8918d, this.f8926d);
        int i2 = this.f8926d;
        this.f8931i = new boolean[i2];
        this.f8927e = i2;
        this.f8934l = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo9377A(C2659a aVar) {
        m12113u(aVar);
        m12107B(aVar, false);
        m12111n();
    }

    /* renamed from: D */
    public void mo9378D() {
        C2657c cVar;
        int i = 0;
        while (true) {
            cVar = this.f8935m;
            C2667i[] iVarArr = cVar.f8918d;
            if (i >= iVarArr.length) {
                break;
            }
            C2667i iVar = iVarArr[i];
            if (iVar != null) {
                iVar.mo9412d();
            }
            i++;
        }
        cVar.f8917c.mo9400c(this.f8936n, this.f8937o);
        this.f8937o = 0;
        Arrays.fill(this.f8935m.f8918d, (Object) null);
        HashMap<String, C2667i> hashMap = this.f8924b;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f8923a = 0;
        this.f8925c.clear();
        this.f8932j = 1;
        for (int i2 = 0; i2 < this.f8933k; i2++) {
            this.f8928f[i2].f8911c = false;
        }
        m12108C();
        this.f8933k = 0;
        this.f8938p = f8920r ? new C2660b(this.f8935m) : new C2655b(this.f8935m);
    }

    /* renamed from: b */
    public void mo9379b(C2830e eVar, C2830e eVar2, float f, int i) {
        C2830e eVar3 = eVar;
        C2830e eVar4 = eVar2;
        C2827d.C2829b bVar = C2827d.C2829b.LEFT;
        C2667i q = mo9392q(eVar3.mo9709m(bVar));
        C2827d.C2829b bVar2 = C2827d.C2829b.TOP;
        C2667i q2 = mo9392q(eVar3.mo9709m(bVar2));
        C2827d.C2829b bVar3 = C2827d.C2829b.RIGHT;
        C2667i q3 = mo9392q(eVar3.mo9709m(bVar3));
        C2827d.C2829b bVar4 = C2827d.C2829b.BOTTOM;
        C2667i q4 = mo9392q(eVar3.mo9709m(bVar4));
        C2667i q5 = mo9392q(eVar4.mo9709m(bVar));
        C2667i q6 = mo9392q(eVar4.mo9709m(bVar2));
        C2667i q7 = mo9392q(eVar4.mo9709m(bVar3));
        C2667i q8 = mo9392q(eVar4.mo9709m(bVar4));
        C2655b r = mo9393r();
        double d = (double) f;
        double sin = Math.sin(d);
        C2667i iVar = q7;
        double d2 = (double) i;
        Double.isNaN(d2);
        r.mo9368q(q2, q4, q6, q8, (float) (sin * d2));
        mo9381d(r);
        C2655b r2 = mo9393r();
        double cos = Math.cos(d);
        Double.isNaN(d2);
        r2.mo9368q(q, q3, q5, iVar, (float) (cos * d2));
        mo9381d(r2);
    }

    /* renamed from: c */
    public void mo9380c(C2667i iVar, C2667i iVar2, int i, float f, C2667i iVar3, C2667i iVar4, int i2, int i3) {
        int i4 = i3;
        C2655b r = mo9393r();
        r.mo9359h(iVar, iVar2, i, f, iVar3, iVar4, i2);
        if (i4 != 8) {
            r.mo9354d(this, i4);
        }
        mo9381d(r);
    }

    /* renamed from: d */
    public void mo9381d(C2655b bVar) {
        C2667i w;
        if (bVar != null) {
            boolean z = true;
            if (this.f8933k + 1 >= this.f8934l || this.f8932j + 1 >= this.f8927e) {
                m12115y();
            }
            boolean z2 = false;
            if (!bVar.f8914f) {
                bVar.mo9349D(this);
                if (!bVar.mo9373u()) {
                    bVar.mo9369r();
                    if (bVar.mo9356f(this)) {
                        C2667i p = mo9391p();
                        bVar.f8909a = p;
                        m12110l(bVar);
                        this.f8938p.mo9352c(bVar);
                        m12107B(this.f8938p, true);
                        if (p.f8956d == -1) {
                            if (bVar.f8909a == p && (w = bVar.mo9374w(p)) != null) {
                                bVar.mo9375y(w);
                            }
                            if (!bVar.f8914f) {
                                bVar.f8909a.mo9415g(bVar);
                            }
                            this.f8933k--;
                        }
                    } else {
                        z = false;
                    }
                    if (bVar.mo9370s()) {
                        z2 = z;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!z2) {
                m12110l(bVar);
            }
        }
    }

    /* renamed from: e */
    public C2655b mo9382e(C2667i iVar, C2667i iVar2, int i, int i2) {
        if (i2 == 8 && iVar2.f8959g && iVar.f8956d == -1) {
            iVar.mo9413e(this, iVar2.f8958f + ((float) i));
            return null;
        }
        C2655b r = mo9393r();
        r.mo9365n(iVar, iVar2, i);
        if (i2 != 8) {
            r.mo9354d(this, i2);
        }
        mo9381d(r);
        return r;
    }

    /* renamed from: f */
    public void mo9383f(C2667i iVar, int i) {
        C2655b bVar;
        int i2 = iVar.f8956d;
        if (i2 == -1) {
            iVar.mo9413e(this, (float) i);
            return;
        }
        if (i2 != -1) {
            C2655b bVar2 = this.f8928f[i2];
            if (!bVar2.f8914f) {
                if (bVar2.f8913e.mo9344k() == 0) {
                    bVar2.f8914f = true;
                } else {
                    bVar = mo9393r();
                    bVar.mo9364m(iVar, i);
                }
            }
            bVar2.f8910b = (float) i;
            return;
        }
        bVar = mo9393r();
        bVar.mo9360i(iVar, i);
        mo9381d(bVar);
    }

    /* renamed from: g */
    public void mo9384g(C2667i iVar, C2667i iVar2, int i, boolean z) {
        C2655b r = mo9393r();
        C2667i t = mo9394t();
        t.f8957e = 0;
        r.mo9366o(iVar, iVar2, t, i);
        mo9381d(r);
    }

    /* renamed from: h */
    public void mo9385h(C2667i iVar, C2667i iVar2, int i, int i2) {
        C2655b r = mo9393r();
        C2667i t = mo9394t();
        t.f8957e = 0;
        r.mo9366o(iVar, iVar2, t, i);
        if (i2 != 8) {
            mo9389m(r, (int) (r.f8913e.mo9334b(t) * -1.0f), i2);
        }
        mo9381d(r);
    }

    /* renamed from: i */
    public void mo9386i(C2667i iVar, C2667i iVar2, int i, boolean z) {
        C2655b r = mo9393r();
        C2667i t = mo9394t();
        t.f8957e = 0;
        r.mo9367p(iVar, iVar2, t, i);
        mo9381d(r);
    }

    /* renamed from: j */
    public void mo9387j(C2667i iVar, C2667i iVar2, int i, int i2) {
        C2655b r = mo9393r();
        C2667i t = mo9394t();
        t.f8957e = 0;
        r.mo9367p(iVar, iVar2, t, i);
        if (i2 != 8) {
            mo9389m(r, (int) (r.f8913e.mo9334b(t) * -1.0f), i2);
        }
        mo9381d(r);
    }

    /* renamed from: k */
    public void mo9388k(C2667i iVar, C2667i iVar2, C2667i iVar3, C2667i iVar4, float f, int i) {
        C2655b r = mo9393r();
        r.mo9362k(iVar, iVar2, iVar3, iVar4, f);
        if (i != 8) {
            r.mo9354d(this, i);
        }
        mo9381d(r);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo9389m(C2655b bVar, int i, int i2) {
        bVar.mo9355e(mo9390o(i2, (String) null), i);
    }

    /* renamed from: o */
    public C2667i mo9390o(int i, String str) {
        if (this.f8932j + 1 >= this.f8927e) {
            m12115y();
        }
        C2667i a = m12109a(C2667i.C2668a.ERROR, str);
        int i2 = this.f8923a + 1;
        this.f8923a = i2;
        this.f8932j++;
        a.f8955c = i2;
        a.f8957e = i;
        this.f8935m.f8918d[i2] = a;
        this.f8925c.mo9351b(a);
        return a;
    }

    /* renamed from: p */
    public C2667i mo9391p() {
        if (this.f8932j + 1 >= this.f8927e) {
            m12115y();
        }
        C2667i a = m12109a(C2667i.C2668a.SLACK, (String) null);
        int i = this.f8923a + 1;
        this.f8923a = i;
        this.f8932j++;
        a.f8955c = i;
        this.f8935m.f8918d[i] = a;
        return a;
    }

    /* renamed from: q */
    public C2667i mo9392q(Object obj) {
        C2667i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f8932j + 1 >= this.f8927e) {
            m12115y();
        }
        if (obj instanceof C2827d) {
            C2827d dVar = (C2827d) obj;
            iVar = dVar.mo9647f();
            if (iVar == null) {
                dVar.mo9654m(this.f8935m);
                iVar = dVar.mo9647f();
            }
            int i = iVar.f8955c;
            if (i == -1 || i > this.f8923a || this.f8935m.f8918d[i] == null) {
                if (i != -1) {
                    iVar.mo9412d();
                }
                int i2 = this.f8923a + 1;
                this.f8923a = i2;
                this.f8932j++;
                iVar.f8955c = i2;
                iVar.f8962j = C2667i.C2668a.UNRESTRICTED;
                this.f8935m.f8918d[i2] = iVar;
            }
        }
        return iVar;
    }

    /* renamed from: r */
    public C2655b mo9393r() {
        C2655b bVar;
        if (f8920r) {
            bVar = this.f8935m.f8915a.mo9399b();
            if (bVar == null) {
                bVar = new C2660b(this.f8935m);
                f8922t++;
                C2667i.m12158b();
                return bVar;
            }
        } else {
            bVar = this.f8935m.f8916b.mo9399b();
            if (bVar == null) {
                bVar = new C2655b(this.f8935m);
                f8921s++;
                C2667i.m12158b();
                return bVar;
            }
        }
        bVar.mo9376z();
        C2667i.m12158b();
        return bVar;
    }

    /* renamed from: t */
    public C2667i mo9394t() {
        if (this.f8932j + 1 >= this.f8927e) {
            m12115y();
        }
        C2667i a = m12109a(C2667i.C2668a.SLACK, (String) null);
        int i = this.f8923a + 1;
        this.f8923a = i;
        this.f8932j++;
        a.f8955c = i;
        this.f8935m.f8918d[i] = a;
        return a;
    }

    /* renamed from: v */
    public C2657c mo9395v() {
        return this.f8935m;
    }

    /* renamed from: x */
    public int mo9396x(Object obj) {
        C2667i f = ((C2827d) obj).mo9647f();
        if (f != null) {
            return (int) (f.f8958f + 0.5f);
        }
        return 0;
    }

    /* renamed from: z */
    public void mo9397z() {
        if (this.f8929g || this.f8930h) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.f8933k) {
                    z = true;
                    break;
                } else if (!this.f8928f[i].f8914f) {
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                m12111n();
                return;
            }
        }
        mo9377A(this.f8925c);
    }
}
