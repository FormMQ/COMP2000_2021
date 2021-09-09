import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class IterateCell implements Iterable<Cell>{
    List<Cell> cellList = new ArrayList<Cell>();

    public Iterator<Cell> iterator() {
        return cellList.iterator();
    }
    
    public void addCell (Cell c) {
        cellList.add(c);
    }

    public List<Cell> getList() {
        return cellList;
    }
}
