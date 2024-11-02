
public class pizza {
	
	String name;
	String topping;
	String Da_Sauceee;
	String Spice_levels;
	
	pizza(){
		
	}
	
	pizza(String name, String Spice_levels){
		
		this.name = name;
		this.Spice_levels = Spice_levels;
		
	}
	
	pizza(String topping){
		this.topping = topping;
	}
	
	pizza(String Da_Sauceee, String topping, String name){
		this.Da_Sauceee = Da_Sauceee;
		this.name = name;
		this.topping = topping;
	}
	
	pizza(String Da_Sauceee, String topping, String name, String Spice_levels){
		this.Da_Sauceee = Da_Sauceee;
		this.name = name;
		this.topping = topping;
		this.Spice_levels = Spice_levels;
	}


}
