abstract class Beverage{
    private void pour(int quantity){
        System.out.println("pour " + quantity + " ml of Beverage");
    }
   protected abstract void addContiment();
   protected  void stir(){};
   private void serve(){
       System.out.println("Serve through waiter");
   }
   public void templateMethod(int quantity){
       pour(quantity);
       addContiment();
       stir();
       serve();
   }
}