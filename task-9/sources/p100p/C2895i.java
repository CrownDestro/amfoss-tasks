package p100p;

import p094o.C2824a;
import p094o.C2830e;
import p100p.C2891f;

/* renamed from: p.i */
class C2895i extends C2901m {
    public C2895i(C2830e eVar) {
        super(eVar);
    }

    /* renamed from: q */
    private void m13163q(C2891f fVar) {
        this.f9622h.f9590k.add(fVar);
        fVar.f9591l.add(this.f9622h);
    }

    /* renamed from: a */
    public void mo10031a(C2889d dVar) {
        C2824a aVar = (C2824a) this.f9616b;
        int L0 = aVar.mo9632L0();
        int i = 0;
        int i2 = -1;
        for (C2891f fVar : this.f9622h.f9591l) {
            int i3 = fVar.f9586g;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (L0 == 0 || L0 == 2) {
            this.f9622h.mo10049d(i2 + aVar.mo9633M0());
        } else {
            this.f9622h.mo10049d(i + aVar.mo9633M0());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo10032d() {
        C2901m mVar;
        C2830e eVar = this.f9616b;
        if (eVar instanceof C2824a) {
            this.f9622h.f9581b = true;
            C2824a aVar = (C2824a) eVar;
            int L0 = aVar.mo9632L0();
            boolean K0 = aVar.mo9631K0();
            int i = 0;
            if (L0 == 0) {
                this.f9622h.f9584e = C2891f.C2892a.LEFT;
                while (i < aVar.f9346x0) {
                    C2830e eVar2 = aVar.f9345w0[i];
                    if (K0 || eVar2.mo9681O() != 8) {
                        C2891f fVar = eVar2.f9226e.f9622h;
                        fVar.f9590k.add(this.f9622h);
                        this.f9622h.f9591l.add(fVar);
                    }
                    i++;
                }
            } else if (L0 != 1) {
                if (L0 == 2) {
                    this.f9622h.f9584e = C2891f.C2892a.TOP;
                    while (i < aVar.f9346x0) {
                        C2830e eVar3 = aVar.f9345w0[i];
                        if (K0 || eVar3.mo9681O() != 8) {
                            C2891f fVar2 = eVar3.f9228f.f9622h;
                            fVar2.f9590k.add(this.f9622h);
                            this.f9622h.f9591l.add(fVar2);
                        }
                        i++;
                    }
                } else if (L0 == 3) {
                    this.f9622h.f9584e = C2891f.C2892a.BOTTOM;
                    while (i < aVar.f9346x0) {
                        C2830e eVar4 = aVar.f9345w0[i];
                        if (K0 || eVar4.mo9681O() != 8) {
                            C2891f fVar3 = eVar4.f9228f.f9623i;
                            fVar3.f9590k.add(this.f9622h);
                            this.f9622h.f9591l.add(fVar3);
                        }
                        i++;
                    }
                } else {
                    return;
                }
                m13163q(this.f9616b.f9228f.f9622h);
                mVar = this.f9616b.f9228f;
                m13163q(mVar.f9623i);
            } else {
                this.f9622h.f9584e = C2891f.C2892a.RIGHT;
                while (i < aVar.f9346x0) {
                    C2830e eVar5 = aVar.f9345w0[i];
                    if (K0 || eVar5.mo9681O() != 8) {
                        C2891f fVar4 = eVar5.f9226e.f9623i;
                        fVar4.f9590k.add(this.f9622h);
                        this.f9622h.f9591l.add(fVar4);
                    }
                    i++;
                }
            }
            m13163q(this.f9616b.f9226e.f9622h);
            mVar = this.f9616b.f9226e;
            m13163q(mVar.f9623i);
        }
    }

    /* renamed from: e */
    public void mo10033e() {
        C2830e eVar = this.f9616b;
        if (eVar instanceof C2824a) {
            int L0 = ((C2824a) eVar).mo9632L0();
            if (L0 == 0 || L0 == 1) {
                this.f9616b.mo9668F0(this.f9622h.f9586g);
            } else {
                this.f9616b.mo9670G0(this.f9622h.f9586g);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo10034f() {
        this.f9617c = null;
        this.f9622h.mo10048c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo10036m() {
        return false;
    }
}
