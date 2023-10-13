package p100p;

import java.util.List;
import p094o.C2827d;
import p094o.C2830e;
import p094o.C2838i;
import p100p.C2891f;
import p100p.C2901m;

/* renamed from: p.j */
public class C2896j extends C2901m {

    /* renamed from: k */
    private static int[] f9602k = new int[2];

    /* renamed from: p.j$a */
    static /* synthetic */ class C2897a {

        /* renamed from: a */
        static final /* synthetic */ int[] f9603a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                p.m$b[] r0 = p100p.C2901m.C2903b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9603a = r0
                p.m$b r1 = p100p.C2901m.C2903b.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9603a     // Catch:{ NoSuchFieldError -> 0x001d }
                p.m$b r1 = p100p.C2901m.C2903b.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9603a     // Catch:{ NoSuchFieldError -> 0x0028 }
                p.m$b r1 = p100p.C2901m.C2903b.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p100p.C2896j.C2897a.<clinit>():void");
        }
    }

    public C2896j(C2830e eVar) {
        super(eVar);
        this.f9622h.f9584e = C2891f.C2892a.LEFT;
        this.f9623i.f9584e = C2891f.C2892a.RIGHT;
        this.f9620f = 0;
    }

    /* renamed from: q */
    private void m13169q(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 == -1) {
            int i8 = (int) ((((float) i7) * f) + 0.5f);
            int i9 = (int) ((((float) i6) / f) + 0.5f);
            if (i8 <= i6) {
                iArr[0] = i8;
                iArr[1] = i7;
            } else if (i9 <= i7) {
                iArr[0] = i6;
                iArr[1] = i9;
            }
        } else if (i5 == 0) {
            iArr[0] = (int) ((((float) i7) * f) + 0.5f);
            iArr[1] = i7;
        } else if (i5 == 1) {
            iArr[0] = i6;
            iArr[1] = (int) ((((float) i6) * f) + 0.5f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0295, code lost:
        if (r14 != 1) goto L_0x02ed;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10031a(p100p.C2889d r17) {
        /*
            r16 = this;
            r8 = r16
            int[] r0 = p100p.C2896j.C2897a.f9603a
            p.m$b r1 = r8.f9624j
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 3
            r9 = 1
            r10 = 0
            if (r0 == r9) goto L_0x0029
            if (r0 == r1) goto L_0x0023
            if (r0 == r2) goto L_0x0017
            goto L_0x002e
        L_0x0017:
            o.e r0 = r8.f9616b
            o.d r1 = r0.f9193B
            o.d r0 = r0.f9195D
            r3 = r17
            r8.mo10063n(r3, r1, r0, r10)
            return
        L_0x0023:
            r3 = r17
            r16.mo10064o(r17)
            goto L_0x002e
        L_0x0029:
            r3 = r17
            r16.mo10065p(r17)
        L_0x002e:
            p.g r0 = r8.f9619e
            boolean r0 = r0.f9589j
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r0 != 0) goto L_0x02ed
            o.e$b r0 = r8.f9618d
            o.e$b r3 = p094o.C2830e.C2832b.MATCH_CONSTRAINT
            if (r0 != r3) goto L_0x02ed
            o.e r0 = r8.f9616b
            int r3 = r0.f9240l
            if (r3 == r1) goto L_0x02cf
            if (r3 == r2) goto L_0x0046
            goto L_0x02ed
        L_0x0046:
            int r1 = r0.f9242m
            r3 = -1
            if (r1 == 0) goto L_0x007d
            if (r1 != r2) goto L_0x004e
            goto L_0x007d
        L_0x004e:
            int r0 = r0.mo9725u()
            if (r0 == r3) goto L_0x006a
            if (r0 == 0) goto L_0x005b
            if (r0 == r9) goto L_0x006a
            r0 = 0
            goto L_0x02e8
        L_0x005b:
            o.e r0 = r8.f9616b
            p.l r1 = r0.f9228f
            p.g r1 = r1.f9619e
            int r1 = r1.f9586g
            float r1 = (float) r1
            float r0 = r0.mo9723t()
            float r1 = r1 / r0
            goto L_0x0079
        L_0x006a:
            o.e r0 = r8.f9616b
            p.l r1 = r0.f9228f
            p.g r1 = r1.f9619e
            int r1 = r1.f9586g
            float r1 = (float) r1
            float r0 = r0.mo9723t()
            float r1 = r1 * r0
        L_0x0079:
            float r1 = r1 + r11
            int r0 = (int) r1
            goto L_0x02e8
        L_0x007d:
            p.l r1 = r0.f9228f
            p.f r12 = r1.f9622h
            p.f r13 = r1.f9623i
            o.d r1 = r0.f9193B
            o.d r1 = r1.f9176d
            if (r1 == 0) goto L_0x008b
            r1 = 1
            goto L_0x008c
        L_0x008b:
            r1 = 0
        L_0x008c:
            o.d r2 = r0.f9194C
            o.d r2 = r2.f9176d
            if (r2 == 0) goto L_0x0094
            r2 = 1
            goto L_0x0095
        L_0x0094:
            r2 = 0
        L_0x0095:
            o.d r4 = r0.f9195D
            o.d r4 = r4.f9176d
            if (r4 == 0) goto L_0x009d
            r4 = 1
            goto L_0x009e
        L_0x009d:
            r4 = 0
        L_0x009e:
            o.d r5 = r0.f9196E
            o.d r5 = r5.f9176d
            if (r5 == 0) goto L_0x00a6
            r5 = 1
            goto L_0x00a7
        L_0x00a6:
            r5 = 0
        L_0x00a7:
            int r14 = r0.mo9725u()
            if (r1 == 0) goto L_0x01eb
            if (r2 == 0) goto L_0x01eb
            if (r4 == 0) goto L_0x01eb
            if (r5 == 0) goto L_0x01eb
            o.e r0 = r8.f9616b
            float r15 = r0.mo9723t()
            boolean r0 = r12.f9589j
            if (r0 == 0) goto L_0x011c
            boolean r0 = r13.f9589j
            if (r0 == 0) goto L_0x011c
            p.f r0 = r8.f9622h
            boolean r1 = r0.f9582c
            if (r1 == 0) goto L_0x011b
            p.f r1 = r8.f9623i
            boolean r1 = r1.f9582c
            if (r1 != 0) goto L_0x00ce
            goto L_0x011b
        L_0x00ce:
            java.util.List<p.f> r0 = r0.f9591l
            java.lang.Object r0 = r0.get(r10)
            p.f r0 = (p100p.C2891f) r0
            int r0 = r0.f9586g
            p.f r1 = r8.f9622h
            int r1 = r1.f9585f
            int r2 = r0 + r1
            p.f r0 = r8.f9623i
            java.util.List<p.f> r0 = r0.f9591l
            java.lang.Object r0 = r0.get(r10)
            p.f r0 = (p100p.C2891f) r0
            int r0 = r0.f9586g
            p.f r1 = r8.f9623i
            int r1 = r1.f9585f
            int r3 = r0 - r1
            int r0 = r12.f9586g
            int r1 = r12.f9585f
            int r4 = r0 + r1
            int r0 = r13.f9586g
            int r1 = r13.f9585f
            int r5 = r0 - r1
            int[] r1 = f9602k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.m13169q(r1, r2, r3, r4, r5, r6, r7)
            p.g r0 = r8.f9619e
            int[] r1 = f9602k
            r1 = r1[r10]
            r0.mo10049d(r1)
            o.e r0 = r8.f9616b
            p.l r0 = r0.f9228f
            p.g r0 = r0.f9619e
            int[] r1 = f9602k
            r1 = r1[r9]
            r0.mo10049d(r1)
        L_0x011b:
            return
        L_0x011c:
            p.f r0 = r8.f9622h
            boolean r1 = r0.f9589j
            if (r1 == 0) goto L_0x0179
            p.f r1 = r8.f9623i
            boolean r2 = r1.f9589j
            if (r2 == 0) goto L_0x0179
            boolean r2 = r12.f9582c
            if (r2 == 0) goto L_0x0178
            boolean r2 = r13.f9582c
            if (r2 != 0) goto L_0x0131
            goto L_0x0178
        L_0x0131:
            int r2 = r0.f9586g
            int r0 = r0.f9585f
            int r2 = r2 + r0
            int r0 = r1.f9586g
            int r1 = r1.f9585f
            int r3 = r0 - r1
            java.util.List<p.f> r0 = r12.f9591l
            java.lang.Object r0 = r0.get(r10)
            p.f r0 = (p100p.C2891f) r0
            int r0 = r0.f9586g
            int r1 = r12.f9585f
            int r4 = r0 + r1
            java.util.List<p.f> r0 = r13.f9591l
            java.lang.Object r0 = r0.get(r10)
            p.f r0 = (p100p.C2891f) r0
            int r0 = r0.f9586g
            int r1 = r13.f9585f
            int r5 = r0 - r1
            int[] r1 = f9602k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.m13169q(r1, r2, r3, r4, r5, r6, r7)
            p.g r0 = r8.f9619e
            int[] r1 = f9602k
            r1 = r1[r10]
            r0.mo10049d(r1)
            o.e r0 = r8.f9616b
            p.l r0 = r0.f9228f
            p.g r0 = r0.f9619e
            int[] r1 = f9602k
            r1 = r1[r9]
            r0.mo10049d(r1)
            goto L_0x0179
        L_0x0178:
            return
        L_0x0179:
            p.f r0 = r8.f9622h
            boolean r1 = r0.f9582c
            if (r1 == 0) goto L_0x01ea
            p.f r1 = r8.f9623i
            boolean r1 = r1.f9582c
            if (r1 == 0) goto L_0x01ea
            boolean r1 = r12.f9582c
            if (r1 == 0) goto L_0x01ea
            boolean r1 = r13.f9582c
            if (r1 != 0) goto L_0x018e
            goto L_0x01ea
        L_0x018e:
            java.util.List<p.f> r0 = r0.f9591l
            java.lang.Object r0 = r0.get(r10)
            p.f r0 = (p100p.C2891f) r0
            int r0 = r0.f9586g
            p.f r1 = r8.f9622h
            int r1 = r1.f9585f
            int r2 = r0 + r1
            p.f r0 = r8.f9623i
            java.util.List<p.f> r0 = r0.f9591l
            java.lang.Object r0 = r0.get(r10)
            p.f r0 = (p100p.C2891f) r0
            int r0 = r0.f9586g
            p.f r1 = r8.f9623i
            int r1 = r1.f9585f
            int r3 = r0 - r1
            java.util.List<p.f> r0 = r12.f9591l
            java.lang.Object r0 = r0.get(r10)
            p.f r0 = (p100p.C2891f) r0
            int r0 = r0.f9586g
            int r1 = r12.f9585f
            int r4 = r0 + r1
            java.util.List<p.f> r0 = r13.f9591l
            java.lang.Object r0 = r0.get(r10)
            p.f r0 = (p100p.C2891f) r0
            int r0 = r0.f9586g
            int r1 = r13.f9585f
            int r5 = r0 - r1
            int[] r1 = f9602k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.m13169q(r1, r2, r3, r4, r5, r6, r7)
            p.g r0 = r8.f9619e
            int[] r1 = f9602k
            r1 = r1[r10]
            r0.mo10049d(r1)
            o.e r0 = r8.f9616b
            p.l r0 = r0.f9228f
            p.g r0 = r0.f9619e
            int[] r1 = f9602k
            r1 = r1[r9]
            goto L_0x02ca
        L_0x01ea:
            return
        L_0x01eb:
            if (r1 == 0) goto L_0x0264
            if (r4 == 0) goto L_0x0264
            p.f r0 = r8.f9622h
            boolean r0 = r0.f9582c
            if (r0 == 0) goto L_0x0263
            p.f r0 = r8.f9623i
            boolean r0 = r0.f9582c
            if (r0 != 0) goto L_0x01fc
            goto L_0x0263
        L_0x01fc:
            o.e r0 = r8.f9616b
            float r0 = r0.mo9723t()
            p.f r1 = r8.f9622h
            java.util.List<p.f> r1 = r1.f9591l
            java.lang.Object r1 = r1.get(r10)
            p.f r1 = (p100p.C2891f) r1
            int r1 = r1.f9586g
            p.f r2 = r8.f9622h
            int r2 = r2.f9585f
            int r1 = r1 + r2
            p.f r2 = r8.f9623i
            java.util.List<p.f> r2 = r2.f9591l
            java.lang.Object r2 = r2.get(r10)
            p.f r2 = (p100p.C2891f) r2
            int r2 = r2.f9586g
            p.f r4 = r8.f9623i
            int r4 = r4.f9585f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x023f
            if (r14 == 0) goto L_0x023f
            if (r14 == r9) goto L_0x022c
            goto L_0x02ed
        L_0x022c:
            int r2 = r2 - r1
            int r1 = r8.mo10059g(r2, r10)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo10059g(r2, r9)
            if (r2 == r3) goto L_0x0253
            float r1 = (float) r3
            float r1 = r1 * r0
            goto L_0x0251
        L_0x023f:
            int r2 = r2 - r1
            int r1 = r8.mo10059g(r2, r10)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo10059g(r2, r9)
            if (r2 == r3) goto L_0x0253
            float r1 = (float) r3
            float r1 = r1 / r0
        L_0x0251:
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x0253:
            p.g r0 = r8.f9619e
            r0.mo10049d(r1)
            o.e r0 = r8.f9616b
            p.l r0 = r0.f9228f
            p.g r0 = r0.f9619e
            r0.mo10049d(r3)
            goto L_0x02ed
        L_0x0263:
            return
        L_0x0264:
            if (r2 == 0) goto L_0x02ed
            if (r5 == 0) goto L_0x02ed
            boolean r0 = r12.f9582c
            if (r0 == 0) goto L_0x02ce
            boolean r0 = r13.f9582c
            if (r0 != 0) goto L_0x0271
            goto L_0x02ce
        L_0x0271:
            o.e r0 = r8.f9616b
            float r0 = r0.mo9723t()
            java.util.List<p.f> r1 = r12.f9591l
            java.lang.Object r1 = r1.get(r10)
            p.f r1 = (p100p.C2891f) r1
            int r1 = r1.f9586g
            int r2 = r12.f9585f
            int r1 = r1 + r2
            java.util.List<p.f> r2 = r13.f9591l
            java.lang.Object r2 = r2.get(r10)
            p.f r2 = (p100p.C2891f) r2
            int r2 = r2.f9586g
            int r4 = r13.f9585f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x02ab
            if (r14 == 0) goto L_0x0298
            if (r14 == r9) goto L_0x02ab
            goto L_0x02ed
        L_0x0298:
            int r2 = r2 - r1
            int r1 = r8.mo10059g(r2, r9)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo10059g(r2, r10)
            if (r2 == r3) goto L_0x02bf
            float r1 = (float) r3
            float r1 = r1 / r0
            goto L_0x02bd
        L_0x02ab:
            int r2 = r2 - r1
            int r1 = r8.mo10059g(r2, r9)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo10059g(r2, r10)
            if (r2 == r3) goto L_0x02bf
            float r1 = (float) r3
            float r1 = r1 * r0
        L_0x02bd:
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x02bf:
            p.g r0 = r8.f9619e
            r0.mo10049d(r3)
            o.e r0 = r8.f9616b
            p.l r0 = r0.f9228f
            p.g r0 = r0.f9619e
        L_0x02ca:
            r0.mo10049d(r1)
            goto L_0x02ed
        L_0x02ce:
            return
        L_0x02cf:
            o.e r0 = r0.mo9669G()
            if (r0 == 0) goto L_0x02ed
            p.j r0 = r0.f9226e
            p.g r0 = r0.f9619e
            boolean r1 = r0.f9589j
            if (r1 == 0) goto L_0x02ed
            o.e r1 = r8.f9616b
            float r1 = r1.f9250q
            int r0 = r0.f9586g
            float r0 = (float) r0
            float r0 = r0 * r1
            float r0 = r0 + r11
            int r0 = (int) r0
        L_0x02e8:
            p.g r1 = r8.f9619e
            r1.mo10049d(r0)
        L_0x02ed:
            p.f r0 = r8.f9622h
            boolean r1 = r0.f9582c
            if (r1 == 0) goto L_0x040f
            p.f r1 = r8.f9623i
            boolean r2 = r1.f9582c
            if (r2 != 0) goto L_0x02fb
            goto L_0x040f
        L_0x02fb:
            boolean r0 = r0.f9589j
            if (r0 == 0) goto L_0x030a
            boolean r0 = r1.f9589j
            if (r0 == 0) goto L_0x030a
            p.g r0 = r8.f9619e
            boolean r0 = r0.f9589j
            if (r0 == 0) goto L_0x030a
            return
        L_0x030a:
            p.g r0 = r8.f9619e
            boolean r0 = r0.f9589j
            if (r0 != 0) goto L_0x0354
            o.e$b r0 = r8.f9618d
            o.e$b r1 = p094o.C2830e.C2832b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x0354
            o.e r0 = r8.f9616b
            int r1 = r0.f9240l
            if (r1 != 0) goto L_0x0354
            boolean r0 = r0.mo9687V()
            if (r0 != 0) goto L_0x0354
            p.f r0 = r8.f9622h
            java.util.List<p.f> r0 = r0.f9591l
            java.lang.Object r0 = r0.get(r10)
            p.f r0 = (p100p.C2891f) r0
            p.f r1 = r8.f9623i
            java.util.List<p.f> r1 = r1.f9591l
            java.lang.Object r1 = r1.get(r10)
            p.f r1 = (p100p.C2891f) r1
            int r0 = r0.f9586g
            p.f r2 = r8.f9622h
            int r3 = r2.f9585f
            int r0 = r0 + r3
            int r1 = r1.f9586g
            p.f r3 = r8.f9623i
            int r3 = r3.f9585f
            int r1 = r1 + r3
            int r3 = r1 - r0
            r2.mo10049d(r0)
            p.f r0 = r8.f9623i
            r0.mo10049d(r1)
            p.g r0 = r8.f9619e
            r0.mo10049d(r3)
            return
        L_0x0354:
            p.g r0 = r8.f9619e
            boolean r0 = r0.f9589j
            if (r0 != 0) goto L_0x03b8
            o.e$b r0 = r8.f9618d
            o.e$b r1 = p094o.C2830e.C2832b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x03b8
            int r0 = r8.f9615a
            if (r0 != r9) goto L_0x03b8
            p.f r0 = r8.f9622h
            java.util.List<p.f> r0 = r0.f9591l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03b8
            p.f r0 = r8.f9623i
            java.util.List<p.f> r0 = r0.f9591l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03b8
            p.f r0 = r8.f9622h
            java.util.List<p.f> r0 = r0.f9591l
            java.lang.Object r0 = r0.get(r10)
            p.f r0 = (p100p.C2891f) r0
            p.f r1 = r8.f9623i
            java.util.List<p.f> r1 = r1.f9591l
            java.lang.Object r1 = r1.get(r10)
            p.f r1 = (p100p.C2891f) r1
            int r0 = r0.f9586g
            p.f r2 = r8.f9622h
            int r2 = r2.f9585f
            int r0 = r0 + r2
            int r1 = r1.f9586g
            p.f r2 = r8.f9623i
            int r2 = r2.f9585f
            int r1 = r1 + r2
            int r1 = r1 - r0
            p.g r0 = r8.f9619e
            int r0 = r0.f9601m
            int r0 = java.lang.Math.min(r1, r0)
            o.e r1 = r8.f9616b
            int r2 = r1.f9248p
            int r1 = r1.f9246o
            int r0 = java.lang.Math.max(r1, r0)
            if (r2 <= 0) goto L_0x03b3
            int r0 = java.lang.Math.min(r2, r0)
        L_0x03b3:
            p.g r1 = r8.f9619e
            r1.mo10049d(r0)
        L_0x03b8:
            p.g r0 = r8.f9619e
            boolean r0 = r0.f9589j
            if (r0 != 0) goto L_0x03bf
            return
        L_0x03bf:
            p.f r0 = r8.f9622h
            java.util.List<p.f> r0 = r0.f9591l
            java.lang.Object r0 = r0.get(r10)
            p.f r0 = (p100p.C2891f) r0
            p.f r1 = r8.f9623i
            java.util.List<p.f> r1 = r1.f9591l
            java.lang.Object r1 = r1.get(r10)
            p.f r1 = (p100p.C2891f) r1
            int r2 = r0.f9586g
            p.f r3 = r8.f9622h
            int r3 = r3.f9585f
            int r2 = r2 + r3
            int r3 = r1.f9586g
            p.f r4 = r8.f9623i
            int r4 = r4.f9585f
            int r3 = r3 + r4
            o.e r4 = r8.f9616b
            float r4 = r4.mo9729w()
            if (r0 != r1) goto L_0x03ef
            int r2 = r0.f9586g
            int r3 = r1.f9586g
            r4 = 1056964608(0x3f000000, float:0.5)
        L_0x03ef:
            int r3 = r3 - r2
            p.g r0 = r8.f9619e
            int r0 = r0.f9586g
            int r3 = r3 - r0
            p.f r0 = r8.f9622h
            float r1 = (float) r2
            float r1 = r1 + r11
            float r2 = (float) r3
            float r2 = r2 * r4
            float r1 = r1 + r2
            int r1 = (int) r1
            r0.mo10049d(r1)
            p.f r0 = r8.f9623i
            p.f r1 = r8.f9622h
            int r1 = r1.f9586g
            p.g r2 = r8.f9619e
            int r2 = r2.f9586g
            int r1 = r1 + r2
            r0.mo10049d(r1)
        L_0x040f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p100p.C2896j.mo10031a(p.d):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo10032d() {
        C2827d dVar;
        C2891f fVar;
        int i;
        C2891f fVar2;
        C2891f fVar3;
        Object obj;
        List list;
        C2891f fVar4;
        int i2;
        C2891f fVar5;
        C2891f fVar6;
        int i3;
        C2891f fVar7;
        C2891f fVar8;
        C2830e G;
        C2830e G2;
        C2830e eVar = this.f9616b;
        if (eVar.f9218a) {
            this.f9619e.mo10049d(eVar.mo9682P());
        }
        if (!this.f9619e.f9589j) {
            C2830e.C2832b y = this.f9616b.mo9733y();
            this.f9618d = y;
            if (y != C2830e.C2832b.MATCH_CONSTRAINT) {
                C2830e.C2832b bVar = C2830e.C2832b.MATCH_PARENT;
                if (y == bVar && (((G2 = this.f9616b.mo9669G()) != null && G2.mo9733y() == C2830e.C2832b.FIXED) || G2.mo9733y() == bVar)) {
                    int P = (G2.mo9682P() - this.f9616b.f9193B.mo9644c()) - this.f9616b.f9195D.mo9644c();
                    mo10057b(this.f9622h, G2.f9226e.f9622h, this.f9616b.f9193B.mo9644c());
                    mo10057b(this.f9623i, G2.f9226e.f9623i, -this.f9616b.f9195D.mo9644c());
                    this.f9619e.mo10049d(P);
                    return;
                } else if (this.f9618d == C2830e.C2832b.FIXED) {
                    this.f9619e.mo10049d(this.f9616b.mo9682P());
                }
            }
        } else {
            C2830e.C2832b bVar2 = this.f9618d;
            C2830e.C2832b bVar3 = C2830e.C2832b.MATCH_PARENT;
            if (bVar2 == bVar3 && (((G = this.f9616b.mo9669G()) != null && G.mo9733y() == C2830e.C2832b.FIXED) || G.mo9733y() == bVar3)) {
                mo10057b(this.f9622h, G.f9226e.f9622h, this.f9616b.f9193B.mo9644c());
                mo10057b(this.f9623i, G.f9226e.f9623i, -this.f9616b.f9195D.mo9644c());
                return;
            }
        }
        C2893g gVar = this.f9619e;
        if (gVar.f9589j) {
            C2830e eVar2 = this.f9616b;
            if (eVar2.f9218a) {
                C2827d[] dVarArr = eVar2.f9201J;
                if (dVarArr[0].f9176d == null || dVarArr[1].f9176d == null) {
                    if (dVarArr[0].f9176d != null) {
                        fVar8 = mo10060h(dVarArr[0]);
                        if (fVar8 != null) {
                            fVar7 = this.f9622h;
                            i3 = this.f9616b.f9201J[0].mo9644c();
                        } else {
                            return;
                        }
                    } else if (dVarArr[1].f9176d != null) {
                        C2891f h = mo10060h(dVarArr[1]);
                        if (h != null) {
                            mo10057b(this.f9623i, h, -this.f9616b.f9201J[1].mo9644c());
                            fVar6 = this.f9622h;
                            fVar5 = this.f9623i;
                            i2 = -this.f9619e.f9586g;
                            mo10057b(fVar6, fVar5, i2);
                            return;
                        }
                        return;
                    } else if (!(eVar2 instanceof C2838i) && eVar2.mo9669G() != null && this.f9616b.mo9709m(C2827d.C2829b.CENTER).f9176d == null) {
                        fVar8 = this.f9616b.mo9669G().f9226e.f9622h;
                        fVar7 = this.f9622h;
                        i3 = this.f9616b.mo9683Q();
                    } else {
                        return;
                    }
                    mo10057b(fVar7, fVar8, i3);
                    fVar6 = this.f9623i;
                    fVar5 = this.f9622h;
                    i2 = this.f9619e.f9586g;
                    mo10057b(fVar6, fVar5, i2);
                    return;
                } else if (eVar2.mo9687V()) {
                    this.f9622h.f9585f = this.f9616b.f9201J[0].mo9644c();
                    fVar = this.f9623i;
                    dVar = this.f9616b.f9201J[1];
                    fVar.f9585f = -dVar.mo9644c();
                } else {
                    C2891f h2 = mo10060h(this.f9616b.f9201J[0]);
                    if (h2 != null) {
                        mo10057b(this.f9622h, h2, this.f9616b.f9201J[0].mo9644c());
                    }
                    C2891f h3 = mo10060h(this.f9616b.f9201J[1]);
                    if (h3 != null) {
                        mo10057b(this.f9623i, h3, -this.f9616b.f9201J[1].mo9644c());
                    }
                    this.f9622h.f9581b = true;
                    this.f9623i.f9581b = true;
                    return;
                }
            }
        }
        if (this.f9618d == C2830e.C2832b.MATCH_CONSTRAINT) {
            C2830e eVar3 = this.f9616b;
            int i4 = eVar3.f9240l;
            if (i4 == 2) {
                C2830e G3 = eVar3.mo9669G();
                if (G3 != null) {
                    C2893g gVar2 = G3.f9228f.f9619e;
                    this.f9619e.f9591l.add(gVar2);
                    gVar2.f9590k.add(this.f9619e);
                    C2893g gVar3 = this.f9619e;
                    gVar3.f9581b = true;
                    gVar3.f9590k.add(this.f9622h);
                    list = this.f9619e.f9590k;
                    obj = this.f9623i;
                }
            } else if (i4 == 3) {
                if (eVar3.f9242m == 3) {
                    this.f9622h.f9580a = this;
                    this.f9623i.f9580a = this;
                    C2899l lVar = eVar3.f9228f;
                    lVar.f9622h.f9580a = this;
                    lVar.f9623i.f9580a = this;
                    gVar.f9580a = this;
                    if (eVar3.mo9689X()) {
                        this.f9619e.f9591l.add(this.f9616b.f9228f.f9619e);
                        this.f9616b.f9228f.f9619e.f9590k.add(this.f9619e);
                        C2899l lVar2 = this.f9616b.f9228f;
                        lVar2.f9619e.f9580a = this;
                        this.f9619e.f9591l.add(lVar2.f9622h);
                        this.f9619e.f9591l.add(this.f9616b.f9228f.f9623i);
                        this.f9616b.f9228f.f9622h.f9590k.add(this.f9619e);
                        list = this.f9616b.f9228f.f9623i.f9590k;
                        obj = this.f9619e;
                    } else if (this.f9616b.mo9687V()) {
                        this.f9616b.f9228f.f9619e.f9591l.add(this.f9619e);
                        list = this.f9619e.f9590k;
                        obj = this.f9616b.f9228f.f9619e;
                    } else {
                        fVar4 = this.f9616b.f9228f.f9619e;
                    }
                } else {
                    C2893g gVar4 = eVar3.f9228f.f9619e;
                    gVar.f9591l.add(gVar4);
                    gVar4.f9590k.add(this.f9619e);
                    this.f9616b.f9228f.f9622h.f9590k.add(this.f9619e);
                    this.f9616b.f9228f.f9623i.f9590k.add(this.f9619e);
                    C2893g gVar5 = this.f9619e;
                    gVar5.f9581b = true;
                    gVar5.f9590k.add(this.f9622h);
                    this.f9619e.f9590k.add(this.f9623i);
                    this.f9622h.f9591l.add(this.f9619e);
                    fVar4 = this.f9623i;
                }
                list = fVar4.f9591l;
                obj = this.f9619e;
            }
            list.add(obj);
        }
        C2830e eVar4 = this.f9616b;
        C2827d[] dVarArr2 = eVar4.f9201J;
        if (dVarArr2[0].f9176d == null || dVarArr2[1].f9176d == null) {
            if (dVarArr2[0].f9176d != null) {
                fVar3 = mo10060h(dVarArr2[0]);
                if (fVar3 != null) {
                    fVar2 = this.f9622h;
                    i = this.f9616b.f9201J[0].mo9644c();
                } else {
                    return;
                }
            } else if (dVarArr2[1].f9176d != null) {
                C2891f h4 = mo10060h(dVarArr2[1]);
                if (h4 != null) {
                    mo10057b(this.f9623i, h4, -this.f9616b.f9201J[1].mo9644c());
                    mo10058c(this.f9622h, this.f9623i, -1, this.f9619e);
                    return;
                }
                return;
            } else if (!(eVar4 instanceof C2838i) && eVar4.mo9669G() != null) {
                fVar3 = this.f9616b.mo9669G().f9226e.f9622h;
                fVar2 = this.f9622h;
                i = this.f9616b.mo9683Q();
            } else {
                return;
            }
            mo10057b(fVar2, fVar3, i);
            mo10058c(this.f9623i, this.f9622h, 1, this.f9619e);
        } else if (eVar4.mo9687V()) {
            this.f9622h.f9585f = this.f9616b.f9201J[0].mo9644c();
            fVar = this.f9623i;
            dVar = this.f9616b.f9201J[1];
            fVar.f9585f = -dVar.mo9644c();
        } else {
            C2891f h5 = mo10060h(this.f9616b.f9201J[0]);
            C2891f h6 = mo10060h(this.f9616b.f9201J[1]);
            h5.mo10047b(this);
            h6.mo10047b(this);
            this.f9624j = C2901m.C2903b.CENTER;
        }
    }

    /* renamed from: e */
    public void mo10033e() {
        C2891f fVar = this.f9622h;
        if (fVar.f9589j) {
            this.f9616b.mo9668F0(fVar.f9586g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo10034f() {
        this.f9617c = null;
        this.f9622h.mo10048c();
        this.f9623i.mo10048c();
        this.f9619e.mo10048c();
        this.f9621g = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo10036m() {
        return this.f9618d != C2830e.C2832b.MATCH_CONSTRAINT || this.f9616b.f9240l == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo10051r() {
        this.f9621g = false;
        this.f9622h.mo10048c();
        this.f9622h.f9589j = false;
        this.f9623i.mo10048c();
        this.f9623i.f9589j = false;
        this.f9619e.f9589j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f9616b.mo9719r();
    }
}
