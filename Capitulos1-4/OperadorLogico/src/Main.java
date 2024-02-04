//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%n", "AND Condicional (&&)", "False && False", false, "false && true", false, "true && false", false, "true && true", true);
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n", "OR condicional (||)", "false || false", false, "false || true", true, "true  || false", true, "true  || true", true);
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n", "AND logico booleano (&)", "false & false", false, "false & true", false, "true & false", false, "true & true", true);
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n", "OR inclusivo logico booleano (|)", "false | false", false, "false | true", true, "true | false", true, "true | true", true);
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n", "OR exclusivo logico booleano (^)", "false ^ false", false, "false ^ true", true, "true ^ false", true, "true ^ true", false);
        System.out.printf("%s%n%s: %b%n%s: %b%n", "NOT logico (!)", "!false", true, "!true", false);
    }
}
