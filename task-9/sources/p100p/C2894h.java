package p100p;

import p094o.C2830e;
import p094o.C2836h;

/* renamed from: p.h */
class C2894h extends C2901m {
    public C2894h(C2830e eVar) {
        super(eVar);
        eVar.f9226e.mo10034f();
        eVar.f9228f.mo10034f();
        this.f9620f = ((C2836h) eVar).mo9786K0();
    }

    /* renamed from: q */
    private void m13157q(C2891f fVar) {
        this.f9622h.f9590k.add(fVar);
        fVar.f9591l.add(this.f9622h);
    }

    /* renamed from: a */
    public void mo10031a(C2889d dVar) {
        C2891f fVar = this.f9622h;
        if (fVar.f9582c && !fVar.f9589j) {
            this.f9622h.mo10049d((int) ((((float) fVar.f9591l.get(0).f9586g) * ((C2836h) this.f9616b).mo9789N0()) + 0.5f));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo10032d() {
        C2901m mVar;
        C2891f fVar;
        C2891f fVar2;
        C2836h hVar = (C2836h) this.f9616b;
        int L0 = hVar.mo9787L0();
        int M0 = hVar.mo9788M0();
        hVar.mo9789N0();
        if (hVar.mo9786K0() == 1) {
            C2891f fVar3 = this.f9622h;
            if (L0 != -1) {
                fVar3.f9591l.add(this.f9616b.f9205N.f9226e.f9622h);
                this.f9616b.f9205N.f9226e.f9622h.f9590k.add(this.f9622h);
                fVar2 = this.f9622h;
            } else if (M0 != -1) {
                fVar3.f9591l.add(this.f9616b.f9205N.f9226e.f9623i);
                this.f9616b.f9205N.f9226e.f9623i.f9590k.add(this.f9622h);
                fVar2 = this.f9622h;
                L0 = -M0;
            } else {
                fVar3.f9581b = true;
                fVar3.f9591l.add(this.f9616b.f9205N.f9226e.f9623i);
                this.f9616b.f9205N.f9226e.f9623i.f9590k.add(this.f9622h);
                m13157q(this.f9616b.f9226e.f9622h);
                mVar = this.f9616b.f9226e;
            }
            fVar2.f9585f = L0;
            m13157q(this.f9616b.f9226e.f9622h);
            mVar = this.f9616b.f9226e;
        } else {
            C2891f fVar4 = this.f9622h;
            if (L0 != -1) {
                fVar4.f9591l.add(this.f9616b.f9205N.f9228f.f9622h);
                this.f9616b.f9205N.f9228f.f9622h.f9590k.add(this.f9622h);
                fVar = this.f9622h;
            } else if (M0 != -1) {
                fVar4.f9591l.add(this.f9616b.f9205N.f9228f.f9623i);
                this.f9616b.f9205N.f9228f.f9623i.f9590k.add(this.f9622h);
                fVar = this.f9622h;
                L0 = -M0;
            } else {
                fVar4.f9581b = true;
                fVar4.f9591l.add(this.f9616b.f9205N.f9228f.f9623i);
                this.f9616b.f9205N.f9228f.f9623i.f9590k.add(this.f9622h);
                m13157q(this.f9616b.f9228f.f9622h);
                mVar = this.f9616b.f9228f;
            }
            fVar.f9585f = L0;
            m13157q(this.f9616b.f9228f.f9622h);
            mVar = this.f9616b.f9228f;
        }
        m13157q(mVar.f9623i);
    }

    /* renamed from: e */
    public void mo10033e() {
        if (((C2836h) this.f9616b).mo9786K0() == 1) {
            this.f9616b.mo9668F0(this.f9622h.f9586g);
        } else {
            this.f9616b.mo9670G0(this.f9622h.f9586g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo10034f() {
        this.f9622h.mo10048c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo10036m() {
        return false;
    }
}
