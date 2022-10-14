class Start {
    public static void main(String[] data) {
        
        int[] a = { 8, 5, 4, 3, 7, 4, 1 };
        Engine e = new Engine();
        Element root = e.create(a);
        System.out.println(root.value);
        int t = e.sum(root);
        int td = e.count(root);
        System.out.println("Total : " + t);
        System.out.println("Total node : " + td);
    }
}

class Engine {
    
    int count(Element e) {
        if (e == null) return 0;
        return 0;
    }
    
    int sum(Element e) {
        if (e == null) return 0;
        return sum(e.left) + sum(e.right) + e.value;
    }
    
    Element create(int ... a) {
        return create(a, 0, a.length - 1);
    }
    
    Element create(int[] a, int left, int right) {
        if (left > right) return null;
        int mid = (left + right) / 2;
        Element e = new Element();
        e.value = a[mid];
        e.left = create(a, left, mid - 1);
        e.right = create(a, mid + 1, right);
        return e;
    }
}

class Element {
    String name;
    int value;
    Element left;
    Element right;
}