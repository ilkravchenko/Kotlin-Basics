fun isEven(arg: Int?): String {
  if (arg == null) {
      return ""
  } else if (arg % 2 == 0){
      return "even"
  } else {
      return "odd"
  }
}

fun main(){
    val x = 0
    println(isEven(x))
}