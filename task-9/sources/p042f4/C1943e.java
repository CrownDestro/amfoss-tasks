package p042f4;

import java.util.logging.Level;
import java.util.logging.LogRecord;

/* renamed from: f4.e */
public final class C1943e {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final int m9196b(LogRecord logRecord) {
        if (logRecord.getLevel().intValue() > Level.INFO.intValue()) {
            return 5;
        }
        return logRecord.getLevel().intValue() == Level.INFO.intValue() ? 4 : 3;
    }
}
