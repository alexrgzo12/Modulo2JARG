package solid.liskov;

public class TestDocument
{
    public static void main(String[] args) {
        Project project = new Project();
        Document actaProyecto = new Document("actaProyecto");
        Document especificacionRequerimientos = new WrittableDocument("especificacionRequerimientos");
        Document especificacionArquitectonica = new WrittableDocument("especificacionArquitectonica");

        project.addDocument(actaProyecto);
        project.addDocument(especificacionArquitectonica);
        project.addDocument(especificacionRequerimientos);
        project.openAll();
        project.saveAll();
    }
}
