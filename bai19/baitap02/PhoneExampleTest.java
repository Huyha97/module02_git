package bai19.baitap02;

public class PhoneExampleTest {
    private static PhoneExample phoneExample;
    public static final String[] validatePhone = new String [] {"(84)-(0978489648)", "(80)-(0878489648)"};
    public static final String[] invalidatePhone = new String [] {"(a8)-(22222222)"};

    public static void main(String[] args) {
        phoneExample = new PhoneExample();
        for (String phone: validatePhone) {
            boolean isvalid = phoneExample.validate(phone);
            System.out.println("Phone is " + phone + " is valid " + isvalid );
        }
        for (String phone: invalidatePhone) {
            boolean isvalid = phoneExample.validate(phone);
            System.out.println("Phone is " + phone + " is valid " + isvalid );
        }

    }
}
