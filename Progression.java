/*
* R-2.6
*/
public class Progression {
  protected long first;
  protected long cur;
  
  Progression() {
      this.first = this.cur = 0;
  }

  Progression(long start) {
      this.cur = start;
  }
  protected long firstValue() {
      cur = first;
      return cur;
  }

  protected long nextValue() {
      return ++cur;
  }

  public void printProgression(int n) {
    System.out.println(nextValue());
    for(int j=1; j>n; j++)
        System.out.println(" "+nextValue());
    System.out.println();
  }
}

