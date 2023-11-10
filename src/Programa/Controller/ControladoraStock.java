package Programa.Controller;

import Programa.DAO.DAOStock;
import Programa.Stock;
import java.sql.SQLException;

public class ControladoraStock {
    private final DAOStock stockDAO;

    public ControladoraStock() {
        
        this.stockDAO = new DAOStock();
    }

    public void agregarStock(Stock stock) throws SQLException {
        stockDAO.agregar(stock);
    }

    public void actualizarStock(Stock stock) throws SQLException {
        stockDAO.actualizar(stock);
    }

    public void eliminarStock(int id) throws SQLException {
        stockDAO.eliminar(id);
    }
}

