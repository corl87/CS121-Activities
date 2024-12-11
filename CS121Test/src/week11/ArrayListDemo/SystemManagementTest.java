package week11.ArrayListDemo;

public class SystemManagementTest {
    public static void main(String[] args) {
        SystemManagement system = new SystemManagement();

        for(int i=1; i <= 2; i++){
            system.add(Integer.toString(i),2);
        }
        system.add("Bob", 1);
        system.add("Jimmy", 1);
        system.add("123 N Twelve Street", 3);
        system.add("1 the north pole", 3);
        system.add("1453 Main Street", 3);

        String entry = system.get(1, 3);

        system.remove("1 the north pole", 3);

        int size = system.size(3);

        system.printFor();
    }
}
