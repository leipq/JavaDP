package kingdee.base.ssc.day002.component;

public class FileLeaf extends FolderComponent {
    public FileLeaf(final String name) {
        super(name);
    }
    @Override
    public void add(FolderComponent component) {

    }

    @Override
    public void remove(FolderComponent component) {

    }

    @Override
    public void display() {
        System.out.println("FileLeaf:" + this.getName());
    }
}
