package p042f4;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import p021c4.C1311e;
import p041f3.C1924k;
import p134u3.C3288b0;
import p158y3.C3578e;

/* renamed from: f4.c */
public final class C1941c {

    /* renamed from: a */
    private static final CopyOnWriteArraySet<Logger> f6911a = new CopyOnWriteArraySet<>();

    /* renamed from: b */
    private static final Map<String, String> f6912b;

    /* renamed from: c */
    public static final C1941c f6913c = new C1941c();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package packageR = C3288b0.class.getPackage();
        C1924k.m9137c(packageR, "OkHttpClient::class.java.`package`");
        String name = packageR.getName();
        C1924k.m9137c(name, "OkHttpClient::class.java.`package`.name");
        linkedHashMap.put(name, "OkHttp");
        String name2 = C3288b0.class.getName();
        C1924k.m9137c(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = C1311e.class.getName();
        C1924k.m9137c(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = C3578e.class.getName();
        C1924k.m9137c(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        f6912b = C3248c0.m14291i(linkedHashMap);
    }

    private C1941c() {
    }

    /* renamed from: c */
    private final void m9191c(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (f6911a.add(logger)) {
            C1924k.m9137c(logger, "logger");
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(C1942d.f6914a);
        }
    }

    /* renamed from: d */
    private final String m9192d(String str) {
        String str2 = f6912b.get(str);
        return str2 != null ? str2 : str;
    }

    /* renamed from: a */
    public final void mo7691a(String str, int i, String str2, Throwable th) {
        int min;
        C1924k.m9142h(str, "loggerName");
        C1924k.m9142h(str2, "message");
        String d = m9192d(str);
        if (Log.isLoggable(d, i)) {
            if (th != null) {
                str2 = str2 + "\n" + Log.getStackTraceString(th);
            }
            int i2 = 0;
            int length = str2.length();
            while (i2 < length) {
                int Q = C2647q.m12012Q(str2, 10, i2, false, 4, (Object) null);
                if (Q == -1) {
                    Q = length;
                }
                while (true) {
                    min = Math.min(Q, i2 + 4000);
                    String substring = str2.substring(i2, min);
                    C1924k.m9137c(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Log.println(i, d, substring);
                    if (min >= Q) {
                        break;
                    }
                    i2 = min;
                }
                i2 = min + 1;
            }
        }
    }

    /* renamed from: b */
    public final void mo7692b() {
        for (Map.Entry next : f6912b.entrySet()) {
            m9191c((String) next.getKey(), (String) next.getValue());
        }
    }
}
