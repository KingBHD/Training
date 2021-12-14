package inheritances.modifiers;

class AccessA {
    private void PriA() {
    }

    protected void ProA() {
    }

    public void PubA() {
    }

    void DeA() {
    }
}

class AccessB extends AccessA {
    private void PriB() {
    }

    protected void ProB() {
    }

    public void PubB() {
        ProB();
        PriB();
        ProA();
    }

    void DeB() {
    }
}

class AccessC extends AccessB {
    private void PriC() {
    }

    protected void ProC() {
    }

    public void PubC() {
        ProC();
        PriC();
        ProB();
//        PriB(); // Error due to private access
    }

    void DeC() {
    }
}

public class AccessModifiers {

    public static void main(String[] args) {
        AccessA a = new AccessA();
        AccessB b = new AccessB();
        AccessC c = new AccessC();

        a.PubA();
        a.ProA();
        a.DeA();

        b.PubB();
        b.ProB();
        b.DeB();

        c.PubC();
        c.ProC();
        c.DeC();
    }

}
