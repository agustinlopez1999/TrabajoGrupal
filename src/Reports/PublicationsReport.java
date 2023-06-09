package Reports;

import DomainClasses.Publication;

import java.io.FileWriter;
import java.util.ArrayList;

/**
 * The {@code PublicationsReport} class provides methods for generating a report based on a list of publications.
 */
public class PublicationsReport {
    /**
     * Generates a report file with publication information, including the total number of publications and the average number of likes.
     *
     * @param filename     The name of the report file to be generated.
     * @param publications The list of publications.
     */
    public static void GenerateReportByType(String filename, ArrayList<Publication> publications) {
        try {
            FileWriter writer = new FileWriter(filename);

            int publicationsAmount = publications.size();
            int likesAmount = 0;

            writer.write("Reporte de Publicaciones:\n");
            writer.write("--------------------------\n");

            for (Publication publication : publications) {
                System.out.println(publication.toString());
                writer.write(publication.toString());
                likesAmount += publication.getLikes();
            }

            double averageLikes = publicationsAmount > 0 ? (double) likesAmount / publicationsAmount : 0;

            System.out.println("Cantidad de Publicaciones: " + publicationsAmount);
            System.out.printf("Promedio de Likes: %.2f%n", averageLikes);

            writer.write("\nCantidad de Publicaciones: " + publicationsAmount);
            writer.write("\nPromedio de Likes: " + averageLikes);

            writer.close();
            System.out.println("Fichero Reporte ha sido generado: " + filename);
        } catch (Exception e) {
            System.out.println("Error al generar el Fichero Reporte: " + e.getMessage());
        }
    }
}
