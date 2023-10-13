package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;

/* renamed from: androidx.emoji2.text.o */
public final class C0840o extends C0827i {

    /* renamed from: i */
    private static Paint f2933i;

    public C0840o(C0823g gVar) {
        super(gVar);
    }

    /* renamed from: c */
    private static Paint m3739c() {
        if (f2933i == null) {
            TextPaint textPaint = new TextPaint();
            f2933i = textPaint;
            textPaint.setColor(C0811e.m3624b().mo3095c());
            f2933i.setStyle(Paint.Style.FILL);
        }
        return f2933i;
    }

    public void draw(Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (C0811e.m3624b().mo3097i()) {
            canvas.drawRect(f, (float) i3, f + ((float) mo3134b()), (float) i5, m3739c());
        }
        mo3133a().mo3117a(canvas, f, (float) i4, paint);
    }
}
