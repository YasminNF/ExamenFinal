package modeloDAO;

import Interfaces.CRUD;
import config.conectaBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Modelo.producto;

public class productoDOA implements CRUD{
  conectaBD cn = new conectaBD();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    productoDOA e = new productoDOA();
    
    public List listarproducto() {
        ArrayList<producto> productos = new ArrayList<>();
        String consulta = " select *  "
                        + "from producto ";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            while(rs.next()){
                productoDOA producto = new productoDOA();
                producto.setIdproducto(rs.getInt("idproducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setPrecio(rs.getBoolean("precio"));
                producto.
                producto.setCodigo(rs.getString("codigo"));
                producto.setStock(rs.getInt("stock"));
                producto.setEstado(rs.getString("estado"));
                producto.add(producto);
            }            
        } catch (SQLException e) {
            System.out.println("Error durante el select");
        }
        return productos;
    }

    @Override
    public producto buscarproducto(int idproducto) {
        String consulta = " select *  "
                        + "from producto  "
                        + "where idproducto = " + idproducto + "; ";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {                
                e.setIdproducto(rs.getInt("idproducto"));
                e.setNombre(rs.getString("nombre"));
                e.setPrecio(rs.getBoolean("precio")); 
                e.setCodigo(rs.getString("codigo"));
                e.setStock(rs.getInt("stock"));
                e.setEstado(rs.getString("estado"));
            }
        } catch (SQLException e) {
            System.out.println("Error durante el select");        
        }
        return e;
    }

    @Override
    public boolean agregarproducto(producto producto) {
        String consulta = " insert into producto(nombre, codigo, estado, stock)  "
                        + " values(  "
                        + "'"+ producto.getIdproducto() +"', "  
                        + "'"+ producto.getNombre() +"', "
                        + "'"+ producto.getPrecio() +"', "
                        + "'"+ producto.getCodigo() +"',  "
                        + "'"+ producto.getStock() +"', "
                        + "'"+ producto.getEstado() +"'); ";
                        
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error durante la insert del nuevo producto");
            return true;
        }
        return false;
    }

    @Override
    public boolean editarproducto(producto producto) {
        String consulta = " update producto  "
                        + " set  "
                        
                        + " nombre = '"+ producto.getNombre() +"', "
                        + " precio = '"+ producto.getPrecio() +"', "
                        + " codigo = '"+ producto.getCodigo()+"', "
                        + " stock = '"+ producto.getStock() +"', "
                        + " estado = '"+ producto.getEstado() +"'  "
                        + " where "
                        + " idproducto = " + producto.getIdproducto() + "; ";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error durante la edición del producto");
            return true;
        }
        return false;
    }

    @Override
    public boolean eliminarproducto(int idproducto) {
        String consulta = " delete  "
                        + " from producto  "
                        + " where "
                        + " idproducto = " + idproducto;
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error durante la edición del producto");
            return true;
        }
        return false;
    }       

}