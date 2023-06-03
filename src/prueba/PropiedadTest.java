package prueba;
import datos.impl.PropiedadDAOImpl;
import dominio.Propiedad;

public class PropiedadTest {
    public static void main(String[] args) {
        insertarPropiedad("Los Olmos", "JLO 459", "400 x 100", "vendido", 1000.00);
        insertarPropiedad("La Independencia", "San Luis 890", "100 x 100", "no vendido", 3500.00);
    }
    private static void insertarPropiedad(String nombre,String direccion, String caracteristicas,
                                          String estado, Double precioAlquiler){
        Propiedad obj=new Propiedad();
        PropiedadDAOImpl datos=new PropiedadDAOImpl();
        obj.setNombre(nombre);
        obj.setDireccion(direccion);
        obj.setCaracteristicas(caracteristicas);
        obj.setEstado(estado);
        obj.setPrecioAlquiler(precioAlquiler);
        boolean resp;
        resp=datos.insertar(obj);
        System.out.println("Insertado: "+resp);
    }
}