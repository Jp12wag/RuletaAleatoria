/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ruletaaleatorio;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Wagner Alcantara
 */
public class RuletaAleatorio {

    /**
     * @param args the command line arguments
     */
    static class ColegioElectoral {

        String zona;
        List<String> colegio;
        String recintos;

        public ColegioElectoral(String zona, List<String> colegio, String recintos) {
            this.zona = zona;
            this.colegio = colegio;
            this.recintos = recintos;
        }

        @Override
        public String toString() {
            return zona + "-" + colegio + " (" + recintos.length() + " recintos)";
        }
    }
    
   

    // Método para generar una lista de recintos para una zona específica
    private static List<ColegioElectoral> generarRecintosPorZona(String zona) {
        List<ColegioElectoral> recintos = new ArrayList<>();
        // Se puede agregar lógica para asignar recintos específicos a cada zona
       
        switch (zona) {

            case "A" -> {
                List<String> colegiosRecinto1 = new ArrayList<>();
                colegiosRecinto1.add("1256");
                colegiosRecinto1.add("1256A");
                colegiosRecinto1.add("1256B");
                colegiosRecinto1.add("1256C");
                colegiosRecinto1.add("1256D");
                colegiosRecinto1.add("1256E");
                colegiosRecinto1.add("1259");
                colegiosRecinto1.add("1259A");
                colegiosRecinto1.add("12569B");
                colegiosRecinto1.add("1259C");
                List<String> colegiosRecinto2 = new ArrayList<>();
                colegiosRecinto2.add("1694");
                colegiosRecinto2.add("1711");
                colegiosRecinto2.add("1825");
                colegiosRecinto2.add("1928");
                List<String> colegiosRecinto3 = new ArrayList<>();
                colegiosRecinto3.add("1798");
                colegiosRecinto3.add("1885");
                colegiosRecinto3.add("1827");
                colegiosRecinto3.add("1912");

                recintos.add(new ColegioElectoral(zona, colegiosRecinto1, "00305-Escuela Primaria Rafaela Santaella"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto2, "00461-Club Accion Juvenil Quisqueyano"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto3, "000520-Colegio Evangelico Shalom"));
            }
            case "A1" -> {
                List<String> colegiosRecinto1 = new ArrayList<>();
                colegiosRecinto1.add("1312A");
                colegiosRecinto1.add("1644");
                colegiosRecinto1.add("1690");
                colegiosRecinto1.add("1738");
                colegiosRecinto1.add("1788");
                colegiosRecinto1.add("1846");
                colegiosRecinto1.add("1866");
                colegiosRecinto1.add("1925");
                List<String> colegiosRecinto2 = new ArrayList<>();
                colegiosRecinto2.add("1746");
                colegiosRecinto2.add("1795");
                colegiosRecinto2.add("1838");
                colegiosRecinto2.add("1881");
                colegiosRecinto2.add("1932");
                List<String> colegiosRecinto3 = new ArrayList<>();
                colegiosRecinto3.add("1260");
                colegiosRecinto3.add("1260A");
                colegiosRecinto3.add("1260B");
                colegiosRecinto3.add("1260C");
                colegiosRecinto3.add("1261");
                colegiosRecinto3.add("1261A");
                colegiosRecinto3.add("1312");
                colegiosRecinto3.add("1939");

                recintos.add(new ColegioElectoral(zona, colegiosRecinto1, "00457-CENTRO COMUNAL EL CAFE"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto2, "00512- ESCUELA BASICA  CAFE CON LECHE"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto3, "00545-LICEO CARMEN LUISA DE LOS SANTOS"));

            }
            case "B" -> {
                List<String> colegiosRecinto1 = new ArrayList<>();
                colegiosRecinto1.add("1250");
                colegiosRecinto1.add("1250A");
                colegiosRecinto1.add("1250B");
                colegiosRecinto1.add("1848");
                List<String> colegiosRecinto2 = new ArrayList<>();
                colegiosRecinto2.add("1252");
                colegiosRecinto2.add("1252A");
                colegiosRecinto2.add("1252B");
                colegiosRecinto2.add("1252C");
                colegiosRecinto2.add("1252D");
                colegiosRecinto2.add("1254");
                colegiosRecinto2.add("1254A");
                colegiosRecinto2.add("1254B");
                colegiosRecinto2.add("1255");
                colegiosRecinto2.add("1255A");
                colegiosRecinto2.add("1255B");
                colegiosRecinto2.add("1311");
                colegiosRecinto2.add("1311A");
                colegiosRecinto2.add("1311B");
                colegiosRecinto2.add("1334");
                colegiosRecinto2.add("1334A");
                colegiosRecinto2.add("1334B");
                colegiosRecinto2.add("1643");
                colegiosRecinto2.add("1643A");
                colegiosRecinto2.add("1643B");
                List<String> colegiosRecinto3 = new ArrayList<>();
                colegiosRecinto3.add("1251");
                colegiosRecinto3.add("1251A");
                colegiosRecinto3.add("1251B");

                List<String> colegiosRecinto4 = new ArrayList<>();
                colegiosRecinto4.add("1691");
                colegiosRecinto4.add("1764");
                colegiosRecinto4.add("1789");
                colegiosRecinto4.add("1823");
                colegiosRecinto4.add("1867");

                List<String> colegiosRecinto5 = new ArrayList<>();
                colegiosRecinto5.add("1801");
                colegiosRecinto5.add("1253");
                colegiosRecinto5.add("1253A");
                colegiosRecinto5.add("1887");
                List<String> colegiosRecinto6 = new ArrayList<>();
                colegiosRecinto6.add("1778");
                colegiosRecinto6.add("1883");

                List<String> colegiosRecinto7 = new ArrayList<>();
                colegiosRecinto7.add("1380");
                colegiosRecinto7.add("1380A");
                colegiosRecinto7.add("1380B");
                colegiosRecinto7.add("1380C");
                colegiosRecinto7.add("1821");
                colegiosRecinto7.add("1861");

                recintos.add(new ColegioElectoral(zona, colegiosRecinto1, "00260-CLINICA DIAZ PIÑEYRO"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto2, "00261-ESCUELA NUESTRA SEÑORA DE ALTAGRACIA"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto3, "00262-PARROQIA NUESTRA SEÑORA DE LA ALTAGRACIA"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto4, "00549-CENTRO DE FORMACION AMOS"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto5, "00523-POLITECNICO TURISTICO CENTRO PÁRROQUIAL SANTO SOCORRO"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto6, "00517-SALON PARROQUIAL"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto7, "00417-CENTRO DE ESTUDIOS PENIEL"));

            }
            case "C" -> {
                List<String> colegiosRecinto1 = new ArrayList<>();
                colegiosRecinto1.add("1241");
                colegiosRecinto1.add("1241A");
                colegiosRecinto1.add("1241B");
                colegiosRecinto1.add("1242");
                colegiosRecinto1.add("1242A");
                colegiosRecinto1.add("1242B");
                colegiosRecinto1.add("1640");

                List<String> colegiosRecinto2 = new ArrayList<>();
                colegiosRecinto2.add("1751");
                colegiosRecinto2.add("1844");
                colegiosRecinto2.add("1850");
                colegiosRecinto2.add("1894");
                colegiosRecinto2.add("1898");
                colegiosRecinto2.add("1934");
                List<String> colegiosRecinto3 = new ArrayList<>();
                colegiosRecinto3.add("1719");
                colegiosRecinto3.add("1773");
                colegiosRecinto3.add("1876");
                colegiosRecinto3.add("1931");

                List<String> colegiosRecinto4 = new ArrayList<>();
                colegiosRecinto4.add("1699");
                colegiosRecinto4.add("1716");
                colegiosRecinto4.add("1770");
                colegiosRecinto4.add("1842");
                colegiosRecinto4.add("1872");
                colegiosRecinto4.add("1930");

                recintos.add(new ColegioElectoral(zona, colegiosRecinto1, "00357-ESCUELA PRIMARIA E. INTERMEDIA ESTEBAN MARTINEZ"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto2, "00536-LICEO PROFESOR ANDRES"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto3, "00498-COLEGIO GREGORIO LUPERON"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto4, "00488-ESCUELA PRIMARIA VILLA NAZARET"));

            }
            case "D" -> {
                List<String> colegiosRecinto1 = new ArrayList<>();
                colegiosRecinto1.add("1258");
                colegiosRecinto1.add("1258A");
                colegiosRecinto1.add("1258B");
                colegiosRecinto1.add("1258C");
                colegiosRecinto1.add("1258D");
                colegiosRecinto1.add("1258E");
                colegiosRecinto1.add("1258F");
                colegiosRecinto1.add("1646");
                colegiosRecinto1.add("1646A");
                colegiosRecinto1.add("1816");
                List<String> colegiosRecinto2 = new ArrayList<>();
                colegiosRecinto2.add("1800");
                colegiosRecinto2.add("1886");

                List<String> colegiosRecinto3 = new ArrayList<>();
                colegiosRecinto3.add("1830");
                colegiosRecinto3.add("1893");

                recintos.add(new ColegioElectoral(zona, colegiosRecinto1, "00306-ESCUELA CAMILA HENRIQUEZ"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto2, "00522-CENTRO DE ESTUDIO HUERTO DEL EDEN"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto3, "00534-SALON MULTIUSO EL ABANICO"));

            }
            case "E" -> {
                List<String> colegiosRecinto1 = new ArrayList<>();
                colegiosRecinto1.add("1244");
                colegiosRecinto1.add("1244A");
                colegiosRecinto1.add("1244B");
                colegiosRecinto1.add("1244C");
                colegiosRecinto1.add("1245");
                colegiosRecinto1.add("1245A");
                colegiosRecinto1.add("1915");

                List<String> colegiosRecinto2 = new ArrayList<>();
                colegiosRecinto2.add("1721");
                colegiosRecinto2.add("1774");
                colegiosRecinto2.add("1826");
                colegiosRecinto2.add("1877");
                List<String> colegiosRecinto3 = new ArrayList<>();
                colegiosRecinto3.add("1238");
                colegiosRecinto3.add("1238A");
                colegiosRecinto3.add("1238B");
                colegiosRecinto3.add("1239");
                colegiosRecinto3.add("1239A");
                colegiosRecinto3.add("1917");

                List<String> colegiosRecinto4 = new ArrayList<>();
                colegiosRecinto4.add("1240");
                colegiosRecinto4.add("1240A");
                colegiosRecinto4.add("1240B");
                colegiosRecinto4.add("1308");
                colegiosRecinto4.add("1308A");
                colegiosRecinto4.add("1308B");
                colegiosRecinto4.add("1750");
                colegiosRecinto4.add("1377");
                colegiosRecinto4.add("1377A");
                colegiosRecinto4.add("1377B");
                colegiosRecinto4.add("1426");
                colegiosRecinto4.add("1426A");
                colegiosRecinto4.add("1782");
                colegiosRecinto4.add("1817");
                List<String> colegiosRecinto5 = new ArrayList<>();
                colegiosRecinto5.add("1720");
                colegiosRecinto5.add("1735");

                recintos.add(new ColegioElectoral(zona, colegiosRecinto1, "00264-COLEGIO AMERICO LUGO"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto2, "00500-COLEGIO ADVENTISTA BETEL"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto3, "00354-COLEGIO EL BUEN PASTOR"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto4, "00355-COLEGIO LA HORA DEE DIOS"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto5, "00535-ESCUELA PRIMARIA LOS AMIGUITOS"));

            }
            case "F" -> {
                List<String> colegiosRecinto1 = new ArrayList<>();
                colegiosRecinto1.add("1217");
                colegiosRecinto1.add("1217A");
                colegiosRecinto1.add("1218");
                colegiosRecinto1.add("1218A");
                colegiosRecinto1.add("1218B");
                colegiosRecinto1.add("1632");
                colegiosRecinto1.add("1722");
                colegiosRecinto1.add("1756");
                colegiosRecinto1.add("1757");
                colegiosRecinto1.add("1831");
                colegiosRecinto1.add("1857");
                colegiosRecinto1.add("1920");

                List<String> colegiosRecinto2 = new ArrayList<>();
                colegiosRecinto2.add("1364");
                colegiosRecinto2.add("1364A");
                colegiosRecinto2.add("1364B");
                colegiosRecinto2.add("1783");
                colegiosRecinto2.add("1862");

                recintos.add(new ColegioElectoral(zona, colegiosRecinto1, "00366-ESCUELA PRIMARIA NICOLAS UREÑA DE MENDOZA"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto2, "00428-ESCUELA DOÑA FILOMENA CANALDA"));

            }
            case "G" -> {
                List<String> colegiosRecinto1 = new ArrayList<>();
                colegiosRecinto1.add("1232");
                colegiosRecinto1.add("1232A");
                colegiosRecinto1.add("1232B");
                colegiosRecinto1.add("1233");
                colegiosRecinto1.add("1233A");
                colegiosRecinto1.add("1345");
                colegiosRecinto1.add("1345A");
                List<String> colegiosRecinto2 = new ArrayList<>();
                colegiosRecinto2.add("1275");
                colegiosRecinto2.add("1275A");
                colegiosRecinto2.add("1275B");
                colegiosRecinto2.add("1275C");
                colegiosRecinto2.add("1345B");
                colegiosRecinto2.add("1639");
                colegiosRecinto2.add("1807");
                colegiosRecinto2.add("1818");
                colegiosRecinto2.add("1854");

                List<String> colegiosRecinto3 = new ArrayList<>();
                colegiosRecinto3.add("1247");
                colegiosRecinto3.add("1247A");
                colegiosRecinto3.add("1248");
                colegiosRecinto3.add("1248A");
                colegiosRecinto3.add("1248B");
                colegiosRecinto3.add("1642");

                List<String> colegiosRecinto4 = new ArrayList<>();
                colegiosRecinto4.add("1680");
                colegiosRecinto4.add("1792");

                recintos.add(new ColegioElectoral(zona, colegiosRecinto1, "00363ESCUELA PRIMARIA DUARTE"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto2, "00353-HOSPITAL ZONA NORTE-MARCELINO VELEZ"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto3, "00430-ESCUELA PRIMARIA RENOVACION"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto4, "00479-CENTRO DE ESTUDIO PROGRESO"));

            }
            case "H" -> {
                List<String> colegiosRecinto1 = new ArrayList<>();
                colegiosRecinto1.add("1431");
                colegiosRecinto1.add("1431A");
                colegiosRecinto1.add("1431B");
                colegiosRecinto1.add("1752");
                colegiosRecinto1.add("1852");
                colegiosRecinto1.add("1900");

                List<String> colegiosRecinto2 = new ArrayList<>();
                colegiosRecinto2.add("1729");
                colegiosRecinto2.add("1776");

                recintos.add(new ColegioElectoral(zona, colegiosRecinto1, "00360-ESCUELA BASICA ANTIGUA Y BARBADOS"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto2, "00508-ESCUELA PRIMARIA MADRE TERESA DE CALCUTA"));

            }
            case "I" -> {
                List<String> colegiosRecinto1 = new ArrayList<>();
                colegiosRecinto1.add("1228");
                colegiosRecinto1.add("1228A");
                colegiosRecinto1.add("1228B");
                colegiosRecinto1.add("1229");
                colegiosRecinto1.add("1229A");
                colegiosRecinto1.add("1229B");
                colegiosRecinto1.add("1634");
                colegiosRecinto1.add("1634A");
                colegiosRecinto1.add("1781");
                colegiosRecinto1.add("1851");
                List<String> colegiosRecinto2 = new ArrayList<>();
                colegiosRecinto2.add("1226");
                colegiosRecinto2.add("1226A");
                colegiosRecinto2.add("1227");
                colegiosRecinto2.add("1227A");
                colegiosRecinto1.add("1227B");
                colegiosRecinto1.add("1230");
                colegiosRecinto1.add("1230A");
                colegiosRecinto1.add("1230B");
                colegiosRecinto1.add("1784");
                colegiosRecinto1.add("1813");
                List<String> colegiosRecinto3 = new ArrayList<>();
                colegiosRecinto3.add("1306");
                colegiosRecinto3.add("1306A");
                colegiosRecinto3.add("1357");
                colegiosRecinto3.add("1357A");
                colegiosRecinto1.add("1357B");

                List<String> colegiosRecinto4 = new ArrayList<>();
                colegiosRecinto4.add("1689");
                colegiosRecinto4.add("1822");

                recintos.add(new ColegioElectoral(zona, colegiosRecinto1, "00359-ESCUELA PRIMARIA INICIAL Y BASICA BARBADOS"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto2, "00431-ESCUELA PUBLICA LAS MERCEDES"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto3, "00358-ESCUELA EMMA BALAGUER DE VALLEJO"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto4, "00456-COLEGIO PSICO-EDUCATIVO GETSEMANI"));

            }
            case "J" -> {
                List<String> colegiosRecinto1 = new ArrayList<>();
                colegiosRecinto1.add("1271");
                colegiosRecinto1.add("1271A");
                colegiosRecinto1.add("1271B");
                colegiosRecinto1.add("1271C");
                colegiosRecinto1.add("1271D");
                colegiosRecinto1.add("1271E");
                colegiosRecinto1.add("1271F");
                colegiosRecinto1.add("1272");
                colegiosRecinto1.add("1272A");
                colegiosRecinto1.add("1272B");
                colegiosRecinto1.add("1272C");
                colegiosRecinto1.add("1272D");
                colegiosRecinto1.add("1273");
                colegiosRecinto1.add("1273A");
                colegiosRecinto1.add("1274");
                colegiosRecinto1.add("1274A");
                colegiosRecinto1.add("1274B");
                List<String> colegiosRecinto2 = new ArrayList<>();
                colegiosRecinto2.add("1697");
                colegiosRecinto2.add("1762");
                colegiosRecinto2.add("1871");

                List<String> colegiosRecinto3 = new ArrayList<>();
                colegiosRecinto3.add("1797");
                colegiosRecinto3.add("1884");
                colegiosRecinto3.add("1911");

                recintos.add(new ColegioElectoral(zona, colegiosRecinto1, "00370-POLITECNICO LAS CAOBAS"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto2, "00477-UNIVERSIDAD ODONTOLOGICA"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto3, "00519-CENTRO EDUCATIVO FE Y ALEGRIA , LOS OLIVOS"));

            }
            case "K" -> {
                List<String> colegiosRecinto1 = new ArrayList<>();
                colegiosRecinto1.add("1249");
                colegiosRecinto1.add("1249A");
                colegiosRecinto1.add("1249B");
                colegiosRecinto1.add("1267");
                colegiosRecinto1.add("1267A");
                colegiosRecinto1.add("1267B");
                colegiosRecinto1.add("1267C");
                colegiosRecinto1.add("1310");
                colegiosRecinto1.add("1310A");
                colegiosRecinto1.add("1362");
                List<String> colegiosRecinto2 = new ArrayList<>();
                colegiosRecinto2.add("1688");
                colegiosRecinto2.add("1743");
                colegiosRecinto2.add("1765");
                colegiosRecinto2.add("1790");
                colegiosRecinto2.add("1824");
                colegiosRecinto2.add("1868");
                colegiosRecinto2.add("1906");
                colegiosRecinto2.add("1926");
                List<String> colegiosRecinto3 = new ArrayList<>();
                colegiosRecinto3.add("1641A");
                colegiosRecinto3.add("1641B");
                colegiosRecinto3.add("1687");
                colegiosRecinto3.add("1791");
                colegiosRecinto3.add("1869");
                colegiosRecinto3.add("1927");
                List<String> colegiosRecinto4 = new ArrayList<>();
                colegiosRecinto4.add("1677");
                colegiosRecinto4.add("1677A");
                colegiosRecinto4.add("1677B");
                colegiosRecinto4.add("1742");
                colegiosRecinto4.add("1761");
                colegiosRecinto4.add("1820");
                colegiosRecinto4.add("1860");
                colegiosRecinto4.add("1905");
                List<String> colegiosRecinto5 = new ArrayList<>();
                colegiosRecinto5.add("1362");
                colegiosRecinto5.add("1362A");
                colegiosRecinto5.add("1641");
                colegiosRecinto5.add("1243");
                colegiosRecinto4.add("1243A");
                colegiosRecinto4.add("1243B");
                colegiosRecinto4.add("1243C");
                colegiosRecinto4.add("1243D");
                colegiosRecinto4.add("1245B");
                colegiosRecinto4.add("1246");
                colegiosRecinto4.add("1246A");
                colegiosRecinto4.add("1310B");
                colegiosRecinto4.add("1814");
                colegiosRecinto4.add("1891");
                colegiosRecinto4.add("1749");

                recintos.add(new ColegioElectoral(zona, colegiosRecinto1, "00307-ESCUELA BASICA LIC. CRISTOBALINA BATISTA TAVAREZ"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto2, "00459-UNIVERSIDAD UTESA"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto3, "00460-UNIVERSIDAD FEDERICO HENRIQUEZ CARVAJAL"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto4, "00416-ESCUELA BASICA CURAZAO"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto5, "00546-LICEO PEDRO APONTE"));

            }
            case "L" -> {
                List<String> colegiosRecinto1 = new ArrayList<>();
                colegiosRecinto1.add("1216");
                colegiosRecinto1.add("1216A");
                colegiosRecinto1.add("1216B");
                colegiosRecinto1.add("1216C");
                colegiosRecinto1.add("1913");

                List<String> colegiosRecinto2 = new ArrayList<>();
                colegiosRecinto2.add("1631");
                colegiosRecinto2.add("1701");
                colegiosRecinto2.add("1741");
                colegiosRecinto2.add("1760");
                colegiosRecinto2.add("1819");
                colegiosRecinto2.add("1859");
                colegiosRecinto2.add("1904");
                colegiosRecinto2.add("1921");
                List<String> colegiosRecinto3 = new ArrayList<>();
                colegiosRecinto3.add("1703");
                colegiosRecinto3.add("1734");
                colegiosRecinto3.add("1744");
                colegiosRecinto3.add("1771");
                colegiosRecinto3.add("1811");
                colegiosRecinto3.add("1841");
                colegiosRecinto3.add("1874");
                colegiosRecinto3.add("1907");

                recintos.add(new ColegioElectoral(zona, colegiosRecinto1, "00547-ESCUELA BASICA PETRONILA TRINIDAD"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto2, "00369-ESCUELA DE EDUCACION BASICA SAN MIGUEL"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto3, "00490-ESCUELA BASICA JAPON"));

            }
            case "M" -> {
                List<String> colegiosRecinto1 = new ArrayList<>();
                colegiosRecinto1.add("1215");
                colegiosRecinto1.add("1215A");
                colegiosRecinto1.add("1630");
                colegiosRecinto1.add("1902");
                colegiosRecinto1.add("1919");

                List<String> colegiosRecinto2 = new ArrayList<>();
                colegiosRecinto2.add("1320");
                colegiosRecinto2.add("1320A");
                colegiosRecinto2.add("1320B");
                colegiosRecinto2.add("1702");
                colegiosRecinto2.add("1740");
                colegiosRecinto2.add("1755");
                colegiosRecinto2.add("1794");
                colegiosRecinto2.add("1845");
                colegiosRecinto2.add("1856");
                colegiosRecinto2.add("1873");
                colegiosRecinto2.add("1938");

                List<String> colegiosRecinto3 = new ArrayList<>();
                colegiosRecinto3.add("1745");
                colegiosRecinto3.add("1880");

                List<String> colegiosRecinto4 = new ArrayList<>();
                colegiosRecinto4.add("1829");
                colegiosRecinto4.add("1937");

                List<String> colegiosRecinto5 = new ArrayList<>();
                colegiosRecinto5.add("1897");

                recintos.add(new ColegioElectoral(zona, colegiosRecinto1, "00365-ESCUELA BASICA JAMAICA"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto2, "00544-LICEO ADELAIDA ACOSTA"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto3, "00511-CENTRO EDUCATIVO INDEPENDENCIA"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto4, "00542-ESCUELA BASICA NUESTRA SEÑORA DE LAS MERCEDES"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto5, "00539-ESCUELA BASICA GENERAL JOSE DE SAN MARTIN"));

            }
            case "N" -> {
                List<String> colegiosRecinto1 = new ArrayList<>();
                colegiosRecinto1.add("1221");
                colegiosRecinto1.add("1221A");
                colegiosRecinto1.add("1221B");
                colegiosRecinto1.add("1222");
                colegiosRecinto1.add("1222A");
                colegiosRecinto1.add("1737");
                colegiosRecinto1.add("1754");
                colegiosRecinto1.add("1808");
                colegiosRecinto1.add("1843");
                colegiosRecinto1.add("1855");
                colegiosRecinto1.add("1905");
                colegiosRecinto1.add("1918");
                List<String> colegiosRecinto2 = new ArrayList<>();
                colegiosRecinto2.add("1723");
                colegiosRecinto2.add("1775");
                colegiosRecinto2.add("1809");

                List<String> colegiosRecinto3 = new ArrayList<>();
                colegiosRecinto3.add("1896");
                colegiosRecinto3.add("1935");

                List<String> colegiosRecinto4 = new ArrayList<>();
                colegiosRecinto4.add("1835");
                colegiosRecinto4.add("1878");

                recintos.add(new ColegioElectoral(zona, colegiosRecinto1, "00364-CENTRO EDUCATIVA ROSA EVANGELINA SOLANO"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto2, "00502-ESCUELA PRIMARIA ELIZARDO TAMAREZ SANTAMARIA"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto3, "00538- LICEO PROFESOR VICTOR PASCUAL AGUERO"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto4, "00541-ESCUELA BASICA CONCEPCION BONA CALLE MELANIA CORDERO"));

            }
            case "Ñ" -> {
                List<String> colegiosRecinto1 = new ArrayList<>();
                colegiosRecinto1.add("1257");
                colegiosRecinto1.add("1257A");
                colegiosRecinto1.add("1356");
                colegiosRecinto1.add("1916");

                List<String> colegiosRecinto2 = new ArrayList<>();
                colegiosRecinto2.add("1356A");
                colegiosRecinto2.add("1645");
                colegiosRecinto2.add("1698");
                colegiosRecinto2.add("1786");

                recintos.add(new ColegioElectoral(zona, colegiosRecinto1, "00308-SINDICATO UNIDO DE TRABAJADORES PORTUARIOS"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto2, "00453-ESCUELA PADRE MARTIN EGUZQUIZA"));

            }
            case "O" -> {
                List<String> colegiosRecinto1 = new ArrayList<>();
                colegiosRecinto1.add("1223");
                colegiosRecinto1.add("1223A");
                colegiosRecinto1.add("1223B");
                colegiosRecinto1.add("1223C");
                colegiosRecinto1.add("1223D");
                colegiosRecinto1.add("1762");
                colegiosRecinto1.add("1785");
                colegiosRecinto1.add("1863");
                colegiosRecinto1.add("1922");

                List<String> colegiosRecinto2 = new ArrayList<>();
                colegiosRecinto2.add("1224");
                colegiosRecinto2.add("1224A");
                colegiosRecinto2.add("1224B");
                colegiosRecinto2.add("1225");
                colegiosRecinto2.add("1225A");
                colegiosRecinto2.add("1633");
                colegiosRecinto2.add("1724");
                List<String> colegiosRecinto3 = new ArrayList<>();
                colegiosRecinto3.add("1777");
                List<String> colegiosRecinto4 = new ArrayList<>();
                colegiosRecinto3.add("1758");
                colegiosRecinto3.add("1803");
                colegiosRecinto3.add("1809");
                colegiosRecinto3.add("1858");
                colegiosRecinto3.add("1889");
                colegiosRecinto3.add("1974");
                colegiosRecinto3.add("1940");

                recintos.add(new ColegioElectoral(zona, colegiosRecinto1, "00435-LICEO SECUNDARIO LAS AMERICAS"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto2, "00367-ESCUELA PRIMARIA RURAL"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto3, "00516-COLEGIO LOS QUERUBINES"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto4, "00548-LICEO PROFESOR CELESTE AIDA DEL VILLAR"));

            }
            case "P" -> {
                List<String> colegiosRecinto1 = new ArrayList<>();
                colegiosRecinto1.add("1234");
                colegiosRecinto1.add("123A");
                colegiosRecinto1.add("1235");
                colegiosRecinto1.add("1235A");
                colegiosRecinto1.add("1235B");
                colegiosRecinto1.add("1384");
                colegiosRecinto1.add("1384A");
                colegiosRecinto1.add("1485");
                colegiosRecinto1.add("1485A");
                colegiosRecinto1.add("14855B");
                List<String> colegiosRecinto2 = new ArrayList<>();
                colegiosRecinto2.add("1307");
                colegiosRecinto2.add("1307A");
                colegiosRecinto2.add("1333");
                colegiosRecinto2.add("1333A");
                colegiosRecinto2.add("1333B");
                colegiosRecinto2.add("1391");
                colegiosRecinto2.add("1391A");
                colegiosRecinto2.add("1418");
                colegiosRecinto2.add("1418A");
                colegiosRecinto2.add("1418B");
                colegiosRecinto2.add("1635");
                colegiosRecinto2.add("1635A");
                colegiosRecinto2.add("1636");
                colegiosRecinto2.add("1636A");
                colegiosRecinto2.add("1637");
                colegiosRecinto2.add("1679");
                colegiosRecinto2.add("1793");
                List<String> colegiosRecinto3 = new ArrayList<>();
                colegiosRecinto3.add("0001");
                colegiosRecinto3.add("1748");
                colegiosRecinto3.add("1806");
                colegiosRecinto3.add("1847");
                colegiosRecinto2.add("1899");
                List<String> colegiosRecinto4 = new ArrayList<>();
                colegiosRecinto3.add("1815");
                colegiosRecinto3.add("1892");

                recintos.add(new ColegioElectoral(zona, colegiosRecinto1, "00551-ESCUELA RAMON JULIAN PEÑA"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto2, "00358-ESCUELA EMMA BALAGUER DE VALLEJO"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto3, "00001-COLEGIO EL ANGEL"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto4, "00530-COLEGIO EFMAMJJASOND"));

            }
            case "Q" -> {
                List<String> colegiosRecinto1 = new ArrayList<>();
                colegiosRecinto1.add("1231");
                colegiosRecinto1.add("1231A");
                colegiosRecinto1.add("1231B");
                colegiosRecinto1.add("1231C");
                colegiosRecinto1.add("1262");
                colegiosRecinto1.add("1262A");

                List<String> colegiosRecinto2 = new ArrayList<>();
                colegiosRecinto2.add("1705");
                colegiosRecinto2.add("1772");
                colegiosRecinto2.add("1812");
                colegiosRecinto2.add("1837");
                colegiosRecinto2.add("1875");
                colegiosRecinto2.add("1908");

                List<String> colegiosRecinto3 = new ArrayList<>();
                colegiosRecinto3.add("1403");
                colegiosRecinto3.add("1403A");
                colegiosRecinto3.add("1403B");
                colegiosRecinto3.add("1483");
                colegiosRecinto3.add("1483A");
                colegiosRecinto2.add("1483B");
                colegiosRecinto2.add("1484");
                colegiosRecinto2.add("1484A");
                colegiosRecinto2.add("1484B");
                List<String> colegiosRecinto4 = new ArrayList<>();
                colegiosRecinto3.add("1686");
                colegiosRecinto3.add("1802");
                colegiosRecinto3.add("18888");

                recintos.add(new ColegioElectoral(zona, colegiosRecinto1, "00487-ESCUELA VEDRUNA"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto2, "00492-COLEGIO SANTA MARIA"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto3, "00425-ESCUELA BASICA LAS PALMAS"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto4, "00524-ESCUELA FRANCISCO ALBERTO CAMAÑO"));

            }
            case "R" -> {
                List<String> colegiosRecinto1 = new ArrayList<>();
                colegiosRecinto1.add("1375F");
                colegiosRecinto1.add("1692");
                colegiosRecinto1.add("1710");
                colegiosRecinto1.add("1753");
                colegiosRecinto1.add("1763");
                colegiosRecinto1.add("1810");
                colegiosRecinto1.add("1833");
                colegiosRecinto1.add("1853");
                colegiosRecinto1.add("1865");
                colegiosRecinto1.add("1924");
                List<String> colegiosRecinto2 = new ArrayList<>();
                colegiosRecinto2.add("1375");
                colegiosRecinto2.add("1375A");
                colegiosRecinto2.add("1375B");
                colegiosRecinto2.add("1375C");
                colegiosRecinto2.add("1375D");
                colegiosRecinto2.add("1375E");
                colegiosRecinto2.add("1725");
                colegiosRecinto2.add("1840");

                recintos.add(new ColegioElectoral(zona, colegiosRecinto1, "00361-ESCUELA ING. AGR. IVAN GUZMAN KLANG"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto2, "00455-EXTENSION DE LA UASD"));

            }
            case "S" -> {
                List<String> colegiosRecinto1 = new ArrayList<>();
                colegiosRecinto1.add("1236");
                colegiosRecinto1.add("1236A");
                colegiosRecinto1.add("1237");
                colegiosRecinto1.add("1279");
                colegiosRecinto1.add("1279A");
                colegiosRecinto1.add("1282");
                colegiosRecinto1.add("1282A");
                colegiosRecinto1.add("1284");
                colegiosRecinto1.add("1284A");
                colegiosRecinto1.add("1284B");
                colegiosRecinto1.add("1284C");
                colegiosRecinto1.add("1638");
                List<String> colegiosRecinto2 = new ArrayList<>();
                colegiosRecinto2.add("1638A");
                colegiosRecinto2.add("1638B");
                colegiosRecinto2.add("1693");
                colegiosRecinto2.add("1787");
                colegiosRecinto2.add("1864");
                colegiosRecinto2.add("1923");
                List<String> colegiosRecinto3 = new ArrayList<>();
                colegiosRecinto3.add("1486");
                colegiosRecinto3.add("1486A");
                colegiosRecinto3.add("1487");
                colegiosRecinto3.add("1487A");
                colegiosRecinto3.add("1488");
                colegiosRecinto3.add("1488A");

                recintos.add(new ColegioElectoral(zona, colegiosRecinto1, "00362-ESCUELA PRIM. BUENOS DIAS"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto2, "00454-CLUB 16 DE AGOSTO"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto3, "00543-ESCUELA PROFESO JUAN BOSCH"));

            }
            case "T" -> {

                List<String> colegiosRecinto1 = new ArrayList<>();
                colegiosRecinto1.add("1309");
                colegiosRecinto1.add("1309A");
                colegiosRecinto1.add("1309B");
                colegiosRecinto1.add("1309C");
                colegiosRecinto1.add("1695");
                colegiosRecinto1.add("1767");
                colegiosRecinto1.add("1828");
                colegiosRecinto1.add("1832");

                List<String> colegiosRecinto2 = new ArrayList<>();
                colegiosRecinto2.add("1329");
                colegiosRecinto2.add("1329A");
                colegiosRecinto2.add("1329B");
                colegiosRecinto2.add("1370");
                colegiosRecinto2.add("1370A");
                colegiosRecinto2.add("1370B");
                colegiosRecinto2.add("1849");
                List<String> colegiosRecinto3 = new ArrayList<>();
                colegiosRecinto3.add("1314");
                colegiosRecinto3.add("1314A");
                colegiosRecinto3.add("1314B");
                colegiosRecinto3.add("1314C");
                colegiosRecinto3.add("1314D");
                colegiosRecinto3.add("1314E");
                colegiosRecinto3.add("1314F");
                colegiosRecinto3.add("1804");
                colegiosRecinto3.add("1890");
                colegiosRecinto3.add("1696");
                colegiosRecinto3.add("1769");

                recintos.add(new ColegioElectoral(zona, colegiosRecinto1, "00476-ASOCIACION DE IMPEDIDOS FISICOS MOTORES"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto2, "00338-COMEDOR ECONOMICO"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto3, "00526-POLITENICO MADRE RAFAELA IBARRA"));

            }
            case "U" -> {

                List<String> colegiosRecinto1 = new ArrayList<>();
                colegiosRecinto1.add("1747");
                colegiosRecinto1.add("1796");
                colegiosRecinto1.add("1839");
                colegiosRecinto1.add("1882");
                colegiosRecinto1.add("1933");

                recintos.add(new ColegioElectoral(zona, colegiosRecinto1, "00513-ESC. BASICA HERMANA MIRABAL"));

            }

            case "W" -> {
                List<String> colegiosRecinto1 = new ArrayList<>();
                colegiosRecinto1.add("1726");
                colegiosRecinto1.add("1799");

                List<String> colegiosRecinto2 = new ArrayList<>();
                colegiosRecinto2.add("1727");
                colegiosRecinto2.add("1780");

                recintos.add(new ColegioElectoral(zona, colegiosRecinto1, "00550-COLEGIO DESTELLO DE LUZ"));
                recintos.add(new ColegioElectoral(zona, colegiosRecinto2, "00518-PROYECTO DESARROLLO COMUNITARIO INTEGRAL"));

            }
            case "X" -> {

                List<String> colegiosRecinto1 = new ArrayList<>();
                colegiosRecinto1.add("1736");
                colegiosRecinto1.add("1779");
                colegiosRecinto1.add("1879");

                recintos.add(new ColegioElectoral(zona, colegiosRecinto1, "00543-ESCUELA PROFESOR JUAN BOSCH GAVIÑO"));

            }
            case "Y" -> {
                List<String> colegiosRecinto1 = new ArrayList<>();

                colegiosRecinto1.add("1676");
                colegiosRecinto1.add("1739");
                colegiosRecinto1.add("1766");
                colegiosRecinto1.add("1836");
                colegiosRecinto1.add("1870");
                colegiosRecinto1.add("1929");
                
                recintos.add(new ColegioElectoral(zona, colegiosRecinto1, "00474-ESCUELA ERCILIA PEPIN BATEY BIENVENIDO"));
            }

            case "Z" -> {

                List<String> colegiosRecinto1 = new ArrayList<>();
                colegiosRecinto1.add("1219");
                colegiosRecinto1.add("1219A");
                colegiosRecinto1.add("1220");
                colegiosRecinto1.add("1220A");
                colegiosRecinto1.add("1759");
                colegiosRecinto1.add("1834");
                colegiosRecinto1.add("1903");

                recintos.add(new ColegioElectoral(zona, colegiosRecinto1, "00368-ESCUELA PRIMARIA PALAVE"));

            }
            default -> {
            }
        }
// Se pueden agregar más condiciones para otras zonas
        return recintos;
    }

    public static void main(String[] args) throws IOException {
        String[] zonas = {"A", "A1", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R", "S", "T", "U", "W", "X", "Y", "Z"};

      // Crear una lista de recintos electorales
        List<ColegioElectoral> recintosElectorales = new ArrayList<>();
        for (String zona : zonas) {
            List<ColegioElectoral> recintosZona = generarRecintosPorZona(zona);
            recintosElectorales.addAll(recintosZona);
        }
        
        List<String> todosColegios = new ArrayList<>();
        
         for (ColegioElectoral recinto : recintosElectorales) {
            todosColegios.addAll(recinto.colegio);
        }
         // Barajar la lista de todos los colegios
        Collections.shuffle(todosColegios);
       
        // Lista de candidatos numerados del 1 al 7
        List<Integer> candidatos = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            candidatos.add(i);
        }

        // Crear un mapa para almacenar la asignación de colegios a candidatos
        Map<Integer, List<String>> asignacionColegios = new HashMap<>();
        for (int candidato : candidatos) {
            asignacionColegios.put(candidato, new ArrayList<>());
        }
        
        // Asignar colegios a los candidatos de manera aleatoria
        int indexColegio = 0;
        for (String colegio : todosColegios) {
            int candidatoAsignado = candidatos.get(indexColegio % candidatos.size());
            asignacionColegios.get(candidatoAsignado).add(colegio);
            indexColegio++;
        }
       // Generar un archivo Excel para cada candidato
        try {
            for (Map.Entry<Integer, List<String>> entry : asignacionColegios.entrySet()) {
                int candidato = entry.getKey();
                List<String> colegiosAsignados = entry.getValue();
                generarExcel(candidato, colegiosAsignados, recintosElectorales);
                System.out.println("Archivo Excel generado para el candidato " + candidato);
            }
        } catch (IOException e) {
        }
    }
    
     private static void generarExcel(int candidato, List<String> colegiosAsignados,List<ColegioElectoral> recintos) throws IOException {
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
