package com.yunusfx.javafxcustomcontrols;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ExpectedBehaviour extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        ObservableList<Sale> saleList = FXCollections.observableArrayList(getSales());
        VBox root = new VBox();
        root.getChildren().setAll(new NestedTableView(root, saleList));
        Scene scene = new Scene(root, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Nested TableView example");
        primaryStage.show();
    }
    
    private List<Sale> getSales(){
        List<Sale> sales = new ArrayList<>();
        
        // Bunch 1
        Sale s1 = new Sale();
        s1.setId(1);
        s1.setReferenceNumber("100200");
        s1.setTransactionValue(140);
        s1.setDate("2016-01-23");
        SaleTransaction st1 = new SaleTransaction(2, 15);
        st1.setProductId(1);
        st1.setProductName("Product 1");
        SaleTransaction st2 = new SaleTransaction(3, 15);
        st2.setProductId(2);
        st2.setProductName("Product 2");
        s1.getSaleTransactionList().add(st1);
        s1.getSaleTransactionList().add(st2);
        
        // Bunch 2
        Sale s2 = new Sale();
        s2.setId(1);
        s2.setReferenceNumber("100201");
        s2.setTransactionValue(150);
        s2.setDate("2016-01-24");
        SaleTransaction st3 = new SaleTransaction(20, 105);
        st3.setProductId(3);
        st3.setProductName("Product 3");
        SaleTransaction st4 = new SaleTransaction(30, 150);
        st4.setProductId(4);
        st4.setProductName("Product 4");
        s2.getSaleTransactionList().add(st3);
        s2.getSaleTransactionList().add(st4);
        
        // Bunch 3
        Sale s3 = new Sale();
        s3.setId(1);
        s3.setReferenceNumber("100203");
        s3.setTransactionValue(110);
        s3.setDate("2016-01-25");
        SaleTransaction st5 = new SaleTransaction(40, 100);
        st5.setProductId(3);
        st5.setProductName("Product 5");
        SaleTransaction st6 = new SaleTransaction(50, 500);
        st6.setProductId(4);
        st6.setProductName("Product 6");
        s3.getSaleTransactionList().add(st5);
        s3.getSaleTransactionList().add(st6);
        
        sales.add(s1);
        sales.add(s2);
        sales.add(s3);
        return sales;
    }
    
}
