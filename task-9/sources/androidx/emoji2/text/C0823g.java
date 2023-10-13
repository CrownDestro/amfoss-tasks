package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import p154y.C3549a;

/* renamed from: androidx.emoji2.text.g */
public class C0823g {

    /* renamed from: d */
    private static final ThreadLocal<C3549a> f2886d = new ThreadLocal<>();

    /* renamed from: a */
    private final int f2887a;

    /* renamed from: b */
    private final C0836m f2888b;

    /* renamed from: c */
    private volatile int f2889c = 0;

    C0823g(C0836m mVar, int i) {
        this.f2888b = mVar;
        this.f2887a = i;
    }

    /* renamed from: g */
    private C3549a m3662g() {
        ThreadLocal<C3549a> threadLocal = f2886d;
        C3549a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new C3549a();
            threadLocal.set(aVar);
        }
        this.f2888b.mo3151d().mo11623j(aVar, this.f2887a);
        return aVar;
    }

    /* renamed from: a */
    public void mo3117a(Canvas canvas, float f, float f2, Paint paint) {
        Typeface g = this.f2888b.mo3154g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(g);
        Canvas canvas2 = canvas;
        canvas2.drawText(this.f2888b.mo3150c(), this.f2887a * 2, 2, f, f2, paint);
        paint.setTypeface(typeface);
    }

    /* renamed from: b */
    public int mo3118b(int i) {
        return m3662g().mo11614h(i);
    }

    /* renamed from: c */
    public int mo3119c() {
        return m3662g().mo11615i();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    /* renamed from: d */
    public int mo3120d() {
        return this.f2889c;
    }

    /* renamed from: e */
    public short mo3121e() {
        return m3662g().mo11617k();
    }

    /* renamed from: f */
    public int mo3122f() {
        return m3662g().mo11618l();
    }

    /* renamed from: h */
    public short mo3123h() {
        return m3662g().mo11619m();
    }

    /* renamed from: i */
    public short mo3124i() {
        return m3662g().mo11620n();
    }

    /* renamed from: j */
    public boolean mo3125j() {
        return m3662g().mo11616j();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    /* renamed from: k */
    public void mo3126k(boolean z) {
        this.f2889c = z ? 2 : 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(mo3122f()));
        sb.append(", codepoints:");
        int c = mo3119c();
        for (int i = 0; i < c; i++) {
            sb.append(Integer.toHexString(mo3118b(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
