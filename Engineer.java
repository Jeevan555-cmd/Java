class Engineer {
    void design() {
        System.out.println("Engineer is designing a system");
    }

    void report() {
        System.out.println("Engineer submitting project report");
    }
}

class SoftwareEngineer extends Engineer {
    void report() {
        System.out.println("SoftwareEngineer writing code documentation");
    }

    void debug() {
        System.out.println("SoftwareEngineer is debugging a program");
    }
}

class DowncastExample4 {
    public static void main(String[] args) {
        Engineer e = new SoftwareEngineer();
        e.design();
        e.report();

        if (e instanceof SoftwareEngineer) {
            SoftwareEngineer se = (SoftwareEngineer) e;
            se.debug();
            se.report();
        } else {
            System.out.println("Not an instance of SoftwareEngineer");
        }
    }
}
