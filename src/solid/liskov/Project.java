package solid.liskov;

import java.util.ArrayList;

public class Project
{
    private ArrayList<Document> documents;

    public Project()
    {
        this.documents = new ArrayList<>();
    }

    public void openAll() {
        for(Document doc: documents) {
            doc.open();
        }
    }

    public void saveAll() {
        for(Document doc: documents) {

           if (doc instanceof WrittableDocument) 
        	   ((WrittableDocument) doc).save();
           
        }
    }

    public void addDocument(Document document) {
        documents.add(document);
    }
}
