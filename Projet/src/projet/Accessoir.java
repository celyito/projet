package projet;

public class Accessoir extends Produit {
	//Attribute
	  private String typeAcc;

	  
	  //Constructor
	  public Accessoir() { }
	  public Accessoir(String nom, double prixUnit, int quantStock, boolean disponible, String typeAcc) {
	    super(nom, prixUnit, quantStock, disponible);
	    this.typeAcc = typeAcc;
	  }
	  
	  
	  //Methods
	  @Override
	  public String toString() {
	    return  "ACCESSOIR SPORTIF.\n"+
	        super.toString()+
	        "type d'accessoir: "  +this.typeAcc;
	  }
	  
	  //Gets and Sets
	  public String getDirector() {
	    return typeAcc;
	  }
	  public void setDirector(String typeAcc) {
	    this.typeAcc = typeAcc;
	  }
	}

}
