// Name: Davinder Singh
// Student ID: 200484320
package com.example.w22comp1011gctest2student;

import com.example.w22comp1011gctest2student.model.Customer;
import com.example.w22comp1011gctest2student.model.Product;
import com.example.w22comp1011gctest2student.parser.Parser;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class TableViewController implements Initializable {
    @FXML
    private Label saleLabel;

    @FXML
    private Label msrpLabel;

    @FXML
    private Label savingsLabel;

    @FXML
    private Label rowsInTableLabel;

    @FXML
    private TableView<Customer> tableView;

    @FXML
    private TableColumn<Customer, Integer> idColumn;

    @FXML
    private TableColumn<Customer, String> firstNameColumn;

    @FXML
    private TableColumn<Customer, String> lastNameColumn;

    @FXML
    private TableColumn<Customer, String> phoneColumn;

    @FXML
    private TableColumn<Customer, String> totalPurchaseColumn;

    @FXML
    private ListView<Product> purchaseListView;

    @FXML
    private ImageView imageView;

    private ObservableList<Customer> customerObservableList = FXCollections.observableArrayList();

    @FXML
    private void top10Customers() {
        System.out.println("called method top10Customers()");
    }

    @FXML
    private void customersSavedOver5() {
        System.out.println("called method customersSavedOver5()");
    }

    @FXML
    private void loadAllCustomers() {
        System.out.println("called method loadAllCustomers");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ArrayList<Customer> customerArrayList = Parser.getCustomersFromJsonFile();
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        phoneColumn.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        totalPurchaseColumn.setCellValueFactory(new PropertyValueFactory<>("totalPurchases"));
        customerObservableList.addAll(customerArrayList);
        tableView.setItems(customerObservableList);
        rowsInTableLabel.textProperty().bind(Bindings.size(customerObservableList).asString("Rows in table: %s"));
    }

    public ObservableList<Customer> getCustomerObservableList() {
        return customerObservableList;
    }
}
