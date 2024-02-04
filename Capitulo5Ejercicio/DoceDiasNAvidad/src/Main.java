public class Main {

    public static void main(String[] args) {
        for (int dia = 1; dia <= 12; ++dia) {
            System.out.println("On the " + obtenerDia(dia) + " of Christmas");
            System.out.println("My True Love sent to me");
            switch (dia) {
                case 1:
                    System.out.println("Partridge in a pear tree");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Two turtle dove");
                    System.out.println("and Partridge in a pear tree");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Tree french,");
                    System.out.println("Two turtle dove");
                    System.out.println("and Partridge in a pear tree");
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Four calling birds,");
                    System.out.println("Tree french,");
                    System.out.println("Two turtle dove,");
                    System.out.println("and Partridge in a pear tree");
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Five golden rings,");
                    System.out.println("Four calling birds,");
                    System.out.println("Tree french,");
                    System.out.println("Two turtle dove,");
                    System.out.println("and Partridge in a pear tree");
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Six geese a-laying,");
                    System.out.println("Five golden rings,");
                    System.out.println("Four calling birds,");
                    System.out.println("Tree french,");
                    System.out.println("Two turtle dove,");
                    System.out.println("and Partridge in a pear tree");
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Seven swang swimming,");
                    System.out.println("Six geese a-laying,");
                    System.out.println("Five golden rings,");
                    System.out.println("Four calling birds,");
                    System.out.println("Tree french,");
                    System.out.println("Two turtle dove,");
                    System.out.println("and Partridge in a pear tree");
                    System.out.println();
                    break;
                case 8:
                    System.out.println("Eight maids a-milking,");
                    System.out.println("Seven swang swimming,");
                    System.out.println("Six geese a-laying,");
                    System.out.println("Five golden rings,");
                    System.out.println("Four calling birds,");
                    System.out.println("Tree french,");
                    System.out.println("Two turtle dove,");
                    System.out.println("and Partridge in a pear tree");
                    System.out.println();
                    break;
                case 9:
                    System.out.println("Nine ladies dancing,");
                    System.out.println("Eight maids a-milking,");
                    System.out.println("Seven swang swimming,");
                    System.out.println("Six geese a-laying,");
                    System.out.println("Five golden rings,");
                    System.out.println("Four calling birds,");
                    System.out.println("Tree french,");
                    System.out.println("Two turtle dove,");
                    System.out.println("and Partridge in a pear tree");
                    System.out.println();
                    break;
                case 10:
                    System.out.println("Ten lords a-leaping,");
                    System.out.println("Nine ladies dancing,");
                    System.out.println("Eight maids a-milking,");
                    System.out.println("Seven swang swimming,");
                    System.out.println("Six geese a-laying,");
                    System.out.println("Five golden rings,");
                    System.out.println("Four calling birds,");
                    System.out.println("Tree french,");
                    System.out.println("Two turtle dove,");
                    System.out.println("and Partridge in a pear tree");
                    System.out.println();
                    break;
                case 11:
                    System.out.println("Eleven pipers piping,");
                    System.out.println("Ten lords a-leaping,");
                    System.out.println("Nine ladies dancing,");
                    System.out.println("Eight maids a-milking,");
                    System.out.println("Seven swang swimming,");
                    System.out.println("Six geese a-laying,");
                    System.out.println("Five golden rings,");
                    System.out.println("Four calling birds,");
                    System.out.println("Tree french,");
                    System.out.println("Two turtle dove,");
                    System.out.println("and Partridge in a pear tree");
                    System.out.println();
                    break;
                case 12:
                    System.out.println("Tuelve drummers drumming,");
                    System.out.println("Eleven pipers piping,");
                    System.out.println("Ten lords a-leaping,");
                    System.out.println("Nine ladies dancing,");
                    System.out.println("Eight maids a-milking,");
                    System.out.println("Seven swang swimming,");
                    System.out.println("Six geese a-laying,");
                    System.out.println("Five golden rings,");
                    System.out.println("Four calling birds,");
                    System.out.println("Tree french,");
                    System.out.println("Two turtle dove,");
                    System.out.println("and Partridge in a pear tree");
                    System.out.println();
                    break;
                default:
                    System.out.println("algo salio mal");
            }

            System.out.println();
        }

    }

    public static String obtenerDia(int dia) {
        switch (dia) {
            case 1:
                return "first day";
            case 2:
                return "Second day";
            case 3:
                return "Third day";
            case 4:
                return "Fourth";
            case 5:
                return "Fifth";
            case 6:
                return "Sixth";
            case 7:
                return "Seventh";
            case 8:
                return "Eighth";
            case 9:
                return "Nineth";
            case 10:
                return "Tenth";
            case 11:
                return "Eleventh";
            case 12:
                return "Twelfth";
            default:
                return "Algo salio mal";
        }
    }
}

