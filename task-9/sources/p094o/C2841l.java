package p094o;

import p094o.C2830e;
import p100p.C2885b;

/* renamed from: o.l */
public class C2841l extends C2839j {

    /* renamed from: A0 */
    private int f9348A0 = 0;

    /* renamed from: B0 */
    private int f9349B0 = 0;

    /* renamed from: C0 */
    private int f9350C0 = 0;

    /* renamed from: D0 */
    private int f9351D0 = 0;

    /* renamed from: E0 */
    private int f9352E0 = 0;

    /* renamed from: F0 */
    private int f9353F0 = 0;

    /* renamed from: G0 */
    private boolean f9354G0 = false;

    /* renamed from: H0 */
    private int f9355H0 = 0;

    /* renamed from: I0 */
    private int f9356I0 = 0;

    /* renamed from: J0 */
    protected C2885b.C2886a f9357J0 = new C2885b.C2886a();

    /* renamed from: K0 */
    C2885b.C2887b f9358K0 = null;

    /* renamed from: y0 */
    private int f9359y0 = 0;

    /* renamed from: z0 */
    private int f9360z0 = 0;

    /* renamed from: K0 */
    public void mo9797K0(boolean z) {
        int i = this.f9350C0;
        if (i <= 0 && this.f9351D0 <= 0) {
            return;
        }
        if (z) {
            this.f9352E0 = this.f9351D0;
            this.f9353F0 = i;
            return;
        }
        this.f9352E0 = i;
        this.f9353F0 = this.f9351D0;
    }

    /* renamed from: L0 */
    public void mo9798L0() {
        for (int i = 0; i < this.f9346x0; i++) {
            C2830e eVar = this.f9345w0[i];
            if (eVar != null) {
                eVar.mo9718q0(true);
            }
        }
    }

    /* renamed from: M0 */
    public int mo9799M0() {
        return this.f9356I0;
    }

    /* renamed from: N0 */
    public int mo9800N0() {
        return this.f9355H0;
    }

    /* renamed from: O0 */
    public int mo9801O0() {
        return this.f9360z0;
    }

    /* renamed from: P0 */
    public int mo9802P0() {
        return this.f9352E0;
    }

    /* renamed from: Q0 */
    public int mo9803Q0() {
        return this.f9353F0;
    }

    /* renamed from: R0 */
    public int mo9804R0() {
        return this.f9359y0;
    }

    /* renamed from: S0 */
    public void mo9771S0(int i, int i2, int i3, int i4) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: T0 */
    public void mo9805T0(C2830e eVar, C2830e.C2832b bVar, int i, C2830e.C2832b bVar2, int i2) {
        while (this.f9358K0 == null && mo9669G() != null) {
            this.f9358K0 = ((C2833f) mo9669G()).mo9743U0();
        }
        C2885b.C2886a aVar = this.f9357J0;
        aVar.f9559a = bVar;
        aVar.f9560b = bVar2;
        aVar.f9561c = i;
        aVar.f9562d = i2;
        this.f9358K0.mo2239b(eVar, aVar);
        eVar.mo9666E0(this.f9357J0.f9563e);
        eVar.mo9700h0(this.f9357J0.f9564f);
        eVar.mo9699g0(this.f9357J0.f9566h);
        eVar.mo9693b0(this.f9357J0.f9565g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: U0 */
    public boolean mo9806U0() {
        C2830e eVar = this.f9205N;
        C2885b.C2887b U0 = eVar != null ? ((C2833f) eVar).mo9743U0() : null;
        if (U0 == null) {
            return false;
        }
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= this.f9346x0) {
                return true;
            }
            C2830e eVar2 = this.f9345w0[i];
            if (eVar2 != null && !(eVar2 instanceof C2836h)) {
                C2830e.C2832b s = eVar2.mo9721s(0);
                C2830e.C2832b s2 = eVar2.mo9721s(1);
                C2830e.C2832b bVar = C2830e.C2832b.MATCH_CONSTRAINT;
                if (s != bVar || eVar2.f9240l == 1 || s2 != bVar || eVar2.f9242m == 1) {
                    z = false;
                }
                if (!z) {
                    if (s == bVar) {
                        s = C2830e.C2832b.WRAP_CONTENT;
                    }
                    if (s2 == bVar) {
                        s2 = C2830e.C2832b.WRAP_CONTENT;
                    }
                    C2885b.C2886a aVar = this.f9357J0;
                    aVar.f9559a = s;
                    aVar.f9560b = s2;
                    aVar.f9561c = eVar2.mo9682P();
                    this.f9357J0.f9562d = eVar2.mo9727v();
                    U0.mo2239b(eVar2, this.f9357J0);
                    eVar2.mo9666E0(this.f9357J0.f9563e);
                    eVar2.mo9700h0(this.f9357J0.f9564f);
                    eVar2.mo9693b0(this.f9357J0.f9565g);
                }
            }
            i++;
        }
    }

    /* renamed from: V0 */
    public boolean mo9807V0() {
        return this.f9354G0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: W0 */
    public void mo9808W0(boolean z) {
        this.f9354G0 = z;
    }

    /* renamed from: X0 */
    public void mo9809X0(int i, int i2) {
        this.f9355H0 = i;
        this.f9356I0 = i2;
    }

    /* renamed from: Y0 */
    public void mo9810Y0(int i) {
        this.f9348A0 = i;
        this.f9359y0 = i;
        this.f9349B0 = i;
        this.f9360z0 = i;
        this.f9350C0 = i;
        this.f9351D0 = i;
    }

    /* renamed from: Z0 */
    public void mo9811Z0(int i) {
        this.f9360z0 = i;
    }

    /* renamed from: a1 */
    public void mo9812a1(int i) {
        this.f9351D0 = i;
    }

    /* renamed from: b1 */
    public void mo9813b1(int i) {
        this.f9348A0 = i;
        this.f9352E0 = i;
    }

    /* renamed from: c */
    public void mo9796c(C2833f fVar) {
        mo9798L0();
    }

    /* renamed from: c1 */
    public void mo9814c1(int i) {
        this.f9349B0 = i;
        this.f9353F0 = i;
    }

    /* renamed from: d1 */
    public void mo9815d1(int i) {
        this.f9350C0 = i;
        this.f9352E0 = i;
        this.f9353F0 = i;
    }

    /* renamed from: e1 */
    public void mo9816e1(int i) {
        this.f9359y0 = i;
    }
}
