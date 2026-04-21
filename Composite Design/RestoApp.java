public class RestoApp{
    public static void main(String[] args){
        // Create menu items
        MenuItem burger= new MenuItem("Classic Burger", 250.00); 
        MenuItem fries= new MenuItem("Large Fries", 85.00); 
        MenuItem soda= new MenuItem("Root Beer", 60.00); 

        // Create sub-composite
        MenuCategory barkadaSoloMeal= new MenuCategory("---BARKADA SOLO MEAL---"); 
        barkadaSoloMeal.addMenuComponent(burger); 
        barkadaSoloMeal.addMenuComponent(fries); 
        barkadaSoloMeal.addMenuComponent(soda); 

        // Create leaf
        MenuItem sundae= new MenuItem("Vanilla Sundae", 45.00); 

        // Create top-composite
        MenuCategory mainMenu= new MenuCategory("---MAIN MENU---"); 
        mainMenu.addMenuComponent(barkadaSoloMeal); 
        mainMenu.addMenuComponent(sundae); 

        // Test
        
        mainMenu.print();
        System.out.println("===========================");
        System.out.println("Total Menu Value: ₱" + mainMenu.getPrice()); 
    }
}