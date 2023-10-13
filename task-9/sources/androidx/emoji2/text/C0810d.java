package androidx.emoji2.text;

import android.os.Build;
import android.text.TextPaint;
import androidx.core.graphics.C0527f;
import androidx.emoji2.text.C0811e;

/* renamed from: androidx.emoji2.text.d */
class C0810d implements C0811e.C0816d {

    /* renamed from: b */
    private static final ThreadLocal<StringBuilder> f2849b = new ThreadLocal<>();

    /* renamed from: a */
    private final TextPaint f2850a;

    C0810d() {
        TextPaint textPaint = new TextPaint();
        this.f2850a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    /* renamed from: b */
    private static StringBuilder m3621b() {
        ThreadLocal<StringBuilder> threadLocal = f2849b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return threadLocal.get();
    }

    /* renamed from: a */
    public boolean mo3094a(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 23 && i3 > i4) {
            return false;
        }
        StringBuilder b = m3621b();
        b.setLength(0);
        while (i < i2) {
            b.append(charSequence.charAt(i));
            i++;
        }
        return C0527f.m2413a(this.f2850a, b.toString());
    }
}
