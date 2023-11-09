package Programa.Controller;

import Programa.Item;
import Programa.Mesa;
import Programa.Pedido;

import java.util.List;

public class ControladoraPedido {
    
    /*public void mostrarPedidoActivoEnMesa(Mesa mesa) {
        Pedido pedidoActivo = null;

        for (Pedido pedido : mesa.getPedidos()) {
            if (pedido.getFechaHoraCierre() == null) {
                // Si la fecha de cierre es nula, el pedido está activo
                pedidoActivo = pedido;
                break;
            }
        }

        if (pedidoActivo != null) {
            // Aquí muestras la información del pedido activo
            System.out.println("Pedido activo en la mesa " + mesa.getId() + ":");
            System.out.println("Fecha y hora de apertura: " + pedidoActivo.getFechaHoraApertura());
            System.out.println("Total del pedido: " + pedidoActivo.getTotal());
            System.out.println("Items del pedido:");
            for (Item item : pedidoActivo.getItems()) {
                System.out.println("  - " + item.getProducto().getNombre() + " - Cantidad: " + item.getCantidad());
            }
        } else {
            System.out.println("No hay pedido activo en la mesa " + mesa.getId());
        }
    }*/
    
    public void mostrarPedidosMayoresA(Mesa mesa, float totalMinimo) {
        System.out.println("Pedidos en la mesa " + mesa.getId() + " con un total mayor a " + totalMinimo + ":");

        // Accede a la lista de pedidos de la mesa
        List<Pedido> pedidos = (List<Pedido>) mesa.getPedidos();

        for (Pedido pedido : pedidos) {
            if (pedido.Subtotal() > totalMinimo) {
                System.out.println("ID del Pedido: " + pedido.getId());
                System.out.println("Total del Pedido: " + pedido.Subtotal());
            }
        }
    }
}


