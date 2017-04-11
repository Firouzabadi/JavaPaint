package Shape;
import java.sql.SQLException;

public class ShapeEM {

	public void addShape(Shape newShape) {

		ConnectToDataBase connectDB = new ConnectToDataBase();
		connectDB.connection();
		
		String sqlAddShape = "INSERT INTO `Paint`.`shape`"+
		"(`type`, `shapeColor`, `xStart`, `xEnd`, `yStart`, `yEnd`, `shape_iduser`)"
				+" VALUES ('"+newShape.type+"', '"+newShape.shapeColor+"', '"+newShape.xStart+"', '"+newShape.xEnd+"', '"+newShape.yStart+"', '"
		+newShape.yEnd+"', '"+newShape.shape_iduser+"');";
		try {
			
			connectDB.stmt.executeUpdate(sqlAddShape);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		connectDB.closing();
		
		
	}
}
