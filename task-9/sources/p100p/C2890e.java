package p100p;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p094o.C2830e;
import p094o.C2833f;
import p094o.C2836h;
import p094o.C2839j;
import p100p.C2885b;

/* renamed from: p.e */
public class C2890e {

    /* renamed from: a */
    private C2833f f9571a;

    /* renamed from: b */
    private boolean f9572b = true;

    /* renamed from: c */
    private boolean f9573c = true;

    /* renamed from: d */
    private C2833f f9574d;

    /* renamed from: e */
    private ArrayList<C2901m> f9575e = new ArrayList<>();

    /* renamed from: f */
    private ArrayList<C2898k> f9576f = new ArrayList<>();

    /* renamed from: g */
    private C2885b.C2887b f9577g = null;

    /* renamed from: h */
    private C2885b.C2886a f9578h = new C2885b.C2886a();

    /* renamed from: i */
    ArrayList<C2898k> f9579i = new ArrayList<>();

    public C2890e(C2833f fVar) {
        this.f9571a = fVar;
        this.f9574d = fVar;
    }

    /* renamed from: a */
    private void m13138a(C2891f fVar, int i, int i2, C2891f fVar2, ArrayList<C2898k> arrayList, C2898k kVar) {
        C2901m mVar = fVar.f9583d;
        if (mVar.f9617c == null) {
            C2833f fVar3 = this.f9571a;
            if (mVar != fVar3.f9226e && mVar != fVar3.f9228f) {
                if (kVar == null) {
                    kVar = new C2898k(mVar, i2);
                    arrayList.add(kVar);
                }
                mVar.f9617c = kVar;
                kVar.mo10053a(mVar);
                for (C2889d next : mVar.f9622h.f9590k) {
                    if (next instanceof C2891f) {
                        m13138a((C2891f) next, i, 0, fVar2, arrayList, kVar);
                    }
                }
                for (C2889d next2 : mVar.f9623i.f9590k) {
                    if (next2 instanceof C2891f) {
                        m13138a((C2891f) next2, i, 1, fVar2, arrayList, kVar);
                    }
                }
                if (i == 1 && (mVar instanceof C2899l)) {
                    for (C2889d next3 : ((C2899l) mVar).f9612k.f9590k) {
                        if (next3 instanceof C2891f) {
                            m13138a((C2891f) next3, i, 2, fVar2, arrayList, kVar);
                        }
                    }
                }
                for (C2891f next4 : mVar.f9622h.f9591l) {
                    if (next4 == fVar2) {
                        kVar.f9606b = true;
                    }
                    m13138a(next4, i, 0, fVar2, arrayList, kVar);
                }
                for (C2891f next5 : mVar.f9623i.f9591l) {
                    if (next5 == fVar2) {
                        kVar.f9606b = true;
                    }
                    m13138a(next5, i, 1, fVar2, arrayList, kVar);
                }
                if (i == 1 && (mVar instanceof C2899l)) {
                    for (C2891f a : ((C2899l) mVar).f9612k.f9591l) {
                        m13138a(a, i, 2, fVar2, arrayList, kVar);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0074, code lost:
        if (r2.f9242m == 0) goto L_0x0065;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m13139b(p094o.C2833f r17) {
        /*
            r16 = this;
            r0 = r17
            java.util.ArrayList<o.e> r1 = r0.f9361w0
            java.util.Iterator r1 = r1.iterator()
        L_0x0008:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x0270
            java.lang.Object r2 = r1.next()
            o.e r2 = (p094o.C2830e) r2
            o.e$b[] r4 = r2.f9204M
            r5 = r4[r3]
            r10 = 1
            r4 = r4[r10]
            int r6 = r2.mo9681O()
            r7 = 8
            if (r6 != r7) goto L_0x0027
        L_0x0024:
            r2.f9218a = r10
            goto L_0x0008
        L_0x0027:
            float r6 = r2.f9250q
            r11 = 1065353216(0x3f800000, float:1.0)
            r7 = 2
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 >= 0) goto L_0x0036
            o.e$b r6 = p094o.C2830e.C2832b.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x0036
            r2.f9240l = r7
        L_0x0036:
            float r6 = r2.f9256t
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 >= 0) goto L_0x0042
            o.e$b r6 = p094o.C2830e.C2832b.MATCH_CONSTRAINT
            if (r4 != r6) goto L_0x0042
            r2.f9242m = r7
        L_0x0042:
            float r6 = r2.mo9723t()
            r8 = 0
            r9 = 3
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x0077
            o.e$b r6 = p094o.C2830e.C2832b.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x005b
            o.e$b r8 = p094o.C2830e.C2832b.WRAP_CONTENT
            if (r4 == r8) goto L_0x0058
            o.e$b r8 = p094o.C2830e.C2832b.FIXED
            if (r4 != r8) goto L_0x005b
        L_0x0058:
            r2.f9240l = r9
            goto L_0x0077
        L_0x005b:
            if (r4 != r6) goto L_0x0068
            o.e$b r8 = p094o.C2830e.C2832b.WRAP_CONTENT
            if (r5 == r8) goto L_0x0065
            o.e$b r8 = p094o.C2830e.C2832b.FIXED
            if (r5 != r8) goto L_0x0068
        L_0x0065:
            r2.f9242m = r9
            goto L_0x0077
        L_0x0068:
            if (r5 != r6) goto L_0x0077
            if (r4 != r6) goto L_0x0077
            int r6 = r2.f9240l
            if (r6 != 0) goto L_0x0072
            r2.f9240l = r9
        L_0x0072:
            int r6 = r2.f9242m
            if (r6 != 0) goto L_0x0077
            goto L_0x0065
        L_0x0077:
            o.e$b r6 = p094o.C2830e.C2832b.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x008d
            int r8 = r2.f9240l
            if (r8 != r10) goto L_0x008d
            o.d r8 = r2.f9193B
            o.d r8 = r8.f9176d
            if (r8 == 0) goto L_0x008b
            o.d r8 = r2.f9195D
            o.d r8 = r8.f9176d
            if (r8 != 0) goto L_0x008d
        L_0x008b:
            o.e$b r5 = p094o.C2830e.C2832b.WRAP_CONTENT
        L_0x008d:
            r8 = r5
            if (r4 != r6) goto L_0x00a2
            int r5 = r2.f9242m
            if (r5 != r10) goto L_0x00a2
            o.d r5 = r2.f9194C
            o.d r5 = r5.f9176d
            if (r5 == 0) goto L_0x00a0
            o.d r5 = r2.f9196E
            o.d r5 = r5.f9176d
            if (r5 != 0) goto L_0x00a2
        L_0x00a0:
            o.e$b r4 = p094o.C2830e.C2832b.WRAP_CONTENT
        L_0x00a2:
            r12 = r4
            p.j r4 = r2.f9226e
            r4.f9618d = r8
            int r5 = r2.f9240l
            r4.f9615a = r5
            p.l r4 = r2.f9228f
            r4.f9618d = r12
            int r13 = r2.f9242m
            r4.f9615a = r13
            o.e$b r4 = p094o.C2830e.C2832b.MATCH_PARENT
            if (r8 == r4) goto L_0x00bf
            o.e$b r14 = p094o.C2830e.C2832b.FIXED
            if (r8 == r14) goto L_0x00bf
            o.e$b r14 = p094o.C2830e.C2832b.WRAP_CONTENT
            if (r8 != r14) goto L_0x00cb
        L_0x00bf:
            if (r12 == r4) goto L_0x021c
            o.e$b r14 = p094o.C2830e.C2832b.FIXED
            if (r12 == r14) goto L_0x021c
            o.e$b r14 = p094o.C2830e.C2832b.WRAP_CONTENT
            if (r12 != r14) goto L_0x00cb
            goto L_0x021c
        L_0x00cb:
            r14 = 1056964608(0x3f000000, float:0.5)
            if (r8 != r6) goto L_0x014a
            o.e$b r15 = p094o.C2830e.C2832b.WRAP_CONTENT
            if (r12 == r15) goto L_0x00d7
            o.e$b r11 = p094o.C2830e.C2832b.FIXED
            if (r12 != r11) goto L_0x014a
        L_0x00d7:
            if (r5 != r9) goto L_0x00f8
            if (r12 != r15) goto L_0x00e5
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r15
            r4.m13142l(r5, r6, r7, r8, r9)
        L_0x00e5:
            int r9 = r2.mo9727v()
            float r3 = (float) r9
            float r4 = r2.f9208Q
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r7 = (int) r3
        L_0x00f0:
            o.e$b r8 = p094o.C2830e.C2832b.FIXED
        L_0x00f2:
            r4 = r16
            r5 = r2
            r6 = r8
            goto L_0x0255
        L_0x00f8:
            if (r5 != r10) goto L_0x0110
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r12
            r4.m13142l(r5, r6, r7, r8, r9)
            p.j r3 = r2.f9226e
            p.g r3 = r3.f9619e
            int r2 = r2.mo9682P()
        L_0x010c:
            r3.f9601m = r2
            goto L_0x0008
        L_0x0110:
            if (r5 != r7) goto L_0x0133
            o.e$b[] r11 = r0.f9204M
            r15 = r11[r3]
            o.e$b r7 = p094o.C2830e.C2832b.FIXED
            if (r15 == r7) goto L_0x011e
            r11 = r11[r3]
            if (r11 != r4) goto L_0x014a
        L_0x011e:
            float r3 = r2.f9250q
            int r4 = r17.mo9682P()
            float r4 = (float) r4
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r3 = (int) r3
            int r9 = r2.mo9727v()
            r4 = r16
            r5 = r2
            r6 = r7
            r7 = r3
            goto L_0x0147
        L_0x0133:
            o.d[] r7 = r2.f9201J
            r11 = r7[r3]
            o.d r11 = r11.f9176d
            if (r11 == 0) goto L_0x0141
            r7 = r7[r10]
            o.d r7 = r7.f9176d
            if (r7 != 0) goto L_0x014a
        L_0x0141:
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
        L_0x0147:
            r8 = r12
            goto L_0x0255
        L_0x014a:
            if (r12 != r6) goto L_0x01c3
            o.e$b r11 = p094o.C2830e.C2832b.WRAP_CONTENT
            if (r8 == r11) goto L_0x0154
            o.e$b r7 = p094o.C2830e.C2832b.FIXED
            if (r8 != r7) goto L_0x01c3
        L_0x0154:
            if (r13 != r9) goto L_0x017a
            if (r8 != r11) goto L_0x0162
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r11
            r8 = r11
            r4.m13142l(r5, r6, r7, r8, r9)
        L_0x0162:
            int r7 = r2.mo9682P()
            float r3 = r2.f9208Q
            int r4 = r2.mo9725u()
            r5 = -1
            if (r4 != r5) goto L_0x0173
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r4 / r3
        L_0x0173:
            float r4 = (float) r7
            float r4 = r4 * r3
            float r4 = r4 + r14
            int r9 = (int) r4
            goto L_0x00f0
        L_0x017a:
            if (r13 != r10) goto L_0x0188
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r8
            r8 = r11
            r4.m13142l(r5, r6, r7, r8, r9)
            goto L_0x0212
        L_0x0188:
            r7 = 2
            if (r13 != r7) goto L_0x01ad
            o.e$b[] r7 = r0.f9204M
            r9 = r7[r10]
            o.e$b r11 = p094o.C2830e.C2832b.FIXED
            if (r9 == r11) goto L_0x0197
            r7 = r7[r10]
            if (r7 != r4) goto L_0x01c3
        L_0x0197:
            float r3 = r2.f9256t
            int r7 = r2.mo9682P()
            int r4 = r17.mo9727v()
            float r4 = (float) r4
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r9 = (int) r3
            r4 = r16
            r5 = r2
            r6 = r8
            r8 = r11
            goto L_0x0255
        L_0x01ad:
            o.d[] r4 = r2.f9201J
            r7 = 2
            r15 = r4[r7]
            o.d r7 = r15.f9176d
            if (r7 == 0) goto L_0x01bc
            r4 = r4[r9]
            o.d r4 = r4.f9176d
            if (r4 != 0) goto L_0x01c3
        L_0x01bc:
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r11
            goto L_0x0147
        L_0x01c3:
            if (r8 != r6) goto L_0x0008
            if (r12 != r6) goto L_0x0008
            if (r5 == r10) goto L_0x01fd
            if (r13 != r10) goto L_0x01cc
            goto L_0x01fd
        L_0x01cc:
            r4 = 2
            if (r13 != r4) goto L_0x0008
            if (r5 != r4) goto L_0x0008
            o.e$b[] r4 = r0.f9204M
            r5 = r4[r3]
            o.e$b r8 = p094o.C2830e.C2832b.FIXED
            if (r5 == r8) goto L_0x01dd
            r3 = r4[r3]
            if (r3 != r8) goto L_0x0008
        L_0x01dd:
            r3 = r4[r10]
            if (r3 == r8) goto L_0x01e5
            r3 = r4[r10]
            if (r3 != r8) goto L_0x0008
        L_0x01e5:
            float r3 = r2.f9250q
            float r4 = r2.f9256t
            int r5 = r17.mo9682P()
            float r5 = (float) r5
            float r3 = r3 * r5
            float r3 = r3 + r14
            int r7 = (int) r3
            int r3 = r17.mo9727v()
            float r3 = (float) r3
            float r4 = r4 * r3
            float r4 = r4 + r14
            int r9 = (int) r4
            goto L_0x00f2
        L_0x01fd:
            o.e$b r8 = p094o.C2830e.C2832b.WRAP_CONTENT
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r8
            r4.m13142l(r5, r6, r7, r8, r9)
            p.j r3 = r2.f9226e
            p.g r3 = r3.f9619e
            int r4 = r2.mo9682P()
            r3.f9601m = r4
        L_0x0212:
            p.l r3 = r2.f9228f
            p.g r3 = r3.f9619e
            int r2 = r2.mo9727v()
            goto L_0x010c
        L_0x021c:
            int r3 = r2.mo9682P()
            if (r8 != r4) goto L_0x0235
            int r3 = r17.mo9682P()
            o.d r5 = r2.f9193B
            int r5 = r5.f9177e
            int r3 = r3 - r5
            o.d r5 = r2.f9195D
            int r5 = r5.f9177e
            int r3 = r3 - r5
            o.e$b r5 = p094o.C2830e.C2832b.FIXED
            r7 = r3
            r6 = r5
            goto L_0x0237
        L_0x0235:
            r7 = r3
            r6 = r8
        L_0x0237:
            int r3 = r2.mo9727v()
            if (r12 != r4) goto L_0x0250
            int r3 = r17.mo9727v()
            o.d r4 = r2.f9194C
            int r4 = r4.f9177e
            int r3 = r3 - r4
            o.d r4 = r2.f9196E
            int r4 = r4.f9177e
            int r3 = r3 - r4
            o.e$b r4 = p094o.C2830e.C2832b.FIXED
            r9 = r3
            r8 = r4
            goto L_0x0252
        L_0x0250:
            r9 = r3
            r8 = r12
        L_0x0252:
            r4 = r16
            r5 = r2
        L_0x0255:
            r4.m13142l(r5, r6, r7, r8, r9)
            p.j r3 = r2.f9226e
            p.g r3 = r3.f9619e
            int r4 = r2.mo9682P()
            r3.mo10049d(r4)
            p.l r3 = r2.f9228f
            p.g r3 = r3.f9619e
            int r4 = r2.mo9727v()
            r3.mo10049d(r4)
            goto L_0x0024
        L_0x0270:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p100p.C2890e.m13139b(o.f):boolean");
    }

    /* renamed from: e */
    private int m13140e(C2833f fVar, int i) {
        int size = this.f9579i.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j = Math.max(j, this.f9579i.get(i2).mo10054b(fVar, i));
        }
        return (int) j;
    }

    /* renamed from: i */
    private void m13141i(C2901m mVar, int i, ArrayList<C2898k> arrayList) {
        for (C2889d next : mVar.f9622h.f9590k) {
            if (next instanceof C2891f) {
                m13138a((C2891f) next, i, 0, mVar.f9623i, arrayList, (C2898k) null);
            } else if (next instanceof C2901m) {
                m13138a(((C2901m) next).f9622h, i, 0, mVar.f9623i, arrayList, (C2898k) null);
            }
        }
        for (C2889d next2 : mVar.f9623i.f9590k) {
            if (next2 instanceof C2891f) {
                m13138a((C2891f) next2, i, 1, mVar.f9622h, arrayList, (C2898k) null);
            } else if (next2 instanceof C2901m) {
                m13138a(((C2901m) next2).f9623i, i, 1, mVar.f9622h, arrayList, (C2898k) null);
            }
        }
        if (i == 1) {
            for (C2889d next3 : ((C2899l) mVar).f9612k.f9590k) {
                if (next3 instanceof C2891f) {
                    m13138a((C2891f) next3, i, 2, (C2891f) null, arrayList, (C2898k) null);
                }
            }
        }
    }

    /* renamed from: l */
    private void m13142l(C2830e eVar, C2830e.C2832b bVar, int i, C2830e.C2832b bVar2, int i2) {
        C2885b.C2886a aVar = this.f9578h;
        aVar.f9559a = bVar;
        aVar.f9560b = bVar2;
        aVar.f9561c = i;
        aVar.f9562d = i2;
        this.f9577g.mo2239b(eVar, aVar);
        eVar.mo9666E0(this.f9578h.f9563e);
        eVar.mo9700h0(this.f9578h.f9564f);
        eVar.mo9699g0(this.f9578h.f9566h);
        eVar.mo9693b0(this.f9578h.f9565g);
    }

    /* renamed from: c */
    public void mo10038c() {
        mo10039d(this.f9575e);
        this.f9579i.clear();
        C2898k.f9604h = 0;
        m13141i(this.f9571a.f9226e, 0, this.f9579i);
        m13141i(this.f9571a.f9228f, 1, this.f9579i);
        this.f9572b = false;
    }

    /* renamed from: d */
    public void mo10039d(ArrayList<C2901m> arrayList) {
        Object iVar;
        arrayList.clear();
        this.f9574d.f9226e.mo10034f();
        this.f9574d.f9228f.mo10034f();
        arrayList.add(this.f9574d.f9226e);
        arrayList.add(this.f9574d.f9228f);
        Iterator<C2830e> it = this.f9574d.f9361w0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C2830e next = it.next();
            if (next instanceof C2836h) {
                iVar = new C2894h(next);
            } else {
                if (next.mo9687V()) {
                    if (next.f9222c == null) {
                        next.f9222c = new C2888c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f9222c);
                } else {
                    arrayList.add(next.f9226e);
                }
                if (next.mo9689X()) {
                    if (next.f9224d == null) {
                        next.f9224d = new C2888c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f9224d);
                } else {
                    arrayList.add(next.f9228f);
                }
                if (next instanceof C2839j) {
                    iVar = new C2895i(next);
                }
            }
            arrayList.add(iVar);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<C2901m> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().mo10034f();
        }
        Iterator<C2901m> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C2901m next2 = it3.next();
            if (next2.f9616b != this.f9574d) {
                next2.mo10032d();
            }
        }
    }

    /* renamed from: f */
    public boolean mo10040f(boolean z) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = z & true;
        if (this.f9572b || this.f9573c) {
            Iterator<C2830e> it = this.f9571a.f9361w0.iterator();
            while (it.hasNext()) {
                C2830e next = it.next();
                next.f9218a = false;
                next.f9226e.mo10051r();
                next.f9228f.mo10055q();
            }
            C2833f fVar = this.f9571a;
            fVar.f9218a = false;
            fVar.f9226e.mo10051r();
            this.f9571a.f9228f.mo10055q();
            this.f9573c = false;
        }
        if (m13139b(this.f9574d)) {
            return false;
        }
        this.f9571a.mo9668F0(0);
        this.f9571a.mo9670G0(0);
        C2830e.C2832b s = this.f9571a.mo9721s(0);
        C2830e.C2832b s2 = this.f9571a.mo9721s(1);
        if (this.f9572b) {
            mo10038c();
        }
        int Q = this.f9571a.mo9683Q();
        int R = this.f9571a.mo9684R();
        this.f9571a.f9226e.f9622h.mo10049d(Q);
        this.f9571a.f9228f.f9622h.mo10049d(R);
        mo10045m();
        C2830e.C2832b bVar = C2830e.C2832b.WRAP_CONTENT;
        if (s == bVar || s2 == bVar) {
            if (z4) {
                Iterator<C2901m> it2 = this.f9575e.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!it2.next().mo10036m()) {
                            z4 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z4 && s == C2830e.C2832b.WRAP_CONTENT) {
                this.f9571a.mo9708l0(C2830e.C2832b.FIXED);
                C2833f fVar2 = this.f9571a;
                fVar2.mo9666E0(m13140e(fVar2, 0));
                C2833f fVar3 = this.f9571a;
                fVar3.f9226e.f9619e.mo10049d(fVar3.mo9682P());
            }
            if (z4 && s2 == C2830e.C2832b.WRAP_CONTENT) {
                this.f9571a.mo9658A0(C2830e.C2832b.FIXED);
                C2833f fVar4 = this.f9571a;
                fVar4.mo9700h0(m13140e(fVar4, 1));
                C2833f fVar5 = this.f9571a;
                fVar5.f9228f.f9619e.mo10049d(fVar5.mo9727v());
            }
        }
        C2833f fVar6 = this.f9571a;
        C2830e.C2832b[] bVarArr = fVar6.f9204M;
        C2830e.C2832b bVar2 = bVarArr[0];
        C2830e.C2832b bVar3 = C2830e.C2832b.FIXED;
        if (bVar2 == bVar3 || bVarArr[0] == C2830e.C2832b.MATCH_PARENT) {
            int P = fVar6.mo9682P() + Q;
            this.f9571a.f9226e.f9623i.mo10049d(P);
            this.f9571a.f9226e.f9619e.mo10049d(P - Q);
            mo10045m();
            C2833f fVar7 = this.f9571a;
            C2830e.C2832b[] bVarArr2 = fVar7.f9204M;
            if (bVarArr2[1] == bVar3 || bVarArr2[1] == C2830e.C2832b.MATCH_PARENT) {
                int v = fVar7.mo9727v() + R;
                this.f9571a.f9228f.f9623i.mo10049d(v);
                this.f9571a.f9228f.f9619e.mo10049d(v - R);
            }
            mo10045m();
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator<C2901m> it3 = this.f9575e.iterator();
        while (it3.hasNext()) {
            C2901m next2 = it3.next();
            if (next2.f9616b != this.f9571a || next2.f9621g) {
                next2.mo10033e();
            }
        }
        Iterator<C2901m> it4 = this.f9575e.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            C2901m next3 = it4.next();
            if ((z2 || next3.f9616b != this.f9571a) && (!next3.f9622h.f9589j || ((!next3.f9623i.f9589j && !(next3 instanceof C2894h)) || (!next3.f9619e.f9589j && !(next3 instanceof C2888c) && !(next3 instanceof C2894h))))) {
                z3 = false;
            }
        }
        z3 = false;
        this.f9571a.mo9708l0(s);
        this.f9571a.mo9658A0(s2);
        return z3;
    }

    /* renamed from: g */
    public boolean mo10041g(boolean z) {
        if (this.f9572b) {
            Iterator<C2830e> it = this.f9571a.f9361w0.iterator();
            while (it.hasNext()) {
                C2830e next = it.next();
                next.f9218a = false;
                C2896j jVar = next.f9226e;
                jVar.f9619e.f9589j = false;
                jVar.f9621g = false;
                jVar.mo10051r();
                C2899l lVar = next.f9228f;
                lVar.f9619e.f9589j = false;
                lVar.f9621g = false;
                lVar.mo10055q();
            }
            C2833f fVar = this.f9571a;
            fVar.f9218a = false;
            C2896j jVar2 = fVar.f9226e;
            jVar2.f9619e.f9589j = false;
            jVar2.f9621g = false;
            jVar2.mo10051r();
            C2899l lVar2 = this.f9571a.f9228f;
            lVar2.f9619e.f9589j = false;
            lVar2.f9621g = false;
            lVar2.mo10055q();
            mo10038c();
        }
        if (m13139b(this.f9574d)) {
            return false;
        }
        this.f9571a.mo9668F0(0);
        this.f9571a.mo9670G0(0);
        this.f9571a.f9226e.f9622h.mo10049d(0);
        this.f9571a.f9228f.f9622h.mo10049d(0);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x013e A[EDGE_INSN: B:78:0x013e->B:64:0x013e ?: BREAK  , SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo10042h(boolean r10, int r11) {
        /*
            r9 = this;
            r0 = 1
            r10 = r10 & r0
            o.f r1 = r9.f9571a
            r2 = 0
            o.e$b r1 = r1.mo9721s(r2)
            o.f r3 = r9.f9571a
            o.e$b r3 = r3.mo9721s(r0)
            o.f r4 = r9.f9571a
            int r4 = r4.mo9683Q()
            o.f r5 = r9.f9571a
            int r5 = r5.mo9684R()
            if (r10 == 0) goto L_0x0086
            o.e$b r6 = p094o.C2830e.C2832b.WRAP_CONTENT
            if (r1 == r6) goto L_0x0023
            if (r3 != r6) goto L_0x0086
        L_0x0023:
            java.util.ArrayList<p.m> r6 = r9.f9575e
            java.util.Iterator r6 = r6.iterator()
        L_0x0029:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0040
            java.lang.Object r7 = r6.next()
            p.m r7 = (p100p.C2901m) r7
            int r8 = r7.f9620f
            if (r8 != r11) goto L_0x0029
            boolean r7 = r7.mo10036m()
            if (r7 != 0) goto L_0x0029
            r10 = 0
        L_0x0040:
            if (r11 != 0) goto L_0x0063
            if (r10 == 0) goto L_0x0086
            o.e$b r10 = p094o.C2830e.C2832b.WRAP_CONTENT
            if (r1 != r10) goto L_0x0086
            o.f r10 = r9.f9571a
            o.e$b r6 = p094o.C2830e.C2832b.FIXED
            r10.mo9708l0(r6)
            o.f r10 = r9.f9571a
            int r6 = r9.m13140e(r10, r2)
            r10.mo9666E0(r6)
            o.f r10 = r9.f9571a
            p.j r6 = r10.f9226e
            p.g r6 = r6.f9619e
            int r10 = r10.mo9682P()
            goto L_0x0083
        L_0x0063:
            if (r10 == 0) goto L_0x0086
            o.e$b r10 = p094o.C2830e.C2832b.WRAP_CONTENT
            if (r3 != r10) goto L_0x0086
            o.f r10 = r9.f9571a
            o.e$b r6 = p094o.C2830e.C2832b.FIXED
            r10.mo9658A0(r6)
            o.f r10 = r9.f9571a
            int r6 = r9.m13140e(r10, r0)
            r10.mo9700h0(r6)
            o.f r10 = r9.f9571a
            p.l r6 = r10.f9228f
            p.g r6 = r6.f9619e
            int r10 = r10.mo9727v()
        L_0x0083:
            r6.mo10049d(r10)
        L_0x0086:
            o.f r10 = r9.f9571a
            if (r11 != 0) goto L_0x00b1
            o.e$b[] r5 = r10.f9204M
            r6 = r5[r2]
            o.e$b r7 = p094o.C2830e.C2832b.FIXED
            if (r6 == r7) goto L_0x0098
            r5 = r5[r2]
            o.e$b r6 = p094o.C2830e.C2832b.MATCH_PARENT
            if (r5 != r6) goto L_0x00c0
        L_0x0098:
            int r10 = r10.mo9682P()
            int r10 = r10 + r4
            o.f r5 = r9.f9571a
            p.j r5 = r5.f9226e
            p.f r5 = r5.f9623i
            r5.mo10049d(r10)
            o.f r5 = r9.f9571a
            p.j r5 = r5.f9226e
            p.g r5 = r5.f9619e
            int r10 = r10 - r4
            r5.mo10049d(r10)
            goto L_0x00da
        L_0x00b1:
            o.e$b[] r4 = r10.f9204M
            r6 = r4[r0]
            o.e$b r7 = p094o.C2830e.C2832b.FIXED
            if (r6 == r7) goto L_0x00c2
            r4 = r4[r0]
            o.e$b r6 = p094o.C2830e.C2832b.MATCH_PARENT
            if (r4 != r6) goto L_0x00c0
            goto L_0x00c2
        L_0x00c0:
            r10 = 0
            goto L_0x00db
        L_0x00c2:
            int r10 = r10.mo9727v()
            int r10 = r10 + r5
            o.f r4 = r9.f9571a
            p.l r4 = r4.f9228f
            p.f r4 = r4.f9623i
            r4.mo10049d(r10)
            o.f r4 = r9.f9571a
            p.l r4 = r4.f9228f
            p.g r4 = r4.f9619e
            int r10 = r10 - r5
            r4.mo10049d(r10)
        L_0x00da:
            r10 = 1
        L_0x00db:
            r9.mo10045m()
            java.util.ArrayList<p.m> r4 = r9.f9575e
            java.util.Iterator r4 = r4.iterator()
        L_0x00e4:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0104
            java.lang.Object r5 = r4.next()
            p.m r5 = (p100p.C2901m) r5
            int r6 = r5.f9620f
            if (r6 == r11) goto L_0x00f5
            goto L_0x00e4
        L_0x00f5:
            o.e r6 = r5.f9616b
            o.f r7 = r9.f9571a
            if (r6 != r7) goto L_0x0100
            boolean r6 = r5.f9621g
            if (r6 != 0) goto L_0x0100
            goto L_0x00e4
        L_0x0100:
            r5.mo10033e()
            goto L_0x00e4
        L_0x0104:
            java.util.ArrayList<p.m> r4 = r9.f9575e
            java.util.Iterator r4 = r4.iterator()
        L_0x010a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x013e
            java.lang.Object r5 = r4.next()
            p.m r5 = (p100p.C2901m) r5
            int r6 = r5.f9620f
            if (r6 == r11) goto L_0x011b
            goto L_0x010a
        L_0x011b:
            if (r10 != 0) goto L_0x0124
            o.e r6 = r5.f9616b
            o.f r7 = r9.f9571a
            if (r6 != r7) goto L_0x0124
            goto L_0x010a
        L_0x0124:
            p.f r6 = r5.f9622h
            boolean r6 = r6.f9589j
            if (r6 != 0) goto L_0x012c
        L_0x012a:
            r0 = 0
            goto L_0x013e
        L_0x012c:
            p.f r6 = r5.f9623i
            boolean r6 = r6.f9589j
            if (r6 != 0) goto L_0x0133
            goto L_0x012a
        L_0x0133:
            boolean r6 = r5 instanceof p100p.C2888c
            if (r6 != 0) goto L_0x010a
            p.g r5 = r5.f9619e
            boolean r5 = r5.f9589j
            if (r5 != 0) goto L_0x010a
            goto L_0x012a
        L_0x013e:
            o.f r10 = r9.f9571a
            r10.mo9708l0(r1)
            o.f r10 = r9.f9571a
            r10.mo9658A0(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p100p.C2890e.mo10042h(boolean, int):boolean");
    }

    /* renamed from: j */
    public void mo10043j() {
        this.f9572b = true;
    }

    /* renamed from: k */
    public void mo10044k() {
        this.f9573c = true;
    }

    /* renamed from: m */
    public void mo10045m() {
        C2893g gVar;
        C2893g gVar2;
        int P;
        C2893g gVar3;
        int P2;
        Iterator<C2830e> it = this.f9571a.f9361w0.iterator();
        while (it.hasNext()) {
            C2830e next = it.next();
            if (!next.f9218a) {
                C2830e.C2832b[] bVarArr = next.f9204M;
                boolean z = false;
                C2830e.C2832b bVar = bVarArr[0];
                C2830e.C2832b bVar2 = bVarArr[1];
                int i = next.f9240l;
                int i2 = next.f9242m;
                C2830e.C2832b bVar3 = C2830e.C2832b.WRAP_CONTENT;
                boolean z2 = bVar == bVar3 || (bVar == C2830e.C2832b.MATCH_CONSTRAINT && i == 1);
                if (bVar2 == bVar3 || (bVar2 == C2830e.C2832b.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                C2893g gVar4 = next.f9226e.f9619e;
                boolean z3 = gVar4.f9589j;
                C2893g gVar5 = next.f9228f.f9619e;
                boolean z4 = gVar5.f9589j;
                if (!z3 || !z4) {
                    if (!z3 || !z) {
                        if (z4 && z2) {
                            m13142l(next, bVar3, gVar4.f9586g, C2830e.C2832b.FIXED, gVar5.f9586g);
                            if (bVar == C2830e.C2832b.MATCH_CONSTRAINT) {
                                gVar3 = next.f9226e.f9619e;
                                P2 = next.mo9682P();
                            } else {
                                gVar2 = next.f9226e.f9619e;
                                P = next.mo9682P();
                                gVar2.mo10049d(P);
                            }
                        }
                        if (next.f9218a && (gVar = next.f9228f.f9613l) != null) {
                            gVar.mo10049d(next.mo9711n());
                        }
                    } else {
                        m13142l(next, C2830e.C2832b.FIXED, gVar4.f9586g, bVar3, gVar5.f9586g);
                        if (bVar2 == C2830e.C2832b.MATCH_CONSTRAINT) {
                            gVar3 = next.f9228f.f9619e;
                            P2 = next.mo9727v();
                        } else {
                            gVar2 = next.f9228f.f9619e;
                            P = next.mo9727v();
                            gVar2.mo10049d(P);
                        }
                    }
                    gVar3.f9601m = P2;
                    gVar.mo10049d(next.mo9711n());
                } else {
                    C2830e.C2832b bVar4 = C2830e.C2832b.FIXED;
                    m13142l(next, bVar4, gVar4.f9586g, bVar4, gVar5.f9586g);
                }
                next.f9218a = true;
                gVar.mo10049d(next.mo9711n());
            }
        }
    }

    /* renamed from: n */
    public void mo10046n(C2885b.C2887b bVar) {
        this.f9577g = bVar;
    }
}
