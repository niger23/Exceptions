package lesson3.HomeWork;

import java.time.LocalDate;

public class ParseData {
    public static UserDate parsUserInfo (String [] data) throws DataException{
        UserDate newUser = new UserDate(null, null, null, null, 0, null);
        for (int i = 0; i < data.length; i++) {
            if (data[i].length() == 1) {
                if (data[i].equals("m") || data[i].equals("f")) {
                    newUser.setGender(data[i]);
                } else {
                    throw new DataException("Ошибка гендера", 111);
                }
            } else if (data[i].matches("\\d{1,2}\\.\\d{1,2}\\.\\d{4}")) {
                String [] arrDate = data[i].split("\\.");
                int [] result = new int[arrDate.length];
                for (int j = 0; j < arrDate.length; j++) {
                    try {
                        result[j] = Integer.parseInt(arrDate[j]);
                    } catch (NumberFormatException e) {
                        throw new DataException("Ошибка в дате", 112);
                    }
                }
                if (result.length ==3) {
                    try {
                        LocalDate resultDate = LocalDate.of(result[2], result[1], result[0]);
                        newUser.setBirthday(resultDate);
                    } catch (Exception e) {
                        throw new DataException("Ошибка в дате", 112);
                    }
                } else throw new DataException("Ошибка в дате", 112);
            } else if (data[i].matches("[0-9]+")) {
                try {
                    long number = Long.parseLong(data[i]);
                    newUser.setPhoneNumber(number);
                } catch (NumberFormatException e) {
                    throw new DataException("Ошибка в номере", 113);
                }
            } else if (data[i].matches("[A-Za-z]+")) {
                if (newUser.getLastname() == null) newUser.setLastname(data[i]);
                else if (newUser.getFirstname() == null) newUser.setFirstname(data[i]);
                else if (newUser.getMiddlename() == null) newUser.setMiddlename(data[i]);
                else throw new DataException("Ошибка в наборе данных", 114);
            } else throw new DataException("Ошибка в наборе данных", 114);
        }
        return newUser;
    }
    
}
