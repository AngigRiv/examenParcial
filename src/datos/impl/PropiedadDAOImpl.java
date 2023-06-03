package datos.impl;
import dominio.Propiedad;
import datos.PropiedadDAO;
import java.util.List;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import database.Conexion;
import java.util.ArrayList;

public class PropiedadDAOImpl implements PropiedadDAO<Propiedad>{
    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;
    
    public PropiedadDAOImpl(){
        CON = Conexion.getInstancia();
    }
    
    @Override
    public List<Propiedad> listar(String texto) {
        List<Propiedad> registros=new ArrayList();
        try {            
            ps = CON.conectar().prepareStatement("SELECT id, nombre, direccion, caracteristicas,estado, precioAlquiler,created_at, updated_at from propiedad where nombre like ?");
            ps.setString(1, "%" + texto + "%");
            rs = ps.executeQuery();
            while(rs.next()){
                registros.add(new Propiedad(rs.getInt(1),rs.getString(2),rs.getString(3), rs.getString(4),rs.getString(5), rs.getDouble(6)));
            }
            
            ps.close();
            rs.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }finally{
            ps=null;
            rs=null;
        }
        return registros;
    }

    @Override
    public boolean insertar(Propiedad obj) {
        resp=false;
        try {
            ps=CON.conectar().prepareStatement("INSERT INTO propiedad (nombre) VALUES (?)");
            ps.setString(1, obj.getNombre());
            if (ps.executeUpdate() > 0) {
                resp = true;
          }
            ps.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }finally{
            ps=null;
            CON.desconectar();
        }
        return resp;
    }

    @Override
    public boolean actualizar(Propiedad obj) {
        boolean resp=false;
        try {
            ps = CON.conectar().prepareStatement("UPDATE propiedad set nombre=?, direccion=?, caracteristicas=?, estado=?, precioAlquiler=? WHERE id=?");
            ps.setString(1, obj.getNombre());
            ps.setString(2, obj.getDireccion());
            ps.setInt(3, obj.getId());
            if (ps.executeUpdate() > 0) {
                resp = true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            ps = null;
            CON.desconectar();
        }
        return resp;
    }

    @Override
    public boolean eliminar(int id) {
        boolean resp=false;
        try {
            ps = CON.conectar().prepareStatement("DELETE FROM propiedad WHERE id=?");
            ps.setInt(1, id);
            if (ps.executeUpdate() > 0) {
                resp = true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            ps = null;
            CON.desconectar();
        }
        return resp;
    }
    
}
