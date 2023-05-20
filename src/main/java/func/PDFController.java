package func;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

@RestController
public class PDFController {

    @GetMapping("/generate-pdf")
    public ResponseEntity<ByteArrayResource> generatePDF() throws IOException {
        // Create a new PDF document
        PDDocument document = new PDDocument();

        // Create a page and add it to the document
        PDPage page = new PDPage();
        document.addPage(page);

        // Create a font and set the font size
        PDType1Font font = PDType1Font.HELVETICA_BOLD;
        int fontSize = 12;

        // Create a content stream for the page
        page.getContents().beginText();
        page.getContents().setFont(font, fontSize);
        page.getContents().newLineAtOffset(100, 700);
        page.getContents().showText("Hello, World!");
        page.getContents().endText();

        // Save the document to a byte array
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        document.save(byteArrayOutputStream);
        document.close();

        // Create a ByteArrayResource from the byte array
        ByteArrayResource resource = new ByteArrayResource(byteArrayOutputStream.toByteArray());

        // Set the HTTP headers for the response
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=example.pdf");

        // Return the response entity with the PDF file and headers
        return ResponseEntity.ok()
                .headers(headers)
                .contentType(MediaType.APPLICATION_PDF)
                .contentLength(byteArrayOutputStream.size())
                .body(resource);
    }
}