package unblockme;

/**
 *
 *
 */
public class UnblockMe {

    private static int nSimpul = 0;
    private block[] map;
    private static ArrayList<step> steps = new ArrayList<step>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
public class block {
    private int idx; // idx = 0 untuk block utama
    private int length;
    private int x;
    private int y;
    private char jenis; // vertikal (v) atau horizontal (h)
}
class simpul {
    private int idx;
    private ArrayList<Integer> nodes;
    private boolean isSolusi;
}
class step {
    public int idBlock;
    public char direction; // w/a/s/d
    public int weight;
    public int idSimpul;
}
public class block {
    private int idx; // idx = 0 untuk block utama
    private int length;
    private int x;
    private int y;
    private char jenis; // vertikal (v) atau horizontal (h)
}
class simpul {
    private int idx;
    private ArrayList<Integer> nodes;
    private boolean isSolusi;
}
class step {
    public int idBlock;
    public char direction; // w/a/s/d
    public int weight;
    public int idSimpul;
}
