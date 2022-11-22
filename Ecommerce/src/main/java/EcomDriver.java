/*Desc: project 2 Ecommerce app
 * Authors: Adrian Caso, Joshua Maciel, Neil Felix
 * Version: 0.0.1
 * Date: 11/18/2022
 * */
import io.javalin.Javalin;


public class EcomDriver {

	public static void main(String[] args) {
		Javalin app = Javalin.create(config -> 
		{config.plugins.enableCors(cors -> {cors.add(it -> 
		{it.anyHost();});});});
		
		app.start();
	}

}
