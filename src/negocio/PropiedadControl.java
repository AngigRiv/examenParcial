package negocio;

import javax.swing.table.DefaultTableModel;
import datos.impl.PropiedadDAOImpl;
import dominio.Propiedad;
import java.util.ArrayList;
import java.util.List;

public class PropiedadControl {
    private final PropiedadDAOImpl DATOS;
    private Propiedad obj;
    private DefaultTableModel modeloTabla;

     public PropiedadControl(){
        DATOS=new PropiedadDAOImpl();
        obj=new Propiedad();
    }
    
       public DefaultTableModel listar(String texto) {
        
        List<Propiedad> lista = new ArrayList();
        lista.addAll(DATOS.listar(texto));
        //Establecemos la columna del tableModel
        //Propiedad(int id, String nombre, String direccion, String caracteristicas, String estado, double precioAlquiler, String createdAt, String updatedAt)
        String[] titulos = {"ID", "NOMBRE","DIRECCION","CARACTERISTICAS","ESTADO","PRECIO ALQUILER"};
        //Declaramos un vector que será el que agreguemos 
        //como registro al DefaultTableModel
        String[] registro = new String[6];
        //agrego los títulos al DefaultTableModel
        this.modeloTabla = new DefaultTableModel(null, titulos);
        //Recorrer toda mi lista y la pasare al DefaultTableModel
        for (Propiedad item : lista) {
            registro[0] = Integer.toString(item.getId());
            registro[1] = item.getNombre();
            registro[2] = item.getDireccion();
            registro[3] = item.getCaracteristicas();
            registro[4] = item.getEstado();
            registro[5] =  String.valueOf(item.getPrecioAlquiler());


            this.modeloTabla.addRow(registro);
        }
        return this.modeloTabla;
    }
     
    public String insertar(Propiedad obj){
        if (DATOS.insertar(obj)) {
            return "OK";
        } else {
            return "Error en el ingreso de datos.";
        }
    }
    public String actualizar(Propiedad obj){
        if (DATOS.actualizar(obj)) {
            return "OK";
        } else {
            return "Error en la actualización de datos.";
        }
    }
    public String eliminar(int id){
        if (DATOS.eliminar(id)) {
            return "OK";
        } else {
            return "Error la eliminación de datos.";
        }
    }
}