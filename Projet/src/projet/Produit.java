package projet;

public class Produit {
	private String nom;
	  private double prixUnit;
	  private int quantStock;
	  private boolean disponible = false;
	  public static int dimesionArray;
	  
	  
	  //Constructors
	  public Produit() { }
	  public Produit(String nom, double prixUnit, int quantStock, boolean disponible) {
	    this.nom   = nom;
	    this.prixUnit = prixUnit;
	    this.quantStock  = quantStock;
	    this.disponible = disponible;
	    
	    dimesionArray++;//Se obtiene con esta variable la dimensión del array. Según número de instancias del constructor
	  }
	  
	  
	  //Methods
	  @Override
	  public String toString() {
	    return  "Nom: "      +this.getNom()+    "\n"+
	        "Prix unité: " +this.getPrixUnit()+  " €\n"+
	        "En Stock: "    +this.getQuantStock()+ "\n";
	  }
	  
	  //Get and Set
	  public String getNom() {
	    return this.nom;
	  }
	  public void setNom(String nom) {
	    this.nom = nom;
	  }
	  public double getPrixUnit() {
	    return this.prixUnit;
	  }
	  public void setPrixUnit(double prixUnit) {
	    this.prixUnit = prixUnit;
	  }
	  public int getQuantStock() {
	    return this.quantStock;
	  }
	  public void setQuantStock(int quantStock) {
	    this.quantStock = quantStock;
	  }
	  public boolean isDisponible() {
	    if(getQuantStock()>0) this.disponible = true;
	    return this.disponible;
	  }
	  public void setDisponible(boolean disponible) {
	    this.disponible = disponible;
	  }

}
