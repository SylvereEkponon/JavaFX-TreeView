package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class MainController implements Initializable{

	@FXML
	TreeView <String> myTreeView;
	
	Image icon = new Image(getClass().getResourceAsStream("/img/images.jpg"));
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		TreeItem<String> root = new TreeItem<>("Root", new ImageView(icon));
		root.setExpanded(true);
		
		TreeItem<String> nodeA = new TreeItem<>("node A", new ImageView(icon));
		TreeItem<String> nodeB = new TreeItem<>("node B", new ImageView(icon));
		TreeItem<String> nodeC = new TreeItem<>("node C", new ImageView(icon));
		
		root.getChildren().add(nodeA);
		root.getChildren().add(nodeB);
		root.getChildren().add(nodeC);
		
		nodeA.setExpanded(true);
		TreeItem<String> nodeD = new TreeItem<>("node 1", new ImageView(icon));
		TreeItem<String> nodeE = new TreeItem<>("node 2", new ImageView(icon));
		TreeItem<String> nodeF = new TreeItem<>("node 3", new ImageView(icon));
		
		nodeA.getChildren().addAll(nodeD,nodeE,nodeF);
		
		myTreeView.setRoot(root);
	}
	
	public void mouseClick(MouseEvent mouseEvent) {
		if (mouseEvent.getClickCount()== 2) {
		TreeItem<String> item = myTreeView.getSelectionModel().getSelectedItem();
		System.out.println(item.getValue());}
	}
	
	

}
