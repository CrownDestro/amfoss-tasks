package org.osmdroid.views;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import p081l4.C2491a;
import p081l4.C2494d;
import p147w4.C3457a;
import p147w4.C3468d0;
import p147w4.C3472f;
import p147w4.C3475g;
import p147w4.C3495x;
import p147w4.C3496y;

/* renamed from: org.osmdroid.views.f */
public class C2883f implements C2494d {

    /* renamed from: a */
    private long f9536a;

    /* renamed from: b */
    private long f9537b;

    /* renamed from: c */
    private long f9538c;

    /* renamed from: d */
    private long f9539d;

    /* renamed from: e */
    private final Matrix f9540e;

    /* renamed from: f */
    private final Matrix f9541f;

    /* renamed from: g */
    private final float[] f9542g;

    /* renamed from: h */
    private final C3457a f9543h;

    /* renamed from: i */
    private final double f9544i;

    /* renamed from: j */
    private final Rect f9545j;

    /* renamed from: k */
    private final Rect f9546k;

    /* renamed from: l */
    private boolean f9547l;

    /* renamed from: m */
    private boolean f9548m;

    /* renamed from: n */
    private final double f9549n;

    /* renamed from: o */
    private final double f9550o;

    /* renamed from: p */
    private final float f9551p;

    /* renamed from: q */
    private final C3472f f9552q;

    /* renamed from: r */
    private final C3468d0 f9553r;

    /* renamed from: s */
    private final int f9554s;

    /* renamed from: t */
    private final int f9555t;

    public C2883f(double d, int i, int i2, C3472f fVar, float f, boolean z, boolean z2, int i3, int i4) {
        this(d, new Rect(0, 0, i, i2), fVar, 0, 0, f, z, z2, C2875d.getTileSystem(), i3, i4);
    }

    public C2883f(double d, Rect rect, C3472f fVar, long j, long j2, float f, boolean z, boolean z2, C3468d0 d0Var, int i, int i2) {
        float f2 = f;
        Matrix matrix = new Matrix();
        this.f9540e = matrix;
        Matrix matrix2 = new Matrix();
        this.f9541f = matrix2;
        this.f9542g = new float[2];
        this.f9543h = new C3457a();
        this.f9545j = new Rect();
        this.f9552q = new C3472f(0.0d, 0.0d);
        this.f9554s = i;
        this.f9555t = i2;
        this.f9544i = d;
        this.f9547l = z;
        this.f9548m = z2;
        this.f9553r = d0Var;
        double e = C3468d0.m15238e(d);
        this.f9549n = e;
        this.f9550o = C3468d0.m15229E(d);
        this.f9546k = rect;
        C3472f fVar2 = fVar != null ? fVar : new C3472f(0.0d, 0.0d);
        this.f9538c = j;
        this.f9539d = j2;
        C3468d0 d0Var2 = d0Var;
        double d2 = e;
        this.f9536a = (((long) mo9991E()) - this.f9538c) - d0Var2.mo11405y(fVar2.mo9100l(), d2, this.f9547l);
        this.f9537b = (((long) mo9992F()) - this.f9539d) - d0Var2.mo11406z(fVar2.mo9099e(), d2, this.f9548m);
        this.f9551p = f2;
        matrix.preRotate(f2, (float) mo9991E(), (float) mo9992F());
        matrix.invert(matrix2);
        m13073M();
    }

    C2883f(C2875d dVar) {
        this(dVar.getZoomLevelDouble(), dVar.mo9938r((Rect) null), dVar.getExpectedCenter(), dVar.getMapScrollX(), dVar.getMapScrollY(), dVar.getMapOrientation(), dVar.mo9968w(), dVar.mo9971z(), C2875d.getTileSystem(), dVar.getMapCenterOffsetX(), dVar.getMapCenterOffsetY());
    }

    /* renamed from: G */
    public static long m13072G(long j, long j2, double d, int i, int i2) {
        long j3;
        while (true) {
            j3 = j2 - j;
            if (j3 >= 0) {
                break;
            }
            double d2 = (double) j2;
            Double.isNaN(d2);
            j2 = (long) (d2 + d);
        }
        if (j3 < ((long) (i - (i2 * 2)))) {
            long j4 = j3 / 2;
            long j5 = (long) (i / 2);
            long j6 = (j5 - j4) - j;
            if (j6 > 0) {
                return j6;
            }
            long j7 = (j5 + j4) - j2;
            if (j7 < 0) {
                return j7;
            }
            return 0;
        }
        long j8 = ((long) i2) - j;
        if (j8 < 0) {
            return j8;
        }
        long j9 = ((long) (i - i2)) - j2;
        if (j9 > 0) {
            return j9;
        }
        return 0;
    }

    /* renamed from: M */
    private void m13073M() {
        mo10013g(mo9991E(), mo9992F(), this.f9552q);
        float f = this.f9551p;
        if (f == 0.0f || f == 180.0f) {
            Rect rect = this.f9545j;
            Rect rect2 = this.f9546k;
            rect.left = rect2.left;
            rect.top = rect2.top;
            rect.right = rect2.right;
            rect.bottom = rect2.bottom;
        } else {
            C3475g.m15300c(this.f9546k, mo9991E(), mo9992F(), this.f9551p, this.f9545j);
        }
        Rect rect3 = this.f9545j;
        C3472f h = mo10014h(rect3.right, rect3.top, (C3472f) null, true);
        C3468d0 tileSystem = C2875d.getTileSystem();
        if (h.mo9099e() > tileSystem.mo11401s()) {
            h = new C3472f(tileSystem.mo11401s(), h.mo9100l());
        }
        if (h.mo9099e() < tileSystem.mo11379A()) {
            h = new C3472f(tileSystem.mo11379A(), h.mo9100l());
        }
        Rect rect4 = this.f9545j;
        C3472f h2 = mo10014h(rect4.left, rect4.bottom, (C3472f) null, true);
        if (h2.mo9099e() > tileSystem.mo11401s()) {
            h2 = new C3472f(tileSystem.mo11401s(), h2.mo9100l());
        }
        if (h2.mo9099e() < tileSystem.mo11379A()) {
            h2 = new C3472f(tileSystem.mo11379A(), h2.mo9100l());
        }
        this.f9543h.mo11343B(h.mo9099e(), h.mo9100l(), h2.mo9099e(), h2.mo9100l());
    }

    /* renamed from: d */
    private Point m13074d(int i, int i2, Point point, Matrix matrix, boolean z) {
        if (point == null) {
            point = new Point();
        }
        if (z) {
            float[] fArr = this.f9542g;
            fArr[0] = (float) i;
            fArr[1] = (float) i2;
            matrix.mapPoints(fArr);
            float[] fArr2 = this.f9542g;
            point.x = (int) fArr2[0];
            point.y = (int) fArr2[1];
        } else {
            point.x = i;
            point.y = i2;
        }
        return point;
    }

    /* renamed from: k */
    private long m13075k(long j, int i, int i2, double d) {
        long j2 = (long) ((i + i2) / 2);
        long j3 = (long) i;
        long j4 = 0;
        if (j < j3) {
            while (j < j3) {
                double d2 = (double) j;
                Double.isNaN(d2);
                long j5 = j;
                j = (long) (d2 + d);
                j4 = j5;
            }
            return (j >= ((long) i2) && Math.abs(j2 - j) >= Math.abs(j2 - j4)) ? j4 : j;
        }
        while (j >= j3) {
            double d3 = (double) j;
            Double.isNaN(d3);
            long j6 = j;
            j = (long) (d3 - d);
            j4 = j6;
        }
        return (j4 >= ((long) i2) && Math.abs(j2 - j) < Math.abs(j2 - j4)) ? j : j4;
    }

    /* renamed from: p */
    private long m13076p(long j, boolean z, long j2, int i, int i2) {
        long j3 = j + j2;
        if (!z) {
            return j3;
        }
        return m13075k(j3, i, i2, this.f9549n);
    }

    /* renamed from: s */
    private long m13077s(long j, boolean z) {
        long j2 = this.f9536a;
        Rect rect = this.f9546k;
        return m13076p(j, z, j2, rect.left, rect.right);
    }

    /* renamed from: v */
    private long m13078v(long j, boolean z) {
        long j2 = this.f9537b;
        Rect rect = this.f9546k;
        return m13076p(j, z, j2, rect.top, rect.bottom);
    }

    /* renamed from: A */
    public long mo9987A(int i) {
        return ((long) i) - this.f9537b;
    }

    /* renamed from: B */
    public float mo9988B() {
        return this.f9551p;
    }

    /* renamed from: C */
    public Rect mo9989C(int i, int i2, Rect rect) {
        if (rect == null) {
            rect = new Rect();
        }
        rect.left = C3468d0.m15232Q(m13077s(mo10026x(i), false));
        rect.top = C3468d0.m15232Q(m13078v(mo10026x(i2), false));
        rect.right = C3468d0.m15232Q(m13077s(mo10026x(i + 1), false));
        rect.bottom = C3468d0.m15232Q(m13078v(mo10026x(i2 + 1), false));
        return rect;
    }

    /* renamed from: D */
    public double mo9990D() {
        return 1.15292150460684698E18d / mo9994I();
    }

    /* renamed from: E */
    public int mo9991E() {
        Rect rect = this.f9546k;
        return ((rect.right + rect.left) / 2) + this.f9554s;
    }

    /* renamed from: F */
    public int mo9992F() {
        Rect rect = this.f9546k;
        return ((rect.bottom + rect.top) / 2) + this.f9555t;
    }

    /* renamed from: H */
    public int mo9993H() {
        return this.f9546k.width();
    }

    /* renamed from: I */
    public double mo9994I() {
        return this.f9549n;
    }

    /* renamed from: J */
    public double mo9995J() {
        return this.f9544i;
    }

    /* renamed from: K */
    public boolean mo9996K() {
        return this.f9547l;
    }

    /* renamed from: L */
    public boolean mo9997L() {
        return this.f9548m;
    }

    /* renamed from: N */
    public void mo9998N(Canvas canvas, boolean z) {
        if (this.f9551p != 0.0f || z) {
            canvas.restore();
        }
    }

    /* renamed from: O */
    public Point mo9999O(int i, int i2, Point point) {
        return m13074d(i, i2, point, this.f9540e, this.f9551p != 0.0f);
    }

    /* renamed from: P */
    public void mo10000P(Canvas canvas, boolean z, boolean z2) {
        if (this.f9551p != 0.0f || z2) {
            canvas.save();
            canvas.concat(z ? this.f9540e : this.f9541f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public boolean mo10001Q(C2875d dVar) {
        if (dVar.getMapScrollX() == this.f9538c && dVar.getMapScrollY() == this.f9539d) {
            return false;
        }
        dVar.mo9884L(this.f9538c, this.f9539d);
        return true;
    }

    /* renamed from: R */
    public C3495x mo10002R(int i, int i2, C3495x xVar) {
        if (xVar == null) {
            xVar = new C3495x();
        }
        xVar.f11364a = mo10016j(mo10028z(i), this.f9547l);
        xVar.f11365b = mo10016j(mo9987A(i2), this.f9548m);
        return xVar;
    }

    /* renamed from: S */
    public Point mo10003S(C2491a aVar, Point point) {
        return mo10004T(aVar, point, false);
    }

    /* renamed from: T */
    public Point mo10004T(C2491a aVar, Point point, boolean z) {
        if (point == null) {
            point = new Point();
        }
        point.x = C3468d0.m15232Q(mo10022r(aVar.mo9100l(), z));
        point.y = C3468d0.m15232Q(mo10024u(aVar.mo9099e(), z));
        return point;
    }

    /* renamed from: U */
    public C3495x mo10005U(double d, double d2, C3495x xVar) {
        return mo10006V(d, d2, true, xVar);
    }

    /* renamed from: V */
    public C3495x mo10006V(double d, double d2, boolean z, C3495x xVar) {
        return this.f9553r.mo11403v(d, d2, 1.15292150460684698E18d, xVar, z);
    }

    /* renamed from: W */
    public Point mo10007W(int i, int i2, Point point) {
        return m13074d(i, i2, point, this.f9541f, this.f9551p != 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10008a(double d, double d2, boolean z, int i) {
        long j;
        double d3 = d2;
        long j2 = 0;
        if (z) {
            j = m13072G(mo10023t(d), mo10023t(d3), this.f9549n, this.f9546k.height(), i);
        } else {
            long G = m13072G(mo10021q(d), mo10021q(d3), this.f9549n, this.f9546k.width(), i);
            j = 0;
            j2 = G;
        }
        mo10009b(j2, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10009b(long j, long j2) {
        if (j != 0 || j2 != 0) {
            this.f9536a += j;
            this.f9537b += j2;
            this.f9538c -= j;
            this.f9539d -= j2;
            m13073M();
        }
    }

    /* renamed from: c */
    public void mo10010c(C2491a aVar, PointF pointF) {
        if (pointF != null && aVar != null) {
            Point W = mo10007W((int) pointF.x, (int) pointF.y, (Point) null);
            Point S = mo10003S(aVar, (Point) null);
            mo10009b((long) (W.x - S.x), (long) (W.y - S.y));
        }
    }

    /* renamed from: e */
    public void mo10011e() {
    }

    /* renamed from: f */
    public C2491a mo10012f(int i, int i2) {
        return mo10014h(i, i2, (C3472f) null, false);
    }

    /* renamed from: g */
    public C2491a mo10013g(int i, int i2, C3472f fVar) {
        return mo10014h(i, i2, fVar, false);
    }

    /* renamed from: h */
    public C2491a mo10014h(int i, int i2, C3472f fVar, boolean z) {
        return this.f9553r.mo11394k(mo10016j(mo10028z(i), this.f9547l), mo10016j(mo9987A(i2), this.f9548m), this.f9549n, fVar, this.f9547l || z, this.f9548m || z);
    }

    /* renamed from: i */
    public C3457a mo10015i() {
        return this.f9543h;
    }

    /* renamed from: j */
    public long mo10016j(long j, boolean z) {
        return this.f9553r.mo11393i(j, this.f9549n, z);
    }

    /* renamed from: l */
    public C3472f mo10017l() {
        return this.f9552q;
    }

    /* renamed from: m */
    public int mo10018m() {
        return this.f9546k.height();
    }

    /* renamed from: n */
    public Rect mo10019n() {
        return this.f9546k;
    }

    /* renamed from: o */
    public Matrix mo10020o() {
        return this.f9541f;
    }

    /* renamed from: q */
    public long mo10021q(double d) {
        return m13077s(this.f9553r.mo11405y(d, this.f9549n, false), false);
    }

    /* renamed from: r */
    public long mo10022r(double d, boolean z) {
        return m13077s(this.f9553r.mo11405y(d, this.f9549n, this.f9547l || z), this.f9547l);
    }

    /* renamed from: t */
    public long mo10023t(double d) {
        return m13078v(this.f9553r.mo11406z(d, this.f9549n, false), false);
    }

    /* renamed from: u */
    public long mo10024u(double d, boolean z) {
        return m13078v(this.f9553r.mo11406z(d, this.f9549n, this.f9548m || z), this.f9548m);
    }

    /* renamed from: w */
    public C3495x mo10025w(C3495x xVar, double d, boolean z, C3495x xVar2) {
        if (xVar2 == null) {
            xVar2 = new C3495x();
        }
        double d2 = (double) xVar.f11364a;
        Double.isNaN(d2);
        xVar2.f11364a = m13077s((long) (d2 / d), z);
        double d3 = (double) xVar.f11365b;
        Double.isNaN(d3);
        xVar2.f11365b = m13078v((long) (d3 / d), z);
        return xVar2;
    }

    /* renamed from: x */
    public long mo10026x(int i) {
        return C3468d0.m15242w(i, this.f9550o);
    }

    /* renamed from: y */
    public C3496y mo10027y(C3496y yVar) {
        if (yVar == null) {
            yVar = new C3496y();
        }
        Rect rect = this.f9546k;
        int i = rect.left;
        float f = (float) i;
        int i2 = rect.right;
        float f2 = (float) i2;
        int i3 = rect.top;
        float f3 = (float) i3;
        int i4 = rect.bottom;
        float f4 = (float) i4;
        if (this.f9551p != 0.0f) {
            float[] fArr = {(float) i, (float) i3, (float) i2, (float) i4, (float) i, (float) i4, (float) i2, (float) i3};
            this.f9541f.mapPoints(fArr);
            for (int i5 = 0; i5 < 8; i5 += 2) {
                if (f > fArr[i5]) {
                    f = fArr[i5];
                }
                if (f2 < fArr[i5]) {
                    f2 = fArr[i5];
                }
                int i6 = i5 + 1;
                if (f3 > fArr[i6]) {
                    f3 = fArr[i6];
                }
                if (f4 < fArr[i6]) {
                    f4 = fArr[i6];
                }
            }
        }
        yVar.f11366a = mo10028z((int) f);
        yVar.f11367b = mo9987A((int) f3);
        yVar.f11368c = mo10028z((int) f2);
        yVar.f11369d = mo9987A((int) f4);
        return yVar;
    }

    /* renamed from: z */
    public long mo10028z(int i) {
        return ((long) i) - this.f9536a;
    }
}
