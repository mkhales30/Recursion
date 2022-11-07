public class RecursionPractice(){

public String displayString(String str, int n){
  if(n==1) return str;
  return str + displayString(str,n-1);
}

public String getMultiChar(char ch, int n){
  if(n < 1) return "" + ch;
  return getMultiChar(ch, n-1) + ch;
}

public long getPowerOfTen(int n){
  if (n==0) return 1;
  return 10 * getPowerOfTen(n-1);
}

public int factorial(int n) {
  if (n==0) return 1;
  return factorial(n-1) * n;
}

public int numberOfGloves(int peopleOfPlanetU101InARoom){
  if(peopleOfPlanetU101InARoom <=0) return 0;
  return 3+numberOfGloves(peopleOfPlanetU101InARoom-1);
}

public long getPowerOfTenLoop(int n){
  long num = 10;
  if (n==0) return 1;
  while(n>1){
    num = num * 10;
    n -= 1;
  }
  return num;
}

public int numberOfGlovesNoRecursion(int peopleOfPlanetU101InARoom){
  return peopleOfPlanetU101InARoom * 3;
}

public int getNumberOfZerosLoop(int n){
  int count = 0;
  while(n > 0)
  {
    int temp = n % 10;
    if(temp==0)
    count =count+1;
    n = n / 10;
    }
    return count;
}

public int getNumberOfZerosRecursion(int n){
  if(n==0) return 0;
  else {
        int temp = getNumberOfZerosRecursion(n / 10);
        if (n % 10 == 0)
            ++temp;
        return temp;
    }
}
}
