package big_tasks_from_Saim.Device;

public class UseDevice {
    public static void main(String[] args) {

        TV tv1 = new TV("Samsung", "n3",500, true);
        Phone phone1 = new Phone("IPhone", "pro11", 900, true);

        tv1.useDevice();
        phone1.useDevice();

        System.out.println(tv1);
        System.out.println(phone1);


    }
}
