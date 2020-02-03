package com.knoldus

class VowelsInSubstring {
  def count (string: String): Int = {
    def countSub(l: Int, index: Int): Int = {
      (index+1)*(l-index)
    }

    val sumArray = new Array[Int](1)

    def iterChar(string: String, index:Int, array: Array[Int]):Int={
      if (index == string.length){
        return sumArray(0)
      }
      if (string(index)=='a'||string(index)=='e'||string(index)=='i'||string(index)=='o'||string(index)=='u'){
        //println(countSub(string.length, index))
        sumArray(0) += countSub(string.length, index)
      }
      iterChar(string, index+1, sumArray)
      sumArray(0)
    }

    iterChar(string,0,sumArray)
  }

}

object VowelsInSubstring extends App{
  val obj = new VowelsInSubstring
  println(obj.count("aaa"))
  println(obj.count("baceb"))
}
