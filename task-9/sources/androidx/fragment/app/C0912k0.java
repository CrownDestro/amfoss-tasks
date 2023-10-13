package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* renamed from: androidx.fragment.app.k0 */
final class C0912k0 extends Writer {

    /* renamed from: d */
    private final String f3212d;

    /* renamed from: e */
    private StringBuilder f3213e = new StringBuilder(128);

    C0912k0(String str) {
        this.f3212d = str;
    }

    /* renamed from: a */
    private void m4123a() {
        if (this.f3213e.length() > 0) {
            Log.d(this.f3212d, this.f3213e.toString());
            StringBuilder sb = this.f3213e;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        m4123a();
    }

    public void flush() {
        m4123a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                m4123a();
            } else {
                this.f3213e.append(c);
            }
        }
    }
}
