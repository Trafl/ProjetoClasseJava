package entidades;

public class Product {
  
  public String name;
  public double price;
  public int quantity;

public Product(String name, double price, int quantity) {

  this.name = name;
  this.price = price;
  this.quantity = quantity;
}   

public double TotalValueInStock() {
    return price * quantity;
}

public void AddProducts(int value){
  quantity += value;
}

public void RemoveProducts(int value){
  quantity -= value;
}

public String toString() {
  return "Nome do Produto: " +  name + ", Preço: $" + String.format("%.2f" , price) + ", Quantidade: " + quantity + ", Total: $" + String.format("%.2f" , TotalValueInStock());
}

}