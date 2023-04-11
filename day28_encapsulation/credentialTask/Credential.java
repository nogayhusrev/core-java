package day28_encapsulation.credentialTask;

public class Credential {
    private String username;
    private String password;

    public Credential(String username, String password) {
       setUsername(username);
       setPassword(password);
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {

        if (isStrongPassword(password)){
            this.password = password;
        }else{
            System.err.println("Password is not strong. Please enter a strong password.");
            System.out.println("Characteristics of strong passwords are:\n" +
                    "                                    1. Password MUST be at least have 8 characters long, and should not contain space\n" +
                    "                                    2. PassWord should at least contain one letter \n" +
                    "                                    3. Password should at least contain one special characters\n" +
                    "                                    4. Password should at least contain a digit");
        }

    }

    private boolean isStrongPassword(String password) {
        //Characteristics of strong passwords are:
        //                                    1. Password MUST be at least have 8 characters long, and should not contain space
        //                                    2. PassWord should at least contain one letter
        //                                    3. Password should at least contain one special characters
        //                                    4. Password should at least contain a digit

        if (password.contains(" "))
            return false;

        if (password.length()<8)
            return false;

        boolean hasDigit=false;
        boolean hasLetter=false;
        boolean hasSpecial=false;

        for (char ch:password.toCharArray()) {
            if (Character.isLetter(ch)){
                hasLetter=true;
            }else if (Character.isDigit(ch)){
                hasDigit=true;
            }else {
                hasSpecial=true;
            }
        }



        return hasLetter&&hasDigit&&hasSpecial;

    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Credential{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}


/*
6. create a class named Credentials
            Variables:
                username, password

            Encapsulate all the fields
                    (password MUST be a strong password)


            Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

            Methods:
                isStrongPassWord(): takes an argument of string and verify if the given string is strong password, returns boolean
                            Characteristics of strong passwords are:
                                    1. Password MUST be at least have 8 characters long, and should not contain space
                                    2. PassWord should at least contain one letter
                                    3. Password should at least contain one special characters
                                    4. Password should at least contain a digit

                toString()





 */