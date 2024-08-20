package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User user = new User(null, false);
        for (int index = 0; index < users.length; index++) {
            if (users[index].getUsername().equals(login)) {
                user = users[index];
                break;
            }
        }
        if (user.getUsername() == null) {
            throw new UserNotFoundException("User is not found");
        }
        return user;
    }

    public static boolean validate(User user) throws UserInvalidException {
        try {
            if (!user.isValid() || user.getUsername().length() < 3) {
                throw new UserInvalidException("User is not valid");
            }
            return true;
        } catch (UserInvalidException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ui) {
            System.out.println(ui.getMessage());
        } catch (UserNotFoundException ue) {
            System.out.println(ue.getMessage());
        }
    }
}