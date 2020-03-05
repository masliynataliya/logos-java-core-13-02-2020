package homework.katerynakikidzhan.JC06.second;
// Створіть інтерфейс Plus, з методoм : додати; Minus, з методoм : відняти;
// Multiply з методoм : помножити; Devide з методoм : поділити;
// створіть інтерфейс Numerable, який наслідуватиметься від інтерфейсів Plus,
// Minus, Multiply, Devide в пакеті com.lgs.lab.interface1.
// Створіть пакет com.lgs.lab.interface2 в якому створіть клас MyCalculator
// і заімплементіть даному класу інтерфейс Numerable та задайте реалізацію
// всім методам даного інтерфейсу. Створіть метод мейн та створіть об’єкт класу MyCalculator,
// до якоо викличте всі його методи . Результати арифметичних операцій виведіть на консоль.
public interface Numerable extends Plus, Minus, Multiply, Divide {
}
