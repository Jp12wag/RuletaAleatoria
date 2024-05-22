/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import ruletaaleatorio.RuletaAleatorio;

/**
 *
 * @author Wagner Alcantara
 */
public class generarExcel {
  public void GenerarExcel(int candidato, List<String> colegiosAsignados,List<ColegioElectoral> recintos) throws IOException {
       String nombreArchivo = "Candidato_" + candidato + ".xlsx";
        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Colegios");

            // Encabezado
            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("Colegio");
            headerRow.createCell(1).setCellValue("Zona");
            headerRow.createCell(2).setCellValue("Recinto");

            // Datos
            int rowNum = 1;
            for (String colegio : colegiosAsignados) {
               ColegioElectoral recintoAsociado = null;
                for (ColegioElectoral recinto : recintos) {
                    if (recinto.colegio.contains(colegio)) {
                        recintoAsociado = recinto;
                        break;
                    }
                }
                if (recintoAsociado != null) {
                    Row row = sheet.createRow(rowNum++);
                    row.createCell(0).setCellValue(colegio);
                    row.createCell(1).setCellValue(recintoAsociado.zona);
                    row.createCell(2).setCellValue(recintoAsociado.recintos);
                }
            }

            // Escribir al archivo
            try (FileOutputStream fileOut = new FileOutputStream(nombreArchivo)) {
                workbook.write(fileOut);
            }
        }
    }  
}
