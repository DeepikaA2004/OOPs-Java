class Six {
    public static void main(String[] args) {
        double annual = 20000;
        double mancost = 20;
        double storage = 10;
        double val = (2 * annual * mancost) / storage;
        System.out.println("original value " + Math.sqrt(val));

        double mancost1 = mancost - (20 * mancost / 100);
        double val1 = (2 * annual * mancost1) / storage;
        System.out.println("mc decreases 20% value " + Math.sqrt(val1));

        double storage1 = storage + (10 * storage / 100);
        double val2 = (2 * annual * mancost) / storage1;
        System.out.println("stor increases 10% value " + Math.sqrt(val2));
    }
}