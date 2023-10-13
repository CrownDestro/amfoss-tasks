package p100p;

import java.util.ArrayList;
import p094o.C2833f;

/* renamed from: p.k */
class C2898k {

    /* renamed from: h */
    public static int f9604h;

    /* renamed from: a */
    public int f9605a = 0;

    /* renamed from: b */
    public boolean f9606b = false;

    /* renamed from: c */
    C2901m f9607c = null;

    /* renamed from: d */
    C2901m f9608d = null;

    /* renamed from: e */
    ArrayList<C2901m> f9609e = new ArrayList<>();

    /* renamed from: f */
    int f9610f;

    /* renamed from: g */
    int f9611g;

    public C2898k(C2901m mVar, int i) {
        int i2 = f9604h;
        this.f9610f = i2;
        f9604h = i2 + 1;
        this.f9607c = mVar;
        this.f9608d = mVar;
        this.f9611g = i;
    }

    /* renamed from: c */
    private long m13176c(C2891f fVar, long j) {
        C2901m mVar = fVar.f9583d;
        if (mVar instanceof C2895i) {
            return j;
        }
        int size = fVar.f9590k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            C2889d dVar = fVar.f9590k.get(i);
            if (dVar instanceof C2891f) {
                C2891f fVar2 = (C2891f) dVar;
                if (fVar2.f9583d != mVar) {
                    j2 = Math.min(j2, m13176c(fVar2, ((long) fVar2.f9585f) + j));
                }
            }
        }
        if (fVar != mVar.f9623i) {
            return j2;
        }
        long j3 = j - mVar.mo10035j();
        return Math.min(Math.min(j2, m13176c(mVar.f9622h, j3)), j3 - ((long) mVar.f9622h.f9585f));
    }

    /* renamed from: d */
    private long m13177d(C2891f fVar, long j) {
        C2901m mVar = fVar.f9583d;
        if (mVar instanceof C2895i) {
            return j;
        }
        int size = fVar.f9590k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            C2889d dVar = fVar.f9590k.get(i);
            if (dVar instanceof C2891f) {
                C2891f fVar2 = (C2891f) dVar;
                if (fVar2.f9583d != mVar) {
                    j2 = Math.max(j2, m13177d(fVar2, ((long) fVar2.f9585f) + j));
                }
            }
        }
        if (fVar != mVar.f9622h) {
            return j2;
        }
        long j3 = j + mVar.mo10035j();
        return Math.max(Math.max(j2, m13177d(mVar.f9623i, j3)), j3 - ((long) mVar.f9623i.f9585f));
    }

    /* renamed from: a */
    public void mo10053a(C2901m mVar) {
        this.f9609e.add(mVar);
        this.f9608d = mVar;
    }

    /* renamed from: b */
    public long mo10054b(C2833f fVar, int i) {
        C2901m mVar;
        long j;
        long j2;
        long j3;
        C2901m mVar2 = this.f9607c;
        long j4 = 0;
        if (mVar2 instanceof C2888c) {
            if (((C2888c) mVar2).f9620f != i) {
                return 0;
            }
        } else if (i == 0) {
            if (!(mVar2 instanceof C2896j)) {
                return 0;
            }
        } else if (!(mVar2 instanceof C2899l)) {
            return 0;
        }
        C2891f fVar2 = (i == 0 ? fVar.f9226e : fVar.f9228f).f9622h;
        C2891f fVar3 = (i == 0 ? fVar.f9226e : fVar.f9228f).f9623i;
        boolean contains = mVar2.f9622h.f9591l.contains(fVar2);
        boolean contains2 = this.f9607c.f9623i.f9591l.contains(fVar3);
        long j5 = this.f9607c.mo10035j();
        if (!contains || !contains2) {
            if (contains) {
                C2891f fVar4 = this.f9607c.f9622h;
                j3 = m13177d(fVar4, (long) fVar4.f9585f);
                j2 = ((long) this.f9607c.f9622h.f9585f) + j5;
            } else if (contains2) {
                C2891f fVar5 = this.f9607c.f9623i;
                long c = m13176c(fVar5, (long) fVar5.f9585f);
                j2 = ((long) (-this.f9607c.f9623i.f9585f)) + j5;
                j3 = -c;
            } else {
                C2901m mVar3 = this.f9607c;
                j = ((long) mVar3.f9622h.f9585f) + mVar3.mo10035j();
                mVar = this.f9607c;
            }
            return Math.max(j3, j2);
        }
        long d = m13177d(this.f9607c.f9622h, 0);
        long c2 = m13176c(this.f9607c.f9623i, 0);
        long j6 = d - j5;
        C2901m mVar4 = this.f9607c;
        int i2 = mVar4.f9623i.f9585f;
        if (j6 >= ((long) (-i2))) {
            j6 += (long) i2;
        }
        int i3 = mVar4.f9622h.f9585f;
        long j7 = ((-c2) - j5) - ((long) i3);
        if (j7 >= ((long) i3)) {
            j7 -= (long) i3;
        }
        float o = mVar4.f9616b.mo9713o(i);
        if (o > 0.0f) {
            j4 = (long) ((((float) j7) / o) + (((float) j6) / (1.0f - o)));
        }
        float f = (float) j4;
        long j8 = ((long) ((f * o) + 0.5f)) + j5 + ((long) ((f * (1.0f - o)) + 0.5f));
        mVar = this.f9607c;
        j = ((long) mVar.f9622h.f9585f) + j8;
        return j - ((long) mVar.f9623i.f9585f);
    }
}
