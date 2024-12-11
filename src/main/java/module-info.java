
//2.2.2 Exports
module br.com.ana.dukemarket.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    
    requires java.sql;
    
    opens br.eti.ana.dukemartket.javafx to javafx.fxml;
    opens br.eti.ana.dukemarket.javafx.controller to javafx.fxml;
    
    exports br.eti.ana.dukemarket.javafx;
    exports br.eti.ana.dukemarkt.javafx.controller;
    exports br.eti.ana.dukemarket.javafx.DAO;
    exports r.eti.ana.dukemarket.javafx.model;
    
    requires mysql.connector.java;
   
}

//3 Menu DukeMarket 
    //3.1 Views (ok)
    