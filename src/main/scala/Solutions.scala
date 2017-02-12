/**
  * Created by mark on 12/02/2017.
  */

object Solutions{
  //#50 Implement pow(x, n).
  //https://leetcode.com/problems/powx-n/
  def myPow(x:Double,n:Long):Double={

    n match {
      case 0=>1
      case i if i<0=>myPow(1/x,-n)
      case i if i%2==0=>myPow(x*x,n/2)
      case _=> x* myPow(x*x,n/2)
    }


  }


}
