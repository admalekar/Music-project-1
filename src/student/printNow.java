package student;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

/**
 *
 * @author Amey
 */
public class printNow {

    public static boolean printCard(final String bill) {
        final PrinterJob job = PrinterJob.getPrinterJob();

        Printable whatToPrint = new Printable() {
            
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {

                Graphics2D g2d = (Graphics2D) graphics;

                g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
                g2d.setFont(new Font("Monospaced", Font.BOLD, 10));

                String[] bills = bill.split(";");
                int y = 15;
                //draw each String in a separate line
                for (int i = 0; i < bills.length; i++) {
                    graphics.drawString(bills[i], 5, y);
                    y = y + 15;
                }

                if (pageIndex > 0) {
                    return NO_SUCH_PAGE;
                } 

                return PAGE_EXISTS;
            }

        };
        PageFormat pageFormat = new PageFormat();
        pageFormat.setOrientation(PageFormat.PORTRAIT);
        Paper pPaper = pageFormat.getPaper();

        pPaper.setImageableArea(0, 0, pPaper.getWidth(), pPaper.getHeight() - 2);
        pageFormat.setPaper(pPaper);

        job.setPrintable(whatToPrint, pageFormat);

        try {
            job.print();

        } catch (PrinterException e) {
            System.err.println(e.getMessage());
        }
        return true;
    }

}
