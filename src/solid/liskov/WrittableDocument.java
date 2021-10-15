package solid.liskov;

public class WrittableDocument extends Document{
	public WrittableDocument(String fileName) {
		super(fileName);
	}

	public void save() {
        System.out.println(this.getData() + " was saved in " + this.getFileName());
    }
}
