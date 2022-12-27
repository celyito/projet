package projet;

import Lire.*;
public class Test {

  public static void main(String[] args) {
    /*
     * Sólo se debe añadir métodos para establecer los valores de los atributos, poder imprimirlos datos en pantalla y calcular cantidad a pagar según el precio de venta. De momento, no hace falta gestionar el almacén con los artículos que quedan, sólo se pedirá la cantidad de artículos que lleva el cliente y se dará el precio a pagar según esa cantidad. 
     */
    
    System.out.println("Bienvenue à la boutique d'ACCESSOIRS ET SUPLEMENTS SPORTIFS\n--------\n"+
              "Ce programme simule une boutique qui vends différents produits sportifsn"+
              "Ces articules seulement peuvent être vendu s'ils sont disponibles sur la boutique"+
              "Vous pouvez :\n"+
              "\t Faire des achat avec des produits existant.\n"+
              "\t Ajouter des nouveuax produits sur le panier.\n"+
              "\t Consulter l'import du panier.");
    
    boolean continuer = true;
    int lectureProduit, lectureQuantite; //Variables para seleccionar el producto y la cantidad que se quiere comprar
    
    //Se instancian y cargan los productos
    Produit suplement1 = new Suplements("Whey Protein", 29.99, 6, true, "1000g");
    Produit suplement2 = new Suplements("Creatine", 18.2, 20, true, "300g");
    Produit accessoir1 = new Accessoir("straps", 15.99, 5, true, "GYM");
    Produit accessoir2 = new Accessoir("shaker", 8.11, 0, false, "Gourde");
    
    //Se crea el array "catálogo" para contener los productos. Su dimensión viene del número de veces que se
    //instancia el contructor de Producto
    Produit catalogue[] = new Produit[Produit.dimesionArray];
    //Se crea el ueobjeto gestion para trabajar (mostrar y vender productos, y mostrar caja)
    Gestion gestion = new Gestion();

    //Se rellena el array catálogo
    catalogue[0] = suplement1;
    catalogue[1] = suplement2;
    catalogue[2] = accessoir1;
    catalogue[3] = accessoir2;
    
    do {
      System.out.println("\nIntroduire l'option desiré:\n"
                +"1. Montrer produits\n"
                +"2. Acheter produits\n"
                +"3. Montrer caisse\n"
                +"SORTIR --> Mettre un autre numéro\n"
                );
      switch (Lire.datoInt()) {
        case 1:
          gestion.montrerProduit(catalogue);
          break;
        case 2:
          System.out.println("¿Quel Produit desirez-vous acheter?");
          gestion.montrerNomProduits(catalogue);
          lectureProduit=Lire.datoInt();
          System.out.println("¿quelle quantité?");
          lectureQuantite=Lire.datoInt();
          //Se carga el producto y la cantidad solicitada por el usuario

          break;
        case 3:
          System.out.println(gestion.montrerCaisse() +" €");
          break;
        default:
          //Se sale del programa
          continuer=false;
      }
      
    } while(continuer);
    
    System.out.println("---- Merci pour utiliser cette application. ----");

  }
}