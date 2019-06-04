package Evaluacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GestionArticulosSQLImpl implements GestionArticulo {

	public static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String DB_CONNECTION = "jdbc:oracle:thin:@localhost:1521:XE";
	public static final String DB_USER = "´PROYECTO";
	public static final String DB_PASSWORD = "PROYECTO";
	
	
	@Override
	public void incluirArticulo(Articulo a) {
		registrarControlador();
		Connection con= conectarABBDD();
		PreparedStatement ps=crearStatement(con,"INSERT INTO EMPLEADOS VALUES(?,?,?,?,?,?,?)");
		try {
			ps.setInt(1, a.getCodigo());
			ps.setInt(2, a.getIva());
			ps.setDouble(3, a.getPrecio());
			ps.setString(6, a.getDescripcion());
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	@Override
	public void buscarArticulo(int codigo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminarArticulo(int codigo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void buscarPorDescricion(String descripcion) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mostrarInventario() {
		// TODO Auto-generated method stub

	}

	@Override
	public void buscarPorInventario() {
		// TODO Auto-generated method stub

	}
	
	private static PreparedStatement crearStatement(Connection dbConnection, String consulta) {
		PreparedStatement res = null;
		try {
			res = dbConnection.prepareStatement(consulta);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	private static Connection conectarABBDD() {
		Connection res = null;
		try {
			res = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	private static void registrarControlador() {
		try {
			Class.forName(DB_DRIVER).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
