package HW1;

import HW1.menu.SwitchCoffeeMachine;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SwitchCoffeeMachine.switchCoffeeMachine();
    }
}

//Кавоварка.
//Написати програмну реалізацію кавоварки.
//Пристрій машини складається з 3х частин: бак для води, бак для кави і панель навігації (меню).
//Вам необхідно створити загальний (абстрактний) клас для кавомашини, від якого будуть
//пронаслідувані всі класи-екземпляри кавомашини (кожна кавоварка повинна бути
//описана у вигляді окремого класу, пронаслідуваного від загального класу).
//Весь функціонал машини необхідно описати у вигляді інтерфейсу.
//При старті програми, користувачеві необхідно вибрати марку кавомашини.
//Залежно від обраної марки, машина буде відрізнятися виробником, максимальною
//місткістю баків для води і кави.
//Після вибору марки, має відобразитися меню вибраного пристрою. Воно включає в себе
//наступні функції:
//1. Показати поточний обсяг води і кави
//2. Приготувати "Американо"
//3. Приготувати "Еспрессо"
//4. Приготувати "Подвійний еспресо"
//5. Заповнити бак з водою
//6. Заповнити бак з кавою
//7. Інформація
//8. Вимкнути кавоварку
//При виборі першого пункту, користувачеві повинно відобразитися поточну кількість води і
//кава в відповідних баках.
//При виборі 2-4 пункту меню, має "приготуватися" кава. Рецепт кожного напою ви можете
//придумати самі. Після успішного приготування, користувачеві повинно відобразитися напис
//"Кава готова". Якщо інгредієнтів для даного рецепту не вистачає, необхідно вивести напис
//"Заповніть бак з водою" - в разі нестачі води, "Заповніть бак з кавою" - в разі нестачі
//кава. Якщо обох інгредієнтів не вистачає, вивести обидві написи.
//5-6 пункт повинні імітувати повне заповнення бака з водою і кавою. Якщо один з баків вже
//заповнений "до країв", повідомте про це користувачеві написом "Бак вже заповнений".
//7 пункт служить для відображення інформації про виробника і обсягах баків даної машини.
//При виборі останнього пункту кавоварка повинна "вимкнутися" (програма повинна
//завершитися).
//Меню організувати в циклічному режимі, тобто програма не повинна завершуватися до тих
//пір, поки користувач не вибере відповідний пункт меню.
//При старті програми обидва бака повинні бути заповнені.