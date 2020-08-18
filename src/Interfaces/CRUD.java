package Interfaces;

import java.util.List;
import Modelo.producto;
import Modelo.proveedor;

public interface CRUD {
  
    public List listarproveedor();
    public proveedor buscarproveedor(int idproveedor);
    public boolean agregarproveedor(proveedor proveedor);
    public boolean editarproveedor(proveedor proveedor);
    public boolean eliminarproveedor(int idproveedor);
    
   public List listarproducto();
    public producto buscarproducto(int idproducto);
    public boolean agregarproducto(producto producto);
    public boolean editarproducto(producto producto);
    public boolean eliminarproducto(int idproducto);
}

