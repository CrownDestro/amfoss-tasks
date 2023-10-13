package p072k1;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* renamed from: k1.l */
public class C2370l {

    /* renamed from: a */
    private final C2374m[] f8191a = new C2374m[4];

    /* renamed from: b */
    private final Matrix[] f8192b = new Matrix[4];

    /* renamed from: c */
    private final Matrix[] f8193c = new Matrix[4];

    /* renamed from: d */
    private final PointF f8194d = new PointF();

    /* renamed from: e */
    private final Path f8195e = new Path();

    /* renamed from: f */
    private final Path f8196f = new Path();

    /* renamed from: g */
    private final C2374m f8197g = new C2374m();

    /* renamed from: h */
    private final float[] f8198h = new float[2];

    /* renamed from: i */
    private final float[] f8199i = new float[2];

    /* renamed from: j */
    private final Path f8200j = new Path();

    /* renamed from: k */
    private final Path f8201k = new Path();

    /* renamed from: l */
    private boolean f8202l = true;

    /* renamed from: k1.l$a */
    private static class C2371a {

        /* renamed from: a */
        static final C2370l f8203a = new C2370l();
    }

    /* renamed from: k1.l$b */
    public interface C2372b {
        /* renamed from: a */
        void mo8860a(C2374m mVar, Matrix matrix, int i);

        /* renamed from: b */
        void mo8861b(C2374m mVar, Matrix matrix, int i);
    }

    /* renamed from: k1.l$c */
    static final class C2373c {

        /* renamed from: a */
        public final C2366k f8204a;

        /* renamed from: b */
        public final Path f8205b;

        /* renamed from: c */
        public final RectF f8206c;

        /* renamed from: d */
        public final C2372b f8207d;

        /* renamed from: e */
        public final float f8208e;

        C2373c(C2366k kVar, float f, RectF rectF, C2372b bVar, Path path) {
            this.f8207d = bVar;
            this.f8204a = kVar;
            this.f8208e = f;
            this.f8206c = rectF;
            this.f8205b = path;
        }
    }

    public C2370l() {
        for (int i = 0; i < 4; i++) {
            this.f8191a[i] = new C2374m();
            this.f8192b[i] = new Matrix();
            this.f8193c[i] = new Matrix();
        }
    }

    /* renamed from: a */
    private float m11073a(int i) {
        return (float) (((i + 1) % 4) * 90);
    }

    /* renamed from: b */
    private void m11074b(C2373c cVar, int i) {
        this.f8198h[0] = this.f8191a[i].mo8910k();
        this.f8198h[1] = this.f8191a[i].mo8911l();
        this.f8192b[i].mapPoints(this.f8198h);
        Path path = cVar.f8205b;
        float[] fArr = this.f8198h;
        if (i == 0) {
            path.moveTo(fArr[0], fArr[1]);
        } else {
            path.lineTo(fArr[0], fArr[1]);
        }
        this.f8191a[i].mo8905d(this.f8192b[i], cVar.f8205b);
        C2372b bVar = cVar.f8207d;
        if (bVar != null) {
            bVar.mo8860a(this.f8191a[i], this.f8192b[i], i);
        }
    }

    /* renamed from: c */
    private void m11075c(C2373c cVar, int i) {
        Path path;
        Matrix matrix;
        C2374m mVar;
        int i2 = (i + 1) % 4;
        this.f8198h[0] = this.f8191a[i].mo8908i();
        this.f8198h[1] = this.f8191a[i].mo8909j();
        this.f8192b[i].mapPoints(this.f8198h);
        this.f8199i[0] = this.f8191a[i2].mo8910k();
        this.f8199i[1] = this.f8191a[i2].mo8911l();
        this.f8192b[i2].mapPoints(this.f8199i);
        float[] fArr = this.f8198h;
        float f = fArr[0];
        float[] fArr2 = this.f8199i;
        float max = Math.max(((float) Math.hypot((double) (f - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, 0.0f);
        float i3 = m11079i(cVar.f8206c, i);
        this.f8197g.mo8913n(0.0f, 0.0f);
        C2358f j = m11080j(i, cVar.f8204a);
        j.mo5493d(max, i3, cVar.f8208e, this.f8197g);
        this.f8200j.reset();
        this.f8197g.mo8905d(this.f8193c[i], this.f8200j);
        if (!this.f8202l || (!j.mo8822b() && !m11082l(this.f8200j, i) && !m11082l(this.f8200j, i2))) {
            mVar = this.f8197g;
            matrix = this.f8193c[i];
            path = cVar.f8205b;
        } else {
            Path path2 = this.f8200j;
            path2.op(path2, this.f8196f, Path.Op.DIFFERENCE);
            this.f8198h[0] = this.f8197g.mo8910k();
            this.f8198h[1] = this.f8197g.mo8911l();
            this.f8193c[i].mapPoints(this.f8198h);
            Path path3 = this.f8195e;
            float[] fArr3 = this.f8198h;
            path3.moveTo(fArr3[0], fArr3[1]);
            mVar = this.f8197g;
            matrix = this.f8193c[i];
            path = this.f8195e;
        }
        mVar.mo8905d(matrix, path);
        C2372b bVar = cVar.f8207d;
        if (bVar != null) {
            bVar.mo8861b(this.f8197g, this.f8193c[i], i);
        }
    }

    /* renamed from: f */
    private void m11076f(int i, RectF rectF, PointF pointF) {
        float f;
        float f2;
        float f3;
        if (i == 1) {
            f3 = rectF.right;
            f2 = rectF.bottom;
        } else if (i != 2) {
            f = i != 3 ? rectF.right : rectF.left;
            f2 = rectF.top;
        } else {
            f3 = rectF.left;
            f2 = rectF.bottom;
        }
        pointF.set(f, f2);
    }

    /* renamed from: g */
    private C2355c m11077g(int i, C2366k kVar) {
        return i != 1 ? i != 2 ? i != 3 ? kVar.mo8877t() : kVar.mo8875r() : kVar.mo8868j() : kVar.mo8870l();
    }

    /* renamed from: h */
    private C2356d m11078h(int i, C2366k kVar) {
        return i != 1 ? i != 2 ? i != 3 ? kVar.mo8876s() : kVar.mo8874q() : kVar.mo8867i() : kVar.mo8869k();
    }

    /* renamed from: i */
    private float m11079i(RectF rectF, int i) {
        float centerX;
        float f;
        float[] fArr = this.f8198h;
        C2374m[] mVarArr = this.f8191a;
        fArr[0] = mVarArr[i].f8211c;
        fArr[1] = mVarArr[i].f8212d;
        this.f8192b[i].mapPoints(fArr);
        if (i == 1 || i == 3) {
            centerX = rectF.centerX();
            f = this.f8198h[0];
        } else {
            centerX = rectF.centerY();
            f = this.f8198h[1];
        }
        return Math.abs(centerX - f);
    }

    /* renamed from: j */
    private C2358f m11080j(int i, C2366k kVar) {
        return i != 1 ? i != 2 ? i != 3 ? kVar.mo8872o() : kVar.mo8873p() : kVar.mo8871n() : kVar.mo8866h();
    }

    /* renamed from: k */
    public static C2370l m11081k() {
        return C2371a.f8203a;
    }

    /* renamed from: l */
    private boolean m11082l(Path path, int i) {
        this.f8201k.reset();
        this.f8191a[i].mo8905d(this.f8192b[i], this.f8201k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f8201k.computeBounds(rectF, true);
        path.op(this.f8201k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    /* renamed from: m */
    private void m11083m(C2373c cVar, int i) {
        m11078h(i, cVar.f8204a).mo8821b(this.f8191a[i], 90.0f, cVar.f8208e, cVar.f8206c, m11077g(i, cVar.f8204a));
        float a = m11073a(i);
        this.f8192b[i].reset();
        m11076f(i, cVar.f8206c, this.f8194d);
        Matrix matrix = this.f8192b[i];
        PointF pointF = this.f8194d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f8192b[i].preRotate(a);
    }

    /* renamed from: n */
    private void m11084n(int i) {
        this.f8198h[0] = this.f8191a[i].mo8908i();
        this.f8198h[1] = this.f8191a[i].mo8909j();
        this.f8192b[i].mapPoints(this.f8198h);
        float a = m11073a(i);
        this.f8193c[i].reset();
        Matrix matrix = this.f8193c[i];
        float[] fArr = this.f8198h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f8193c[i].preRotate(a);
    }

    /* renamed from: d */
    public void mo8902d(C2366k kVar, float f, RectF rectF, Path path) {
        mo8903e(kVar, f, rectF, (C2372b) null, path);
    }

    /* renamed from: e */
    public void mo8903e(C2366k kVar, float f, RectF rectF, C2372b bVar, Path path) {
        path.rewind();
        this.f8195e.rewind();
        this.f8196f.rewind();
        this.f8196f.addRect(rectF, Path.Direction.CW);
        C2373c cVar = new C2373c(kVar, f, rectF, bVar, path);
        for (int i = 0; i < 4; i++) {
            m11083m(cVar, i);
            m11084n(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            m11074b(cVar, i2);
            m11075c(cVar, i2);
        }
        path.close();
        this.f8195e.close();
        if (!this.f8195e.isEmpty()) {
            path.op(this.f8195e, Path.Op.UNION);
        }
    }
}
