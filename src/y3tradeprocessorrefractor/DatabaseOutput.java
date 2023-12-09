package y3tradeprocessorrefractor;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import static y3tradeprocessorrefractor.Database.DB_URL;


public class DatabaseOutput extends Database implements DataOutput {
    @Override
    public void saveData(List<TradeRecord> trades) throws IOException {
        boolean dbTableReady = Database.setupDatabase();
        if (!dbTableReady) return;
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = conn.createStatement();) {
            String sql;
            for (TradeRecord trade : trades) {
                sql = String.format(
                        "INSERT INTO trades (sourceCurrencyCode, destinationCurrencyCode, tradeAmount, tradePrice) VALUES ('%s', '%s', %d, %f);",
                        trade.getSourceCurrencyCode(), trade.getDestinationCurrencyCode(), trade.getTradeAmount(), trade.getTradePrice());
                stmt.executeUpdate(sql);                           
            }
        } catch (SQLException ex) {
            System.out.println("Problem with saving trades: ");
            ex.printStackTrace();
        }
    }     
}
