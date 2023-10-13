package p100p;

import p100p.C2891f;

/* renamed from: p.g */
class C2893g extends C2891f {

    /* renamed from: m */
    public int f9601m;

    public C2893g(C2901m mVar) {
        super(mVar);
        this.f9584e = mVar instanceof C2896j ? C2891f.C2892a.HORIZONTAL_DIMENSION : C2891f.C2892a.VERTICAL_DIMENSION;
    }

    /* renamed from: d */
    public void mo10049d(int i) {
        if (!this.f9589j) {
            this.f9589j = true;
            this.f9586g = i;
            for (C2889d next : this.f9590k) {
                next.mo10031a(next);
            }
        }
    }
}
