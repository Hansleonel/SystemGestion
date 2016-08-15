/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author kandskat
 */
public class L_POIExcel {

    public void Exportar(JTable Tbl_OT_Eventos_MostrandoExportar) throws Exception{
        JFileChooser selector = new JFileChooser();
        selector.setFileFilter(new FileNameExtensionFilter("Excel 2010 or Superior","xlsx"));
        //selector.setFileFilter(new FileNameExtensionFilter("Excel with Macrs", "xlsm"));
        int numfila = Tbl_OT_Eventos_MostrandoExportar.getRowCount();
        int numcolumn = Tbl_OT_Eventos_MostrandoExportar.getColumnCount();
        
        String directorio="";
        String extension="";
        
        boolean seleccion = false;
        
        int resultado = selector.showOpenDialog(null);
        
        switch(resultado){
            case JFileChooser.APPROVE_OPTION:
                directorio = selector.getSelectedFile().getPath();
                
                int i = directorio.lastIndexOf('.');
                if(i >= 0){
                    extension = directorio.substring(i+1);
                }
                seleccion = true;
                
                JOptionPane.showMessageDialog(null, "Seleccionaste"+directorio);
                break;
            case JFileChooser.CANCEL_OPTION:
                seleccion = false;
                JOptionPane.showMessageDialog(null, "No seleccionaste un archivo");
                break;
            case JFileChooser.ERROR_OPTION:
                seleccion = false;
                JOptionPane.showMessageDialog(null, "Ocurreo un Error");
                break;
            default:
                break;
        }
        
        if(extension.equals("xlsx")){
            FileInputStream entrada = new FileInputStream(new File(directorio));
            XSSFWorkbook xlsx = new XSSFWorkbook(entrada);
            XSSFSheet hoja = xlsx.getSheetAt(0);
            Row fila = null;
            Cell celda = null;                       
            try {
                //EN CASO CELDAS TENGAN ALGUN VALOR
                //PODEMOS MANEJAR DICHO VALOR O SOBREESCRIBIR SOBRE EL COMO EN EL SIGUIENTE CASO
                //fila = hoja.getRow(0);
                //celda = fila.getCell(0);
                //celda.setCellValue(1);
                
                //fila = hoja.getRow(7);
                //celda = fila.getCell(6);
                //celda.setCellValue(9);
                for(int i = -1; i < numfila; i++){
                    //esta linea posiciona donde se empezara a escribir en este caso en la fila 4
                    //recuerda que tanto fila como columna inician su conteo con 0
                    fila = hoja.getRow(i+14);
                    for(int j = 0; j < numcolumn; j++){
                        celda = fila.getCell(j);
                        if(i == -1){
                            celda.setCellValue(String.valueOf(Tbl_OT_Eventos_MostrandoExportar.getColumnName(j)));
                        }
                        else{
                            celda.setCellValue(String.valueOf(Tbl_OT_Eventos_MostrandoExportar.getValueAt(i, j)));
                        }
                    }
                }                
            } catch (NullPointerException NPE) {
                //EN CSAO LAS CELDAS ESTE VACIAS
                //ESCRIBIMOS UN VALOR SOBRE ELLAS
                for(int i = -1; i < numfila; i++){
                    Row filaV = hoja.createRow(i+14);
                    for(int j = 0; j < numcolumn; j++){
                        Cell celdaV= filaV.createCell(j);
                        if(i == -1){
                            celdaV.setCellValue(String.valueOf(Tbl_OT_Eventos_MostrandoExportar.getColumnName(j)));
                        }
                        else{
                            celdaV.setCellValue(String.valueOf(Tbl_OT_Eventos_MostrandoExportar.getValueAt(i, j)));
                        }
                    }
                }
            }
            //EVALUA LAS FORMULAS DEL WORKBK
            XSSFFormulaEvaluator.evaluateAllFormulaCells(xlsx);
            
            entrada.close();
            
            //ABRIENDO ARCHIVO PARA ESCRITURA
            FileOutputStream salida = new FileOutputStream(new File(directorio));
            //ESCRIBIENDO DATOS, EN ESTE CASO DE LA TABLA
            xlsx.write(salida);
            
            salida.close();
        }
    }

    public void Exportar_To_Mcr() throws Exception{
        
    }
    
}
