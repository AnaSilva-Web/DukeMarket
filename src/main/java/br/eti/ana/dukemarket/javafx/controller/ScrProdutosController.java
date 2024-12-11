/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package br.eti.ana.dukemarket.javafx.controller;

import br.com.ana.dukemarket.javafx.model.Produto;
import java.net.URL;
import java.util.Calendar;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;
        

/**
 * FXML Controller class
 *
 * @author qualifica
 */
public class ScrProdutosController implements Initializable {
    
    @FXML
    TableView <Produto> tblProduto;
    
    @FXML
    TableColumn <Produto, Integer> tcoId;
    
    @FXML
    TableColumn <Produto, String> tcoCodBarras;
    
     @FXML
    TableColumn <Produto, String> tcoDescricao;
     
    @FXML
    TableColumn <Produto, Double> tcoQtd;
    
    @FXML
    TableColumn <Produto, Double> tcoValorCompra;
    
    @FXML
    TableColumn <Produto,Double> tcoValorVenda;
    
    @FXML
    TableColumn <Produto, Calendar> tcoDataCadasto;
    
    @FXML
    TextField txtId;
    
    @FXML
    TextField txtCodBarras;
    
    @FXML
    TextField txtDescricao;
    
    @FXML
    TextField txtQtd;
    
    @FXML
    TextField txtValorCompra;
    
    @FXML
    TextField txtvalorVenda;
    
    @FXML
    DatePicker dtpDataCadastro;
    
    produtoDao pDao;
    Produto pClicled;     //Armazena o produto clicado na tabela
    
    
    
    private void bindColumns() {
   
    tcoId.setCellValueFactory(new properyValueFactory<>(string: "id"));
    
    tcoId.setStyle(string: "-fx-aligment: CENTER_RIGHT;");
    
    tcoCodbarras.setCellValueFactory(new propertyValueFactory<> (string: "codbarras"));
    tcoCodBarras.setstyle.setStyle(string: "-fx-alignment: CENTER_RIGHT;");
    
    tcoDescricao.setcellVallueFactory(new PropertyValueFactory<>(string: "descricao"));
    
    tcoQtd.setCellValueFactory(new propertyValueFactory<>(String: "qtd"));
    tcoQtd.setStyle(string: "-fx-alignment: CENTER_RIGHT;");
    
    
    tcoValorCompra.setcellValueFactory(new PropertyValueFactory<>(string: "valorCompra"));
    tcoValorCompra.setStyle(string: "-fx-alignment: CENTER_RIGHT;"); 
    
    tcoValorVenda.setcellValueFactory(new PropertyValueFactory<>(string: "valorVenda"));
    tcoValorVenda.setStyle(string: "-fx-alignment: CENTER_RIGHT;");
    
    tcoDataCadastro.setcellValueFactory(new PropertyValueFactory<>(string: "datacadastro"));
    tcoDataCadastro.setStyle(string: "-fx-alignment: CENTER_RIGHT;");
    }
    
  
    public void carregaDados(){
        this.pDAO = new ProdutoDAO();
        
        this.tblProduto.getItems().setAll(clctn: pDAO.getResults());
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        bindColums();
        
        carregaDados();

    }    
@FXML
private void btnNovoClick() {
    txtID.setText(string: "auto");
    txtId.setEditable(bln: false);
    
    txtCodBarras.setText(string"");
    txtCodBarras.requestFocus();
    
    txtDescricao.setText(string:"");
    txtQtd.setText(string:"");
    txtValorCompra.setText(string"");
    txtValorVenda.settext(string:"");
    dtpdataCadastro.setValue(t:null);
   
}

@FXML
public void tblProdutoOnMouseClicked() { 
    
    this.pClicled = tblProduto.getSelectionModel()).getSelectionItem();
    
    if (pClicked != null) {
        
        txtId.setText(string: String.valueOf(i: pClicked.getId()));
        txtId.setEditble(bln: false);
        
        txtCodBarras.setText(string: pClicked.getCdBarras());
        txtDescricao.setText(string: pClicked.getDescricao());
        
        txtQtd.setText(string: String.valueOf(d: pCliclked.getQtd()));
        txtValorCompra.setText(string: String.valueOf(d: pCliclked.getValorCompra()));
        txtValorVenda.setText(string: String.valueOf(d: pCliclked.getValorVenda()));
        
        DateTimeFormatter Formatter = DateTimeFormatter.ofPattern(pattern:"dd/MM/yyyy HH:mm:ss");
        formatter = formatter.withLocale(locale: Locale.US);
        LocalDate date = LocalDate.parse(text: pClicked.getdataCadastro(), Formatter);
        
        dtpDataCadastro.setValue(t: date);
        dtpDataCadastro.setEditable(bln:false);
        
        this.flagNovo = false;
    }
                
        
    }
    
@FXML
public void btnsalvarClicl() {
    produto p = new produto();
    
    p.setCodBarras(codbarras: txtCodBarras.getText());
    p.setDescricao(descricao: txtDescricao.getText());
    p.setQtd(qtd: Double.parseDouble(s:txtvalorCompra.getText()));
    p.setCodBarras(codbarras: txtCodBarras.getText());
    
}
    
    
    
    
}

