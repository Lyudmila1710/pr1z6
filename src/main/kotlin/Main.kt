fun main(){
    println("Введите число от 0 до 9 ")
    val a:Byte = readln().toByte()
    println("Введите второе число от 0 до 9 ")
    val b:Byte= readln().toByte()

    if(a%2!=0) { println(b.toString()+a.toString())
    } else if(b%2!=0){println(a.toString()+b.toString())
        } else println("Создать нечетное чило невозожно")
}