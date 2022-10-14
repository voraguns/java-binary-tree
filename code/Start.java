class Start {
    public static void main(String[] data) {
        Element root = new Element();
        root.name = "The Sun";
        root.value = 1;
        
        root.left = new Element();
        root.left.name = "Earth";
        root.left.value = 7;
        
        Element venus = new Element();
        venus.name = "Venus";
        venus.value = 12;
        
        root.right = venus;
    }
}

class Element {
    String name;
    int value;
    Element left;
    Element right;
}