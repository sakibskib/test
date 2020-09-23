/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpkg;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import users.Student;

/**
 * FXML Controller class
 *
 * @author Subrata Kumar Dey
 */
public class StudSceneController implements Initializable {

    @FXML    private TextField idTextField;
    @FXML    private TextField nameTextField;
    @FXML    private TextField cgpaTextField;
    @FXML    private Button wtiteToFileButton;
    @FXML    private Button addToArrayListButton;
    
    
    ArrayList<Student> studList;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        studList = new ArrayList<Student>();
    }    

    @FXML
    private void wtiteToFileButtonOnClick(ActionEvent event) {
        String str="";
        for(Student st: studList){
            str += st.toString()+"\n";
        }
        File f;
        FileWriter fr;
        try {
            f = new File("abc.txt");
            if(f.exists())
                fr = new FileWriter(f,true);
            else
                fr = new FileWriter(f);
            fr.write(str);
            fr.close();
        } catch (IOException ex) {
            Logger.getLogger(StudSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void resetIdTextField(MouseEvent event) {
        idTextField.setText("");
    }

    @FXML
    private void resetNameTextField(MouseEvent event) {
        nameTextField.setText("");
    }

    @FXML
    private void resetCgpaTextField(MouseEvent event) {
        cgpaTextField.setText("");
    }

    @FXML
    private void addToArrayListButtonOnClick(ActionEvent event) {
        studList.add(
                new Student(
                    Integer.parseInt(idTextField.getText()),
                    nameTextField.getText(),
                    Float.parseFloat(cgpaTextField.getText()),
                    "TBA", "TBA"
                )
        );
        idTextField.setText("");
        nameTextField.setText("");
        cgpaTextField.setText("");
    }
    
}
