public class Main {

    public static void main (String[] args) {
        DynamicArray<String> dynamicArrayString = new DynamicArray<>();
        dynamicArrayString.pushBack("abc");
        dynamicArrayString.pushBack("def");
        dynamicArrayString.pushBack("ghi");
        dynamicArrayString.pushBack("jkl");
        dynamicArrayString.pushBack("mno");
        dynamicArrayString.pushBack(2, "pqr");
        System.out.println("dynamicArrayString: ");
        System.out.println("Size of dynamicArrayString = " + dynamicArrayString.getSize());
        System.out.println("Capacity of dynamicArrayString = " + dynamicArrayString.getCapacity());
        for (int i = 0; i < dynamicArrayString.getSize(); i++) {
            System.out.println("dynamicArrayString[" + i + "] = " + dynamicArrayString.get(i));
        }
        dynamicArrayString.popBack();
        DynamicArray<Integer> dynamicArrayInt = new DynamicArray<>(8, 1);
        dynamicArrayInt.set(2, 5);
        System.out.println();
        System.out.println("Size of dynamicArrayInt = " + dynamicArrayInt.getSize());
        System.out.println("Capacity of dynamicArrayInt = " + dynamicArrayInt.getCapacity());
        System.out.print("dynamicArrayInt: ");
        for (int i = 0; i < dynamicArrayInt.getSize(); i++) {
            System.out.print(dynamicArrayInt.get(i) + " ");
        }
        dynamicArrayInt.popBack();
        dynamicArrayInt.popBack();
        dynamicArrayInt.popBack();
        dynamicArrayInt.popBack(2);
        dynamicArrayInt.popBack();
        System.out.println();
        System.out.println("Size of dynamicArrayInt = " + dynamicArrayInt.getSize());
        System.out.println("Capacity of dynamicArrayInt = " + dynamicArrayInt.getCapacity());
        System.out.print("dynamicArrayInt: ");
        for (int i = 0; i < dynamicArrayInt.getSize(); i++) {
            System.out.print(dynamicArrayInt.get(i) + " ");
        }
    }
}
