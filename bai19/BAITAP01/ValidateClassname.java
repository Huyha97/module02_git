package bai19.BAITAP01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassname {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String CLASS_NAME_REGEX = "^[A|C|P][0-9]{4}[G|H|I|K|L|M]$";

    public ValidateClassname() {
        pattern = Pattern.compile(CLASS_NAME_REGEX);
    }

    public boolean validate (String string) {
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
}

