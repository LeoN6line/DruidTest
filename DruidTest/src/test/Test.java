package test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * Servlet implementation class Test
 */
public class Test extends HttpServlet {
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		DruidDataSource ds=null;
		
		try {
			InitialContext ctx=new InitialContext();
			ds=(DruidDataSource) ctx.lookup("java:comp/env/jdbc/mysqlds");	//java:comp/env/是固定的，后面跟自己context.xml里面配置的name属性
			Connection conn=ds.getConnection();
			PreparedStatement pstmt=conn.prepareStatement("select * from t_excel");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				System.out.println(rs.getString("name"));
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
