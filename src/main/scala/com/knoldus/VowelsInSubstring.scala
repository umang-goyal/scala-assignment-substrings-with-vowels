package com.knoldus

class SubstringWithVowels {
  def count (string: String): Int ={
    val l:Int = string.length

    val arr: Array[Int] = new Array[Int](78)
    @scala.annotation.tailrec
    def numberOfSubstrings(string: String, i:Int, array: Array[Int],l: Int): Array[Int] ={
      if (i==0){
        array(i) = l
      }
      else if (i== l-1){
        return array
      }
      else {
        array(i)= array(i-1) + (l - i) - i
      }
      numberOfSubstrings(string, i+1, array,l)
    }
    numberOfSubstrings(string, 0, arr, l)

    def vowelsCheck(array: Array[Int], string: String, i: Int, sumArray: Array[Int]): Int ={
      if (i == string.length) {
        return sumArray(0)
      }
      if (string(i) =='a' ||string(i)=='e' ||string(i)=='i' ||string(i)=='o' ||string(i)=='u'){
        sumArray(0)+= array(i)

      }
      vowelsCheck(arr, string,i+1, sumArray)
      sumArray(0)
    }
    val sumArray = new Array[Int](1)
    vowelsCheck(arr, string, 0, sumArray)
  }
}

object SubstringInVowels extends App{
  val obj = new SubstringWithVowels
  print(obj.count("baceb"))
}
