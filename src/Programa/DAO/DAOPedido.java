package Programa.DAO;

import Programa.Mesa;
import Programa.Pedido;
import Programa.Item;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOPedido {
    private final Connection conexion; 

    public DAOPedido(Connection conexion) {
        this.conexion = conexion;
    }

    public void crearPedido(Pedido pedido) throws SQLException {
        String consulta = "INSERT INTO pedidos (mesa_id, fecha_hora_apertura) VALUES (?, ?)";
        try (PreparedStatement ps = conexion.prepareStatement(consulta)) {
            ps.setTimestamp(2, new java.sql.Timestamp(pedido.getFechaHoraApertura().getTime()));
            ps.executeUpdate();
        }
    }

    public void agregarItem(Pedido pedido, Item item) throws SQLException {
        // Implementa la lógica para agregar un elemento de pedido a la base de datos
    }

    public void eliminarItem(Pedido pedido, Item item) throws SQLException {
        // Implementa la lógica para eliminar un elemento de pedido de la base de datos
    }
}

