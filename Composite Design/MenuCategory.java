import java.util.List;
import java.util.ArrayList;

public class MenuCategory implements MenuComponent{
    private String name; 
    private List<MenuComponent> menuComponents; 

    public MenuCategory(String name){
        this.name= name; 
        this.menuComponents= new ArrayList<>(); 
    }

    public void addMenuComponent(MenuComponent menuComponent){
        menuComponents.add(menuComponent); 
    }

    @Override
    public double getPrice(){
        double totalPrice= 0.0; 
        for(MenuComponent component: menuComponents){
            totalPrice+= component.getPrice(); 
        }
        return totalPrice; 
    }

    @Override
    public void print(){
        System.out.println(name); 
        for(MenuComponent component: menuComponents){
            component.print(); 
        }
    }
}