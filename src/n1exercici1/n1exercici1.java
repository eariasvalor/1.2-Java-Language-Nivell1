package n1exercici1;

public class N1Exercici1 {
    public static void main (String[] args){
        Sale sale = new Sale();
       try{
           sale.calculateTotal();
           System.out.println("Total: " + sale.getTotalPrice());
       } catch (EmptySaleException e) {
           System.out.println(e.getMessage());
       }



        try {
            String[] names = {"Alexander", "Mikhail", "Ivan", "John"};
            String russianName = names[4];
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
