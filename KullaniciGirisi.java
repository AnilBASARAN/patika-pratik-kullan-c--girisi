import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        // güncel şifre = "java123";
        // güncel kullanıcı adı = "patika";

        String id, password, newPassword, newPasswordIstek;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz:  ");
        id = input.nextLine();

        System.out.print("Şifrenizi giriniz:   ");
        password = input.nextLine();

        // kullanıcıdan şifre ve kullanıcı adı bilgilerini data basedeki verilerle karşılaştırıyoruz dogruysa
        // giriş yapıyoruz
        if(!id.equals("patika")){
            System.out.print("Kullanıcı adı veya şifreyi hatalı girdiniz");
            return;
        }
        if (password.equals("java123") && id.equals("patika")) {
            System.out.println("Giriş yapıldı.");
            return;
            // ve çıkış yapıyoruz yanlışsa direk if ile başlayamıyoruz çünkü cevabı henuz almadık ve karşılaştırma
            // yapabilmemiz için kullanıcıdan yeni bilgiler almamız lazım bu yüzden else ile devam ediyorz.

        } else {
            System.out.println("Girdiğiniz şifre hatalı.\nYeni şifre belirlemek ister misiniz?(E/H)");
            newPasswordIstek = input.nextLine();
            if (newPasswordIstek.equals("H")) {
                System.out.println("Yeni şifre oluşturmak istemediniz.\nİşleminiz sonlandırıldı.");
                } else {
                    System.out.print("Yeni şifreniz eskisiyle aynı olamaz.\nYeni şifrenizi giriniz   ");
                    newPassword = input.nextLine();
                    if (newPassword.equals("java123")) {
                        System.out.print("Şifreniz eskisiyle aynı olamaz.\nİşleminiz sonlandırıldı");

                        }else{
                            System.out.print("Şifreniz başarıyla değiştirildi.");
                        }
                }

        }
    }
}