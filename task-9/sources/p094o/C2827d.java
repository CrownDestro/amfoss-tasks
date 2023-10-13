package p094o;

import java.util.HashSet;
import java.util.Iterator;
import p088n.C2657c;
import p088n.C2667i;

/* renamed from: o.d */
public class C2827d {

    /* renamed from: a */
    private HashSet<C2827d> f9173a = null;

    /* renamed from: b */
    public final C2830e f9174b;

    /* renamed from: c */
    public final C2829b f9175c;

    /* renamed from: d */
    public C2827d f9176d;

    /* renamed from: e */
    public int f9177e = 0;

    /* renamed from: f */
    int f9178f = -1;

    /* renamed from: g */
    C2667i f9179g;

    /* renamed from: o.d$a */
    static /* synthetic */ class C2828a {

        /* renamed from: a */
        static final /* synthetic */ int[] f9180a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                o.d$b[] r0 = p094o.C2827d.C2829b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9180a = r0
                o.d$b r1 = p094o.C2827d.C2829b.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9180a     // Catch:{ NoSuchFieldError -> 0x001d }
                o.d$b r1 = p094o.C2827d.C2829b.LEFT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9180a     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.d$b r1 = p094o.C2827d.C2829b.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f9180a     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.d$b r1 = p094o.C2827d.C2829b.TOP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f9180a     // Catch:{ NoSuchFieldError -> 0x003e }
                o.d$b r1 = p094o.C2827d.C2829b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f9180a     // Catch:{ NoSuchFieldError -> 0x0049 }
                o.d$b r1 = p094o.C2827d.C2829b.BASELINE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f9180a     // Catch:{ NoSuchFieldError -> 0x0054 }
                o.d$b r1 = p094o.C2827d.C2829b.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f9180a     // Catch:{ NoSuchFieldError -> 0x0060 }
                o.d$b r1 = p094o.C2827d.C2829b.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f9180a     // Catch:{ NoSuchFieldError -> 0x006c }
                o.d$b r1 = p094o.C2827d.C2829b.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p094o.C2827d.C2828a.<clinit>():void");
        }
    }

    /* renamed from: o.d$b */
    public enum C2829b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C2827d(C2830e eVar, C2829b bVar) {
        this.f9174b = eVar;
        this.f9175c = bVar;
    }

    /* renamed from: a */
    public boolean mo9642a(C2827d dVar, int i) {
        return mo9643b(dVar, i, -1, false);
    }

    /* renamed from: b */
    public boolean mo9643b(C2827d dVar, int i, int i2, boolean z) {
        if (dVar == null) {
            mo9653l();
            return true;
        } else if (!z && !mo9652k(dVar)) {
            return false;
        } else {
            this.f9176d = dVar;
            if (dVar.f9173a == null) {
                dVar.f9173a = new HashSet<>();
            }
            this.f9176d.f9173a.add(this);
            if (i > 0) {
                this.f9177e = i;
            } else {
                this.f9177e = 0;
            }
            this.f9178f = i2;
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        r0 = r3.f9176d;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo9644c() {
        /*
            r3 = this;
            o.e r0 = r3.f9174b
            int r0 = r0.mo9681O()
            r1 = 8
            if (r0 != r1) goto L_0x000c
            r0 = 0
            return r0
        L_0x000c:
            int r0 = r3.f9178f
            r2 = -1
            if (r0 <= r2) goto L_0x0020
            o.d r0 = r3.f9176d
            if (r0 == 0) goto L_0x0020
            o.e r0 = r0.f9174b
            int r0 = r0.mo9681O()
            if (r0 != r1) goto L_0x0020
            int r0 = r3.f9178f
            return r0
        L_0x0020:
            int r0 = r3.f9177e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p094o.C2827d.mo9644c():int");
    }

    /* renamed from: d */
    public final C2827d mo9645d() {
        switch (C2828a.f9180a[this.f9175c.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f9174b.f9195D;
            case 3:
                return this.f9174b.f9193B;
            case 4:
                return this.f9174b.f9196E;
            case 5:
                return this.f9174b.f9194C;
            default:
                throw new AssertionError(this.f9175c.name());
        }
    }

    /* renamed from: e */
    public C2830e mo9646e() {
        return this.f9174b;
    }

    /* renamed from: f */
    public C2667i mo9647f() {
        return this.f9179g;
    }

    /* renamed from: g */
    public C2827d mo9648g() {
        return this.f9176d;
    }

    /* renamed from: h */
    public C2829b mo9649h() {
        return this.f9175c;
    }

    /* renamed from: i */
    public boolean mo9650i() {
        HashSet<C2827d> hashSet = this.f9173a;
        if (hashSet == null) {
            return false;
        }
        Iterator<C2827d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().mo9645d().mo9651j()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public boolean mo9651j() {
        return this.f9176d != null;
    }

    /* renamed from: k */
    public boolean mo9652k(C2827d dVar) {
        boolean z = false;
        if (dVar == null) {
            return false;
        }
        C2829b h = dVar.mo9649h();
        C2829b bVar = this.f9175c;
        if (h == bVar) {
            return bVar != C2829b.BASELINE || (dVar.mo9646e().mo9685S() && mo9646e().mo9685S());
        }
        switch (C2828a.f9180a[bVar.ordinal()]) {
            case 1:
                return (h == C2829b.BASELINE || h == C2829b.CENTER_X || h == C2829b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z2 = h == C2829b.LEFT || h == C2829b.RIGHT;
                if (!(dVar.mo9646e() instanceof C2836h)) {
                    return z2;
                }
                if (z2 || h == C2829b.CENTER_X) {
                    z = true;
                }
                return z;
            case 4:
            case 5:
                boolean z3 = h == C2829b.TOP || h == C2829b.BOTTOM;
                if (!(dVar.mo9646e() instanceof C2836h)) {
                    return z3;
                }
                if (z3 || h == C2829b.CENTER_Y) {
                    z = true;
                }
                return z;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f9175c.name());
        }
    }

    /* renamed from: l */
    public void mo9653l() {
        HashSet<C2827d> hashSet;
        C2827d dVar = this.f9176d;
        if (!(dVar == null || (hashSet = dVar.f9173a) == null)) {
            hashSet.remove(this);
        }
        this.f9176d = null;
        this.f9177e = 0;
        this.f9178f = -1;
    }

    /* renamed from: m */
    public void mo9654m(C2657c cVar) {
        C2667i iVar = this.f9179g;
        if (iVar == null) {
            this.f9179g = new C2667i(C2667i.C2668a.UNRESTRICTED, (String) null);
        } else {
            iVar.mo9412d();
        }
    }

    /* renamed from: n */
    public void mo9655n(int i) {
        if (mo9651j()) {
            this.f9178f = i;
        }
    }

    public String toString() {
        return this.f9174b.mo9719r() + ":" + this.f9175c.toString();
    }
}
