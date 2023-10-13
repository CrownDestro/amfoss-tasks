package p051h;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: h.d */
public class C1994d extends C1997e {

    /* renamed from: a */
    private final Object f6954a = new Object();

    /* renamed from: b */
    private final ExecutorService f6955b = Executors.newFixedThreadPool(4, new C1995a());

    /* renamed from: c */
    private volatile Handler f6956c;

    /* renamed from: h.d$a */
    class C1995a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f6957a = new AtomicInteger(0);

        C1995a() {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f6957a.getAndIncrement());
            return thread;
        }
    }

    /* renamed from: h.d$b */
    private static class C1996b {
        /* renamed from: a */
        public static Handler m9248a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* renamed from: d */
    private static Handler m9244d(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C1996b.m9248a(looper);
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    /* renamed from: a */
    public void mo7738a(Runnable runnable) {
        this.f6955b.execute(runnable);
    }

    /* renamed from: b */
    public boolean mo7739b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: c */
    public void mo7740c(Runnable runnable) {
        if (this.f6956c == null) {
            synchronized (this.f6954a) {
                if (this.f6956c == null) {
                    this.f6956c = m9244d(Looper.getMainLooper());
                }
            }
        }
        this.f6956c.post(runnable);
    }
}
