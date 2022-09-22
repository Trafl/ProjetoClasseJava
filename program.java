import entidades.Product;
import java.util.Scanner;
import java.util.Locale;

public class program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    
    
    System.out.print("Informe o nome do produto: ");
    String name = sc.next();
    System.out.print("Valor do produto: ");
    double price= sc.nextDouble();
    System.out.print("Quantidade em estoque: ");
    int quantity= sc.nextInt();

    Product x = new Product(name, price, quantity);


    System.out.println(x.toString());
    
    System.out.println("informe a quantidade de produtos que vão entrar pro estoque, atualmente tem " + x.quantity);
    int value = sc.nextInt();
    x.AddProducts(value);

    System.out.println(x.toString());

    System.out.println("Deseja fazer uma saida de estoque de quantos produtos ? ");
    value = sc.nextInt();
    x.RemoveProducts(value);

    System.out.println(x.toString());



  

    


    
    
    sc.close();
  }
 
  
}