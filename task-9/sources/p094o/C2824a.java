package p094o;

import p088n.C2658d;
import p088n.C2667i;
import p094o.C2830e;

/* renamed from: o.a */
public class C2824a extends C2839j {

    /* renamed from: A0 */
    private int f9148A0 = 0;

    /* renamed from: y0 */
    private int f9149y0 = 0;

    /* renamed from: z0 */
    private boolean f9150z0 = true;

    /* renamed from: K0 */
    public boolean mo9631K0() {
        return this.f9150z0;
    }

    /* renamed from: L0 */
    public int mo9632L0() {
        return this.f9149y0;
    }

    /* renamed from: M0 */
    public int mo9633M0() {
        return this.f9148A0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: N0 */
    public void mo9634N0() {
        for (int i = 0; i < this.f9346x0; i++) {
            C2830e eVar = this.f9345w0[i];
            int i2 = this.f9149y0;
            if (i2 == 0 || i2 == 1) {
                eVar.mo9714o0(0, true);
            } else if (i2 == 2 || i2 == 3) {
                eVar.mo9714o0(1, true);
            }
        }
    }

    /* renamed from: O0 */
    public void mo9635O0(boolean z) {
        this.f9150z0 = z;
    }

    /* renamed from: P0 */
    public void mo9636P0(int i) {
        this.f9149y0 = i;
    }

    /* renamed from: Q0 */
    public void mo9637Q0(int i) {
        this.f9148A0 = i;
    }

    /* renamed from: f */
    public void mo9638f(C2658d dVar) {
        C2827d[] dVarArr;
        boolean z;
        C2667i iVar;
        C2827d dVar2;
        int i;
        int i2;
        int i3;
        C2827d[] dVarArr2 = this.f9201J;
        dVarArr2[0] = this.f9193B;
        dVarArr2[2] = this.f9194C;
        dVarArr2[1] = this.f9195D;
        dVarArr2[3] = this.f9196E;
        int i4 = 0;
        while (true) {
            dVarArr = this.f9201J;
            if (i4 >= dVarArr.length) {
                break;
            }
            dVarArr[i4].f9179g = dVar.mo9392q(dVarArr[i4]);
            i4++;
        }
        int i5 = this.f9149y0;
        if (i5 >= 0 && i5 < 4) {
            C2827d dVar3 = dVarArr[i5];
            int i6 = 0;
            while (true) {
                if (i6 >= this.f9346x0) {
                    z = false;
                    break;
                }
                C2830e eVar = this.f9345w0[i6];
                if ((this.f9150z0 || eVar.mo9639g()) && ((((i2 = this.f9149y0) == 0 || i2 == 1) && eVar.mo9733y() == C2830e.C2832b.MATCH_CONSTRAINT && eVar.f9193B.f9176d != null && eVar.f9195D.f9176d != null) || (((i3 = this.f9149y0) == 2 || i3 == 3) && eVar.mo9679M() == C2830e.C2832b.MATCH_CONSTRAINT && eVar.f9194C.f9176d != null && eVar.f9196E.f9176d != null))) {
                    z = true;
                } else {
                    i6++;
                }
            }
            z = true;
            boolean z2 = this.f9193B.mo9650i() || this.f9195D.mo9650i();
            boolean z3 = this.f9194C.mo9650i() || this.f9196E.mo9650i();
            boolean z4 = !z && (((i = this.f9149y0) == 0 && z2) || ((i == 2 && z3) || ((i == 1 && z2) || (i == 3 && z3))));
            int i7 = 5;
            if (!z4) {
                i7 = 4;
            }
            for (int i8 = 0; i8 < this.f9346x0; i8++) {
                C2830e eVar2 = this.f9345w0[i8];
                if (this.f9150z0 || eVar2.mo9639g()) {
                    C2667i q = dVar.mo9392q(eVar2.f9201J[this.f9149y0]);
                    C2827d[] dVarArr3 = eVar2.f9201J;
                    int i9 = this.f9149y0;
                    dVarArr3[i9].f9179g = q;
                    int i10 = (dVarArr3[i9].f9176d == null || dVarArr3[i9].f9176d.f9174b != this) ? 0 : dVarArr3[i9].f9177e + 0;
                    if (i9 == 0 || i9 == 2) {
                        dVar.mo9386i(dVar3.f9179g, q, this.f9148A0 - i10, z);
                    } else {
                        dVar.mo9384g(dVar3.f9179g, q, this.f9148A0 + i10, z);
                    }
                    dVar.mo9382e(dVar3.f9179g, q, this.f9148A0 + i10, i7);
                }
            }
            int i11 = this.f9149y0;
            if (i11 == 0) {
                dVar.mo9382e(this.f9195D.f9179g, this.f9193B.f9179g, 0, 8);
                dVar.mo9382e(this.f9193B.f9179g, this.f9205N.f9195D.f9179g, 0, 4);
                iVar = this.f9193B.f9179g;
                dVar2 = this.f9205N.f9193B;
            } else if (i11 == 1) {
                dVar.mo9382e(this.f9193B.f9179g, this.f9195D.f9179g, 0, 8);
                dVar.mo9382e(this.f9193B.f9179g, this.f9205N.f9193B.f9179g, 0, 4);
                iVar = this.f9193B.f9179g;
                dVar2 = this.f9205N.f9195D;
            } else if (i11 == 2) {
                dVar.mo9382e(this.f9196E.f9179g, this.f9194C.f9179g, 0, 8);
                dVar.mo9382e(this.f9194C.f9179g, this.f9205N.f9196E.f9179g, 0, 4);
                iVar = this.f9194C.f9179g;
                dVar2 = this.f9205N.f9194C;
            } else if (i11 == 3) {
                dVar.mo9382e(this.f9194C.f9179g, this.f9196E.f9179g, 0, 8);
                dVar.mo9382e(this.f9194C.f9179g, this.f9205N.f9194C.f9179g, 0, 4);
                iVar = this.f9194C.f9179g;
                dVar2 = this.f9205N.f9196E;
            } else {
                return;
            }
            dVar.mo9382e(iVar, dVar2.f9179g, 0, 0);
        }
    }

    /* renamed from: g */
    public boolean mo9639g() {
        return true;
    }

    public String toString() {
        String str = "[Barrier] " + mo9719r() + " {";
        for (int i = 0; i < this.f9346x0; i++) {
            C2830e eVar = this.f9345w0[i];
            if (i > 0) {
                str = str + ", ";
            }
            str = str + eVar.mo9719r();
        }
        return str + "}";
    }
}
