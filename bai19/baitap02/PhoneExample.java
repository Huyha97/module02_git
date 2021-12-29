package bai19.baitap02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneExample {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String PHONE_REGEX = "^\\(\\d{2}\\)\\s*-\\s*\\(0\\d{9}\\)";

    public PhoneExample() {
        pattern = pattern.compile(PHONE_REGEX);
    }

    public boolean validate(String regex) {
        CharSequence input;
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
