package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User u : users) {
            if (u.getUsername().equals(login)) {
                return u;
            }
        }
        throw new UserNotFoundException("User not found,");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.isValid() && user.getUsername().length() > 3) {
            return true;
        }
        throw new UserInvalidException("User invalid.");
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            validate(user);
            System.out.println("This user has been an access");
        } catch (UserInvalidException e) {
                System.out.println("Invalid user.");
        } catch (UserNotFoundException e) {
                System.out.println("User not found.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
