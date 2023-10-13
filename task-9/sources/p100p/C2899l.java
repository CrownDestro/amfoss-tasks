package p100p;

import p094o.C2830e;
import p100p.C2891f;

/* renamed from: p.l */
public class C2899l extends C2901m {

    /* renamed from: k */
    public C2891f f9612k;

    /* renamed from: l */
    C2893g f9613l = null;

    /* renamed from: p.l$a */
    static /* synthetic */ class C2900a {

        /* renamed from: a */
        static final /* synthetic */ int[] f9614a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                p.m$b[] r0 = p100p.C2901m.C2903b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9614a = r0
                p.m$b r1 = p100p.C2901m.C2903b.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9614a     // Catch:{ NoSuchFieldError -> 0x001d }
                p.m$b r1 = p100p.C2901m.C2903b.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9614a     // Catch:{ NoSuchFieldError -> 0x0028 }
                p.m$b r1 = p100p.C2901m.C2903b.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p100p.C2899l.C2900a.<clinit>():void");
        }
    }

    public C2899l(C2830e eVar) {
        super(eVar);
        C2891f fVar = new C2891f(this);
        this.f9612k = fVar;
        this.f9622h.f9584e = C2891f.C2892a.TOP;
        this.f9623i.f9584e = C2891f.C2892a.BOTTOM;
        fVar.f9584e = C2891f.C2892a.BASELINE;
        this.f9620f = 1;
    }

    /* renamed from: a */
    public void mo10031a(C2889d dVar) {
        int i;
        float f;
        int i2 = C2900a.f9614a[this.f9624j.ordinal()];
        if (i2 == 1) {
            mo10065p(dVar);
        } else if (i2 == 2) {
            mo10064o(dVar);
        } else if (i2 == 3) {
            C2830e eVar = this.f9616b;
            mo10063n(dVar, eVar.f9194C, eVar.f9196E, 1);
            return;
        }
        C2893g gVar = this.f9619e;
        if (gVar.f9582c && !gVar.f9589j && this.f9618d == C2830e.C2832b.MATCH_CONSTRAINT) {
            C2830e eVar2 = this.f9616b;
            int i3 = eVar2.f9242m;
            if (i3 == 2) {
                C2830e G = eVar2.mo9669G();
                if (G != null) {
                    C2893g gVar2 = G.f9228f.f9619e;
                    if (gVar2.f9589j) {
                        i = (int) ((((float) gVar2.f9586g) * this.f9616b.f9256t) + 0.5f);
                    }
                }
            } else if (i3 == 3 && eVar2.f9226e.f9619e.f9589j) {
                int u = eVar2.mo9725u();
                if (u != -1) {
                    if (u == 0) {
                        C2830e eVar3 = this.f9616b;
                        f = ((float) eVar3.f9226e.f9619e.f9586g) * eVar3.mo9723t();
                        i = (int) (f + 0.5f);
                    } else if (u != 1) {
                        i = 0;
                    }
                }
                C2830e eVar4 = this.f9616b;
                f = ((float) eVar4.f9226e.f9619e.f9586g) / eVar4.mo9723t();
                i = (int) (f + 0.5f);
            }
            this.f9619e.mo10049d(i);
        }
        C2891f fVar = this.f9622h;
        if (fVar.f9582c) {
            C2891f fVar2 = this.f9623i;
            if (fVar2.f9582c) {
                if (!fVar.f9589j || !fVar2.f9589j || !this.f9619e.f9589j) {
                    if (!this.f9619e.f9589j && this.f9618d == C2830e.C2832b.MATCH_CONSTRAINT) {
                        C2830e eVar5 = this.f9616b;
                        if (eVar5.f9240l == 0 && !eVar5.mo9689X()) {
                            int i4 = this.f9622h.f9591l.get(0).f9586g;
                            C2891f fVar3 = this.f9622h;
                            int i5 = i4 + fVar3.f9585f;
                            int i6 = this.f9623i.f9591l.get(0).f9586g + this.f9623i.f9585f;
                            fVar3.mo10049d(i5);
                            this.f9623i.mo10049d(i6);
                            this.f9619e.mo10049d(i6 - i5);
                            return;
                        }
                    }
                    if (!this.f9619e.f9589j && this.f9618d == C2830e.C2832b.MATCH_CONSTRAINT && this.f9615a == 1 && this.f9622h.f9591l.size() > 0 && this.f9623i.f9591l.size() > 0) {
                        int i7 = (this.f9623i.f9591l.get(0).f9586g + this.f9623i.f9585f) - (this.f9622h.f9591l.get(0).f9586g + this.f9622h.f9585f);
                        C2893g gVar3 = this.f9619e;
                        int i8 = gVar3.f9601m;
                        if (i7 < i8) {
                            gVar3.mo10049d(i7);
                        } else {
                            gVar3.mo10049d(i8);
                        }
                    }
                    if (this.f9619e.f9589j && this.f9622h.f9591l.size() > 0 && this.f9623i.f9591l.size() > 0) {
                        C2891f fVar4 = this.f9622h.f9591l.get(0);
                        C2891f fVar5 = this.f9623i.f9591l.get(0);
                        int i9 = fVar4.f9586g + this.f9622h.f9585f;
                        int i10 = fVar5.f9586g + this.f9623i.f9585f;
                        float K = this.f9616b.mo9677K();
                        if (fVar4 == fVar5) {
                            i9 = fVar4.f9586g;
                            i10 = fVar5.f9586g;
                            K = 0.5f;
                        }
                        this.f9622h.mo10049d((int) (((float) i9) + 0.5f + (((float) ((i10 - i9) - this.f9619e.f9586g)) * K)));
                        this.f9623i.mo10049d(this.f9622h.f9586g + this.f9619e.f9586g);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02e3, code lost:
        if (r9.f9616b.mo9685S() != false) goto L_0x02e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x033e, code lost:
        if (r0.f9618d == r1) goto L_0x03e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0370, code lost:
        if (r9.f9616b.mo9685S() != false) goto L_0x02e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x03e7, code lost:
        if (r0.f9618d == r1) goto L_0x03e9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x040d  */
    /* JADX WARNING: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10032d() {
        /*
            r9 = this;
            o.e r0 = r9.f9616b
            boolean r1 = r0.f9218a
            if (r1 == 0) goto L_0x000f
            p.g r1 = r9.f9619e
            int r0 = r0.mo9727v()
            r1.mo10049d(r0)
        L_0x000f:
            p.g r0 = r9.f9619e
            boolean r0 = r0.f9589j
            if (r0 != 0) goto L_0x0097
            o.e r0 = r9.f9616b
            o.e$b r0 = r0.mo9679M()
            r9.f9618d = r0
            o.e r0 = r9.f9616b
            boolean r0 = r0.mo9685S()
            if (r0 == 0) goto L_0x002c
            p.a r0 = new p.a
            r0.<init>(r9)
            r9.f9613l = r0
        L_0x002c:
            o.e$b r0 = r9.f9618d
            o.e$b r1 = p094o.C2830e.C2832b.MATCH_CONSTRAINT
            if (r0 == r1) goto L_0x00d1
            o.e$b r1 = p094o.C2830e.C2832b.MATCH_PARENT
            if (r0 != r1) goto L_0x0085
            o.e r0 = r9.f9616b
            o.e r0 = r0.mo9669G()
            if (r0 == 0) goto L_0x0085
            o.e$b r1 = r0.mo9679M()
            o.e$b r2 = p094o.C2830e.C2832b.FIXED
            if (r1 != r2) goto L_0x0085
            int r1 = r0.mo9727v()
            o.e r2 = r9.f9616b
            o.d r2 = r2.f9194C
            int r2 = r2.mo9644c()
            int r1 = r1 - r2
            o.e r2 = r9.f9616b
            o.d r2 = r2.f9196E
            int r2 = r2.mo9644c()
            int r1 = r1 - r2
            p.f r2 = r9.f9622h
            p.l r3 = r0.f9228f
            p.f r3 = r3.f9622h
            o.e r4 = r9.f9616b
            o.d r4 = r4.f9194C
            int r4 = r4.mo9644c()
            r9.mo10057b(r2, r3, r4)
            p.f r2 = r9.f9623i
            p.l r0 = r0.f9228f
            p.f r0 = r0.f9623i
            o.e r3 = r9.f9616b
            o.d r3 = r3.f9196E
            int r3 = r3.mo9644c()
            int r3 = -r3
            r9.mo10057b(r2, r0, r3)
            p.g r0 = r9.f9619e
            r0.mo10049d(r1)
            return
        L_0x0085:
            o.e$b r0 = r9.f9618d
            o.e$b r1 = p094o.C2830e.C2832b.FIXED
            if (r0 != r1) goto L_0x00d1
            p.g r0 = r9.f9619e
            o.e r1 = r9.f9616b
            int r1 = r1.mo9727v()
            r0.mo10049d(r1)
            goto L_0x00d1
        L_0x0097:
            o.e$b r0 = r9.f9618d
            o.e$b r1 = p094o.C2830e.C2832b.MATCH_PARENT
            if (r0 != r1) goto L_0x00d1
            o.e r0 = r9.f9616b
            o.e r0 = r0.mo9669G()
            if (r0 == 0) goto L_0x00d1
            o.e$b r1 = r0.mo9679M()
            o.e$b r2 = p094o.C2830e.C2832b.FIXED
            if (r1 != r2) goto L_0x00d1
            p.f r1 = r9.f9622h
            p.l r2 = r0.f9228f
            p.f r2 = r2.f9622h
            o.e r3 = r9.f9616b
            o.d r3 = r3.f9194C
            int r3 = r3.mo9644c()
            r9.mo10057b(r1, r2, r3)
            p.f r1 = r9.f9623i
            p.l r0 = r0.f9228f
            p.f r0 = r0.f9623i
            o.e r2 = r9.f9616b
            o.d r2 = r2.f9196E
            int r2 = r2.mo9644c()
            int r2 = -r2
            r9.mo10057b(r1, r0, r2)
            return
        L_0x00d1:
            p.g r0 = r9.f9619e
            boolean r1 = r0.f9589j
            r2 = 0
            r3 = 4
            r4 = 1
            r5 = 2
            r6 = 3
            if (r1 == 0) goto L_0x0239
            o.e r7 = r9.f9616b
            boolean r8 = r7.f9218a
            if (r8 == 0) goto L_0x0239
            o.d[] r0 = r7.f9201J
            r1 = r0[r5]
            o.d r1 = r1.f9176d
            if (r1 == 0) goto L_0x016a
            r1 = r0[r6]
            o.d r1 = r1.f9176d
            if (r1 == 0) goto L_0x016a
            boolean r0 = r7.mo9689X()
            if (r0 == 0) goto L_0x0114
            p.f r0 = r9.f9622h
            o.e r1 = r9.f9616b
            o.d[] r1 = r1.f9201J
            r1 = r1[r5]
            int r1 = r1.mo9644c()
            r0.f9585f = r1
            p.f r0 = r9.f9623i
            o.e r1 = r9.f9616b
            o.d[] r1 = r1.f9201J
            r1 = r1[r6]
            int r1 = r1.mo9644c()
            int r1 = -r1
            r0.f9585f = r1
            goto L_0x0153
        L_0x0114:
            o.e r0 = r9.f9616b
            o.d[] r0 = r0.f9201J
            r0 = r0[r5]
            p.f r0 = r9.mo10060h(r0)
            if (r0 == 0) goto L_0x012f
            p.f r1 = r9.f9622h
            o.e r2 = r9.f9616b
            o.d[] r2 = r2.f9201J
            r2 = r2[r5]
            int r2 = r2.mo9644c()
            r9.mo10057b(r1, r0, r2)
        L_0x012f:
            o.e r0 = r9.f9616b
            o.d[] r0 = r0.f9201J
            r0 = r0[r6]
            p.f r0 = r9.mo10060h(r0)
            if (r0 == 0) goto L_0x014b
            p.f r1 = r9.f9623i
            o.e r2 = r9.f9616b
            o.d[] r2 = r2.f9201J
            r2 = r2[r6]
            int r2 = r2.mo9644c()
            int r2 = -r2
            r9.mo10057b(r1, r0, r2)
        L_0x014b:
            p.f r0 = r9.f9622h
            r0.f9581b = r4
            p.f r0 = r9.f9623i
            r0.f9581b = r4
        L_0x0153:
            o.e r0 = r9.f9616b
            boolean r0 = r0.mo9685S()
            if (r0 == 0) goto L_0x0411
        L_0x015b:
            p.f r0 = r9.f9612k
            p.f r1 = r9.f9622h
            o.e r2 = r9.f9616b
            int r2 = r2.mo9711n()
        L_0x0165:
            r9.mo10057b(r0, r1, r2)
            goto L_0x0411
        L_0x016a:
            r1 = r0[r5]
            o.d r1 = r1.f9176d
            if (r1 == 0) goto L_0x019b
            r0 = r0[r5]
            p.f r0 = r9.mo10060h(r0)
            if (r0 == 0) goto L_0x0411
            p.f r1 = r9.f9622h
            o.e r2 = r9.f9616b
            o.d[] r2 = r2.f9201J
            r2 = r2[r5]
            int r2 = r2.mo9644c()
            r9.mo10057b(r1, r0, r2)
            p.f r0 = r9.f9623i
            p.f r1 = r9.f9622h
            p.g r2 = r9.f9619e
            int r2 = r2.f9586g
            r9.mo10057b(r0, r1, r2)
            o.e r0 = r9.f9616b
            boolean r0 = r0.mo9685S()
            if (r0 == 0) goto L_0x0411
            goto L_0x015b
        L_0x019b:
            r1 = r0[r6]
            o.d r1 = r1.f9176d
            if (r1 == 0) goto L_0x01ce
            r0 = r0[r6]
            p.f r0 = r9.mo10060h(r0)
            if (r0 == 0) goto L_0x01c5
            p.f r1 = r9.f9623i
            o.e r2 = r9.f9616b
            o.d[] r2 = r2.f9201J
            r2 = r2[r6]
            int r2 = r2.mo9644c()
            int r2 = -r2
            r9.mo10057b(r1, r0, r2)
            p.f r0 = r9.f9622h
            p.f r1 = r9.f9623i
            p.g r2 = r9.f9619e
            int r2 = r2.f9586g
            int r2 = -r2
            r9.mo10057b(r0, r1, r2)
        L_0x01c5:
            o.e r0 = r9.f9616b
            boolean r0 = r0.mo9685S()
            if (r0 == 0) goto L_0x0411
            goto L_0x015b
        L_0x01ce:
            r1 = r0[r3]
            o.d r1 = r1.f9176d
            if (r1 == 0) goto L_0x01f9
            r0 = r0[r3]
            p.f r0 = r9.mo10060h(r0)
            if (r0 == 0) goto L_0x0411
            p.f r1 = r9.f9612k
            r9.mo10057b(r1, r0, r2)
            p.f r0 = r9.f9622h
            p.f r1 = r9.f9612k
            o.e r2 = r9.f9616b
            int r2 = r2.mo9711n()
            int r2 = -r2
            r9.mo10057b(r0, r1, r2)
            p.f r0 = r9.f9623i
            p.f r1 = r9.f9622h
            p.g r2 = r9.f9619e
            int r2 = r2.f9586g
            goto L_0x0165
        L_0x01f9:
            boolean r0 = r7 instanceof p094o.C2838i
            if (r0 != 0) goto L_0x0411
            o.e r0 = r7.mo9669G()
            if (r0 == 0) goto L_0x0411
            o.e r0 = r9.f9616b
            o.d$b r1 = p094o.C2827d.C2829b.CENTER
            o.d r0 = r0.mo9709m(r1)
            o.d r0 = r0.f9176d
            if (r0 != 0) goto L_0x0411
            o.e r0 = r9.f9616b
            o.e r0 = r0.mo9669G()
            p.l r0 = r0.f9228f
            p.f r0 = r0.f9622h
            p.f r1 = r9.f9622h
            o.e r2 = r9.f9616b
            int r2 = r2.mo9684R()
            r9.mo10057b(r1, r0, r2)
            p.f r0 = r9.f9623i
            p.f r1 = r9.f9622h
            p.g r2 = r9.f9619e
            int r2 = r2.f9586g
            r9.mo10057b(r0, r1, r2)
            o.e r0 = r9.f9616b
            boolean r0 = r0.mo9685S()
            if (r0 == 0) goto L_0x0411
            goto L_0x015b
        L_0x0239:
            if (r1 != 0) goto L_0x0288
            o.e$b r1 = r9.f9618d
            o.e$b r7 = p094o.C2830e.C2832b.MATCH_CONSTRAINT
            if (r1 != r7) goto L_0x0288
            o.e r0 = r9.f9616b
            int r1 = r0.f9242m
            if (r1 == r5) goto L_0x025a
            if (r1 == r6) goto L_0x024a
            goto L_0x028b
        L_0x024a:
            boolean r0 = r0.mo9689X()
            if (r0 != 0) goto L_0x028b
            o.e r0 = r9.f9616b
            int r1 = r0.f9240l
            if (r1 != r6) goto L_0x0257
            goto L_0x028b
        L_0x0257:
            p.j r0 = r0.f9226e
            goto L_0x0263
        L_0x025a:
            o.e r0 = r0.mo9669G()
            if (r0 != 0) goto L_0x0261
            goto L_0x028b
        L_0x0261:
            p.l r0 = r0.f9228f
        L_0x0263:
            p.g r0 = r0.f9619e
            p.g r1 = r9.f9619e
            java.util.List<p.f> r1 = r1.f9591l
            r1.add(r0)
            java.util.List<p.d> r0 = r0.f9590k
            p.g r1 = r9.f9619e
            r0.add(r1)
            p.g r0 = r9.f9619e
            r0.f9581b = r4
            java.util.List<p.d> r0 = r0.f9590k
            p.f r1 = r9.f9622h
            r0.add(r1)
            p.g r0 = r9.f9619e
            java.util.List<p.d> r0 = r0.f9590k
            p.f r1 = r9.f9623i
            r0.add(r1)
            goto L_0x028b
        L_0x0288:
            r0.mo10047b(r9)
        L_0x028b:
            o.e r0 = r9.f9616b
            o.d[] r1 = r0.f9201J
            r7 = r1[r5]
            o.d r7 = r7.f9176d
            if (r7 == 0) goto L_0x02f0
            r7 = r1[r6]
            o.d r7 = r7.f9176d
            if (r7 == 0) goto L_0x02f0
            boolean r0 = r0.mo9689X()
            if (r0 == 0) goto L_0x02bf
            p.f r0 = r9.f9622h
            o.e r1 = r9.f9616b
            o.d[] r1 = r1.f9201J
            r1 = r1[r5]
            int r1 = r1.mo9644c()
            r0.f9585f = r1
            p.f r0 = r9.f9623i
            o.e r1 = r9.f9616b
            o.d[] r1 = r1.f9201J
            r1 = r1[r6]
            int r1 = r1.mo9644c()
            int r1 = -r1
            r0.f9585f = r1
            goto L_0x02dd
        L_0x02bf:
            o.e r0 = r9.f9616b
            o.d[] r0 = r0.f9201J
            r0 = r0[r5]
            p.f r0 = r9.mo10060h(r0)
            o.e r1 = r9.f9616b
            o.d[] r1 = r1.f9201J
            r1 = r1[r6]
            p.f r1 = r9.mo10060h(r1)
            r0.mo10047b(r9)
            r1.mo10047b(r9)
            p.m$b r0 = p100p.C2901m.C2903b.CENTER
            r9.f9624j = r0
        L_0x02dd:
            o.e r0 = r9.f9616b
            boolean r0 = r0.mo9685S()
            if (r0 == 0) goto L_0x0403
        L_0x02e5:
            p.f r0 = r9.f9612k
            p.f r1 = r9.f9622h
            p.g r2 = r9.f9613l
        L_0x02eb:
            r9.mo10058c(r0, r1, r4, r2)
            goto L_0x0403
        L_0x02f0:
            r7 = r1[r5]
            o.d r7 = r7.f9176d
            r8 = 0
            if (r7 == 0) goto L_0x0342
            r0 = r1[r5]
            p.f r0 = r9.mo10060h(r0)
            if (r0 == 0) goto L_0x0403
            p.f r1 = r9.f9622h
            o.e r2 = r9.f9616b
            o.d[] r2 = r2.f9201J
            r2 = r2[r5]
            int r2 = r2.mo9644c()
            r9.mo10057b(r1, r0, r2)
            p.f r0 = r9.f9623i
            p.f r1 = r9.f9622h
            p.g r2 = r9.f9619e
            r9.mo10058c(r0, r1, r4, r2)
            o.e r0 = r9.f9616b
            boolean r0 = r0.mo9685S()
            if (r0 == 0) goto L_0x0328
            p.f r0 = r9.f9612k
            p.f r1 = r9.f9622h
            p.g r2 = r9.f9613l
            r9.mo10058c(r0, r1, r4, r2)
        L_0x0328:
            o.e$b r0 = r9.f9618d
            o.e$b r1 = p094o.C2830e.C2832b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x0403
            o.e r0 = r9.f9616b
            float r0 = r0.mo9723t()
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0403
            o.e r0 = r9.f9616b
            p.j r0 = r0.f9226e
            o.e$b r2 = r0.f9618d
            if (r2 != r1) goto L_0x0403
            goto L_0x03e9
        L_0x0342:
            r5 = r1[r6]
            o.d r5 = r5.f9176d
            r7 = -1
            if (r5 == 0) goto L_0x0374
            r0 = r1[r6]
            p.f r0 = r9.mo10060h(r0)
            if (r0 == 0) goto L_0x0403
            p.f r1 = r9.f9623i
            o.e r2 = r9.f9616b
            o.d[] r2 = r2.f9201J
            r2 = r2[r6]
            int r2 = r2.mo9644c()
            int r2 = -r2
            r9.mo10057b(r1, r0, r2)
            p.f r0 = r9.f9622h
            p.f r1 = r9.f9623i
            p.g r2 = r9.f9619e
            r9.mo10058c(r0, r1, r7, r2)
            o.e r0 = r9.f9616b
            boolean r0 = r0.mo9685S()
            if (r0 == 0) goto L_0x0403
            goto L_0x02e5
        L_0x0374:
            r5 = r1[r3]
            o.d r5 = r5.f9176d
            if (r5 == 0) goto L_0x0398
            r0 = r1[r3]
            p.f r0 = r9.mo10060h(r0)
            if (r0 == 0) goto L_0x0403
            p.f r1 = r9.f9612k
            r9.mo10057b(r1, r0, r2)
            p.f r0 = r9.f9622h
            p.f r1 = r9.f9612k
            p.g r2 = r9.f9613l
            r9.mo10058c(r0, r1, r7, r2)
            p.f r0 = r9.f9623i
            p.f r1 = r9.f9622h
            p.g r2 = r9.f9619e
            goto L_0x02eb
        L_0x0398:
            boolean r1 = r0 instanceof p094o.C2838i
            if (r1 != 0) goto L_0x0403
            o.e r0 = r0.mo9669G()
            if (r0 == 0) goto L_0x0403
            o.e r0 = r9.f9616b
            o.e r0 = r0.mo9669G()
            p.l r0 = r0.f9228f
            p.f r0 = r0.f9622h
            p.f r1 = r9.f9622h
            o.e r2 = r9.f9616b
            int r2 = r2.mo9684R()
            r9.mo10057b(r1, r0, r2)
            p.f r0 = r9.f9623i
            p.f r1 = r9.f9622h
            p.g r2 = r9.f9619e
            r9.mo10058c(r0, r1, r4, r2)
            o.e r0 = r9.f9616b
            boolean r0 = r0.mo9685S()
            if (r0 == 0) goto L_0x03d1
            p.f r0 = r9.f9612k
            p.f r1 = r9.f9622h
            p.g r2 = r9.f9613l
            r9.mo10058c(r0, r1, r4, r2)
        L_0x03d1:
            o.e$b r0 = r9.f9618d
            o.e$b r1 = p094o.C2830e.C2832b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x0403
            o.e r0 = r9.f9616b
            float r0 = r0.mo9723t()
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0403
            o.e r0 = r9.f9616b
            p.j r0 = r0.f9226e
            o.e$b r2 = r0.f9618d
            if (r2 != r1) goto L_0x0403
        L_0x03e9:
            p.g r0 = r0.f9619e
            java.util.List<p.d> r0 = r0.f9590k
            p.g r1 = r9.f9619e
            r0.add(r1)
            p.g r0 = r9.f9619e
            java.util.List<p.f> r0 = r0.f9591l
            o.e r1 = r9.f9616b
            p.j r1 = r1.f9226e
            p.g r1 = r1.f9619e
            r0.add(r1)
            p.g r0 = r9.f9619e
            r0.f9580a = r9
        L_0x0403:
            p.g r0 = r9.f9619e
            java.util.List<p.f> r0 = r0.f9591l
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0411
            p.g r0 = r9.f9619e
            r0.f9582c = r4
        L_0x0411:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p100p.C2899l.mo10032d():void");
    }

    /* renamed from: e */
    public void mo10033e() {
        C2891f fVar = this.f9622h;
        if (fVar.f9589j) {
            this.f9616b.mo9670G0(fVar.f9586g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo10034f() {
        this.f9617c = null;
        this.f9622h.mo10048c();
        this.f9623i.mo10048c();
        this.f9612k.mo10048c();
        this.f9619e.mo10048c();
        this.f9621g = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo10036m() {
        return this.f9618d != C2830e.C2832b.MATCH_CONSTRAINT || this.f9616b.f9242m == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo10055q() {
        this.f9621g = false;
        this.f9622h.mo10048c();
        this.f9622h.f9589j = false;
        this.f9623i.mo10048c();
        this.f9623i.f9589j = false;
        this.f9612k.mo10048c();
        this.f9612k.f9589j = false;
        this.f9619e.f9589j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f9616b.mo9719r();
    }
}
