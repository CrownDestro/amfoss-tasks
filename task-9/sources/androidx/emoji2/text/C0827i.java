package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.core.util.C0612h;

/* renamed from: androidx.emoji2.text.i */
public abstract class C0827i extends ReplacementSpan {

    /* renamed from: d */
    private final Paint.FontMetricsInt f2903d = new Paint.FontMetricsInt();

    /* renamed from: e */
    private final C0823g f2904e;

    /* renamed from: f */
    private short f2905f = -1;

    /* renamed from: g */
    private short f2906g = -1;

    /* renamed from: h */
    private float f2907h = 1.0f;

    C0827i(C0823g gVar) {
        C0612h.m2671h(gVar, "metadata cannot be null");
        this.f2904e = gVar;
    }

    /* renamed from: a */
    public final C0823g mo3133a() {
        return this.f2904e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo3134b() {
        return this.f2905f;
    }

    public int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f2903d);
        Paint.FontMetricsInt fontMetricsInt2 = this.f2903d;
        this.f2907h = (((float) Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent)) * 1.0f) / ((float) this.f2904e.mo3121e());
        this.f2906g = (short) ((int) (((float) this.f2904e.mo3121e()) * this.f2907h));
        short i3 = (short) ((int) (((float) this.f2904e.mo3124i()) * this.f2907h));
        this.f2905f = i3;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f2903d;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return i3;
    }
}
