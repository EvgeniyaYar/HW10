import ru.netology.FormDate;
import ru.netology.Post;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 4;
        post.birthday.year = 1990;
        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999) 99999 99";
        post.surname = "Иванов";
        post.subscription = true;
    }
}
