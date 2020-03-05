package homework.katerynakikidzhan.JC05.first;
// Написати клас абстрактний Pet , в якому описати абстрактний метод voice().
// Створити класи Cow, Cat, Dog , які наслідуються від Pet.
// Перевизначити в них метод voice(), так, щоб викликаючи його в методі main,
// на консоль виводилось : “Я кіт- Мяууу-Мяууу”, “Я пес-Гаууу-Гаууу”, “Я корова- Мууу-Мууу”.
public abstract class Pet {
    public abstract void voice();
}
