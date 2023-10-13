package p094o;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import p088n.C2658d;
import p094o.C2830e;
import p100p.C2885b;
import p100p.C2890e;

/* renamed from: o.f */
public class C2833f extends C2842m {

    /* renamed from: A0 */
    private boolean f9272A0 = false;

    /* renamed from: B0 */
    protected C2658d f9273B0 = new C2658d();

    /* renamed from: C0 */
    int f9274C0;

    /* renamed from: D0 */
    int f9275D0;

    /* renamed from: E0 */
    int f9276E0;

    /* renamed from: F0 */
    int f9277F0;

    /* renamed from: G0 */
    int f9278G0 = 0;

    /* renamed from: H0 */
    int f9279H0 = 0;

    /* renamed from: I0 */
    C2826c[] f9280I0 = new C2826c[4];

    /* renamed from: J0 */
    C2826c[] f9281J0 = new C2826c[4];

    /* renamed from: K0 */
    public boolean f9282K0 = false;

    /* renamed from: L0 */
    public boolean f9283L0 = false;

    /* renamed from: M0 */
    public boolean f9284M0 = false;

    /* renamed from: N0 */
    public int f9285N0 = 0;

    /* renamed from: O0 */
    public int f9286O0 = 0;

    /* renamed from: P0 */
    private int f9287P0 = 263;

    /* renamed from: Q0 */
    public boolean f9288Q0 = false;

    /* renamed from: R0 */
    private boolean f9289R0 = false;

    /* renamed from: S0 */
    private boolean f9290S0 = false;

    /* renamed from: T0 */
    int f9291T0 = 0;

    /* renamed from: x0 */
    C2885b f9292x0 = new C2885b(this);

    /* renamed from: y0 */
    public C2890e f9293y0 = new C2890e(this);

    /* renamed from: z0 */
    protected C2885b.C2887b f9294z0 = null;

    /* renamed from: P0 */
    private void m12777P0(C2830e eVar) {
        int i = this.f9278G0 + 1;
        C2826c[] cVarArr = this.f9281J0;
        if (i >= cVarArr.length) {
            this.f9281J0 = (C2826c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f9281J0[this.f9278G0] = new C2826c(eVar, 0, mo9749a1());
        this.f9278G0++;
    }

    /* renamed from: Q0 */
    private void m12778Q0(C2830e eVar) {
        int i = this.f9279H0 + 1;
        C2826c[] cVarArr = this.f9280I0;
        if (i >= cVarArr.length) {
            this.f9280I0 = (C2826c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f9280I0[this.f9279H0] = new C2826c(eVar, 1, mo9749a1());
        this.f9279H0++;
    }

    /* renamed from: e1 */
    private void m12779e1() {
        this.f9278G0 = 0;
        this.f9279H0 = 0;
    }

    /* renamed from: I0 */
    public void mo9674I0(boolean z, boolean z2) {
        super.mo9674I0(z, z2);
        int size = this.f9361w0.size();
        for (int i = 0; i < size; i++) {
            this.f9361w0.get(i).mo9674I0(z, z2);
        }
    }

    /* JADX WARNING: type inference failed for: r11v7, types: [boolean] */
    /* JADX WARNING: type inference failed for: r11v11 */
    /* JADX WARNING: type inference failed for: r11v12 */
    /* renamed from: K0 */
    public void mo9737K0() {
        boolean z;
        ? r11;
        boolean z2;
        this.f9210S = 0;
        this.f9211T = 0;
        int max = Math.max(0, mo9682P());
        int max2 = Math.max(0, mo9727v());
        this.f9289R0 = false;
        this.f9290S0 = false;
        boolean z3 = mo9752d1(64) || mo9752d1(128);
        C2658d dVar = this.f9273B0;
        dVar.f8929g = false;
        dVar.f8930h = false;
        if (this.f9287P0 != 0 && z3) {
            dVar.f8930h = true;
        }
        C2830e.C2832b[] bVarArr = this.f9204M;
        C2830e.C2832b bVar = bVarArr[1];
        C2830e.C2832b bVar2 = bVarArr[0];
        ArrayList<C2830e> arrayList = this.f9361w0;
        C2830e.C2832b y = mo9733y();
        C2830e.C2832b bVar3 = C2830e.C2832b.WRAP_CONTENT;
        boolean z4 = y == bVar3 || mo9679M() == bVar3;
        m12779e1();
        int size = this.f9361w0.size();
        for (int i = 0; i < size; i++) {
            C2830e eVar = this.f9361w0.get(i);
            if (eVar instanceof C2842m) {
                ((C2842m) eVar).mo9737K0();
            }
        }
        int i2 = 0;
        boolean z5 = true;
        boolean z6 = false;
        while (z5) {
            int i3 = i2 + 1;
            try {
                this.f9273B0.mo9378D();
                m12779e1();
                mo9707l(this.f9273B0);
                for (int i4 = 0; i4 < size; i4++) {
                    this.f9361w0.get(i4).mo9707l(this.f9273B0);
                }
                z5 = mo9739O0(this.f9273B0);
                if (z5) {
                    this.f9273B0.mo9397z();
                }
            } catch (Exception e) {
                e.printStackTrace();
                PrintStream printStream = System.out;
                printStream.println("EXCEPTION : " + e);
            }
            C2658d dVar2 = this.f9273B0;
            if (z5) {
                mo9756i1(dVar2, C2840k.f9347a);
            } else {
                mo9676J0(dVar2);
                for (int i5 = 0; i5 < size; i5++) {
                    this.f9361w0.get(i5).mo9676J0(this.f9273B0);
                }
            }
            if (!z4 || i3 >= 8 || !C2840k.f9347a[2]) {
                z = false;
            } else {
                int i6 = 0;
                int i7 = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    C2830e eVar2 = this.f9361w0.get(i8);
                    i6 = Math.max(i6, eVar2.f9210S + eVar2.mo9682P());
                    i7 = Math.max(i7, eVar2.f9211T + eVar2.mo9727v());
                }
                int max3 = Math.max(this.f9217Z, i6);
                int max4 = Math.max(this.f9219a0, i7);
                C2830e.C2832b bVar4 = C2830e.C2832b.WRAP_CONTENT;
                if (bVar2 != bVar4 || mo9682P() >= max3) {
                    z = false;
                } else {
                    mo9666E0(max3);
                    this.f9204M[0] = bVar4;
                    z = true;
                    z6 = true;
                }
                if (bVar == bVar4 && mo9727v() < max4) {
                    mo9700h0(max4);
                    this.f9204M[1] = bVar4;
                    z = true;
                    z6 = true;
                }
            }
            int max5 = Math.max(this.f9217Z, mo9682P());
            if (max5 > mo9682P()) {
                mo9666E0(max5);
                this.f9204M[0] = C2830e.C2832b.FIXED;
                z = true;
                z6 = true;
            }
            int max6 = Math.max(this.f9219a0, mo9727v());
            if (max6 > mo9727v()) {
                mo9700h0(max6);
                r11 = 1;
                this.f9204M[1] = C2830e.C2832b.FIXED;
                z = true;
                z2 = true;
            } else {
                r11 = 1;
                z2 = z6;
            }
            if (!z2) {
                C2830e.C2832b bVar5 = this.f9204M[0];
                C2830e.C2832b bVar6 = C2830e.C2832b.WRAP_CONTENT;
                if (bVar5 == bVar6 && max > 0 && mo9682P() > max) {
                    this.f9289R0 = r11;
                    this.f9204M[0] = C2830e.C2832b.FIXED;
                    mo9666E0(max);
                    z = true;
                    z2 = true;
                }
                if (this.f9204M[r11] == bVar6 && max2 > 0 && mo9727v() > max2) {
                    this.f9290S0 = r11;
                    this.f9204M[r11] = C2830e.C2832b.FIXED;
                    mo9700h0(max2);
                    z5 = true;
                    z6 = true;
                    i2 = i3;
                }
            }
            z5 = z;
            z6 = z2;
            i2 = i3;
        }
        this.f9361w0 = arrayList;
        if (z6) {
            C2830e.C2832b[] bVarArr2 = this.f9204M;
            bVarArr2[0] = bVar2;
            bVarArr2[1] = bVar;
        }
        mo9692a0(this.f9273B0.mo9395v());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N0 */
    public void mo9738N0(C2830e eVar, int i) {
        if (i == 0) {
            m12777P0(eVar);
        } else if (i == 1) {
            m12778Q0(eVar);
        }
    }

    /* renamed from: O0 */
    public boolean mo9739O0(C2658d dVar) {
        mo9638f(dVar);
        int size = this.f9361w0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C2830e eVar = this.f9361w0.get(i);
            eVar.mo9714o0(0, false);
            eVar.mo9714o0(1, false);
            if (eVar instanceof C2824a) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                C2830e eVar2 = this.f9361w0.get(i2);
                if (eVar2 instanceof C2824a) {
                    ((C2824a) eVar2).mo9634N0();
                }
            }
        }
        for (int i3 = 0; i3 < size; i3++) {
            C2830e eVar3 = this.f9361w0.get(i3);
            if (eVar3.mo9696e()) {
                eVar3.mo9638f(dVar);
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            C2830e eVar4 = this.f9361w0.get(i4);
            if (eVar4 instanceof C2833f) {
                C2830e.C2832b[] bVarArr = eVar4.f9204M;
                C2830e.C2832b bVar = bVarArr[0];
                C2830e.C2832b bVar2 = bVarArr[1];
                C2830e.C2832b bVar3 = C2830e.C2832b.WRAP_CONTENT;
                if (bVar == bVar3) {
                    eVar4.mo9708l0(C2830e.C2832b.FIXED);
                }
                if (bVar2 == bVar3) {
                    eVar4.mo9658A0(C2830e.C2832b.FIXED);
                }
                eVar4.mo9638f(dVar);
                if (bVar == bVar3) {
                    eVar4.mo9708l0(bVar);
                }
                if (bVar2 == bVar3) {
                    eVar4.mo9658A0(bVar2);
                }
            } else {
                C2840k.m12878a(this, dVar, eVar4);
                if (!eVar4.mo9696e()) {
                    eVar4.mo9638f(dVar);
                }
            }
        }
        if (this.f9278G0 > 0) {
            C2825b.m12673a(this, dVar, 0);
        }
        if (this.f9279H0 > 0) {
            C2825b.m12673a(this, dVar, 1);
        }
        return true;
    }

    /* renamed from: R0 */
    public boolean mo9740R0(boolean z) {
        return this.f9293y0.mo10040f(z);
    }

    /* renamed from: S0 */
    public boolean mo9741S0(boolean z) {
        return this.f9293y0.mo10041g(z);
    }

    /* renamed from: T0 */
    public boolean mo9742T0(boolean z, int i) {
        return this.f9293y0.mo10042h(z, i);
    }

    /* renamed from: U0 */
    public C2885b.C2887b mo9743U0() {
        return this.f9294z0;
    }

    /* renamed from: V0 */
    public int mo9744V0() {
        return this.f9287P0;
    }

    /* renamed from: W0 */
    public boolean mo9745W0() {
        return false;
    }

    /* renamed from: X0 */
    public void mo9746X0() {
        this.f9293y0.mo10043j();
    }

    /* renamed from: Y */
    public void mo9690Y() {
        this.f9273B0.mo9378D();
        this.f9274C0 = 0;
        this.f9276E0 = 0;
        this.f9275D0 = 0;
        this.f9277F0 = 0;
        this.f9288Q0 = false;
        super.mo9690Y();
    }

    /* renamed from: Y0 */
    public void mo9747Y0() {
        this.f9293y0.mo10044k();
    }

    /* renamed from: Z0 */
    public boolean mo9748Z0() {
        return this.f9290S0;
    }

    /* renamed from: a1 */
    public boolean mo9749a1() {
        return this.f9272A0;
    }

    /* renamed from: b1 */
    public boolean mo9750b1() {
        return this.f9289R0;
    }

    /* renamed from: c1 */
    public long mo9751c1(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = i8;
        this.f9274C0 = i10;
        int i11 = i9;
        this.f9275D0 = i11;
        return this.f9292x0.mo10029d(this, i, i10, i11, i2, i3, i4, i5, i6, i7);
    }

    /* renamed from: d1 */
    public boolean mo9752d1(int i) {
        return (this.f9287P0 & i) == i;
    }

    /* renamed from: f1 */
    public void mo9753f1(C2885b.C2887b bVar) {
        this.f9294z0 = bVar;
        this.f9293y0.mo10046n(bVar);
    }

    /* renamed from: g1 */
    public void mo9754g1(int i) {
        this.f9287P0 = i;
        C2658d.f8920r = C2840k.m12879b(i, 256);
    }

    /* renamed from: h1 */
    public void mo9755h1(boolean z) {
        this.f9272A0 = z;
    }

    /* renamed from: i1 */
    public void mo9756i1(C2658d dVar, boolean[] zArr) {
        zArr[2] = false;
        mo9676J0(dVar);
        int size = this.f9361w0.size();
        for (int i = 0; i < size; i++) {
            this.f9361w0.get(i).mo9676J0(dVar);
        }
    }

    /* renamed from: j1 */
    public void mo9757j1() {
        this.f9292x0.mo10030e(this);
    }
}
