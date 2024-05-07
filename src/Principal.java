
public class Principal {

    Factura [] control= new Factura[3];

    public Principal(Factura[] control) {
        this.control = control;
    }

    public Principal() {
    }

    public void imprimirFactura()
    {
       int tamano=3, stop=0;
        while(stop!=tamano)
        {
         System.out.println("Compañia: "+control[stop].getCompania()+"\n");
            System.out.println("Cliente: "+control[stop].getCliente()+"\n");
            System.out.println("Monto: "+control[stop].getBolivares()+"\n");
         stop++;
        }
    }

    public void crearFactura()
    {
        control[0]=new Factura();
        control[1]=new Factura();
        control[2]=new Factura();


        control[0].setCompania("A");
        control[1].setCompania("B");
        control[2].setCompania("C");

        control[0].setBolivares(123);
        control[1].setBolivares(567);
        control[2].setBolivares(111333333);

        control[0].setCliente(111);
        control[1].setCliente(222);
        control[2].setCliente(333);



    }

}
