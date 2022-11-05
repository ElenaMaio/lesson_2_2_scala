//import App.Result

import scala.io.StdIn.{readInt, readLine}



object App {
  def main(args: Array[String]): Unit = {
    //val str1 = "Hello, Scala"
    val str1 = "Hello, Scala"
    println("Hello, Scala")
    println(str1.reverse)
    println(str1.toLowerCase)
    //println(str1.drop(3))
    var fordeletesymbol = "Hello, Scala!"
    //println(fordeletesymbol.init)
    println(fordeletesymbol.replace("!", " "))
    println(str1 + " and goodbye python!")


    // +b.     Напишите программу, которая вычисляет ежемесячный оклад сотрудника
    // после вычета налогов. На вход вашей программе подается значение годового дохода
    // до вычета налогов, размер премии – в процентах от годового дохода и компенсация питания.

    println("Введите годовой доход, руб. =  ")
    val yearSalary = readInt() // ввод сразу в виде числа
    println("Размер премии, % от годового дохода= ")
    val bonus = readLine().toFloat //ввод в виде текста, затем перевод текста в число
    println("Ежемесячная компенсация питания, руб.= ")
    val eatBonus = readInt()
    val monthSalary=((yearSalary+yearSalary*(bonus/100)+eatBonus)/12)*0.87
    println(monthSalary)


    //+с.     Напишите программу, которая рассчитывает для каждого сотрудника
    // отклонение(в процентах) от среднего значения оклада на уровень всего отдела.
    // В итоговом значении должно учитываться в большую или меньшую сторону отклоняется
    // размер оклада. На вход вышей программе подаются все значения,
    // аналогичные предыдущей программе, а также список со значениями окладов сотрудников отдела
    // 100, 150, 200, 80, 120, 75.

    val firstList = List(100, 150, 200, 80, 120, 75)
    val CommonSalary = firstList.sum
    val CountPersons = firstList.size
    val meanResult=CommonSalary/CountPersons //средний оклад
    println("Средний оклад= ", meanResult)
    //meanList=(firstList diff meanResult)

    val meanList = List()
    for (item<- firstList)
      {
    val diff=item-meanResult
    val meanList = List.apply(diff)
        //val meanList = List.tabulate(CountPersons)(diff)
    println("Отклонение= ", meanList)
      }

      //val List_mean=List()
      //List_mean.fill(CountPersons)(diff) - не знаю, как заполнить пустой список значениями


    // +d.      Попробуйте рассчитать новую зарплату сотрудника,
    // добавив(или отняв, если сотрудник плохо себя вел) необходимую сумму
    // с учетом результатов прошлого задания. Добавьте его зарплату в список
    // и вычислите значение самой высокой зарплаты и самой низкой.

    val new_salary=firstList(1)-100
    println("Новая зарплата сотрудника", new_salary)
    //val res_list = firstList.apply(new_salary)
    //println("Новый список окладов ", res_list)
      //не удалось добавить новый элемент в список, поэтому мин и макс
      // находила для первоначального списка
    val maxSalary = firstList.max
    println("Максимальная зарплата ", maxSalary)
    val minSalary = firstList.min
    println("Минимальная зарплата ", minSalary)


    //+e.     Также в вашу команду пришли два специалиста с окладами 350 и 90 тысяч рублей.
    // Попробуйте отсортировать список сотрудников по уровню оклада от меньшего к большему.

    val add_salary = List(350, 90)
    println("Новый список окладов ", add_salary)
    val LastSalary= firstList++add_salary
    println("Обновленный список с новыми окладами ", LastSalary)
    val SortSalary=LastSalary.sorted
    println("Отсортированный обновленный список с новыми окладами ", SortSalary)


    // ???f.     Кажется, вы взяли в вашу команду еще одного сотрудника и
    // предложили ему оклад 130 тысяч. Вычислите самостоятельно номер сотрудника
    // в списке так, чтобы сортировка не нарушилась и добавьте его на это место.
    val N=SortSalary.indexOf(120)
    println("позиция, на которую нужно вставить новую зарплату ", N)
    //println(SortSalary.updated(N+1,130)) //Замена значения по указанной позиции
    //println(SortSalary.apply(N+1,130))

    // index - в какое место был добавлен элемент и туда добавить


    //???g.       Попробуйте вывести номера сотрудников из полученного списка,
    // которые попадают под категорию middle. На входе программе подается
    // «вилка» зарплаты специалистов уровня middle - использовать for item in List затем if

    //for (n<- firstList)
      //{
      //if ((n >= 120) && (n <= 200)) println("Salary_middle", LastSalary(n))
      //}

    //???h.     Однако наступил кризис и ваши сотрудники требуют повысить зарплату.
    // Вам необходимо проиндексировать зарплату каждого сотрудника на уровень инфляции – 7%

    var New_List=List()
    SortSalary
      .foreach(n => {
        val new_salary = n * 1.07
        //val UpperSalary = New_List.appended(new_salary) //не знаю, как умножить каждый
        //val UpperSalary = SortSalary.updated(New_List)
        // элемент списка на константу
        println(new_salary)
      })
        //println(UpperSalary)


  }

}


