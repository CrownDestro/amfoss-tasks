package p094o;

import java.util.ArrayList;
import p094o.C2830e;

/* renamed from: o.c */
public class C2826c {

    /* renamed from: a */
    protected C2830e f9151a;

    /* renamed from: b */
    protected C2830e f9152b;

    /* renamed from: c */
    protected C2830e f9153c;

    /* renamed from: d */
    protected C2830e f9154d;

    /* renamed from: e */
    protected C2830e f9155e;

    /* renamed from: f */
    protected C2830e f9156f;

    /* renamed from: g */
    protected C2830e f9157g;

    /* renamed from: h */
    protected ArrayList<C2830e> f9158h;

    /* renamed from: i */
    protected int f9159i;

    /* renamed from: j */
    protected int f9160j;

    /* renamed from: k */
    protected float f9161k = 0.0f;

    /* renamed from: l */
    int f9162l;

    /* renamed from: m */
    int f9163m;

    /* renamed from: n */
    int f9164n;

    /* renamed from: o */
    boolean f9165o;

    /* renamed from: p */
    private int f9166p;

    /* renamed from: q */
    private boolean f9167q;

    /* renamed from: r */
    protected boolean f9168r;

    /* renamed from: s */
    protected boolean f9169s;

    /* renamed from: t */
    protected boolean f9170t;

    /* renamed from: u */
    protected boolean f9171u;

    /* renamed from: v */
    private boolean f9172v;

    public C2826c(C2830e eVar, int i, boolean z) {
        this.f9151a = eVar;
        this.f9166p = i;
        this.f9167q = z;
    }

    /* renamed from: b */
    private void m12675b() {
        int i = this.f9166p * 2;
        C2830e eVar = this.f9151a;
        boolean z = true;
        this.f9165o = true;
        C2830e eVar2 = eVar;
        boolean z2 = false;
        while (!z2) {
            this.f9159i++;
            C2830e[] eVarArr = eVar.f9255s0;
            int i2 = this.f9166p;
            C2830e eVar3 = null;
            eVarArr[i2] = null;
            eVar.f9253r0[i2] = null;
            if (eVar.mo9681O() != 8) {
                this.f9162l++;
                C2830e.C2832b s = eVar.mo9721s(this.f9166p);
                C2830e.C2832b bVar = C2830e.C2832b.MATCH_CONSTRAINT;
                if (s != bVar) {
                    this.f9163m += eVar.mo9657A(this.f9166p);
                }
                int c = this.f9163m + eVar.f9201J[i].mo9644c();
                this.f9163m = c;
                int i3 = i + 1;
                this.f9163m = c + eVar.f9201J[i3].mo9644c();
                int c2 = this.f9164n + eVar.f9201J[i].mo9644c();
                this.f9164n = c2;
                this.f9164n = c2 + eVar.f9201J[i3].mo9644c();
                if (this.f9152b == null) {
                    this.f9152b = eVar;
                }
                this.f9154d = eVar;
                C2830e.C2832b[] bVarArr = eVar.f9204M;
                int i4 = this.f9166p;
                if (bVarArr[i4] == bVar) {
                    int[] iArr = eVar.f9244n;
                    if (iArr[i4] == 0 || iArr[i4] == 3 || iArr[i4] == 2) {
                        this.f9160j++;
                        float[] fArr = eVar.f9251q0;
                        float f = fArr[i4];
                        if (f > 0.0f) {
                            this.f9161k += fArr[i4];
                        }
                        if (m12676c(eVar, i4)) {
                            if (f < 0.0f) {
                                this.f9168r = true;
                            } else {
                                this.f9169s = true;
                            }
                            if (this.f9158h == null) {
                                this.f9158h = new ArrayList<>();
                            }
                            this.f9158h.add(eVar);
                        }
                        if (this.f9156f == null) {
                            this.f9156f = eVar;
                        }
                        C2830e eVar4 = this.f9157g;
                        if (eVar4 != null) {
                            eVar4.f9253r0[this.f9166p] = eVar;
                        }
                        this.f9157g = eVar;
                    }
                    if (this.f9166p != 0 ? !(eVar.f9242m == 0 && eVar.f9252r == 0 && eVar.f9254s == 0) : !(eVar.f9240l == 0 && eVar.f9246o == 0 && eVar.f9248p == 0)) {
                        this.f9165o = false;
                    }
                    if (eVar.f9208Q != 0.0f) {
                        this.f9165o = false;
                        this.f9171u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.f9255s0[this.f9166p] = eVar;
            }
            C2827d dVar = eVar.f9201J[i + 1].f9176d;
            if (dVar != null) {
                C2830e eVar5 = dVar.f9174b;
                C2827d[] dVarArr = eVar5.f9201J;
                if (dVarArr[i].f9176d != null && dVarArr[i].f9176d.f9174b == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z2 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        C2830e eVar6 = this.f9152b;
        if (eVar6 != null) {
            this.f9163m -= eVar6.f9201J[i].mo9644c();
        }
        C2830e eVar7 = this.f9154d;
        if (eVar7 != null) {
            this.f9163m -= eVar7.f9201J[i + 1].mo9644c();
        }
        this.f9153c = eVar;
        if (this.f9166p != 0 || !this.f9167q) {
            this.f9155e = this.f9151a;
        } else {
            this.f9155e = eVar;
        }
        if (!this.f9169s || !this.f9168r) {
            z = false;
        }
        this.f9170t = z;
    }

    /* renamed from: c */
    private static boolean m12676c(C2830e eVar, int i) {
        if (eVar.mo9681O() != 8 && eVar.f9204M[i] == C2830e.C2832b.MATCH_CONSTRAINT) {
            int[] iArr = eVar.f9244n;
            if (iArr[i] == 0 || iArr[i] == 3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo9641a() {
        if (!this.f9172v) {
            m12675b();
        }
        this.f9172v = true;
    }
}
