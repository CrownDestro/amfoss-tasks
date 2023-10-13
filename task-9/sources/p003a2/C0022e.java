package p003a2;

import android.os.Handler;
import android.os.Looper;
import p003a2.C0014c;
import p121s2.C3111a;

/* renamed from: a2.e */
public class C0022e implements C0014c.C0016b {

    /* renamed from: a */
    private final Handler f110a = C3111a.m13852a(Looper.getMainLooper());

    /* renamed from: a */
    public void mo55a(Runnable runnable) {
        this.f110a.post(runnable);
    }
}
