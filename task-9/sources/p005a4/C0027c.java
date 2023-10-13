package p005a4;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p041f3.C1924k;
import p127t2.C3187s;
import p140v3.C3423b;

/* renamed from: a4.c */
public final class C0027c {

    /* renamed from: a */
    private static final C0028a f115a = new C0028a();

    /* renamed from: b */
    private static final String[] f116b;

    /* renamed from: c */
    private static final DateFormat[] f117c;

    /* renamed from: a4.c$a */
    public static final class C0028a extends ThreadLocal<DateFormat> {
        C0028a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(C3423b.f11237f);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f116b = strArr;
        f117c = new DateFormat[strArr.length];
    }

    /* renamed from: a */
    public static final Date m89a(String str) {
        C1924k.m9142h(str, "$this$toHttpDateOrNull");
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = ((DateFormat) f115a.get()).parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        String[] strArr = f116b;
        synchronized (strArr) {
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                DateFormat[] dateFormatArr = f117c;
                DateFormat dateFormat = dateFormatArr[i];
                SimpleDateFormat simpleDateFormat = dateFormat;
                if (dateFormat == null) {
                    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(f116b[i], Locale.US);
                    simpleDateFormat2.setTimeZone(C3423b.f11237f);
                    dateFormatArr[i] = simpleDateFormat2;
                    simpleDateFormat = simpleDateFormat2;
                }
                parsePosition.setIndex(0);
                Date parse2 = simpleDateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
            }
            C3187s sVar = C3187s.f10561a;
            return null;
        }
    }

    /* renamed from: b */
    public static final String m90b(Date date) {
        C1924k.m9142h(date, "$this$toHttpDateString");
        String format = ((DateFormat) f115a.get()).format(date);
        C1924k.m9137c(format, "STANDARD_DATE_FORMAT.get().format(this)");
        return format;
    }
}
