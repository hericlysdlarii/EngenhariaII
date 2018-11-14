package controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author deusimar
 */
public class Buscar {
    
    public ResultSet buscarAcademia(String busca, String valor) throws SQLException{
    
        ResultSet rs = null;
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        
        stmt = con.prepareStatement("SELECT * FROM academia WHERE "+busca+" LIKE '%"+valor+"%'");
        rs = stmt.executeQuery();
        
        return rs;
    }
    
}
