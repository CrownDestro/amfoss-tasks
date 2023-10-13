package p072k1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import p119s0.C3105k;

/* renamed from: k1.k */
public class C2366k {

    /* renamed from: m */
    public static final C2355c f8166m = new C2364i(0.5f);

    /* renamed from: a */
    C2356d f8167a;

    /* renamed from: b */
    C2356d f8168b;

    /* renamed from: c */
    C2356d f8169c;

    /* renamed from: d */
    C2356d f8170d;

    /* renamed from: e */
    C2355c f8171e;

    /* renamed from: f */
    C2355c f8172f;

    /* renamed from: g */
    C2355c f8173g;

    /* renamed from: h */
    C2355c f8174h;

    /* renamed from: i */
    C2358f f8175i;

    /* renamed from: j */
    C2358f f8176j;

    /* renamed from: k */
    C2358f f8177k;

    /* renamed from: l */
    C2358f f8178l;

    /* renamed from: k1.k$b */
    public static final class C2368b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C2356d f8179a = C2363h.m11007b();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C2356d f8180b = C2363h.m11007b();
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C2356d f8181c = C2363h.m11007b();
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C2356d f8182d = C2363h.m11007b();
        /* access modifiers changed from: private */

        /* renamed from: e */
        public C2355c f8183e = new C2353a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C2355c f8184f = new C2353a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: g */
        public C2355c f8185g = new C2353a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: h */
        public C2355c f8186h = new C2353a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: i */
        public C2358f f8187i = C2363h.m11008c();
        /* access modifiers changed from: private */

        /* renamed from: j */
        public C2358f f8188j = C2363h.m11008c();
        /* access modifiers changed from: private */

        /* renamed from: k */
        public C2358f f8189k = C2363h.m11008c();
        /* access modifiers changed from: private */

        /* renamed from: l */
        public C2358f f8190l = C2363h.m11008c();

        public C2368b() {
        }

        public C2368b(C2366k kVar) {
            this.f8179a = kVar.f8167a;
            this.f8180b = kVar.f8168b;
            this.f8181c = kVar.f8169c;
            this.f8182d = kVar.f8170d;
            this.f8183e = kVar.f8171e;
            this.f8184f = kVar.f8172f;
            this.f8185g = kVar.f8173g;
            this.f8186h = kVar.f8174h;
            this.f8187i = kVar.f8175i;
            this.f8188j = kVar.f8176j;
            this.f8189k = kVar.f8177k;
            this.f8190l = kVar.f8178l;
        }

        /* renamed from: n */
        private static float m11052n(C2356d dVar) {
            if (dVar instanceof C2365j) {
                return ((C2365j) dVar).f8165a;
            }
            if (dVar instanceof C2357e) {
                return ((C2357e) dVar).f8113a;
            }
            return -1.0f;
        }

        /* renamed from: A */
        public C2368b mo8883A(float f) {
            this.f8183e = new C2353a(f);
            return this;
        }

        /* renamed from: B */
        public C2368b mo8884B(C2355c cVar) {
            this.f8183e = cVar;
            return this;
        }

        /* renamed from: C */
        public C2368b mo8885C(int i, C2355c cVar) {
            return mo8886D(C2363h.m11006a(i)).mo8888F(cVar);
        }

        /* renamed from: D */
        public C2368b mo8886D(C2356d dVar) {
            this.f8180b = dVar;
            float n = m11052n(dVar);
            if (n != -1.0f) {
                mo8887E(n);
            }
            return this;
        }

        /* renamed from: E */
        public C2368b mo8887E(float f) {
            this.f8184f = new C2353a(f);
            return this;
        }

        /* renamed from: F */
        public C2368b mo8888F(C2355c cVar) {
            this.f8184f = cVar;
            return this;
        }

        /* renamed from: m */
        public C2366k mo8889m() {
            return new C2366k(this);
        }

        /* renamed from: o */
        public C2368b mo8890o(float f) {
            return mo8883A(f).mo8887E(f).mo8898w(f).mo8894s(f);
        }

        /* renamed from: p */
        public C2368b mo8891p(C2355c cVar) {
            return mo8884B(cVar).mo8888F(cVar).mo8899x(cVar).mo8895t(cVar);
        }

        /* renamed from: q */
        public C2368b mo8892q(int i, C2355c cVar) {
            return mo8893r(C2363h.m11006a(i)).mo8895t(cVar);
        }

        /* renamed from: r */
        public C2368b mo8893r(C2356d dVar) {
            this.f8182d = dVar;
            float n = m11052n(dVar);
            if (n != -1.0f) {
                mo8894s(n);
            }
            return this;
        }

        /* renamed from: s */
        public C2368b mo8894s(float f) {
            this.f8186h = new C2353a(f);
            return this;
        }

        /* renamed from: t */
        public C2368b mo8895t(C2355c cVar) {
            this.f8186h = cVar;
            return this;
        }

        /* renamed from: u */
        public C2368b mo8896u(int i, C2355c cVar) {
            return mo8897v(C2363h.m11006a(i)).mo8899x(cVar);
        }

        /* renamed from: v */
        public C2368b mo8897v(C2356d dVar) {
            this.f8181c = dVar;
            float n = m11052n(dVar);
            if (n != -1.0f) {
                mo8898w(n);
            }
            return this;
        }

        /* renamed from: w */
        public C2368b mo8898w(float f) {
            this.f8185g = new C2353a(f);
            return this;
        }

        /* renamed from: x */
        public C2368b mo8899x(C2355c cVar) {
            this.f8185g = cVar;
            return this;
        }

        /* renamed from: y */
        public C2368b mo8900y(int i, C2355c cVar) {
            return mo8901z(C2363h.m11006a(i)).mo8884B(cVar);
        }

        /* renamed from: z */
        public C2368b mo8901z(C2356d dVar) {
            this.f8179a = dVar;
            float n = m11052n(dVar);
            if (n != -1.0f) {
                mo8883A(n);
            }
            return this;
        }
    }

    /* renamed from: k1.k$c */
    public interface C2369c {
        /* renamed from: a */
        C2355c mo8862a(C2355c cVar);
    }

    public C2366k() {
        this.f8167a = C2363h.m11007b();
        this.f8168b = C2363h.m11007b();
        this.f8169c = C2363h.m11007b();
        this.f8170d = C2363h.m11007b();
        this.f8171e = new C2353a(0.0f);
        this.f8172f = new C2353a(0.0f);
        this.f8173g = new C2353a(0.0f);
        this.f8174h = new C2353a(0.0f);
        this.f8175i = C2363h.m11008c();
        this.f8176j = C2363h.m11008c();
        this.f8177k = C2363h.m11008c();
        this.f8178l = C2363h.m11008c();
    }

    private C2366k(C2368b bVar) {
        this.f8167a = bVar.f8179a;
        this.f8168b = bVar.f8180b;
        this.f8169c = bVar.f8181c;
        this.f8170d = bVar.f8182d;
        this.f8171e = bVar.f8183e;
        this.f8172f = bVar.f8184f;
        this.f8173g = bVar.f8185g;
        this.f8174h = bVar.f8186h;
        this.f8175i = bVar.f8187i;
        this.f8176j = bVar.f8188j;
        this.f8177k = bVar.f8189k;
        this.f8178l = bVar.f8190l;
    }

    /* renamed from: a */
    public static C2368b m11015a() {
        return new C2368b();
    }

    /* renamed from: b */
    public static C2368b m11016b(Context context, int i, int i2) {
        return m11017c(context, i, i2, 0);
    }

    /* renamed from: c */
    private static C2368b m11017c(Context context, int i, int i2, int i3) {
        return m11018d(context, i, i2, new C2353a((float) i3));
    }

    /* renamed from: d */
    private static C2368b m11018d(Context context, int i, int i2, C2355c cVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(C3105k.f10289h4);
        try {
            int i3 = obtainStyledAttributes.getInt(C3105k.f10297i4, 0);
            int i4 = obtainStyledAttributes.getInt(C3105k.f10321l4, i3);
            int i5 = obtainStyledAttributes.getInt(C3105k.f10329m4, i3);
            int i6 = obtainStyledAttributes.getInt(C3105k.f10313k4, i3);
            int i7 = obtainStyledAttributes.getInt(C3105k.f10305j4, i3);
            C2355c m = m11022m(obtainStyledAttributes, C3105k.f10337n4, cVar);
            C2355c m2 = m11022m(obtainStyledAttributes, C3105k.f10361q4, m);
            C2355c m3 = m11022m(obtainStyledAttributes, C3105k.f10369r4, m);
            C2355c m4 = m11022m(obtainStyledAttributes, C3105k.f10353p4, m);
            return new C2368b().mo8900y(i4, m2).mo8885C(i5, m3).mo8896u(i6, m4).mo8892q(i7, m11022m(obtainStyledAttributes, C3105k.f10345o4, m));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: e */
    public static C2368b m11019e(Context context, AttributeSet attributeSet, int i, int i2) {
        return m11020f(context, attributeSet, i, i2, 0);
    }

    /* renamed from: f */
    public static C2368b m11020f(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        return m11021g(context, attributeSet, i, i2, new C2353a((float) i3));
    }

    /* renamed from: g */
    public static C2368b m11021g(Context context, AttributeSet attributeSet, int i, int i2, C2355c cVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3105k.f10328m3, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(C3105k.f10336n3, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(C3105k.f10344o3, 0);
        obtainStyledAttributes.recycle();
        return m11018d(context, resourceId, resourceId2, cVar);
    }

    /* renamed from: m */
    private static C2355c m11022m(TypedArray typedArray, int i, C2355c cVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return cVar;
        }
        int i2 = peekValue.type;
        return i2 == 5 ? new C2353a((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new C2364i(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    /* renamed from: h */
    public C2358f mo8866h() {
        return this.f8177k;
    }

    /* renamed from: i */
    public C2356d mo8867i() {
        return this.f8170d;
    }

    /* renamed from: j */
    public C2355c mo8868j() {
        return this.f8174h;
    }

    /* renamed from: k */
    public C2356d mo8869k() {
        return this.f8169c;
    }

    /* renamed from: l */
    public C2355c mo8870l() {
        return this.f8173g;
    }

    /* renamed from: n */
    public C2358f mo8871n() {
        return this.f8178l;
    }

    /* renamed from: o */
    public C2358f mo8872o() {
        return this.f8176j;
    }

    /* renamed from: p */
    public C2358f mo8873p() {
        return this.f8175i;
    }

    /* renamed from: q */
    public C2356d mo8874q() {
        return this.f8167a;
    }

    /* renamed from: r */
    public C2355c mo8875r() {
        return this.f8171e;
    }

    /* renamed from: s */
    public C2356d mo8876s() {
        return this.f8168b;
    }

    /* renamed from: t */
    public C2355c mo8877t() {
        return this.f8172f;
    }

    /* renamed from: u */
    public boolean mo8878u(RectF rectF) {
        Class<C2358f> cls = C2358f.class;
        boolean z = this.f8178l.getClass().equals(cls) && this.f8176j.getClass().equals(cls) && this.f8175i.getClass().equals(cls) && this.f8177k.getClass().equals(cls);
        float a = this.f8171e.mo8815a(rectF);
        return z && ((this.f8172f.mo8815a(rectF) > a ? 1 : (this.f8172f.mo8815a(rectF) == a ? 0 : -1)) == 0 && (this.f8174h.mo8815a(rectF) > a ? 1 : (this.f8174h.mo8815a(rectF) == a ? 0 : -1)) == 0 && (this.f8173g.mo8815a(rectF) > a ? 1 : (this.f8173g.mo8815a(rectF) == a ? 0 : -1)) == 0) && ((this.f8168b instanceof C2365j) && (this.f8167a instanceof C2365j) && (this.f8169c instanceof C2365j) && (this.f8170d instanceof C2365j));
    }

    /* renamed from: v */
    public C2368b mo8879v() {
        return new C2368b(this);
    }

    /* renamed from: w */
    public C2366k mo8880w(float f) {
        return mo8879v().mo8890o(f).mo8889m();
    }

    /* renamed from: x */
    public C2366k mo8881x(C2355c cVar) {
        return mo8879v().mo8891p(cVar).mo8889m();
    }

    /* renamed from: y */
    public C2366k mo8882y(C2369c cVar) {
        return mo8879v().mo8884B(cVar.mo8862a(mo8875r())).mo8888F(cVar.mo8862a(mo8877t())).mo8895t(cVar.mo8862a(mo8868j())).mo8899x(cVar.mo8862a(mo8870l())).mo8889m();
    }
}
