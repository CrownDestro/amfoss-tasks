package p100p;

import p094o.C2827d;
import p094o.C2830e;

/* renamed from: p.m */
public abstract class C2901m implements C2889d {

    /* renamed from: a */
    public int f9615a;

    /* renamed from: b */
    C2830e f9616b;

    /* renamed from: c */
    C2898k f9617c;

    /* renamed from: d */
    protected C2830e.C2832b f9618d;

    /* renamed from: e */
    C2893g f9619e = new C2893g(this);

    /* renamed from: f */
    public int f9620f = 0;

    /* renamed from: g */
    boolean f9621g = false;

    /* renamed from: h */
    public C2891f f9622h = new C2891f(this);

    /* renamed from: i */
    public C2891f f9623i = new C2891f(this);

    /* renamed from: j */
    protected C2903b f9624j = C2903b.NONE;

    /* renamed from: p.m$a */
    static /* synthetic */ class C2902a {

        /* renamed from: a */
        static final /* synthetic */ int[] f9625a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                o.d$b[] r0 = p094o.C2827d.C2829b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9625a = r0
                o.d$b r1 = p094o.C2827d.C2829b.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9625a     // Catch:{ NoSuchFieldError -> 0x001d }
                o.d$b r1 = p094o.C2827d.C2829b.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9625a     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.d$b r1 = p094o.C2827d.C2829b.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f9625a     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.d$b r1 = p094o.C2827d.C2829b.BASELINE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f9625a     // Catch:{ NoSuchFieldError -> 0x003e }
                o.d$b r1 = p094o.C2827d.C2829b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p100p.C2901m.C2902a.<clinit>():void");
        }
    }

    /* renamed from: p.m$b */
    enum C2903b {
        NONE,
        START,
        END,
        CENTER
    }

    public C2901m(C2830e eVar) {
        this.f9616b = eVar;
    }

    /* renamed from: l */
    private void m13186l(int i, int i2) {
        int i3;
        C2893g gVar;
        int i4 = this.f9615a;
        if (i4 != 0) {
            if (i4 == 1) {
                int g = mo10059g(this.f9619e.f9601m, i);
                gVar = this.f9619e;
                i3 = Math.min(g, i2);
                gVar.mo10049d(i3);
            } else if (i4 == 2) {
                C2830e G = this.f9616b.mo9669G();
                if (G != null) {
                    C2893g gVar2 = (i == 0 ? G.f9226e : G.f9228f).f9619e;
                    if (gVar2.f9589j) {
                        C2830e eVar = this.f9616b;
                        i2 = (int) ((((float) gVar2.f9586g) * (i == 0 ? eVar.f9250q : eVar.f9256t)) + 0.5f);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (i4 == 3) {
                C2830e eVar2 = this.f9616b;
                C2901m mVar = eVar2.f9226e;
                C2830e.C2832b bVar = mVar.f9618d;
                C2830e.C2832b bVar2 = C2830e.C2832b.MATCH_CONSTRAINT;
                if (bVar == bVar2 && mVar.f9615a == 3) {
                    C2899l lVar = eVar2.f9228f;
                    if (lVar.f9618d == bVar2 && lVar.f9615a == 3) {
                        return;
                    }
                }
                if (i == 0) {
                    mVar = eVar2.f9228f;
                }
                if (mVar.f9619e.f9589j) {
                    float t = eVar2.mo9723t();
                    this.f9619e.mo10049d(i == 1 ? (int) ((((float) mVar.f9619e.f9586g) / t) + 0.5f) : (int) ((t * ((float) mVar.f9619e.f9586g)) + 0.5f));
                    return;
                }
                return;
            } else {
                return;
            }
        }
        gVar = this.f9619e;
        i3 = mo10059g(i2, i);
        gVar.mo10049d(i3);
    }

    /* renamed from: a */
    public void mo10031a(C2889d dVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo10057b(C2891f fVar, C2891f fVar2, int i) {
        fVar.f9591l.add(fVar2);
        fVar.f9585f = i;
        fVar2.f9590k.add(fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo10058c(C2891f fVar, C2891f fVar2, int i, C2893g gVar) {
        fVar.f9591l.add(fVar2);
        fVar.f9591l.add(this.f9619e);
        fVar.f9587h = i;
        fVar.f9588i = gVar;
        fVar2.f9590k.add(fVar);
        gVar.f9590k.add(fVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract void mo10032d();

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo10033e();

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract void mo10034f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final int mo10059g(int i, int i2) {
        int i3;
        if (i2 == 0) {
            C2830e eVar = this.f9616b;
            int i4 = eVar.f9248p;
            i3 = Math.max(eVar.f9246o, i);
            if (i4 > 0) {
                i3 = Math.min(i4, i);
            }
            if (i3 == i) {
                return i;
            }
        } else {
            C2830e eVar2 = this.f9616b;
            int i5 = eVar2.f9254s;
            int max = Math.max(eVar2.f9252r, i);
            if (i5 > 0) {
                max = Math.min(i5, i);
            }
            if (i3 == i) {
                return i;
            }
        }
        return i3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C2891f mo10060h(C2827d dVar) {
        C2901m mVar;
        C2901m mVar2;
        C2827d dVar2 = dVar.f9176d;
        if (dVar2 == null) {
            return null;
        }
        C2830e eVar = dVar2.f9174b;
        int i = C2902a.f9625a[dVar2.f9175c.ordinal()];
        if (i != 1) {
            if (i == 2) {
                mVar2 = eVar.f9226e;
            } else if (i == 3) {
                mVar = eVar.f9228f;
            } else if (i == 4) {
                return eVar.f9228f.f9612k;
            } else {
                if (i != 5) {
                    return null;
                }
                mVar2 = eVar.f9228f;
            }
            return mVar2.f9623i;
        }
        mVar = eVar.f9226e;
        return mVar.f9622h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C2891f mo10061i(C2827d dVar, int i) {
        C2827d dVar2 = dVar.f9176d;
        if (dVar2 == null) {
            return null;
        }
        C2830e eVar = dVar2.f9174b;
        C2901m mVar = i == 0 ? eVar.f9226e : eVar.f9228f;
        int i2 = C2902a.f9625a[dVar2.f9175c.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return mVar.f9623i;
        }
        return mVar.f9622h;
    }

    /* renamed from: j */
    public long mo10035j() {
        C2893g gVar = this.f9619e;
        if (gVar.f9589j) {
            return (long) gVar.f9586g;
        }
        return 0;
    }

    /* renamed from: k */
    public boolean mo10062k() {
        return this.f9621g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public abstract boolean mo10036m();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo10063n(C2889d dVar, C2827d dVar2, C2827d dVar3, int i) {
        C2891f fVar;
        C2891f h = mo10060h(dVar2);
        C2891f h2 = mo10060h(dVar3);
        if (h.f9589j && h2.f9589j) {
            int c = h.f9586g + dVar2.mo9644c();
            int c2 = h2.f9586g - dVar3.mo9644c();
            int i2 = c2 - c;
            if (!this.f9619e.f9589j && this.f9618d == C2830e.C2832b.MATCH_CONSTRAINT) {
                m13186l(i, i2);
            }
            C2893g gVar = this.f9619e;
            if (gVar.f9589j) {
                if (gVar.f9586g == i2) {
                    this.f9622h.mo10049d(c);
                    fVar = this.f9623i;
                } else {
                    C2830e eVar = this.f9616b;
                    float w = i == 0 ? eVar.mo9729w() : eVar.mo9677K();
                    if (h == h2) {
                        c = h.f9586g;
                        c2 = h2.f9586g;
                        w = 0.5f;
                    }
                    this.f9622h.mo10049d((int) (((float) c) + 0.5f + (((float) ((c2 - c) - this.f9619e.f9586g)) * w)));
                    fVar = this.f9623i;
                    c2 = this.f9622h.f9586g + this.f9619e.f9586g;
                }
                fVar.mo10049d(c2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo10064o(C2889d dVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo10065p(C2889d dVar) {
    }
}
