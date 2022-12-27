package projet;

import Lire.*;
public class Test {

  public static void main(String[] args) {
    /*
     * Sólo se debe añadir métodos para establecer los valores de los atributos, poder imprimirlos datos en pantalla y calcular cantidad a pagar según el precio de venta. De momento, no hace falta gestionar el almacén con los artículos que quedan, sólo se pedirá la cantidad de artículos que lleva el cliente y se dará el precio a pagar según esa cantidad. 
     */
    
    System.out.println("Bienvenue à la boutique d'ACCESSOIRS ET SUPLEMENTS SPORTIFSn--------n"+
              "Ce programme simule une boutique qui vends différents produits sportifsn"+
              "Ces articules seulement peuvent être vendu s'ils sont disponibles sur la boutique"+
              "Vous pouvez :n"+
              "t Faire des achat avec des produits existant.n"+
              "t Ajouter des nouveuax produits sur le panier.n"+
              "t Consulter l'import du panier.");
    
    boolean continuer = true;
    int lectureProduit, lectureQuantite; //Variables para seleccionar el producto y la cantidad que se quiere comprar
    
    //Se instancian y cargan los productos
    Produit suplement1 = new Suplements("Whey Protein", 29.99, 6, true, "1000g");
    Produit suplement2 = new Suplements("Creatine", 21.2, 20, true, "300g");
    Produit accessoir1 = new Accessoir("straps", 15.99, 5, true, "GYM");
    Produit accessoir2 = new Accessoir("shaker", 35.11, 0, false, "Gourde");
    
    //Se crea el array "catálogo" para contener los productos. Su dimensión viene del número de veces que se
    //instancia el contructor de Producto
    Producto catalogo[] = new Producto[Producto.dimesionArray];
    //Se crea el objeto gestion para trabajar (mostrar y vender productos, y mostrar caja)
    Gestion gestion = new Gestion();

    //Se rellena el array catálogo
    catalogo[0] = disco1;
    catalogo[1] = disco2;
    catalogo[2] = cine1;
    catalogo[3] = juego1;
    
    do {
      System.out.println("nnIntroduzca la opción que desea realizar:n"
                +"1. Mostrar productosn"
                +"2. Vender productosn"
                +"3. Mostrar cajan"
                +"SALIR --> Pulse cualquier otro númeron"
                );
      switch (Leer.datoInt()) {
        case 1:
          gestion.montrerProduit(catalogo);
          break;
        case 2:
          System.out.println("¿Que producto desea comprar?");
          gestion.mostrarNombreProductos(catalogo);
          lectureProduit=Leer.datoInt();
          System.out.println("¿Cuánta cantidad desea comprar?");
          lectureQuantite=Leer.datoInt();
          //Se carga el producto y la cantidad solicitada por el usuario
          gestion.comprarProducto(catalogo, lectureProduit, lectureQuantite);
          break;
        case 3:
          System.out.println(gestion.mostrarCaja() +" €");
          break;
        default:
          //Se sale del programa
          continuer=false;
      }
      
    } while(continuer);
    
    System.out.println("---- Gracias por usar la aplicación. ----");

  }
}