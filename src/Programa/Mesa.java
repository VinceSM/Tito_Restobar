package Programa;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Mesa {
    private int id;
    private String nombre;
    private Pedido pedidos;

    public Mesa(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPedidos(Pedido pedidos) {
        this.pedidos = pedidos;
    }
    

    public Pedido getPedidos() {
        return pedidos;
    }

    public Pedido CrearPedido(Date fechaHoraApertura, List<Item> items) {
        Pedido nuevoPedido = new Pedido(fechaHoraApertura, items);
        //Implementar la logica de crear el pedido
        return nuevoPedido;
    }

    public Pedido VerPedido() {
        // Implementa la lógica para obtener el pedido activo o seleccionado
        return null;
    }

    public void EliminarPedido(Pedido pedido) {
    }
}
