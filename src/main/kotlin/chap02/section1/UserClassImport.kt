package chap02.section1

// 하단의 Person 클래스와 충돌나지 않게 as 로 사용한느 클래스 이름 변경
import com.example.edu.Person as User


fun main() {
    val user1 = User("twosom", 30)
    val user2 = Person("A123", "TWOSOM")

    println(user1.name)
    println(user1.age)

    println(user2.id)
    println(user2.name)

}


class Person(var id: String, val name: String)
