class Start {
    public static void main(String[] data) {
        
        int[] a = { 7, 3, 9, 4, 6, 2, 8 };
        Builder b = new Builder();
        Element root = null;
        for (int i = 0; i < a.length; i++) {
            root = b.insert(a[i], root);
        }
        System.out.println(root.value);
        b.print(root);
    }
}

class Builder {
    
    void print(Element e) {
        if (e == null) return;
        print(e.left);
        System.out.print(" " + e.value);
        print(e.right);
    }
    
    Element insert(int data, Element target) {
        if (target == null) {
            target = new Element();
            target.value = data;
            return target;
        } 
        if (data < target.value) target.left = insert(data, target.left);
        if (data > target.value) target.right = insert(data, target.right);
        return target;
    }
}

class Element {
    String name;
    Element right, left;
    int value;
}