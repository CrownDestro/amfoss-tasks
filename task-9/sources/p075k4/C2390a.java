package p075k4;

import android.util.Log;
import android.view.MotionEvent;
import java.lang.reflect.Method;

/* renamed from: k4.a */
public class C2390a<T> {

    /* renamed from: A */
    private static Method f8237A = null;

    /* renamed from: B */
    private static Method f8238B = null;

    /* renamed from: C */
    private static Method f8239C = null;

    /* renamed from: D */
    private static Method f8240D = null;

    /* renamed from: E */
    private static int f8241E = 6;

    /* renamed from: F */
    private static int f8242F = 8;

    /* renamed from: G */
    private static final float[] f8243G = new float[20];

    /* renamed from: H */
    private static final float[] f8244H = new float[20];

    /* renamed from: I */
    private static final float[] f8245I = new float[20];

    /* renamed from: J */
    private static final int[] f8246J = new int[20];

    /* renamed from: v */
    public static final boolean f8247v;

    /* renamed from: w */
    private static Method f8248w;

    /* renamed from: x */
    private static Method f8249x;

    /* renamed from: y */
    private static Method f8250y;

    /* renamed from: z */
    private static Method f8251z;

    /* renamed from: a */
    C2391a<T> f8252a;

    /* renamed from: b */
    private C2392b f8253b = new C2392b();

    /* renamed from: c */
    private C2392b f8254c = new C2392b();

    /* renamed from: d */
    private float f8255d;

    /* renamed from: e */
    private float f8256e;

    /* renamed from: f */
    private float f8257f;

    /* renamed from: g */
    private float f8258g;

    /* renamed from: h */
    private float f8259h;

    /* renamed from: i */
    private float f8260i;

    /* renamed from: j */
    private boolean f8261j;

    /* renamed from: k */
    private T f8262k = null;

    /* renamed from: l */
    private C2393c f8263l = new C2393c();

    /* renamed from: m */
    private long f8264m;

    /* renamed from: n */
    private long f8265n;

    /* renamed from: o */
    private float f8266o;

    /* renamed from: p */
    private float f8267p;

    /* renamed from: q */
    private float f8268q;

    /* renamed from: r */
    private float f8269r;

    /* renamed from: s */
    private float f8270s;

    /* renamed from: t */
    private float f8271t;

    /* renamed from: u */
    private int f8272u = 0;

    /* renamed from: k4.a$a */
    public interface C2391a<T> {
        /* renamed from: a */
        T mo8922a(C2392b bVar);

        /* renamed from: b */
        void mo8923b(T t, C2392b bVar);

        /* renamed from: c */
        boolean mo8924c(T t, C2393c cVar, C2392b bVar);

        /* renamed from: d */
        void mo8925d(T t, C2393c cVar);
    }

    /* renamed from: k4.a$b */
    public static class C2392b {

        /* renamed from: a */
        private int f8273a;

        /* renamed from: b */
        private float[] f8274b = new float[20];

        /* renamed from: c */
        private float[] f8275c = new float[20];

        /* renamed from: d */
        private float[] f8276d = new float[20];

        /* renamed from: e */
        private int[] f8277e = new int[20];

        /* renamed from: f */
        private float f8278f;

        /* renamed from: g */
        private float f8279g;

        /* renamed from: h */
        private float f8280h;

        /* renamed from: i */
        private float f8281i;

        /* renamed from: j */
        private float f8282j;

        /* renamed from: k */
        private float f8283k;

        /* renamed from: l */
        private float f8284l;

        /* renamed from: m */
        private float f8285m;

        /* renamed from: n */
        private boolean f8286n;

        /* renamed from: o */
        private boolean f8287o;

        /* renamed from: p */
        private boolean f8288p;

        /* renamed from: q */
        private boolean f8289q;

        /* renamed from: r */
        private boolean f8290r;

        /* renamed from: s */
        private int f8291s;
        /* access modifiers changed from: private */

        /* renamed from: t */
        public long f8292t;

        /* renamed from: m */
        private int m11158m(int i) {
            int i2 = 0;
            int i3 = 32768;
            int i4 = 15;
            while (true) {
                int i5 = i4 - 1;
                int i6 = ((i2 << 1) + i3) << i4;
                if (i >= i6) {
                    i2 += i3;
                    i -= i6;
                }
                i3 >>= 1;
                if (i3 <= 0) {
                    return i2;
                }
                i4 = i5;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public void m11159n(int i, float[] fArr, float[] fArr2, float[] fArr3, int[] iArr, int i2, boolean z, long j) {
            this.f8292t = j;
            this.f8291s = i2;
            this.f8273a = i;
            for (int i3 = 0; i3 < i; i3++) {
                this.f8274b[i3] = fArr[i3];
                this.f8275c[i3] = fArr2[i3];
                this.f8276d[i3] = fArr3[i3];
                this.f8277e[i3] = iArr[i3];
            }
            this.f8286n = z;
            boolean z2 = i >= 2;
            this.f8287o = z2;
            if (z2) {
                this.f8278f = (fArr[0] + fArr[1]) * 0.5f;
                this.f8279g = (fArr2[0] + fArr2[1]) * 0.5f;
                this.f8280h = (fArr3[0] + fArr3[1]) * 0.5f;
                this.f8281i = Math.abs(fArr[1] - fArr[0]);
                this.f8282j = Math.abs(fArr2[1] - fArr2[0]);
            } else {
                this.f8278f = fArr[0];
                this.f8279g = fArr2[0];
                this.f8280h = fArr3[0];
                this.f8282j = 0.0f;
                this.f8281i = 0.0f;
            }
            this.f8290r = false;
            this.f8289q = false;
            this.f8288p = false;
        }

        /* renamed from: c */
        public long mo8926c() {
            return this.f8292t;
        }

        /* renamed from: d */
        public float mo8927d() {
            float f;
            if (!this.f8290r) {
                if (!this.f8287o) {
                    f = 0.0f;
                } else {
                    float[] fArr = this.f8275c;
                    float[] fArr2 = this.f8274b;
                    f = (float) Math.atan2((double) (fArr[1] - fArr[0]), (double) (fArr2[1] - fArr2[0]));
                }
                this.f8285m = f;
                this.f8290r = true;
            }
            return this.f8285m;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
            if (r0 < r1) goto L_0x0009;
         */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public float mo8928e() {
            /*
                r3 = this;
                boolean r0 = r3.f8289q
                if (r0 != 0) goto L_0x0039
                boolean r0 = r3.f8287o
                r1 = 0
                if (r0 != 0) goto L_0x000c
            L_0x0009:
                r3.f8283k = r1
                goto L_0x0036
            L_0x000c:
                float r0 = r3.mo8929f()
                int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r2 != 0) goto L_0x0015
                goto L_0x0023
            L_0x0015:
                r1 = 1132462080(0x43800000, float:256.0)
                float r0 = r0 * r1
                int r0 = (int) r0
                int r0 = r3.m11158m(r0)
                float r0 = (float) r0
                r1 = 1098907648(0x41800000, float:16.0)
                float r1 = r0 / r1
            L_0x0023:
                r3.f8283k = r1
                float r0 = r3.f8281i
                int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                if (r1 >= 0) goto L_0x002d
                r3.f8283k = r0
            L_0x002d:
                float r0 = r3.f8283k
                float r1 = r3.f8282j
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 >= 0) goto L_0x0036
                goto L_0x0009
            L_0x0036:
                r0 = 1
                r3.f8289q = r0
            L_0x0039:
                float r0 = r3.f8283k
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p075k4.C2390a.C2392b.mo8928e():float");
        }

        /* renamed from: f */
        public float mo8929f() {
            float f;
            if (!this.f8288p) {
                if (this.f8287o) {
                    float f2 = this.f8281i;
                    float f3 = this.f8282j;
                    f = (f2 * f2) + (f3 * f3);
                } else {
                    f = 0.0f;
                }
                this.f8284l = f;
                this.f8288p = true;
            }
            return this.f8284l;
        }

        /* renamed from: g */
        public float mo8930g() {
            if (this.f8287o) {
                return this.f8282j;
            }
            return 0.0f;
        }

        /* renamed from: h */
        public float mo8931h() {
            if (this.f8287o) {
                return this.f8281i;
            }
            return 0.0f;
        }

        /* renamed from: i */
        public float mo8932i() {
            return this.f8278f;
        }

        /* renamed from: j */
        public float mo8933j() {
            return this.f8279g;
        }

        /* renamed from: k */
        public boolean mo8934k() {
            return this.f8286n;
        }

        /* renamed from: l */
        public boolean mo8935l() {
            return this.f8287o;
        }
    }

    /* renamed from: k4.a$c */
    public static class C2393c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public float f8293a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public float f8294b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public float f8295c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public float f8296d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public float f8297e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public float f8298f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public boolean f8299g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public boolean f8300h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public boolean f8301i;

        /* renamed from: j */
        public float mo8936j() {
            if (!this.f8299g) {
                return 1.0f;
            }
            return this.f8295c;
        }

        /* renamed from: k */
        public float mo8937k() {
            return this.f8293a;
        }

        /* renamed from: l */
        public float mo8938l() {
            return this.f8294b;
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public void mo8939m(float f, float f2, float f3, float f4, float f5, float f6) {
            this.f8293a = f;
            this.f8294b = f2;
            if (f3 == 0.0f) {
                f3 = 1.0f;
            }
            this.f8295c = f3;
            if (f4 == 0.0f) {
                f4 = 1.0f;
            }
            this.f8296d = f4;
            if (f5 == 0.0f) {
                f5 = 1.0f;
            }
            this.f8297e = f5;
            this.f8298f = f6;
        }

        /* renamed from: n */
        public void mo8940n(float f, float f2, boolean z, float f3, boolean z2, float f4, float f5, boolean z3, float f6) {
            this.f8293a = f;
            this.f8294b = f2;
            this.f8299g = z;
            if (f3 == 0.0f) {
                f3 = 1.0f;
            }
            this.f8295c = f3;
            this.f8300h = z2;
            if (f4 == 0.0f) {
                f4 = 1.0f;
            }
            this.f8296d = f4;
            if (f5 == 0.0f) {
                f5 = 1.0f;
            }
            this.f8297e = f5;
            this.f8301i = z3;
            this.f8298f = f6;
        }
    }

    static {
        boolean z = true;
        try {
            f8248w = MotionEvent.class.getMethod("getPointerCount", new Class[0]);
            Class cls = Integer.TYPE;
            f8249x = MotionEvent.class.getMethod("getPointerId", new Class[]{cls});
            f8250y = MotionEvent.class.getMethod("getPressure", new Class[]{cls});
            f8251z = MotionEvent.class.getMethod("getHistoricalX", new Class[]{cls, cls});
            f8237A = MotionEvent.class.getMethod("getHistoricalY", new Class[]{cls, cls});
            f8238B = MotionEvent.class.getMethod("getHistoricalPressure", new Class[]{cls, cls});
            f8239C = MotionEvent.class.getMethod("getX", new Class[]{cls});
            f8240D = MotionEvent.class.getMethod("getY", new Class[]{cls});
        } catch (Exception e) {
            Log.e("MultiTouchController", "static initializer failed", e);
            z = false;
        }
        f8247v = z;
        if (z) {
            try {
                f8241E = MotionEvent.class.getField("ACTION_POINTER_UP").getInt((Object) null);
                f8242F = MotionEvent.class.getField("ACTION_POINTER_INDEX_SHIFT").getInt((Object) null);
            } catch (Exception unused) {
            }
        }
    }

    public C2390a(C2391a<T> aVar, boolean z) {
        this.f8261j = z;
        this.f8252a = aVar;
    }

    /* renamed from: a */
    private void m11145a() {
        T t = this.f8262k;
        if (t != null) {
            this.f8252a.mo8925d(t, this.f8263l);
            float d = 1.0f / ((this.f8263l.f8299g && this.f8263l.f8295c != 0.0f) ? this.f8263l.f8295c : 1.0f);
            m11147c();
            this.f8266o = (this.f8255d - this.f8263l.f8293a) * d;
            this.f8267p = (this.f8256e - this.f8263l.f8294b) * d;
            this.f8268q = this.f8263l.f8295c / this.f8257f;
            this.f8270s = this.f8263l.f8296d / this.f8258g;
            this.f8271t = this.f8263l.f8297e / this.f8259h;
            this.f8269r = this.f8263l.f8298f - this.f8260i;
        }
    }

    /* renamed from: b */
    private void m11146b(int i, float[] fArr, float[] fArr2, float[] fArr3, int[] iArr, int i2, boolean z, long j) {
        C2392b bVar = this.f8254c;
        this.f8254c = this.f8253b;
        this.f8253b = bVar;
        bVar.m11159n(i, fArr, fArr2, fArr3, iArr, i2, z, j);
        m11148e();
    }

    /* renamed from: c */
    private void m11147c() {
        this.f8255d = this.f8253b.mo8932i();
        this.f8256e = this.f8253b.mo8933j();
        float f = 0.0f;
        this.f8257f = Math.max(21.3f, !this.f8263l.f8299g ? 0.0f : this.f8253b.mo8928e());
        this.f8258g = Math.max(30.0f, !this.f8263l.f8300h ? 0.0f : this.f8253b.mo8931h());
        this.f8259h = Math.max(30.0f, !this.f8263l.f8300h ? 0.0f : this.f8253b.mo8930g());
        if (this.f8263l.f8301i) {
            f = this.f8253b.mo8927d();
        }
        this.f8260i = f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008a, code lost:
        if (p075k4.C2390a.C2392b.m11156a(r7.f8253b) < r7.f8265n) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d0, code lost:
        if (r7.f8253b.mo8926c() < r7.f8265n) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d2, code lost:
        m11145a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d6, code lost:
        m11149g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m11148e() {
        /*
            r7 = this;
            int r0 = r7.f8272u
            r1 = 1
            if (r0 == 0) goto L_0x00da
            r2 = 0
            r3 = 0
            r4 = 2
            r5 = 20
            if (r0 == r1) goto L_0x0099
            if (r0 == r4) goto L_0x0010
            goto L_0x0104
        L_0x0010:
            k4.a$b r0 = r7.f8253b
            boolean r0 = r0.mo8935l()
            if (r0 == 0) goto L_0x008d
            k4.a$b r0 = r7.f8253b
            boolean r0 = r0.mo8934k()
            if (r0 != 0) goto L_0x0021
            goto L_0x008d
        L_0x0021:
            k4.a$b r0 = r7.f8253b
            float r0 = r0.mo8932i()
            k4.a$b r1 = r7.f8254c
            float r1 = r1.mo8932i()
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            r1 = 1106247680(0x41f00000, float:30.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00b7
            k4.a$b r0 = r7.f8253b
            float r0 = r0.mo8933j()
            k4.a$b r2 = r7.f8254c
            float r2 = r2.mo8933j()
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00b7
            k4.a$b r0 = r7.f8253b
            float r0 = r0.mo8931h()
            k4.a$b r1 = r7.f8254c
            float r1 = r1.mo8931h()
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r1
            r2 = 1109393408(0x42200000, float:40.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x00b7
            k4.a$b r0 = r7.f8253b
            float r0 = r0.mo8930g()
            k4.a$b r3 = r7.f8254c
            float r3 = r3.mo8930g()
            float r0 = r0 - r3
            float r0 = java.lang.Math.abs(r0)
            float r0 = r0 * r1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0080
            goto L_0x00b7
        L_0x0080:
            k4.a$b r0 = r7.f8253b
            long r0 = r0.f8292t
            long r2 = r7.f8265n
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x00d6
            goto L_0x00d2
        L_0x008d:
            k4.a$b r0 = r7.f8253b
            boolean r0 = r0.mo8934k()
            if (r0 != 0) goto L_0x0096
            goto L_0x00a1
        L_0x0096:
            r7.f8272u = r1
            goto L_0x00b7
        L_0x0099:
            k4.a$b r0 = r7.f8253b
            boolean r0 = r0.mo8934k()
            if (r0 != 0) goto L_0x00ad
        L_0x00a1:
            r7.f8272u = r3
            k4.a$a<T> r0 = r7.f8252a
            r7.f8262k = r2
            k4.a$b r1 = r7.f8253b
            r0.mo8923b(r2, r1)
            goto L_0x0104
        L_0x00ad:
            k4.a$b r0 = r7.f8253b
            boolean r0 = r0.mo8935l()
            if (r0 == 0) goto L_0x00c6
            r7.f8272u = r4
        L_0x00b7:
            r7.m11145a()
            k4.a$b r0 = r7.f8253b
            long r0 = r0.mo8926c()
            r7.f8264m = r0
            long r0 = r0 + r5
            r7.f8265n = r0
            goto L_0x0104
        L_0x00c6:
            k4.a$b r0 = r7.f8253b
            long r0 = r0.mo8926c()
            long r2 = r7.f8265n
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x00d6
        L_0x00d2:
            r7.m11145a()
            goto L_0x0104
        L_0x00d6:
            r7.m11149g()
            goto L_0x0104
        L_0x00da:
            k4.a$b r0 = r7.f8253b
            boolean r0 = r0.mo8934k()
            if (r0 == 0) goto L_0x0104
            k4.a$a<T> r0 = r7.f8252a
            k4.a$b r2 = r7.f8253b
            java.lang.Object r0 = r0.mo8922a(r2)
            r7.f8262k = r0
            if (r0 == 0) goto L_0x0104
            r7.f8272u = r1
            k4.a$a<T> r1 = r7.f8252a
            k4.a$b r2 = r7.f8253b
            r1.mo8923b(r0, r2)
            r7.m11145a()
            k4.a$b r0 = r7.f8253b
            long r0 = r0.mo8926c()
            r7.f8265n = r0
            r7.f8264m = r0
        L_0x0104:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p075k4.C2390a.m11148e():void");
    }

    /* renamed from: g */
    private void m11149g() {
        if (this.f8262k != null) {
            float f = 1.0f;
            if (this.f8263l.f8299g && this.f8263l.f8295c != 0.0f) {
                f = this.f8263l.f8295c;
            }
            m11147c();
            this.f8263l.mo8939m(this.f8255d - (this.f8266o * f), this.f8256e - (this.f8267p * f), this.f8268q * this.f8257f, this.f8270s * this.f8258g, this.f8271t * this.f8259h, this.f8269r + this.f8260i);
            this.f8252a.mo8924c(this.f8262k, this.f8263l, this.f8253b);
        }
    }

    /* renamed from: d */
    public boolean mo8920d() {
        return this.f8272u == 2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x012a A[Catch:{ Exception -> 0x016b }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x012c A[Catch:{ Exception -> 0x016b }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0132 A[Catch:{ Exception -> 0x016b }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0146 A[Catch:{ Exception -> 0x016b }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x014b A[Catch:{ Exception -> 0x016b }] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo8921f(android.view.MotionEvent r21) {
        /*
            r20 = this;
            r11 = r20
            r0 = r21
            r12 = 0
            boolean r1 = f8247v     // Catch:{ Exception -> 0x016b }
            r13 = 1
            if (r1 == 0) goto L_0x001a
            java.lang.reflect.Method r1 = f8248w     // Catch:{ Exception -> 0x016b }
            java.lang.Object[] r2 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x016b }
            java.lang.Object r1 = r1.invoke(r0, r2)     // Catch:{ Exception -> 0x016b }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x016b }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x016b }
            r14 = r1
            goto L_0x001b
        L_0x001a:
            r14 = 1
        L_0x001b:
            int r1 = r11.f8272u     // Catch:{ Exception -> 0x016b }
            if (r1 != 0) goto L_0x0026
            boolean r1 = r11.f8261j     // Catch:{ Exception -> 0x016b }
            if (r1 != 0) goto L_0x0026
            if (r14 != r13) goto L_0x0026
            return r12
        L_0x0026:
            int r15 = r21.getAction()     // Catch:{ Exception -> 0x016b }
            int r1 = r21.getHistorySize()     // Catch:{ Exception -> 0x016b }
            int r9 = r1 / r14
            r10 = 0
        L_0x0031:
            if (r10 > r9) goto L_0x016a
            if (r10 >= r9) goto L_0x0037
            r1 = 1
            goto L_0x0038
        L_0x0037:
            r1 = 0
        L_0x0038:
            boolean r2 = f8247v     // Catch:{ Exception -> 0x016b }
            r3 = 2
            if (r2 == 0) goto L_0x00f3
            if (r14 != r13) goto L_0x0041
            goto L_0x00f3
        L_0x0041:
            r2 = 20
            int r2 = java.lang.Math.min(r14, r2)     // Catch:{ Exception -> 0x016b }
            r4 = 0
        L_0x0048:
            if (r4 >= r2) goto L_0x0120
            java.lang.reflect.Method r5 = f8249x     // Catch:{ Exception -> 0x016b }
            java.lang.Object[] r6 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x016b }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x016b }
            r6[r12] = r7     // Catch:{ Exception -> 0x016b }
            java.lang.Object r5 = r5.invoke(r0, r6)     // Catch:{ Exception -> 0x016b }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ Exception -> 0x016b }
            int r5 = r5.intValue()     // Catch:{ Exception -> 0x016b }
            int[] r6 = f8246J     // Catch:{ Exception -> 0x016b }
            r6[r4] = r5     // Catch:{ Exception -> 0x016b }
            float[] r5 = f8243G     // Catch:{ Exception -> 0x016b }
            if (r1 == 0) goto L_0x007b
            java.lang.reflect.Method r6 = f8251z     // Catch:{ Exception -> 0x016b }
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x016b }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x016b }
            r7[r12] = r8     // Catch:{ Exception -> 0x016b }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x016b }
            r7[r13] = r8     // Catch:{ Exception -> 0x016b }
            java.lang.Object r6 = r6.invoke(r0, r7)     // Catch:{ Exception -> 0x016b }
            goto L_0x0089
        L_0x007b:
            java.lang.reflect.Method r6 = f8239C     // Catch:{ Exception -> 0x016b }
            java.lang.Object[] r7 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x016b }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x016b }
            r7[r12] = r8     // Catch:{ Exception -> 0x016b }
            java.lang.Object r6 = r6.invoke(r0, r7)     // Catch:{ Exception -> 0x016b }
        L_0x0089:
            java.lang.Float r6 = (java.lang.Float) r6     // Catch:{ Exception -> 0x016b }
            float r6 = r6.floatValue()     // Catch:{ Exception -> 0x016b }
            r5[r4] = r6     // Catch:{ Exception -> 0x016b }
            float[] r5 = f8244H     // Catch:{ Exception -> 0x016b }
            if (r1 == 0) goto L_0x00aa
            java.lang.reflect.Method r6 = f8237A     // Catch:{ Exception -> 0x016b }
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x016b }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x016b }
            r7[r12] = r8     // Catch:{ Exception -> 0x016b }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x016b }
            r7[r13] = r8     // Catch:{ Exception -> 0x016b }
            java.lang.Object r6 = r6.invoke(r0, r7)     // Catch:{ Exception -> 0x016b }
            goto L_0x00b8
        L_0x00aa:
            java.lang.reflect.Method r6 = f8240D     // Catch:{ Exception -> 0x016b }
            java.lang.Object[] r7 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x016b }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x016b }
            r7[r12] = r8     // Catch:{ Exception -> 0x016b }
            java.lang.Object r6 = r6.invoke(r0, r7)     // Catch:{ Exception -> 0x016b }
        L_0x00b8:
            java.lang.Float r6 = (java.lang.Float) r6     // Catch:{ Exception -> 0x016b }
            float r6 = r6.floatValue()     // Catch:{ Exception -> 0x016b }
            r5[r4] = r6     // Catch:{ Exception -> 0x016b }
            float[] r5 = f8245I     // Catch:{ Exception -> 0x016b }
            if (r1 == 0) goto L_0x00d9
            java.lang.reflect.Method r6 = f8238B     // Catch:{ Exception -> 0x016b }
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x016b }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x016b }
            r7[r12] = r8     // Catch:{ Exception -> 0x016b }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x016b }
            r7[r13] = r8     // Catch:{ Exception -> 0x016b }
            java.lang.Object r6 = r6.invoke(r0, r7)     // Catch:{ Exception -> 0x016b }
            goto L_0x00e7
        L_0x00d9:
            java.lang.reflect.Method r6 = f8250y     // Catch:{ Exception -> 0x016b }
            java.lang.Object[] r7 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x016b }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x016b }
            r7[r12] = r8     // Catch:{ Exception -> 0x016b }
            java.lang.Object r6 = r6.invoke(r0, r7)     // Catch:{ Exception -> 0x016b }
        L_0x00e7:
            java.lang.Float r6 = (java.lang.Float) r6     // Catch:{ Exception -> 0x016b }
            float r6 = r6.floatValue()     // Catch:{ Exception -> 0x016b }
            r5[r4] = r6     // Catch:{ Exception -> 0x016b }
            int r4 = r4 + 1
            goto L_0x0048
        L_0x00f3:
            float[] r2 = f8243G     // Catch:{ Exception -> 0x016b }
            if (r1 == 0) goto L_0x00fc
            float r4 = r0.getHistoricalX(r10)     // Catch:{ Exception -> 0x016b }
            goto L_0x0100
        L_0x00fc:
            float r4 = r21.getX()     // Catch:{ Exception -> 0x016b }
        L_0x0100:
            r2[r12] = r4     // Catch:{ Exception -> 0x016b }
            float[] r2 = f8244H     // Catch:{ Exception -> 0x016b }
            if (r1 == 0) goto L_0x010b
            float r4 = r0.getHistoricalY(r10)     // Catch:{ Exception -> 0x016b }
            goto L_0x010f
        L_0x010b:
            float r4 = r21.getY()     // Catch:{ Exception -> 0x016b }
        L_0x010f:
            r2[r12] = r4     // Catch:{ Exception -> 0x016b }
            float[] r2 = f8245I     // Catch:{ Exception -> 0x016b }
            if (r1 == 0) goto L_0x011a
            float r4 = r0.getHistoricalPressure(r10)     // Catch:{ Exception -> 0x016b }
            goto L_0x011e
        L_0x011a:
            float r4 = r21.getPressure()     // Catch:{ Exception -> 0x016b }
        L_0x011e:
            r2[r12] = r4     // Catch:{ Exception -> 0x016b }
        L_0x0120:
            float[] r4 = f8243G     // Catch:{ Exception -> 0x016b }
            float[] r5 = f8244H     // Catch:{ Exception -> 0x016b }
            float[] r6 = f8245I     // Catch:{ Exception -> 0x016b }
            int[] r7 = f8246J     // Catch:{ Exception -> 0x016b }
            if (r1 == 0) goto L_0x012c
            r8 = 2
            goto L_0x012d
        L_0x012c:
            r8 = r15
        L_0x012d:
            if (r1 == 0) goto L_0x0132
        L_0x012f:
            r16 = 1
            goto L_0x0144
        L_0x0132:
            if (r15 == r13) goto L_0x0142
            int r2 = f8242F     // Catch:{ Exception -> 0x016b }
            int r2 = r13 << r2
            int r2 = r2 - r13
            r2 = r2 & r15
            int r3 = f8241E     // Catch:{ Exception -> 0x016b }
            if (r2 == r3) goto L_0x0142
            r2 = 3
            if (r15 == r2) goto L_0x0142
            goto L_0x012f
        L_0x0142:
            r16 = 0
        L_0x0144:
            if (r1 == 0) goto L_0x014b
            long r1 = r0.getHistoricalEventTime(r10)     // Catch:{ Exception -> 0x016b }
            goto L_0x014f
        L_0x014b:
            long r1 = r21.getEventTime()     // Catch:{ Exception -> 0x016b }
        L_0x014f:
            r17 = r1
            r1 = r20
            r2 = r14
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r16
            r16 = r9
            r19 = r10
            r9 = r17
            r1.m11146b(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x016b }
            int r10 = r19 + 1
            r9 = r16
            goto L_0x0031
        L_0x016a:
            return r13
        L_0x016b:
            r0 = move-exception
            java.lang.String r1 = "MultiTouchController"
            java.lang.String r2 = "onTouchEvent() failed"
            android.util.Log.e(r1, r2, r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p075k4.C2390a.mo8921f(android.view.MotionEvent):boolean");
    }
}
