package p072k1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p066j1.C2320a;

/* renamed from: k1.m */
public class C2374m {
    @Deprecated

    /* renamed from: a */
    public float f8209a;
    @Deprecated

    /* renamed from: b */
    public float f8210b;
    @Deprecated

    /* renamed from: c */
    public float f8211c;
    @Deprecated

    /* renamed from: d */
    public float f8212d;
    @Deprecated

    /* renamed from: e */
    public float f8213e;
    @Deprecated

    /* renamed from: f */
    public float f8214f;

    /* renamed from: g */
    private final List<C2380f> f8215g = new ArrayList();

    /* renamed from: h */
    private final List<C2381g> f8216h = new ArrayList();

    /* renamed from: i */
    private boolean f8217i;

    /* renamed from: k1.m$a */
    class C2375a extends C2381g {

        /* renamed from: c */
        final /* synthetic */ List f8218c;

        /* renamed from: d */
        final /* synthetic */ Matrix f8219d;

        C2375a(List list, Matrix matrix) {
            this.f8218c = list;
            this.f8219d = matrix;
        }

        /* renamed from: a */
        public void mo8915a(Matrix matrix, C2320a aVar, int i, Canvas canvas) {
            for (C2381g a : this.f8218c) {
                a.mo8915a(this.f8219d, aVar, i, canvas);
            }
        }
    }

    /* renamed from: k1.m$b */
    static class C2376b extends C2381g {

        /* renamed from: c */
        private final C2378d f8221c;

        public C2376b(C2378d dVar) {
            this.f8221c = dVar;
        }

        /* renamed from: a */
        public void mo8915a(Matrix matrix, C2320a aVar, int i, Canvas canvas) {
            float h = this.f8221c.m11125m();
            float i2 = this.f8221c.m11126n();
            aVar.mo8638a(canvas, matrix, new RectF(this.f8221c.m11123k(), this.f8221c.m11127o(), this.f8221c.m11124l(), this.f8221c.m11122j()), i, h, i2);
        }
    }

    /* renamed from: k1.m$c */
    static class C2377c extends C2381g {

        /* renamed from: c */
        private final C2379e f8222c;

        /* renamed from: d */
        private final float f8223d;

        /* renamed from: e */
        private final float f8224e;

        public C2377c(C2379e eVar, float f, float f2) {
            this.f8222c = eVar;
            this.f8223d = f;
            this.f8224e = f2;
        }

        /* renamed from: a */
        public void mo8915a(Matrix matrix, C2320a aVar, int i, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (this.f8222c.f8233c - this.f8224e), (double) (this.f8222c.f8232b - this.f8223d)), 0.0f);
            this.f8236a.set(matrix);
            this.f8236a.preTranslate(this.f8223d, this.f8224e);
            this.f8236a.preRotate(mo8916c());
            aVar.mo8639b(canvas, this.f8236a, rectF, i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public float mo8916c() {
            return (float) Math.toDegrees(Math.atan((double) ((this.f8222c.f8233c - this.f8224e) / (this.f8222c.f8232b - this.f8223d))));
        }
    }

    /* renamed from: k1.m$d */
    public static class C2378d extends C2380f {

        /* renamed from: h */
        private static final RectF f8225h = new RectF();
        @Deprecated

        /* renamed from: b */
        public float f8226b;
        @Deprecated

        /* renamed from: c */
        public float f8227c;
        @Deprecated

        /* renamed from: d */
        public float f8228d;
        @Deprecated

        /* renamed from: e */
        public float f8229e;
        @Deprecated

        /* renamed from: f */
        public float f8230f;
        @Deprecated

        /* renamed from: g */
        public float f8231g;

        public C2378d(float f, float f2, float f3, float f4) {
            m11129q(f);
            m11133u(f2);
            m11130r(f3);
            m11128p(f4);
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public float m11122j() {
            return this.f8229e;
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public float m11123k() {
            return this.f8226b;
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public float m11124l() {
            return this.f8228d;
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public float m11125m() {
            return this.f8230f;
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public float m11126n() {
            return this.f8231g;
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public float m11127o() {
            return this.f8227c;
        }

        /* renamed from: p */
        private void m11128p(float f) {
            this.f8229e = f;
        }

        /* renamed from: q */
        private void m11129q(float f) {
            this.f8226b = f;
        }

        /* renamed from: r */
        private void m11130r(float f) {
            this.f8228d = f;
        }

        /* access modifiers changed from: private */
        /* renamed from: s */
        public void m11131s(float f) {
            this.f8230f = f;
        }

        /* access modifiers changed from: private */
        /* renamed from: t */
        public void m11132t(float f) {
            this.f8231g = f;
        }

        /* renamed from: u */
        private void m11133u(float f) {
            this.f8227c = f;
        }

        /* renamed from: a */
        public void mo8917a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f8234a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f8225h;
            rectF.set(m11123k(), m11127o(), m11124l(), m11122j());
            path.arcTo(rectF, m11125m(), m11126n(), false);
            path.transform(matrix);
        }
    }

    /* renamed from: k1.m$e */
    public static class C2379e extends C2380f {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public float f8232b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public float f8233c;

        /* renamed from: a */
        public void mo8917a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f8234a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f8232b, this.f8233c);
            path.transform(matrix);
        }
    }

    /* renamed from: k1.m$f */
    public static abstract class C2380f {

        /* renamed from: a */
        protected final Matrix f8234a = new Matrix();

        /* renamed from: a */
        public abstract void mo8917a(Matrix matrix, Path path);
    }

    /* renamed from: k1.m$g */
    static abstract class C2381g {

        /* renamed from: b */
        static final Matrix f8235b = new Matrix();

        /* renamed from: a */
        final Matrix f8236a = new Matrix();

        C2381g() {
        }

        /* renamed from: a */
        public abstract void mo8915a(Matrix matrix, C2320a aVar, int i, Canvas canvas);

        /* renamed from: b */
        public final void mo8918b(C2320a aVar, int i, Canvas canvas) {
            mo8915a(f8235b, aVar, i, canvas);
        }
    }

    public C2374m() {
        mo8913n(0.0f, 0.0f);
    }

    /* renamed from: b */
    private void m11089b(float f) {
        if (m11091g() != f) {
            float g = ((f - m11091g()) + 360.0f) % 360.0f;
            if (g <= 180.0f) {
                C2378d dVar = new C2378d(mo8908i(), mo8909j(), mo8908i(), mo8909j());
                dVar.m11131s(m11091g());
                dVar.m11132t(g);
                this.f8216h.add(new C2376b(dVar));
                m11093p(f);
            }
        }
    }

    /* renamed from: c */
    private void m11090c(C2381g gVar, float f, float f2) {
        m11089b(f);
        this.f8216h.add(gVar);
        m11093p(f2);
    }

    /* renamed from: g */
    private float m11091g() {
        return this.f8213e;
    }

    /* renamed from: h */
    private float m11092h() {
        return this.f8214f;
    }

    /* renamed from: p */
    private void m11093p(float f) {
        this.f8213e = f;
    }

    /* renamed from: q */
    private void m11094q(float f) {
        this.f8214f = f;
    }

    /* renamed from: r */
    private void m11095r(float f) {
        this.f8211c = f;
    }

    /* renamed from: s */
    private void m11096s(float f) {
        this.f8212d = f;
    }

    /* renamed from: t */
    private void m11097t(float f) {
        this.f8209a = f;
    }

    /* renamed from: u */
    private void m11098u(float f) {
        this.f8210b = f;
    }

    /* renamed from: a */
    public void mo8904a(float f, float f2, float f3, float f4, float f5, float f6) {
        C2378d dVar = new C2378d(f, f2, f3, f4);
        dVar.m11131s(f5);
        dVar.m11132t(f6);
        this.f8215g.add(dVar);
        C2376b bVar = new C2376b(dVar);
        float f7 = f5 + f6;
        boolean z = f6 < 0.0f;
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        m11090c(bVar, f5, z ? (180.0f + f7) % 360.0f : f7);
        double d = (double) f7;
        m11095r(((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))));
        m11096s(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))));
    }

    /* renamed from: d */
    public void mo8905d(Matrix matrix, Path path) {
        int size = this.f8215g.size();
        for (int i = 0; i < size; i++) {
            this.f8215g.get(i).mo8917a(matrix, path);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo8906e() {
        return this.f8217i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C2381g mo8907f(Matrix matrix) {
        m11089b(m11092h());
        return new C2375a(new ArrayList(this.f8216h), new Matrix(matrix));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public float mo8908i() {
        return this.f8211c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public float mo8909j() {
        return this.f8212d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public float mo8910k() {
        return this.f8209a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public float mo8911l() {
        return this.f8210b;
    }

    /* renamed from: m */
    public void mo8912m(float f, float f2) {
        C2379e eVar = new C2379e();
        float unused = eVar.f8232b = f;
        float unused2 = eVar.f8233c = f2;
        this.f8215g.add(eVar);
        C2377c cVar = new C2377c(eVar, mo8908i(), mo8909j());
        m11090c(cVar, cVar.mo8916c() + 270.0f, cVar.mo8916c() + 270.0f);
        m11095r(f);
        m11096s(f2);
    }

    /* renamed from: n */
    public void mo8913n(float f, float f2) {
        mo8914o(f, f2, 270.0f, 0.0f);
    }

    /* renamed from: o */
    public void mo8914o(float f, float f2, float f3, float f4) {
        m11097t(f);
        m11098u(f2);
        m11095r(f);
        m11096s(f2);
        m11093p(f3);
        m11094q((f3 + f4) % 360.0f);
        this.f8215g.clear();
        this.f8216h.clear();
        this.f8217i = false;
    }
}
