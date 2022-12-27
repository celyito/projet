package projet;

public class Suplements extends Produit {
	  private String quantité;

	  
	  //Constructor
	  public Suplements() { }
	  public Suplements(String nom, double prixUnit, int quantStock, boolean disponible, String typeAcc, String quantité) {
	    super(nom, prixUnit, quantStock, disponible);
	    this.quantité = quantité;
	  }
	  
	  
	  //Methods
	  @Override
	  public String toString() {
	    return  "SUPLEMENT SPORTIF.\n"+
	        super.toString()+
	        "la quantité: "  +this.quantité;
	  }
	  
	  //Gets and Sets
	  public String getDirector() {
	    return quantité;
	  }
	  public void setDirector(String quantité) {
	    this.quantité = quantité;
	  }
	}

}

}
