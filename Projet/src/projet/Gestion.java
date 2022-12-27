package projet;


public class Gestion {
  
  //Attributes
  private Produit produits[] = null;
  private double caisse;
  
  //Constructors
  public Gestion() { }
  public Gestion(Produit[] produits) {
    this.produits = produits;
  }
  
  //Methods
  public Produit[] chargerProduit() {

    return produits;
  }
  
  public void montrerProduit(Produit[] produits) { 
      for (int i = 0; i < produits.length; i++) {
        System.out.print(produits[i]+"n-------n");
      }
  }
  public void montrerNomProduits(Produit[] produits) { 
      for (int i = 0; i < produits.length; i++) {
        System.out.println(i+1 +" "+produits[i].getNom()+"n");
      }
      System.out.println("n------------n");
  }   
  public double acheterProduits(Produit[] produits, int num, int quantité) {
    if (produits[num-1].isDisponible()) {
      if (produits[num-1].getQuantStock() >= quantité){
        System.out.println("L'achat c'est executé avec succès !!n");
        produits[num -1].setQuantStock(produits[num -1].getQuantStock()-quantité);
        return caisse+=quantité*produits[num-1].getPrixUnit();
      } else {System.out.println("Il n'y a pas une quantité de produits suffisantes!!");}
    } else {System.out.println("Il n'y a pas une quantité de produits suffisantes!!");}
    return caisse;
  }
  public double montrerCaisse() {
    System.out.print("Le prix totale de la caisse est ");
    caisse=Math.round(caisse*100);
    return caisse/100;
  } 
}
