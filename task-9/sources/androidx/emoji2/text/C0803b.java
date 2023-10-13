package androidx.emoji2.text;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.emoji2.text.b */
class C0803b {

    /* renamed from: androidx.emoji2.text.b$a */
    static class C0804a {
        /* renamed from: a */
        public static Handler m3605a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* renamed from: b */
    static ThreadPoolExecutor m3602b(String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new C0802a(str));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ Thread m3603c(String str, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setPriority(10);
        return thread;
    }

    /* renamed from: d */
    static Handler m3604d() {
        return Build.VERSION.SDK_INT >= 28 ? C0804a.m3605a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper());
    }
}
