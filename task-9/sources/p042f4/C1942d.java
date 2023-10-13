package p042f4;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import p041f3.C1924k;

/* renamed from: f4.d */
public final class C1942d extends Handler {

    /* renamed from: a */
    public static final C1942d f6914a = new C1942d();

    private C1942d() {
    }

    public void close() {
    }

    public void flush() {
    }

    public void publish(LogRecord logRecord) {
        C1924k.m9142h(logRecord, "record");
        C1941c cVar = C1941c.f6913c;
        String loggerName = logRecord.getLoggerName();
        C1924k.m9137c(loggerName, "record.loggerName");
        int a = C1943e.m9196b(logRecord);
        String message = logRecord.getMessage();
        C1924k.m9137c(message, "record.message");
        cVar.mo7691a(loggerName, a, message, logRecord.getThrown());
    }
}
