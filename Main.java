public class Main {

    public static double workEffort;

    public static void main(String[] args) {
        workEffort = 0;
        addWork(100);
        addWork(50);
        addWork(20);
        addWork(360);
        addWork(80);
        addWork(160);
        addWork(500);
        addWork(240);
        addWork(40);
        addWork(40);

        calcCapacity(8,3,40);
        calcCapacity(9,3,40);
        calcCapacity(10,3,40);
        calcCapacity(11,3,40);
        calcCapacity(8,4,40);
        calcCapacity(8,5,40);
        calcCapacity(8,6,40);

        calcCapacity(8,3,35);
        calcCapacity(9,3,35);
        calcCapacity(10,3,35);
        calcCapacity(11,3,35);
        calcCapacity(8,4,35);
        calcCapacity(8,5,35);
        calcCapacity(8,6,35);

        calcCapacity(8,3,30);
        calcCapacity(9,3,30);
        calcCapacity(10,3,30);
        calcCapacity(11,3,30);
        calcCapacity(8,4,30);
        calcCapacity(8,5,30);
        calcCapacity(8,6,30);
    }

    public static void addWork(double time) {
        workEffort += time;
    }

    public static void calcCapacity(int eng, int weeks, int hrPerWk) {
        double capacity = workEffort / (eng * weeks * hrPerWk);
        System.out.printf("With %d devs working a %d week sprint, for %d hrs/wk, we would be at %d%% of capacity.\n",eng,weeks,hrPerWk,(int)(capacity*100));
    }
}
