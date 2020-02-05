package com.knoldus

class VowelsInSubstring {
def count (string: String): Int = {
  def countSub(l: Int, index: Int): Int = {
    (index+1)*(l-index)
  }

  @scala.annotation.tailrec
  def iterChar(string: String, index:Int, sum:Int):Int={
    if (index == string.length){
      return sum
    }
    else if (string(index)=='a'||string(index)=='e'||string(index)=='i'||string(index)=='o'||string(index)=='u'){
      iterChar(string, index+1, sum + countSub(string.length, index))
    }
    else {
      iterChar(string, index + 1, sum)
    }
  }

  iterChar(string,0,0)
}

}

object VowelsInSubstring extends App{
  val obj = new VowelsInSubstring
  println(obj.count("aaa"))
  println(obj.count("baceb"))
}
