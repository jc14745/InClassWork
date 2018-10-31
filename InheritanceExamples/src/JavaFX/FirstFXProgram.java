package JavaFX;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.*;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;
public class FirstFXProgram extends javafx.application.Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch();

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Rectangle bed = new Rectangle(300,50);//shape method is incompatable with everything except javaFX
		bed.setX(100);
		bed.setY(400);
		
		//create circles
		Circle backTire = new Circle(150,450,20);
		Circle frontTire = new Circle(350,450,20);
		Rectangle cab = new Rectangle(425,300,75,150);
		Rectangle engine = new Rectangle(500,350,50,100);
		Line window = new Line(500,300,525,350);
		Circle backTire2 = new Circle(450,450,20);
		Circle frontTire2 = new Circle(525,450,20);
		backTire.setStroke(Color.BLACK);
		bed.setFill(Color.BLUEVIOLET);
		//create a container 
		Pane p = new Pane(); 
		//add nodes to pane
		p.getChildren().addAll(bed, backTire2, frontTire2, window, backTire, frontTire, cab, engine);
		Line path = new Line(0,400,700,400);
		Group g = new Group();
		g.getChildren().add(p);
		PathTransition pt = new PathTransition();
		pt.setNode(g);
		pt.setPath(path);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.setDuration(Duration.seconds(200));
		pt.play();
		//create scene 
		Scene sc = new Scene(g,700,700 );
		//add scene to stage
		primaryStage.setScene(sc);
		//add title to the stage
		primaryStage.setTitle("Header");
		// show our stage
		primaryStage.show();
		
	}

}
