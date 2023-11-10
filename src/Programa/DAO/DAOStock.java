package Programa.DAO;

import Programa.Stock;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAOStock {
    public Connection Conectar() throws SQLException {
        String servidor = "localhost";
        String usuario = "root";
        String password = "";
        String baseDeDatos = "titorestobar";

        String cadenaConexion = "jdbc:mysql://" + servidor + "/" + baseDeDatos;
        Connection conexionDb = DriverManager.getConnection(cadenaConexion, usuario, password);

        return conexionDb;
    }
    public void agregar(Stock stock) throws SQLException {
        String consulta = "INSERT INTO `stock` (`id`, `cantidad`, `producto_id`) VALUES (NULL, ?, ?)"; // Asegúrate de que el nombre de la tabla y las columnas sean correctos
        Connection conexion = Conectar();
        PreparedStatement comando = conexion.prepareStatement(consulta);
        comando.setInt(1, stock.getCantidad());
        comando.setInt(2, stock.getProducto().getId());
        comando.executeUpdate();

        conexion.close();
    }

    public void actualizar(Stock stock) throws SQLException {
        String consulta = "UPDATE `stock` SET `cantidad` = ?, `producto_id` = ? WHERE `stock`.`id` = ?";
        Connection conexion = Conectar();
        PreparedStatement comando = conexion.prepareStatement(consulta);
        comando.setInt(1, stock.getCantidad());
        comando.setInt(2, stock.getProducto().getId());
        comando.setInt(3, stock.getId());
        comando.executeUpdate();

        conexion.close();
    }

    public void eliminar(int id) throws SQLException {
        String consulta = "DELETE FROM `stock` WHERE `id` = ?";
        Connection conexion = Conectar();
        PreparedStatement comando = conexion.prepareStatement(consulta);
        comando.setInt(1, id);
        comando.executeUpdate();

        conexion.close();
    }

   
}
