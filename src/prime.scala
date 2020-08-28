

object prime {
  
  def isPrime(i: Int): Boolean ={
    if (i <= 1)
        false
    else if (i == 2)
        true
    else
        !(2 until i).exists(n => i % n == 0)}
  def main(args:Array[String]){
    print(isPrime(5))
  }
        
        
        
}