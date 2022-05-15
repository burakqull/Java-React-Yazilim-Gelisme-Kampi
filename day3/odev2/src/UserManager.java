public class UserManager {


    public void login(User user) {
        //input işlemlerini kullanmaya izin olsaydı input alınır ve user ın email ile password u kontrol edilirdi
        System.out.println(user.getName()+" sisteme giriş yaptı");
    }
    public void logout(User user) {
        System.out.println(user.getName()+" sistemden çıkış yaptı");

    }
    
    public void editEmail(User user) {
        String newEmail="burakgül@gmail.com!!";// input almak yasak olduğu için yeni değişken tanımladım bunu input alınmış hali olarak düşünebiliriz.
        user.setEmail(newEmail);
        System.out.println(user.getEmail()+" yeni emailinizdir");
    }

    public void changePassword(User user) {
        String newPassword="Burak GÜL 15.05.2022";
        user.setPassword(newPassword);
        System.out.println(user.getPassword()+" yeni şifrenizdir");

        
    }
}
