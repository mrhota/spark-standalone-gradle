import static spark.Spark.*;

public class SparkApp {
	public static void main(String[] args) {
		get("/", (req, res) -> "<h1>It works. Bully for you.</h1>");
	}
}
