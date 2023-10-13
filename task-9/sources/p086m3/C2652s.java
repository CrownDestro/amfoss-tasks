package p086m3;

import p041f3.C1924k;

/* renamed from: m3.s */
class C2652s extends C2651r {
    /* renamed from: B0 */
    public static final String m12054B0(String str, int i) {
        C1924k.m9141g(str, "<this>");
        if (i >= 0) {
            String substring = str.substring(C2331f.m10818d(i, str.length()));
            C1924k.m9140f(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }
}
