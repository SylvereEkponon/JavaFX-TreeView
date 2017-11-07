package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MainController implements Initializable{

	@FXML
	TreeView <String> myTreeView;
	
	Image icon = new Image(getClass().getResourceAsStream("/img/images.jpg"));
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		TreeItem<String> root = new TreeItem<>("Root", new ImageView(icon));
		
		TreeItem<String> nodeA = new TreeItem<>("node A");
		TreeItem<String> nodeB = new TreeItem<>("node B");
		TreeItem<String> nodeC = new TreeItem<>("node C");
		
		root.getChildren().add(nodeA);
		root.getChildren().add(nodeB);
		root.getChildren().add(nodeC);
		
		TreeItem<String> nodeD = new TreeItem<>("node 1");
		TreeItem<String> nodeE = new TreeItem<>("node 2");
		TreeItem<String> nodeF = new TreeItem<>("node 3");
		
		nodeA.getChildren().addAll(nodeD,nodeE,nodeF);
		
		myTreeView.setRoot(root);
	}

}
