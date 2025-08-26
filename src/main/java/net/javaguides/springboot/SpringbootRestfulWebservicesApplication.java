package net.javaguides.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootRestfulWebservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestfulWebservicesApplication.class, args);
	}

}


// package net.javaguides.springboot;
// import java.sql.Connection;
// import java.sql.DriverManager;

// public class SpringbootRestfulWebservicesApplication {
//     public static void main(String[] args) throws Exception {
//         String url = "jdbc:mysql://localhost:3309/user_management";
//         String user = "springuser";
//         String password = "Spring@123";

//         Connection conn = DriverManager.getConnection(url, user, password);
//         System.out.println("Connected successfully!");
//         conn.close();
//     }
// }
