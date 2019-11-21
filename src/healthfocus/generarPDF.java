/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthfocus;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

/**
 *
 * @author Kevin
 */
public class generarPDF {
    private final Font fuenteBold = new Font(Font.FontFamily.COURIER, 14, Font.BOLD);
    private final Font fuenteNormal = new Font(Font.FontFamily.COURIER, 10, Font.NORMAL);
    private final Font fuenteFooter = new Font(Font.FontFamily.COURIER, 8, Font.NORMAL);
    
    public void generarPDF(String header, String info, String footer, String rutaImagen, String salida){
        try {
            Document doc = new Document(PageSize.LETTER);
            PdfWriter.getInstance(doc, new FileOutputStream(salida));
            doc.open();
            doc.add(getHeader(header));
            Image imagen = Image.getInstance(rutaImagen);
            imagen.scaleAbsolute(64, 64);
            imagen.setAlignment(Element.ALIGN_CENTER);
            doc.add(imagen);
            doc.add(getInfo(info));
            doc.add(getFooter(footer));
            doc.close();
        } catch (Exception e) {
        }
    }
    private Paragraph getHeader(String texto){
        Paragraph p = new Paragraph();
        Chunk c=new Chunk();
        p.setAlignment(Element.ALIGN_CENTER);
        c.append(texto);
        c.setFont(fuenteBold);
        p.add(c);
        return p;
    }
    private Paragraph getInfo(String texto){
        Paragraph p = new Paragraph();
        Chunk c=new Chunk();
        p.setAlignment(Element.ALIGN_JUSTIFIED);
        c.append(texto);
        c.setFont(fuenteNormal);
        p.add(c);
        return p;
    }
    private Paragraph getFooter(String texto){
        Paragraph p = new Paragraph();
        Chunk c=new Chunk();
        p.setAlignment(Element.ALIGN_CENTER);
        c.append(texto);
        c.setFont(fuenteFooter);
        p.add(c);
        return p;
    }
}
