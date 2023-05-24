package lesson3.HomeWork;

public class App {
    public static void Open() {
        InputData newData = new InputData();
        String[] data = newData.enterData();
        UserDate newUser = new UserDate(null, null, null, null, 0, null);
        try {
            newUser = ParseData.parsUserInfo(data);
        } catch (DataException e) {
            e.getStackTrace();
            System.out.println(e.getInfo());
        }
        if (newUser.getFirstname() != null) {
            System.out.println(newUser);
            String res = String.format("<%s><%s><%s><%s><%d><%s>",newUser.getFirstname(), newUser.getLastname(), newUser.getMiddlename(), newUser.getBirthday(), newUser.getPhoneNumber(), newUser.getGender());
            
            String fileName = newUser.getLastname() + ".txt";
            WriteFile.writeData(res, fileName);
        } else System.out.println((char)27 + "[31mИз-за ошибки не был создан файл" + (char)27 + "[0m");
    }
}
