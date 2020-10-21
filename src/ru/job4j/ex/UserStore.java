package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User user = null;
        for (User el : users) {
            if (el.getUsername().equals(login)) {
                user = el;
                break;
            }
        }
        if (user == null) {
            throw new UserNotFoundException("User hasn't been found.");
        }
        return user;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || (user.getUsername().length() < 3)) {
            throw new UserInvalidException("The user is invalid.");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", false)
        };
        User user;
        try {
            user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access.");
            }
        } catch (UserInvalidException ei) {
            ei.printStackTrace();
        } catch (UserNotFoundException en) {
            en.printStackTrace();
        }

    }
}