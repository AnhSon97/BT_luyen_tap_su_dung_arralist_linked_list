import java.util.ArrayList;

public class ProductManager <String> {
   ArrayList <String> myProduct = new ArrayList<>();

   public void push (int num,String element){
       myProduct.add(num,element);
   }

   public String exit (int num,String element){
       return myProduct.set(num,element);
   }

   public String remove (int num){
       return myProduct.remove(num);
   }

   public void display (){
       for (String i:myProduct){
           System.out.println(i);
       }
   }

   public boolean search (String element){
       return myProduct.contains(element);
   }
}
