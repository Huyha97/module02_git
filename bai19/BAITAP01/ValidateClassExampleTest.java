package bai19.BAITAP01;

class ValidateClassNameTest {
    private static ValidateClassname validateClassName;
    public static final String[] validClassName = {"C0220H","A2021H","P1234G"};
    public static final String[] invalidClassName = {"T0220H","A2021O","C11234G"};
    public static void main(String[] args) {
        validateClassName = new ValidateClassname();
        for(String className: validClassName) {
            boolean isValid = validateClassName.validate(className);
            System.out.println(className +" is valid: "+ isValid);
        }
        for(String className: invalidClassName) {
            boolean isValid = validateClassName.validate(className);
            System.out.println(className +" is valid: "+isValid);
        }
    }

}
