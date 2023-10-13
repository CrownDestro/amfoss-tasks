package p094o;

import p088n.C2658d;
import p094o.C2830e;

/* renamed from: o.k */
public class C2840k {

    /* renamed from: a */
    static boolean[] f9347a = new boolean[3];

    /* renamed from: a */
    static void m12878a(C2833f fVar, C2658d dVar, C2830e eVar) {
        eVar.f9236j = -1;
        eVar.f9238k = -1;
        C2830e.C2832b bVar = fVar.f9204M[0];
        C2830e.C2832b bVar2 = C2830e.C2832b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.f9204M[0] == C2830e.C2832b.MATCH_PARENT) {
            int i = eVar.f9193B.f9177e;
            int P = fVar.mo9682P() - eVar.f9195D.f9177e;
            C2827d dVar2 = eVar.f9193B;
            dVar2.f9179g = dVar.mo9392q(dVar2);
            C2827d dVar3 = eVar.f9195D;
            dVar3.f9179g = dVar.mo9392q(dVar3);
            dVar.mo9383f(eVar.f9193B.f9179g, i);
            dVar.mo9383f(eVar.f9195D.f9179g, P);
            eVar.f9236j = 2;
            eVar.mo9706k0(i, P);
        }
        if (fVar.f9204M[1] != bVar2 && eVar.f9204M[1] == C2830e.C2832b.MATCH_PARENT) {
            int i2 = eVar.f9194C.f9177e;
            int v = fVar.mo9727v() - eVar.f9196E.f9177e;
            C2827d dVar4 = eVar.f9194C;
            dVar4.f9179g = dVar.mo9392q(dVar4);
            C2827d dVar5 = eVar.f9196E;
            dVar5.f9179g = dVar.mo9392q(dVar5);
            dVar.mo9383f(eVar.f9194C.f9179g, i2);
            dVar.mo9383f(eVar.f9196E.f9179g, v);
            if (eVar.f9216Y > 0 || eVar.mo9681O() == 8) {
                C2827d dVar6 = eVar.f9197F;
                dVar6.f9179g = dVar.mo9392q(dVar6);
                dVar.mo9383f(eVar.f9197F.f9179g, eVar.f9216Y + i2);
            }
            eVar.f9238k = 2;
            eVar.mo9736z0(i2, v);
        }
    }

    /* renamed from: b */
    public static final boolean m12879b(int i, int i2) {
        return (i & i2) == i2;
    }
}
